import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class97 {

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
	public int anInt3601;

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "[I")
	public int[] anIntArray180;

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "Lclient!ne;")
	public Class220 aClass220_2;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "[I")
	public int[] anIntArray181;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!fba", name = "s", descriptor = "[I")
	public int[] anIntArray183;

	@OriginalMember(owner = "client!fba", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!fba", name = "v", descriptor = "[Z")
	public boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!fba", name = "D", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
	public int anInt3604 = -1;

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
	public int anInt3603 = 2;

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
	public int anInt3609 = -1;

	@OriginalMember(owner = "client!fba", name = "n", descriptor = "Z")
	public boolean aBoolean264 = false;

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
	public int anInt3607 = -1;

	@OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
	public int anInt3608 = 99;

	@OriginalMember(owner = "client!fba", name = "y", descriptor = "I")
	public int anInt3612 = -1;

	@OriginalMember(owner = "client!fba", name = "A", descriptor = "I")
	public int anInt3613 = 5;

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
	public int anInt3610 = -1;

	@OriginalMember(owner = "client!fba", name = "C", descriptor = "Z")
	public boolean aBoolean266 = false;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!fba", name = "z", descriptor = "Z")
	public boolean aBoolean265 = false;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!ig;I)V")
	public void method2967(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8525();
			if (local11 == 0) {
				return;
			}
			this.method2972(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BIBIILclient!ka;II)Lclient!ka;")
	public Class83 method2969(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class83 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray180[arg6];
		@Pc(13) int local13 = this.anIntArray182[arg6];
		@Pc(21) Class8_Sub5_Sub21 local21 = this.aClass220_2.method5668(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method7993(arg1, arg2, true);
		}
		@Pc(35) Class8_Sub5_Sub21 local35 = null;
		if ((this.aBoolean263 || Static460.aBoolean600) && arg5 != -1 && this.anIntArray182.length > arg5) {
			@Pc(54) int local54 = this.anIntArray182[arg5];
			local35 = this.aClass220_2.method5668(local54 >> 16);
			arg5 = local54 & 0xFFFF;
		}
		if (this.aBoolean264) {
			arg2 |= 0x200;
		}
		if (local21.method8390(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method8388(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method8385(local25)) {
			arg2 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method8390(arg5)) {
				arg2 |= 0x80;
			}
			if (local35.method8388(arg5)) {
				arg2 |= 0x100;
			}
			if (local35.method8385(arg5)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(139) Class83 local139 = arg4.method7993(arg1, arg2, true);
		local139.method7998(this.aBoolean264, arg5, local25, local35, local8, local21, arg0 - 1, arg3);
		return local139;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	public void method2970() {
		if (this.anInt3607 == -1) {
			if (this.aBooleanArray6 == null) {
				this.anInt3607 = 0;
			} else {
				this.anInt3607 = 2;
			}
		}
		if (this.anInt3612 != -1) {
			return;
		}
		if (this.aBooleanArray6 == null) {
			this.anInt3612 = 0;
		} else {
			this.anInt3612 = 2;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIII)I")
	public int method2971(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray182[arg1];
		@Pc(14) Class8_Sub5_Sub21 local14 = null;
		@Pc(22) Class8_Sub5_Sub21 local22 = this.aClass220_2.method5668(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean263 || Static460.aBoolean600) && arg2 != -1 && this.anIntArray182.length > arg2) {
			local7 = this.anIntArray182[arg2];
			local14 = this.aClass220_2.method5668(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean264) {
			local5 = 512;
		}
		if (local22.method8390(local26)) {
			local5 |= 0x80;
		}
		if (local22.method8388(local26)) {
			local5 |= 0x100;
		}
		if (local22.method8385(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method8390(local7)) {
				local5 |= 0x80;
			}
			if (local14.method8388(local7)) {
				local5 |= 0x100;
			}
			if (local14.method8385(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray179 != null && arg0) {
			@Pc(147) int local147;
			@Pc(160) Class8_Sub5_Sub21 local160;
			if (this.anIntArray179.length > arg1) {
				local147 = this.anIntArray179[arg1];
				if (local147 != 65535) {
					local160 = this.aClass220_2.method5668(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method8390(local147)) {
							local5 |= 0x80;
						}
						if (local160.method8388(local147)) {
							local5 |= 0x100;
						}
						if (local160.method8385(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean263 || Static460.aBoolean600) && arg2 != -1 && this.anIntArray179.length > arg2) {
				local147 = this.anIntArray179[arg2];
				if (local147 != 65535) {
					local160 = this.aClass220_2.method5668(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method8390(local147)) {
							local5 |= 0x80;
						}
						if (local160.method8388(local147)) {
							local5 |= 0x100;
						}
						if (local160.method8385(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!ig;IB)V")
	private void method2972(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(41) int local41;
		@Pc(56) int local56;
		if (arg1 == 1) {
			local16 = arg0.method8578();
			this.anIntArray180 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray180[local22] = arg0.method8578();
			}
			this.anIntArray182 = new int[local16];
			for (local41 = 0; local41 < local16; local41++) {
				this.anIntArray182[local41] = arg0.method8578();
			}
			for (local56 = 0; local56 < local16; local56++) {
				this.anIntArray182[local56] += arg0.method8578() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3609 = arg0.method8578();
		} else if (arg1 == 3) {
			this.aBooleanArray6 = new boolean[256];
			local16 = arg0.method8525();
			for (local22 = 0; local22 < local16; local22++) {
				this.aBooleanArray6[arg0.method8525()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt3613 = arg0.method8525();
		} else if (arg1 == 6) {
			this.anInt3604 = arg0.method8578();
		} else if (arg1 == 7) {
			this.anInt3610 = arg0.method8578();
		} else if (arg1 == 8) {
			this.anInt3608 = arg0.method8525();
		} else if (arg1 == 9) {
			this.anInt3612 = arg0.method8525();
		} else if (arg1 == 10) {
			this.anInt3607 = arg0.method8525();
		} else if (arg1 == 11) {
			this.anInt3603 = arg0.method8525();
		} else if (arg1 == 12) {
			local16 = arg0.method8525();
			this.anIntArray179 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray179[local22] = arg0.method8578();
			}
			for (local41 = 0; local41 < local16; local41++) {
				this.anIntArray179[local41] += arg0.method8578() << 16;
			}
		} else if (arg1 == 13) {
			local16 = arg0.method8578();
			this.anIntArrayArray13 = new int[local16][];
			for (local22 = 0; local22 < local16; local22++) {
				local41 = arg0.method8525();
				if (local41 > 0) {
					this.anIntArrayArray13[local22] = new int[local41];
					this.anIntArrayArray13[local22][0] = arg0.method8560();
					for (local56 = 1; local56 < local41; local56++) {
						this.anIntArrayArray13[local22][local56] = arg0.method8578();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean264 = true;
		} else if (arg1 == 15) {
			this.aBoolean263 = true;
		} else if (arg1 == 16) {
			this.aBoolean266 = true;
		} else if (arg1 == 18) {
			this.aBoolean265 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray185 == null) {
				this.anIntArray185 = new int[this.anIntArrayArray13.length];
				for (local16 = 0; local16 < this.anIntArrayArray13.length; local16++) {
					this.anIntArray185[local16] = 255;
				}
			}
			this.anIntArray185[arg0.method8525()] = arg0.method8525();
		} else if (arg1 == 20) {
			if (this.anIntArray183 == null || this.anIntArray181 == null) {
				this.anIntArray183 = new int[this.anIntArrayArray13.length];
				this.anIntArray181 = new int[this.anIntArrayArray13.length];
				for (local16 = 0; local16 < this.anIntArrayArray13.length; local16++) {
					this.anIntArray183[local16] = 256;
					this.anIntArray181[local16] = 256;
				}
			}
			local16 = arg0.method8525();
			this.anIntArray183[local16] = arg0.method8578();
			this.anIntArray181[local16] = arg0.method8578();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILclient!ka;ZII)Lclient!ka;")
	public Class83 method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray180[arg3];
		@Pc(13) int local13 = this.anIntArray182[arg3];
		@Pc(21) Class8_Sub5_Sub21 local21 = this.aClass220_2.method5668(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method7993((byte) 1, arg4, true);
		}
		@Pc(35) Class8_Sub5_Sub21 local35 = null;
		if ((this.aBoolean263 || Static460.aBoolean600) && arg1 != -1 && arg1 < this.anIntArray182.length) {
			@Pc(53) int local53 = this.anIntArray182[arg1];
			local35 = this.aClass220_2.method5668(local53 >> 16);
			arg1 = local53 & 0xFFFF;
		}
		@Pc(67) Class8_Sub5_Sub21 local67 = null;
		@Pc(69) Class8_Sub5_Sub21 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray179 != null) {
			if (arg3 < this.anIntArray179.length) {
				local71 = this.anIntArray179[arg3];
				if (local71 != 65535) {
					local67 = this.aClass220_2.method5668(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean263 || Static460.aBoolean600) && arg1 != -1 && this.anIntArray179.length > arg1) {
				local73 = this.anIntArray179[arg1];
				if (local73 != 65535) {
					local69 = this.aClass220_2.method5668(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean264) {
			arg4 |= 0x200;
		}
		if (local21.method8390(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method8388(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method8385(local25)) {
			arg4 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method8390(local71)) {
				arg4 |= 0x80;
			}
			if (local67.method8388(local71)) {
				arg4 |= 0x100;
			}
			if (local67.method8385(local71)) {
				arg4 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method8390(arg1)) {
				arg4 |= 0x80;
			}
			if (local35.method8388(arg1)) {
				arg4 |= 0x100;
			}
			if (local35.method8385(arg1)) {
				arg4 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method8390(local73)) {
				arg4 |= 0x80;
			}
			if (local69.method8388(local73)) {
				arg4 |= 0x100;
			}
			if (local69.method8385(local73)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(267) Class83 local267 = arg2.method7993((byte) 1, arg4, true);
		local267.method7998(this.aBoolean264, arg1, local25, local35, local8, local21, arg0 - 1, 0);
		if (local67 != null) {
			local267.method7998(this.aBoolean264, local73, local71, local69, local8, local67, arg0 - 1, 0);
		}
		return local267;
	}
}
