import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class137 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "[Z")
	public boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "Lclient!gs;")
	public Class98 aClass98_1;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "[I")
	public int[] anIntArray403;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
	public int anInt4041;

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "[I")
	public int[] anIntArray404;

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
	public int anInt4038 = -1;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
	public int anInt4040 = 5;

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
	public int anInt4039 = 2;

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "Z")
	public boolean aBoolean273 = false;

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
	public int anInt4044 = -1;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
	public int anInt4033 = -1;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "Z")
	public boolean aBoolean272 = false;

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
	public int anInt4034 = 0;

	@OriginalMember(owner = "client!jv", name = "z", descriptor = "I")
	public int anInt4048 = -1;

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
	public int anInt4046 = -1;

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "I")
	public int anInt4047 = 99;

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "Z")
	public boolean aBoolean271 = false;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	public void method3207() {
		if (this.anInt4038 == -1) {
			if (this.aBooleanArray11 == null) {
				this.anInt4038 = 0;
			} else {
				this.anInt4038 = 2;
			}
		}
		if (this.anInt4044 != -1) {
			return;
		}
		if (this.aBooleanArray11 == null) {
			this.anInt4044 = 0;
		} else {
			this.anInt4044 = 2;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!nn;BI)V")
	private void method3208(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(116) int local116;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(149) int local149;
		if (arg1 == 1) {
			local116 = arg0.method2485();
			this.anIntArray404 = new int[local116];
			for (local122 = 0; local122 < local116; local122++) {
				this.anIntArray404[local122] = arg0.method2485();
			}
			this.anIntArray403 = new int[local116];
			for (local130 = 0; local130 < local116; local130++) {
				this.anIntArray403[local130] = arg0.method2485();
			}
			for (local149 = 0; local149 < local116; local149++) {
				this.anIntArray403[local149] = (arg0.method2485() << 16) + this.anIntArray403[local149];
			}
		} else if (arg1 == 2) {
			this.anInt4046 = arg0.method2485();
		} else if (arg1 == 3) {
			this.aBooleanArray11 = new boolean[256];
			local116 = arg0.method2502();
			for (local122 = 0; local122 < local116; local122++) {
				this.aBooleanArray11[arg0.method2502()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt4040 = arg0.method2502();
		} else if (arg1 == 6) {
			this.anInt4048 = arg0.method2485();
		} else if (arg1 == 7) {
			this.anInt4033 = arg0.method2485();
		} else if (arg1 == 8) {
			this.anInt4047 = arg0.method2502();
		} else if (arg1 == 9) {
			this.anInt4044 = arg0.method2502();
		} else if (arg1 == 10) {
			this.anInt4038 = arg0.method2502();
		} else if (arg1 == 11) {
			this.anInt4039 = arg0.method2502();
		} else if (arg1 == 12) {
			local116 = arg0.method2502();
			this.anIntArray402 = new int[local116];
			for (local122 = 0; local122 < local116; local122++) {
				this.anIntArray402[local122] = arg0.method2485();
			}
			for (local130 = 0; local130 < local116; local130++) {
				this.anIntArray402[local130] += arg0.method2485() << 16;
			}
		} else if (arg1 == 13) {
			local116 = arg0.method2485();
			this.anIntArrayArray37 = new int[local116][];
			for (local122 = 0; local122 < local116; local122++) {
				local130 = arg0.method2502();
				if (local130 > 0) {
					this.anIntArrayArray37[local122] = new int[local130];
					this.anIntArrayArray37[local122][0] = arg0.method2507();
					for (local149 = 1; local149 < local130; local149++) {
						this.anIntArrayArray37[local122][local149] = arg0.method2485();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean273 = true;
		} else if (arg1 == 15) {
			this.aBoolean272 = true;
		} else if (arg1 == 16) {
			this.aBoolean271 = true;
		} else if (arg1 == 17) {
			this.anInt4034 = arg0.method2502();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIBIILclient!e;I)Lclient!e;")
	public Class63 method3209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class63 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray404[arg0];
		@Pc(13) int local13 = this.anIntArray403[arg0];
		@Pc(21) Class10_Sub1_Sub4 local21 = this.aClass98_1.method2409(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg5.method6093(arg2, arg6, true);
		}
		@Pc(35) Class10_Sub1_Sub4 local35 = null;
		if ((this.aBoolean272 || Static102.aBoolean131) && arg1 != -1 && arg1 < this.anIntArray403.length) {
			@Pc(53) int local53 = this.anIntArray403[arg1];
			local35 = this.aClass98_1.method2409(local53 >> 16);
			arg1 = local53 & 0xFFFF;
		}
		if (this.aBoolean273) {
			arg6 |= 0x200;
		}
		if (local21.method1706(local25)) {
			arg6 |= 0x80;
		}
		if (local21.method1711(local25)) {
			arg6 |= 0x100;
		}
		if (local21.method1709(local25)) {
			arg6 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method1706(arg1)) {
				arg6 |= 0x80;
			}
			if (local35.method1711(arg1)) {
				arg6 |= 0x100;
			}
			if (local35.method1709(arg1)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(140) Class63 local140 = arg5.method6093(arg2, arg6, true);
		local140.method6091(this.aBoolean273, arg3, local8, arg4 - 1, local21, arg1, local35, local25);
		return local140;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILclient!e;III)Lclient!e;")
	public Class63 method3210(@OriginalArg(0) int arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray404[arg3];
		@Pc(13) int local13 = this.anIntArray403[arg3];
		@Pc(21) Class10_Sub1_Sub4 local21 = this.aClass98_1.method2409(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method6093((byte) 1, arg4, true);
		}
		@Pc(35) Class10_Sub1_Sub4 local35 = null;
		if ((this.aBoolean272 || Static102.aBoolean131) && arg2 != -1 && arg2 < this.anIntArray403.length) {
			@Pc(54) int local54 = this.anIntArray403[arg2];
			local35 = this.aClass98_1.method2409(local54 >> 16);
			arg2 = local54 & 0xFFFF;
		}
		@Pc(68) Class10_Sub1_Sub4 local68 = null;
		@Pc(70) Class10_Sub1_Sub4 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray402 != null) {
			if (arg3 < this.anIntArray402.length) {
				local72 = this.anIntArray402[arg3];
				if (local72 != 65535) {
					local68 = this.aClass98_1.method2409(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean272 || Static102.aBoolean131) && arg2 != -1 && this.anIntArray402.length > arg2) {
				local74 = this.anIntArray402[arg2];
				if (local74 != 65535) {
					local70 = this.aClass98_1.method2409(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean273) {
			arg4 |= 0x200;
		}
		if (local21.method1706(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method1711(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method1709(local25)) {
			arg4 |= 0x400;
		}
		if (local68 != null) {
			if (local68.method1706(local72)) {
				arg4 |= 0x80;
			}
			if (local68.method1711(local72)) {
				arg4 |= 0x100;
			}
			if (local68.method1709(local72)) {
				arg4 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method1706(arg2)) {
				arg4 |= 0x80;
			}
			if (local35.method1711(arg2)) {
				arg4 |= 0x100;
			}
			if (local35.method1709(arg2)) {
				arg4 |= 0x400;
			}
		}
		if (local70 != null) {
			if (local70.method1706(local74)) {
				arg4 |= 0x80;
			}
			if (local70.method1711(local74)) {
				arg4 |= 0x100;
			}
			if (local70.method1709(local74)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(285) Class63 local285 = arg1.method6093((byte) 1, arg4, true);
		local285.method6091(this.aBoolean273, 0, local8, arg0 - 1, local21, arg2, local35, local25);
		if (local68 != null) {
			local285.method6091(this.aBoolean273, 0, local8, arg0 - 1, local68, local74, local70, local72);
		}
		return local285;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIZ)I")
	public int method3211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray403[arg0];
		@Pc(14) Class10_Sub1_Sub4 local14 = null;
		@Pc(22) Class10_Sub1_Sub4 local22 = this.aClass98_1.method2409(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean272 || Static102.aBoolean131) && arg1 != -1 && this.anIntArray403.length > arg1) {
			local7 = this.anIntArray403[arg1];
			local14 = this.aClass98_1.method2409(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean273) {
			local5 = 512;
		}
		if (local22.method1706(local26)) {
			local5 |= 0x80;
		}
		if (local22.method1711(local26)) {
			local5 |= 0x100;
		}
		if (local22.method1709(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method1706(local7)) {
				local5 |= 0x80;
			}
			if (local14.method1711(local7)) {
				local5 |= 0x100;
			}
			if (local14.method1709(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray402 != null && arg2) {
			@Pc(154) int local154;
			@Pc(165) Class10_Sub1_Sub4 local165;
			if (this.anIntArray402.length > arg0) {
				local154 = this.anIntArray402[arg0];
				if (local154 != 65535) {
					local165 = this.aClass98_1.method2409(local154 >> 16);
					local154 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method1706(local154)) {
							local5 |= 0x80;
						}
						if (local165.method1711(local154)) {
							local5 |= 0x100;
						}
						if (local165.method1709(local154)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean272 || Static102.aBoolean131) && arg1 != -1 && this.anIntArray402.length > arg1) {
				local154 = this.anIntArray402[arg1];
				if (local154 != 65535) {
					local165 = this.aClass98_1.method2409(local154 >> 16);
					local154 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method1706(local154)) {
							local5 |= 0x80;
						}
						if (local165.method1711(local154)) {
							local5 |= 0x100;
						}
						if (local165.method1709(local154)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!nn;)V")
	public void method3213(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(23) int local23 = arg0.method2502();
			if (local23 == 0) {
				return;
			}
			this.method3208(arg0, local23);
		}
	}
}
