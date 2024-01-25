import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class81 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	public int anInt2138;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[Z")
	public boolean[] aBooleanArray38;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!jn;")
	public Class173 aClass173_1;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	public int anInt2139 = -1;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	public int anInt2141 = 2;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public int anInt2145 = -1;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	public int anInt2150 = -1;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	public boolean aBoolean159 = false;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public int anInt2151 = 5;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
	public boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
	public int anInt2152 = 99;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
	public int anInt2149 = -1;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Z")
	public boolean aBoolean158 = false;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public int anInt2154 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ka;IIIII)Lclient!ka;")
	public Class182 method1747(@OriginalArg(0) Class182 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = this.anIntArray151[arg2];
		@Pc(18) int local18 = this.anIntArray149[arg2];
		@Pc(26) Class2_Sub2_Sub15 local26 = this.aClass173_1.method3793(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return arg0.method6208((byte) 1, arg1, true);
		}
		@Pc(40) Class2_Sub2_Sub15 local40 = null;
		if ((this.aBoolean158 || Static621.aBoolean729) && arg3 != -1 && arg3 < this.anIntArray149.length) {
			@Pc(58) int local58 = this.anIntArray149[arg3];
			local40 = this.aClass173_1.method3793(local58 >> 16);
			arg3 = local58 & 0xFFFF;
		}
		@Pc(72) Class2_Sub2_Sub15 local72 = null;
		@Pc(74) Class2_Sub2_Sub15 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray152 != null) {
			if (arg2 < this.anIntArray152.length) {
				local76 = this.anIntArray152[arg2];
				if (local76 != 65535) {
					local72 = this.aClass173_1.method3793(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean158 || Static621.aBoolean729) && arg3 != -1 && arg3 < this.anIntArray152.length) {
				local78 = this.anIntArray152[arg3];
				if (local78 != 65535) {
					local74 = this.aClass173_1.method3793(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean159) {
			arg1 |= 0x200;
		}
		if (local26.method5015(local30)) {
			arg1 |= 0x80;
		}
		if (local26.method5014(local30)) {
			arg1 |= 0x100;
		}
		if (local26.method5012(local30)) {
			arg1 |= 0x400;
		}
		if (local72 != null) {
			if (local72.method5015(local76)) {
				arg1 |= 0x80;
			}
			if (local72.method5014(local76)) {
				arg1 |= 0x100;
			}
			if (local72.method5012(local76)) {
				arg1 |= 0x400;
			}
		}
		if (local40 != null) {
			if (local40.method5015(arg3)) {
				arg1 |= 0x80;
			}
			if (local40.method5014(arg3)) {
				arg1 |= 0x100;
			}
			if (local40.method5012(arg3)) {
				arg1 |= 0x400;
			}
		}
		if (local74 != null) {
			if (local74.method5015(local78)) {
				arg1 |= 0x80;
			}
			if (local74.method5014(local78)) {
				arg1 |= 0x100;
			}
			if (local74.method5012(local78)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(283) Class182 local283 = arg0.method6208((byte) 1, arg1, true);
		local283.method6200(local26, arg4 - 1, local30, 0, arg3, local40, this.aBoolean159, local13);
		if (local72 != null) {
			local283.method6200(local72, arg4 - 1, local76, 0, local78, local74, this.aBoolean159, local13);
		}
		return local283;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public void method1748() {
		if (this.anInt2149 == -1) {
			if (this.aBooleanArray38 == null) {
				this.anInt2149 = 0;
			} else {
				this.anInt2149 = 2;
			}
		}
		if (this.anInt2145 != -1) {
			return;
		}
		if (this.aBooleanArray38 == null) {
			this.anInt2145 = 0;
		} else {
			this.anInt2145 = 2;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIBILclient!ka;I)Lclient!ka;")
	public Class182 method1750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class182 arg6) {
		@Pc(8) int local8 = this.anIntArray151[arg2];
		@Pc(13) int local13 = this.anIntArray149[arg2];
		@Pc(21) Class2_Sub2_Sub15 local21 = this.aClass173_1.method3793(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg6.method6208(arg4, arg1, true);
		}
		@Pc(35) Class2_Sub2_Sub15 local35 = null;
		if ((this.aBoolean158 || Static621.aBoolean729) && arg5 != -1 && this.anIntArray149.length > arg5) {
			@Pc(54) int local54 = this.anIntArray149[arg5];
			local35 = this.aClass173_1.method3793(local54 >> 16);
			arg5 = local54 & 0xFFFF;
		}
		if (this.aBoolean159) {
			arg1 |= 0x200;
		}
		if (local21.method5015(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method5014(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method5012(local25)) {
			arg1 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method5015(arg5)) {
				arg1 |= 0x80;
			}
			if (local35.method5014(arg5)) {
				arg1 |= 0x100;
			}
			if (local35.method5012(arg5)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(144) Class182 local144 = arg6.method6208(arg4, arg1, true);
		local144.method6200(local21, arg3 - 1, local25, arg0, arg5, local35, this.aBoolean159, local8);
		return local144;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIII)I")
	public int method1751(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray149[arg2];
		@Pc(14) Class2_Sub2_Sub15 local14 = null;
		@Pc(24) Class2_Sub2_Sub15 local24 = this.aClass173_1.method3793(local12 >> 16);
		@Pc(28) int local28 = local12 & 0xFFFF;
		if (local24 == null) {
			return 0;
		}
		if ((this.aBoolean158 || Static621.aBoolean729) && arg1 != -1 && arg1 < this.anIntArray149.length) {
			local7 = this.anIntArray149[arg1];
			local14 = this.aClass173_1.method3793(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean159) {
			local5 = 512;
		}
		if (local24.method5015(local28)) {
			local5 |= 0x80;
		}
		if (local24.method5014(local28)) {
			local5 |= 0x100;
		}
		if (local24.method5012(local28)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method5015(local7)) {
				local5 |= 0x80;
			}
			if (local14.method5014(local7)) {
				local5 |= 0x100;
			}
			if (local14.method5012(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray152 != null && arg0) {
			@Pc(164) int local164;
			@Pc(179) Class2_Sub2_Sub15 local179;
			if (arg2 < this.anIntArray152.length) {
				local164 = this.anIntArray152[arg2];
				if (local164 != 65535) {
					local179 = this.aClass173_1.method3793(local164 >> 16);
					local164 &= 0xFFFF;
					if (local179 != null) {
						if (local179.method5015(local164)) {
							local5 |= 0x80;
						}
						if (local179.method5014(local164)) {
							local5 |= 0x100;
						}
						if (local179.method5012(local164)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean158 || Static621.aBoolean729) && arg1 != -1 && arg1 < this.anIntArray152.length) {
				local164 = this.anIntArray152[arg1];
				if (local164 != 65535) {
					local179 = this.aClass173_1.method3793(local164 >> 16);
					local164 &= 0xFFFF;
					if (local179 != null) {
						if (local179.method5015(local164)) {
							local5 |= 0x80;
						}
						if (local179.method5014(local164)) {
							local5 |= 0x100;
						}
						if (local179.method5012(local164)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!vj;IZ)V")
	private void method1754(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(43) int local43;
		@Pc(58) int local58;
		if (arg1 == 1) {
			local18 = arg0.method8546();
			this.anIntArray151 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray151[local24] = arg0.method8546();
			}
			this.anIntArray149 = new int[local18];
			for (local43 = 0; local43 < local18; local43++) {
				this.anIntArray149[local43] = arg0.method8546();
			}
			for (local58 = 0; local58 < local18; local58++) {
				this.anIntArray149[local58] = (arg0.method8546() << 16) + this.anIntArray149[local58];
			}
		} else if (arg1 == 2) {
			this.anInt2150 = arg0.method8546();
		} else if (arg1 == 3) {
			this.aBooleanArray38 = new boolean[256];
			local18 = arg0.method8547();
			for (local24 = 0; local24 < local18; local24++) {
				this.aBooleanArray38[arg0.method8547()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt2151 = arg0.method8547();
		} else if (arg1 == 6) {
			this.anInt2139 = arg0.method8546();
		} else if (arg1 == 7) {
			this.anInt2154 = arg0.method8546();
		} else if (arg1 == 8) {
			this.anInt2152 = arg0.method8547();
		} else if (arg1 == 9) {
			this.anInt2145 = arg0.method8547();
		} else if (arg1 == 10) {
			this.anInt2149 = arg0.method8547();
		} else if (arg1 == 11) {
			this.anInt2141 = arg0.method8547();
		} else if (arg1 == 12) {
			local18 = arg0.method8547();
			this.anIntArray152 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray152[local24] = arg0.method8546();
			}
			for (local43 = 0; local43 < local18; local43++) {
				this.anIntArray152[local43] = (arg0.method8546() << 16) + this.anIntArray152[local43];
			}
		} else if (arg1 == 13) {
			local18 = arg0.method8546();
			this.anIntArrayArray7 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				local43 = arg0.method8547();
				if (local43 > 0) {
					this.anIntArrayArray7[local24] = new int[local43];
					this.anIntArrayArray7[local24][0] = arg0.method8539();
					for (local58 = 1; local58 < local43; local58++) {
						this.anIntArrayArray7[local24][local58] = arg0.method8546();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean159 = true;
		} else if (arg1 == 15) {
			this.aBoolean158 = true;
		} else if (arg1 == 16) {
			this.aBoolean160 = true;
		} else if (arg1 == 18) {
			this.aBoolean157 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray147 == null) {
				this.anIntArray147 = new int[this.anIntArrayArray7.length];
				for (local18 = 0; local18 < this.anIntArrayArray7.length; local18++) {
					this.anIntArray147[local18] = 255;
				}
			}
			this.anIntArray147[arg0.method8547()] = arg0.method8547();
		} else if (arg1 == 20) {
			if (this.anIntArray150 == null || this.anIntArray148 == null) {
				this.anIntArray150 = new int[this.anIntArrayArray7.length];
				this.anIntArray148 = new int[this.anIntArrayArray7.length];
				for (local18 = 0; local18 < this.anIntArrayArray7.length; local18++) {
					this.anIntArray150[local18] = 256;
					this.anIntArray148[local18] = 256;
				}
			}
			local18 = arg0.method8547();
			this.anIntArray150[local18] = arg0.method8546();
			this.anIntArray148[local18] = arg0.method8546();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!vj;)V")
	public void method1756(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method1754(arg0, local5);
		}
	}
}
