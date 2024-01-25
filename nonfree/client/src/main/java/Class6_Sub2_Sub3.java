import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class6_Sub2_Sub3 extends Class6_Sub2 {

	@OriginalMember(owner = "client!au", name = "B", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!au", name = "D", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!au", name = "G", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!au", name = "H", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!au", name = "I", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!au", name = "M", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!au", name = "J", descriptor = "I")
	private int anInt393 = 0;

	@OriginalMember(owner = "client!au", name = "F", descriptor = "I")
	private int anInt389 = 0;

	@OriginalMember(owner = "client!au", name = "L", descriptor = "I")
	private int anInt395 = 0;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt393 = arg0.method3103();
		} else if (arg1 == 1) {
			this.anInt395 = (arg0.method3116() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt389 = (arg0.method3116() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII)V")
	private void method308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(28) int local28 = arg2 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : arg2 * (arg0 + 4096) >> 12;
		if (local28 <= 0) {
			this.anInt387 = this.anInt386 = this.anInt391 = arg2;
			return;
		}
		@Pc(55) int local55 = arg1 * 6;
		@Pc(62) int local62 = arg2 + arg2 - local28;
		@Pc(71) int local71 = (local28 - local62 << 12) / local28;
		@Pc(75) int local75 = local55 >> 12;
		@Pc(81) int local81 = local55 - (local75 << 12);
		@Pc(89) int local89 = local28 * local71 >> 12;
		@Pc(95) int local95 = local81 * local89 >> 12;
		@Pc(99) int local99 = local62 + local95;
		@Pc(104) int local104 = local28 - local95;
		if (local75 == 0) {
			this.anInt391 = local62;
			this.anInt386 = local99;
			this.anInt387 = local28;
		} else if (local75 == 1) {
			this.anInt391 = local62;
			this.anInt386 = local28;
			this.anInt387 = local104;
		} else if (local75 == 2) {
			this.anInt387 = local62;
			this.anInt391 = local99;
			this.anInt386 = local28;
		} else if (local75 == 3) {
			this.anInt387 = local62;
			this.anInt386 = local104;
			this.anInt391 = local28;
		} else if (local75 == 4) {
			this.anInt391 = local28;
			this.anInt387 = local99;
			this.anInt386 = local62;
		} else if (local75 == 5) {
			this.anInt387 = local28;
			this.anInt391 = local104;
			this.anInt386 = local62;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIB)V")
	private void method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg1 <= arg2 ? arg2 : arg1;
		@Pc(25) int local25 = arg0 <= local12 ? local12 : arg0;
		@Pc(36) int local36 = arg2 <= arg1 ? arg2 : arg1;
		@Pc(43) int local43 = local36 > arg0 ? arg0 : local36;
		this.anInt392 = (local25 + local43) / 2;
		@Pc(55) int local55 = local25 - local43;
		if (local55 > 0) {
			@Pc(69) int local69 = (local25 - arg1 << 12) / local55;
			@Pc(77) int local77 = (local25 - arg2 << 12) / local55;
			@Pc(85) int local85 = (local25 - arg0 << 12) / local55;
			if (arg1 == local25) {
				this.anInt390 = local43 == arg2 ? local85 + 20480 : 4096 - local77;
			} else if (arg2 == local25) {
				this.anInt390 = local43 == arg0 ? local69 + 4096 : -local85 + 12288;
			} else {
				this.anInt390 = arg1 == local43 ? local77 + 12288 : -local69 + 20480;
			}
			this.anInt390 /= 6;
		} else {
			this.anInt390 = 0;
		}
		if (this.anInt392 > 0 && this.anInt392 < 4096) {
			this.anInt396 = (local55 << 12) / (this.anInt392 > 2048 ? 8192 - (this.anInt392 * 2) : this.anInt392 * 2);
		} else {
			this.anInt396 = 0;
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(22) int[][] local22 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(32) int[][] local32 = this.method5867(arg0, 0);
			@Pc(36) int[] local36 = local32[0];
			@Pc(40) int[] local40 = local32[1];
			@Pc(44) int[] local44 = local32[2];
			@Pc(48) int[] local48 = local22[0];
			@Pc(52) int[] local52 = local22[1];
			@Pc(56) int[] local56 = local22[2];
			for (@Pc(58) int local58 = 0; local58 < Static185.anInt4925; local58++) {
				this.method309(local44[local58], local36[local58], local40[local58]);
				this.anInt392 += this.anInt389;
				this.anInt390 += this.anInt393;
				this.anInt396 += this.anInt395;
				while (this.anInt390 < 0) {
					this.anInt390 += 4096;
				}
				if (this.anInt396 < 0) {
					this.anInt396 = 0;
				}
				while (this.anInt390 > 4096) {
					this.anInt390 -= 4096;
				}
				if (this.anInt396 > 4096) {
					this.anInt396 = 4096;
				}
				if (this.anInt392 < 0) {
					this.anInt392 = 0;
				}
				if (this.anInt392 > 4096) {
					this.anInt392 = 4096;
				}
				this.method308(this.anInt396, this.anInt390, this.anInt392);
				local48[local58] = this.anInt387;
				local52[local58] = this.anInt386;
				local56[local58] = this.anInt391;
			}
		}
		return local22;
	}
}
