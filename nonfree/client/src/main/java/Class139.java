import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class139 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[Z")
	public boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public int anInt3940;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "Lclient!m;")
	public Class151 aClass151_3;

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "[I")
	public int[] anIntArray345;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public int anInt3938 = 99;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Z")
	public boolean aBoolean242 = false;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	public int anInt3937 = 2;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
	public int anInt3947 = -1;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
	public int anInt3943 = -1;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	public int anInt3953 = 5;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	public int anInt3952 = -1;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
	public int anInt3945 = -1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public int anInt3932 = -1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public void method3125() {
		if (this.anInt3932 == -1) {
			if (this.aBooleanArray20 == null) {
				this.anInt3932 = 0;
			} else {
				this.anInt3932 = 2;
			}
		}
		if (this.anInt3952 != -1) {
			return;
		}
		if (this.aBooleanArray20 == null) {
			this.anInt3952 = 0;
		} else {
			this.anInt3952 = 2;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIILclient!t;)Lclient!t;")
	public Class163 method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class163 arg4) {
		@Pc(8) int local8 = this.anIntArray345[arg0];
		@Pc(18) int local18 = this.anIntArray344[arg0];
		@Pc(26) Class7_Sub4_Sub18 local26 = this.aClass151_3.method3289(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return arg4.method4654((byte) 1, arg3, true);
		}
		@Pc(40) Class7_Sub4_Sub18 local40 = null;
		if ((this.aBoolean245 || Static262.aBoolean495) && arg1 != -1 && this.anIntArray344.length > arg1) {
			@Pc(59) int local59 = this.anIntArray344[arg1];
			local40 = this.aClass151_3.method3289(local59 >> 16);
			arg1 = local59 & 0xFFFF;
		}
		@Pc(73) Class7_Sub4_Sub18 local73 = null;
		@Pc(75) Class7_Sub4_Sub18 local75 = null;
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		if (this.anIntArray343 != null) {
			if (this.anIntArray343.length > arg0) {
				local77 = this.anIntArray343[arg0];
				if (local77 != 65535) {
					local73 = this.aClass151_3.method3289(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
			if ((this.aBoolean245 || Static262.aBoolean495) && arg1 != -1 && arg1 < this.anIntArray343.length) {
				local79 = this.anIntArray343[arg1];
				if (local79 != 65535) {
					local75 = this.aClass151_3.method3289(local79 >> 16);
					local79 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean243) {
			arg3 |= 0x200;
		}
		if (local26.method5663(local30)) {
			arg3 |= 0x80;
		}
		if (local26.method5666(local30)) {
			arg3 |= 0x100;
		}
		if (local26.method5665(local30)) {
			arg3 |= 0x400;
		}
		if (local73 != null) {
			if (local73.method5663(local77)) {
				arg3 |= 0x80;
			}
			if (local73.method5666(local77)) {
				arg3 |= 0x100;
			}
			if (local73.method5665(local77)) {
				arg3 |= 0x400;
			}
		}
		if (local40 != null) {
			if (local40.method5663(arg1)) {
				arg3 |= 0x80;
			}
			if (local40.method5666(arg1)) {
				arg3 |= 0x100;
			}
			if (local40.method5665(arg1)) {
				arg3 |= 0x400;
			}
		}
		if (local75 != null) {
			if (local75.method5663(local79)) {
				arg3 |= 0x80;
			}
			if (local75.method5666(local79)) {
				arg3 |= 0x100;
			}
			if (local75.method5665(local79)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(277) Class163 local277 = arg4.method4654((byte) 1, arg3, true);
		local277.method4660(this.aBoolean243, local26, 0, local40, arg2 - 1, local30, arg1, local8);
		if (local73 != null) {
			local277.method4660(this.aBoolean243, local73, 0, local75, arg2 - 1, local77, local79, local8);
		}
		return local277;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method3128(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub14 arg1) {
		@Pc(82) int local82;
		@Pc(88) int local88;
		@Pc(94) int local94;
		@Pc(115) int local115;
		if (arg0 == 1) {
			local82 = arg1.method3943();
			this.anIntArray345 = new int[local82];
			for (local88 = 0; local88 < local82; local88++) {
				this.anIntArray345[local88] = arg1.method3943();
			}
			this.anIntArray344 = new int[local82];
			for (local94 = 0; local94 < local82; local94++) {
				this.anIntArray344[local94] = arg1.method3943();
			}
			for (local115 = 0; local115 < local82; local115++) {
				this.anIntArray344[local115] += arg1.method3943() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3945 = arg1.method3943();
		} else if (arg0 == 3) {
			this.aBooleanArray20 = new boolean[256];
			local82 = arg1.method3981();
			for (local88 = 0; local88 < local82; local88++) {
				this.aBooleanArray20[arg1.method3981()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean241 = true;
		} else if (arg0 == 5) {
			this.anInt3953 = arg1.method3981();
		} else if (arg0 == 6) {
			this.anInt3947 = arg1.method3943();
		} else if (arg0 == 7) {
			this.anInt3943 = arg1.method3943();
		} else if (arg0 == 8) {
			this.anInt3938 = arg1.method3981();
		} else if (arg0 == 9) {
			this.anInt3952 = arg1.method3981();
		} else if (arg0 == 10) {
			this.anInt3932 = arg1.method3981();
		} else if (arg0 == 11) {
			this.anInt3937 = arg1.method3981();
		} else if (arg0 == 12) {
			local82 = arg1.method3981();
			this.anIntArray343 = new int[local82];
			for (local88 = 0; local88 < local82; local88++) {
				this.anIntArray343[local88] = arg1.method3943();
			}
			for (local94 = 0; local94 < local82; local94++) {
				this.anIntArray343[local94] = (arg1.method3943() << 16) + this.anIntArray343[local94];
			}
		} else if (arg0 == 13) {
			local82 = arg1.method3943();
			this.anIntArrayArray30 = new int[local82][];
			for (local88 = 0; local88 < local82; local88++) {
				local94 = arg1.method3981();
				if (local94 > 0) {
					this.anIntArrayArray30[local88] = new int[local94];
					this.anIntArrayArray30[local88][0] = arg1.method3975();
					for (local115 = 1; local115 < local94; local115++) {
						this.anIntArrayArray30[local88][local115] = arg1.method3943();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean243 = true;
		} else if (arg0 == 15) {
			this.aBoolean245 = true;
		} else if (arg0 == 16) {
			this.aBoolean242 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZ)I")
	public int method3129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray344[arg0];
		@Pc(14) Class7_Sub4_Sub18 local14 = null;
		@Pc(22) Class7_Sub4_Sub18 local22 = this.aClass151_3.method3289(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean245 || Static262.aBoolean495) && arg1 != -1 && arg1 < this.anIntArray344.length) {
			local7 = this.anIntArray344[arg1];
			local14 = this.aClass151_3.method3289(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean243) {
			local5 = 512;
		}
		if (local22.method5663(local26)) {
			local5 |= 0x80;
		}
		if (local22.method5666(local26)) {
			local5 |= 0x100;
		}
		if (local22.method5665(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method5663(local7)) {
				local5 |= 0x80;
			}
			if (local14.method5666(local7)) {
				local5 |= 0x100;
			}
			if (local14.method5665(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray343 != null && arg2) {
			@Pc(149) int local149;
			@Pc(164) Class7_Sub4_Sub18 local164;
			if (arg0 < this.anIntArray343.length) {
				local149 = this.anIntArray343[arg0];
				if (local149 != 65535) {
					local164 = this.aClass151_3.method3289(local149 >> 16);
					local149 &= 0xFFFF;
					if (local164 != null) {
						if (local164.method5663(local149)) {
							local5 |= 0x80;
						}
						if (local164.method5666(local149)) {
							local5 |= 0x100;
						}
						if (local164.method5665(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean245 || Static262.aBoolean495) && arg1 != -1 && arg1 < this.anIntArray343.length) {
				local149 = this.anIntArray343[arg1];
				if (local149 != 65535) {
					local164 = this.aClass151_3.method3289(local149 >> 16);
					local149 &= 0xFFFF;
					if (local164 != null) {
						if (local164.method5663(local149)) {
							local5 |= 0x80;
						}
						if (local164.method5666(local149)) {
							local5 |= 0x100;
						}
						if (local164.method5665(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBIIILclient!t;I)Lclient!t;")
	public Class163 method3133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray345[arg3];
		@Pc(13) int local13 = this.anIntArray344[arg3];
		@Pc(21) Class7_Sub4_Sub18 local21 = this.aClass151_3.method3289(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg5.method4654(arg2, arg0, true);
		}
		@Pc(35) Class7_Sub4_Sub18 local35 = null;
		if ((this.aBoolean245 || Static262.aBoolean495) && arg6 != -1 && arg6 < this.anIntArray344.length) {
			@Pc(53) int local53 = this.anIntArray344[arg6];
			local35 = this.aClass151_3.method3289(local53 >> 16);
			arg6 = local53 & 0xFFFF;
		}
		if (this.aBoolean243) {
			arg0 |= 0x200;
		}
		if (local21.method5663(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method5666(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method5665(local25)) {
			arg0 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method5663(arg6)) {
				arg0 |= 0x80;
			}
			if (local35.method5666(arg6)) {
				arg0 |= 0x100;
			}
			if (local35.method5665(arg6)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(142) Class163 local142 = arg5.method4654(arg2, arg0, true);
		local142.method4660(this.aBoolean243, local21, arg1, local35, arg4 - 1, local25, arg6, local8);
		return local142;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!gk;)V")
	public void method3134(@OriginalArg(1) Class7_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3981();
			if (local13 == 0) {
				return;
			}
			this.method3128(local13, arg0);
		}
	}
}
