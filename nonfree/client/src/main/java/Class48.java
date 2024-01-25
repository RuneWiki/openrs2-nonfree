import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class48 {

	@OriginalMember(owner = "client!c", name = "d", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[Z")
	public boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public int anInt1551;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "Lclient!vf;")
	public Class373 aClass373_1;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
	public boolean aBoolean137 = false;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	public int anInt1546 = 2;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "I")
	public int anInt1548 = -1;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	public int anInt1541 = -1;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "I")
	public int anInt1550 = 5;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public int anInt1540 = -1;

	@OriginalMember(owner = "client!c", name = "C", descriptor = "I")
	public int anInt1556 = 99;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "I")
	public int anInt1554 = -1;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	public int anInt1555 = -1;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIBLclient!ka;)Lclient!ka;")
	public Class28 method1516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class28 arg4) {
		@Pc(8) int local8 = this.anIntArray68[arg0];
		@Pc(13) int local13 = this.anIntArray72[arg0];
		@Pc(21) Class3_Sub6_Sub11 local21 = this.aClass373_1.method8321(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method6900((byte) 1, arg3, true);
		}
		@Pc(35) Class3_Sub6_Sub11 local35 = null;
		if ((this.aBoolean139 || Static296.aBoolean620) && arg1 != -1 && arg1 < this.anIntArray72.length) {
			@Pc(54) int local54 = this.anIntArray72[arg1];
			local35 = this.aClass373_1.method8321(local54 >> 16);
			arg1 = local54 & 0xFFFF;
		}
		@Pc(68) Class3_Sub6_Sub11 local68 = null;
		@Pc(70) Class3_Sub6_Sub11 local70 = null;
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		if (this.anIntArray73 != null) {
			if (this.anIntArray73.length > arg0) {
				local77 = this.anIntArray73[arg0];
				if (local77 != 65535) {
					local68 = this.aClass373_1.method8321(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
			if ((this.aBoolean139 || Static296.aBoolean620) && arg1 != -1 && this.anIntArray73.length > arg1) {
				local79 = this.anIntArray73[arg1];
				if (local79 != 65535) {
					local70 = this.aClass373_1.method8321(local79 >> 16);
					local79 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean138) {
			arg3 |= 0x200;
		}
		if (local21.method4042(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method4044(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method4037(local25)) {
			arg3 |= 0x400;
		}
		if (local68 != null) {
			if (local68.method4042(local77)) {
				arg3 |= 0x80;
			}
			if (local68.method4044(local77)) {
				arg3 |= 0x100;
			}
			if (local68.method4037(local77)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method4042(arg1)) {
				arg3 |= 0x80;
			}
			if (local35.method4044(arg1)) {
				arg3 |= 0x100;
			}
			if (local35.method4037(arg1)) {
				arg3 |= 0x400;
			}
		}
		if (local70 != null) {
			if (local70.method4042(local79)) {
				arg3 |= 0x80;
			}
			if (local70.method4044(local79)) {
				arg3 |= 0x100;
			}
			if (local70.method4037(local79)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(277) Class28 local277 = arg4.method6900((byte) 1, arg3, true);
		local277.method6893(0, this.aBoolean138, local8, arg2 - 1, arg1, local21, local35, local25);
		if (local68 != null) {
			local277.method6893(0, this.aBoolean138, local8, arg2 - 1, local79, local68, local70, local77);
		}
		return local277;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!fca;)V")
	private void method1517(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		@Pc(88) int local88;
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(309) int local309;
		if (arg0 == 1) {
			local88 = arg1.method4858();
			this.anIntArray68 = new int[local88];
			for (local94 = 0; local94 < local88; local94++) {
				this.anIntArray68[local94] = arg1.method4858();
			}
			this.anIntArray72 = new int[local88];
			for (local111 = 0; local111 < local88; local111++) {
				this.anIntArray72[local111] = arg1.method4858();
			}
			for (local309 = 0; local309 < local88; local309++) {
				this.anIntArray72[local309] = (arg1.method4858() << 16) + this.anIntArray72[local309];
			}
		} else if (arg0 == 2) {
			this.anInt1548 = arg1.method4858();
		} else if (arg0 == 3) {
			this.aBooleanArray6 = new boolean[256];
			local88 = arg1.method4888();
			for (local94 = 0; local94 < local88; local94++) {
				this.aBooleanArray6[arg1.method4888()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt1550 = arg1.method4888();
		} else if (arg0 == 6) {
			this.anInt1554 = arg1.method4858();
		} else if (arg0 == 7) {
			this.anInt1540 = arg1.method4858();
		} else if (arg0 == 8) {
			this.anInt1556 = arg1.method4888();
		} else if (arg0 == 9) {
			this.anInt1555 = arg1.method4888();
		} else if (arg0 == 10) {
			this.anInt1541 = arg1.method4888();
		} else if (arg0 == 11) {
			this.anInt1546 = arg1.method4888();
		} else if (arg0 == 12) {
			local88 = arg1.method4888();
			this.anIntArray73 = new int[local88];
			for (local94 = 0; local94 < local88; local94++) {
				this.anIntArray73[local94] = arg1.method4858();
			}
			for (local111 = 0; local111 < local88; local111++) {
				this.anIntArray73[local111] = (arg1.method4858() << 16) + this.anIntArray73[local111];
			}
		} else if (arg0 == 13) {
			local88 = arg1.method4858();
			this.anIntArrayArray15 = new int[local88][];
			for (local94 = 0; local94 < local88; local94++) {
				local111 = arg1.method4888();
				if (local111 > 0) {
					this.anIntArrayArray15[local94] = new int[local111];
					this.anIntArrayArray15[local94][0] = arg1.method4862();
					for (local309 = 1; local309 < local111; local309++) {
						this.anIntArrayArray15[local94][local309] = arg1.method4858();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean138 = true;
		} else if (arg0 == 15) {
			this.aBoolean139 = true;
		} else if (arg0 == 16) {
			this.aBoolean140 = true;
		} else if (arg0 == 18) {
			this.aBoolean137 = true;
			return;
		} else if (arg0 == 19) {
			if (this.anIntArray71 == null) {
				this.anIntArray71 = new int[this.anIntArrayArray15.length];
				for (local88 = 0; local88 < this.anIntArrayArray15.length; local88++) {
					this.anIntArray71[local88] = 255;
				}
			}
			this.anIntArray71[arg1.method4888()] = arg1.method4888();
			return;
		} else if (arg0 == 20) {
			if (this.anIntArray70 == null || this.anIntArray69 == null) {
				this.anIntArray70 = new int[this.anIntArrayArray15.length];
				this.anIntArray69 = new int[this.anIntArrayArray15.length];
				for (local88 = 0; local88 < this.anIntArrayArray15.length; local88++) {
					this.anIntArray70[local88] = 256;
					this.anIntArray69[local88] = 256;
				}
			}
			local88 = arg1.method4888();
			this.anIntArray70[local88] = arg1.method4858();
			this.anIntArray69[local88] = arg1.method4858();
			return;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIBIBLclient!ka;)Lclient!ka;")
	public Class28 method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) Class28 arg6) {
		@Pc(8) int local8 = this.anIntArray68[arg0];
		@Pc(13) int local13 = this.anIntArray72[arg0];
		@Pc(21) Class3_Sub6_Sub11 local21 = this.aClass373_1.method8321(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg6.method6900(arg5, arg4, true);
		}
		@Pc(35) Class3_Sub6_Sub11 local35 = null;
		if ((this.aBoolean139 || Static296.aBoolean620) && arg3 != -1 && this.anIntArray72.length > arg3) {
			@Pc(54) int local54 = this.anIntArray72[arg3];
			local35 = this.aClass373_1.method8321(local54 >> 16);
			arg3 = local54 & 0xFFFF;
		}
		if (this.aBoolean138) {
			arg4 |= 0x200;
		}
		if (local21.method4042(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method4044(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method4037(local25)) {
			arg4 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method4042(arg3)) {
				arg4 |= 0x80;
			}
			if (local35.method4044(arg3)) {
				arg4 |= 0x100;
			}
			if (local35.method4037(arg3)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(145) Class28 local145 = arg6.method6900(arg5, arg4, true);
		local145.method6893(arg2, this.aBoolean138, local8, arg1 - 1, arg3, local21, local35, local25);
		return local145;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public void method1519() {
		if (this.anInt1555 == -1) {
			if (this.aBooleanArray6 == null) {
				this.anInt1555 = 0;
			} else {
				this.anInt1555 = 2;
			}
		}
		if (this.anInt1541 != -1) {
			return;
		}
		if (this.aBooleanArray6 == null) {
			this.anInt1541 = 0;
		} else {
			this.anInt1541 = 2;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIIZ)I")
	public int method1520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray72[arg0];
		@Pc(14) Class3_Sub6_Sub11 local14 = null;
		@Pc(22) Class3_Sub6_Sub11 local22 = this.aClass373_1.method8321(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean139 || Static296.aBoolean620) && arg1 != -1 && this.anIntArray72.length > arg1) {
			local7 = this.anIntArray72[arg1];
			local14 = this.aClass373_1.method8321(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean138) {
			local5 = 512;
		}
		if (local22.method4042(local26)) {
			local5 |= 0x80;
		}
		if (local22.method4044(local26)) {
			local5 |= 0x100;
		}
		if (local22.method4037(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method4042(local7)) {
				local5 |= 0x80;
			}
			if (local14.method4044(local7)) {
				local5 |= 0x100;
			}
			if (local14.method4037(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray73 != null && arg2) {
			@Pc(149) int local149;
			@Pc(162) Class3_Sub6_Sub11 local162;
			if (this.anIntArray73.length > arg0) {
				local149 = this.anIntArray73[arg0];
				if (local149 != 65535) {
					local162 = this.aClass373_1.method8321(local149 >> 16);
					local149 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method4042(local149)) {
							local5 |= 0x80;
						}
						if (local162.method4044(local149)) {
							local5 |= 0x100;
						}
						if (local162.method4037(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean139 || Static296.aBoolean620) && arg1 != -1 && arg1 < this.anIntArray73.length) {
				local149 = this.anIntArray73[arg1];
				if (local149 != 65535) {
					local162 = this.aClass373_1.method8321(local149 >> 16);
					local149 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method4042(local149)) {
							local5 |= 0x80;
						}
						if (local162.method4044(local149)) {
							local5 |= 0x100;
						}
						if (local162.method4037(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!fca;I)V")
	public void method1522(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4888();
			if (local13 == 0) {
				return;
			}
			this.method1517(local13, arg0);
		}
	}
}
