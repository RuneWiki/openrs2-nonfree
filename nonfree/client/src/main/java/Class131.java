import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class131 {

	@OriginalMember(owner = "client!md", name = "n", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "[Z")
	public boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "I")
	public int anInt3997;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	public int anInt3987 = -1;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "I")
	public int anInt3981 = -1;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	public int anInt3993 = 5;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	public int anInt3992 = -1;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	public int anInt3986 = 2;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Z")
	public boolean aBoolean226 = false;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Z")
	public boolean aBoolean227 = false;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	public int anInt3989 = -1;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	public int anInt3984 = -1;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "I")
	public int anInt3994 = 99;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Z")
	public boolean aBoolean228 = false;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "Z")
	public boolean aBoolean229 = false;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILclient!qb;II)Lclient!qb;")
	public Class124 method3411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class124 arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = this.anIntArray337[arg2];
		@Pc(13) int local13 = this.anIntArray335[arg2];
		@Pc(19) Class3_Sub7_Sub21 local19 = Static1.method1(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg3.method4094((byte) 1, arg1, true);
		}
		@Pc(33) Class3_Sub7_Sub21 local33 = null;
		if ((this.aBoolean228 || Static151.aBoolean164) && arg0 != -1 && this.anIntArray335.length > arg0) {
			@Pc(55) int local55 = this.anIntArray335[arg0];
			local33 = Static1.method1(local55 >> 16);
			arg0 = local55 & 0xFFFF;
		}
		@Pc(67) Class3_Sub7_Sub21 local67 = null;
		@Pc(69) Class3_Sub7_Sub21 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray336 != null) {
			if (arg2 < this.anIntArray336.length) {
				local71 = this.anIntArray336[arg2];
				if (local71 != 65535) {
					local67 = Static1.method1(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean228 || Static151.aBoolean164) && arg0 != -1 && this.anIntArray336.length > arg0) {
				local73 = this.anIntArray336[arg0];
				if (local73 != 65535) {
					local69 = Static1.method1(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean227) {
			arg1 |= 0x200;
		}
		if (local19.method5289(local23)) {
			arg1 |= 0x80;
		}
		if (local19.method5287(local23)) {
			arg1 |= 0x100;
		}
		if (local67 != null) {
			if (local67.method5289(local71)) {
				arg1 |= 0x80;
			}
			if (local67.method5287(local71)) {
				arg1 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method5289(arg0)) {
				arg1 |= 0x80;
			}
			if (local33.method5287(arg0)) {
				arg1 |= 0x100;
			}
		}
		if (local69 != null) {
			if (local69.method5289(local73)) {
				arg1 |= 0x80;
			}
			if (local69.method5287(local73)) {
				arg1 |= 0x100;
			}
		}
		arg1 |= 0x20;
		@Pc(238) Class124 local238 = arg3.method4094((byte) 1, arg1, true);
		local238.method4096(local23, arg4 - 1, 0, local33, this.aBoolean227, arg0, local19, local8);
		if (local67 != null) {
			local238.method4096(local71, arg4 - 1, 0, local69, this.aBoolean227, local73, local67, local8);
		}
		return local238;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BIIIIIILclient!qb;)Lclient!qb;")
	public Class124 method3412(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class124 arg6) {
		@Pc(8) int local8 = this.anIntArray337[arg3];
		@Pc(13) int local13 = this.anIntArray335[arg3];
		@Pc(19) Class3_Sub7_Sub21 local19 = Static1.method1(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg6.method4094((byte) 1, arg1, true);
		}
		@Pc(33) Class3_Sub7_Sub21 local33 = null;
		if ((this.aBoolean228 || Static151.aBoolean164) && arg4 != -1 && arg4 < this.anIntArray335.length) {
			@Pc(56) int local56 = this.anIntArray335[arg4];
			local33 = Static1.method1(local56 >> 16);
			arg4 = local56 & 0xFFFF;
		}
		if (this.aBoolean227) {
			arg1 |= 0x200;
		}
		if (local19.method5289(local23)) {
			arg1 |= 0x80;
		}
		if (local19.method5287(local23)) {
			arg1 |= 0x100;
		}
		if (local33 != null) {
			if (local33.method5289(arg4)) {
				arg1 |= 0x80;
			}
			if (local33.method5287(arg4)) {
				arg1 |= 0x100;
			}
		}
		arg1 |= 0x20;
		@Pc(126) Class124 local126 = arg6.method4094(arg0, arg1, true);
		local126.method4096(local23, arg5 - 1, arg2, local33, this.aBoolean227, arg4, local19, local8);
		return local126;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public void method3414() {
		if (this.anInt3992 == -1) {
			if (this.aBooleanArray18 == null) {
				this.anInt3992 = 0;
			} else {
				this.anInt3992 = 2;
			}
		}
		if (this.anInt3984 != -1) {
			return;
		}
		if (this.aBooleanArray18 == null) {
			this.anInt3984 = 0;
		} else {
			this.anInt3984 = 2;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BILclient!fb;)V")
	private void method3415(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		@Pc(132) int local132;
		@Pc(138) int local138;
		@Pc(144) int local144;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local132 = arg1.method3649();
			this.anIntArray337 = new int[local132];
			for (local138 = 0; local138 < local132; local138++) {
				this.anIntArray337[local138] = arg1.method3649();
			}
			this.anIntArray335 = new int[local132];
			for (local144 = 0; local144 < local132; local144++) {
				this.anIntArray335[local144] = arg1.method3649();
			}
			for (local166 = 0; local166 < local132; local166++) {
				this.anIntArray335[local166] += arg1.method3649() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3989 = arg1.method3649();
		} else if (arg0 == 3) {
			this.aBooleanArray18 = new boolean[256];
			local132 = arg1.method3643();
			for (local138 = 0; local138 < local132; local138++) {
				this.aBooleanArray18[arg1.method3643()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean229 = true;
		} else if (arg0 == 5) {
			this.anInt3993 = arg1.method3643();
		} else if (arg0 == 6) {
			this.anInt3981 = arg1.method3649();
		} else if (arg0 == 7) {
			this.anInt3987 = arg1.method3649();
		} else if (arg0 == 8) {
			this.anInt3994 = arg1.method3643();
		} else if (arg0 == 9) {
			this.anInt3992 = arg1.method3643();
		} else if (arg0 == 10) {
			this.anInt3984 = arg1.method3643();
		} else if (arg0 == 11) {
			this.anInt3986 = arg1.method3643();
		} else if (arg0 == 12) {
			local132 = arg1.method3643();
			this.anIntArray336 = new int[local132];
			for (local138 = 0; local138 < local132; local138++) {
				this.anIntArray336[local138] = arg1.method3649();
			}
			for (local144 = 0; local144 < local132; local144++) {
				this.anIntArray336[local144] = (arg1.method3649() << 16) + this.anIntArray336[local144];
			}
		} else if (arg0 == 13) {
			local132 = arg1.method3649();
			this.anIntArrayArray34 = new int[local132][];
			for (local138 = 0; local138 < local132; local138++) {
				local144 = arg1.method3643();
				if (local144 > 0) {
					this.anIntArrayArray34[local138] = new int[local144];
					this.anIntArrayArray34[local138][0] = arg1.method3659();
					for (local166 = 1; local166 < local144; local166++) {
						this.anIntArrayArray34[local138][local166] = arg1.method3649();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean227 = true;
		} else if (arg0 == 15) {
			this.aBoolean228 = true;
		} else if (arg0 == 16) {
			this.aBoolean226 = true;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIBI)I")
	public int method3416(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray335[arg1];
		@Pc(14) Class3_Sub7_Sub21 local14 = null;
		@Pc(20) Class3_Sub7_Sub21 local20 = Static1.method1(local12 >> 16);
		@Pc(24) int local24 = local12 & 0xFFFF;
		if (local20 == null) {
			return 0;
		}
		if ((this.aBoolean228 || Static151.aBoolean164) && arg2 != -1 && arg2 < this.anIntArray335.length) {
			local7 = this.anIntArray335[arg2];
			local14 = Static1.method1(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean227) {
			local5 = 512;
		}
		if (local20.method5289(local24)) {
			local5 |= 0x80;
		}
		if (local20.method5287(local24)) {
			local5 |= 0x100;
		}
		if (local14 != null) {
			if (local14.method5289(local7)) {
				local5 |= 0x80;
			}
			if (local14.method5287(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray336 != null && arg0) {
			@Pc(125) int local125;
			@Pc(134) Class3_Sub7_Sub21 local134;
			if (arg1 < this.anIntArray336.length) {
				local125 = this.anIntArray336[arg1];
				if (local125 != 65535) {
					local134 = Static1.method1(local125 >> 16);
					local125 &= 0xFFFF;
					if (local134 != null) {
						if (local134.method5289(local125)) {
							local5 |= 0x80;
						}
						if (local134.method5287(local125)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean228 || Static151.aBoolean164) && arg2 != -1 && arg2 < this.anIntArray336.length) {
				local125 = this.anIntArray336[arg2];
				if (local125 != 65535) {
					local134 = Static1.method1(local125 >> 16);
					local125 &= 0xFFFF;
					if (local134 != null) {
						if (local134.method5289(local125)) {
							local5 |= 0x80;
						}
						if (local134.method5287(local125)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!fb;B)V")
	public void method3417(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3643();
			if (local9 == 0) {
				return;
			}
			this.method3415(local9, arg0);
		}
	}
}
