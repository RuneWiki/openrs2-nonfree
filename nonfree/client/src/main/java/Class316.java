import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class316 {

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "[Lclient!iia;")
	public Class173[] aClass173Array5;

	@OriginalMember(owner = "client!rha", name = "k", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!rha", name = "N", descriptor = "[I")
	public int[] anIntArray566;

	@OriginalMember(owner = "client!rha", name = "V", descriptor = "[I")
	public int[] anIntArray567;

	@OriginalMember(owner = "client!rha", name = "g", descriptor = "[Lclient!wl;")
	public Class395[] aClass395Array1;

	@OriginalMember(owner = "client!rha", name = "C", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!rha", name = "X", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!rha", name = "F", descriptor = "[I")
	public int[] anIntArray568;

	@OriginalMember(owner = "client!rha", name = "D", descriptor = "[S")
	public short[] aShortArray125;

	@OriginalMember(owner = "client!rha", name = "I", descriptor = "[S")
	public short[] aShortArray126;

	@OriginalMember(owner = "client!rha", name = "q", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "[S")
	public short[] aShortArray127;

	@OriginalMember(owner = "client!rha", name = "U", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!rha", name = "gb", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!rha", name = "x", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!rha", name = "T", descriptor = "[I")
	public int[] anIntArray569;

	@OriginalMember(owner = "client!rha", name = "K", descriptor = "[I")
	public int[] anIntArray570;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!rha", name = "u", descriptor = "[I")
	public int[] anIntArray571;

	@OriginalMember(owner = "client!rha", name = "i", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!rha", name = "E", descriptor = "[I")
	public int[] anIntArray572;

	@OriginalMember(owner = "client!rha", name = "r", descriptor = "[I")
	public int[] anIntArray573;

	@OriginalMember(owner = "client!rha", name = "bb", descriptor = "[S")
	public short[] aShortArray131;

	@OriginalMember(owner = "client!rha", name = "f", descriptor = "[Lclient!kw;")
	public Class216[] aClass216Array5;

	@OriginalMember(owner = "client!rha", name = "y", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!rha", name = "d", descriptor = "[I")
	public int[] anIntArray574;

	@OriginalMember(owner = "client!rha", name = "h", descriptor = "[S")
	public short[] aShortArray132;

	@OriginalMember(owner = "client!rha", name = "eb", descriptor = "[I")
	public int[] anIntArray575;

	@OriginalMember(owner = "client!rha", name = "db", descriptor = "[B")
	public byte[] aByteArray96;

	@OriginalMember(owner = "client!rha", name = "L", descriptor = "[I")
	public int[] anIntArray576;

	@OriginalMember(owner = "client!rha", name = "w", descriptor = "[S")
	public short[] aShortArray133;

	@OriginalMember(owner = "client!rha", name = "A", descriptor = "I")
	public int anInt8599 = 0;

	@OriginalMember(owner = "client!rha", name = "M", descriptor = "B")
	public byte aByte129 = 0;

	@OriginalMember(owner = "client!rha", name = "m", descriptor = "I")
	public int anInt8613 = 12;

	@OriginalMember(owner = "client!rha", name = "G", descriptor = "I")
	public int anInt8603 = 0;

	@OriginalMember(owner = "client!rha", name = "W", descriptor = "I")
	public int anInt8614 = 0;

	@OriginalMember(owner = "client!rha", name = "ab", descriptor = "I")
	public int anInt8617 = 0;

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "()V")
	private Class316() {
	}

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "([B)V")
	public Class316(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method7537(arg0);
		} else {
			this.method7548(arg0);
		}
	}

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(III)V")
	public Class316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray575 = new int[arg0];
		this.aByteArray94 = new byte[arg1];
		this.aShortArray125 = new short[arg1];
		this.aShortArray129 = new short[arg1];
		this.aByteArray91 = new byte[arg1];
		this.aByteArray90 = new byte[arg1];
		this.aShortArray133 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray92 = new byte[arg2];
			this.anIntArray568 = new int[arg2];
			this.aShortArray128 = new short[arg2];
			this.anIntArray571 = new int[arg2];
			this.aShortArray126 = new short[arg2];
			this.anIntArray567 = new int[arg2];
			this.aByteArray96 = new byte[arg2];
			this.anIntArray573 = new int[arg2];
			this.aByteArray95 = new byte[arg2];
			this.aShortArray130 = new short[arg2];
			this.anIntArray566 = new int[arg2];
			this.anIntArray576 = new int[arg2];
		}
		this.anIntArray574 = new int[arg0];
		this.anIntArray569 = new int[arg0];
		this.aByteArray93 = new byte[arg1];
		this.anIntArray570 = new int[arg0];
		this.aShortArray132 = new short[arg1];
		this.aShortArray131 = new short[arg1];
		this.anIntArray572 = new int[arg1];
	}

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "([Lclient!rha;I)V")
	public Class316(@OriginalArg(0) Class316[] arg0, @OriginalArg(1) int arg1) {
		this.anInt8617 = 0;
		this.anInt8599 = 0;
		this.anInt8614 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte129 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(61) Class316 local61 = arg0[local53];
			if (local61 != null) {
				this.anInt8599 += local61.anInt8599;
				this.anInt8614 += local61.anInt8614;
				this.anInt8617 += local61.anInt8617;
				if (local61.aClass395Array1 != null) {
					local36 += local61.aClass395Array1.length;
				}
				local38 |= local61.aByteArray90 != null;
				if (local61.aClass216Array5 != null) {
					local32 += local61.aClass216Array5.length;
				}
				if (local61.aClass173Array5 != null) {
					local34 += local61.aClass173Array5.length;
				}
				local42 |= local61.aByteArray94 != null;
				if (local61.aByteArray91 == null) {
					if (this.aByte129 == -1) {
						this.aByte129 = local61.aByte129;
					}
					if (this.aByte129 != local61.aByte129) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local61.aShortArray133 != null;
				local44 |= local61.aByteArray93 != null;
				local48 |= local61.anIntArray572 != null;
			}
		}
		this.anIntArray570 = new int[this.anInt8599];
		if (local34 > 0) {
			this.aClass173Array5 = new Class173[local34];
		}
		if (local44) {
			this.aByteArray93 = new byte[this.anInt8614];
		}
		this.anIntArray569 = new int[this.anInt8599];
		this.anIntArray575 = new int[this.anInt8599];
		this.aShortArray131 = new short[this.anInt8614];
		if (local38) {
			this.aByteArray90 = new byte[this.anInt8614];
		}
		if (local36 > 0) {
			this.aClass395Array1 = new Class395[local36];
		}
		this.aShortArray124 = new short[this.anInt8599];
		this.aShortArray125 = new short[this.anInt8614];
		this.anIntArray574 = new int[this.anInt8599];
		if (local40) {
			this.aByteArray91 = new byte[this.anInt8614];
		}
		if (local32 > 0) {
			this.aClass216Array5 = new Class216[local32];
		}
		this.aShortArray129 = new short[this.anInt8614];
		if (local42) {
			this.aByteArray94 = new byte[this.anInt8614];
		}
		if (this.anInt8617 > 0) {
			this.aShortArray126 = new short[this.anInt8617];
			this.anIntArray571 = new int[this.anInt8617];
			this.aByteArray95 = new byte[this.anInt8617];
			this.anIntArray576 = new int[this.anInt8617];
			this.aShortArray128 = new short[this.anInt8617];
			this.anIntArray567 = new int[this.anInt8617];
			this.anIntArray573 = new int[this.anInt8617];
			this.anIntArray568 = new int[this.anInt8617];
			this.aByteArray92 = new byte[this.anInt8617];
			this.anIntArray566 = new int[this.anInt8617];
			this.aShortArray130 = new short[this.anInt8617];
			this.aByteArray96 = new byte[this.anInt8617];
		}
		if (local46) {
			this.aShortArray133 = new short[this.anInt8614];
		}
		this.aShortArray132 = new short[this.anInt8614];
		this.aShortArray127 = new short[this.anInt8614];
		if (local48) {
			this.anIntArray572 = new int[this.anInt8614];
		}
		this.anInt8617 = 0;
		this.anInt8614 = 0;
		local32 = 0;
		local36 = 0;
		local34 = 0;
		this.anInt8599 = 0;
		@Pc(693) int local693;
		@Pc(704) int local704;
		for (@Pc(423) int local423 = 0; local423 < arg1; local423++) {
			@Pc(430) short local430 = (short) (0x1 << local423);
			@Pc(434) Class316 local434 = arg0[local423];
			if (local434 != null) {
				@Pc(443) int local443;
				if (local434.aClass395Array1 != null) {
					for (local443 = 0; local443 < local434.aClass395Array1.length; local443++) {
						@Pc(450) Class395 local450 = local434.aClass395Array1[local443];
						this.aClass395Array1[local36++] = local450.method8943(local450.anInt10374 + this.anInt8614);
					}
				}
				for (local443 = 0; local443 < local434.anInt8614; local443++) {
					if (local38 && local434.aByteArray90 != null) {
						this.aByteArray90[this.anInt8614] = local434.aByteArray90[local443];
					}
					if (local40) {
						if (local434.aByteArray91 == null) {
							this.aByteArray91[this.anInt8614] = local434.aByte129;
						} else {
							this.aByteArray91[this.anInt8614] = local434.aByteArray91[local443];
						}
					}
					if (local42 && local434.aByteArray94 != null) {
						this.aByteArray94[this.anInt8614] = local434.aByteArray94[local443];
					}
					if (local46) {
						if (local434.aShortArray133 == null) {
							this.aShortArray133[this.anInt8614] = -1;
						} else {
							this.aShortArray133[this.anInt8614] = local434.aShortArray133[local443];
						}
					}
					if (local48) {
						if (local434.anIntArray572 == null) {
							this.anIntArray572[this.anInt8614] = -1;
						} else {
							this.anIntArray572[this.anInt8614] = local434.anIntArray572[local443];
						}
					}
					this.aShortArray131[this.anInt8614] = (short) this.method7550(local434, local430, local434.aShortArray131[local443]);
					this.aShortArray125[this.anInt8614] = (short) this.method7550(local434, local430, local434.aShortArray125[local443]);
					this.aShortArray129[this.anInt8614] = (short) this.method7550(local434, local430, local434.aShortArray129[local443]);
					this.aShortArray127[this.anInt8614] = local430;
					this.aShortArray132[this.anInt8614] = local434.aShortArray132[local443];
					this.anInt8614++;
				}
				@Pc(680) int local680;
				if (local434.aClass216Array5 != null) {
					for (local680 = 0; local680 < local434.aClass216Array5.length; local680++) {
						local693 = this.method7550(local434, local430, local434.aClass216Array5[local680].anInt5662);
						local704 = this.method7550(local434, local430, local434.aClass216Array5[local680].anInt5658);
						@Pc(715) int local715 = this.method7550(local434, local430, local434.aClass216Array5[local680].anInt5664);
						this.aClass216Array5[local32] = local434.aClass216Array5[local680].method5136(local715, local704, local693);
						local32++;
					}
				}
				if (local434.aClass173Array5 != null) {
					for (local680 = 0; local680 < local434.aClass173Array5.length; local680++) {
						local693 = this.method7550(local434, local430, local434.aClass173Array5[local680].anInt4951);
						this.aClass173Array5[local34] = local434.aClass173Array5[local680].method4484(local693);
						local34++;
					}
				}
			}
		}
		@Pc(785) int local785 = 0;
		this.anInt8603 = this.anInt8599;
		for (@Pc(791) int local791 = 0; local791 < arg1; local791++) {
			@Pc(800) short local800 = (short) (0x1 << local791);
			@Pc(804) Class316 local804 = arg0[local791];
			if (local804 != null) {
				for (local693 = 0; local693 < local804.anInt8614; local693++) {
					if (local44) {
						this.aByteArray93[local785++] = (byte) (local804.aByteArray93 == null || local804.aByteArray93[local693] == -1 ? -1 : this.anInt8617 + local804.aByteArray93[local693]);
					}
				}
				for (local704 = 0; local704 < local804.anInt8617; local704++) {
					@Pc(870) byte local870 = this.aByteArray96[this.anInt8617] = local804.aByteArray96[local704];
					if (local870 == 0) {
						this.aShortArray126[this.anInt8617] = (short) this.method7550(local804, local800, local804.aShortArray126[local704]);
						this.aShortArray128[this.anInt8617] = (short) this.method7550(local804, local800, local804.aShortArray128[local704]);
						this.aShortArray130[this.anInt8617] = (short) this.method7550(local804, local800, local804.aShortArray130[local704]);
					}
					if (local870 >= 1 && local870 <= 3) {
						this.aShortArray126[this.anInt8617] = local804.aShortArray126[local704];
						this.aShortArray128[this.anInt8617] = local804.aShortArray128[local704];
						this.aShortArray130[this.anInt8617] = local804.aShortArray130[local704];
						this.anIntArray571[this.anInt8617] = local804.anIntArray571[local704];
						this.anIntArray573[this.anInt8617] = local804.anIntArray573[local704];
						this.anIntArray567[this.anInt8617] = local804.anIntArray567[local704];
						this.aByteArray95[this.anInt8617] = local804.aByteArray95[local704];
						this.aByteArray92[this.anInt8617] = local804.aByteArray92[local704];
						this.anIntArray566[this.anInt8617] = local804.anIntArray566[local704];
					}
					if (local870 == 2) {
						this.anIntArray568[this.anInt8617] = local804.anIntArray568[local704];
						this.anIntArray576[this.anInt8617] = local804.anIntArray576[local704];
					}
					this.anInt8617++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(BZ)[[I")
	public int[][] method7532(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(19) int local19 = arg0 ? this.anInt8599 : this.anInt8603;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(30) int local30 = this.anIntArray569[local21];
			if (local30 >= 0) {
				@Pc(39) int local39 = local8[local30]++;
				if (local10 < local30) {
					local10 = local30;
				}
			}
		}
		@Pc(62) int[][] local62 = new int[local10 + 1][];
		@Pc(64) int local64 = 0;
		if (-41 != -41) {
			return null;
		}
		while (local64 <= local10) {
			local62[local64] = new int[local8[local64]];
			local8[local64] = 0;
			local64++;
		}
		for (@Pc(89) int local89 = 0; local89 < local19; local89++) {
			@Pc(98) int local98 = this.anIntArray569[local89];
			if (local98 >= 0) {
				local62[local98][local8[local98]++] = local89;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(BSBSSSIBSS)B")
	public byte method7534() {
		if (this.anInt8617 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray96[this.anInt8617] = 3;
		this.aShortArray126[this.anInt8617] = 0;
		this.aShortArray128[this.anInt8617] = 32767;
		this.aShortArray130[this.anInt8617] = 0;
		this.anIntArray571[this.anInt8617] = 1024;
		this.anIntArray573[this.anInt8617] = 1024;
		this.anIntArray567[this.anInt8617] = 1024;
		this.aByteArray95[this.anInt8617] = 0;
		this.aByteArray92[this.anInt8617] = 0;
		this.anIntArray566[this.anInt8617] = 0;
		return (byte) this.anInt8617++;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(SIBIIBSBI)I")
	public int method7535(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray131[this.anInt8614] = (short) arg3;
		this.aShortArray125[this.anInt8614] = (short) arg7;
		this.aShortArray129[this.anInt8614] = (short) arg1;
		this.aByteArray90[this.anInt8614] = arg6;
		this.aByteArray93[this.anInt8614] = arg2;
		this.aShortArray132[this.anInt8614] = arg0;
		this.aByteArray94[this.anInt8614] = arg4;
		this.aShortArray133[this.anInt8614] = arg5;
		return this.anInt8614++;
	}

	@OriginalMember(owner = "client!rha", name = "d", descriptor = "(I)[[I")
	public int[][] method7536() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt8614; local20++) {
			@Pc(29) int local29 = this.anIntArray572[local20];
			if (local29 >= 0) {
				@Pc(38) int local38 = local8[local29]++;
				if (local18 < local29) {
					local18 = local29;
				}
			}
		}
		@Pc(66) int[][] local66 = new int[local18 + 1][];
		for (@Pc(70) int local70 = 0; local70 <= local18; local70++) {
			local66[local70] = new int[local8[local70]];
			local8[local70] = 0;
		}
		for (@Pc(95) int local95 = 0; local95 < this.anInt8614; local95++) {
			@Pc(104) int local104 = this.anIntArray572[local95];
			if (local104 >= 0) {
				local66[local104][local8[local104]++] = local95;
			}
		}
		return local66;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "([BI)V")
	private void method7537(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub15 local10 = new Class6_Sub15(arg0);
		@Pc(15) Class6_Sub15 local15 = new Class6_Sub15(arg0);
		@Pc(20) Class6_Sub15 local20 = new Class6_Sub15(arg0);
		@Pc(25) Class6_Sub15 local25 = new Class6_Sub15(arg0);
		@Pc(30) Class6_Sub15 local30 = new Class6_Sub15(arg0);
		@Pc(35) Class6_Sub15 local35 = new Class6_Sub15(arg0);
		@Pc(40) Class6_Sub15 local40 = new Class6_Sub15(arg0);
		local10.anInt3174 = arg0.length - 23;
		this.anInt8599 = local10.method3018();
		this.anInt8614 = local10.method3018();
		this.anInt8617 = local10.method3030();
		@Pc(65) int local65 = local10.method3030();
		@Pc(75) boolean local75 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(97) boolean local97 = (local65 & 0x4) == 4;
		@Pc(109) boolean local109 = (local65 & 0x8) == 8;
		if (local109) {
			local10.anInt3174 -= 7;
			this.anInt8613 = local10.method3030();
			local10.anInt3174 += 6;
		}
		@Pc(134) int local134 = local10.method3030();
		@Pc(138) int local138 = local10.method3030();
		@Pc(142) int local142 = local10.method3030();
		@Pc(146) int local146 = local10.method3030();
		@Pc(150) int local150 = local10.method3030();
		@Pc(154) int local154 = local10.method3018();
		@Pc(158) int local158 = local10.method3018();
		@Pc(162) int local162 = local10.method3018();
		@Pc(166) int local166 = local10.method3018();
		@Pc(170) int local170 = local10.method3018();
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(189) int local189;
		if (this.anInt8617 > 0) {
			this.aByteArray96 = new byte[this.anInt8617];
			local10.anInt3174 = 0;
			for (local189 = 0; local189 < this.anInt8617; local189++) {
				@Pc(200) byte local200 = this.aByteArray96[local189] = local10.method3027();
				if (local200 >= 1 && local200 <= 3) {
					local174++;
				}
				if (local200 == 0) {
					local172++;
				}
				if (local200 == 2) {
					local176++;
				}
			}
		}
		local189 = this.anInt8617;
		@Pc(234) int local234 = local189;
		local189 += this.anInt8599;
		@Pc(241) int local241 = local189;
		if (local75) {
			local189 += this.anInt8614;
		}
		@Pc(254) int local254 = local189;
		local189 += this.anInt8614;
		@Pc(261) int local261 = local189;
		if (local134 == 255) {
			local189 += this.anInt8614;
		}
		@Pc(273) int local273 = local189;
		if (local142 == 1) {
			local189 += this.anInt8614;
		}
		@Pc(283) int local283 = local189;
		if (local150 == 1) {
			local189 += this.anInt8599;
		}
		@Pc(293) int local293 = local189;
		if (local138 == 1) {
			local189 += this.anInt8614;
		}
		@Pc(305) int local305 = local189;
		local189 += local166;
		@Pc(311) int local311 = local189;
		if (local146 == 1) {
			local189 += this.anInt8614 * 2;
		}
		@Pc(323) int local323 = local189;
		local189 += local170;
		@Pc(329) int local329 = local189;
		local189 += this.anInt8614 * 2;
		@Pc(338) int local338 = local189;
		local189 += local154;
		@Pc(344) int local344 = local189;
		local189 += local158;
		@Pc(350) int local350 = local189;
		local189 += local162;
		@Pc(356) int local356 = local189;
		local189 += local172 * 6;
		@Pc(364) int local364 = local189;
		local189 += local174 * 6;
		@Pc(372) byte local372 = 6;
		if (this.anInt8613 == 14) {
			local372 = 7;
		} else if (this.anInt8613 >= 15) {
			local372 = 9;
		}
		@Pc(394) int local394 = local189;
		local189 += local372 * local174;
		@Pc(402) int local402 = local189;
		local189 += local174;
		@Pc(408) int local408 = local189;
		local189 += local174;
		@Pc(414) int local414 = local189;
		local189 += local176 * 2 + local174;
		this.anIntArray574 = new int[this.anInt8599];
		if (local138 == 1) {
			this.aByteArray94 = new byte[this.anInt8614];
		}
		this.aShortArray125 = new short[this.anInt8614];
		if (local146 == 1 && this.anInt8617 > 0) {
			this.aByteArray93 = new byte[this.anInt8614];
		}
		if (local150 == 1) {
			this.anIntArray569 = new int[this.anInt8599];
		}
		if (local75) {
			this.aByteArray90 = new byte[this.anInt8614];
		}
		this.aShortArray131 = new short[this.anInt8614];
		if (local146 == 1) {
			this.aShortArray133 = new short[this.anInt8614];
		}
		if (this.anInt8617 > 0) {
			this.aShortArray130 = new short[this.anInt8617];
			if (local174 > 0) {
				this.anIntArray573 = new int[local174];
				this.aByteArray92 = new byte[local174];
				this.anIntArray567 = new int[local174];
				this.anIntArray566 = new int[local174];
				this.aByteArray95 = new byte[local174];
				this.anIntArray571 = new int[local174];
			}
			if (local176 > 0) {
				this.anIntArray576 = new int[local176];
				this.anIntArray568 = new int[local176];
			}
			this.aShortArray128 = new short[this.anInt8617];
			this.aShortArray126 = new short[this.anInt8617];
		}
		this.aShortArray129 = new short[this.anInt8614];
		if (local134 == 255) {
			this.aByteArray91 = new byte[this.anInt8614];
		} else {
			this.aByte129 = (byte) local134;
		}
		this.aShortArray132 = new short[this.anInt8614];
		local10.anInt3174 = local234;
		if (local142 == 1) {
			this.anIntArray572 = new int[this.anInt8614];
		}
		this.anIntArray570 = new int[this.anInt8599];
		this.anIntArray575 = new int[this.anInt8599];
		local15.anInt3174 = local338;
		local20.anInt3174 = local344;
		local25.anInt3174 = local350;
		local30.anInt3174 = local283;
		@Pc(623) int local623 = 0;
		@Pc(625) int local625 = 0;
		@Pc(627) int local627 = 0;
		@Pc(635) int local635;
		for (@Pc(629) int local629 = 0; local629 < this.anInt8599; local629++) {
			local635 = local10.method3030();
			@Pc(637) int local637 = 0;
			if ((local635 & 0x1) != 0) {
				local637 = local15.method3000();
			}
			@Pc(647) int local647 = 0;
			if ((local635 & 0x2) != 0) {
				local647 = local20.method3000();
			}
			@Pc(660) int local660 = 0;
			if ((local635 & 0x4) != 0) {
				local660 = local25.method3000();
			}
			this.anIntArray570[local629] = local637 + local623;
			this.anIntArray575[local629] = local647 + local625;
			this.anIntArray574[local629] = local660 + local627;
			local627 = this.anIntArray574[local629];
			local623 = this.anIntArray570[local629];
			local625 = this.anIntArray575[local629];
			if (local150 == 1) {
				this.anIntArray569[local629] = local30.method3030();
			}
		}
		local10.anInt3174 = local329;
		local15.anInt3174 = local241;
		local20.anInt3174 = local261;
		local25.anInt3174 = local293;
		local30.anInt3174 = local273;
		local35.anInt3174 = local311;
		local40.anInt3174 = local323;
		for (local635 = 0; local635 < this.anInt8614; local635++) {
			this.aShortArray132[local635] = (short) local10.method3018();
			if (local75) {
				this.aByteArray90[local635] = local15.method3027();
			}
			if (local134 == 255) {
				this.aByteArray91[local635] = local20.method3027();
			}
			if (local138 == 1) {
				this.aByteArray94[local635] = local25.method3027();
			}
			if (local142 == 1) {
				this.anIntArray572[local635] = local30.method3030();
			}
			if (local146 == 1) {
				this.aShortArray133[local635] = (short) (local35.method3018() - 1);
			}
			if (this.aByteArray93 != null) {
				if (this.aShortArray133[local635] == -1) {
					this.aByteArray93[local635] = -1;
				} else {
					this.aByteArray93[local635] = (byte) (local40.method3030() - 1);
				}
			}
		}
		local10.anInt3174 = local305;
		this.anInt8603 = -1;
		local15.anInt3174 = local254;
		@Pc(880) short local880 = 0;
		@Pc(882) short local882 = 0;
		@Pc(884) short local884 = 0;
		@Pc(886) short local886 = 0;
		@Pc(896) int local896;
		for (@Pc(888) int local888 = 0; local888 < this.anInt8614; local888++) {
			local896 = local15.method3030();
			if (local896 == 1) {
				local880 = (short) (local886 + local10.method3000());
				local882 = (short) (local10.method3000() + local880);
				local884 = (short) (local882 + local10.method3000());
				local886 = local884;
				this.aShortArray131[local888] = local880;
				this.aShortArray125[local888] = local882;
				this.aShortArray129[local888] = local884;
				if (local880 > this.anInt8603) {
					this.anInt8603 = local880;
				}
				if (local882 > this.anInt8603) {
					this.anInt8603 = local882;
				}
				if (this.anInt8603 < local884) {
					this.anInt8603 = local884;
				}
			}
			if (local896 == 2) {
				local882 = local884;
				local884 = (short) (local10.method3000() + local886);
				this.aShortArray131[local888] = local880;
				local886 = local884;
				this.aShortArray125[local888] = local882;
				this.aShortArray129[local888] = local884;
				if (local884 > this.anInt8603) {
					this.anInt8603 = local884;
				}
			}
			if (local896 == 3) {
				local880 = local884;
				local884 = (short) (local886 + local10.method3000());
				local886 = local884;
				this.aShortArray131[local888] = local880;
				this.aShortArray125[local888] = local882;
				this.aShortArray129[local888] = local884;
				if (local884 > this.anInt8603) {
					this.anInt8603 = local884;
				}
			}
			if (local896 == 4) {
				@Pc(1061) short local1061 = local880;
				local880 = local882;
				local882 = local1061;
				local884 = (short) (local886 + local10.method3000());
				this.aShortArray131[local888] = local880;
				local886 = local884;
				this.aShortArray125[local888] = local1061;
				this.aShortArray129[local888] = local884;
				if (local884 > this.anInt8603) {
					this.anInt8603 = local884;
				}
			}
		}
		local10.anInt3174 = local356;
		this.anInt8603++;
		local15.anInt3174 = local364;
		local20.anInt3174 = local394;
		local25.anInt3174 = local402;
		local30.anInt3174 = local408;
		local35.anInt3174 = local414;
		@Pc(1146) int local1146;
		for (local896 = 0; local896 < this.anInt8617; local896++) {
			local1146 = this.aByteArray96[local896] & 0xFF;
			if (local1146 == 0) {
				this.aShortArray126[local896] = (short) local10.method3018();
				this.aShortArray128[local896] = (short) local10.method3018();
				this.aShortArray130[local896] = (short) local10.method3018();
			}
			if (local1146 == 1) {
				this.aShortArray126[local896] = (short) local15.method3018();
				this.aShortArray128[local896] = (short) local15.method3018();
				this.aShortArray130[local896] = (short) local15.method3018();
				if (this.anInt8613 >= 15) {
					this.anIntArray571[local896] = local20.method2987();
					this.anIntArray573[local896] = local20.method2987();
					this.anIntArray567[local896] = local20.method2987();
				} else {
					this.anIntArray571[local896] = local20.method3018();
					if (this.anInt8613 >= 14) {
						this.anIntArray573[local896] = local20.method2987();
					} else {
						this.anIntArray573[local896] = local20.method3018();
					}
					this.anIntArray567[local896] = local20.method3018();
				}
				this.aByteArray95[local896] = local25.method3027();
				this.aByteArray92[local896] = local30.method3027();
				this.anIntArray566[local896] = local35.method3027();
			}
			if (local1146 == 2) {
				this.aShortArray126[local896] = (short) local15.method3018();
				this.aShortArray128[local896] = (short) local15.method3018();
				this.aShortArray130[local896] = (short) local15.method3018();
				if (this.anInt8613 >= 15) {
					this.anIntArray571[local896] = local20.method2987();
					this.anIntArray573[local896] = local20.method2987();
					this.anIntArray567[local896] = local20.method2987();
				} else {
					this.anIntArray571[local896] = local20.method3018();
					if (this.anInt8613 < 14) {
						this.anIntArray573[local896] = local20.method3018();
					} else {
						this.anIntArray573[local896] = local20.method2987();
					}
					this.anIntArray567[local896] = local20.method3018();
				}
				this.aByteArray95[local896] = local25.method3027();
				this.aByteArray92[local896] = local30.method3027();
				this.anIntArray566[local896] = local35.method3027();
				this.anIntArray568[local896] = local35.method3027();
				this.anIntArray576[local896] = local35.method3027();
			}
			if (local1146 == 3) {
				this.aShortArray126[local896] = (short) local15.method3018();
				this.aShortArray128[local896] = (short) local15.method3018();
				this.aShortArray130[local896] = (short) local15.method3018();
				if (this.anInt8613 < 15) {
					this.anIntArray571[local896] = local20.method3018();
					if (this.anInt8613 >= 14) {
						this.anIntArray573[local896] = local20.method2987();
					} else {
						this.anIntArray573[local896] = local20.method3018();
					}
					this.anIntArray567[local896] = local20.method3018();
				} else {
					this.anIntArray571[local896] = local20.method2987();
					this.anIntArray573[local896] = local20.method2987();
					this.anIntArray567[local896] = local20.method2987();
				}
				this.aByteArray95[local896] = local25.method3027();
				this.aByteArray92[local896] = local30.method3027();
				this.anIntArray566[local896] = local35.method3027();
			}
		}
		local10.anInt3174 = local189;
		@Pc(1590) int local1590;
		@Pc(1598) int local1598;
		@Pc(1602) int local1602;
		@Pc(1675) int local1675;
		if (local85) {
			local1146 = local10.method3030();
			if (local1146 > 0) {
				this.aClass216Array5 = new Class216[local1146];
				for (local1590 = 0; local1590 < local1146; local1590++) {
					local1598 = local10.method3018();
					local1602 = local10.method3018();
					@Pc(1612) byte local1612;
					if (local134 == 255) {
						local1612 = this.aByteArray91[local1602];
					} else {
						local1612 = (byte) local134;
					}
					this.aClass216Array5[local1590] = new Class216(local1598, this.aShortArray131[local1602], this.aShortArray125[local1602], this.aShortArray129[local1602], local1612);
				}
			}
			local1590 = local10.method3030();
			if (local1590 > 0) {
				this.aClass173Array5 = new Class173[local1590];
				for (local1598 = 0; local1598 < local1590; local1598++) {
					local1602 = local10.method3018();
					local1675 = local10.method3018();
					this.aClass173Array5[local1598] = new Class173(local1602, local1675);
				}
			}
		}
		if (!local97) {
			return;
		}
		local1146 = local10.method3030();
		if (local1146 <= 0) {
			return;
		}
		this.aClass395Array1 = new Class395[local1146];
		for (local1590 = 0; local1590 < local1146; local1590++) {
			local1598 = local10.method3018();
			local1602 = local10.method3018();
			local1675 = local10.method3030();
			@Pc(1726) byte local1726 = local10.method3027();
			this.aClass395Array1[local1590] = new Class395(local1598, local1602, local1675, local1726);
		}
		return;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(II)V")
	public void method7538() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8599; local7++) {
			this.anIntArray570[local7] <<= 0x2;
			this.anIntArray575[local7] <<= 0x2;
			this.anIntArray574[local7] <<= 0x2;
		}
		if (this.anInt8617 <= 0 || this.anIntArray571 == null) {
			return;
		}
		for (@Pc(58) int local58 = 0; local58 < this.anIntArray571.length; local58++) {
			this.anIntArray571[local58] <<= 0x2;
			this.anIntArray573[local58] <<= 0x2;
			if (this.aByteArray96[local58] != 1) {
				this.anIntArray567[local58] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(SIS)V")
	public void method7539(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray133 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt8614; local12++) {
			if (this.aShortArray133[local12] == arg0) {
				this.aShortArray133[local12] = arg1;
			}
		}
		if (9341 != 9341) {
			Static525.method7533(-115, (byte[]) null, 115, 120);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIBI)V")
	public void method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(43) int local43;
		if (arg0 != 0) {
			local19 = Class6_Sub2_Sub12.anIntArray293[arg0];
			local23 = Class6_Sub2_Sub12.anIntArray292[arg0];
			for (local25 = 0; local25 < this.anInt8599; local25++) {
				local43 = local23 * this.anIntArray570[local25] + local19 * this.anIntArray575[local25] >> 14;
				this.anIntArray575[local25] = this.anIntArray575[local25] * local23 - local19 * this.anIntArray570[local25] >> 14;
				this.anIntArray570[local25] = local43;
			}
		}
		if (arg1 != 0) {
			local19 = Class6_Sub2_Sub12.anIntArray293[arg1];
			local23 = Class6_Sub2_Sub12.anIntArray292[arg1];
			for (local25 = 0; local25 < this.anInt8599; local25++) {
				local43 = local23 * this.anIntArray575[local25] - local19 * this.anIntArray574[local25] >> 14;
				this.anIntArray574[local25] = local23 * this.anIntArray574[local25] + this.anIntArray575[local25] * local19 >> 14;
				this.anIntArray575[local25] = local43;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local19 = Class6_Sub2_Sub12.anIntArray293[arg2];
		local23 = Class6_Sub2_Sub12.anIntArray292[arg2];
		for (local25 = 0; local25 < this.anInt8599; local25++) {
			local43 = local23 * this.anIntArray570[local25] + local19 * this.anIntArray574[local25] >> 14;
			this.anIntArray574[local25] = local23 * this.anIntArray574[local25] - local19 * this.anIntArray570[local25] >> 14;
			this.anIntArray570[local25] = local43;
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(SSB)V")
	public void method7542(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8614; local7++) {
			if (arg1 == this.aShortArray132[local7]) {
				this.aShortArray132[local7] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "(I)[[I")
	public int[][] method7543() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass395Array1.length; local12++) {
			@Pc(22) int local22 = this.aClass395Array1[local12].anInt10371;
			if (local22 >= 0) {
				@Pc(31) int local31 = local8[local22]++;
				if (local22 > local10) {
					local10 = local22;
				}
			}
		}
		@Pc(56) int[][] local56 = new int[local10 + 1][];
		if (-7453 != -7453) {
			return null;
		}
		for (@Pc(66) int local66 = 0; local66 <= local10; local66++) {
			local56[local66] = new int[local8[local66]];
			local8[local66] = 0;
		}
		for (@Pc(91) int local91 = 0; local91 < this.aClass395Array1.length; local91++) {
			@Pc(101) int local101 = this.aClass395Array1[local91].anInt10371;
			if (local101 >= 0) {
				local56[local101][local8[local101]++] = local91;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIIZ)V")
	public void method7544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt8599; local11++) {
			this.anIntArray570[local11] += arg0;
			this.anIntArray575[local11] += arg2;
			this.anIntArray574[local11] += arg1;
		}
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "([BI)V")
	private void method7548(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub15 local14 = new Class6_Sub15(arg0);
		@Pc(19) Class6_Sub15 local19 = new Class6_Sub15(arg0);
		@Pc(24) Class6_Sub15 local24 = new Class6_Sub15(arg0);
		@Pc(29) Class6_Sub15 local29 = new Class6_Sub15(arg0);
		@Pc(34) Class6_Sub15 local34 = new Class6_Sub15(arg0);
		local14.anInt3174 = arg0.length - 18;
		this.anInt8599 = local14.method3018();
		this.anInt8614 = local14.method3018();
		this.anInt8617 = local14.method3030();
		@Pc(59) int local59 = local14.method3030();
		@Pc(63) int local63 = local14.method3030();
		@Pc(67) int local67 = local14.method3030();
		@Pc(71) int local71 = local14.method3030();
		@Pc(75) int local75 = local14.method3030();
		@Pc(79) int local79 = local14.method3018();
		@Pc(83) int local83 = local14.method3018();
		@Pc(87) int local87 = local14.method3018();
		@Pc(91) int local91 = local14.method3018();
		@Pc(100) int local100 = this.anInt8599;
		@Pc(102) int local102 = local100;
		local100 += this.anInt8614;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt8614;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt8614;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt8614;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt8599;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt8614;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt8614 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt8617 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		local14.anInt3174 = 0;
		this.aShortArray129 = new short[this.anInt8614];
		if (local67 == 1) {
			this.aByteArray94 = new byte[this.anInt8614];
		}
		this.aShortArray125 = new short[this.anInt8614];
		this.anIntArray570 = new int[this.anInt8599];
		this.anIntArray575 = new int[this.anInt8599];
		if (this.anInt8617 > 0) {
			this.aShortArray126 = new short[this.anInt8617];
			this.aShortArray130 = new short[this.anInt8617];
			this.aByteArray96 = new byte[this.anInt8617];
			this.aShortArray128 = new short[this.anInt8617];
		}
		if (local71 == 1) {
			this.anIntArray572 = new int[this.anInt8614];
		}
		if (local59 == 1) {
			this.aShortArray133 = new short[this.anInt8614];
			this.aByteArray90 = new byte[this.anInt8614];
			this.aByteArray93 = new byte[this.anInt8614];
		}
		this.aShortArray131 = new short[this.anInt8614];
		this.anIntArray574 = new int[this.anInt8599];
		this.aShortArray132 = new short[this.anInt8614];
		if (local75 == 1) {
			this.anIntArray569 = new int[this.anInt8599];
		}
		if (local63 == 255) {
			this.aByteArray91 = new byte[this.anInt8614];
		} else {
			this.aByte129 = (byte) local63;
		}
		local19.anInt3174 = local187;
		local24.anInt3174 = local193;
		local29.anInt3174 = local100;
		local34.anInt3174 = local143;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(356) int local356 = 0;
		@Pc(364) int local364;
		@Pc(366) int local366;
		for (@Pc(358) int local358 = 0; local358 < this.anInt8599; local358++) {
			local364 = local14.method3030();
			local366 = 0;
			if ((local364 & 0x1) != 0) {
				local366 = local19.method3000();
			}
			@Pc(376) int local376 = 0;
			if ((local364 & 0x2) != 0) {
				local376 = local24.method3000();
			}
			@Pc(386) int local386 = 0;
			if ((local364 & 0x4) != 0) {
				local386 = local29.method3000();
			}
			this.anIntArray570[local358] = local366 + local352;
			this.anIntArray575[local358] = local354 + local376;
			this.anIntArray574[local358] = local386 + local356;
			local352 = this.anIntArray570[local358];
			local354 = this.anIntArray575[local358];
			local356 = this.anIntArray574[local358];
			if (local75 == 1) {
				this.anIntArray569[local358] = local34.method3030();
			}
		}
		local14.anInt3174 = local169;
		local19.anInt3174 = local131;
		local24.anInt3174 = local109;
		local29.anInt3174 = local153;
		local34.anInt3174 = local119;
		for (local364 = 0; local364 < this.anInt8614; local364++) {
			this.aShortArray132[local364] = (short) local14.method3018();
			if (local59 == 1) {
				local366 = local19.method3030();
				if ((local366 & 0x1) == 1) {
					local7 = true;
					this.aByteArray90[local364] = 1;
				} else {
					this.aByteArray90[local364] = 0;
				}
				if ((local366 & 0x2) == 2) {
					this.aByteArray93[local364] = (byte) (local366 >> 2);
					this.aShortArray133[local364] = this.aShortArray132[local364];
					this.aShortArray132[local364] = 127;
					if (this.aShortArray133[local364] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray93[local364] = -1;
					this.aShortArray133[local364] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray91[local364] = local24.method3027();
			}
			if (local67 == 1) {
				this.aByteArray94[local364] = local29.method3027();
			}
			if (local71 == 1) {
				this.anIntArray572[local364] = local34.method3030();
			}
		}
		local14.anInt3174 = local163;
		this.anInt8603 = -1;
		local19.anInt3174 = local102;
		@Pc(625) short local625 = 0;
		@Pc(627) short local627 = 0;
		@Pc(629) short local629 = 0;
		@Pc(631) short local631 = 0;
		@Pc(641) int local641;
		for (@Pc(633) int local633 = 0; local633 < this.anInt8614; local633++) {
			local641 = local19.method3030();
			if (local641 == 1) {
				local625 = (short) (local14.method3000() + local631);
				local627 = (short) (local625 + local14.method3000());
				local629 = (short) (local627 + local14.method3000());
				local631 = local629;
				this.aShortArray131[local633] = local625;
				this.aShortArray125[local633] = local627;
				this.aShortArray129[local633] = local629;
				if (this.anInt8603 < local625) {
					this.anInt8603 = local625;
				}
				if (this.anInt8603 < local627) {
					this.anInt8603 = local627;
				}
				if (this.anInt8603 < local629) {
					this.anInt8603 = local629;
				}
			}
			if (local641 == 2) {
				local627 = local629;
				local629 = (short) (local631 + local14.method3000());
				this.aShortArray131[local633] = local625;
				local631 = local629;
				this.aShortArray125[local633] = local627;
				this.aShortArray129[local633] = local629;
				if (local629 > this.anInt8603) {
					this.anInt8603 = local629;
				}
			}
			if (local641 == 3) {
				local625 = local629;
				local629 = (short) (local14.method3000() + local631);
				this.aShortArray131[local633] = local625;
				local631 = local629;
				this.aShortArray125[local633] = local627;
				this.aShortArray129[local633] = local629;
				if (local629 > this.anInt8603) {
					this.anInt8603 = local629;
				}
			}
			if (local641 == 4) {
				@Pc(794) short local794 = local625;
				local625 = local627;
				local629 = (short) (local14.method3000() + local631);
				local627 = local794;
				local631 = local629;
				this.aShortArray131[local633] = local625;
				this.aShortArray125[local633] = local794;
				this.aShortArray129[local633] = local629;
				if (local629 > this.anInt8603) {
					this.anInt8603 = local629;
				}
			}
		}
		this.anInt8603++;
		local14.anInt3174 = local178;
		for (local641 = 0; local641 < this.anInt8617; local641++) {
			this.aByteArray96[local641] = 0;
			this.aShortArray126[local641] = (short) local14.method3018();
			this.aShortArray128[local641] = (short) local14.method3018();
			this.aShortArray130[local641] = (short) local14.method3018();
		}
		if (this.aByteArray93 != null) {
			@Pc(904) boolean local904 = false;
			for (@Pc(906) int local906 = 0; local906 < this.anInt8614; local906++) {
				@Pc(917) int local917 = this.aByteArray93[local906] & 0xFF;
				if (local917 != 255) {
					if ((this.aShortArray126[local917] & 0xFFFF) == this.aShortArray131[local906] && this.aShortArray125[local906] == (this.aShortArray128[local917] & 0xFFFF) && this.aShortArray129[local906] == (this.aShortArray130[local917] & 0xFFFF)) {
						this.aByteArray93[local906] = -1;
					} else {
						local904 = true;
					}
				}
			}
			if (!local904) {
				this.aByteArray93 = null;
			}
		}
		if (!local9) {
			this.aShortArray133 = null;
		}
		if (!local7) {
			this.aByteArray90 = null;
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIII)I")
	public int method7549(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8599; local7++) {
			if (arg1 == this.anIntArray570[local7] && this.anIntArray575[local7] == arg0 && arg2 == this.anIntArray574[local7]) {
				return local7;
			}
		}
		this.anIntArray570[this.anInt8599] = arg1;
		this.anIntArray575[this.anInt8599] = arg0;
		this.anIntArray574[this.anInt8599] = arg2;
		this.anInt8603 = this.anInt8599 + 1;
		return this.anInt8599++;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!rha;ZSI)I")
	private int method7550(@OriginalArg(0) Class316 arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg0.anIntArray570[arg2];
		@Pc(23) int local23 = arg0.anIntArray575[arg2];
		@Pc(28) int local28 = arg0.anIntArray574[arg2];
		for (@Pc(30) int local30 = 0; local30 < this.anInt8599; local30++) {
			if (this.anIntArray570[local30] == local18 && this.anIntArray575[local30] == local23 && this.anIntArray574[local30] == local28) {
				this.aShortArray124[local30] |= arg1;
				return local30;
			}
		}
		this.anIntArray570[this.anInt8599] = local18;
		this.anIntArray575[this.anInt8599] = local23;
		this.anIntArray574[this.anInt8599] = local28;
		this.aShortArray124[this.anInt8599] = arg1;
		this.anIntArray569[this.anInt8599] = arg0.anIntArray569 == null ? -1 : arg0.anIntArray569[arg2];
		return this.anInt8599++;
	}
}
