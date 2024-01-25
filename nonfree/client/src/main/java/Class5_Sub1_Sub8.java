import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class5_Sub1_Sub8 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
	private int anInt3603;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
	private int anInt3604;

	@OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
	private int anInt3607;

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
	private int anInt3610;

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
	private int anInt3611;

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
	private int anInt3613;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
	private int anInt3614 = 0;

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
	private int anInt3612 = 0;

	@OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
	private int anInt3608 = 0;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
	private void method3173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg1 >= arg2 ? arg1 : arg2;
		@Pc(21) int local21 = arg1 <= arg2 ? arg1 : arg2;
		@Pc(29) int local29 = arg0 <= local13 ? local13 : arg0;
		@Pc(41) int local41 = arg0 < local21 ? arg0 : local21;
		@Pc(45) int local45 = local29 - local41;
		this.anInt3610 = (local29 + local41) / 2;
		if (this.anInt3610 > 0 && this.anInt3610 < 4096) {
			this.anInt3604 = (local45 << 12) / (this.anInt3610 <= 2048 ? this.anInt3610 * 2 : 8192 - (this.anInt3610 * 2));
		} else {
			this.anInt3604 = 0;
		}
		if (local45 <= 0) {
			this.anInt3607 = 0;
			return;
		}
		@Pc(119) int local119 = (local29 - arg2 << 12) / local45;
		@Pc(128) int local128 = (local29 - arg1 << 12) / local45;
		@Pc(137) int local137 = (local29 - arg0 << 12) / local45;
		if (local29 == arg2) {
			this.anInt3607 = arg1 == local41 ? local137 + 20480 : -local128 + 4096;
		} else if (arg1 == local29) {
			this.anInt3607 = local41 == arg0 ? local119 + 4096 : -local137 + 12288;
		} else {
			this.anInt3607 = local41 == arg2 ? local128 + 12288 : -local119 + 20480;
		}
		this.anInt3607 /= 6;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(29) int[][] local29 = this.method9203(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static648.anInt9588; local55++) {
				this.method3173(local41[local55], local37[local55], local33[local55]);
				this.anInt3604 += this.anInt3608;
				this.anInt3607 += this.anInt3614;
				this.anInt3610 += this.anInt3612;
				while (this.anInt3607 < 0) {
					this.anInt3607 += 4096;
				}
				if (this.anInt3604 < 0) {
					this.anInt3604 = 0;
				}
				while (this.anInt3607 > 4096) {
					this.anInt3607 -= 4096;
				}
				if (this.anInt3604 > 4096) {
					this.anInt3604 = 4096;
				}
				if (this.anInt3610 < 0) {
					this.anInt3610 = 0;
				}
				if (this.anInt3610 > 4096) {
					this.anInt3610 = 4096;
				}
				this.method3175(this.anInt3604, this.anInt3610, this.anInt3607);
				local45[local55] = this.anInt3611;
				local49[local55] = this.anInt3603;
				local53[local55] = this.anInt3613;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt3614 = arg1.method8516();
		} else if (arg0 == 1) {
			this.anInt3608 = (arg1.method8488() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3612 = (arg1.method8488() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIII)V")
	private void method3175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg1 > 2048 ? arg0 + arg1 - (arg1 * arg0 >> 12) : (arg0 + 4096) * arg1 >> 12;
		if (local28 <= 0) {
			this.anInt3611 = this.anInt3603 = this.anInt3613 = arg1;
			return;
		}
		@Pc(35) int local35 = arg2 * 6;
		@Pc(42) int local42 = arg1 + arg1 - local28;
		@Pc(51) int local51 = (local28 - local42 << 12) / local28;
		@Pc(55) int local55 = local35 >> 12;
		@Pc(62) int local62 = local35 - (local55 << 12);
		@Pc(70) int local70 = local51 * local28 >> 12;
		@Pc(76) int local76 = local70 * local62 >> 12;
		@Pc(80) int local80 = local42 + local76;
		@Pc(85) int local85 = local28 - local76;
		if (local55 == 0) {
			this.anInt3603 = local80;
			this.anInt3611 = local28;
			this.anInt3613 = local42;
			return;
		}
		if (local55 == 1) {
			this.anInt3613 = local42;
			this.anInt3603 = local28;
			this.anInt3611 = local85;
			return;
		}
		if (local55 == 2) {
			this.anInt3603 = local28;
			this.anInt3611 = local42;
			this.anInt3613 = local80;
			return;
		}
		if (local55 == 3) {
			this.anInt3611 = local42;
			this.anInt3613 = local28;
			this.anInt3603 = local85;
			return;
		}
		if (local55 == 4) {
			this.anInt3613 = local28;
			this.anInt3611 = local80;
			this.anInt3603 = local42;
			return;
		}
		if (local55 == 5) {
			this.anInt3603 = local42;
			this.anInt3613 = local85;
			this.anInt3611 = local28;
			return;
		}
	}
}
