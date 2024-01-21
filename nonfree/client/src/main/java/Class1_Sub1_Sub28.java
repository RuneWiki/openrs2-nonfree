import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!r", name = "U", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!r", name = "P", descriptor = "I")
	private int anInt3506 = 4;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "I")
	private int anInt3508 = 1638;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "[B")
	private byte[] aByteArray37 = new byte[512];

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "Z")
	private boolean aBoolean164 = true;

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
	private int anInt3511 = 4;

	@OriginalMember(owner = "client!r", name = "jb", descriptor = "I")
	private int anInt3512 = 4;

	@OriginalMember(owner = "client!r", name = "nb", descriptor = "I")
	private int anInt3515 = 0;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		this.aByteArray37 = Static103.method1781(this.anInt3515);
		this.method2689();
		for (@Pc(25) int local25 = this.anInt3506 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray40[local25];
			if (local32 > 8) {
				return;
			}
			if (local32 < -8) {
				return;
			}
			this.anInt3506--;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)I")
	private int method2687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 - 4096;
		@Pc(13) int local13 = arg0 >> 12;
		@Pc(22) int local22 = local13 + 1;
		@Pc(26) int local26 = local13 & 0xFF;
		@Pc(35) int local35 = this.aByteArray37[arg3 + local26] & 0x3;
		if (local22 >= arg4) {
			local22 = 0;
		}
		local22 &= 0xFF;
		@Pc(48) int local48 = arg0 & 0xFFF;
		@Pc(52) int local52 = local48 - 4096;
		@Pc(56) int local56 = Class45.anIntArray167[local48];
		@Pc(73) int local73;
		if (local35 > 1) {
			local73 = local35 == 2 ? local48 - arg2 : -local48 + -arg2;
		} else {
			local73 = local35 == 0 ? arg2 + local48 : arg2 + -local48;
		}
		local35 = this.aByteArray37[local22 + arg3] & 0x3;
		@Pc(111) int local111;
		if (local35 <= 1) {
			local111 = local35 == 0 ? arg2 + local52 : -local52 + arg2;
		} else {
			local111 = local35 == 2 ? local52 - arg2 : -local52 + -arg2;
		}
		@Pc(136) int local136 = (local56 * (local111 - local73) >> 12) + local73;
		local35 = this.aByteArray37[arg1 + local26] & 0x3;
		if (local35 <= 1) {
			local73 = local35 == 0 ? local48 + local9 : -local48 + local9;
		} else {
			local73 = local35 == 2 ? local48 - local9 : -local9 + -local48;
		}
		local35 = this.aByteArray37[local22 + arg1] & 0x3;
		if (local35 > 1) {
			local111 = local35 == 2 ? local52 - local9 : -local52 + -local9;
		} else {
			local111 = local35 == 0 ? local9 + local52 : local9 - local52;
		}
		@Pc(229) int local229 = local73 + ((local111 - local73) * local56 >> 12);
		return (arg5 * (local229 - local136) >> 12) + local136;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean164 = arg0.method2771() == 1;
		} else if (arg1 == 1) {
			this.anInt3506 = arg0.method2771();
		} else if (arg1 == 2) {
			this.anInt3508 = arg0.method2779();
			if (this.anInt3508 < 0) {
				this.aShortArray40 = new short[this.anInt3506];
				for (@Pc(76) int local76 = 0; local76 < this.anInt3506; local76++) {
					this.aShortArray40[local76] = (short) arg0.method2779();
				}
			}
		} else if (arg1 == 3) {
			this.anInt3512 = this.anInt3511 = arg0.method2771();
		} else if (arg1 == 4) {
			this.anInt3515 = arg0.method2771();
		} else if (arg1 == 5) {
			this.anInt3512 = arg0.method2771();
		} else if (arg1 == 6) {
			this.anInt3511 = arg0.method2771();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	private void method2689() {
		@Pc(29) int local29;
		if (this.anInt3508 > 0) {
			this.aShortArray40 = new short[this.anInt3506];
			this.aShortArray39 = new short[this.anInt3506];
			for (local29 = 0; local29 < this.anInt3506; local29++) {
				this.aShortArray40[local29] = (short) (Math.pow((double) ((float) this.anInt3508 / 4096.0F), (double) local29) * 4096.0D);
				this.aShortArray39[local29] = (short) Math.pow(2.0D, (double) local29);
			}
		} else if (this.aShortArray40 != null && this.aShortArray40.length == this.anInt3506) {
			this.aShortArray39 = new short[this.anInt3506];
			for (local29 = 0; local29 < this.anInt3506; local29++) {
				this.aShortArray39[local29] = (short) Math.pow(2.0D, (double) local29);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(28) int local28 = Static187.anIntArray362[arg0] * this.anInt3511;
			@Pc(119) int local119;
			@Pc(133) int local133;
			@Pc(46) int local46;
			@Pc(39) short local39;
			@Pc(110) int local110;
			@Pc(66) int local66;
			@Pc(53) int local53;
			@Pc(60) int local60;
			@Pc(87) int local87;
			@Pc(70) int local70;
			@Pc(91) int local91;
			@Pc(83) int local83;
			@Pc(105) int local105;
			if (this.anInt3506 == 1) {
				local39 = this.aShortArray40[0];
				local46 = this.aShortArray39[0] << 12;
				local53 = local46 * this.anInt3512 >> 12;
				local60 = this.anInt3511 * local46 >> 12;
				local66 = local28 * local46 >> 12;
				local70 = local66 >> 12;
				@Pc(74) int local74 = local66 & 0xFFF;
				local83 = this.aByteArray37[local70 & 0xFF] & 0xFF;
				local87 = Class45.anIntArray167[local74];
				local91 = local70 + 1;
				if (local60 <= local91) {
					local91 = 0;
				}
				local105 = this.aByteArray37[local91 & 0xFF] & 0xFF;
				if (this.aBoolean164) {
					for (local110 = 0; local110 < Static115.anInt2578; local110++) {
						local119 = Static45.anIntArray97[local110] * this.anInt3512;
						local133 = this.method2687(local119 * local46 >> 12, local105, local74, local83, local53, local87);
						local133 = local133 * local39 >> 12;
						local17[local110] = (local133 >> 1) + 2048;
					}
				} else {
					for (local110 = 0; local110 < Static115.anInt2578; local110++) {
						local119 = this.anInt3512 * Static45.anIntArray97[local110];
						local133 = this.method2687(local119 * local46 >> 12, local105, local74, local83, local53, local87);
						local17[local110] = local39 * local133 >> 12;
					}
				}
			} else {
				local39 = this.aShortArray40[0];
				if (local39 > 8 || local39 < -8) {
					local46 = this.aShortArray39[0] << 12;
					local66 = local28 * local46 >> 12;
					local60 = local46 * this.anInt3511 >> 12;
					local70 = local66 >> 12;
					local66 &= 0xFFF;
					local87 = Class45.anIntArray167[local66];
					local83 = this.aByteArray37[local70 & 0xFF] & 0xFF;
					local53 = this.anInt3512 * local46 >> 12;
					local91 = local70 + 1;
					if (local60 <= local91) {
						local91 = 0;
					}
					local105 = this.aByteArray37[local91 & 0xFF] & 0xFF;
					for (local110 = 0; local110 < Static115.anInt2578; local110++) {
						local119 = Static45.anIntArray97[local110] * this.anInt3512;
						local133 = this.method2687(local46 * local119 >> 12, local105, local66, local83, local53, local87);
						local17[local110] = local39 * local133 >> 12;
					}
				}
				for (@Pc(320) int local320 = 1; local320 < this.anInt3506; local320++) {
					local39 = this.aShortArray40[local320];
					if (local39 > 8 || local39 < -8) {
						local46 = this.aShortArray39[local320] << 12;
						local66 = local28 * local46 >> 12;
						local53 = local46 * this.anInt3512 >> 12;
						local70 = local66 >> 12;
						local83 = this.aByteArray37[local70 & 0xFF] & 0xFF;
						local60 = local46 * this.anInt3511 >> 12;
						local91 = local70 + 1;
						local66 &= 0xFFF;
						if (local60 <= local91) {
							local91 = 0;
						}
						local87 = Class45.anIntArray167[local66];
						local105 = this.aByteArray37[local91 & 0xFF] & 0xFF;
						if (this.aBoolean164 && local320 == this.anInt3506 - 1) {
							for (local110 = 0; local110 < Static115.anInt2578; local110++) {
								local119 = Static45.anIntArray97[local110] * this.anInt3512;
								local133 = this.method2687(local119 * local46 >> 12, local105, local66, local83, local53, local87);
								local133 = local17[local110] + (local133 * local39 >> 12);
								local17[local110] = (local133 >> 1) + 2048;
							}
						} else {
							for (local110 = 0; local110 < Static115.anInt2578; local110++) {
								local119 = this.anInt3512 * Static45.anIntArray97[local110];
								local133 = this.method2687(local46 * local119 >> 12, local105, local66, local83, local53, local87);
								local17[local110] += local39 * local133 >> 12;
							}
						}
					}
				}
			}
		}
		return local17;
	}
}
