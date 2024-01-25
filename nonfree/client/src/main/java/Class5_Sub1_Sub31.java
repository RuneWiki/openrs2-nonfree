import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class5_Sub1_Sub31 extends Class5_Sub1 {

	@OriginalMember(owner = "client!re", name = "L", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!re", name = "E", descriptor = "I")
	public int anInt7439 = 4;

	@OriginalMember(owner = "client!re", name = "H", descriptor = "[B")
	private byte[] aByteArray101 = new byte[512];

	@OriginalMember(owner = "client!re", name = "G", descriptor = "I")
	public int anInt7441 = 1638;

	@OriginalMember(owner = "client!re", name = "P", descriptor = "Z")
	public boolean aBoolean530 = true;

	@OriginalMember(owner = "client!re", name = "J", descriptor = "I")
	public int anInt7443 = 4;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "I")
	public int anInt7449 = 4;

	@OriginalMember(owner = "client!re", name = "R", descriptor = "I")
	public int anInt7448 = 0;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[IB)V")
	public void method6049(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = this.anInt7443 * Static295.anIntArray403[arg0];
		@Pc(107) int local107;
		@Pc(121) int local121;
		@Pc(29) int local29;
		@Pc(34) short local34;
		@Pc(98) int local98;
		@Pc(47) int local47;
		@Pc(41) int local41;
		@Pc(54) int local54;
		@Pc(84) int local84;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(93) int local93;
		@Pc(80) int local80;
		if (this.anInt7439 == 1) {
			local29 = this.aShortArray119[0] << 12;
			local34 = this.aShortArray118[0];
			local41 = this.anInt7449 * local29 >> 12;
			local47 = local12 * local29 >> 12;
			local54 = local29 * this.anInt7443 >> 12;
			local58 = local47 >> 12;
			local62 = local58 + 1;
			local47 &= 0xFFF;
			if (local62 >= local54) {
				local62 = 0;
			}
			local80 = this.aByteArray101[local62 & 0xFF] & 0xFF;
			local84 = Class151_Sub3_Sub1.anIntArray670[local47];
			local93 = this.aByteArray101[local58 & 0xFF] & 0xFF;
			if (this.aBoolean530) {
				for (local98 = 0; local98 < Static147.anInt3075; local98++) {
					local107 = this.anInt7449 * Static315.anIntArray425[local98];
					local121 = this.method6052(local107 * local29 >> 12, local41, local47, local80, local84, local93);
					local121 = local121 * local34 >> 12;
					arg1[local98] = (local121 >> 1) + 2048;
				}
			} else {
				for (local98 = 0; local98 < Static147.anInt3075; local98++) {
					local107 = this.anInt7449 * Static315.anIntArray425[local98];
					local121 = this.method6052(local29 * local107 >> 12, local41, local47, local80, local84, local93);
					arg1[local98] = local34 * local121 >> 12;
				}
			}
			return;
		}
		local34 = this.aShortArray118[0];
		if (local34 > 8 || local34 < -8) {
			local29 = this.aShortArray119[0] << 12;
			local41 = local29 * this.anInt7449 >> 12;
			local54 = this.anInt7443 * local29 >> 12;
			local47 = local29 * local12 >> 12;
			local58 = local47 >> 12;
			local62 = local58 + 1;
			@Pc(232) int local232 = local47 & 0xFFF;
			if (local62 >= local54) {
				local62 = 0;
			}
			local80 = this.aByteArray101[local62 & 0xFF] & 0xFF;
			local93 = this.aByteArray101[local58 & 0xFF] & 0xFF;
			local84 = Class151_Sub3_Sub1.anIntArray670[local232];
			for (local98 = 0; local98 < Static147.anInt3075; local98++) {
				local107 = Static315.anIntArray425[local98] * this.anInt7449;
				local121 = this.method6052(local29 * local107 >> 12, local41, local232, local80, local84, local93);
				arg1[local98] = local34 * local121 >> 12;
			}
		}
		for (@Pc(306) int local306 = 1; local306 < this.anInt7439; local306++) {
			local34 = this.aShortArray118[local306];
			if (local34 > 8 || local34 < -8) {
				local29 = this.aShortArray119[local306] << 12;
				local54 = local29 * this.anInt7443 >> 12;
				local41 = local29 * this.anInt7449 >> 12;
				local47 = local29 * local12 >> 12;
				local58 = local47 >> 12;
				local62 = local58 + 1;
				local47 &= 0xFFF;
				if (local62 >= local54) {
					local62 = 0;
				}
				local80 = this.aByteArray101[local62 & 0xFF] & 0xFF;
				local93 = this.aByteArray101[local58 & 0xFF] & 0xFF;
				local84 = Class151_Sub3_Sub1.anIntArray670[local47];
				if (this.aBoolean530 && this.anInt7439 - 1 == local306) {
					for (local98 = 0; local98 < Static147.anInt3075; local98++) {
						local107 = Static315.anIntArray425[local98] * this.anInt7449;
						local121 = this.method6052(local107 * local29 >> 12, local41, local47, local80, local84, local93);
						local121 = (local34 * local121 >> 12) + arg1[local98];
						arg1[local98] = (local121 >> 1) + 2048;
					}
				} else {
					for (local98 = 0; local98 < Static147.anInt3075; local98++) {
						local107 = this.anInt7449 * Static315.anIntArray425[local98];
						local121 = this.method6052(local107 * local29 >> 12, local41, local47, local80, local84, local93);
						arg1[local98] += local34 * local121 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			this.method6049(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		this.aByteArray101 = Static328.method5197(this.anInt7448);
		this.method6053();
		for (@Pc(23) int local23 = this.anInt7439 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray118[local23];
			if (local30 > 8) {
				return;
			}
			if (local30 < -8) {
				return;
			}
			this.anInt7439--;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)I")
	private int method6052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (local13 >= arg1) {
			local13 = 0;
		}
		@Pc(30) int local30 = arg0 & 0xFFF;
		@Pc(34) int local34 = arg2 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = local30 - 4096;
		@Pc(46) int local46 = Class151_Sub3_Sub1.anIntArray670[local30];
		@Pc(55) int local55 = this.aByteArray101[arg5 + local17] & 0x3;
		@Pc(72) int local72;
		if (local55 <= 1) {
			local72 = local55 == 0 ? arg2 + local30 : -local30 + arg2;
		} else {
			local72 = local55 == 2 ? local30 - arg2 : -arg2 + -local30;
		}
		local55 = this.aByteArray101[arg5 + local13] & 0x3;
		@Pc(117) int local117;
		if (local55 > 1) {
			local117 = local55 == 2 ? local42 - arg2 : -local42 + -arg2;
		} else {
			local117 = local55 == 0 ? arg2 + local42 : -local42 + arg2;
		}
		@Pc(144) int local144 = local72 + ((local117 - local72) * local46 >> 12);
		local55 = this.aByteArray101[local17 + arg3] & 0x3;
		if (local55 <= 1) {
			local72 = local55 == 0 ? local30 + local34 : -local30 + local34;
		} else {
			local72 = local55 == 2 ? local30 - local34 : -local30 - local34;
		}
		local55 = this.aByteArray101[arg3 + local13] & 0x3;
		if (local55 <= 1) {
			local117 = local55 == 0 ? local34 + local42 : -local42 + local34;
		} else {
			local117 = local55 == 2 ? local42 - local34 : -local34 + -local42;
		}
		@Pc(240) int local240 = (local46 * (local117 - local72) >> 12) + local72;
		return (arg4 * (local240 - local144) >> 12) + local144;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(B)V")
	private void method6053() {
		@Pc(31) int local31;
		if (this.anInt7441 > 0) {
			this.aShortArray118 = new short[this.anInt7439];
			this.aShortArray119 = new short[this.anInt7439];
			for (local31 = 0; local31 < this.anInt7439; local31++) {
				this.aShortArray118[local31] = (short) (Math.pow((double) ((float) this.anInt7441 / 4096.0F), (double) local31) * 4096.0D);
				this.aShortArray119[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		} else if (this.aShortArray118 != null && this.anInt7439 == this.aShortArray118.length) {
			this.aShortArray119 = new short[this.anInt7439];
			for (local31 = 0; local31 < this.anInt7439; local31++) {
				this.aShortArray119[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.aBoolean530 = arg1.method4220() == 1;
		} else if (arg0 == 1) {
			this.anInt7439 = arg1.method4220();
		} else if (arg0 == 2) {
			this.anInt7441 = arg1.method4212();
			if (this.anInt7441 < 0) {
				this.aShortArray118 = new short[this.anInt7439];
				for (@Pc(70) int local70 = 0; local70 < this.anInt7439; local70++) {
					this.aShortArray118[local70] = (short) arg1.method4212();
				}
			}
		} else if (arg0 == 3) {
			this.anInt7449 = this.anInt7443 = arg1.method4220();
		} else if (arg0 == 4) {
			this.anInt7448 = arg1.method4220();
		} else if (arg0 == 5) {
			this.anInt7449 = arg1.method4220();
		} else if (arg0 == 6) {
			this.anInt7443 = arg1.method4220();
		}
	}
}
