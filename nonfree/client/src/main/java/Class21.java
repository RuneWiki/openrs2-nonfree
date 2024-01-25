import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class21 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "[I")
	public int[] anIntArray18;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
	public int anInt358;

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "[Z")
	public boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "Lclient!wg;")
	public Class373 aClass373_1;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public int anInt348 = -1;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "Z")
	public boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
	public int anInt346 = -1;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	public int anInt347 = -1;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
	public int anInt355 = 5;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "Z")
	public boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
	public int anInt357 = 99;

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
	public int anInt361 = -1;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
	public int anInt351 = 2;

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "Z")
	public boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "I")
	public int anInt360 = -1;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILclient!rg;)V")
	private void method346(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		@Pc(74) int local74;
		@Pc(80) int local80;
		@Pc(99) int local99;
		@Pc(159) int local159;
		if (arg0 == 1) {
			local74 = arg1.method8571();
			this.anIntArray17 = new int[local74];
			for (local80 = 0; local80 < local74; local80++) {
				this.anIntArray17[local80] = arg1.method8571();
			}
			this.anIntArray15 = new int[local74];
			for (local99 = 0; local99 < local74; local99++) {
				this.anIntArray15[local99] = arg1.method8571();
			}
			for (local159 = 0; local159 < local74; local159++) {
				this.anIntArray15[local159] = (arg1.method8571() << 16) + this.anIntArray15[local159];
			}
		} else if (arg0 == 2) {
			this.anInt346 = arg1.method8571();
		} else if (arg0 == 3) {
			this.aBooleanArray4 = new boolean[256];
			local74 = arg1.method8604();
			for (local80 = 0; local80 < local74; local80++) {
				this.aBooleanArray4[arg1.method8604()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt355 = arg1.method8604();
		} else if (arg0 == 6) {
			this.anInt360 = arg1.method8571();
		} else if (arg0 == 7) {
			this.anInt348 = arg1.method8571();
		} else if (arg0 == 8) {
			this.anInt357 = arg1.method8604();
		} else if (arg0 == 9) {
			this.anInt347 = arg1.method8604();
		} else if (arg0 == 10) {
			this.anInt361 = arg1.method8604();
		} else if (arg0 == 11) {
			this.anInt351 = arg1.method8604();
		} else if (arg0 == 12) {
			local74 = arg1.method8604();
			this.anIntArray20 = new int[local74];
			for (local80 = 0; local80 < local74; local80++) {
				this.anIntArray20[local80] = arg1.method8571();
			}
			for (local99 = 0; local99 < local74; local99++) {
				this.anIntArray20[local99] += arg1.method8571() << 16;
			}
		} else if (arg0 == 13) {
			local74 = arg1.method8571();
			this.anIntArrayArray2 = new int[local74][];
			for (local80 = 0; local80 < local74; local80++) {
				local99 = arg1.method8604();
				if (local99 > 0) {
					this.anIntArrayArray2[local80] = new int[local99];
					this.anIntArrayArray2[local80][0] = arg1.method8606();
					for (local159 = 1; local159 < local99; local159++) {
						this.anIntArrayArray2[local80][local159] = arg1.method8571();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean12 = true;
		} else if (arg0 == 15) {
			this.aBoolean13 = true;
		} else if (arg0 == 16) {
			this.aBoolean10 = true;
		} else if (arg0 == 18) {
			this.aBoolean11 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray21 == null) {
				this.anIntArray21 = new int[this.anIntArrayArray2.length];
				for (local74 = 0; local74 < this.anIntArrayArray2.length; local74++) {
					this.anIntArray21[local74] = 255;
				}
			}
			this.anIntArray21[arg1.method8604()] = arg1.method8604();
		} else if (arg0 == 20) {
			if (this.anIntArray18 == null || this.anIntArray19 == null) {
				this.anIntArray18 = new int[this.anIntArrayArray2.length];
				this.anIntArray19 = new int[this.anIntArrayArray2.length];
				for (local74 = 0; local74 < this.anIntArrayArray2.length; local74++) {
					this.anIntArray18[local74] = 256;
					this.anIntArray19[local74] = 256;
				}
			}
			local74 = arg1.method8604();
			this.anIntArray18[local74] = arg1.method8571();
			this.anIntArray19[local74] = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!rg;)V")
	public void method347(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8604();
			if (local9 == 0) {
				return;
			}
			this.method346(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
	public void method348() {
		if (this.anInt347 == -1) {
			if (this.aBooleanArray4 == null) {
				this.anInt347 = 0;
			} else {
				this.anInt347 = 2;
			}
		}
		if (this.anInt361 != -1) {
			return;
		}
		if (this.aBooleanArray4 == null) {
			this.anInt361 = 0;
		} else {
			this.anInt361 = 2;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ka;IIIBI)Lclient!ka;")
	public Class24 method349(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray17[arg4];
		@Pc(13) int local13 = this.anIntArray15[arg4];
		@Pc(21) Class6_Sub2_Sub1 local21 = this.aClass373_1.method8741(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method6850((byte) 1, arg3, true);
		}
		@Pc(35) Class6_Sub2_Sub1 local35 = null;
		if ((this.aBoolean13 || Static43.aBoolean46) && arg2 != -1 && arg2 < this.anIntArray15.length) {
			@Pc(57) int local57 = this.anIntArray15[arg2];
			local35 = this.aClass373_1.method8741(local57 >> 16);
			arg2 = local57 & 0xFFFF;
		}
		@Pc(71) Class6_Sub2_Sub1 local71 = null;
		@Pc(73) Class6_Sub2_Sub1 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray20 != null) {
			if (this.anIntArray20.length > arg4) {
				local75 = this.anIntArray20[arg4];
				if (local75 != 65535) {
					local71 = this.aClass373_1.method8741(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean13 || Static43.aBoolean46) && arg2 != -1 && arg2 < this.anIntArray20.length) {
				local77 = this.anIntArray20[arg2];
				if (local77 != 65535) {
					local73 = this.aClass373_1.method8741(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean12) {
			arg3 |= 0x200;
		}
		if (local21.method192(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method190(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method191(local25)) {
			arg3 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method192(local75)) {
				arg3 |= 0x80;
			}
			if (local71.method190(local75)) {
				arg3 |= 0x100;
			}
			if (local71.method191(local75)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method192(arg2)) {
				arg3 |= 0x80;
			}
			if (local35.method190(arg2)) {
				arg3 |= 0x100;
			}
			if (local35.method191(arg2)) {
				arg3 |= 0x400;
			}
		}
		if (local73 != null) {
			if (local73.method192(local77)) {
				arg3 |= 0x80;
			}
			if (local73.method190(local77)) {
				arg3 |= 0x100;
			}
			if (local73.method191(local77)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(282) Class24 local282 = arg0.method6850((byte) 1, arg3, true);
		local282.method6857(arg2, local35, local25, local8, local21, this.aBoolean12, arg1 - 1, 0);
		if (local71 != null) {
			local282.method6857(local77, local73, local75, local8, local71, this.aBoolean12, arg1 - 1, 0);
		}
		return local282;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBIIILclient!ka;II)Lclient!ka;")
	public Class24 method350(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class24 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray17[arg5];
		@Pc(13) int local13 = this.anIntArray15[arg5];
		@Pc(21) Class6_Sub2_Sub1 local21 = this.aClass373_1.method8741(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method6850(arg1, arg3, true);
		}
		@Pc(35) Class6_Sub2_Sub1 local35 = null;
		if ((this.aBoolean13 || Static43.aBoolean46) && arg0 != -1 && arg0 < this.anIntArray15.length) {
			@Pc(53) int local53 = this.anIntArray15[arg0];
			local35 = this.aClass373_1.method8741(local53 >> 16);
			arg0 = local53 & 0xFFFF;
		}
		if (this.aBoolean12) {
			arg3 |= 0x200;
		}
		if (local21.method192(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method190(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method191(local25)) {
			arg3 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method192(arg0)) {
				arg3 |= 0x80;
			}
			if (local35.method190(arg0)) {
				arg3 |= 0x100;
			}
			if (local35.method191(arg0)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(142) Class24 local142 = arg4.method6850(arg1, arg3, true);
		local142.method6857(arg0, local35, local25, local8, local21, this.aBoolean12, arg2 - 1, arg6);
		return local142;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZI)I")
	public int method352(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray15[arg0];
		@Pc(14) Class6_Sub2_Sub1 local14 = null;
		@Pc(22) Class6_Sub2_Sub1 local22 = this.aClass373_1.method8741(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean13 || Static43.aBoolean46) && arg2 != -1 && this.anIntArray15.length > arg2) {
			local7 = this.anIntArray15[arg2];
			local14 = this.aClass373_1.method8741(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean12) {
			local5 = 512;
		}
		if (local22.method192(local26)) {
			local5 |= 0x80;
		}
		if (local22.method190(local26)) {
			local5 |= 0x100;
		}
		if (local22.method191(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method192(local7)) {
				local5 |= 0x80;
			}
			if (local14.method190(local7)) {
				local5 |= 0x100;
			}
			if (local14.method191(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray20 != null && arg1) {
			@Pc(148) int local148;
			@Pc(159) Class6_Sub2_Sub1 local159;
			if (this.anIntArray20.length > arg0) {
				local148 = this.anIntArray20[arg0];
				if (local148 != 65535) {
					local159 = this.aClass373_1.method8741(local148 >> 16);
					local148 &= 0xFFFF;
					if (local159 != null) {
						if (local159.method192(local148)) {
							local5 |= 0x80;
						}
						if (local159.method190(local148)) {
							local5 |= 0x100;
						}
						if (local159.method191(local148)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean13 || Static43.aBoolean46) && arg2 != -1 && this.anIntArray20.length > arg2) {
				local148 = this.anIntArray20[arg2];
				if (local148 != 65535) {
					local159 = this.aClass373_1.method8741(local148 >> 16);
					local148 &= 0xFFFF;
					if (local159 != null) {
						if (local159.method192(local148)) {
							local5 |= 0x80;
						}
						if (local159.method190(local148)) {
							local5 |= 0x100;
						}
						if (local159.method191(local148)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
