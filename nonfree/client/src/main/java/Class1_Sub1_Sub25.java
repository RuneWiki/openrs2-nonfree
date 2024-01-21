import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mi", name = "tb", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!mi", name = "Db", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!mi", name = "pb", descriptor = "I")
	private int anInt2942 = 4;

	@OriginalMember(owner = "client!mi", name = "xb", descriptor = "Z")
	private boolean aBoolean119 = true;

	@OriginalMember(owner = "client!mi", name = "ub", descriptor = "I")
	private int anInt2945 = 1638;

	@OriginalMember(owner = "client!mi", name = "rb", descriptor = "I")
	private int anInt2944 = 4;

	@OriginalMember(owner = "client!mi", name = "Ib", descriptor = "[B")
	private byte[] aByteArray36 = new byte[512];

	@OriginalMember(owner = "client!mi", name = "Fb", descriptor = "I")
	private int anInt2949 = 0;

	@OriginalMember(owner = "client!mi", name = "Jb", descriptor = "I")
	private int anInt2951 = 4;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
	private void method2244() {
		@Pc(20) int local20;
		if (this.anInt2945 > 0) {
			this.aShortArray48 = new short[this.anInt2951];
			this.aShortArray47 = new short[this.anInt2951];
			for (local20 = 0; local20 < this.anInt2951; local20++) {
				this.aShortArray47[local20] = (short) (Math.pow((double) ((float) this.anInt2945 / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray48[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray47 != null && this.anInt2951 == this.aShortArray47.length) {
			this.aShortArray48 = new short[this.anInt2951];
			for (local20 = 0; local20 < this.anInt2951; local20++) {
				this.aShortArray48[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)I")
	private int method2248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg2 - 4096;
		@Pc(13) int local13 = arg1 >> 12;
		@Pc(17) int local17 = local13 + 1;
		@Pc(26) int local26 = arg1 & 0xFFF;
		@Pc(30) int local30 = local26 - 4096;
		if (local17 >= arg0) {
			local17 = 0;
		}
		local13 &= 0xFF;
		local17 &= 0xFF;
		@Pc(47) int local47 = Class1_Sub2_Sub15.anIntArray299[local26];
		@Pc(56) int local56 = this.aByteArray36[arg3 + local13] & 0x3;
		@Pc(77) int local77;
		if (local56 > 1) {
			local77 = local56 == 2 ? local26 - arg2 : -arg2 + -local26;
		} else {
			local77 = local56 == 0 ? local26 + arg2 : arg2 - local26;
		}
		local56 = this.aByteArray36[local17 + arg3] & 0x3;
		@Pc(116) int local116;
		if (local56 > 1) {
			local116 = local56 == 2 ? local30 - arg2 : -arg2 + -local30;
		} else {
			local116 = local56 == 0 ? arg2 + local30 : arg2 - local30;
		}
		@Pc(143) int local143 = local77 + (local47 * (local116 - local77) >> 12);
		local56 = this.aByteArray36[arg4 + local13] & 0x3;
		if (local56 > 1) {
			local77 = local56 == 2 ? local26 - local9 : -local26 - local9;
		} else {
			local77 = local56 == 0 ? local26 + local9 : local9 + -local26;
		}
		local56 = this.aByteArray36[local17 + arg4] & 0x3;
		if (local56 <= 1) {
			local116 = local56 == 0 ? local9 + local30 : local9 + -local30;
		} else {
			local116 = local56 == 2 ? local30 - local9 : -local30 + -local9;
		}
		@Pc(238) int local238 = (local47 * (local116 - local77) >> 12) + local77;
		return local143 + ((local238 - local143) * arg5 >> 12);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		this.aByteArray36 = Static179.method3029(this.anInt2949);
		this.method2244();
		for (@Pc(15) int local15 = this.anInt2951 - 1; local15 >= 1; local15--) {
			@Pc(22) short local22 = this.aShortArray47[local15];
			if (local22 > 8 || local22 < -8) {
				break;
			}
			this.anInt2951--;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(27) int local27 = Static22.anIntArray68[arg0] * this.anInt2942;
			@Pc(123) int local123;
			@Pc(139) int local139;
			@Pc(53) int local53;
			@Pc(38) short local38;
			@Pc(114) int local114;
			@Pc(66) int local66;
			@Pc(98) int local98;
			@Pc(60) int local60;
			@Pc(82) int local82;
			@Pc(70) int local70;
			@Pc(78) int local78;
			@Pc(91) int local91;
			@Pc(112) int local112;
			if (this.anInt2951 == 1) {
				local53 = this.aShortArray48[0] << 12;
				local98 = local53 * this.anInt2944 >> 12;
				local38 = this.aShortArray47[0];
				local60 = local53 * this.anInt2942 >> 12;
				local66 = local53 * local27 >> 12;
				local70 = local66 >> 12;
				local91 = this.aByteArray36[local70 & 0xFF] & 0xFF;
				local66 &= 0xFFF;
				local82 = Class1_Sub2_Sub15.anIntArray299[local66];
				local78 = local70 + 1;
				if (local60 <= local78) {
					local78 = 0;
				}
				local112 = this.aByteArray36[local78 & 0xFF] & 0xFF;
				if (this.aBoolean119) {
					for (local114 = 0; local114 < Static176.anInt3921; local114++) {
						local123 = Static171.anIntArray439[local114] * this.anInt2944;
						local139 = this.method2248(local98, local53 * local123 >> 12, local66, local91, local112, local82);
						local139 = local139 * local38 >> 12;
						local16[local114] = (local139 >> 1) + 2048;
					}
				} else {
					for (local114 = 0; local114 < Static176.anInt3921; local114++) {
						local123 = this.anInt2944 * Static171.anIntArray439[local114];
						local139 = this.method2248(local98, local123 * local53 >> 12, local66, local91, local112, local82);
						local16[local114] = local139 * local38 >> 12;
					}
				}
			} else {
				local38 = this.aShortArray47[0];
				if (local38 > 8 || local38 < -8) {
					local53 = this.aShortArray48[0] << 12;
					local60 = local53 * this.anInt2942 >> 12;
					local66 = local53 * local27 >> 12;
					local70 = local66 >> 12;
					@Pc(74) int local74 = local66 & 0xFFF;
					local78 = local70 + 1;
					local82 = Class1_Sub2_Sub15.anIntArray299[local74];
					local91 = this.aByteArray36[local70 & 0xFF] & 0xFF;
					local98 = this.anInt2944 * local53 >> 12;
					if (local60 <= local78) {
						local78 = 0;
					}
					local112 = this.aByteArray36[local78 & 0xFF] & 0xFF;
					for (local114 = 0; local114 < Static176.anInt3921; local114++) {
						local123 = this.anInt2944 * Static171.anIntArray439[local114];
						local139 = this.method2248(local98, local123 * local53 >> 12, local74, local91, local112, local82);
						local16[local114] = local38 * local139 >> 12;
					}
				}
				for (@Pc(157) int local157 = 1; local157 < this.anInt2951; local157++) {
					local38 = this.aShortArray47[local157];
					if (local38 > 8 || local38 < -8) {
						local53 = this.aShortArray48[local157] << 12;
						local98 = local53 * this.anInt2944 >> 12;
						local66 = local53 * local27 >> 12;
						local70 = local66 >> 12;
						local66 &= 0xFFF;
						local60 = local53 * this.anInt2942 >> 12;
						local82 = Class1_Sub2_Sub15.anIntArray299[local66];
						local78 = local70 + 1;
						if (local60 <= local78) {
							local78 = 0;
						}
						local112 = this.aByteArray36[local78 & 0xFF] & 0xFF;
						local91 = this.aByteArray36[local70 & 0xFF] & 0xFF;
						if (this.aBoolean119 && this.anInt2951 - 1 == local157) {
							for (local114 = 0; local114 < Static176.anInt3921; local114++) {
								local123 = Static171.anIntArray439[local114] * this.anInt2944;
								local139 = this.method2248(local98, local53 * local123 >> 12, local66, local91, local112, local82);
								local139 = local16[local114] + (local38 * local139 >> 12);
								local16[local114] = (local139 >> 1) + 2048;
							}
						} else {
							for (local114 = 0; local114 < Static176.anInt3921; local114++) {
								local123 = this.anInt2944 * Static171.anIntArray439[local114];
								local139 = this.method2248(local98, local53 * local123 >> 12, local66, local91, local112, local82);
								local16[local114] += local38 * local139 >> 12;
							}
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.aBoolean119 = arg1.method1738() == 1;
		} else if (arg0 == 1) {
			this.anInt2951 = arg1.method1738();
		} else if (arg0 == 2) {
			this.anInt2945 = arg1.method1729();
			if (this.anInt2945 < 0) {
				this.aShortArray47 = new short[this.anInt2951];
				for (@Pc(69) int local69 = 0; local69 < this.anInt2951; local69++) {
					this.aShortArray47[local69] = (short) arg1.method1729();
				}
			}
		} else if (arg0 == 3) {
			this.anInt2944 = this.anInt2942 = arg1.method1738();
		} else if (arg0 == 4) {
			this.anInt2949 = arg1.method1738();
		} else if (arg0 == 5) {
			this.anInt2944 = arg1.method1738();
		} else if (arg0 == 6) {
			this.anInt2942 = arg1.method1738();
		}
	}
}
