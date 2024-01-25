import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class130 {

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "Lclient!lfa;")
	public Class193 aClass193_2;

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "[I")
	public int[] anIntArray238;

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "[Z")
	public boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "[I")
	public int[] anIntArray241;

	@OriginalMember(owner = "client!hg", name = "G", descriptor = "[I")
	public int[] anIntArray242;

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
	public int anInt4713;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Z")
	public boolean aBoolean347 = false;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	public int anInt4698 = -1;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "Z")
	public boolean aBoolean346 = false;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
	public int anInt4703 = -1;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
	public int anInt4699 = 5;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "Z")
	public boolean aBoolean349 = false;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
	public int anInt4711 = -1;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
	public int anInt4706 = -1;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
	public int anInt4705 = 2;

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
	public int anInt4710 = -1;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	public int anInt4702 = 99;

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "Z")
	public boolean aBoolean350 = false;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIZ)I")
	public int method4093(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray237[arg1];
		@Pc(14) Class2_Sub6_Sub9 local14 = null;
		@Pc(22) Class2_Sub6_Sub9 local22 = this.aClass193_2.method5577(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean346 || Static225.aBoolean373) && arg0 != -1 && arg0 < this.anIntArray237.length) {
			local7 = this.anIntArray237[arg0];
			local14 = this.aClass193_2.method5577(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean347) {
			local5 = 512;
		}
		if (local22.method3992(local26)) {
			local5 |= 0x80;
		}
		if (local22.method3991(local26)) {
			local5 |= 0x100;
		}
		if (local22.method3987(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method3992(local7)) {
				local5 |= 0x80;
			}
			if (local14.method3991(local7)) {
				local5 |= 0x100;
			}
			if (local14.method3987(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray240 != null && arg2) {
			@Pc(148) int local148;
			@Pc(161) Class2_Sub6_Sub9 local161;
			if (arg1 < this.anIntArray240.length) {
				local148 = this.anIntArray240[arg1];
				if (local148 != 65535) {
					local161 = this.aClass193_2.method5577(local148 >> 16);
					local148 &= 0xFFFF;
					if (local161 != null) {
						if (local161.method3992(local148)) {
							local5 |= 0x80;
						}
						if (local161.method3991(local148)) {
							local5 |= 0x100;
						}
						if (local161.method3987(local148)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean346 || Static225.aBoolean373) && arg0 != -1 && arg0 < this.anIntArray240.length) {
				local148 = this.anIntArray240[arg0];
				if (local148 != 65535) {
					local161 = this.aClass193_2.method5577(local148 >> 16);
					local148 &= 0xFFFF;
					if (local161 != null) {
						if (local161.method3992(local148)) {
							local5 |= 0x80;
						}
						if (local161.method3991(local148)) {
							local5 |= 0x100;
						}
						if (local161.method3987(local148)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!cea;II)V")
	private void method4094(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(39) int local39;
		@Pc(54) int local54;
		if (arg1 == 1) {
			local14 = arg0.method8326();
			this.anIntArray242 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray242[local20] = arg0.method8326();
			}
			this.anIntArray237 = new int[local14];
			for (local39 = 0; local39 < local14; local39++) {
				this.anIntArray237[local39] = arg0.method8326();
			}
			for (local54 = 0; local54 < local14; local54++) {
				this.anIntArray237[local54] += arg0.method8326() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt4698 = arg0.method8326();
		} else if (arg1 == 3) {
			this.aBooleanArray11 = new boolean[256];
			local14 = arg0.method8383();
			for (local20 = 0; local20 < local14; local20++) {
				this.aBooleanArray11[arg0.method8383()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt4699 = arg0.method8383();
		} else if (arg1 == 6) {
			this.anInt4706 = arg0.method8326();
		} else if (arg1 == 7) {
			this.anInt4710 = arg0.method8326();
		} else if (arg1 == 8) {
			this.anInt4702 = arg0.method8383();
		} else if (arg1 == 9) {
			this.anInt4711 = arg0.method8383();
		} else if (arg1 == 10) {
			this.anInt4703 = arg0.method8383();
		} else if (arg1 == 11) {
			this.anInt4705 = arg0.method8383();
		} else if (arg1 == 12) {
			local14 = arg0.method8383();
			this.anIntArray240 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray240[local20] = arg0.method8326();
			}
			for (local39 = 0; local39 < local14; local39++) {
				this.anIntArray240[local39] = (arg0.method8326() << 16) + this.anIntArray240[local39];
			}
		} else if (arg1 == 13) {
			local14 = arg0.method8326();
			this.anIntArrayArray21 = new int[local14][];
			for (local20 = 0; local20 < local14; local20++) {
				local39 = arg0.method8383();
				if (local39 > 0) {
					this.anIntArrayArray21[local20] = new int[local39];
					this.anIntArrayArray21[local20][0] = arg0.method8347();
					for (local54 = 1; local54 < local39; local54++) {
						this.anIntArrayArray21[local20][local54] = arg0.method8326();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean347 = true;
		} else if (arg1 == 15) {
			this.aBoolean346 = true;
		} else if (arg1 == 16) {
			this.aBoolean349 = true;
		} else if (arg1 == 18) {
			this.aBoolean350 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray238 == null) {
				this.anIntArray238 = new int[this.anIntArrayArray21.length];
				for (local14 = 0; local14 < this.anIntArrayArray21.length; local14++) {
					this.anIntArray238[local14] = 255;
				}
			}
			this.anIntArray238[arg0.method8383()] = arg0.method8383();
		} else if (arg1 == 20) {
			if (this.anIntArray236 == null || this.anIntArray241 == null) {
				this.anIntArray236 = new int[this.anIntArrayArray21.length];
				this.anIntArray241 = new int[this.anIntArrayArray21.length];
				for (local14 = 0; local14 < this.anIntArrayArray21.length; local14++) {
					this.anIntArray236[local14] = 256;
					this.anIntArray241[local14] = 256;
				}
			}
			local14 = arg0.method8383();
			this.anIntArray236[local14] = arg0.method8326();
			this.anIntArray241[local14] = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ka;IIBIIII)Lclient!ka;")
	public Class166 method4096(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray242[arg4];
		@Pc(13) int local13 = this.anIntArray237[arg4];
		@Pc(21) Class2_Sub6_Sub9 local21 = this.aClass193_2.method5577(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method6684(arg3, arg6, true);
		}
		@Pc(35) Class2_Sub6_Sub9 local35 = null;
		if ((this.aBoolean346 || Static225.aBoolean373) && arg2 != -1 && arg2 < this.anIntArray237.length) {
			@Pc(57) int local57 = this.anIntArray237[arg2];
			local35 = this.aClass193_2.method5577(local57 >> 16);
			arg2 = local57 & 0xFFFF;
		}
		if (this.aBoolean347) {
			arg6 |= 0x200;
		}
		if (local21.method3992(local25)) {
			arg6 |= 0x80;
		}
		if (local21.method3991(local25)) {
			arg6 |= 0x100;
		}
		if (local21.method3987(local25)) {
			arg6 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method3992(arg2)) {
				arg6 |= 0x80;
			}
			if (local35.method3991(arg2)) {
				arg6 |= 0x100;
			}
			if (local35.method3987(arg2)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(152) Class166 local152 = arg0.method6684(arg3, arg6, true);
		local152.method6687(local25, local8, local35, arg1, local21, this.aBoolean347, arg2, arg5 - 1);
		return local152;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!cea;Z)V")
	public void method4097(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8383();
			if (local9 == 0) {
				return;
			}
			this.method4094(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!ka;IIII)Lclient!ka;")
	public Class166 method4099(@OriginalArg(1) Class166 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray242[arg4];
		@Pc(13) int local13 = this.anIntArray237[arg4];
		@Pc(21) Class2_Sub6_Sub9 local21 = this.aClass193_2.method5577(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method6684((byte) 1, arg3, true);
		}
		@Pc(35) Class2_Sub6_Sub9 local35 = null;
		if ((this.aBoolean346 || Static225.aBoolean373) && arg1 != -1 && this.anIntArray237.length > arg1) {
			@Pc(53) int local53 = this.anIntArray237[arg1];
			local35 = this.aClass193_2.method5577(local53 >> 16);
			arg1 = local53 & 0xFFFF;
		}
		@Pc(67) Class2_Sub6_Sub9 local67 = null;
		@Pc(69) Class2_Sub6_Sub9 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray240 != null) {
			if (this.anIntArray240.length > arg4) {
				local71 = this.anIntArray240[arg4];
				if (local71 != 65535) {
					local67 = this.aClass193_2.method5577(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean346 || Static225.aBoolean373) && arg1 != -1 && this.anIntArray240.length > arg1) {
				local73 = this.anIntArray240[arg1];
				if (local73 != 65535) {
					local69 = this.aClass193_2.method5577(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean347) {
			arg3 |= 0x200;
		}
		if (local21.method3992(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method3991(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method3987(local25)) {
			arg3 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method3992(local71)) {
				arg3 |= 0x80;
			}
			if (local67.method3991(local71)) {
				arg3 |= 0x100;
			}
			if (local67.method3987(local71)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method3992(arg1)) {
				arg3 |= 0x80;
			}
			if (local35.method3991(arg1)) {
				arg3 |= 0x100;
			}
			if (local35.method3987(arg1)) {
				arg3 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method3992(local73)) {
				arg3 |= 0x80;
			}
			if (local69.method3991(local73)) {
				arg3 |= 0x100;
			}
			if (local69.method3987(local73)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(272) Class166 local272 = arg0.method6684((byte) 1, arg3, true);
		local272.method6687(local25, local8, local35, 0, local21, this.aBoolean347, arg1, arg2 - 1);
		if (local67 != null) {
			local272.method6687(local71, local8, local69, 0, local67, this.aBoolean347, local73, arg2 - 1);
		}
		return local272;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	public void method4100() {
		if (this.anInt4711 == -1) {
			if (this.aBooleanArray11 == null) {
				this.anInt4711 = 0;
			} else {
				this.anInt4711 = 2;
			}
		}
		if (this.anInt4703 != -1) {
			return;
		}
		if (this.aBooleanArray11 == null) {
			this.anInt4703 = 0;
		} else {
			this.anInt4703 = 2;
		}
	}
}
