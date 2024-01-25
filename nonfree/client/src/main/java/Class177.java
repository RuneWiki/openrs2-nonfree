import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class177 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "[Z")
	public boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
	public int anInt5032;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "Lclient!vm;")
	public Class254 aClass254_2;

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Z")
	public boolean aBoolean573 = false;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	public int anInt5037 = 2;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
	public int anInt5039 = 5;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
	public int anInt5036 = -1;

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
	public int anInt5047 = -1;

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
	public int anInt5044 = 0;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "Z")
	public boolean aBoolean574 = false;

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
	public int anInt5043 = 99;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
	public int anInt5041 = -1;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
	public int anInt5033 = -1;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
	public int anInt5042 = -1;

	@OriginalMember(owner = "client!oj", name = "D", descriptor = "Z")
	public boolean aBoolean576 = false;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!e;IIIIBI)Lclient!e;")
	public Class57 method3953(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		@Pc(8) int local8 = this.anIntArray327[arg4];
		@Pc(13) int local13 = this.anIntArray326[arg4];
		@Pc(21) Class1_Sub5_Sub2 local21 = this.aClass254_2.method5672(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method5966(arg6, arg0, true);
		}
		@Pc(35) Class1_Sub5_Sub2 local35 = null;
		if ((this.aBoolean573 || Static389.aBoolean713) && arg3 != -1 && arg3 < this.anIntArray326.length) {
			@Pc(58) int local58 = this.anIntArray326[arg3];
			local35 = this.aClass254_2.method5672(local58 >> 16);
			arg3 = local58 & 0xFFFF;
		}
		if (this.aBoolean576) {
			arg0 |= 0x200;
		}
		if (local21.method634(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method630(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method629(local25)) {
			arg0 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method634(arg3)) {
				arg0 |= 0x80;
			}
			if (local35.method630(arg3)) {
				arg0 |= 0x100;
			}
			if (local35.method629(arg3)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(148) Class57 local148 = arg1.method5966(arg6, arg0, true);
		local148.method5962(local21, arg5, local8, arg2 - 1, arg3, local25, this.aBoolean576, local35);
		return local148;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!e;IIBII)Lclient!e;")
	public Class57 method3954(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray327[arg3];
		@Pc(13) int local13 = this.anIntArray326[arg3];
		@Pc(21) Class1_Sub5_Sub2 local21 = this.aClass254_2.method5672(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method5966((byte) 1, arg1, true);
		}
		@Pc(35) Class1_Sub5_Sub2 local35 = null;
		if ((this.aBoolean573 || Static389.aBoolean713) && arg2 != -1 && arg2 < this.anIntArray326.length) {
			@Pc(54) int local54 = this.anIntArray326[arg2];
			local35 = this.aClass254_2.method5672(local54 >> 16);
			arg2 = local54 & 0xFFFF;
		}
		@Pc(68) Class1_Sub5_Sub2 local68 = null;
		@Pc(70) Class1_Sub5_Sub2 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray325 != null) {
			if (arg3 < this.anIntArray325.length) {
				local72 = this.anIntArray325[arg3];
				if (local72 != 65535) {
					local68 = this.aClass254_2.method5672(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean573 || Static389.aBoolean713) && arg2 != -1 && this.anIntArray325.length > arg2) {
				local74 = this.anIntArray325[arg2];
				if (local74 != 65535) {
					local70 = this.aClass254_2.method5672(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean576) {
			arg1 |= 0x200;
		}
		if (local21.method634(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method630(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method629(local25)) {
			arg1 |= 0x400;
		}
		if (local68 != null) {
			if (local68.method634(local72)) {
				arg1 |= 0x80;
			}
			if (local68.method630(local72)) {
				arg1 |= 0x100;
			}
			if (local68.method629(local72)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method634(arg2)) {
				arg1 |= 0x80;
			}
			if (local35.method630(arg2)) {
				arg1 |= 0x100;
			}
			if (local35.method629(arg2)) {
				arg1 |= 0x400;
			}
		}
		if (local70 != null) {
			if (local70.method634(local74)) {
				arg1 |= 0x80;
			}
			if (local70.method630(local74)) {
				arg1 |= 0x100;
			}
			if (local70.method629(local74)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(287) Class57 local287 = arg0.method5966((byte) 1, arg1, true);
		local287.method5962(local21, 0, local8, arg4 - 1, arg2, local25, this.aBoolean576, local35);
		if (local68 != null) {
			local287.method5962(local68, 0, local8, arg4 - 1, local74, local72, this.aBoolean576, local70);
		}
		return local287;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!ug;I)V")
	private void method3956(@OriginalArg(1) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(37) int local37;
		@Pc(56) int local56;
		if (arg1 == 1) {
			local12 = arg0.method5335();
			this.anIntArray327 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray327[local18] = arg0.method5335();
			}
			this.anIntArray326 = new int[local12];
			for (local37 = 0; local37 < local12; local37++) {
				this.anIntArray326[local37] = arg0.method5335();
			}
			for (local56 = 0; local56 < local12; local56++) {
				this.anIntArray326[local56] += arg0.method5335() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt5041 = arg0.method5335();
		} else if (arg1 == 3) {
			this.aBooleanArray15 = new boolean[256];
			local12 = arg0.method5337();
			for (local18 = 0; local18 < local12; local18++) {
				this.aBooleanArray15[arg0.method5337()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt5039 = arg0.method5337();
		} else if (arg1 == 6) {
			this.anInt5033 = arg0.method5335();
		} else if (arg1 == 7) {
			this.anInt5047 = arg0.method5335();
		} else if (arg1 == 8) {
			this.anInt5043 = arg0.method5337();
		} else if (arg1 == 9) {
			this.anInt5042 = arg0.method5337();
		} else if (arg1 == 10) {
			this.anInt5036 = arg0.method5337();
		} else if (arg1 == 11) {
			this.anInt5037 = arg0.method5337();
		} else if (arg1 == 12) {
			local12 = arg0.method5337();
			this.anIntArray325 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray325[local18] = arg0.method5335();
			}
			for (local37 = 0; local37 < local12; local37++) {
				this.anIntArray325[local37] = (arg0.method5335() << 16) + this.anIntArray325[local37];
			}
		} else if (arg1 == 13) {
			local12 = arg0.method5335();
			this.anIntArrayArray42 = new int[local12][];
			for (local18 = 0; local18 < local12; local18++) {
				local37 = arg0.method5337();
				if (local37 > 0) {
					this.anIntArrayArray42[local18] = new int[local37];
					this.anIntArrayArray42[local18][0] = arg0.method5345();
					for (local56 = 1; local56 < local37; local56++) {
						this.anIntArrayArray42[local18][local56] = arg0.method5335();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean576 = true;
		} else if (arg1 == 15) {
			this.aBoolean573 = true;
		} else if (arg1 == 16) {
			this.aBoolean574 = true;
		} else if (arg1 == 17) {
			this.anInt5044 = arg0.method5337();
			return;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ug;B)V")
	public void method3957(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5337();
			if (local15 == 0) {
				return;
			}
			this.method3956(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZIB)I")
	public int method3959(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray326[arg0];
		@Pc(20) Class1_Sub5_Sub2 local20 = null;
		@Pc(28) Class1_Sub5_Sub2 local28 = this.aClass254_2.method5672(local12 >> 16);
		@Pc(32) int local32 = local12 & 0xFFFF;
		if (local28 == null) {
			return 0;
		}
		if ((this.aBoolean573 || Static389.aBoolean713) && arg2 != -1 && this.anIntArray326.length > arg2) {
			local7 = this.anIntArray326[arg2];
			local20 = this.aClass254_2.method5672(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean576) {
			local5 = 512;
		}
		if (local28.method634(local32)) {
			local5 |= 0x80;
		}
		if (local28.method630(local32)) {
			local5 |= 0x100;
		}
		if (local28.method629(local32)) {
			local5 |= 0x400;
		}
		if (local20 != null) {
			if (local20.method634(local7)) {
				local5 |= 0x80;
			}
			if (local20.method630(local7)) {
				local5 |= 0x100;
			}
			if (local20.method629(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray325 != null && arg1) {
			@Pc(149) int local149;
			@Pc(160) Class1_Sub5_Sub2 local160;
			if (arg0 < this.anIntArray325.length) {
				local149 = this.anIntArray325[arg0];
				if (local149 != 65535) {
					local160 = this.aClass254_2.method5672(local149 >> 16);
					local149 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method634(local149)) {
							local5 |= 0x80;
						}
						if (local160.method630(local149)) {
							local5 |= 0x100;
						}
						if (local160.method629(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean573 || Static389.aBoolean713) && arg2 != -1 && arg2 < this.anIntArray325.length) {
				local149 = this.anIntArray325[arg2];
				if (local149 != 65535) {
					local160 = this.aClass254_2.method5672(local149 >> 16);
					local149 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method634(local149)) {
							local5 |= 0x80;
						}
						if (local160.method630(local149)) {
							local5 |= 0x100;
						}
						if (local160.method629(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public void method3960() {
		if (this.anInt5042 == -1) {
			if (this.aBooleanArray15 == null) {
				this.anInt5042 = 0;
			} else {
				this.anInt5042 = 2;
			}
		}
		if (this.anInt5036 != -1) {
			return;
		}
		if (this.aBooleanArray15 == null) {
			this.anInt5036 = 0;
		} else {
			this.anInt5036 = 2;
		}
	}
}
