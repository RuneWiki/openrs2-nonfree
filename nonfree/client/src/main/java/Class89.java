import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class89 {

	@OriginalMember(owner = "client!i", name = "d", descriptor = "[Z")
	public boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
	public int[] anIntArray244;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
	public int[] anIntArray245;

	@OriginalMember(owner = "client!i", name = "u", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!i", name = "B", descriptor = "I")
	public int anInt2467;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Z")
	public boolean aBoolean183 = false;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public int anInt2456 = -1;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "I")
	public int anInt2461 = -1;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Z")
	public boolean aBoolean184 = false;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	public int anInt2458 = 99;

	@OriginalMember(owner = "client!i", name = "A", descriptor = "I")
	public int anInt2466 = -1;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Z")
	public boolean aBoolean186 = false;

	@OriginalMember(owner = "client!i", name = "z", descriptor = "I")
	public int anInt2465 = 5;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public int anInt2454 = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public int anInt2451 = -1;

	@OriginalMember(owner = "client!i", name = "C", descriptor = "I")
	public int anInt2468 = 2;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIBLclient!ts;II)Lclient!ts;")
	public Class112 method2265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class112 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray244[arg3];
		@Pc(13) int local13 = this.anIntArray245[arg3];
		@Pc(19) Class5_Sub1_Sub9 local19 = Static207.method3801(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg2.method4349((byte) 1, arg1, true);
		}
		@Pc(33) Class5_Sub1_Sub9 local33 = null;
		if ((this.aBoolean185 || Static85.aBoolean108) && arg4 != -1 && this.anIntArray245.length > arg4) {
			@Pc(55) int local55 = this.anIntArray245[arg4];
			local33 = Static207.method3801(local55 >> 16);
			arg4 = local55 & 0xFFFF;
		}
		@Pc(67) Class5_Sub1_Sub9 local67 = null;
		@Pc(69) Class5_Sub1_Sub9 local69 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray246 != null) {
			if (this.anIntArray246.length > arg3) {
				local76 = this.anIntArray246[arg3];
				if (local76 != 65535) {
					local67 = Static207.method3801(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean185 || Static85.aBoolean108) && arg4 != -1 && arg4 < this.anIntArray246.length) {
				local78 = this.anIntArray246[arg4];
				if (local78 != 65535) {
					local69 = Static207.method3801(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean184) {
			arg1 |= 0x200;
		}
		if (local19.method2462(local23)) {
			arg1 |= 0x80;
		}
		if (local19.method2461(local23)) {
			arg1 |= 0x100;
		}
		if (local67 != null) {
			if (local67.method2462(local76)) {
				arg1 |= 0x80;
			}
			if (local67.method2461(local76)) {
				arg1 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method2462(arg4)) {
				arg1 |= 0x80;
			}
			if (local33.method2461(arg4)) {
				arg1 |= 0x100;
			}
		}
		if (local69 != null) {
			if (local69.method2462(local78)) {
				arg1 |= 0x80;
			}
			if (local69.method2461(local78)) {
				arg1 |= 0x100;
			}
		}
		arg1 |= 0x20;
		@Pc(233) Class112 local233 = arg2.method4349((byte) 1, arg1, true);
		local233.method4333(local8, this.aBoolean184, local23, arg4, local19, local33, 0, arg0 - 1);
		if (local67 != null) {
			local233.method4333(local8, this.aBoolean184, local76, local78, local67, local69, 0, arg0 - 1);
		}
		return local233;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public void method2267() {
		if (this.anInt2454 == -1) {
			if (this.aBooleanArray9 == null) {
				this.anInt2454 = 0;
			} else {
				this.anInt2454 = 2;
			}
		}
		if (this.anInt2456 != -1) {
			return;
		}
		if (this.aBooleanArray9 == null) {
			this.anInt2456 = 0;
		} else {
			this.anInt2456 = 2;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!rg;Z)V")
	public void method2268(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method5115();
			if (local8 == 0) {
				return;
			}
			this.method2271(local8, arg0);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZI)I")
	public int method2269(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray245[arg0];
		@Pc(14) Class5_Sub1_Sub9 local14 = null;
		@Pc(20) Class5_Sub1_Sub9 local20 = Static207.method3801(local12 >> 16);
		@Pc(24) int local24 = local12 & 0xFFFF;
		if (local20 == null) {
			return 0;
		}
		if ((this.aBoolean185 || Static85.aBoolean108) && arg2 != -1 && this.anIntArray245.length > arg2) {
			local7 = this.anIntArray245[arg2];
			local14 = Static207.method3801(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean184) {
			local5 = 512;
		}
		if (local20.method2462(local24)) {
			local5 |= 0x80;
		}
		if (local20.method2461(local24)) {
			local5 |= 0x100;
		}
		if (local14 != null) {
			if (local14.method2462(local7)) {
				local5 |= 0x80;
			}
			if (local14.method2461(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray246 != null && arg1) {
			@Pc(124) int local124;
			@Pc(133) Class5_Sub1_Sub9 local133;
			if (arg0 < this.anIntArray246.length) {
				local124 = this.anIntArray246[arg0];
				if (local124 != 65535) {
					local133 = Static207.method3801(local124 >> 16);
					local124 &= 0xFFFF;
					if (local133 != null) {
						if (local133.method2462(local124)) {
							local5 |= 0x80;
						}
						if (local133.method2461(local124)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean185 || Static85.aBoolean108) && arg2 != -1 && arg2 < this.anIntArray246.length) {
				local124 = this.anIntArray246[arg2];
				if (local124 != 65535) {
					local133 = Static207.method3801(local124 >> 16);
					local124 &= 0xFFFF;
					if (local133 != null) {
						if (local133.method2462(local124)) {
							local5 |= 0x80;
						}
						if (local133.method2461(local124)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIIIIBLclient!ts;)Lclient!ts;")
	public Class112 method2270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) Class112 arg6) {
		@Pc(8) int local8 = this.anIntArray244[arg1];
		@Pc(13) int local13 = this.anIntArray245[arg1];
		@Pc(19) Class5_Sub1_Sub9 local19 = Static207.method3801(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg6.method4349((byte) 1, arg0, true);
		}
		@Pc(33) Class5_Sub1_Sub9 local33 = null;
		if ((this.aBoolean185 || Static85.aBoolean108) && arg3 != -1 && this.anIntArray245.length > arg3) {
			@Pc(55) int local55 = this.anIntArray245[arg3];
			local33 = Static207.method3801(local55 >> 16);
			arg3 = local55 & 0xFFFF;
		}
		if (this.aBoolean184) {
			arg0 |= 0x200;
		}
		if (local19.method2462(local23)) {
			arg0 |= 0x80;
		}
		if (local19.method2461(local23)) {
			arg0 |= 0x100;
		}
		if (local33 != null) {
			if (local33.method2462(arg3)) {
				arg0 |= 0x80;
			}
			if (local33.method2461(arg3)) {
				arg0 |= 0x100;
			}
		}
		arg0 |= 0x20;
		@Pc(125) Class112 local125 = arg6.method4349(arg5, arg0, true);
		local125.method4333(local8, this.aBoolean184, local23, arg3, local19, local33, arg2, arg4 - 1);
		return local125;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!rg;)V")
	private void method2271(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		@Pc(32) int local32;
		@Pc(46) int local46;
		if (arg0 == 1) {
			local8 = arg1.method5106();
			this.anIntArray244 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray244[local14] = arg1.method5106();
			}
			this.anIntArray245 = new int[local8];
			for (local32 = 0; local32 < local8; local32++) {
				this.anIntArray245[local32] = arg1.method5106();
			}
			for (local46 = 0; local46 < local8; local46++) {
				this.anIntArray245[local46] = (arg1.method5106() << 16) + this.anIntArray245[local46];
			}
		} else if (arg0 == 2) {
			this.anInt2466 = arg1.method5106();
		} else if (arg0 == 3) {
			this.aBooleanArray9 = new boolean[256];
			local8 = arg1.method5115();
			for (local14 = 0; local14 < local8; local14++) {
				this.aBooleanArray9[arg1.method5115()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean186 = true;
		} else if (arg0 == 5) {
			this.anInt2465 = arg1.method5115();
		} else if (arg0 == 6) {
			this.anInt2451 = arg1.method5106();
		} else if (arg0 == 7) {
			this.anInt2461 = arg1.method5106();
		} else if (arg0 == 8) {
			this.anInt2458 = arg1.method5115();
		} else if (arg0 == 9) {
			this.anInt2454 = arg1.method5115();
		} else if (arg0 == 10) {
			this.anInt2456 = arg1.method5115();
		} else if (arg0 == 11) {
			this.anInt2468 = arg1.method5115();
		} else if (arg0 == 12) {
			local8 = arg1.method5115();
			this.anIntArray246 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray246[local14] = arg1.method5106();
			}
			for (local32 = 0; local32 < local8; local32++) {
				this.anIntArray246[local32] = (arg1.method5106() << 16) + this.anIntArray246[local32];
			}
		} else if (arg0 == 13) {
			local8 = arg1.method5106();
			this.anIntArrayArray47 = new int[local8][];
			for (local14 = 0; local14 < local8; local14++) {
				local32 = arg1.method5115();
				if (local32 > 0) {
					this.anIntArrayArray47[local14] = new int[local32];
					this.anIntArrayArray47[local14][0] = arg1.method5072();
					for (local46 = 1; local46 < local32; local46++) {
						this.anIntArrayArray47[local14][local46] = arg1.method5106();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean184 = true;
		} else if (arg0 == 15) {
			this.aBoolean185 = true;
		} else if (arg0 == 16) {
			this.aBoolean183 = true;
		}
	}
}
