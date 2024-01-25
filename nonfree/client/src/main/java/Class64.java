import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class64 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "[I")
	public int[] anIntArray184;

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!dba", name = "j", descriptor = "[Z")
	public boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!dba", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
	public int anInt1971;

	@OriginalMember(owner = "client!dba", name = "A", descriptor = "Lclient!bu;")
	public Class41 aClass41_2;

	@OriginalMember(owner = "client!dba", name = "B", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
	public int anInt1965 = 0;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
	public int anInt1958 = -1;

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
	public int anInt1967 = -1;

	@OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
	public int anInt1962 = -1;

	@OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
	public int anInt1969 = -1;

	@OriginalMember(owner = "client!dba", name = "s", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
	public int anInt1968 = 5;

	@OriginalMember(owner = "client!dba", name = "w", descriptor = "I")
	public int anInt1972 = 2;

	@OriginalMember(owner = "client!dba", name = "y", descriptor = "I")
	public int anInt1973 = 99;

	@OriginalMember(owner = "client!dba", name = "C", descriptor = "I")
	public int anInt1975 = -1;

	@OriginalMember(owner = "client!dba", name = "x", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIILclient!r;I)Lclient!r;")
	public Class26 method1826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class26 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray184[arg2];
		@Pc(13) int local13 = this.anIntArray185[arg2];
		@Pc(21) Class12_Sub4_Sub13 local21 = this.aClass41_2.method910(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method7992((byte) 1, arg1, true);
		}
		@Pc(35) Class12_Sub4_Sub13 local35 = null;
		if ((this.aBoolean139 || Static358.aBoolean490) && arg4 != -1 && arg4 < this.anIntArray185.length) {
			@Pc(54) int local54 = this.anIntArray185[arg4];
			local35 = this.aClass41_2.method910(local54 >> 16);
			arg4 = local54 & 0xFFFF;
		}
		@Pc(68) Class12_Sub4_Sub13 local68 = null;
		@Pc(70) Class12_Sub4_Sub13 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray186 != null) {
			if (this.anIntArray186.length > arg2) {
				local72 = this.anIntArray186[arg2];
				if (local72 != 65535) {
					local68 = this.aClass41_2.method910(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean139 || Static358.aBoolean490) && arg4 != -1 && arg4 < this.anIntArray186.length) {
				local74 = this.anIntArray186[arg4];
				if (local74 != 65535) {
					local70 = this.aClass41_2.method910(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean138) {
			arg1 |= 0x200;
		}
		if (local21.method5401(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method5402(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method5403(local25)) {
			arg1 |= 0x400;
		}
		if (local68 != null) {
			if (local68.method5401(local72)) {
				arg1 |= 0x80;
			}
			if (local68.method5402(local72)) {
				arg1 |= 0x100;
			}
			if (local68.method5403(local72)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method5401(arg4)) {
				arg1 |= 0x80;
			}
			if (local35.method5402(arg4)) {
				arg1 |= 0x100;
			}
			if (local35.method5403(arg4)) {
				arg1 |= 0x400;
			}
		}
		if (local70 != null) {
			if (local70.method5401(local74)) {
				arg1 |= 0x80;
			}
			if (local70.method5402(local74)) {
				arg1 |= 0x100;
			}
			if (local70.method5403(local74)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(274) Class26 local274 = arg3.method7992((byte) 1, arg1, true);
		local274.method8001(0, local35, this.aBoolean138, local21, local25, local8, arg4, arg0 - 1);
		if (local68 != null) {
			local274.method8001(0, local70, this.aBoolean138, local68, local72, local8, local74, arg0 - 1);
		}
		return local274;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!daa;I)V")
	public void method1827(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5216();
			if (local16 == 0) {
				return;
			}
			this.method1835(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIZI)I")
	public int method1829(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray185[arg2];
		@Pc(19) Class12_Sub4_Sub13 local19 = null;
		@Pc(27) Class12_Sub4_Sub13 local27 = this.aClass41_2.method910(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean139 || Static358.aBoolean490) && arg0 != -1 && this.anIntArray185.length > arg0) {
			local12 = this.anIntArray185[arg0];
			local19 = this.aClass41_2.method910(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean138) {
			local10 = 512;
		}
		if (local27.method5401(local31)) {
			local10 |= 0x80;
		}
		if (local27.method5402(local31)) {
			local10 |= 0x100;
		}
		if (local27.method5403(local31)) {
			local10 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method5401(local12)) {
				local10 |= 0x80;
			}
			if (local19.method5402(local12)) {
				local10 |= 0x100;
			}
			if (local19.method5403(local12)) {
				local10 |= 0x400;
			}
		}
		if (this.anIntArray186 != null && arg1) {
			@Pc(143) int local143;
			@Pc(156) Class12_Sub4_Sub13 local156;
			if (arg2 < this.anIntArray186.length) {
				local143 = this.anIntArray186[arg2];
				if (local143 != 65535) {
					local156 = this.aClass41_2.method910(local143 >> 16);
					local143 &= 0xFFFF;
					if (local156 != null) {
						if (local156.method5401(local143)) {
							local10 |= 0x80;
						}
						if (local156.method5402(local143)) {
							local10 |= 0x100;
						}
						if (local156.method5403(local143)) {
							local10 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean139 || Static358.aBoolean490) && arg0 != -1 && arg0 < this.anIntArray186.length) {
				local143 = this.anIntArray186[arg0];
				if (local143 != 65535) {
					local156 = this.aClass41_2.method910(local143 >> 16);
					local143 &= 0xFFFF;
					if (local156 != null) {
						if (local156.method5401(local143)) {
							local10 |= 0x80;
						}
						if (local156.method5402(local143)) {
							local10 |= 0x100;
						}
						if (local156.method5403(local143)) {
							local10 |= 0x400;
						}
					}
				}
			}
		}
		return local10 | 0x20;
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V")
	public void method1832() {
		if (this.anInt1975 == -1) {
			if (this.aBooleanArray19 == null) {
				this.anInt1975 = 0;
			} else {
				this.anInt1975 = 2;
			}
		}
		if (this.anInt1967 != -1) {
			return;
		}
		if (this.aBooleanArray19 == null) {
			this.anInt1967 = 0;
		} else {
			this.anInt1967 = 2;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!r;BIIIII)Lclient!r;")
	public Class26 method1834(@OriginalArg(1) Class26 arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray184[arg5];
		@Pc(13) int local13 = this.anIntArray185[arg5];
		@Pc(27) Class12_Sub4_Sub13 local27 = this.aClass41_2.method910(local13 >> 16);
		@Pc(31) int local31 = local13 & 0xFFFF;
		if (local27 == null) {
			return arg0.method7992(arg1, arg4, true);
		}
		@Pc(41) Class12_Sub4_Sub13 local41 = null;
		if ((this.aBoolean139 || Static358.aBoolean490) && arg2 != -1 && this.anIntArray185.length > arg2) {
			@Pc(63) int local63 = this.anIntArray185[arg2];
			local41 = this.aClass41_2.method910(local63 >> 16);
			arg2 = local63 & 0xFFFF;
		}
		if (this.aBoolean138) {
			arg4 |= 0x200;
		}
		if (local27.method5401(local31)) {
			arg4 |= 0x80;
		}
		if (local27.method5402(local31)) {
			arg4 |= 0x100;
		}
		if (local27.method5403(local31)) {
			arg4 |= 0x400;
		}
		if (local41 != null) {
			if (local41.method5401(arg2)) {
				arg4 |= 0x80;
			}
			if (local41.method5402(arg2)) {
				arg4 |= 0x100;
			}
			if (local41.method5403(arg2)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(148) Class26 local148 = arg0.method7992(arg1, arg4, true);
		local148.method8001(arg3, local41, this.aBoolean138, local27, local31, local8, arg2, arg6 - 1);
		return local148;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!daa;II)V")
	private void method1835(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(45) int local45;
		@Pc(64) int local64;
		if (arg1 == 1) {
			local16 = arg0.method5199();
			this.anIntArray184 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray184[local22] = arg0.method5199();
			}
			this.anIntArray185 = new int[local16];
			for (local45 = 0; local45 < local16; local45++) {
				this.anIntArray185[local45] = arg0.method5199();
			}
			for (local64 = 0; local64 < local16; local64++) {
				this.anIntArray185[local64] = (arg0.method5199() << 16) + this.anIntArray185[local64];
			}
		} else if (arg1 == 2) {
			this.anInt1962 = arg0.method5199();
		} else if (arg1 == 3) {
			this.aBooleanArray19 = new boolean[256];
			local16 = arg0.method5216();
			for (local22 = 0; local22 < local16; local22++) {
				this.aBooleanArray19[arg0.method5216()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt1968 = arg0.method5216();
		} else if (arg1 == 6) {
			this.anInt1969 = arg0.method5199();
		} else if (arg1 == 7) {
			this.anInt1958 = arg0.method5199();
		} else if (arg1 == 8) {
			this.anInt1973 = arg0.method5216();
		} else if (arg1 == 9) {
			this.anInt1967 = arg0.method5216();
		} else if (arg1 == 10) {
			this.anInt1975 = arg0.method5216();
		} else if (arg1 == 11) {
			this.anInt1972 = arg0.method5216();
		} else if (arg1 == 12) {
			local16 = arg0.method5216();
			this.anIntArray186 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray186[local22] = arg0.method5199();
			}
			for (local45 = 0; local45 < local16; local45++) {
				this.anIntArray186[local45] += arg0.method5199() << 16;
			}
		} else if (arg1 == 13) {
			local16 = arg0.method5199();
			this.anIntArrayArray21 = new int[local16][];
			for (local22 = 0; local22 < local16; local22++) {
				local45 = arg0.method5216();
				if (local45 > 0) {
					this.anIntArrayArray21[local22] = new int[local45];
					this.anIntArrayArray21[local22][0] = arg0.method5195();
					for (local64 = 1; local64 < local45; local64++) {
						this.anIntArrayArray21[local22][local64] = arg0.method5199();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean138 = true;
		} else if (arg1 == 15) {
			this.aBoolean139 = true;
		} else if (arg1 == 16) {
			this.aBoolean140 = true;
		} else if (arg1 == 17) {
			this.anInt1965 = arg0.method5216();
			return;
		}
	}
}
