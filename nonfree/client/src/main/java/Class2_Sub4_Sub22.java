import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class2_Sub4_Sub22 extends Class2_Sub4 {

	@OriginalMember(owner = "client!nr", name = "lb", descriptor = "I")
	public static int lb = -1;

	@OriginalMember(owner = "client!nr", name = "T", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!nr", name = "Y", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
	public int anInt4216 = 1638;

	@OriginalMember(owner = "client!nr", name = "P", descriptor = "[B")
	private byte[] aByteArray73 = new byte[512];

	@OriginalMember(owner = "client!nr", name = "W", descriptor = "I")
	public int anInt4220 = 4;

	@OriginalMember(owner = "client!nr", name = "X", descriptor = "I")
	public int anInt4221 = 4;

	@OriginalMember(owner = "client!nr", name = "eb", descriptor = "I")
	public int anInt4226 = 4;

	@OriginalMember(owner = "client!nr", name = "ab", descriptor = "Z")
	public boolean aBoolean327 = true;

	@OriginalMember(owner = "client!nr", name = "fb", descriptor = "I")
	public int anInt4227 = 0;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIZIIII)I")
	private int method3835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 >> 12;
		@Pc(11) int local11 = local7 + 1;
		@Pc(15) int local15 = arg5 & 0xFFF;
		if (local11 >= arg4) {
			local11 = 0;
		}
		local7 &= 0xFF;
		@Pc(32) int local32 = arg1 - 4096;
		local11 &= 0xFF;
		@Pc(40) int local40 = local15 - 4096;
		@Pc(44) int local44 = Class142.anIntArray703[local15];
		@Pc(53) int local53 = this.aByteArray73[arg3 + local7] & 0x3;
		@Pc(72) int local72;
		if (local53 <= 1) {
			local72 = local53 == 0 ? local15 + arg1 : arg1 + -local15;
		} else {
			local72 = local53 == 2 ? local15 - arg1 : -arg1 + -local15;
		}
		local53 = this.aByteArray73[arg3 + local11] & 0x3;
		@Pc(118) int local118;
		if (local53 > 1) {
			local118 = local53 == 2 ? local40 - arg1 : -arg1 + -local40;
		} else {
			local118 = local53 == 0 ? local40 + arg1 : -local40 + arg1;
		}
		@Pc(145) int local145 = (local44 * (local118 - local72) >> 12) + local72;
		local53 = this.aByteArray73[local7 + arg2] & 0x3;
		if (local53 <= 1) {
			local72 = local53 == 0 ? local15 + local32 : -local15 + local32;
		} else {
			local72 = local53 == 2 ? local15 - local32 : -local15 - local32;
		}
		local53 = this.aByteArray73[local11 + arg2] & 0x3;
		if (local53 <= 1) {
			local118 = local53 == 0 ? local40 + local32 : -local40 + local32;
		} else {
			local118 = local53 == 2 ? local40 - local32 : -local40 + -local32;
		}
		@Pc(239) int local239 = ((local118 - local72) * local44 >> 12) + local72;
		return ((local239 - local145) * arg0 >> 12) + local145;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			this.method3836(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([III)V")
	public void method3836(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt4221 * Static347.anIntArray1193[arg1];
		@Pc(105) int local105;
		@Pc(119) int local119;
		@Pc(36) int local36;
		@Pc(23) short local23;
		@Pc(97) int local97;
		@Pc(42) int local42;
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(77) int local77;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(86) int local86;
		@Pc(95) int local95;
		if (this.anInt4220 == 1) {
			local36 = this.aShortArray75[0] << 12;
			local23 = this.aShortArray74[0];
			local56 = this.anInt4221 * local36 >> 12;
			local49 = this.anInt4226 * local36 >> 12;
			local42 = local14 * local36 >> 12;
			local60 = local42 >> 12;
			local64 = local60 + 1;
			if (local64 >= local56) {
				local64 = 0;
			}
			local42 &= 0xFFF;
			local95 = this.aByteArray73[local64 & 0xFF] & 0xFF;
			local77 = Class142.anIntArray703[local42];
			local86 = this.aByteArray73[local60 & 0xFF] & 0xFF;
			if (this.aBoolean327) {
				for (local97 = 0; local97 < Static76.anInt1458; local97++) {
					local105 = Static40.anIntArray173[local97] * this.anInt4226;
					local119 = this.method3835(local77, local42, local95, local86, local49, local105 * local36 >> 12);
					@Pc(463) int local463 = local119 * local23 >> 12;
					arg0[local97] = (local463 >> 1) + 2048;
				}
			} else {
				for (local97 = 0; local97 < Static76.anInt1458; local97++) {
					local105 = this.anInt4226 * Static40.anIntArray173[local97];
					local119 = this.method3835(local77, local42, local95, local86, local49, local105 * local36 >> 12);
					arg0[local97] = local23 * local119 >> 12;
				}
			}
			return;
		}
		local23 = this.aShortArray74[0];
		if (local23 > 8 || local23 < -8) {
			local36 = this.aShortArray75[0] << 12;
			local42 = local36 * local14 >> 12;
			local49 = local36 * this.anInt4226 >> 12;
			local56 = local36 * this.anInt4221 >> 12;
			local60 = local42 >> 12;
			local64 = local60 + 1;
			if (local56 <= local64) {
				local64 = 0;
			}
			local42 &= 0xFFF;
			local77 = Class142.anIntArray703[local42];
			local86 = this.aByteArray73[local60 & 0xFF] & 0xFF;
			local95 = this.aByteArray73[local64 & 0xFF] & 0xFF;
			for (local97 = 0; local97 < Static76.anInt1458; local97++) {
				local105 = this.anInt4226 * Static40.anIntArray173[local97];
				local119 = this.method3835(local77, local42, local95, local86, local49, local105 * local36 >> 12);
				arg0[local97] = local119 * local23 >> 12;
			}
		}
		for (@Pc(133) int local133 = 1; local133 < this.anInt4220; local133++) {
			local23 = this.aShortArray74[local133];
			if (local23 > 8 || local23 < -8) {
				local36 = this.aShortArray75[local133] << 12;
				local42 = local14 * local36 >> 12;
				local56 = local36 * this.anInt4221 >> 12;
				local49 = this.anInt4226 * local36 >> 12;
				local60 = local42 >> 12;
				local64 = local60 + 1;
				local42 &= 0xFFF;
				if (local64 >= local56) {
					local64 = 0;
				}
				local86 = this.aByteArray73[local60 & 0xFF] & 0xFF;
				local95 = this.aByteArray73[local64 & 0xFF] & 0xFF;
				local77 = Class142.anIntArray703[local42];
				if (this.aBoolean327 && this.anInt4220 - 1 == local133) {
					for (local97 = 0; local97 < Static76.anInt1458; local97++) {
						local105 = Static40.anIntArray173[local97] * this.anInt4226;
						local119 = this.method3835(local77, local42, local95, local86, local49, local36 * local105 >> 12);
						local119 = arg0[local97] + (local119 * local23 >> 12);
						arg0[local97] = (local119 >> 1) + 2048;
					}
				} else {
					for (local97 = 0; local97 < Static76.anInt1458; local97++) {
						local105 = Static40.anIntArray173[local97] * this.anInt4226;
						local119 = this.method3835(local77, local42, local95, local86, local49, local36 * local105 >> 12);
						arg0[local97] += local119 * local23 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V")
	private void method3839() {
		@Pc(14) int local14;
		if (this.anInt4216 > 0) {
			this.aShortArray75 = new short[this.anInt4220];
			this.aShortArray74 = new short[this.anInt4220];
			for (local14 = 0; local14 < this.anInt4220; local14++) {
				this.aShortArray74[local14] = (short) (Math.pow((double) ((float) this.anInt4216 / 4096.0F), (double) local14) * 4096.0D);
				this.aShortArray75[local14] = (short) Math.pow(2.0D, (double) local14);
			}
		} else if (this.aShortArray74 != null && this.aShortArray74.length == this.anInt4220) {
			this.aShortArray75 = new short[this.anInt4220];
			for (local14 = 0; local14 < this.anInt4220; local14++) {
				this.aShortArray75[local14] = (short) Math.pow(2.0D, (double) local14);
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		this.aByteArray73 = Static309.method4528(this.anInt4227);
		this.method3839();
		for (@Pc(17) int local17 = this.anInt4220 - 1; local17 >= 1; local17--) {
			@Pc(23) short local23 = this.aShortArray74[local17];
			if (local23 > 8 || local23 < -8) {
				break;
			}
			this.anInt4220--;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean327 = arg0.method5350() == 1;
		} else if (arg1 == 1) {
			this.anInt4220 = arg0.method5350();
		} else if (arg1 == 2) {
			this.anInt4216 = arg0.method5341();
			if (this.anInt4216 < 0) {
				this.aShortArray74 = new short[this.anInt4220];
				for (@Pc(66) int local66 = 0; local66 < this.anInt4220; local66++) {
					this.aShortArray74[local66] = (short) arg0.method5341();
				}
			}
		} else if (arg1 == 3) {
			this.anInt4226 = this.anInt4221 = arg0.method5350();
		} else if (arg1 == 4) {
			this.anInt4227 = arg0.method5350();
		} else if (arg1 == 5) {
			this.anInt4226 = arg0.method5350();
		} else if (arg1 == 6) {
			this.anInt4221 = arg0.method5350();
		}
	}
}
