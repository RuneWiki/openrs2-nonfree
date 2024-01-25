import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class372 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "[I")
	private int[] anIntArray898;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "[I")
	public int[] anIntArray899;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "[I")
	public int[] anIntArray900;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!uaa;")
	public Class343 aClass343_4;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "[I")
	public int[] anIntArray901;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
	public int anInt10252;

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "[I")
	public int[] anIntArray903;

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "[I")
	public int[] anIntArray904;

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "[Z")
	public boolean[] aBooleanArray54;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
	public int anInt10249 = 5;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
	public int anInt10244 = -1;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "Z")
	public boolean aBoolean772 = false;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "Z")
	public boolean aBoolean773 = false;

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
	public int anInt10254 = 2;

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
	public int anInt10248 = -1;

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
	public int anInt10253 = 99;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
	public int anInt10256 = -1;

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "Z")
	public boolean aBoolean774 = false;

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "Z")
	public boolean aBoolean775 = false;

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
	public int anInt10255 = -1;

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
	public int anInt10260 = -1;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!jp;I)V")
	private void method8972(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(119) int local119;
		@Pc(179) int local179;
		if (arg0 == 1) {
			local98 = arg1.method8593();
			this.anIntArray900 = new int[local98];
			for (local104 = 0; local104 < local98; local104++) {
				this.anIntArray900[local104] = arg1.method8593();
			}
			this.anIntArray901 = new int[local98];
			for (local119 = 0; local119 < local98; local119++) {
				this.anIntArray901[local119] = arg1.method8593();
			}
			for (local179 = 0; local179 < local98; local179++) {
				this.anIntArray901[local179] += arg1.method8593() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt10256 = arg1.method8593();
		} else if (arg0 == 3) {
			this.aBooleanArray54 = new boolean[256];
			local98 = arg1.method8632();
			for (local104 = 0; local104 < local98; local104++) {
				this.aBooleanArray54[arg1.method8632()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt10249 = arg1.method8632();
		} else if (arg0 == 6) {
			this.anInt10255 = arg1.method8593();
		} else if (arg0 == 7) {
			this.anInt10248 = arg1.method8593();
		} else if (arg0 == 8) {
			this.anInt10253 = arg1.method8632();
		} else if (arg0 == 9) {
			this.anInt10244 = arg1.method8632();
		} else if (arg0 == 10) {
			this.anInt10260 = arg1.method8632();
		} else if (arg0 == 11) {
			this.anInt10254 = arg1.method8632();
		} else if (arg0 == 12) {
			local98 = arg1.method8632();
			this.anIntArray898 = new int[local98];
			for (local104 = 0; local104 < local98; local104++) {
				this.anIntArray898[local104] = arg1.method8593();
			}
			for (local119 = 0; local119 < local98; local119++) {
				this.anIntArray898[local119] += arg1.method8593() << 16;
			}
		} else if (arg0 == 13) {
			local98 = arg1.method8593();
			this.anIntArrayArray65 = new int[local98][];
			for (local104 = 0; local104 < local98; local104++) {
				local119 = arg1.method8632();
				if (local119 > 0) {
					this.anIntArrayArray65[local104] = new int[local119];
					this.anIntArrayArray65[local104][0] = arg1.method8607();
					for (local179 = 1; local179 < local119; local179++) {
						this.anIntArrayArray65[local104][local179] = arg1.method8593();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean775 = true;
		} else if (arg0 == 15) {
			this.aBoolean774 = true;
		} else if (arg0 == 16) {
			this.aBoolean772 = true;
		} else if (arg0 == 18) {
			this.aBoolean773 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray903 == null) {
				this.anIntArray903 = new int[this.anIntArrayArray65.length];
				for (local98 = 0; local98 < this.anIntArrayArray65.length; local98++) {
					this.anIntArray903[local98] = 255;
				}
			}
			this.anIntArray903[arg1.method8632()] = arg1.method8632();
		} else if (arg0 == 20) {
			if (this.anIntArray904 == null || this.anIntArray899 == null) {
				this.anIntArray904 = new int[this.anIntArrayArray65.length];
				this.anIntArray899 = new int[this.anIntArrayArray65.length];
				for (local98 = 0; local98 < this.anIntArrayArray65.length; local98++) {
					this.anIntArray904[local98] = 256;
					this.anIntArray899[local98] = 256;
				}
			}
			local98 = arg1.method8632();
			this.anIntArray904[local98] = arg1.method8593();
			this.anIntArray899[local98] = arg1.method8593();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!jp;I)V")
	public void method8973(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8632();
			if (local5 == 0) {
				return;
			}
			this.method8972(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIBLclient!ka;III)Lclient!ka;")
	public Class95 method8974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) Class95 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray900[arg6];
		@Pc(13) int local13 = this.anIntArray901[arg6];
		@Pc(21) Class3_Sub11_Sub1 local21 = this.aClass343_4.method8352(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method5664(arg3, arg0, true);
		}
		@Pc(35) Class3_Sub11_Sub1 local35 = null;
		if ((this.aBoolean774 || Static100.aBoolean144) && arg1 != -1 && this.anIntArray901.length > arg1) {
			@Pc(54) int local54 = this.anIntArray901[arg1];
			local35 = this.aClass343_4.method8352(local54 >> 16);
			arg1 = local54 & 0xFFFF;
		}
		if (this.aBoolean775) {
			arg0 |= 0x200;
		}
		if (local21.method1177(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method1178(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method1176(local25)) {
			arg0 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method1177(arg1)) {
				arg0 |= 0x80;
			}
			if (local35.method1178(arg1)) {
				arg0 |= 0x100;
			}
			if (local35.method1176(arg1)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(151) Class95 local151 = arg4.method5664(arg3, arg0, true);
		local151.method5670(arg5, local25, arg2 - 1, this.aBoolean775, local21, arg1, local8, local35);
		return local151;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZIII)I")
	public int method8975(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(26) int local26 = this.anIntArray901[arg2];
		@Pc(28) Class3_Sub11_Sub1 local28 = null;
		@Pc(38) Class3_Sub11_Sub1 local38 = this.aClass343_4.method8352(local26 >> 16);
		@Pc(42) int local42 = local26 & 0xFFFF;
		if (local38 == null) {
			return 0;
		}
		if ((this.aBoolean774 || Static100.aBoolean144) && arg1 != -1 && arg1 < this.anIntArray901.length) {
			local7 = this.anIntArray901[arg1];
			local28 = this.aClass343_4.method8352(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean775) {
			local5 = 512;
		}
		if (local38.method1177(local42)) {
			local5 |= 0x80;
		}
		if (local38.method1178(local42)) {
			local5 |= 0x100;
		}
		if (local38.method1176(local42)) {
			local5 |= 0x400;
		}
		if (local28 != null) {
			if (local28.method1177(local7)) {
				local5 |= 0x80;
			}
			if (local28.method1178(local7)) {
				local5 |= 0x100;
			}
			if (local28.method1176(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray898 != null && arg0) {
			@Pc(165) int local165;
			@Pc(178) Class3_Sub11_Sub1 local178;
			if (arg2 < this.anIntArray898.length) {
				local165 = this.anIntArray898[arg2];
				if (local165 != 65535) {
					local178 = this.aClass343_4.method8352(local165 >> 16);
					local165 &= 0xFFFF;
					if (local178 != null) {
						if (local178.method1177(local165)) {
							local5 |= 0x80;
						}
						if (local178.method1178(local165)) {
							local5 |= 0x100;
						}
						if (local178.method1176(local165)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean774 || Static100.aBoolean144) && arg1 != -1 && this.anIntArray898.length > arg1) {
				local165 = this.anIntArray898[arg1];
				if (local165 != 65535) {
					local178 = this.aClass343_4.method8352(local165 >> 16);
					local165 &= 0xFFFF;
					if (local178 != null) {
						if (local178.method1177(local165)) {
							local5 |= 0x80;
						}
						if (local178.method1178(local165)) {
							local5 |= 0x100;
						}
						if (local178.method1176(local165)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public void method8977() {
		if (this.anInt10244 == -1) {
			if (this.aBooleanArray54 == null) {
				this.anInt10244 = 0;
			} else {
				this.anInt10244 = 2;
			}
		}
		if (this.anInt10260 != -1) {
			return;
		}
		if (this.aBooleanArray54 == null) {
			this.anInt10260 = 0;
		} else {
			this.anInt10260 = 2;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!ka;ZIII)Lclient!ka;")
	public Class95 method8978(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray900[arg4];
		@Pc(13) int local13 = this.anIntArray901[arg4];
		@Pc(21) Class3_Sub11_Sub1 local21 = this.aClass343_4.method8352(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method5664((byte) 1, arg3, true);
		}
		@Pc(35) Class3_Sub11_Sub1 local35 = null;
		if ((this.aBoolean774 || Static100.aBoolean144) && arg2 != -1 && arg2 < this.anIntArray901.length) {
			@Pc(57) int local57 = this.anIntArray901[arg2];
			local35 = this.aClass343_4.method8352(local57 >> 16);
			arg2 = local57 & 0xFFFF;
		}
		@Pc(71) Class3_Sub11_Sub1 local71 = null;
		@Pc(73) Class3_Sub11_Sub1 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray898 != null) {
			if (this.anIntArray898.length > arg4) {
				local75 = this.anIntArray898[arg4];
				if (local75 != 65535) {
					local71 = this.aClass343_4.method8352(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean774 || Static100.aBoolean144) && arg2 != -1 && this.anIntArray898.length > arg2) {
				local77 = this.anIntArray898[arg2];
				if (local77 != 65535) {
					local73 = this.aClass343_4.method8352(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean775) {
			arg3 |= 0x200;
		}
		if (local21.method1177(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method1178(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method1176(local25)) {
			arg3 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method1177(local75)) {
				arg3 |= 0x80;
			}
			if (local71.method1178(local75)) {
				arg3 |= 0x100;
			}
			if (local71.method1176(local75)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method1177(arg2)) {
				arg3 |= 0x80;
			}
			if (local35.method1178(arg2)) {
				arg3 |= 0x100;
			}
			if (local35.method1176(arg2)) {
				arg3 |= 0x400;
			}
		}
		if (local73 != null) {
			if (local73.method1177(local77)) {
				arg3 |= 0x80;
			}
			if (local73.method1178(local77)) {
				arg3 |= 0x100;
			}
			if (local73.method1176(local77)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(274) Class95 local274 = arg1.method5664((byte) 1, arg3, true);
		local274.method5670(0, local25, arg0 - 1, this.aBoolean775, local21, arg2, local8, local35);
		if (local71 != null) {
			local274.method5670(0, local75, arg0 - 1, this.aBoolean775, local71, local77, local8, local73);
		}
		return local274;
	}
}
