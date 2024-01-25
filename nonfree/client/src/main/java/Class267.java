import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class267 {

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "[Z")
	public boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "[I")
	public int[] anIntArray453;

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "[I")
	private int[] anIntArray454;

	@OriginalMember(owner = "client!pia", name = "j", descriptor = "Lclient!pga;")
	public Class264 aClass264_1;

	@OriginalMember(owner = "client!pia", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
	public int anInt7578;

	@OriginalMember(owner = "client!pia", name = "v", descriptor = "[I")
	public int[] anIntArray456;

	@OriginalMember(owner = "client!pia", name = "D", descriptor = "[I")
	public int[] anIntArray457;

	@OriginalMember(owner = "client!pia", name = "E", descriptor = "[I")
	public int[] anIntArray458;

	@OriginalMember(owner = "client!pia", name = "F", descriptor = "[I")
	public int[] anIntArray459;

	@OriginalMember(owner = "client!pia", name = "h", descriptor = "I")
	public int anInt7573 = -1;

	@OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
	public int anInt7574 = -1;

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
	public int anInt7571 = -1;

	@OriginalMember(owner = "client!pia", name = "i", descriptor = "Z")
	public boolean aBoolean542 = false;

	@OriginalMember(owner = "client!pia", name = "r", descriptor = "I")
	public int anInt7577 = 99;

	@OriginalMember(owner = "client!pia", name = "B", descriptor = "Z")
	public boolean aBoolean544 = false;

	@OriginalMember(owner = "client!pia", name = "o", descriptor = "I")
	public int anInt7575 = -1;

	@OriginalMember(owner = "client!pia", name = "x", descriptor = "I")
	public int anInt7582 = 5;

	@OriginalMember(owner = "client!pia", name = "q", descriptor = "Z")
	public boolean aBoolean543 = false;

	@OriginalMember(owner = "client!pia", name = "A", descriptor = "I")
	public int anInt7585 = 2;

	@OriginalMember(owner = "client!pia", name = "G", descriptor = "Z")
	public boolean aBoolean545 = false;

	@OriginalMember(owner = "client!pia", name = "H", descriptor = "I")
	public int anInt7586 = -1;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIIBLclient!ka;I)Lclient!ka;")
	public Class75 method6603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) Class75 arg6) {
		@Pc(8) int local8 = this.anIntArray456[arg3];
		@Pc(13) int local13 = this.anIntArray458[arg3];
		@Pc(21) Class3_Sub7_Sub18 local21 = this.aClass264_1.method6569(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg6.method6805(arg5, arg2, true);
		}
		@Pc(35) Class3_Sub7_Sub18 local35 = null;
		if ((this.aBoolean543 || Static607.aBoolean749) && arg4 != -1 && this.anIntArray458.length > arg4) {
			@Pc(57) int local57 = this.anIntArray458[arg4];
			local35 = this.aClass264_1.method6569(local57 >> 16);
			arg4 = local57 & 0xFFFF;
		}
		if (this.aBoolean545) {
			arg2 |= 0x200;
		}
		if (local21.method7270(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method7266(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method7267(local25)) {
			arg2 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method7270(arg4)) {
				arg2 |= 0x80;
			}
			if (local35.method7266(arg4)) {
				arg2 |= 0x100;
			}
			if (local35.method7267(arg4)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(156) Class75 local156 = arg6.method6805(arg5, arg2, true);
		local156.method6786(local21, arg1, local35, local25, local8, this.aBoolean545, arg4, arg0 - 1);
		return local156;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIILclient!ka;II)Lclient!ka;")
	public Class75 method6604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = this.anIntArray456[arg0];
		@Pc(13) int local13 = this.anIntArray458[arg0];
		@Pc(21) Class3_Sub7_Sub18 local21 = this.aClass264_1.method6569(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method6805((byte) 1, arg1, true);
		}
		@Pc(35) Class3_Sub7_Sub18 local35 = null;
		if ((this.aBoolean543 || Static607.aBoolean749) && arg4 != -1 && this.anIntArray458.length > arg4) {
			@Pc(57) int local57 = this.anIntArray458[arg4];
			local35 = this.aClass264_1.method6569(local57 >> 16);
			arg4 = local57 & 0xFFFF;
		}
		@Pc(71) Class3_Sub7_Sub18 local71 = null;
		@Pc(73) Class3_Sub7_Sub18 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(83) int local83 = 0;
		if (this.anIntArray454 != null) {
			if (arg0 < this.anIntArray454.length) {
				local75 = this.anIntArray454[arg0];
				if (local75 != 65535) {
					local71 = this.aClass264_1.method6569(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean543 || Static607.aBoolean749) && arg4 != -1 && arg4 < this.anIntArray454.length) {
				local83 = this.anIntArray454[arg4];
				if (local83 != 65535) {
					local73 = this.aClass264_1.method6569(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean545) {
			arg1 |= 0x200;
		}
		if (local21.method7270(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method7266(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method7267(local25)) {
			arg1 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method7270(local75)) {
				arg1 |= 0x80;
			}
			if (local71.method7266(local75)) {
				arg1 |= 0x100;
			}
			if (local71.method7267(local75)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method7270(arg4)) {
				arg1 |= 0x80;
			}
			if (local35.method7266(arg4)) {
				arg1 |= 0x100;
			}
			if (local35.method7267(arg4)) {
				arg1 |= 0x400;
			}
		}
		if (local73 != null) {
			if (local73.method7270(local83)) {
				arg1 |= 0x80;
			}
			if (local73.method7266(local83)) {
				arg1 |= 0x100;
			}
			if (local73.method7267(local83)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(286) Class75 local286 = arg3.method6805((byte) 1, arg1, true);
		local286.method6786(local21, 0, local35, local25, local8, this.aBoolean545, arg4, arg2 - 1);
		if (local71 != null) {
			local286.method6786(local71, 0, local73, local75, local8, this.aBoolean545, local83, arg2 - 1);
		}
		return local286;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IZII)I")
	public int method6605(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray458[arg0];
		@Pc(14) Class3_Sub7_Sub18 local14 = null;
		@Pc(22) Class3_Sub7_Sub18 local22 = this.aClass264_1.method6569(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean543 || Static607.aBoolean749) && arg2 != -1 && arg2 < this.anIntArray458.length) {
			local7 = this.anIntArray458[arg2];
			local14 = this.aClass264_1.method6569(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean545) {
			local5 = 512;
		}
		if (local22.method7270(local26)) {
			local5 |= 0x80;
		}
		if (local22.method7266(local26)) {
			local5 |= 0x100;
		}
		if (local22.method7267(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method7270(local7)) {
				local5 |= 0x80;
			}
			if (local14.method7266(local7)) {
				local5 |= 0x100;
			}
			if (local14.method7267(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray454 != null && arg1) {
			@Pc(149) int local149;
			@Pc(162) Class3_Sub7_Sub18 local162;
			if (arg0 < this.anIntArray454.length) {
				local149 = this.anIntArray454[arg0];
				if (local149 != 65535) {
					local162 = this.aClass264_1.method6569(local149 >> 16);
					local149 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method7270(local149)) {
							local5 |= 0x80;
						}
						if (local162.method7266(local149)) {
							local5 |= 0x100;
						}
						if (local162.method7267(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean543 || Static607.aBoolean749) && arg2 != -1 && arg2 < this.anIntArray454.length) {
				local149 = this.anIntArray454[arg2];
				if (local149 != 65535) {
					local162 = this.aClass264_1.method6569(local149 >> 16);
					local149 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method7270(local149)) {
							local5 |= 0x80;
						}
						if (local162.method7266(local149)) {
							local5 |= 0x100;
						}
						if (local162.method7267(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	public void method6606() {
		if (this.anInt7571 == -1) {
			if (this.aBooleanArray28 == null) {
				this.anInt7571 = 0;
			} else {
				this.anInt7571 = 2;
			}
		}
		if (this.anInt7573 != -1) {
			return;
		}
		if (this.aBooleanArray28 == null) {
			this.anInt7573 = 0;
		} else {
			this.anInt7573 = 2;
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!dc;B)V")
	public void method6608(@OriginalArg(0) Class3_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5633();
			if (local5 == 0) {
				return;
			}
			this.method6610(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!dc;II)V")
	private void method6610(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(92) int local92;
		@Pc(98) int local98;
		@Pc(113) int local113;
		@Pc(312) int local312;
		if (arg1 == 1) {
			local92 = arg0.method5610();
			this.anIntArray456 = new int[local92];
			for (local98 = 0; local98 < local92; local98++) {
				this.anIntArray456[local98] = arg0.method5610();
			}
			this.anIntArray458 = new int[local92];
			for (local113 = 0; local113 < local92; local113++) {
				this.anIntArray458[local113] = arg0.method5610();
			}
			for (local312 = 0; local312 < local92; local312++) {
				this.anIntArray458[local312] += arg0.method5610() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt7575 = arg0.method5610();
		} else if (arg1 == 3) {
			this.aBooleanArray28 = new boolean[256];
			local92 = arg0.method5633();
			for (local98 = 0; local98 < local92; local98++) {
				this.aBooleanArray28[arg0.method5633()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt7582 = arg0.method5633();
		} else if (arg1 == 6) {
			this.anInt7586 = arg0.method5610();
		} else if (arg1 == 7) {
			this.anInt7574 = arg0.method5610();
		} else if (arg1 == 8) {
			this.anInt7577 = arg0.method5633();
		} else if (arg1 == 9) {
			this.anInt7573 = arg0.method5633();
		} else if (arg1 == 10) {
			this.anInt7571 = arg0.method5633();
		} else if (arg1 == 11) {
			this.anInt7585 = arg0.method5633();
		} else if (arg1 == 12) {
			local92 = arg0.method5633();
			this.anIntArray454 = new int[local92];
			for (local98 = 0; local98 < local92; local98++) {
				this.anIntArray454[local98] = arg0.method5610();
			}
			for (local113 = 0; local113 < local92; local113++) {
				this.anIntArray454[local113] += arg0.method5610() << 16;
			}
		} else if (arg1 == 13) {
			local92 = arg0.method5610();
			this.anIntArrayArray40 = new int[local92][];
			for (local98 = 0; local98 < local92; local98++) {
				local113 = arg0.method5633();
				if (local113 > 0) {
					this.anIntArrayArray40[local98] = new int[local113];
					this.anIntArrayArray40[local98][0] = arg0.method5604();
					for (local312 = 1; local312 < local113; local312++) {
						this.anIntArrayArray40[local98][local312] = arg0.method5610();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean545 = true;
		} else if (arg1 == 15) {
			this.aBoolean543 = true;
		} else if (arg1 == 16) {
			this.aBoolean542 = true;
		} else if (arg1 == 18) {
			this.aBoolean544 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray453 == null) {
				this.anIntArray453 = new int[this.anIntArrayArray40.length];
				for (local92 = 0; local92 < this.anIntArrayArray40.length; local92++) {
					this.anIntArray453[local92] = 255;
				}
			}
			this.anIntArray453[arg0.method5633()] = arg0.method5633();
		} else if (arg1 == 20) {
			if (this.anIntArray457 == null || this.anIntArray459 == null) {
				this.anIntArray457 = new int[this.anIntArrayArray40.length];
				this.anIntArray459 = new int[this.anIntArrayArray40.length];
				for (local92 = 0; local92 < this.anIntArrayArray40.length; local92++) {
					this.anIntArray457[local92] = 256;
					this.anIntArray459[local92] = 256;
				}
			}
			local92 = arg0.method5633();
			this.anIntArray457[local92] = arg0.method5610();
			this.anIntArray459[local92] = arg0.method5610();
		}
	}
}
