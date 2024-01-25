import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class197 {

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "[Z")
	public boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
	public int anInt5070;

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "Lclient!nu;")
	public Class245 aClass245_2;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Z")
	public boolean aBoolean384 = false;

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "Z")
	public boolean aBoolean386 = false;

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
	public int anInt5064 = -1;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
	public int anInt5069 = 99;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
	public int anInt5073 = -1;

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "Z")
	public boolean aBoolean387 = false;

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
	public int anInt5071 = -1;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
	public int anInt5063 = -1;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	public int anInt5072 = 2;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "Z")
	public boolean aBoolean385 = false;

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
	public int anInt5076 = 5;

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
	public int anInt5077 = -1;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBIILclient!da;I)Lclient!da;")
	public Class52 method4033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class52 arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = this.anIntArray279[arg0];
		@Pc(18) int local18 = this.anIntArray284[arg0];
		@Pc(26) Class1_Sub8_Sub18 local26 = this.aClass245_2.method5307(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return arg3.method7412((byte) 1, arg1, true);
		}
		@Pc(40) Class1_Sub8_Sub18 local40 = null;
		if ((this.aBoolean384 || Static503.aBoolean658) && arg2 != -1 && arg2 < this.anIntArray284.length) {
			@Pc(63) int local63 = this.anIntArray284[arg2];
			local40 = this.aClass245_2.method5307(local63 >> 16);
			arg2 = local63 & 0xFFFF;
		}
		@Pc(79) Class1_Sub8_Sub18 local79 = null;
		@Pc(81) Class1_Sub8_Sub18 local81 = null;
		@Pc(83) int local83 = 0;
		@Pc(85) int local85 = 0;
		if (this.anIntArray280 != null) {
			if (this.anIntArray280.length > arg0) {
				local83 = this.anIntArray280[arg0];
				if (local83 != 65535) {
					local79 = this.aClass245_2.method5307(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
			if ((this.aBoolean384 || Static503.aBoolean658) && arg2 != -1 && arg2 < this.anIntArray280.length) {
				local85 = this.anIntArray280[arg2];
				if (local85 != 65535) {
					local81 = this.aClass245_2.method5307(local85 >> 16);
					local85 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean385) {
			arg1 |= 0x200;
		}
		if (local26.method7355(local30)) {
			arg1 |= 0x80;
		}
		if (local26.method7356(local30)) {
			arg1 |= 0x100;
		}
		if (local26.method7359(local30)) {
			arg1 |= 0x400;
		}
		if (local79 != null) {
			if (local79.method7355(local83)) {
				arg1 |= 0x80;
			}
			if (local79.method7356(local83)) {
				arg1 |= 0x100;
			}
			if (local79.method7359(local83)) {
				arg1 |= 0x400;
			}
		}
		if (local40 != null) {
			if (local40.method7355(arg2)) {
				arg1 |= 0x80;
			}
			if (local40.method7356(arg2)) {
				arg1 |= 0x100;
			}
			if (local40.method7359(arg2)) {
				arg1 |= 0x400;
			}
		}
		if (local81 != null) {
			if (local81.method7355(local85)) {
				arg1 |= 0x80;
			}
			if (local81.method7356(local85)) {
				arg1 |= 0x100;
			}
			if (local81.method7359(local85)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(283) Class52 local283 = arg3.method7412((byte) 1, arg1, true);
		local283.method7394(local40, this.aBoolean385, arg4 - 1, arg2, local30, local26, 0, local13);
		if (local79 != null) {
			local283.method7394(local81, this.aBoolean385, arg4 - 1, local85, local83, local79, 0, local13);
		}
		return local283;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZILclient!ac;)V")
	private void method4035(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		@Pc(110) int local110;
		@Pc(223) int local223;
		@Pc(229) int local229;
		@Pc(248) int local248;
		if (arg0 == 1) {
			local110 = arg1.method7945();
			this.anIntArray279 = new int[local110];
			for (local223 = 0; local223 < local110; local223++) {
				this.anIntArray279[local223] = arg1.method7945();
			}
			this.anIntArray284 = new int[local110];
			for (local229 = 0; local229 < local110; local229++) {
				this.anIntArray284[local229] = arg1.method7945();
			}
			for (local248 = 0; local248 < local110; local248++) {
				this.anIntArray284[local248] += arg1.method7945() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt5063 = arg1.method7945();
		} else if (arg0 == 3) {
			this.aBooleanArray23 = new boolean[256];
			local110 = arg1.method7974();
			for (local223 = 0; local223 < local110; local223++) {
				this.aBooleanArray23[arg1.method7974()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt5076 = arg1.method7974();
		} else if (arg0 == 6) {
			this.anInt5077 = arg1.method7945();
		} else if (arg0 == 7) {
			this.anInt5071 = arg1.method7945();
		} else if (arg0 == 8) {
			this.anInt5069 = arg1.method7974();
		} else if (arg0 == 9) {
			this.anInt5073 = arg1.method7974();
		} else if (arg0 == 10) {
			this.anInt5064 = arg1.method7974();
		} else if (arg0 == 11) {
			this.anInt5072 = arg1.method7974();
		} else if (arg0 == 12) {
			local110 = arg1.method7974();
			this.anIntArray280 = new int[local110];
			for (local223 = 0; local223 < local110; local223++) {
				this.anIntArray280[local223] = arg1.method7945();
			}
			for (local229 = 0; local229 < local110; local229++) {
				this.anIntArray280[local229] = (arg1.method7945() << 16) + this.anIntArray280[local229];
			}
		} else if (arg0 == 13) {
			local110 = arg1.method7945();
			this.anIntArrayArray24 = new int[local110][];
			for (local223 = 0; local223 < local110; local223++) {
				local229 = arg1.method7974();
				if (local229 > 0) {
					this.anIntArrayArray24[local223] = new int[local229];
					this.anIntArrayArray24[local223][0] = arg1.method7919();
					for (local248 = 1; local248 < local229; local248++) {
						this.anIntArrayArray24[local223][local248] = arg1.method7945();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean385 = true;
		} else if (arg0 == 15) {
			this.aBoolean384 = true;
		} else if (arg0 == 16) {
			this.aBoolean387 = true;
		} else if (arg0 == 18) {
			this.aBoolean386 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray281 == null) {
				this.anIntArray281 = new int[this.anIntArrayArray24.length];
				for (local110 = 0; local110 < this.anIntArrayArray24.length; local110++) {
					this.anIntArray281[local110] = 255;
				}
			}
			this.anIntArray281[arg1.method7974()] = arg1.method7974();
		} else if (arg0 == 20) {
			if (this.anIntArray283 == null || this.anIntArray282 == null) {
				this.anIntArray283 = new int[this.anIntArrayArray24.length];
				this.anIntArray282 = new int[this.anIntArrayArray24.length];
				for (local110 = 0; local110 < this.anIntArrayArray24.length; local110++) {
					this.anIntArray283[local110] = 256;
					this.anIntArray282[local110] = 256;
				}
			}
			local110 = arg1.method7974();
			this.anIntArray283[local110] = arg1.method7945();
			this.anIntArray282[local110] = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
	public void method4036() {
		if (this.anInt5073 == -1) {
			if (this.aBooleanArray23 == null) {
				this.anInt5073 = 0;
			} else {
				this.anInt5073 = 2;
			}
		}
		if (this.anInt5064 != -1) {
			return;
		}
		if (this.aBooleanArray23 == null) {
			this.anInt5064 = 0;
		} else {
			this.anInt5064 = 2;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIZI)I")
	public int method4037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray284[arg0];
		@Pc(14) Class1_Sub8_Sub18 local14 = null;
		@Pc(22) Class1_Sub8_Sub18 local22 = this.aClass245_2.method5307(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean384 || Static503.aBoolean658) && arg1 != -1 && arg1 < this.anIntArray284.length) {
			local7 = this.anIntArray284[arg1];
			local14 = this.aClass245_2.method5307(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean385) {
			local5 = 512;
		}
		if (local22.method7355(local26)) {
			local5 |= 0x80;
		}
		if (local22.method7356(local26)) {
			local5 |= 0x100;
		}
		if (local22.method7359(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method7355(local7)) {
				local5 |= 0x80;
			}
			if (local14.method7356(local7)) {
				local5 |= 0x100;
			}
			if (local14.method7359(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray280 != null && arg2) {
			@Pc(143) int local143;
			@Pc(156) Class1_Sub8_Sub18 local156;
			if (this.anIntArray280.length > arg0) {
				local143 = this.anIntArray280[arg0];
				if (local143 != 65535) {
					local156 = this.aClass245_2.method5307(local143 >> 16);
					local143 &= 0xFFFF;
					if (local156 != null) {
						if (local156.method7355(local143)) {
							local5 |= 0x80;
						}
						if (local156.method7356(local143)) {
							local5 |= 0x100;
						}
						if (local156.method7359(local143)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean384 || Static503.aBoolean658) && arg1 != -1 && this.anIntArray280.length > arg1) {
				local143 = this.anIntArray280[arg1];
				if (local143 != 65535) {
					local156 = this.aClass245_2.method5307(local143 >> 16);
					local143 &= 0xFFFF;
					if (local156 != null) {
						if (local156.method7355(local143)) {
							local5 |= 0x80;
						}
						if (local156.method7356(local143)) {
							local5 |= 0x100;
						}
						if (local156.method7359(local143)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZLclient!ac;)V")
	public void method4039(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7974();
			if (local9 == 0) {
				return;
			}
			this.method4035(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BIIILclient!da;IIB)Lclient!da;")
	public Class52 method4040(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class52 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) int local8 = this.anIntArray279[arg1];
		@Pc(13) int local13 = this.anIntArray284[arg1];
		@Pc(21) Class1_Sub8_Sub18 local21 = this.aClass245_2.method5307(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method7412(arg0, arg3, true);
		}
		@Pc(35) Class1_Sub8_Sub18 local35 = null;
		if ((this.aBoolean384 || Static503.aBoolean658) && arg2 != -1 && this.anIntArray284.length > arg2) {
			@Pc(53) int local53 = this.anIntArray284[arg2];
			local35 = this.aClass245_2.method5307(local53 >> 16);
			arg2 = local53 & 0xFFFF;
		}
		if (this.aBoolean385) {
			arg3 |= 0x200;
		}
		if (local21.method7355(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method7356(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method7359(local25)) {
			arg3 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method7355(arg2)) {
				arg3 |= 0x80;
			}
			if (local35.method7356(arg2)) {
				arg3 |= 0x100;
			}
			if (local35.method7359(arg2)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(148) Class52 local148 = arg4.method7412(arg0, arg3, true);
		local148.method7394(local35, this.aBoolean385, arg6 - 1, arg2, local25, local21, arg5, local8);
		return local148;
	}
}
