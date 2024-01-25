import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class63 {

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
	public int anInt1370;

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "Lclient!ur;")
	public Class324 aClass324_1;

	@OriginalMember(owner = "client!ct", name = "w", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!ct", name = "y", descriptor = "[Z")
	public boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
	public int anInt1378 = -1;

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
	public int anInt1377 = 5;

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
	public int anInt1382 = 99;

	@OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
	public int anInt1385 = -1;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
	public int anInt1379 = 2;

	@OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
	public int anInt1381 = -1;

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
	public int anInt1384 = -1;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!ct", name = "z", descriptor = "I")
	public int anInt1386 = 0;

	@OriginalMember(owner = "client!ct", name = "D", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
	public int anInt1388 = -1;

	@OriginalMember(owner = "client!ct", name = "C", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIII)I")
	public int method1147(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray127[arg1];
		@Pc(14) Class6_Sub5_Sub15 local14 = null;
		@Pc(22) Class6_Sub5_Sub15 local22 = this.aClass324_1.method7259(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean103 || Static38.aBoolean50) && arg2 != -1 && this.anIntArray127.length > arg2) {
			local7 = this.anIntArray127[arg2];
			local14 = this.aClass324_1.method7259(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean104) {
			local5 = 512;
		}
		if (local22.method6376(local26)) {
			local5 |= 0x80;
		}
		if (local22.method6375(local26)) {
			local5 |= 0x100;
		}
		if (local22.method6377(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method6376(local7)) {
				local5 |= 0x80;
			}
			if (local14.method6375(local7)) {
				local5 |= 0x100;
			}
			if (local14.method6377(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray126 != null && arg0) {
			@Pc(159) int local159;
			@Pc(170) Class6_Sub5_Sub15 local170;
			if (arg1 < this.anIntArray126.length) {
				local159 = this.anIntArray126[arg1];
				if (local159 != 65535) {
					local170 = this.aClass324_1.method7259(local159 >> 16);
					local159 &= 0xFFFF;
					if (local170 != null) {
						if (local170.method6376(local159)) {
							local5 |= 0x80;
						}
						if (local170.method6375(local159)) {
							local5 |= 0x100;
						}
						if (local170.method6377(local159)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean103 || Static38.aBoolean50) && arg2 != -1 && arg2 < this.anIntArray126.length) {
				local159 = this.anIntArray126[arg2];
				if (local159 != 65535) {
					local170 = this.aClass324_1.method7259(local159 >> 16);
					local159 &= 0xFFFF;
					if (local170 != null) {
						if (local170.method6376(local159)) {
							local5 |= 0x80;
						}
						if (local170.method6375(local159)) {
							local5 |= 0x100;
						}
						if (local170.method6377(local159)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILclient!ba;III)Lclient!ba;")
	public Class24 method1148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray128[arg4];
		@Pc(13) int local13 = this.anIntArray127[arg4];
		@Pc(21) Class6_Sub5_Sub15 local21 = this.aClass324_1.method7259(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method7398((byte) 1, arg0, true);
		}
		@Pc(35) Class6_Sub5_Sub15 local35 = null;
		if ((this.aBoolean103 || Static38.aBoolean50) && arg3 != -1 && this.anIntArray127.length > arg3) {
			@Pc(53) int local53 = this.anIntArray127[arg3];
			local35 = this.aClass324_1.method7259(local53 >> 16);
			arg3 = local53 & 0xFFFF;
		}
		@Pc(67) Class6_Sub5_Sub15 local67 = null;
		@Pc(69) Class6_Sub5_Sub15 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray126 != null) {
			if (this.anIntArray126.length > arg4) {
				local71 = this.anIntArray126[arg4];
				if (local71 != 65535) {
					local67 = this.aClass324_1.method7259(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean103 || Static38.aBoolean50) && arg3 != -1 && this.anIntArray126.length > arg3) {
				local73 = this.anIntArray126[arg3];
				if (local73 != 65535) {
					local69 = this.aClass324_1.method7259(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean104) {
			arg0 |= 0x200;
		}
		if (local21.method6376(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method6375(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method6377(local25)) {
			arg0 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method6376(local71)) {
				arg0 |= 0x80;
			}
			if (local67.method6375(local71)) {
				arg0 |= 0x100;
			}
			if (local67.method6377(local71)) {
				arg0 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method6376(arg3)) {
				arg0 |= 0x80;
			}
			if (local35.method6375(arg3)) {
				arg0 |= 0x100;
			}
			if (local35.method6377(arg3)) {
				arg0 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method6376(local73)) {
				arg0 |= 0x80;
			}
			if (local69.method6375(local73)) {
				arg0 |= 0x100;
			}
			if (local69.method6377(local73)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(282) Class24 local282 = arg2.method7398((byte) 1, arg0, true);
		local282.method7395(arg1 - 1, local25, this.aBoolean104, arg3, 0, local35, local8, local21);
		if (local67 != null) {
			local282.method7395(arg1 - 1, local71, this.aBoolean104, local73, 0, local69, local8, local67);
		}
		return local282;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!jr;)V")
	public void method1149(@OriginalArg(1) Class6_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6019();
			if (local5 == 0) {
				return;
			}
			this.method1152(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIIBILclient!ba;I)Lclient!ba;")
	public Class24 method1151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class24 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray128[arg4];
		@Pc(13) int local13 = this.anIntArray127[arg4];
		@Pc(21) Class6_Sub5_Sub15 local21 = this.aClass324_1.method7259(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg5.method7398(arg3, arg1, true);
		}
		@Pc(35) Class6_Sub5_Sub15 local35 = null;
		if ((this.aBoolean103 || Static38.aBoolean50) && arg0 != -1 && arg0 < this.anIntArray127.length) {
			@Pc(57) int local57 = this.anIntArray127[arg0];
			local35 = this.aClass324_1.method7259(local57 >> 16);
			arg0 = local57 & 0xFFFF;
		}
		if (this.aBoolean104) {
			arg1 |= 0x200;
		}
		if (local21.method6376(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method6375(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method6377(local25)) {
			arg1 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method6376(arg0)) {
				arg1 |= 0x80;
			}
			if (local35.method6375(arg0)) {
				arg1 |= 0x100;
			}
			if (local35.method6377(arg0)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(152) Class24 local152 = arg5.method7398(arg3, arg1, true);
		local152.method7395(arg6 - 1, local25, this.aBoolean104, arg0, arg2, local35, local8, local21);
		return local152;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!jr;II)V")
	private void method1152(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(45) int local45;
		@Pc(60) int local60;
		if (arg1 == 1) {
			local16 = arg0.method6044();
			this.anIntArray128 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray128[local22] = arg0.method6044();
			}
			this.anIntArray127 = new int[local16];
			for (local45 = 0; local45 < local16; local45++) {
				this.anIntArray127[local45] = arg0.method6044();
			}
			for (local60 = 0; local60 < local16; local60++) {
				this.anIntArray127[local60] = (arg0.method6044() << 16) + this.anIntArray127[local60];
			}
		} else if (arg1 == 2) {
			this.anInt1378 = arg0.method6044();
		} else if (arg1 == 3) {
			this.aBooleanArray6 = new boolean[256];
			local16 = arg0.method6019();
			for (local22 = 0; local22 < local16; local22++) {
				this.aBooleanArray6[arg0.method6019()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt1377 = arg0.method6019();
		} else if (arg1 == 6) {
			this.anInt1385 = arg0.method6044();
		} else if (arg1 == 7) {
			this.anInt1388 = arg0.method6044();
		} else if (arg1 == 8) {
			this.anInt1382 = arg0.method6019();
		} else if (arg1 == 9) {
			this.anInt1381 = arg0.method6019();
		} else if (arg1 == 10) {
			this.anInt1384 = arg0.method6019();
		} else if (arg1 == 11) {
			this.anInt1379 = arg0.method6019();
		} else if (arg1 == 12) {
			local16 = arg0.method6019();
			this.anIntArray126 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray126[local22] = arg0.method6044();
			}
			for (local45 = 0; local45 < local16; local45++) {
				this.anIntArray126[local45] += arg0.method6044() << 16;
			}
		} else if (arg1 == 13) {
			local16 = arg0.method6044();
			this.anIntArrayArray9 = new int[local16][];
			for (local22 = 0; local22 < local16; local22++) {
				local45 = arg0.method6019();
				if (local45 > 0) {
					this.anIntArrayArray9[local22] = new int[local45];
					this.anIntArrayArray9[local22][0] = arg0.method6037();
					for (local60 = 1; local60 < local45; local60++) {
						this.anIntArrayArray9[local22][local60] = arg0.method6044();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean104 = true;
		} else if (arg1 == 15) {
			this.aBoolean103 = true;
		} else if (arg1 == 16) {
			this.aBoolean106 = true;
		} else if (arg1 == 17) {
			this.anInt1386 = arg0.method6019();
		} else if (arg1 == 18) {
			this.aBoolean105 = true;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	public void method1153() {
		if (this.anInt1384 == -1) {
			if (this.aBooleanArray6 == null) {
				this.anInt1384 = 0;
			} else {
				this.anInt1384 = 2;
			}
		}
		if (this.anInt1381 != -1) {
			return;
		}
		if (this.aBooleanArray6 == null) {
			this.anInt1381 = 0;
		} else {
			this.anInt1381 = 2;
		}
	}
}
