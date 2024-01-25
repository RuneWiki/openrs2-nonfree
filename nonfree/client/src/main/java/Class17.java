import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class17 {

	@OriginalMember(owner = "client!as", name = "b", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "[I")
	public int[] anIntArray54;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "[I")
	public int[] anIntArray55;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "[Z")
	public boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Lclient!rb;")
	public Class279 aClass279_1;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "I")
	public int anInt555 = 2;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "I")
	public int anInt551 = -1;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "I")
	public int anInt559 = 5;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "I")
	public int anInt560 = -1;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "I")
	public int anInt563 = -1;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!as", name = "s", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!as", name = "z", descriptor = "I")
	public int anInt565 = -1;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "Z")
	public boolean aBoolean48 = false;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "I")
	public int anInt564 = 99;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	public int anInt558 = -1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IILclient!qh;)V")
	private void method448(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(37) int local37;
		@Pc(52) int local52;
		if (arg0 == 1) {
			local12 = arg1.method3109();
			this.anIntArray54 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray54[local18] = arg1.method3109();
			}
			this.anIntArray55 = new int[local12];
			for (local37 = 0; local37 < local12; local37++) {
				this.anIntArray55[local37] = arg1.method3109();
			}
			for (local52 = 0; local52 < local12; local52++) {
				this.anIntArray55[local52] += arg1.method3109() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt551 = arg1.method3109();
		} else if (arg0 == 3) {
			this.aBooleanArray2 = new boolean[256];
			local12 = arg1.method3118();
			for (local18 = 0; local18 < local12; local18++) {
				this.aBooleanArray2[arg1.method3118()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt559 = arg1.method3118();
		} else if (arg0 == 6) {
			this.anInt558 = arg1.method3109();
		} else if (arg0 == 7) {
			this.anInt563 = arg1.method3109();
		} else if (arg0 == 8) {
			this.anInt564 = arg1.method3118();
		} else if (arg0 == 9) {
			this.anInt565 = arg1.method3118();
		} else if (arg0 == 10) {
			this.anInt560 = arg1.method3118();
		} else if (arg0 == 11) {
			this.anInt555 = arg1.method3118();
		} else if (arg0 == 12) {
			local12 = arg1.method3118();
			this.anIntArray53 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray53[local18] = arg1.method3109();
			}
			for (local37 = 0; local37 < local12; local37++) {
				this.anIntArray53[local37] = (arg1.method3109() << 16) + this.anIntArray53[local37];
			}
		} else if (arg0 == 13) {
			local12 = arg1.method3109();
			this.anIntArrayArray2 = new int[local12][];
			for (local18 = 0; local18 < local12; local18++) {
				local37 = arg1.method3118();
				if (local37 > 0) {
					this.anIntArrayArray2[local18] = new int[local37];
					this.anIntArrayArray2[local18][0] = arg1.method3126();
					for (local52 = 1; local52 < local37; local52++) {
						this.anIntArrayArray2[local18][local52] = arg1.method3109();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean45 = true;
		} else if (arg0 == 15) {
			this.aBoolean47 = true;
		} else if (arg0 == 16) {
			this.aBoolean46 = true;
		} else if (arg0 == 18) {
			this.aBoolean48 = true;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method449(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3118();
			if (local15 == 0) {
				return;
			}
			this.method448(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIZI)I")
	public int method451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray55[arg1];
		@Pc(14) Class3_Sub3_Sub15 local14 = null;
		@Pc(22) Class3_Sub3_Sub15 local22 = this.aClass279_1.method6220(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean47 || Static233.aBoolean341) && arg0 != -1 && arg0 < this.anIntArray55.length) {
			local7 = this.anIntArray55[arg0];
			local14 = this.aClass279_1.method6220(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean45) {
			local5 = 512;
		}
		if (local22.method6248(local26)) {
			local5 |= 0x80;
		}
		if (local22.method6250(local26)) {
			local5 |= 0x100;
		}
		if (local22.method6254(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method6248(local7)) {
				local5 |= 0x80;
			}
			if (local14.method6250(local7)) {
				local5 |= 0x100;
			}
			if (local14.method6254(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray53 != null && arg2) {
			@Pc(138) int local138;
			@Pc(151) Class3_Sub3_Sub15 local151;
			if (this.anIntArray53.length > arg1) {
				local138 = this.anIntArray53[arg1];
				if (local138 != 65535) {
					local151 = this.aClass279_1.method6220(local138 >> 16);
					local138 &= 0xFFFF;
					if (local151 != null) {
						if (local151.method6248(local138)) {
							local5 |= 0x80;
						}
						if (local151.method6250(local138)) {
							local5 |= 0x100;
						}
						if (local151.method6254(local138)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean47 || Static233.aBoolean341) && arg0 != -1 && this.anIntArray53.length > arg0) {
				local138 = this.anIntArray53[arg0];
				if (local138 != 65535) {
					local151 = this.aClass279_1.method6220(local138 >> 16);
					local138 &= 0xFFFF;
					if (local151 != null) {
						if (local151.method6248(local138)) {
							local5 |= 0x80;
						}
						if (local151.method6250(local138)) {
							local5 |= 0x100;
						}
						if (local151.method6254(local138)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BIZIIIILclient!da;)Lclient!da;")
	public Class57 method452(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class57 arg6) {
		@Pc(8) int local8 = this.anIntArray54[arg4];
		@Pc(13) int local13 = this.anIntArray55[arg4];
		@Pc(21) Class3_Sub3_Sub15 local21 = this.aClass279_1.method6220(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg6.method7522(arg0, arg2, true);
		}
		@Pc(35) Class3_Sub3_Sub15 local35 = null;
		if ((this.aBoolean47 || Static233.aBoolean341) && arg3 != -1 && this.anIntArray55.length > arg3) {
			@Pc(54) int local54 = this.anIntArray55[arg3];
			local35 = this.aClass279_1.method6220(local54 >> 16);
			arg3 = local54 & 0xFFFF;
		}
		if (this.aBoolean45) {
			arg2 |= 0x200;
		}
		if (local21.method6248(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method6250(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method6254(local25)) {
			arg2 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method6248(arg3)) {
				arg2 |= 0x80;
			}
			if (local35.method6250(arg3)) {
				arg2 |= 0x100;
			}
			if (local35.method6254(arg3)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(139) Class57 local139 = arg6.method7522(arg0, arg2, true);
		local139.method7527(local35, this.aBoolean45, arg3, arg5, local8, arg1 - 1, local25, local21);
		return local139;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
	public void method454() {
		if (this.anInt565 == -1) {
			if (this.aBooleanArray2 == null) {
				this.anInt565 = 0;
			} else {
				this.anInt565 = 2;
			}
		}
		if (this.anInt560 != -1) {
			return;
		}
		if (this.aBooleanArray2 == null) {
			this.anInt560 = 0;
		} else {
			this.anInt560 = 2;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!da;IIIII)Lclient!da;")
	public Class57 method455(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray54[arg1];
		@Pc(13) int local13 = this.anIntArray55[arg1];
		@Pc(21) Class3_Sub3_Sub15 local21 = this.aClass279_1.method6220(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method7522((byte) 1, arg3, true);
		}
		@Pc(35) Class3_Sub3_Sub15 local35 = null;
		if ((this.aBoolean47 || Static233.aBoolean341) && arg4 != -1 && arg4 < this.anIntArray55.length) {
			@Pc(53) int local53 = this.anIntArray55[arg4];
			local35 = this.aClass279_1.method6220(local53 >> 16);
			arg4 = local53 & 0xFFFF;
		}
		@Pc(67) Class3_Sub3_Sub15 local67 = null;
		@Pc(69) Class3_Sub3_Sub15 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray53 != null) {
			if (arg1 < this.anIntArray53.length) {
				local71 = this.anIntArray53[arg1];
				if (local71 != 65535) {
					local67 = this.aClass279_1.method6220(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean47 || Static233.aBoolean341) && arg4 != -1 && this.anIntArray53.length > arg4) {
				local73 = this.anIntArray53[arg4];
				if (local73 != 65535) {
					local69 = this.aClass279_1.method6220(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean45) {
			arg3 |= 0x200;
		}
		if (local21.method6248(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method6250(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method6254(local25)) {
			arg3 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method6248(local71)) {
				arg3 |= 0x80;
			}
			if (local67.method6250(local71)) {
				arg3 |= 0x100;
			}
			if (local67.method6254(local71)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method6248(arg4)) {
				arg3 |= 0x80;
			}
			if (local35.method6250(arg4)) {
				arg3 |= 0x100;
			}
			if (local35.method6254(arg4)) {
				arg3 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method6248(local73)) {
				arg3 |= 0x80;
			}
			if (local69.method6250(local73)) {
				arg3 |= 0x100;
			}
			if (local69.method6254(local73)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(272) Class57 local272 = arg0.method7522((byte) 1, arg3, true);
		local272.method7527(local35, this.aBoolean45, arg4, 0, local8, arg2 - 1, local25, local21);
		if (local67 != null) {
			local272.method7527(local69, this.aBoolean45, local73, 0, local8, arg2 - 1, local71, local67);
		}
		return local272;
	}
}
