import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class84 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "[Z")
	public boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
	public int anInt2053;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "[I")
	public int[] anIntArray108;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "Lclient!hl;")
	public Class140 aClass140_1;

	@OriginalMember(owner = "client!dr", name = "B", descriptor = "[I")
	public int[] anIntArray110;

	@OriginalMember(owner = "client!dr", name = "E", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
	public int anInt2052 = 99;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
	public int anInt2059 = -1;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "Z")
	public boolean aBoolean184 = false;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
	public int anInt2056 = 2;

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
	public int anInt2065 = 5;

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
	public int anInt2068 = -1;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
	public int anInt2057 = -1;

	@OriginalMember(owner = "client!dr", name = "z", descriptor = "Z")
	public boolean aBoolean186 = false;

	@OriginalMember(owner = "client!dr", name = "C", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
	public int anInt2058 = -1;

	@OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
	public int anInt2070 = -1;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!es;)V")
	public void method1506(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4325();
			if (local11 == 0) {
				return;
			}
			this.method1509(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	public void method1507() {
		if (this.anInt2059 == -1) {
			if (this.aBooleanArray10 == null) {
				this.anInt2059 = 0;
			} else {
				this.anInt2059 = 2;
			}
		}
		if (this.anInt2058 != -1) {
			return;
		}
		if (this.aBooleanArray10 == null) {
			this.anInt2058 = 0;
		} else {
			this.anInt2058 = 2;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZI)I")
	public int method1508(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray108[arg2];
		@Pc(14) Class2_Sub3_Sub19 local14 = null;
		@Pc(22) Class2_Sub3_Sub19 local22 = this.aClass140_1.method3286(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean186 || Static564.aBoolean711) && arg0 != -1 && this.anIntArray108.length > arg0) {
			local7 = this.anIntArray108[arg0];
			local14 = this.aClass140_1.method3286(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean184) {
			local5 = 512;
		}
		if (local22.method7770(local26)) {
			local5 |= 0x80;
		}
		if (local22.method7768(local26)) {
			local5 |= 0x100;
		}
		if (local22.method7771(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method7770(local7)) {
				local5 |= 0x80;
			}
			if (local14.method7768(local7)) {
				local5 |= 0x100;
			}
			if (local14.method7771(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray111 != null && arg1) {
			@Pc(155) int local155;
			@Pc(166) Class2_Sub3_Sub19 local166;
			if (arg2 < this.anIntArray111.length) {
				local155 = this.anIntArray111[arg2];
				if (local155 != 65535) {
					local166 = this.aClass140_1.method3286(local155 >> 16);
					local155 &= 0xFFFF;
					if (local166 != null) {
						if (local166.method7770(local155)) {
							local5 |= 0x80;
						}
						if (local166.method7768(local155)) {
							local5 |= 0x100;
						}
						if (local166.method7771(local155)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean186 || Static564.aBoolean711) && arg0 != -1 && arg0 < this.anIntArray111.length) {
				local155 = this.anIntArray111[arg0];
				if (local155 != 65535) {
					local166 = this.aClass140_1.method3286(local155 >> 16);
					local155 &= 0xFFFF;
					if (local166 != null) {
						if (local166.method7770(local155)) {
							local5 |= 0x80;
						}
						if (local166.method7768(local155)) {
							local5 |= 0x100;
						}
						if (local166.method7771(local155)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!es;I)V")
	private void method1509(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		@Pc(29) int local29;
		@Pc(31) int local31;
		@Pc(130) int local130;
		@Pc(231) int local231;
		if (arg1 == 1) {
			local29 = arg0.method4294();
			this.anIntArray110 = new int[local29];
			for (local31 = 0; local31 < local29; local31++) {
				this.anIntArray110[local31] = arg0.method4294();
			}
			this.anIntArray108 = new int[local29];
			for (local130 = 0; local130 < local29; local130++) {
				this.anIntArray108[local130] = arg0.method4294();
			}
			for (local231 = 0; local231 < local29; local231++) {
				this.anIntArray108[local231] = (arg0.method4294() << 16) + this.anIntArray108[local231];
			}
		} else if (arg1 == 2) {
			this.anInt2068 = arg0.method4294();
		} else if (arg1 == 3) {
			this.aBooleanArray10 = new boolean[256];
			local29 = arg0.method4325();
			for (local31 = 0; local31 < local29; local31++) {
				this.aBooleanArray10[arg0.method4325()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt2065 = arg0.method4325();
		} else if (arg1 == 6) {
			this.anInt2057 = arg0.method4294();
		} else if (arg1 == 7) {
			this.anInt2070 = arg0.method4294();
		} else if (arg1 == 8) {
			this.anInt2052 = arg0.method4325();
		} else if (arg1 == 9) {
			this.anInt2058 = arg0.method4325();
		} else if (arg1 == 10) {
			this.anInt2059 = arg0.method4325();
		} else if (arg1 == 11) {
			this.anInt2056 = arg0.method4325();
		} else if (arg1 == 12) {
			local29 = arg0.method4325();
			this.anIntArray111 = new int[local29];
			for (local31 = 0; local31 < local29; local31++) {
				this.anIntArray111[local31] = arg0.method4294();
			}
			for (local130 = 0; local130 < local29; local130++) {
				this.anIntArray111[local130] += arg0.method4294() << 16;
			}
		} else if (arg1 == 13) {
			local29 = arg0.method4294();
			this.anIntArrayArray7 = new int[local29][];
			for (local31 = 0; local31 < local29; local31++) {
				local130 = arg0.method4325();
				if (local130 > 0) {
					this.anIntArrayArray7[local31] = new int[local130];
					this.anIntArrayArray7[local31][0] = arg0.method4341();
					for (local231 = 1; local231 < local130; local231++) {
						this.anIntArrayArray7[local31][local231] = arg0.method4294();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean184 = true;
		} else if (arg1 == 15) {
			this.aBoolean186 = true;
		} else if (arg1 == 16) {
			this.aBoolean187 = true;
		} else if (arg1 == 18) {
			this.aBoolean185 = true;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIBIILclient!da;)Lclient!da;")
	public Class66 method1510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class66 arg4) {
		@Pc(8) int local8 = this.anIntArray110[arg0];
		@Pc(13) int local13 = this.anIntArray108[arg0];
		@Pc(21) Class2_Sub3_Sub19 local21 = this.aClass140_1.method3286(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method7551((byte) 1, arg1, true);
		}
		@Pc(35) Class2_Sub3_Sub19 local35 = null;
		if ((this.aBoolean186 || Static564.aBoolean711) && arg3 != -1 && arg3 < this.anIntArray108.length) {
			@Pc(62) int local62 = this.anIntArray108[arg3];
			local35 = this.aClass140_1.method3286(local62 >> 16);
			arg3 = local62 & 0xFFFF;
		}
		@Pc(76) Class2_Sub3_Sub19 local76 = null;
		@Pc(78) Class2_Sub3_Sub19 local78 = null;
		@Pc(80) int local80 = 0;
		@Pc(82) int local82 = 0;
		if (this.anIntArray111 != null) {
			if (this.anIntArray111.length > arg0) {
				local80 = this.anIntArray111[arg0];
				if (local80 != 65535) {
					local76 = this.aClass140_1.method3286(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
			if ((this.aBoolean186 || Static564.aBoolean711) && arg3 != -1 && arg3 < this.anIntArray111.length) {
				local82 = this.anIntArray111[arg3];
				if (local82 != 65535) {
					local78 = this.aClass140_1.method3286(local82 >> 16);
					local82 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean184) {
			arg1 |= 0x200;
		}
		if (local21.method7770(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method7768(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method7771(local25)) {
			arg1 |= 0x400;
		}
		if (local76 != null) {
			if (local76.method7770(local80)) {
				arg1 |= 0x80;
			}
			if (local76.method7768(local80)) {
				arg1 |= 0x100;
			}
			if (local76.method7771(local80)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method7770(arg3)) {
				arg1 |= 0x80;
			}
			if (local35.method7768(arg3)) {
				arg1 |= 0x100;
			}
			if (local35.method7771(arg3)) {
				arg1 |= 0x400;
			}
		}
		if (local78 != null) {
			if (local78.method7770(local82)) {
				arg1 |= 0x80;
			}
			if (local78.method7768(local82)) {
				arg1 |= 0x100;
			}
			if (local78.method7771(local82)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(282) Class66 local282 = arg4.method7551((byte) 1, arg1, true);
		local282.method7559(this.aBoolean184, local21, arg3, local25, local35, arg2 - 1, 0, local8);
		if (local76 != null) {
			local282.method7559(this.aBoolean184, local76, local82, local80, local78, arg2 - 1, 0, local8);
		}
		return local282;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLclient!da;IIIIII)Lclient!da;")
	public Class66 method1512(@OriginalArg(0) byte arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray110[arg5];
		@Pc(13) int local13 = this.anIntArray108[arg5];
		@Pc(23) Class2_Sub3_Sub19 local23 = this.aClass140_1.method3286(local13 >> 16);
		@Pc(27) int local27 = local13 & 0xFFFF;
		if (local23 == null) {
			return arg1.method7551(arg0, arg2, true);
		}
		@Pc(37) Class2_Sub3_Sub19 local37 = null;
		if ((this.aBoolean186 || Static564.aBoolean711) && arg6 != -1 && arg6 < this.anIntArray108.length) {
			@Pc(59) int local59 = this.anIntArray108[arg6];
			local37 = this.aClass140_1.method3286(local59 >> 16);
			arg6 = local59 & 0xFFFF;
		}
		if (this.aBoolean184) {
			arg2 |= 0x200;
		}
		if (local23.method7770(local27)) {
			arg2 |= 0x80;
		}
		if (local23.method7768(local27)) {
			arg2 |= 0x100;
		}
		if (local23.method7771(local27)) {
			arg2 |= 0x400;
		}
		if (local37 != null) {
			if (local37.method7770(arg6)) {
				arg2 |= 0x80;
			}
			if (local37.method7768(arg6)) {
				arg2 |= 0x100;
			}
			if (local37.method7771(arg6)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(152) Class66 local152 = arg1.method7551(arg0, arg2, true);
		local152.method7559(this.aBoolean184, local23, arg6, local27, local37, arg4 - 1, arg3, local8);
		return local152;
	}
}
