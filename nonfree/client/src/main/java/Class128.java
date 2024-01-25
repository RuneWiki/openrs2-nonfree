import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class128 {

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "Lclient!ec;")
	public Class62 aClass62_1;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "[Z")
	public boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
	public int anInt3333;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	public int anInt3329 = 2;

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public int anInt3326 = 5;

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
	public int anInt3339 = 99;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
	public int anInt3335 = -1;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "Z")
	public boolean aBoolean200 = false;

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
	public int anInt3328 = -1;

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
	public int anInt3338 = -1;

	@OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
	public int anInt3341 = -1;

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
	public int anInt3336 = -1;

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
	public int anInt3340 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!sv;B)V")
	public void method2639(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3580();
			if (local15 == 0) {
				return;
			}
			this.method2646(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!e;IIIIBB)Lclient!e;")
	public Class59 method2642(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte arg6) {
		@Pc(8) int local8 = this.anIntArray276[arg2];
		@Pc(13) int local13 = this.anIntArray278[arg2];
		@Pc(21) Class2_Sub5_Sub18 local21 = this.aClass62_1.method1414(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method5737(arg6, arg4, true);
		}
		@Pc(35) Class2_Sub5_Sub18 local35 = null;
		if ((this.aBoolean201 || Static390.aBoolean492) && arg0 != -1 && this.anIntArray278.length > arg0) {
			@Pc(53) int local53 = this.anIntArray278[arg0];
			local35 = this.aClass62_1.method1414(local53 >> 16);
			arg0 = local53 & 0xFFFF;
		}
		if (this.aBoolean200) {
			arg4 |= 0x200;
		}
		if (local21.method5629(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method5626(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method5630(local25)) {
			arg4 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method5629(arg0)) {
				arg4 |= 0x80;
			}
			if (local35.method5626(arg0)) {
				arg4 |= 0x100;
			}
			if (local35.method5630(arg0)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(144) Class59 local144 = arg1.method5737(arg6, arg4, true);
		local144.method5750(local35, arg3 - 1, arg0, arg5, local21, local8, local25, this.aBoolean200);
		return local144;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public void method2643() {
		if (this.anInt3341 == -1) {
			if (this.aBooleanArray12 == null) {
				this.anInt3341 = 0;
			} else {
				this.anInt3341 = 2;
			}
		}
		if (this.anInt3328 != -1) {
			return;
		}
		if (this.aBooleanArray12 == null) {
			this.anInt3328 = 0;
		} else {
			this.anInt3328 = 2;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!sv;II)V")
	private void method2646(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(39) int local39;
		@Pc(58) int local58;
		if (arg1 == 1) {
			local10 = arg0.method3555();
			this.anIntArray276 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray276[local16] = arg0.method3555();
			}
			this.anIntArray278 = new int[local10];
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray278[local39] = arg0.method3555();
			}
			for (local58 = 0; local58 < local10; local58++) {
				this.anIntArray278[local58] += arg0.method3555() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3335 = arg0.method3555();
		} else if (arg1 == 3) {
			this.aBooleanArray12 = new boolean[256];
			local10 = arg0.method3580();
			for (local16 = 0; local16 < local10; local16++) {
				this.aBooleanArray12[arg0.method3580()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt3326 = arg0.method3580();
		} else if (arg1 == 6) {
			this.anInt3336 = arg0.method3555();
		} else if (arg1 == 7) {
			this.anInt3338 = arg0.method3555();
		} else if (arg1 == 8) {
			this.anInt3339 = arg0.method3580();
		} else if (arg1 == 9) {
			this.anInt3328 = arg0.method3580();
		} else if (arg1 == 10) {
			this.anInt3341 = arg0.method3580();
		} else if (arg1 == 11) {
			this.anInt3329 = arg0.method3580();
		} else if (arg1 == 12) {
			local10 = arg0.method3580();
			this.anIntArray280 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray280[local16] = arg0.method3555();
			}
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray280[local39] += arg0.method3555() << 16;
			}
		} else if (arg1 == 13) {
			local10 = arg0.method3555();
			this.anIntArrayArray16 = new int[local10][];
			for (local16 = 0; local16 < local10; local16++) {
				local39 = arg0.method3580();
				if (local39 > 0) {
					this.anIntArrayArray16[local16] = new int[local39];
					this.anIntArrayArray16[local16][0] = arg0.method3563();
					for (local58 = 1; local58 < local39; local58++) {
						this.anIntArrayArray16[local16][local58] = arg0.method3555();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean200 = true;
		} else if (arg1 == 15) {
			this.aBoolean201 = true;
		} else if (arg1 == 16) {
			this.aBoolean202 = true;
		} else if (arg1 == 17) {
			this.anInt3340 = arg0.method3580();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIILclient!e;)Lclient!e;")
	public Class59 method2647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class59 arg4) {
		@Pc(8) int local8 = this.anIntArray276[arg0];
		@Pc(13) int local13 = this.anIntArray278[arg0];
		@Pc(21) Class2_Sub5_Sub18 local21 = this.aClass62_1.method1414(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method5737((byte) 1, arg1, true);
		}
		@Pc(35) Class2_Sub5_Sub18 local35 = null;
		if ((this.aBoolean201 || Static390.aBoolean492) && arg3 != -1 && arg3 < this.anIntArray278.length) {
			@Pc(58) int local58 = this.anIntArray278[arg3];
			local35 = this.aClass62_1.method1414(local58 >> 16);
			arg3 = local58 & 0xFFFF;
		}
		@Pc(72) Class2_Sub5_Sub18 local72 = null;
		@Pc(74) Class2_Sub5_Sub18 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray280 != null) {
			if (this.anIntArray280.length > arg0) {
				local76 = this.anIntArray280[arg0];
				if (local76 != 65535) {
					local72 = this.aClass62_1.method1414(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean201 || Static390.aBoolean492) && arg3 != -1 && arg3 < this.anIntArray280.length) {
				local78 = this.anIntArray280[arg3];
				if (local78 != 65535) {
					local74 = this.aClass62_1.method1414(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean200) {
			arg1 |= 0x200;
		}
		if (local21.method5629(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method5626(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method5630(local25)) {
			arg1 |= 0x400;
		}
		if (local72 != null) {
			if (local72.method5629(local76)) {
				arg1 |= 0x80;
			}
			if (local72.method5626(local76)) {
				arg1 |= 0x100;
			}
			if (local72.method5630(local76)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method5629(arg3)) {
				arg1 |= 0x80;
			}
			if (local35.method5626(arg3)) {
				arg1 |= 0x100;
			}
			if (local35.method5630(arg3)) {
				arg1 |= 0x400;
			}
		}
		if (local74 != null) {
			if (local74.method5629(local78)) {
				arg1 |= 0x80;
			}
			if (local74.method5626(local78)) {
				arg1 |= 0x100;
			}
			if (local74.method5630(local78)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(291) Class59 local291 = arg4.method5737((byte) 1, arg1, true);
		local291.method5750(local35, arg2 - 1, arg3, 0, local21, local8, local25, this.aBoolean200);
		if (local72 != null) {
			local291.method5750(local74, arg2 - 1, local78, 0, local72, local8, local76, this.aBoolean200);
		}
		return local291;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBZI)I")
	public int method2648(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray278[arg2];
		@Pc(14) Class2_Sub5_Sub18 local14 = null;
		@Pc(22) Class2_Sub5_Sub18 local22 = this.aClass62_1.method1414(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean201 || Static390.aBoolean492) && arg0 != -1 && arg0 < this.anIntArray278.length) {
			local7 = this.anIntArray278[arg0];
			local14 = this.aClass62_1.method1414(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean200) {
			local5 = 512;
		}
		if (local22.method5629(local26)) {
			local5 |= 0x80;
		}
		if (local22.method5626(local26)) {
			local5 |= 0x100;
		}
		if (local22.method5630(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method5629(local7)) {
				local5 |= 0x80;
			}
			if (local14.method5626(local7)) {
				local5 |= 0x100;
			}
			if (local14.method5630(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray280 != null && arg1) {
			@Pc(154) int local154;
			@Pc(167) Class2_Sub5_Sub18 local167;
			if (arg2 < this.anIntArray280.length) {
				local154 = this.anIntArray280[arg2];
				if (local154 != 65535) {
					local167 = this.aClass62_1.method1414(local154 >> 16);
					local154 &= 0xFFFF;
					if (local167 != null) {
						if (local167.method5629(local154)) {
							local5 |= 0x80;
						}
						if (local167.method5626(local154)) {
							local5 |= 0x100;
						}
						if (local167.method5630(local154)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean201 || Static390.aBoolean492) && arg0 != -1 && arg0 < this.anIntArray280.length) {
				local154 = this.anIntArray280[arg0];
				if (local154 != 65535) {
					local167 = this.aClass62_1.method1414(local154 >> 16);
					local154 &= 0xFFFF;
					if (local167 != null) {
						if (local167.method5629(local154)) {
							local5 |= 0x80;
						}
						if (local167.method5626(local154)) {
							local5 |= 0x100;
						}
						if (local167.method5630(local154)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
