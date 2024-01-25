import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class14_Sub3_Sub31 extends Class14_Sub3 {

	@OriginalMember(owner = "client!qs", name = "K", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!qs", name = "ab", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!qs", name = "V", descriptor = "I")
	public int anInt5156 = 0;

	@OriginalMember(owner = "client!qs", name = "N", descriptor = "I")
	public int anInt5148 = 4;

	@OriginalMember(owner = "client!qs", name = "S", descriptor = "I")
	public int anInt5153 = 4;

	@OriginalMember(owner = "client!qs", name = "T", descriptor = "I")
	public int anInt5154 = 4;

	@OriginalMember(owner = "client!qs", name = "db", descriptor = "I")
	public int anInt5161 = 1638;

	@OriginalMember(owner = "client!qs", name = "cb", descriptor = "Z")
	public boolean aBoolean346 = true;

	@OriginalMember(owner = "client!qs", name = "fb", descriptor = "[B")
	private byte[] aByteArray158 = new byte[512];

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		this.aByteArray158 = Static332.method5728(this.anInt5156);
		this.method4606();
		for (@Pc(23) int local23 = this.anInt5148 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray104[local23];
			if (local30 > 8) {
				return;
			}
			if (local30 < -8) {
				return;
			}
			this.anInt5148--;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean346 = arg0.method2548() == 1;
		} else if (arg1 == 1) {
			this.anInt5148 = arg0.method2548();
		} else if (arg1 == 2) {
			this.anInt5161 = arg0.method2502();
			if (this.anInt5161 < 0) {
				this.aShortArray104 = new short[this.anInt5148];
				for (@Pc(74) int local74 = 0; local74 < this.anInt5148; local74++) {
					this.aShortArray104[local74] = (short) arg0.method2502();
				}
			}
		} else if (arg1 == 3) {
			this.anInt5153 = this.anInt5154 = arg0.method2548();
		} else if (arg1 == 4) {
			this.anInt5156 = arg0.method2548();
		} else if (arg1 == 5) {
			this.anInt5153 = arg0.method2548();
		} else if (arg1 == 6) {
			this.anInt5154 = arg0.method2548();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			this.method4608(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIBIII)I")
	private int method4605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg0 >> 12;
		@Pc(18) int local18 = local14 + 1;
		@Pc(22) int local22 = local14 & 0xFF;
		@Pc(26) int local26 = arg0 & 0xFFF;
		if (arg3 <= local18) {
			local18 = 0;
		}
		@Pc(35) int local35 = local26 - 4096;
		@Pc(39) int local39 = arg1 - 4096;
		local18 &= 0xFF;
		@Pc(52) int local52 = this.aByteArray158[arg4 + local22] & 0x3;
		@Pc(56) int local56 = Class78.anIntArray213[local26];
		@Pc(77) int local77;
		if (local52 > 1) {
			local77 = local52 == 2 ? local26 - arg1 : -arg1 + -local26;
		} else {
			local77 = local52 == 0 ? arg1 + local26 : arg1 - local26;
		}
		local52 = this.aByteArray158[local18 + arg4] & 0x3;
		@Pc(121) int local121;
		if (local52 > 1) {
			local121 = local52 == 2 ? local35 - arg1 : -local35 + -arg1;
		} else {
			local121 = local52 == 0 ? local35 + arg1 : arg1 - local35;
		}
		@Pc(147) int local147 = (local56 * (local121 - local77) >> 12) + local77;
		local52 = this.aByteArray158[local22 + arg2] & 0x3;
		if (local52 <= 1) {
			local77 = local52 == 0 ? local26 + local39 : local39 - local26;
		} else {
			local77 = local52 == 2 ? local26 - local39 : -local39 + -local26;
		}
		local52 = this.aByteArray158[local18 + arg2] & 0x3;
		if (local52 > 1) {
			local121 = local52 == 2 ? local35 - local39 : -local35 + -local39;
		} else {
			local121 = local52 == 0 ? local35 + local39 : local39 + -local35;
		}
		@Pc(244) int local244 = local77 + (local56 * (local121 - local77) >> 12);
		return ((local244 - local147) * arg5 >> 12) + local147;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(Z)V")
	private void method4606() {
		@Pc(24) int local24;
		if (this.anInt5161 > 0) {
			this.aShortArray103 = new short[this.anInt5148];
			this.aShortArray104 = new short[this.anInt5148];
			for (local24 = 0; local24 < this.anInt5148; local24++) {
				this.aShortArray104[local24] = (short) (Math.pow((double) ((float) this.anInt5161 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray103[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray104 != null && this.aShortArray104.length == this.anInt5148) {
			this.aShortArray103 = new short[this.anInt5148];
			for (local24 = 0; local24 < this.anInt5148; local24++) {
				this.aShortArray103[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II[I)V")
	public void method4608(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(16) int local16 = Static213.anIntArray381[arg0] * this.anInt5154;
		@Pc(112) int local112;
		@Pc(126) int local126;
		@Pc(42) int local42;
		@Pc(25) short local25;
		@Pc(103) int local103;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(49) int local49;
		@Pc(92) int local92;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(88) int local88;
		@Pc(101) int local101;
		if (this.anInt5148 == 1) {
			local42 = this.aShortArray103[0] << 12;
			local25 = this.aShortArray104[0];
			local55 = local16 * local42 >> 12;
			local62 = local42 * this.anInt5153 >> 12;
			local49 = this.anInt5154 * local42 >> 12;
			local66 = local55 >> 12;
			local70 = local66 + 1;
			if (local49 <= local70) {
				local70 = 0;
			}
			local55 &= 0xFFF;
			local92 = Class78.anIntArray213[local55];
			local88 = this.aByteArray158[local66 & 0xFF] & 0xFF;
			local101 = this.aByteArray158[local70 & 0xFF] & 0xFF;
			if (this.aBoolean346) {
				for (local103 = 0; local103 < Static294.anInt5657; local103++) {
					local112 = Static346.anIntArray638[local103] * this.anInt5153;
					local126 = this.method4605(local112 * local42 >> 12, local55, local101, local62, local88, local92);
					local126 = local126 * local25 >> 12;
					arg1[local103] = (local126 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static294.anInt5657; local103++) {
					local112 = this.anInt5153 * Static346.anIntArray638[local103];
					local126 = this.method4605(local42 * local112 >> 12, local55, local101, local62, local88, local92);
					arg1[local103] = local25 * local126 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray104[0];
		if (local25 > 8 || local25 < -8) {
			local42 = this.aShortArray103[0] << 12;
			local49 = local42 * this.anInt5154 >> 12;
			local55 = local16 * local42 >> 12;
			local62 = local42 * this.anInt5153 >> 12;
			local66 = local55 >> 12;
			local70 = local66 + 1;
			if (local70 >= local49) {
				local70 = 0;
			}
			local55 &= 0xFFF;
			local88 = this.aByteArray158[local66 & 0xFF] & 0xFF;
			local92 = Class78.anIntArray213[local55];
			local101 = this.aByteArray158[local70 & 0xFF] & 0xFF;
			for (local103 = 0; local103 < Static294.anInt5657; local103++) {
				local112 = Static346.anIntArray638[local103] * this.anInt5153;
				local126 = this.method4605(local112 * local42 >> 12, local55, local101, local62, local88, local92);
				arg1[local103] = local126 * local25 >> 12;
			}
		}
		for (@Pc(140) int local140 = 1; local140 < this.anInt5148; local140++) {
			local25 = this.aShortArray104[local140];
			if (local25 > 8 || local25 < -8) {
				local42 = this.aShortArray103[local140] << 12;
				local55 = local16 * local42 >> 12;
				local49 = this.anInt5154 * local42 >> 12;
				local62 = local42 * this.anInt5153 >> 12;
				local66 = local55 >> 12;
				local70 = local66 + 1;
				local55 &= 0xFFF;
				if (local49 <= local70) {
					local70 = 0;
				}
				local88 = this.aByteArray158[local66 & 0xFF] & 0xFF;
				local92 = Class78.anIntArray213[local55];
				local101 = this.aByteArray158[local70 & 0xFF] & 0xFF;
				if (this.aBoolean346 && this.anInt5148 - 1 == local140) {
					for (local103 = 0; local103 < Static294.anInt5657; local103++) {
						local112 = this.anInt5153 * Static346.anIntArray638[local103];
						local126 = this.method4605(local112 * local42 >> 12, local55, local101, local62, local88, local92);
						local126 = arg1[local103] + (local126 * local25 >> 12);
						arg1[local103] = (local126 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static294.anInt5657; local103++) {
						local112 = this.anInt5153 * Static346.anIntArray638[local103];
						local126 = this.method4605(local42 * local112 >> 12, local55, local101, local62, local88, local92);
						arg1[local103] += local126 * local25 >> 12;
					}
				}
			}
		}
	}
}
