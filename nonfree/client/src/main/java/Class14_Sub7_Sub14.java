import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class14_Sub7_Sub14 extends Class14_Sub7 {

	@OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
	private int anInt3384;

	@OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
	private int anInt3390;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
	private int anInt3392;

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
	private int anInt3396;

	@OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
	private int anInt3398;

	@OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
	private int anInt3401;

	@OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
	private int anInt3389 = 0;

	@OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
	private int anInt3388 = 0;

	@OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
	private int anInt3395 = 0;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
	private void method2926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg0 <= arg2 ? arg2 : arg0;
		@Pc(25) int local25 = arg1 > local13 ? arg1 : local13;
		@Pc(33) int local33 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(41) int local41 = arg1 < local33 ? arg1 : local33;
		this.anInt3392 = (local41 + local25) / 2;
		@Pc(54) int local54 = local25 - local41;
		if (this.anInt3392 > 0 && this.anInt3392 < 4096) {
			this.anInt3390 = (local54 << 12) / (this.anInt3392 <= 2048 ? this.anInt3392 * 2 : 8192 - (this.anInt3392 * 2));
		} else {
			this.anInt3390 = 0;
		}
		if (local54 <= 0) {
			this.anInt3398 = 0;
			return;
		}
		@Pc(111) int local111 = (local25 - arg0 << 12) / local54;
		@Pc(120) int local120 = (local25 - arg2 << 12) / local54;
		@Pc(129) int local129 = (local25 - arg1 << 12) / local54;
		if (arg0 == local25) {
			this.anInt3398 = local41 == arg2 ? local129 + 20480 : -local120 + 4096;
		} else if (arg2 == local25) {
			this.anInt3398 = local41 == arg1 ? local111 + 4096 : -local129 + 12288;
		} else {
			this.anInt3398 = local41 == arg0 ? local120 + 12288 : -local111 + 20480;
		}
		this.anInt3398 /= 6;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIII)V")
	private void method2931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(32) int local32 = arg1 > 2048 ? arg0 + arg1 - (arg0 * arg1 >> 12) : (arg0 + 4096) * arg1 >> 12;
		if (local32 <= 0) {
			this.anInt3396 = this.anInt3401 = this.anInt3384 = arg1;
			return;
		}
		@Pc(49) int local49 = arg2 * 6;
		@Pc(56) int local56 = arg1 + arg1 - local32;
		@Pc(65) int local65 = (local32 - local56 << 12) / local32;
		@Pc(69) int local69 = local49 >> 12;
		@Pc(76) int local76 = local49 - (local69 << 12);
		@Pc(84) int local84 = local65 * local32 >> 12;
		@Pc(90) int local90 = local76 * local84 >> 12;
		@Pc(95) int local95 = local56 + local90;
		@Pc(99) int local99 = local32 - local90;
		if (local69 == 0) {
			this.anInt3401 = local95;
			this.anInt3384 = local56;
			this.anInt3396 = local32;
		} else if (local69 == 1) {
			this.anInt3396 = local99;
			this.anInt3384 = local56;
			this.anInt3401 = local32;
		} else if (local69 == 2) {
			this.anInt3396 = local56;
			this.anInt3401 = local32;
			this.anInt3384 = local95;
		} else if (local69 == 3) {
			this.anInt3396 = local56;
			this.anInt3384 = local32;
			this.anInt3401 = local99;
		} else if (local69 == 4) {
			this.anInt3384 = local32;
			this.anInt3401 = local56;
			this.anInt3396 = local95;
		} else if (local69 == 5) {
			this.anInt3401 = local56;
			this.anInt3384 = local99;
			this.anInt3396 = local32;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(29) int[][] local29 = this.method9384(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static613.anInt10114; local55++) {
				this.method2926(local33[local55], local41[local55], local37[local55]);
				this.anInt3392 += this.anInt3388;
				this.anInt3390 += this.anInt3389;
				for (this.anInt3398 += this.anInt3395; this.anInt3398 < 0; this.anInt3398 += 4096) {
				}
				while (this.anInt3398 > 4096) {
					this.anInt3398 -= 4096;
				}
				if (this.anInt3390 < 0) {
					this.anInt3390 = 0;
				}
				if (this.anInt3390 > 4096) {
					this.anInt3390 = 4096;
				}
				if (this.anInt3392 < 0) {
					this.anInt3392 = 0;
				}
				if (this.anInt3392 > 4096) {
					this.anInt3392 = 4096;
				}
				this.method2931(this.anInt3390, this.anInt3392, this.anInt3398);
				local45[local55] = this.anInt3396;
				local49[local55] = this.anInt3401;
				local53[local55] = this.anInt3384;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt3395 = arg1.method7752();
		} else if (arg0 == 1) {
			this.anInt3389 = (arg1.method7720() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3388 = (arg1.method7720() << 12) / 100;
		}
	}
}
