import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class6_Sub3_Sub20 extends Class6_Sub3 {

	@OriginalMember(owner = "client!mfa", name = "C", descriptor = "I")
	private int anInt5546;

	@OriginalMember(owner = "client!mfa", name = "E", descriptor = "I")
	private int anInt5547;

	@OriginalMember(owner = "client!mfa", name = "H", descriptor = "I")
	private int anInt5550;

	@OriginalMember(owner = "client!mfa", name = "I", descriptor = "I")
	private int anInt5551;

	@OriginalMember(owner = "client!mfa", name = "L", descriptor = "I")
	private int anInt5554;

	@OriginalMember(owner = "client!mfa", name = "M", descriptor = "I")
	private int anInt5555;

	@OriginalMember(owner = "client!mfa", name = "N", descriptor = "I")
	private int anInt5556 = 0;

	@OriginalMember(owner = "client!mfa", name = "K", descriptor = "I")
	private int anInt5553 = 0;

	@OriginalMember(owner = "client!mfa", name = "J", descriptor = "I")
	private int anInt5552 = 0;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIII)V")
	private void method4785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg0 <= 2048 ? arg0 * (arg2 + 4096) >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
		if (local31 <= 0) {
			this.anInt5546 = this.anInt5551 = this.anInt5554 = arg0;
			return;
		}
		@Pc(40) int local40 = arg1 * 6;
		@Pc(47) int local47 = arg0 + arg0 - local31;
		@Pc(55) int local55 = (local31 - local47 << 12) / local31;
		@Pc(59) int local59 = local40 >> 12;
		@Pc(66) int local66 = local40 - (local59 << 12);
		@Pc(74) int local74 = local55 * local31 >> 12;
		@Pc(80) int local80 = local66 * local74 >> 12;
		@Pc(85) int local85 = local47 + local80;
		@Pc(90) int local90 = local31 - local80;
		if (local59 == 0) {
			this.anInt5554 = local47;
			this.anInt5546 = local31;
			this.anInt5551 = local85;
			return;
		}
		if (local59 == 1) {
			this.anInt5554 = local47;
			this.anInt5546 = local90;
			this.anInt5551 = local31;
			return;
		}
		if (local59 == 2) {
			this.anInt5551 = local31;
			this.anInt5554 = local85;
			this.anInt5546 = local47;
			return;
		}
		if (local59 == 3) {
			this.anInt5546 = local47;
			this.anInt5554 = local31;
			this.anInt5551 = local90;
			return;
		}
		if (local59 == 4) {
			this.anInt5546 = local85;
			this.anInt5554 = local31;
			this.anInt5551 = local47;
			return;
		}
		if (local59 == 5) {
			this.anInt5554 = local90;
			this.anInt5546 = local31;
			this.anInt5551 = local47;
			return;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(29) int[][] local29 = this.method7823(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static447.anInt8568; local55++) {
				this.method4786(local33[local55], local41[local55], local37[local55]);
				this.anInt5555 += this.anInt5552;
				this.anInt5547 += this.anInt5553;
				this.anInt5550 += this.anInt5556;
				while (this.anInt5555 < 0) {
					this.anInt5555 += 4096;
				}
				while (this.anInt5555 > 4096) {
					this.anInt5555 -= 4096;
				}
				if (this.anInt5550 < 0) {
					this.anInt5550 = 0;
				}
				if (this.anInt5550 > 4096) {
					this.anInt5550 = 4096;
				}
				if (this.anInt5547 < 0) {
					this.anInt5547 = 0;
				}
				if (this.anInt5547 > 4096) {
					this.anInt5547 = 4096;
				}
				this.method4785(this.anInt5547, this.anInt5555, this.anInt5550);
				local45[local55] = this.anInt5546;
				local49[local55] = this.anInt5551;
				local53[local55] = this.anInt5554;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(IIII)V")
	private void method4786(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 <= arg2 ? arg2 : arg0;
		@Pc(19) int local19 = arg2 > arg0 ? arg0 : arg2;
		@Pc(36) int local36 = arg1 <= local12 ? local12 : arg1;
		@Pc(47) int local47 = arg1 < local19 ? arg1 : local19;
		this.anInt5547 = (local47 + local36) / 2;
		@Pc(59) int local59 = local36 - local47;
		if (local59 > 0) {
			@Pc(70) int local70 = (local36 - arg0 << 12) / local59;
			@Pc(79) int local79 = (local36 - arg2 << 12) / local59;
			@Pc(87) int local87 = (local36 - arg1 << 12) / local59;
			if (local36 == arg0) {
				this.anInt5555 = arg2 == local47 ? local87 + 20480 : -local79 + 4096;
			} else if (local36 == arg2) {
				this.anInt5555 = arg1 == local47 ? local70 + 4096 : -local87 + 12288;
			} else {
				this.anInt5555 = local47 == arg0 ? local79 + 12288 : -local70 + 20480;
			}
			this.anInt5555 /= 6;
		} else {
			this.anInt5555 = 0;
		}
		if (this.anInt5547 > 0 && this.anInt5547 < 4096) {
			this.anInt5550 = (local59 << 12) / (this.anInt5547 > 2048 ? 8192 - this.anInt5547 * 2 : this.anInt5547 * 2);
		} else {
			this.anInt5550 = 0;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt5552 = arg1.method6008();
		} else if (arg0 == 1) {
			this.anInt5556 = (arg1.method6034() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5553 = (arg1.method6034() << 12) / 100;
		}
	}
}
