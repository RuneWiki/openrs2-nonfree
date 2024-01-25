import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class239 {

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "[Z")
	public boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "Lclient!ll;")
	public Class213 aClass213_2;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
	public int anInt6410;

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!mu", name = "x", descriptor = "[I")
	public int[] anIntArray336;

	@OriginalMember(owner = "client!mu", name = "z", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!mu", name = "G", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!mu", name = "I", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!mu", name = "J", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
	public int anInt6405 = -1;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "Z")
	public boolean aBoolean447 = false;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "Z")
	public boolean aBoolean446 = false;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "Z")
	public boolean aBoolean448 = false;

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	public int anInt6408 = 99;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "Z")
	public boolean aBoolean445 = false;

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
	public int anInt6412 = -1;

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
	public int anInt6416 = 2;

	@OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
	public int anInt6418 = -1;

	@OriginalMember(owner = "client!mu", name = "H", descriptor = "I")
	public int anInt6419 = -1;

	@OriginalMember(owner = "client!mu", name = "y", descriptor = "I")
	public int anInt6414 = -1;

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
	public int anInt6404 = 5;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!ka;IBIBII)Lclient!ka;")
	public Class149 method5380(@OriginalArg(0) int arg0, @OriginalArg(1) Class149 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray337[arg0];
		@Pc(13) int local13 = this.anIntArray339[arg0];
		@Pc(21) Class3_Sub5_Sub3 local21 = this.aClass213_2.method5001(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method8858(arg4, arg3, true);
		}
		@Pc(35) Class3_Sub5_Sub3 local35 = null;
		if ((this.aBoolean446 || Static378.aBoolean643) && arg5 != -1 && this.anIntArray339.length > arg5) {
			@Pc(58) int local58 = this.anIntArray339[arg5];
			local35 = this.aClass213_2.method5001(local58 >> 16);
			arg5 = local58 & 0xFFFF;
		}
		if (this.aBoolean447) {
			arg3 |= 0x200;
		}
		if (local21.method769(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method773(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method770(local25)) {
			arg3 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method769(arg5)) {
				arg3 |= 0x80;
			}
			if (local35.method773(arg5)) {
				arg3 |= 0x100;
			}
			if (local35.method770(arg5)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(143) Class149 local143 = arg1.method8858(arg4, arg3, true);
		local143.method8856(arg6, local25, local8, arg5, local35, this.aBoolean447, arg2 - 1, local21);
		return local143;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!dt;I)V")
	private void method5381(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(123) int local123;
		@Pc(145) int local145;
		if (arg1 == 1) {
			local32 = arg0.method7951();
			this.anIntArray337 = new int[local32];
			for (local34 = 0; local34 < local32; local34++) {
				this.anIntArray337[local34] = arg0.method7951();
			}
			this.anIntArray339 = new int[local32];
			for (local123 = 0; local123 < local32; local123++) {
				this.anIntArray339[local123] = arg0.method7951();
			}
			for (local145 = 0; local145 < local32; local145++) {
				this.anIntArray339[local145] += arg0.method7951() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt6414 = arg0.method7951();
		} else if (arg1 == 3) {
			this.aBooleanArray23 = new boolean[256];
			local32 = arg0.method7954();
			for (local34 = 0; local34 < local32; local34++) {
				this.aBooleanArray23[arg0.method7954()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt6404 = arg0.method7954();
		} else if (arg1 == 6) {
			this.anInt6405 = arg0.method7951();
		} else if (arg1 == 7) {
			this.anInt6419 = arg0.method7951();
		} else if (arg1 == 8) {
			this.anInt6408 = arg0.method7954();
		} else if (arg1 == 9) {
			this.anInt6412 = arg0.method7954();
		} else if (arg1 == 10) {
			this.anInt6418 = arg0.method7954();
		} else if (arg1 == 11) {
			this.anInt6416 = arg0.method7954();
		} else if (arg1 == 12) {
			local32 = arg0.method7954();
			this.anIntArray340 = new int[local32];
			for (local34 = 0; local34 < local32; local34++) {
				this.anIntArray340[local34] = arg0.method7951();
			}
			for (local123 = 0; local123 < local32; local123++) {
				this.anIntArray340[local123] += arg0.method7951() << 16;
			}
		} else if (arg1 == 13) {
			local32 = arg0.method7951();
			this.anIntArrayArray40 = new int[local32][];
			for (local34 = 0; local34 < local32; local34++) {
				local123 = arg0.method7954();
				if (local123 > 0) {
					this.anIntArrayArray40[local34] = new int[local123];
					this.anIntArrayArray40[local34][0] = arg0.method7945();
					for (local145 = 1; local145 < local123; local145++) {
						this.anIntArrayArray40[local34][local145] = arg0.method7951();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean447 = true;
		} else if (arg1 == 15) {
			this.aBoolean446 = true;
		} else if (arg1 == 16) {
			this.aBoolean445 = true;
		} else if (arg1 == 18) {
			this.aBoolean448 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray335 == null) {
				this.anIntArray335 = new int[this.anIntArrayArray40.length];
				for (local32 = 0; local32 < this.anIntArrayArray40.length; local32++) {
					this.anIntArray335[local32] = 255;
				}
			}
			this.anIntArray335[arg0.method7954()] = arg0.method7954();
		} else if (arg1 == 20) {
			if (this.anIntArray336 == null || this.anIntArray338 == null) {
				this.anIntArray336 = new int[this.anIntArrayArray40.length];
				this.anIntArray338 = new int[this.anIntArrayArray40.length];
				for (local32 = 0; local32 < this.anIntArrayArray40.length; local32++) {
					this.anIntArray336[local32] = 256;
					this.anIntArray338[local32] = 256;
				}
			}
			local32 = arg0.method7954();
			this.anIntArray336[local32] = arg0.method7951();
			this.anIntArray338[local32] = arg0.method7951();
			return;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIILclient!ka;)Lclient!ka;")
	public Class149 method5382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class149 arg4) {
		@Pc(8) int local8 = this.anIntArray337[arg2];
		@Pc(13) int local13 = this.anIntArray339[arg2];
		@Pc(21) Class3_Sub5_Sub3 local21 = this.aClass213_2.method5001(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method8858((byte) 1, arg0, true);
		}
		@Pc(40) Class3_Sub5_Sub3 local40 = null;
		if ((this.aBoolean446 || Static378.aBoolean643) && arg3 != -1 && this.anIntArray339.length > arg3) {
			@Pc(63) int local63 = this.anIntArray339[arg3];
			local40 = this.aClass213_2.method5001(local63 >> 16);
			arg3 = local63 & 0xFFFF;
		}
		@Pc(77) Class3_Sub5_Sub3 local77 = null;
		@Pc(79) Class3_Sub5_Sub3 local79 = null;
		@Pc(81) int local81 = 0;
		@Pc(83) int local83 = 0;
		if (this.anIntArray340 != null) {
			if (arg2 < this.anIntArray340.length) {
				local81 = this.anIntArray340[arg2];
				if (local81 != 65535) {
					local77 = this.aClass213_2.method5001(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
			if ((this.aBoolean446 || Static378.aBoolean643) && arg3 != -1 && arg3 < this.anIntArray340.length) {
				local83 = this.anIntArray340[arg3];
				if (local83 != 65535) {
					local79 = this.aClass213_2.method5001(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean447) {
			arg0 |= 0x200;
		}
		if (local21.method769(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method773(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method770(local25)) {
			arg0 |= 0x400;
		}
		if (local77 != null) {
			if (local77.method769(local81)) {
				arg0 |= 0x80;
			}
			if (local77.method773(local81)) {
				arg0 |= 0x100;
			}
			if (local77.method770(local81)) {
				arg0 |= 0x400;
			}
		}
		if (local40 != null) {
			if (local40.method769(arg3)) {
				arg0 |= 0x80;
			}
			if (local40.method773(arg3)) {
				arg0 |= 0x100;
			}
			if (local40.method770(arg3)) {
				arg0 |= 0x400;
			}
		}
		if (local79 != null) {
			if (local79.method769(local83)) {
				arg0 |= 0x80;
			}
			if (local79.method773(local83)) {
				arg0 |= 0x100;
			}
			if (local79.method770(local83)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(288) Class149 local288 = arg4.method8858((byte) 1, arg0, true);
		local288.method8856(0, local25, local8, arg3, local40, this.aBoolean447, arg1 - 1, local21);
		if (local77 != null) {
			local288.method8856(0, local81, local8, local83, local79, this.aBoolean447, arg1 - 1, local77);
		}
		return local288;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZII)I")
	public int method5383(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray339[arg2];
		@Pc(14) Class3_Sub5_Sub3 local14 = null;
		@Pc(22) Class3_Sub5_Sub3 local22 = this.aClass213_2.method5001(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean446 || Static378.aBoolean643) && arg1 != -1 && arg1 < this.anIntArray339.length) {
			local7 = this.anIntArray339[arg1];
			local14 = this.aClass213_2.method5001(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean447) {
			local5 = 512;
		}
		if (local22.method769(local26)) {
			local5 |= 0x80;
		}
		if (local22.method773(local26)) {
			local5 |= 0x100;
		}
		if (local22.method770(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method769(local7)) {
				local5 |= 0x80;
			}
			if (local14.method773(local7)) {
				local5 |= 0x100;
			}
			if (local14.method770(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray340 != null && arg0) {
			@Pc(144) int local144;
			@Pc(157) Class3_Sub5_Sub3 local157;
			if (arg2 < this.anIntArray340.length) {
				local144 = this.anIntArray340[arg2];
				if (local144 != 65535) {
					local157 = this.aClass213_2.method5001(local144 >> 16);
					local144 &= 0xFFFF;
					if (local157 != null) {
						if (local157.method769(local144)) {
							local5 |= 0x80;
						}
						if (local157.method773(local144)) {
							local5 |= 0x100;
						}
						if (local157.method770(local144)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean446 || Static378.aBoolean643) && arg1 != -1 && arg1 < this.anIntArray340.length) {
				local144 = this.anIntArray340[arg1];
				if (local144 != 65535) {
					local157 = this.aClass213_2.method5001(local144 >> 16);
					local144 &= 0xFFFF;
					if (local157 != null) {
						if (local157.method769(local144)) {
							local5 |= 0x80;
						}
						if (local157.method773(local144)) {
							local5 |= 0x100;
						}
						if (local157.method770(local144)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	public void method5385() {
		if (this.anInt6412 == -1) {
			if (this.aBooleanArray23 == null) {
				this.anInt6412 = 0;
			} else {
				this.anInt6412 = 2;
			}
		}
		if (this.anInt6418 != -1) {
			return;
		}
		if (this.aBooleanArray23 == null) {
			this.anInt6418 = 0;
		} else {
			this.anInt6418 = 2;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!dt;I)V")
	public void method5386(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7954();
			if (local13 == 0) {
				return;
			}
			this.method5381(arg0, local13);
		}
	}
}
