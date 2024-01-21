import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class2_Sub2_Sub30 extends Class2_Sub2 {

	@OriginalMember(owner = "client!q", name = "db", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!q", name = "eb", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!q", name = "T", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!q", name = "Z", descriptor = "[B")
	private byte[] aByteArray42 = new byte[512];

	@OriginalMember(owner = "client!q", name = "W", descriptor = "I")
	private int anInt3724 = 4;

	@OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
	private int anInt3727 = 4;

	@OriginalMember(owner = "client!q", name = "kb", descriptor = "I")
	private int anInt3733 = 4;

	@OriginalMember(owner = "client!q", name = "hb", descriptor = "I")
	private int anInt3731 = 0;

	@OriginalMember(owner = "client!q", name = "lb", descriptor = "I")
	private int anInt3734 = 1638;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIIIII)I")
	private int method2876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 - 4096;
		@Pc(13) int local13 = arg5 >> 12;
		@Pc(17) int local17 = local13 + 1;
		if (local17 >= arg1) {
			local17 = 0;
		}
		@Pc(30) int local30 = arg5 & 0xFFF;
		local13 &= 0xFF;
		local17 &= 0xFF;
		@Pc(47) int local47 = this.aByteArray42[local13 + arg4] & 0x3;
		@Pc(51) int local51 = local30 - 4096;
		@Pc(70) int local70;
		if (local47 > 1) {
			local70 = local47 == 2 ? local30 - arg0 : -arg0 + -local30;
		} else {
			local70 = local47 == 0 ? arg0 + local30 : -local30 + arg0;
		}
		local47 = this.aByteArray42[arg4 + local17] & 0x3;
		@Pc(99) int local99 = Class2_Sub12.anIntArray331[local30];
		@Pc(116) int local116;
		if (local47 <= 1) {
			local116 = local47 == 0 ? arg0 + local51 : -local51 + arg0;
		} else {
			local116 = local47 == 2 ? local51 - arg0 : -arg0 + -local51;
		}
		@Pc(145) int local145 = (local99 * (local116 - local70) >> 12) + local70;
		local47 = this.aByteArray42[local13 + arg3] & 0x3;
		if (local47 > 1) {
			local70 = local47 == 2 ? local30 - local9 : -local9 + -local30;
		} else {
			local70 = local47 == 0 ? local30 + local9 : local9 - local30;
		}
		local47 = this.aByteArray42[arg3 + local17] & 0x3;
		if (local47 > 1) {
			local116 = local47 == 2 ? local51 - local9 : -local51 + -local9;
		} else {
			local116 = local47 == 0 ? local9 + local51 : local9 - local51;
		}
		@Pc(245) int local245 = ((local116 - local70) * local99 >> 12) + local70;
		return local145 + (arg2 * (local245 - local145) >> 12);
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
	private void method2878() {
		@Pc(16) int local16;
		if (this.anInt3734 > 0) {
			this.aShortArray55 = new short[this.anInt3727];
			this.aShortArray54 = new short[this.anInt3727];
			for (local16 = 0; local16 < this.anInt3727; local16++) {
				this.aShortArray54[local16] = (short) (Math.pow((double) ((float) this.anInt3734 / 4096.0F), (double) local16) * 4096.0D);
				this.aShortArray55[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		} else if (this.aShortArray54 != null && this.aShortArray54.length == this.anInt3727) {
			this.aShortArray55 = new short[this.anInt3727];
			for (local16 = 0; local16 < this.anInt3727; local16++) {
				this.aShortArray55[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(28) int local28 = this.anInt3733 * Static160.anIntArray187[arg0];
			@Pc(123) int local123;
			@Pc(137) int local137;
			@Pc(46) int local46;
			@Pc(39) short local39;
			@Pc(114) int local114;
			@Pc(66) int local66;
			@Pc(60) int local60;
			@Pc(53) int local53;
			@Pc(87) int local87;
			@Pc(70) int local70;
			@Pc(91) int local91;
			@Pc(79) int local79;
			@Pc(109) int local109;
			if (this.anInt3727 == 1) {
				local39 = this.aShortArray54[0];
				local46 = this.aShortArray55[0] << 12;
				local53 = this.anInt3733 * local46 >> 12;
				local60 = local46 * this.anInt3724 >> 12;
				local66 = local46 * local28 >> 12;
				local70 = local66 >> 12;
				local79 = this.aByteArray42[local70 & 0xFF] & 0xFF;
				@Pc(83) int local83 = local66 & 0xFFF;
				local87 = Class2_Sub12.anIntArray331[local83];
				local91 = local70 + 1;
				if (local91 >= local53) {
					local91 = 0;
				}
				local109 = this.aByteArray42[local91 & 0xFF] & 0xFF;
				if (this.aBoolean143) {
					for (local114 = 0; local114 < Static106.anInt3045; local114++) {
						local123 = this.anInt3724 * Static15.anIntArray41[local114];
						local137 = this.method2876(local83, local60, local87, local109, local79, local46 * local123 >> 12);
						local137 = local39 * local137 >> 12;
						local17[local114] = (local137 >> 1) + 2048;
					}
				} else {
					for (local114 = 0; local114 < Static106.anInt3045; local114++) {
						local123 = this.anInt3724 * Static15.anIntArray41[local114];
						local137 = this.method2876(local83, local60, local87, local109, local79, local123 * local46 >> 12);
						local17[local114] = local39 * local137 >> 12;
					}
				}
			} else {
				local39 = this.aShortArray54[0];
				if (local39 > 8 || local39 < -8) {
					local46 = this.aShortArray55[0] << 12;
					local66 = local46 * local28 >> 12;
					local70 = local66 >> 12;
					local79 = this.aByteArray42[local70 & 0xFF] & 0xFF;
					local66 &= 0xFFF;
					local53 = this.anInt3733 * local46 >> 12;
					local87 = Class2_Sub12.anIntArray331[local66];
					local91 = local70 + 1;
					local60 = local46 * this.anInt3724 >> 12;
					if (local91 >= local53) {
						local91 = 0;
					}
					local109 = this.aByteArray42[local91 & 0xFF] & 0xFF;
					for (local114 = 0; local114 < Static106.anInt3045; local114++) {
						local123 = Static15.anIntArray41[local114] * this.anInt3724;
						local137 = this.method2876(local66, local60, local87, local109, local79, local46 * local123 >> 12);
						local17[local114] = local39 * local137 >> 12;
					}
				}
				for (@Pc(316) int local316 = 1; local316 < this.anInt3727; local316++) {
					local39 = this.aShortArray54[local316];
					if (local39 > 8 || local39 < -8) {
						local46 = this.aShortArray55[local316] << 12;
						local53 = local46 * this.anInt3733 >> 12;
						local66 = local46 * local28 >> 12;
						local60 = this.anInt3724 * local46 >> 12;
						local70 = local66 >> 12;
						local66 &= 0xFFF;
						local91 = local70 + 1;
						if (local53 <= local91) {
							local91 = 0;
						}
						local87 = Class2_Sub12.anIntArray331[local66];
						local79 = this.aByteArray42[local70 & 0xFF] & 0xFF;
						local109 = this.aByteArray42[local91 & 0xFF] & 0xFF;
						if (this.aBoolean143 && local316 == this.anInt3727 - 1) {
							for (local114 = 0; local114 < Static106.anInt3045; local114++) {
								local123 = Static15.anIntArray41[local114] * this.anInt3724;
								local137 = this.method2876(local66, local60, local87, local109, local79, local46 * local123 >> 12);
								local137 = (local137 * local39 >> 12) + local17[local114];
								local17[local114] = (local137 >> 1) + 2048;
							}
						} else {
							for (local114 = 0; local114 < Static106.anInt3045; local114++) {
								local123 = this.anInt3724 * Static15.anIntArray41[local114];
								local137 = this.method2876(local66, local60, local87, local109, local79, local46 * local123 >> 12);
								local17[local114] += local39 * local137 >> 12;
							}
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		this.aByteArray42 = Static14.method373(this.anInt3731);
		this.method2878();
		for (@Pc(23) int local23 = this.anInt3727 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray54[local23];
			if (local30 > 8 || local30 < -8) {
				return;
			}
			this.anInt3727--;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.aBoolean143 = arg1.method218() == 1;
		} else if (arg0 == 1) {
			this.anInt3727 = arg1.method218();
		} else if (arg0 == 2) {
			this.anInt3734 = arg1.method219();
			if (this.anInt3734 < 0) {
				this.aShortArray54 = new short[this.anInt3727];
				for (@Pc(77) int local77 = 0; local77 < this.anInt3727; local77++) {
					this.aShortArray54[local77] = (short) arg1.method219();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt3724 = this.anInt3733 = arg1.method218();
			return;
		} else if (arg0 == 4) {
			this.anInt3731 = arg1.method218();
			return;
		} else if (arg0 == 5) {
			this.anInt3724 = arg1.method218();
			return;
		} else if (arg0 == 6) {
			this.anInt3733 = arg1.method218();
			return;
		}
	}
}
