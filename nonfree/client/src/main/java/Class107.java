import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class107 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray100;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "[Z")
	public boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public int anInt3285;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	public int anInt3276 = -1;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	public int anInt3278 = -1;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Z")
	public boolean aBoolean290 = false;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public int anInt3273 = 2;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	public int anInt3281 = -1;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	public int anInt3286 = 99;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
	public boolean aBoolean292 = false;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	public int anInt3287 = 5;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public int anInt3280 = -1;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	public int anInt3290 = -1;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
	public boolean aBoolean293 = false;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Z")
	public boolean aBoolean291 = false;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZ)I")
	public int method3045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = this.anIntArray280[arg1];
		@Pc(19) Class2_Sub11_Sub1 local19 = null;
		@Pc(25) Class2_Sub11_Sub1 local25 = Static99.method2234(local17 >> 16);
		@Pc(29) int local29 = local17 & 0xFFFF;
		if (local25 == null) {
			return 0;
		}
		if ((this.aBoolean293 || Static70.aBoolean144) && arg0 != -1 && arg0 < this.anIntArray280.length) {
			local7 = this.anIntArray280[arg0];
			local19 = Static99.method2234(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean291) {
			local5 = 512;
		}
		if (local25.method1342(local29)) {
			local5 |= 0x80;
		}
		if (local25.method1346(local29)) {
			local5 |= 0x100;
		}
		if (local19 != null) {
			if (local19.method1342(local7)) {
				local5 |= 0x80;
			}
			if (local19.method1346(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray278 != null && arg2) {
			@Pc(126) int local126;
			@Pc(137) Class2_Sub11_Sub1 local137;
			if (arg1 < this.anIntArray278.length) {
				local126 = this.anIntArray278[arg1];
				if (local126 != 65535) {
					local137 = Static99.method2234(local126 >> 16);
					local126 &= 0xFFFF;
					if (local137 != null) {
						if (local137.method1342(local126)) {
							local5 |= 0x80;
						}
						if (local137.method1346(local126)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean293 || Static70.aBoolean144) && arg0 != -1 && this.anIntArray278.length > arg0) {
				local126 = this.anIntArray278[arg0];
				if (local126 != 65535) {
					local137 = Static99.method2234(local126 >> 16);
					local126 &= 0xFFFF;
					if (local137 != null) {
						if (local137.method1342(local126)) {
							local5 |= 0x80;
						}
						if (local137.method1346(local126)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILclient!bk;I)Lclient!bk;")
	public Class7 method3047(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class7 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray279[arg0];
		@Pc(19) int local19 = this.anIntArray280[arg0];
		@Pc(25) Class2_Sub11_Sub1 local25 = Static99.method2234(local19 >> 16);
		@Pc(29) int local29 = local19 & 0xFFFF;
		if (local25 == null) {
			return arg3.method1436((byte) 1, arg1, true);
		}
		@Pc(39) Class2_Sub11_Sub1 local39 = null;
		if ((this.aBoolean293 || Static70.aBoolean144) && arg2 != -1 && arg2 < this.anIntArray280.length) {
			@Pc(61) int local61 = this.anIntArray280[arg2];
			local39 = Static99.method2234(local61 >> 16);
			arg2 = local61 & 0xFFFF;
		}
		@Pc(73) Class2_Sub11_Sub1 local73 = null;
		@Pc(75) Class2_Sub11_Sub1 local75 = null;
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		if (this.anIntArray278 != null) {
			if (arg0 < this.anIntArray278.length) {
				local77 = this.anIntArray278[arg0];
				if (local77 != 65535) {
					local73 = Static99.method2234(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
			if ((this.aBoolean293 || Static70.aBoolean144) && arg2 != -1 && this.anIntArray278.length > arg2) {
				local79 = this.anIntArray278[arg2];
				if (local79 != 65535) {
					local75 = Static99.method2234(local79 >> 16);
					local79 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean291) {
			arg1 |= 0x200;
		}
		if (local25.method1342(local29)) {
			arg1 |= 0x80;
		}
		if (local25.method1346(local29)) {
			arg1 |= 0x100;
		}
		if (local73 != null) {
			if (local73.method1342(local77)) {
				arg1 |= 0x80;
			}
			if (local73.method1346(local77)) {
				arg1 |= 0x100;
			}
		}
		if (local39 != null) {
			if (local39.method1342(arg2)) {
				arg1 |= 0x80;
			}
			if (local39.method1346(arg2)) {
				arg1 |= 0x100;
			}
		}
		if (local75 != null) {
			if (local75.method1342(local79)) {
				arg1 |= 0x80;
			}
			if (local75.method1346(local79)) {
				arg1 |= 0x100;
			}
		}
		arg1 |= 0x20;
		@Pc(242) Class7 local242 = arg3.method1436((byte) 1, arg1, true);
		local242.method1409(local25, this.aBoolean291, local39, arg4 - 1, 0, arg2, local29, local8);
		if (local73 != null) {
			local242.method1409(local73, this.aBoolean291, local75, arg4 - 1, 0, local79, local77, local8);
		}
		return local242;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method3048() {
		if (this.anInt3280 == -1) {
			if (this.aBooleanArray15 == null) {
				this.anInt3280 = 0;
			} else {
				this.anInt3280 = 2;
			}
		}
		if (this.anInt3290 != -1) {
			return;
		}
		if (this.aBooleanArray15 == null) {
			this.anInt3290 = 0;
		} else {
			this.anInt3290 = 2;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!dg;)V")
	public void method3049(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4421();
			if (local5 == 0) {
				return;
			}
			this.method3052(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIBILclient!bk;)Lclient!bk;")
	public Class7 method3051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(7) Class7 arg6) {
		@Pc(8) int local8 = this.anIntArray279[arg0];
		@Pc(13) int local13 = this.anIntArray280[arg0];
		@Pc(19) Class2_Sub11_Sub1 local19 = Static99.method2234(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg6.method1436(arg5, arg4, true);
		}
		@Pc(33) Class2_Sub11_Sub1 local33 = null;
		if ((this.aBoolean293 || Static70.aBoolean144) && arg1 != -1 && this.anIntArray280.length > arg1) {
			@Pc(61) int local61 = this.anIntArray280[arg1];
			local33 = Static99.method2234(local61 >> 16);
			arg1 = local61 & 0xFFFF;
		}
		if (this.aBoolean291) {
			arg4 |= 0x200;
		}
		if (local19.method1342(local23)) {
			arg4 |= 0x80;
		}
		if (local19.method1346(local23)) {
			arg4 |= 0x100;
		}
		if (local33 != null) {
			if (local33.method1342(arg1)) {
				arg4 |= 0x80;
			}
			if (local33.method1346(arg1)) {
				arg4 |= 0x100;
			}
		}
		arg4 |= 0x20;
		@Pc(126) Class7 local126 = arg6.method1436(arg5, arg4, true);
		local126.method1409(local19, this.aBoolean291, local33, arg3 - 1, arg2, arg1, local23, local8);
		return local126;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBLclient!dg;)V")
	private void method3052(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(41) int local41;
		@Pc(60) int local60;
		if (arg0 == 1) {
			local16 = arg1.method4464();
			this.anIntArray279 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray279[local22] = arg1.method4464();
			}
			this.anIntArray280 = new int[local16];
			for (local41 = 0; local41 < local16; local41++) {
				this.anIntArray280[local41] = arg1.method4464();
			}
			for (local60 = 0; local60 < local16; local60++) {
				this.anIntArray280[local60] += arg1.method4464() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3276 = arg1.method4464();
		} else if (arg0 == 3) {
			this.aBooleanArray15 = new boolean[256];
			local16 = arg1.method4421();
			for (local22 = 0; local22 < local16; local22++) {
				this.aBooleanArray15[arg1.method4421()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean290 = true;
		} else if (arg0 == 5) {
			this.anInt3287 = arg1.method4421();
		} else if (arg0 == 6) {
			this.anInt3278 = arg1.method4464();
		} else if (arg0 == 7) {
			this.anInt3281 = arg1.method4464();
		} else if (arg0 == 8) {
			this.anInt3286 = arg1.method4421();
		} else if (arg0 == 9) {
			this.anInt3290 = arg1.method4421();
		} else if (arg0 == 10) {
			this.anInt3280 = arg1.method4421();
		} else if (arg0 == 11) {
			this.anInt3273 = arg1.method4421();
		} else if (arg0 == 12) {
			local16 = arg1.method4421();
			this.anIntArray278 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray278[local22] = arg1.method4464();
			}
			for (local41 = 0; local41 < local16; local41++) {
				this.anIntArray278[local41] += arg1.method4464() << 16;
			}
		} else if (arg0 == 13) {
			local16 = arg1.method4464();
			this.anIntArrayArray100 = new int[local16][];
			for (local22 = 0; local22 < local16; local22++) {
				local41 = arg1.method4421();
				if (local41 > 0) {
					this.anIntArrayArray100[local22] = new int[local41];
					this.anIntArrayArray100[local22][0] = arg1.method4463();
					for (local60 = 1; local60 < local41; local60++) {
						this.anIntArrayArray100[local22][local60] = arg1.method4464();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean291 = true;
		} else if (arg0 == 15) {
			this.aBoolean293 = true;
		} else if (arg0 == 16) {
			this.aBoolean292 = true;
		}
	}
}
