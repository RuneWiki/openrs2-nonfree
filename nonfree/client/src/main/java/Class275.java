import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class275 {

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
	public int[] anIntArray598;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!jv;")
	public Class191 aClass191_1;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "[I")
	public int[] anIntArray599;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "[I")
	public int[] anIntArray600;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "[I")
	public int[] anIntArray601;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "[Z")
	public boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
	public int anInt7928;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "[I")
	private int[] anIntArray602;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "[I")
	public int[] anIntArray603;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public int anInt7913 = -1;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	public int anInt7916 = -1;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "Z")
	public boolean aBoolean543 = false;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "Z")
	public boolean aBoolean542 = false;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Z")
	public boolean aBoolean541 = false;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
	public int anInt7922 = -1;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	public int anInt7920 = 2;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
	public int anInt7924 = -1;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	public int anInt7914 = 99;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
	public int anInt7930 = 5;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
	public int anInt7926 = -1;

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "Z")
	public boolean aBoolean544 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ka;IIIZI)Lclient!ka;")
	public Class80 method6543(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray599[arg3];
		@Pc(13) int local13 = this.anIntArray598[arg3];
		@Pc(21) Class14_Sub3_Sub1 local21 = this.aClass191_1.method4319(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method6378((byte) 1, arg1, true);
		}
		@Pc(35) Class14_Sub3_Sub1 local35 = null;
		if ((this.aBoolean543 || Static394.aBoolean505) && arg4 != -1 && arg4 < this.anIntArray598.length) {
			@Pc(58) int local58 = this.anIntArray598[arg4];
			local35 = this.aClass191_1.method4319(local58 >> 16);
			arg4 = local58 & 0xFFFF;
		}
		@Pc(72) Class14_Sub3_Sub1 local72 = null;
		@Pc(74) Class14_Sub3_Sub1 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray602 != null) {
			if (arg3 < this.anIntArray602.length) {
				local76 = this.anIntArray602[arg3];
				if (local76 != 65535) {
					local72 = this.aClass191_1.method4319(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean543 || Static394.aBoolean505) && arg4 != -1 && arg4 < this.anIntArray602.length) {
				local78 = this.anIntArray602[arg4];
				if (local78 != 65535) {
					local74 = this.aClass191_1.method4319(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean544) {
			arg1 |= 0x200;
		}
		if (local21.method216(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method217(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method213(local25)) {
			arg1 |= 0x400;
		}
		if (local72 != null) {
			if (local72.method216(local76)) {
				arg1 |= 0x80;
			}
			if (local72.method217(local76)) {
				arg1 |= 0x100;
			}
			if (local72.method213(local76)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method216(arg4)) {
				arg1 |= 0x80;
			}
			if (local35.method217(arg4)) {
				arg1 |= 0x100;
			}
			if (local35.method213(arg4)) {
				arg1 |= 0x400;
			}
		}
		if (local74 != null) {
			if (local74.method216(local78)) {
				arg1 |= 0x80;
			}
			if (local74.method217(local78)) {
				arg1 |= 0x100;
			}
			if (local74.method213(local78)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(274) Class80 local274 = arg0.method6378((byte) 1, arg1, true);
		local274.method6387(local35, local25, arg2 - 1, arg4, local8, this.aBoolean544, local21, 0);
		if (local72 != null) {
			local274.method6387(local74, local76, arg2 - 1, local78, local8, this.aBoolean544, local72, 0);
		}
		return local274;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ka;BIBIIII)Lclient!ka;")
	public Class80 method6545(@OriginalArg(0) Class80 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray599[arg4];
		@Pc(13) int local13 = this.anIntArray598[arg4];
		@Pc(21) Class14_Sub3_Sub1 local21 = this.aClass191_1.method4319(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method6378(arg1, arg2, true);
		}
		@Pc(35) Class14_Sub3_Sub1 local35 = null;
		if ((this.aBoolean543 || Static394.aBoolean505) && arg5 != -1 && arg5 < this.anIntArray598.length) {
			@Pc(57) int local57 = this.anIntArray598[arg5];
			local35 = this.aClass191_1.method4319(local57 >> 16);
			arg5 = local57 & 0xFFFF;
		}
		if (this.aBoolean544) {
			arg2 |= 0x200;
		}
		if (local21.method216(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method217(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method213(local25)) {
			arg2 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method216(arg5)) {
				arg2 |= 0x80;
			}
			if (local35.method217(arg5)) {
				arg2 |= 0x100;
			}
			if (local35.method213(arg5)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(142) Class80 local142 = arg0.method6378(arg1, arg2, true);
		local142.method6387(local35, local25, arg3 - 1, arg5, local8, this.aBoolean544, local21, arg6);
		return local142;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!so;)V")
	public void method6548(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(21) int local21 = arg0.method5866();
			if (local21 == 0) {
				return;
			}
			this.method6551(arg0, local21);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZII)I")
	public int method6549(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray598[arg2];
		@Pc(14) Class14_Sub3_Sub1 local14 = null;
		@Pc(22) Class14_Sub3_Sub1 local22 = this.aClass191_1.method4319(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean543 || Static394.aBoolean505) && arg0 != -1 && this.anIntArray598.length > arg0) {
			local7 = this.anIntArray598[arg0];
			local14 = this.aClass191_1.method4319(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean544) {
			local5 = 512;
		}
		if (local22.method216(local26)) {
			local5 |= 0x80;
		}
		if (local22.method217(local26)) {
			local5 |= 0x100;
		}
		if (local22.method213(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method216(local7)) {
				local5 |= 0x80;
			}
			if (local14.method217(local7)) {
				local5 |= 0x100;
			}
			if (local14.method213(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray602 != null && arg1) {
			@Pc(150) int local150;
			@Pc(161) Class14_Sub3_Sub1 local161;
			if (this.anIntArray602.length > arg2) {
				local150 = this.anIntArray602[arg2];
				if (local150 != 65535) {
					local161 = this.aClass191_1.method4319(local150 >> 16);
					local150 &= 0xFFFF;
					if (local161 != null) {
						if (local161.method216(local150)) {
							local5 |= 0x80;
						}
						if (local161.method217(local150)) {
							local5 |= 0x100;
						}
						if (local161.method213(local150)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean543 || Static394.aBoolean505) && arg0 != -1 && this.anIntArray602.length > arg0) {
				local150 = this.anIntArray602[arg0];
				if (local150 != 65535) {
					local161 = this.aClass191_1.method4319(local150 >> 16);
					local150 &= 0xFFFF;
					if (local161 != null) {
						if (local161.method216(local150)) {
							local5 |= 0x80;
						}
						if (local161.method217(local150)) {
							local5 |= 0x100;
						}
						if (local161.method213(local150)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
	public void method6550() {
		if (this.anInt7922 == -1) {
			if (this.aBooleanArray19 == null) {
				this.anInt7922 = 0;
			} else {
				this.anInt7922 = 2;
			}
		}
		if (this.anInt7913 != -1) {
			return;
		}
		if (this.aBooleanArray19 == null) {
			this.anInt7913 = 0;
		} else {
			this.anInt7913 = 2;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!so;IZ)V")
	private void method6551(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(62) int local62;
		if (arg1 == 1) {
			local14 = arg0.method5900();
			this.anIntArray599 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray599[local20] = arg0.method5900();
			}
			this.anIntArray598 = new int[local14];
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray598[local43] = arg0.method5900();
			}
			for (local62 = 0; local62 < local14; local62++) {
				this.anIntArray598[local62] = (arg0.method5900() << 16) + this.anIntArray598[local62];
			}
		} else if (arg1 == 2) {
			this.anInt7916 = arg0.method5900();
		} else if (arg1 == 3) {
			this.aBooleanArray19 = new boolean[256];
			local14 = arg0.method5866();
			for (local20 = 0; local20 < local14; local20++) {
				this.aBooleanArray19[arg0.method5866()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt7930 = arg0.method5866();
		} else if (arg1 == 6) {
			this.anInt7926 = arg0.method5900();
		} else if (arg1 == 7) {
			this.anInt7924 = arg0.method5900();
		} else if (arg1 == 8) {
			this.anInt7914 = arg0.method5866();
		} else if (arg1 == 9) {
			this.anInt7913 = arg0.method5866();
		} else if (arg1 == 10) {
			this.anInt7922 = arg0.method5866();
		} else if (arg1 == 11) {
			this.anInt7920 = arg0.method5866();
		} else if (arg1 == 12) {
			local14 = arg0.method5866();
			this.anIntArray602 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray602[local20] = arg0.method5900();
			}
			for (local43 = 0; local43 < local14; local43++) {
				this.anIntArray602[local43] = (arg0.method5900() << 16) + this.anIntArray602[local43];
			}
		} else if (arg1 == 13) {
			local14 = arg0.method5900();
			this.anIntArrayArray47 = new int[local14][];
			for (local20 = 0; local20 < local14; local20++) {
				local43 = arg0.method5866();
				if (local43 > 0) {
					this.anIntArrayArray47[local20] = new int[local43];
					this.anIntArrayArray47[local20][0] = arg0.method5862();
					for (local62 = 1; local62 < local43; local62++) {
						this.anIntArrayArray47[local20][local62] = arg0.method5900();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean544 = true;
		} else if (arg1 == 15) {
			this.aBoolean543 = true;
		} else if (arg1 == 16) {
			this.aBoolean541 = true;
		} else if (arg1 == 18) {
			this.aBoolean542 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray601 == null) {
				this.anIntArray601 = new int[this.anIntArrayArray47.length];
				for (local14 = 0; local14 < this.anIntArrayArray47.length; local14++) {
					this.anIntArray601[local14] = 255;
				}
			}
			this.anIntArray601[arg0.method5866()] = arg0.method5866();
		} else if (arg1 == 20) {
			if (this.anIntArray600 == null || this.anIntArray603 == null) {
				this.anIntArray600 = new int[this.anIntArrayArray47.length];
				this.anIntArray603 = new int[this.anIntArrayArray47.length];
				for (local14 = 0; local14 < this.anIntArrayArray47.length; local14++) {
					this.anIntArray600[local14] = 256;
					this.anIntArray603[local14] = 256;
				}
			}
			local14 = arg0.method5866();
			this.anIntArray600[local14] = arg0.method5900();
			this.anIntArray603[local14] = arg0.method5900();
		}
	}
}
