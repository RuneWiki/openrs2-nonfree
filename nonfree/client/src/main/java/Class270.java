import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class270 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "[I")
	public int[] anIntArray440;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "[I")
	public int[] anIntArray442;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray81;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Lclient!jb;")
	public Class155 aClass155_2;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "[I")
	public int[] anIntArray443;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "[I")
	public int[] anIntArray444;

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
	public int anInt7696;

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "[I")
	public int[] anIntArray445;

	@OriginalMember(owner = "client!qg", name = "E", descriptor = "[Z")
	public boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public int anInt7682 = 99;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public int anInt7684 = -1;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	public int anInt7683 = -1;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	public int anInt7695 = -1;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "Z")
	public boolean aBoolean532 = false;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
	public int anInt7694 = 5;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	public int anInt7689 = -1;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
	public int anInt7686 = 2;

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "Z")
	public boolean aBoolean534 = false;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "Z")
	public boolean aBoolean533 = false;

	@OriginalMember(owner = "client!qg", name = "F", descriptor = "Z")
	public boolean aBoolean535 = false;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	public int anInt7688 = -1;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!ie;)V")
	private void method6004(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		@Pc(29) int local29;
		@Pc(31) int local31;
		@Pc(147) int local147;
		@Pc(169) int local169;
		if (arg0 == 1) {
			local29 = arg1.method6811();
			this.anIntArray445 = new int[local29];
			for (local31 = 0; local31 < local29; local31++) {
				this.anIntArray445[local31] = arg1.method6811();
			}
			this.anIntArray443 = new int[local29];
			for (local147 = 0; local147 < local29; local147++) {
				this.anIntArray443[local147] = arg1.method6811();
			}
			for (local169 = 0; local169 < local29; local169++) {
				this.anIntArray443[local169] = (arg1.method6811() << 16) + this.anIntArray443[local169];
			}
		} else if (arg0 == 2) {
			this.anInt7683 = arg1.method6811();
		} else if (arg0 == 3) {
			this.aBooleanArray25 = new boolean[256];
			local29 = arg1.method6814();
			for (local31 = 0; local31 < local29; local31++) {
				this.aBooleanArray25[arg1.method6814()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt7694 = arg1.method6814();
		} else if (arg0 == 6) {
			this.anInt7689 = arg1.method6811();
		} else if (arg0 == 7) {
			this.anInt7688 = arg1.method6811();
		} else if (arg0 == 8) {
			this.anInt7682 = arg1.method6814();
		} else if (arg0 == 9) {
			this.anInt7684 = arg1.method6814();
		} else if (arg0 == 10) {
			this.anInt7695 = arg1.method6814();
		} else if (arg0 == 11) {
			this.anInt7686 = arg1.method6814();
		} else if (arg0 == 12) {
			local29 = arg1.method6814();
			this.anIntArray441 = new int[local29];
			for (local31 = 0; local31 < local29; local31++) {
				this.anIntArray441[local31] = arg1.method6811();
			}
			for (local147 = 0; local147 < local29; local147++) {
				this.anIntArray441[local147] = (arg1.method6811() << 16) + this.anIntArray441[local147];
			}
		} else if (arg0 == 13) {
			local29 = arg1.method6811();
			this.anIntArrayArray81 = new int[local29][];
			for (local31 = 0; local31 < local29; local31++) {
				local147 = arg1.method6814();
				if (local147 > 0) {
					this.anIntArrayArray81[local31] = new int[local147];
					this.anIntArrayArray81[local31][0] = arg1.method6830();
					for (local169 = 1; local169 < local147; local169++) {
						this.anIntArrayArray81[local31][local169] = arg1.method6811();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean533 = true;
		} else if (arg0 == 15) {
			this.aBoolean534 = true;
		} else if (arg0 == 16) {
			this.aBoolean535 = true;
		} else if (arg0 == 18) {
			this.aBoolean532 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray444 == null) {
				this.anIntArray444 = new int[this.anIntArrayArray81.length];
				for (local29 = 0; local29 < this.anIntArrayArray81.length; local29++) {
					this.anIntArray444[local29] = 255;
				}
			}
			this.anIntArray444[arg1.method6814()] = arg1.method6814();
		} else if (arg0 == 20) {
			if (this.anIntArray442 == null || this.anIntArray440 == null) {
				this.anIntArray442 = new int[this.anIntArrayArray81.length];
				this.anIntArray440 = new int[this.anIntArrayArray81.length];
				for (local29 = 0; local29 < this.anIntArrayArray81.length; local29++) {
					this.anIntArray442[local29] = 256;
					this.anIntArray440[local29] = 256;
				}
			}
			local29 = arg1.method6814();
			this.anIntArray442[local29] = arg1.method6811();
			this.anIntArray440[local29] = arg1.method6811();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BILclient!da;III)Lclient!da;")
	public Class52 method6005(@OriginalArg(1) int arg0, @OriginalArg(2) Class52 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray445[arg0];
		@Pc(21) int local21 = this.anIntArray443[arg0];
		@Pc(29) Class3_Sub7_Sub15 local29 = this.aClass155_2.method3818(local21 >> 16);
		@Pc(33) int local33 = local21 & 0xFFFF;
		if (local29 == null) {
			return arg1.method7618((byte) 1, arg4, true);
		}
		@Pc(43) Class3_Sub7_Sub15 local43 = null;
		if ((this.aBoolean534 || Static323.aBoolean412) && arg2 != -1 && arg2 < this.anIntArray443.length) {
			@Pc(66) int local66 = this.anIntArray443[arg2];
			local43 = this.aClass155_2.method3818(local66 >> 16);
			arg2 = local66 & 0xFFFF;
		}
		@Pc(80) Class3_Sub7_Sub15 local80 = null;
		@Pc(82) Class3_Sub7_Sub15 local82 = null;
		@Pc(84) int local84 = 0;
		@Pc(86) int local86 = 0;
		if (this.anIntArray441 != null) {
			if (this.anIntArray441.length > arg0) {
				local84 = this.anIntArray441[arg0];
				if (local84 != 65535) {
					local80 = this.aClass155_2.method3818(local84 >> 16);
					local84 &= 0xFFFF;
				}
			}
			if ((this.aBoolean534 || Static323.aBoolean412) && arg2 != -1 && arg2 < this.anIntArray441.length) {
				local86 = this.anIntArray441[arg2];
				if (local86 != 65535) {
					local82 = this.aClass155_2.method3818(local86 >> 16);
					local86 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean533) {
			arg4 |= 0x200;
		}
		if (local29.method5745(local33)) {
			arg4 |= 0x80;
		}
		if (local29.method5743(local33)) {
			arg4 |= 0x100;
		}
		if (local29.method5741(local33)) {
			arg4 |= 0x400;
		}
		if (local80 != null) {
			if (local80.method5745(local84)) {
				arg4 |= 0x80;
			}
			if (local80.method5743(local84)) {
				arg4 |= 0x100;
			}
			if (local80.method5741(local84)) {
				arg4 |= 0x400;
			}
		}
		if (local43 != null) {
			if (local43.method5745(arg2)) {
				arg4 |= 0x80;
			}
			if (local43.method5743(arg2)) {
				arg4 |= 0x100;
			}
			if (local43.method5741(arg2)) {
				arg4 |= 0x400;
			}
		}
		if (local82 != null) {
			if (local82.method5745(local86)) {
				arg4 |= 0x80;
			}
			if (local82.method5743(local86)) {
				arg4 |= 0x100;
			}
			if (local82.method5741(local86)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(287) Class52 local287 = arg1.method7618((byte) 1, arg4, true);
		local287.method7630(this.aBoolean533, arg2, local43, local8, local33, arg3 - 1, 0, local29);
		if (local80 != null) {
			local287.method7630(this.aBoolean533, local86, local82, local8, local84, arg3 - 1, 0, local80);
		}
		return local287;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZIILclient!da;BI)Lclient!da;")
	public Class52 method6006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class52 arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray445[arg2];
		@Pc(13) int local13 = this.anIntArray443[arg2];
		@Pc(21) Class3_Sub7_Sub15 local21 = this.aClass155_2.method3818(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method7618(arg5, arg6, true);
		}
		@Pc(49) Class3_Sub7_Sub15 local49 = null;
		if ((this.aBoolean534 || Static323.aBoolean412) && arg1 != -1 && this.anIntArray443.length > arg1) {
			@Pc(68) int local68 = this.anIntArray443[arg1];
			local49 = this.aClass155_2.method3818(local68 >> 16);
			arg1 = local68 & 0xFFFF;
		}
		if (this.aBoolean533) {
			arg6 |= 0x200;
		}
		if (local21.method5745(local25)) {
			arg6 |= 0x80;
		}
		if (local21.method5743(local25)) {
			arg6 |= 0x100;
		}
		if (local21.method5741(local25)) {
			arg6 |= 0x400;
		}
		if (local49 != null) {
			if (local49.method5745(arg1)) {
				arg6 |= 0x80;
			}
			if (local49.method5743(arg1)) {
				arg6 |= 0x100;
			}
			if (local49.method5741(arg1)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(153) Class52 local153 = arg4.method7618(arg5, arg6, true);
		local153.method7630(this.aBoolean533, arg1, local49, local8, local25, arg0 - 1, arg3, local21);
		return local153;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIZI)I")
	public int method6008(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray443[arg2];
		@Pc(14) Class3_Sub7_Sub15 local14 = null;
		@Pc(22) Class3_Sub7_Sub15 local22 = this.aClass155_2.method3818(local12 >> 16);
		@Pc(34) int local34 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean534 || Static323.aBoolean412) && arg0 != -1 && this.anIntArray443.length > arg0) {
			local7 = this.anIntArray443[arg0];
			local14 = this.aClass155_2.method3818(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean533) {
			local5 = 512;
		}
		if (local22.method5745(local34)) {
			local5 |= 0x80;
		}
		if (local22.method5743(local34)) {
			local5 |= 0x100;
		}
		if (local22.method5741(local34)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method5745(local7)) {
				local5 |= 0x80;
			}
			if (local14.method5743(local7)) {
				local5 |= 0x100;
			}
			if (local14.method5741(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray441 != null && arg1) {
			@Pc(150) int local150;
			@Pc(163) Class3_Sub7_Sub15 local163;
			if (this.anIntArray441.length > arg2) {
				local150 = this.anIntArray441[arg2];
				if (local150 != 65535) {
					local163 = this.aClass155_2.method3818(local150 >> 16);
					local150 &= 0xFFFF;
					if (local163 != null) {
						if (local163.method5745(local150)) {
							local5 |= 0x80;
						}
						if (local163.method5743(local150)) {
							local5 |= 0x100;
						}
						if (local163.method5741(local150)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean534 || Static323.aBoolean412) && arg0 != -1 && this.anIntArray441.length > arg0) {
				local150 = this.anIntArray441[arg0];
				if (local150 != 65535) {
					local163 = this.aClass155_2.method3818(local150 >> 16);
					local150 &= 0xFFFF;
					if (local163 != null) {
						if (local163.method5745(local150)) {
							local5 |= 0x80;
						}
						if (local163.method5743(local150)) {
							local5 |= 0x100;
						}
						if (local163.method5741(local150)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!ie;)V")
	public void method6009(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6814();
			if (local5 == 0) {
				return;
			}
			this.method6004(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public void method6010() {
		if (this.anInt7695 == -1) {
			if (this.aBooleanArray25 == null) {
				this.anInt7695 = 0;
			} else {
				this.anInt7695 = 2;
			}
		}
		if (this.anInt7684 != -1) {
			return;
		}
		if (this.aBooleanArray25 == null) {
			this.anInt7684 = 0;
		} else {
			this.anInt7684 = 2;
		}
	}
}
