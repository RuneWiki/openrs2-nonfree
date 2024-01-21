import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cd", name = "jb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!cd", name = "nb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
	private int anInt457 = 1638;

	@OriginalMember(owner = "client!cd", name = "ab", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!cd", name = "fb", descriptor = "[B")
	private byte[] aByteArray2 = new byte[512];

	@OriginalMember(owner = "client!cd", name = "mb", descriptor = "I")
	private int anInt463 = 0;

	@OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
	private int anInt461 = 4;

	@OriginalMember(owner = "client!cd", name = "qb", descriptor = "I")
	private int anInt466 = 4;

	@OriginalMember(owner = "client!cd", name = "vb", descriptor = "I")
	private int anInt470 = 4;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		this.aByteArray2 = Static167.method2486(this.anInt463);
		this.method395();
		for (@Pc(25) int local25 = this.anInt466 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray5[local25];
			if (local32 > 8) {
				return;
			}
			if (local32 < -8) {
				return;
			}
			this.anInt466--;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)I")
	private int method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 - 4096;
		@Pc(13) int local13 = arg2 >> 12;
		@Pc(17) int local17 = arg2 & 0xFFF;
		@Pc(21) int local21 = Class80.anIntArray246[local17];
		@Pc(25) int local25 = local13 + 1;
		@Pc(29) int local29 = local17 - 4096;
		@Pc(33) int local33 = local13 & 0xFF;
		if (arg1 <= local25) {
			local25 = 0;
		}
		@Pc(47) int local47 = this.aByteArray2[arg4 + local33] & 0x3;
		local25 &= 0xFF;
		@Pc(70) int local70;
		if (local47 > 1) {
			local70 = local47 == 2 ? local17 - arg3 : -arg3 + -local17;
		} else {
			local70 = local47 == 0 ? local17 + arg3 : -local17 + arg3;
		}
		local47 = this.aByteArray2[arg4 + local25] & 0x3;
		@Pc(112) int local112;
		if (local47 <= 1) {
			local112 = local47 == 0 ? arg3 + local29 : -local29 + arg3;
		} else {
			local112 = local47 == 2 ? local29 - arg3 : -local29 + -arg3;
		}
		local47 = this.aByteArray2[local33 + arg5] & 0x3;
		@Pc(149) int local149 = local70 + ((local112 - local70) * local21 >> 12);
		if (local47 > 1) {
			local70 = local47 == 2 ? local17 - local9 : -local17 + -local9;
		} else {
			local70 = local47 == 0 ? local17 + local9 : -local17 + local9;
		}
		local47 = this.aByteArray2[arg5 + local25] & 0x3;
		if (local47 <= 1) {
			local112 = local47 == 0 ? local29 + local9 : local9 - local29;
		} else {
			local112 = local47 == 2 ? local29 - local9 : -local29 - local9;
		}
		@Pc(237) int local237 = local70 + (local21 * (local112 - local70) >> 12);
		return ((local237 - local149) * arg0 >> 12) + local149;
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
	private void method395() {
		@Pc(25) int local25;
		if (this.anInt457 > 0) {
			this.aShortArray6 = new short[this.anInt466];
			this.aShortArray5 = new short[this.anInt466];
			for (local25 = 0; local25 < this.anInt466; local25++) {
				this.aShortArray5[local25] = (short) (Math.pow((double) ((float) this.anInt457 / 4096.0F), (double) local25) * 4096.0D);
				this.aShortArray6[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		} else if (this.aShortArray5 != null && this.aShortArray5.length == this.anInt466) {
			this.aShortArray6 = new short[this.anInt466];
			for (local25 = 0; local25 < this.anInt466; local25++) {
				this.aShortArray6[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean31 = arg0.method1278() == 1;
		} else if (arg1 == 1) {
			this.anInt466 = arg0.method1278();
		} else if (arg1 == 2) {
			this.anInt457 = arg0.method1267();
			if (this.anInt457 < 0) {
				this.aShortArray5 = new short[this.anInt466];
				for (@Pc(65) int local65 = 0; local65 < this.anInt466; local65++) {
					this.aShortArray5[local65] = (short) arg0.method1267();
				}
			}
		} else if (arg1 == 3) {
			this.anInt461 = this.anInt470 = arg0.method1278();
		} else if (arg1 == 4) {
			this.anInt463 = arg0.method1278();
		} else if (arg1 == 5) {
			this.anInt461 = arg0.method1278();
		} else if (arg1 == 6) {
			this.anInt470 = arg0.method1278();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(30) int local30 = this.anInt470 * Static34.anIntArray37[arg0];
			@Pc(124) int local124;
			@Pc(138) int local138;
			@Pc(54) int local54;
			@Pc(39) short local39;
			@Pc(115) int local115;
			@Pc(74) int local74;
			@Pc(68) int local68;
			@Pc(61) int local61;
			@Pc(99) int local99;
			@Pc(78) int local78;
			@Pc(82) int local82;
			@Pc(91) int local91;
			@Pc(113) int local113;
			if (this.anInt466 == 1) {
				local54 = this.aShortArray6[0] << 12;
				local68 = local54 * this.anInt461 >> 12;
				local74 = local30 * local54 >> 12;
				local39 = this.aShortArray5[0];
				local78 = local74 >> 12;
				local74 &= 0xFFF;
				local61 = local54 * this.anInt470 >> 12;
				local99 = Class80.anIntArray246[local74];
				local82 = local78 + 1;
				if (local82 >= local61) {
					local82 = 0;
				}
				local91 = this.aByteArray2[local78 & 0xFF] & 0xFF;
				local113 = this.aByteArray2[local82 & 0xFF] & 0xFF;
				if (this.aBoolean31) {
					for (local115 = 0; local115 < Static190.anInt3865; local115++) {
						local124 = Static133.anIntArray187[local115] * this.anInt461;
						local138 = this.method394(local99, local68, local54 * local124 >> 12, local74, local91, local113);
						local138 = local39 * local138 >> 12;
						local7[local115] = (local138 >> 1) + 2048;
					}
				} else {
					for (local115 = 0; local115 < Static190.anInt3865; local115++) {
						local124 = Static133.anIntArray187[local115] * this.anInt461;
						local138 = this.method394(local99, local68, local124 * local54 >> 12, local74, local91, local113);
						local7[local115] = local138 * local39 >> 12;
					}
				}
			} else {
				local39 = this.aShortArray5[0];
				if (local39 > 8 || local39 < -8) {
					local54 = this.aShortArray6[0] << 12;
					local61 = this.anInt470 * local54 >> 12;
					local68 = this.anInt461 * local54 >> 12;
					local74 = local54 * local30 >> 12;
					local78 = local74 >> 12;
					local82 = local78 + 1;
					local91 = this.aByteArray2[local78 & 0xFF] & 0xFF;
					@Pc(95) int local95 = local74 & 0xFFF;
					local99 = Class80.anIntArray246[local95];
					if (local61 <= local82) {
						local82 = 0;
					}
					local113 = this.aByteArray2[local82 & 0xFF] & 0xFF;
					for (local115 = 0; local115 < Static190.anInt3865; local115++) {
						local124 = this.anInt461 * Static133.anIntArray187[local115];
						local138 = this.method394(local99, local68, local124 * local54 >> 12, local95, local91, local113);
						local7[local115] = local138 * local39 >> 12;
					}
				}
				for (@Pc(156) int local156 = 1; local156 < this.anInt466; local156++) {
					local39 = this.aShortArray5[local156];
					if (local39 > 8 || local39 < -8) {
						local54 = this.aShortArray6[local156] << 12;
						local68 = local54 * this.anInt461 >> 12;
						local61 = local54 * this.anInt470 >> 12;
						local74 = local30 * local54 >> 12;
						local78 = local74 >> 12;
						local82 = local78 + 1;
						local74 &= 0xFFF;
						local99 = Class80.anIntArray246[local74];
						if (local61 <= local82) {
							local82 = 0;
						}
						local91 = this.aByteArray2[local78 & 0xFF] & 0xFF;
						local113 = this.aByteArray2[local82 & 0xFF] & 0xFF;
						if (this.aBoolean31 && this.anInt466 - 1 == local156) {
							for (local115 = 0; local115 < Static190.anInt3865; local115++) {
								local124 = Static133.anIntArray187[local115] * this.anInt461;
								local138 = this.method394(local99, local68, local54 * local124 >> 12, local74, local91, local113);
								local138 = local7[local115] + (local138 * local39 >> 12);
								local7[local115] = (local138 >> 1) + 2048;
							}
						} else {
							for (local115 = 0; local115 < Static190.anInt3865; local115++) {
								local124 = this.anInt461 * Static133.anIntArray187[local115];
								local138 = this.method394(local99, local68, local124 * local54 >> 12, local74, local91, local113);
								local7[local115] += local39 * local138 >> 12;
							}
						}
					}
				}
			}
		}
		return local7;
	}
}
