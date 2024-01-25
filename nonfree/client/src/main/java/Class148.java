import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class148 {

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "[I")
	public int[] anIntArray253;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "[I")
	public int[] anIntArray254;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "[Z")
	public boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "[I")
	public int[] anIntArray256;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "Lclient!ar;")
	public Class18 aClass18_2;

	@OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
	public int anInt3056;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "Z")
	public boolean aBoolean219 = false;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
	public int anInt3047 = -1;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
	public int anInt3046 = -1;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
	public int anInt3044 = 99;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
	public int anInt3043 = 2;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public int anInt3045 = -1;

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "Z")
	public boolean aBoolean222 = false;

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
	public int anInt3050 = 5;

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
	public int anInt3052 = -1;

	@OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
	public int anInt3057 = -1;

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "Z")
	public boolean aBoolean223 = false;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	public void method2583() {
		if (this.anInt3046 == -1) {
			if (this.aBooleanArray9 == null) {
				this.anInt3046 = 0;
			} else {
				this.anInt3046 = 2;
			}
		}
		if (this.anInt3052 != -1) {
			return;
		}
		if (this.aBooleanArray9 == null) {
			this.anInt3052 = 0;
		} else {
			this.anInt3052 = 2;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLclient!gk;)V")
	public void method2584(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4464();
			if (local7 == 0) {
				return;
			}
			this.method2588(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIBILclient!da;II)Lclient!da;")
	public Class33 method2585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class33 arg5, @OriginalArg(6) int arg6) {
		@Pc(8) int local8 = this.anIntArray253[arg2];
		@Pc(13) int local13 = this.anIntArray254[arg2];
		@Pc(23) Class2_Sub2_Sub15 local23 = this.aClass18_2.method292(local13 >> 16);
		@Pc(27) int local27 = local13 & 0xFFFF;
		if (local23 == null) {
			return arg5.method7200(arg3, arg0, true);
		}
		@Pc(37) Class2_Sub2_Sub15 local37 = null;
		if ((this.aBoolean219 || Static269.aBoolean328) && arg6 != -1 && arg6 < this.anIntArray254.length) {
			@Pc(55) int local55 = this.anIntArray254[arg6];
			local37 = this.aClass18_2.method292(local55 >> 16);
			arg6 = local55 & 0xFFFF;
		}
		if (this.aBoolean220) {
			arg0 |= 0x200;
		}
		if (local23.method5302(local27)) {
			arg0 |= 0x80;
		}
		if (local23.method5305(local27)) {
			arg0 |= 0x100;
		}
		if (local23.method5303(local27)) {
			arg0 |= 0x400;
		}
		if (local37 != null) {
			if (local37.method5302(arg6)) {
				arg0 |= 0x80;
			}
			if (local37.method5305(arg6)) {
				arg0 |= 0x100;
			}
			if (local37.method5303(arg6)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(142) Class33 local142 = arg5.method7200(arg3, arg0, true);
		local142.method7184(local8, local27, arg4, local37, local23, arg1 - 1, arg6, this.aBoolean220);
		return local142;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILclient!da;III)Lclient!da;")
	public Class33 method2586(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = this.anIntArray253[arg0];
		@Pc(18) int local18 = this.anIntArray254[arg0];
		@Pc(26) Class2_Sub2_Sub15 local26 = this.aClass18_2.method292(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return arg1.method7200((byte) 1, arg2, true);
		}
		@Pc(40) Class2_Sub2_Sub15 local40 = null;
		if ((this.aBoolean219 || Static269.aBoolean328) && arg3 != -1 && arg3 < this.anIntArray254.length) {
			@Pc(62) int local62 = this.anIntArray254[arg3];
			local40 = this.aClass18_2.method292(local62 >> 16);
			arg3 = local62 & 0xFFFF;
		}
		@Pc(76) Class2_Sub2_Sub15 local76 = null;
		@Pc(78) Class2_Sub2_Sub15 local78 = null;
		@Pc(80) int local80 = 0;
		@Pc(82) int local82 = 0;
		if (this.anIntArray252 != null) {
			if (this.anIntArray252.length > arg0) {
				local80 = this.anIntArray252[arg0];
				if (local80 != 65535) {
					local76 = this.aClass18_2.method292(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
			if ((this.aBoolean219 || Static269.aBoolean328) && arg3 != -1 && this.anIntArray252.length > arg3) {
				local82 = this.anIntArray252[arg3];
				if (local82 != 65535) {
					local78 = this.aClass18_2.method292(local82 >> 16);
					local82 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean220) {
			arg2 |= 0x200;
		}
		if (local26.method5302(local30)) {
			arg2 |= 0x80;
		}
		if (local26.method5305(local30)) {
			arg2 |= 0x100;
		}
		if (local26.method5303(local30)) {
			arg2 |= 0x400;
		}
		if (local76 != null) {
			if (local76.method5302(local80)) {
				arg2 |= 0x80;
			}
			if (local76.method5305(local80)) {
				arg2 |= 0x100;
			}
			if (local76.method5303(local80)) {
				arg2 |= 0x400;
			}
		}
		if (local40 != null) {
			if (local40.method5302(arg3)) {
				arg2 |= 0x80;
			}
			if (local40.method5305(arg3)) {
				arg2 |= 0x100;
			}
			if (local40.method5303(arg3)) {
				arg2 |= 0x400;
			}
		}
		if (local78 != null) {
			if (local78.method5302(local82)) {
				arg2 |= 0x80;
			}
			if (local78.method5305(local82)) {
				arg2 |= 0x100;
			}
			if (local78.method5303(local82)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(286) Class33 local286 = arg1.method7200((byte) 1, arg2, true);
		local286.method7184(local13, local30, 0, local40, local26, arg4 - 1, arg3, this.aBoolean220);
		if (local76 != null) {
			local286.method7184(local13, local80, 0, local78, local76, arg4 - 1, local82, this.aBoolean220);
		}
		return local286;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZIBI)I")
	public int method2587(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray254[arg1];
		@Pc(19) Class2_Sub2_Sub15 local19 = null;
		@Pc(27) Class2_Sub2_Sub15 local27 = this.aClass18_2.method292(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean219 || Static269.aBoolean328) && arg2 != -1 && this.anIntArray254.length > arg2) {
			local12 = this.anIntArray254[arg2];
			local19 = this.aClass18_2.method292(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean220) {
			local10 = 512;
		}
		if (local27.method5302(local31)) {
			local10 |= 0x80;
		}
		if (local27.method5305(local31)) {
			local10 |= 0x100;
		}
		if (local27.method5303(local31)) {
			local10 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method5302(local12)) {
				local10 |= 0x80;
			}
			if (local19.method5305(local12)) {
				local10 |= 0x100;
			}
			if (local19.method5303(local12)) {
				local10 |= 0x400;
			}
		}
		if (this.anIntArray252 != null && arg0) {
			@Pc(150) int local150;
			@Pc(163) Class2_Sub2_Sub15 local163;
			if (this.anIntArray252.length > arg1) {
				local150 = this.anIntArray252[arg1];
				if (local150 != 65535) {
					local163 = this.aClass18_2.method292(local150 >> 16);
					local150 &= 0xFFFF;
					if (local163 != null) {
						if (local163.method5302(local150)) {
							local10 |= 0x80;
						}
						if (local163.method5305(local150)) {
							local10 |= 0x100;
						}
						if (local163.method5303(local150)) {
							local10 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean219 || Static269.aBoolean328) && arg2 != -1 && arg2 < this.anIntArray252.length) {
				local150 = this.anIntArray252[arg2];
				if (local150 != 65535) {
					local163 = this.aClass18_2.method292(local150 >> 16);
					local150 &= 0xFFFF;
					if (local163 != null) {
						if (local163.method5302(local150)) {
							local10 |= 0x80;
						}
						if (local163.method5305(local150)) {
							local10 |= 0x100;
						}
						if (local163.method5303(local150)) {
							local10 |= 0x400;
						}
					}
				}
			}
		}
		return local10 | 0x20;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BILclient!gk;)V")
	private void method2588(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(48) int local48;
		@Pc(67) int local67;
		if (arg0 == 1) {
			local19 = arg1.method4518();
			this.anIntArray253 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray253[local25] = arg1.method4518();
			}
			this.anIntArray254 = new int[local19];
			for (local48 = 0; local48 < local19; local48++) {
				this.anIntArray254[local48] = arg1.method4518();
			}
			for (local67 = 0; local67 < local19; local67++) {
				this.anIntArray254[local67] = (arg1.method4518() << 16) + this.anIntArray254[local67];
			}
		} else if (arg0 == 2) {
			this.anInt3045 = arg1.method4518();
		} else if (arg0 == 3) {
			this.aBooleanArray9 = new boolean[256];
			local19 = arg1.method4464();
			for (local25 = 0; local25 < local19; local25++) {
				this.aBooleanArray9[arg1.method4464()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt3050 = arg1.method4464();
		} else if (arg0 == 6) {
			this.anInt3047 = arg1.method4518();
		} else if (arg0 == 7) {
			this.anInt3057 = arg1.method4518();
		} else if (arg0 == 8) {
			this.anInt3044 = arg1.method4464();
		} else if (arg0 == 9) {
			this.anInt3046 = arg1.method4464();
		} else if (arg0 == 10) {
			this.anInt3052 = arg1.method4464();
		} else if (arg0 == 11) {
			this.anInt3043 = arg1.method4464();
		} else if (arg0 == 12) {
			local19 = arg1.method4464();
			this.anIntArray252 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray252[local25] = arg1.method4518();
			}
			for (local48 = 0; local48 < local19; local48++) {
				this.anIntArray252[local48] = (arg1.method4518() << 16) + this.anIntArray252[local48];
			}
		} else if (arg0 == 13) {
			local19 = arg1.method4518();
			this.anIntArrayArray34 = new int[local19][];
			for (local25 = 0; local25 < local19; local25++) {
				local48 = arg1.method4464();
				if (local48 > 0) {
					this.anIntArrayArray34[local25] = new int[local48];
					this.anIntArrayArray34[local25][0] = arg1.method4503();
					for (local67 = 1; local67 < local48; local67++) {
						this.anIntArrayArray34[local25][local67] = arg1.method4518();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean220 = true;
		} else if (arg0 == 15) {
			this.aBoolean219 = true;
		} else if (arg0 == 16) {
			this.aBoolean223 = true;
		} else if (arg0 == 18) {
			this.aBoolean222 = true;
			return;
		} else if (arg0 == 19) {
			if (this.anIntArray251 == null) {
				this.anIntArray251 = new int[this.anIntArrayArray34.length];
				for (local19 = 0; local19 < this.anIntArrayArray34.length; local19++) {
					this.anIntArray251[local19] = 255;
				}
			}
			this.anIntArray251[arg1.method4464()] = arg1.method4464();
			return;
		} else if (arg0 == 20) {
			if (this.anIntArray255 == null || this.anIntArray256 == null) {
				this.anIntArray255 = new int[this.anIntArrayArray34.length];
				this.anIntArray256 = new int[this.anIntArrayArray34.length];
				for (local19 = 0; local19 < this.anIntArrayArray34.length; local19++) {
					this.anIntArray255[local19] = 256;
					this.anIntArray256[local19] = 256;
				}
			}
			local19 = arg1.method4464();
			this.anIntArray255[local19] = arg1.method4518();
			this.anIntArray256[local19] = arg1.method4518();
			return;
		}
	}
}
