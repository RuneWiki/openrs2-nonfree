import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class73 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
	public int[] anIntArray134;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "[Lclient!qr;")
	public Class298[] aClass298Array2;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "[Lclient!gt;")
	public Class151[] aClass151Array1;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "[Lclient!oea;")
	public Class261[] aClass261Array2;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
	public int anInt2034 = 0;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
	public int anInt2038 = 0;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "B")
	public byte aByte27 = 0;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
	public int anInt2040 = 0;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
	public int anInt2046 = 0;

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
	public int anInt2049 = 12;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	private Class73() {
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([B)V")
	public Class73(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1885(arg0);
		} else {
			this.method1891(arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
	public Class73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray131 = new int[arg0];
		this.aByteArray13 = new byte[arg1];
		this.aByteArray11 = new byte[arg1];
		this.aShortArray29 = new short[arg1];
		this.anIntArray137 = new int[arg1];
		this.anIntArray138 = new int[arg0];
		this.aByteArray12 = new byte[arg1];
		this.aShortArray34 = new short[arg1];
		this.aByteArray10 = new byte[arg1];
		this.aShortArray33 = new short[arg1];
		this.aShortArray27 = new short[arg1];
		this.anIntArray133 = new int[arg0];
		this.aShortArray35 = new short[arg1];
		this.anIntArray135 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray14 = new byte[arg2];
			this.anIntArray132 = new int[arg2];
			this.aByteArray9 = new byte[arg2];
			this.anIntArray128 = new int[arg2];
			this.aShortArray32 = new short[arg2];
			this.anIntArray136 = new int[arg2];
			this.anIntArray134 = new int[arg2];
			this.aShortArray36 = new short[arg2];
			this.aByteArray15 = new byte[arg2];
			this.anIntArray130 = new int[arg2];
			this.aShortArray31 = new short[arg2];
			this.anIntArray129 = new int[arg2];
		}
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([Lclient!dc;I)V")
	public Class73(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2034 = 0;
		this.anInt2046 = 0;
		this.anInt2040 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte27 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class73 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt2040 += local59.anInt2040;
				this.anInt2034 += local59.anInt2034;
				this.anInt2046 += local59.anInt2046;
				local38 |= local59.aByteArray11 != null;
				if (local59.aClass151Array1 != null) {
					local36 += local59.aClass151Array1.length;
				}
				if (local59.aClass261Array2 != null) {
					local32 += local59.aClass261Array2.length;
				}
				if (local59.aClass298Array2 != null) {
					local34 += local59.aClass298Array2.length;
				}
				local42 |= local59.aByteArray10 != null;
				if (local59.aByteArray13 == null) {
					if (this.aByte27 == -1) {
						this.aByte27 = local59.aByte27;
					}
					if (this.aByte27 != local59.aByte27) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray12 != null;
				local46 |= local59.aShortArray29 != null;
				local51 |= local59.anIntArray137 != null;
			}
		}
		if (local38) {
			this.aByteArray11 = new byte[this.anInt2040];
		}
		this.aShortArray34 = new short[this.anInt2040];
		if (local42) {
			this.aByteArray10 = new byte[this.anInt2040];
		}
		this.aShortArray30 = new short[this.anInt2046];
		this.anIntArray138 = new int[this.anInt2046];
		this.anIntArray131 = new int[this.anInt2046];
		if (local36 > 0) {
			this.aClass151Array1 = new Class151[local36];
		}
		this.aShortArray28 = new short[this.anInt2040];
		if (this.anInt2034 > 0) {
			this.anIntArray136 = new int[this.anInt2034];
			this.anIntArray134 = new int[this.anInt2034];
			this.anIntArray128 = new int[this.anInt2034];
			this.aShortArray36 = new short[this.anInt2034];
			this.aShortArray31 = new short[this.anInt2034];
			this.anIntArray130 = new int[this.anInt2034];
			this.anIntArray132 = new int[this.anInt2034];
			this.aByteArray9 = new byte[this.anInt2034];
			this.anIntArray129 = new int[this.anInt2034];
			this.aByteArray15 = new byte[this.anInt2034];
			this.aShortArray32 = new short[this.anInt2034];
			this.aByteArray14 = new byte[this.anInt2034];
		}
		if (local44) {
			this.aByteArray12 = new byte[this.anInt2040];
		}
		if (local34 > 0) {
			this.aClass298Array2 = new Class298[local34];
		}
		this.anIntArray135 = new int[this.anInt2046];
		if (local51) {
			this.anIntArray137 = new int[this.anInt2040];
		}
		this.anIntArray133 = new int[this.anInt2046];
		if (local32 > 0) {
			this.aClass261Array2 = new Class261[local32];
		}
		this.aShortArray35 = new short[this.anInt2040];
		if (local40) {
			this.aByteArray13 = new byte[this.anInt2040];
		}
		if (local46) {
			this.aShortArray29 = new short[this.anInt2040];
		}
		this.aShortArray33 = new short[this.anInt2040];
		this.aShortArray27 = new short[this.anInt2040];
		local34 = 0;
		local32 = 0;
		this.anInt2046 = 0;
		local36 = 0;
		this.anInt2034 = 0;
		this.anInt2040 = 0;
		@Pc(618) int local618;
		@Pc(629) int local629;
		for (@Pc(378) int local378 = 0; local378 < arg1; local378++) {
			@Pc(385) short local385 = (short) (0x1 << local378);
			@Pc(389) Class73 local389 = arg0[local378];
			if (local389 != null) {
				@Pc(396) int local396;
				if (local389.aClass151Array1 != null) {
					for (local396 = 0; local396 < local389.aClass151Array1.length; local396++) {
						@Pc(403) Class151 local403 = local389.aClass151Array1[local396];
						this.aClass151Array1[local36++] = local403.method3288(local403.anInt3833 + this.anInt2040);
					}
				}
				for (local396 = 0; local396 < local389.anInt2040; local396++) {
					if (local38 && local389.aByteArray11 != null) {
						this.aByteArray11[this.anInt2040] = local389.aByteArray11[local396];
					}
					if (local40) {
						if (local389.aByteArray13 == null) {
							this.aByteArray13[this.anInt2040] = local389.aByte27;
						} else {
							this.aByteArray13[this.anInt2040] = local389.aByteArray13[local396];
						}
					}
					if (local42 && local389.aByteArray10 != null) {
						this.aByteArray10[this.anInt2040] = local389.aByteArray10[local396];
					}
					if (local46) {
						if (local389.aShortArray29 == null) {
							this.aShortArray29[this.anInt2040] = -1;
						} else {
							this.aShortArray29[this.anInt2040] = local389.aShortArray29[local396];
						}
					}
					if (local51) {
						if (local389.anIntArray137 == null) {
							this.anIntArray137[this.anInt2040] = -1;
						} else {
							this.anIntArray137[this.anInt2040] = local389.anIntArray137[local396];
						}
					}
					this.aShortArray27[this.anInt2040] = (short) this.method1894(local389.aShortArray27[local396], local389, local385);
					this.aShortArray35[this.anInt2040] = (short) this.method1894(local389.aShortArray35[local396], local389, local385);
					this.aShortArray33[this.anInt2040] = (short) this.method1894(local389.aShortArray33[local396], local389, local385);
					this.aShortArray28[this.anInt2040] = local385;
					this.aShortArray34[this.anInt2040] = local389.aShortArray34[local396];
					this.anInt2040++;
				}
				@Pc(605) int local605;
				if (local389.aClass261Array2 != null) {
					for (local605 = 0; local605 < local389.aClass261Array2.length; local605++) {
						local618 = this.method1894(local389.aClass261Array2[local605].anInt7121, local389, local385);
						local629 = this.method1894(local389.aClass261Array2[local605].anInt7134, local389, local385);
						@Pc(640) int local640 = this.method1894(local389.aClass261Array2[local605].anInt7124, local389, local385);
						this.aClass261Array2[local32] = local389.aClass261Array2[local605].method6012(local640, local618, local629);
						local32++;
					}
				}
				if (local389.aClass298Array2 != null) {
					for (local605 = 0; local605 < local389.aClass298Array2.length; local605++) {
						local618 = this.method1894(local389.aClass298Array2[local605].anInt8371, local389, local385);
						this.aClass298Array2[local34] = local389.aClass298Array2[local605].method7101(local618);
						local34++;
					}
				}
			}
		}
		@Pc(714) int local714 = 0;
		this.anInt2038 = this.anInt2046;
		for (@Pc(720) int local720 = 0; local720 < arg1; local720++) {
			@Pc(727) short local727 = (short) (0x1 << local720);
			@Pc(731) Class73 local731 = arg0[local720];
			if (local731 != null) {
				for (local618 = 0; local618 < local731.anInt2040; local618++) {
					if (local44) {
						this.aByteArray12[local714++] = (byte) (local731.aByteArray12 == null || local731.aByteArray12[local618] == -1 ? -1 : local731.aByteArray12[local618] + this.anInt2034);
					}
				}
				for (local629 = 0; local629 < local731.anInt2034; local629++) {
					@Pc(783) byte local783 = this.aByteArray14[this.anInt2034] = local731.aByteArray14[local629];
					if (local783 == 0) {
						this.aShortArray36[this.anInt2034] = (short) this.method1894(local731.aShortArray36[local629], local731, local727);
						this.aShortArray32[this.anInt2034] = (short) this.method1894(local731.aShortArray32[local629], local731, local727);
						this.aShortArray31[this.anInt2034] = (short) this.method1894(local731.aShortArray31[local629], local731, local727);
					}
					if (local783 >= 1 && local783 <= 3) {
						this.aShortArray36[this.anInt2034] = local731.aShortArray36[local629];
						this.aShortArray32[this.anInt2034] = local731.aShortArray32[local629];
						this.aShortArray31[this.anInt2034] = local731.aShortArray31[local629];
						this.anIntArray129[this.anInt2034] = local731.anIntArray129[local629];
						this.anIntArray134[this.anInt2034] = local731.anIntArray134[local629];
						this.anIntArray136[this.anInt2034] = local731.anIntArray136[local629];
						this.aByteArray9[this.anInt2034] = local731.aByteArray9[local629];
						this.aByteArray15[this.anInt2034] = local731.aByteArray15[local629];
						this.anIntArray130[this.anInt2034] = local731.anIntArray130[local629];
					}
					if (local783 == 2) {
						this.anIntArray132[this.anInt2034] = local731.anIntArray132[local629];
						this.anIntArray128[this.anInt2034] = local731.anIntArray128[local629];
					}
					this.anInt2034++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BB)V")
	private void method1885(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub17 local10 = new Class3_Sub17(arg0);
		@Pc(15) Class3_Sub17 local15 = new Class3_Sub17(arg0);
		@Pc(20) Class3_Sub17 local20 = new Class3_Sub17(arg0);
		@Pc(25) Class3_Sub17 local25 = new Class3_Sub17(arg0);
		@Pc(30) Class3_Sub17 local30 = new Class3_Sub17(arg0);
		@Pc(35) Class3_Sub17 local35 = new Class3_Sub17(arg0);
		@Pc(40) Class3_Sub17 local40 = new Class3_Sub17(arg0);
		local10.lb = arg0.length - 23;
		this.anInt2046 = local10.method4858();
		this.anInt2040 = local10.method4858();
		this.anInt2034 = local10.method4888();
		@Pc(65) int local65 = local10.method4888();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.lb -= 7;
			this.anInt2049 = local10.method4888();
			local10.lb += 6;
		}
		@Pc(128) int local128 = local10.method4888();
		@Pc(132) int local132 = local10.method4888();
		@Pc(136) int local136 = local10.method4888();
		@Pc(140) int local140 = local10.method4888();
		@Pc(144) int local144 = local10.method4888();
		@Pc(148) int local148 = local10.method4858();
		@Pc(152) int local152 = local10.method4858();
		@Pc(156) int local156 = local10.method4858();
		@Pc(160) int local160 = local10.method4858();
		@Pc(164) int local164 = local10.method4858();
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(183) int local183;
		if (this.anInt2034 > 0) {
			local10.lb = 0;
			this.aByteArray14 = new byte[this.anInt2034];
			for (local183 = 0; local183 < this.anInt2034; local183++) {
				@Pc(194) byte local194 = this.aByteArray14[local183] = local10.method4861();
				if (local194 == 2) {
					local170++;
				}
				if (local194 == 0) {
					local166++;
				}
				if (local194 >= 1 && local194 <= 3) {
					local168++;
				}
			}
		}
		local183 = this.anInt2034;
		@Pc(220) int local220 = local183;
		local183 += this.anInt2046;
		@Pc(227) int local227 = local183;
		if (local76) {
			local183 += this.anInt2040;
		}
		@Pc(236) int local236 = local183;
		local183 += this.anInt2040;
		@Pc(243) int local243 = local183;
		if (local128 == 255) {
			local183 += this.anInt2040;
		}
		@Pc(253) int local253 = local183;
		if (local136 == 1) {
			local183 += this.anInt2040;
		}
		@Pc(263) int local263 = local183;
		if (local144 == 1) {
			local183 += this.anInt2046;
		}
		@Pc(275) int local275 = local183;
		if (local132 == 1) {
			local183 += this.anInt2040;
		}
		@Pc(287) int local287 = local183;
		local183 += local160;
		@Pc(293) int local293 = local183;
		if (local140 == 1) {
			local183 += this.anInt2040 * 2;
		}
		@Pc(305) int local305 = local183;
		local183 += local164;
		@Pc(311) int local311 = local183;
		local183 += this.anInt2040 * 2;
		@Pc(320) int local320 = local183;
		local183 += local148;
		@Pc(326) int local326 = local183;
		local183 += local152;
		@Pc(332) int local332 = local183;
		local183 += local156;
		@Pc(338) int local338 = local183;
		local183 += local166 * 6;
		@Pc(346) int local346 = local183;
		local183 += local168 * 6;
		@Pc(354) byte local354 = 6;
		if (this.anInt2049 == 14) {
			local354 = 7;
		} else if (this.anInt2049 >= 15) {
			local354 = 9;
		}
		@Pc(370) int local370 = local183;
		local183 += local168 * local354;
		@Pc(378) int local378 = local183;
		local183 += local168;
		@Pc(384) int local384 = local183;
		local183 += local168;
		@Pc(390) int local390 = local183;
		local183 += local170 * 2 + local168;
		if (local140 == 1 && this.anInt2034 > 0) {
			this.aByteArray12 = new byte[this.anInt2040];
		}
		if (local136 == 1) {
			this.anIntArray137 = new int[this.anInt2040];
		}
		local10.lb = local220;
		this.aShortArray33 = new short[this.anInt2040];
		if (local140 == 1) {
			this.aShortArray29 = new short[this.anInt2040];
		}
		this.anIntArray133 = new int[this.anInt2046];
		if (local128 == 255) {
			this.aByteArray13 = new byte[this.anInt2040];
		} else {
			this.aByte27 = (byte) local128;
		}
		this.aShortArray35 = new short[this.anInt2040];
		if (local144 == 1) {
			this.anIntArray138 = new int[this.anInt2046];
		}
		this.aShortArray27 = new short[this.anInt2040];
		if (local76) {
			this.aByteArray11 = new byte[this.anInt2040];
		}
		this.aShortArray34 = new short[this.anInt2040];
		if (local132 == 1) {
			this.aByteArray10 = new byte[this.anInt2040];
		}
		this.anIntArray135 = new int[this.anInt2046];
		this.anIntArray131 = new int[this.anInt2046];
		if (this.anInt2034 > 0) {
			this.aShortArray32 = new short[this.anInt2034];
			if (local168 > 0) {
				this.anIntArray136 = new int[local168];
				this.anIntArray130 = new int[local168];
				this.aByteArray9 = new byte[local168];
				this.aByteArray15 = new byte[local168];
				this.anIntArray134 = new int[local168];
				this.anIntArray129 = new int[local168];
			}
			if (local170 > 0) {
				this.anIntArray132 = new int[local170];
				this.anIntArray128 = new int[local170];
			}
			this.aShortArray36 = new short[this.anInt2034];
			this.aShortArray31 = new short[this.anInt2034];
		}
		local15.lb = local320;
		local20.lb = local326;
		local25.lb = local332;
		local30.lb = local263;
		@Pc(582) int local582 = 0;
		@Pc(584) int local584 = 0;
		@Pc(586) int local586 = 0;
		@Pc(596) int local596;
		for (@Pc(588) int local588 = 0; local588 < this.anInt2046; local588++) {
			@Pc(594) int local594 = local10.method4888();
			local596 = 0;
			if ((local594 & 0x1) != 0) {
				local596 = local15.method4837();
			}
			@Pc(609) int local609 = 0;
			if ((local594 & 0x2) != 0) {
				local609 = local20.method4837();
			}
			@Pc(619) int local619 = 0;
			if ((local594 & 0x4) != 0) {
				local619 = local25.method4837();
			}
			this.anIntArray133[local588] = local596 + local582;
			this.anIntArray135[local588] = local584 + local609;
			this.anIntArray131[local588] = local619 + local586;
			local584 = this.anIntArray135[local588];
			local582 = this.anIntArray133[local588];
			local586 = this.anIntArray131[local588];
			if (local144 == 1) {
				this.anIntArray138[local588] = local30.method4888();
			}
		}
		local10.lb = local311;
		local15.lb = local227;
		local20.lb = local243;
		local25.lb = local275;
		local30.lb = local253;
		local35.lb = local293;
		local40.lb = local305;
		for (local596 = 0; local596 < this.anInt2040; local596++) {
			this.aShortArray34[local596] = (short) local10.method4858();
			if (local76) {
				this.aByteArray11[local596] = local15.method4861();
			}
			if (local128 == 255) {
				this.aByteArray13[local596] = local20.method4861();
			}
			if (local132 == 1) {
				this.aByteArray10[local596] = local25.method4861();
			}
			if (local136 == 1) {
				this.anIntArray137[local596] = local30.method4888();
			}
			if (local140 == 1) {
				this.aShortArray29[local596] = (short) (local35.method4858() - 1);
			}
			if (this.aByteArray12 != null) {
				if (this.aShortArray29[local596] == -1) {
					this.aByteArray12[local596] = -1;
				} else {
					this.aByteArray12[local596] = (byte) (local40.method4888() - 1);
				}
			}
		}
		this.anInt2038 = -1;
		local10.lb = local287;
		local15.lb = local236;
		@Pc(822) short local822 = 0;
		@Pc(824) short local824 = 0;
		@Pc(826) short local826 = 0;
		@Pc(828) short local828 = 0;
		@Pc(836) int local836;
		for (@Pc(830) int local830 = 0; local830 < this.anInt2040; local830++) {
			local836 = local15.method4888();
			if (local836 == 1) {
				local822 = (short) (local10.method4837() + local828);
				local824 = (short) (local10.method4837() + local822);
				local826 = (short) (local10.method4837() + local824);
				local828 = local826;
				this.aShortArray27[local830] = local822;
				this.aShortArray35[local830] = local824;
				this.aShortArray33[local830] = local826;
				if (local822 > this.anInt2038) {
					this.anInt2038 = local822;
				}
				if (local824 > this.anInt2038) {
					this.anInt2038 = local824;
				}
				if (local826 > this.anInt2038) {
					this.anInt2038 = local826;
				}
			}
			if (local836 == 2) {
				local824 = local826;
				local826 = (short) (local10.method4837() + local828);
				this.aShortArray27[local830] = local822;
				local828 = local826;
				this.aShortArray35[local830] = local824;
				this.aShortArray33[local830] = local826;
				if (local826 > this.anInt2038) {
					this.anInt2038 = local826;
				}
			}
			if (local836 == 3) {
				local822 = local826;
				local826 = (short) (local828 + local10.method4837());
				local828 = local826;
				this.aShortArray27[local830] = local822;
				this.aShortArray35[local830] = local824;
				this.aShortArray33[local830] = local826;
				if (this.anInt2038 < local826) {
					this.anInt2038 = local826;
				}
			}
			if (local836 == 4) {
				@Pc(987) short local987 = local822;
				local822 = local824;
				local826 = (short) (local828 + local10.method4837());
				local824 = local987;
				local828 = local826;
				this.aShortArray27[local830] = local822;
				this.aShortArray35[local830] = local987;
				this.aShortArray33[local830] = local826;
				if (this.anInt2038 < local826) {
					this.anInt2038 = local826;
				}
			}
		}
		this.anInt2038++;
		local10.lb = local338;
		local15.lb = local346;
		local20.lb = local370;
		local25.lb = local378;
		local30.lb = local384;
		local35.lb = local390;
		@Pc(1066) int local1066;
		for (local836 = 0; local836 < this.anInt2034; local836++) {
			local1066 = this.aByteArray14[local836] & 0xFF;
			if (local1066 == 0) {
				this.aShortArray36[local836] = (short) local10.method4858();
				this.aShortArray32[local836] = (short) local10.method4858();
				this.aShortArray31[local836] = (short) local10.method4858();
			}
			if (local1066 == 1) {
				this.aShortArray36[local836] = (short) local15.method4858();
				this.aShortArray32[local836] = (short) local15.method4858();
				this.aShortArray31[local836] = (short) local15.method4858();
				if (this.anInt2049 < 15) {
					this.anIntArray129[local836] = local20.method4858();
					if (this.anInt2049 < 14) {
						this.anIntArray134[local836] = local20.method4858();
					} else {
						this.anIntArray134[local836] = local20.method4862();
					}
					this.anIntArray136[local836] = local20.method4858();
				} else {
					this.anIntArray129[local836] = local20.method4862();
					this.anIntArray134[local836] = local20.method4862();
					this.anIntArray136[local836] = local20.method4862();
				}
				this.aByteArray9[local836] = local25.method4861();
				this.aByteArray15[local836] = local30.method4861();
				this.anIntArray130[local836] = local35.method4861();
			}
			if (local1066 == 2) {
				this.aShortArray36[local836] = (short) local15.method4858();
				this.aShortArray32[local836] = (short) local15.method4858();
				this.aShortArray31[local836] = (short) local15.method4858();
				if (this.anInt2049 < 15) {
					this.anIntArray129[local836] = local20.method4858();
					if (this.anInt2049 >= 14) {
						this.anIntArray134[local836] = local20.method4862();
					} else {
						this.anIntArray134[local836] = local20.method4858();
					}
					this.anIntArray136[local836] = local20.method4858();
				} else {
					this.anIntArray129[local836] = local20.method4862();
					this.anIntArray134[local836] = local20.method4862();
					this.anIntArray136[local836] = local20.method4862();
				}
				this.aByteArray9[local836] = local25.method4861();
				this.aByteArray15[local836] = local30.method4861();
				this.anIntArray130[local836] = local35.method4861();
				this.anIntArray132[local836] = local35.method4861();
				this.anIntArray128[local836] = local35.method4861();
			}
			if (local1066 == 3) {
				this.aShortArray36[local836] = (short) local15.method4858();
				this.aShortArray32[local836] = (short) local15.method4858();
				this.aShortArray31[local836] = (short) local15.method4858();
				if (this.anInt2049 >= 15) {
					this.anIntArray129[local836] = local20.method4862();
					this.anIntArray134[local836] = local20.method4862();
					this.anIntArray136[local836] = local20.method4862();
				} else {
					this.anIntArray129[local836] = local20.method4858();
					if (this.anInt2049 >= 14) {
						this.anIntArray134[local836] = local20.method4862();
					} else {
						this.anIntArray134[local836] = local20.method4858();
					}
					this.anIntArray136[local836] = local20.method4858();
				}
				this.aByteArray9[local836] = local25.method4861();
				this.aByteArray15[local836] = local30.method4861();
				this.anIntArray130[local836] = local35.method4861();
			}
		}
		local10.lb = local183;
		@Pc(1464) int local1464;
		@Pc(1470) int local1470;
		@Pc(1474) int local1474;
		@Pc(1539) int local1539;
		if (local85) {
			local1066 = local10.method4888();
			if (local1066 > 0) {
				this.aClass261Array2 = new Class261[local1066];
				for (local1464 = 0; local1464 < local1066; local1464++) {
					local1470 = local10.method4858();
					local1474 = local10.method4858();
					@Pc(1482) byte local1482;
					if (local128 == 255) {
						local1482 = this.aByteArray13[local1474];
					} else {
						local1482 = (byte) local128;
					}
					this.aClass261Array2[local1464] = new Class261(local1470, this.aShortArray27[local1474], this.aShortArray35[local1474], this.aShortArray33[local1474], local1482);
				}
			}
			local1464 = local10.method4888();
			if (local1464 > 0) {
				this.aClass298Array2 = new Class298[local1464];
				for (local1470 = 0; local1470 < local1464; local1470++) {
					local1474 = local10.method4858();
					local1539 = local10.method4858();
					this.aClass298Array2[local1470] = new Class298(local1474, local1539);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1066 = local10.method4888();
		if (local1066 <= 0) {
			return;
		}
		this.aClass151Array1 = new Class151[local1066];
		for (local1464 = 0; local1464 < local1066; local1464++) {
			local1470 = local10.method4858();
			local1474 = local10.method4858();
			local1539 = local10.method4888();
			@Pc(1591) byte local1591 = local10.method4861();
			this.aClass151Array1[local1464] = new Class151(local1470, local1474, local1539, local1591);
		}
		return;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ISS)V")
	public void method1886(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray29 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt2040; local11++) {
			if (this.aShortArray29[local11] == arg1) {
				this.aShortArray29[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)[[I")
	public int[][] method1887() {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.aClass151Array1.length; local18++) {
			@Pc(26) int local26 = this.aClass151Array1[local18].anInt3836;
			if (local26 >= 0) {
				@Pc(35) int local35 = local14[local26]++;
				if (local26 > local16) {
					local16 = local26;
				}
			}
		}
		@Pc(58) int[][] local58 = new int[local16 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local16; local60++) {
			local58[local60] = new int[local14[local60]];
			local14[local60] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < this.aClass151Array1.length; local79++) {
			@Pc(87) int local87 = this.aClass151Array1[local79].anInt3836;
			if (local87 >= 0) {
				local58[local87][local14[local87]++] = local79;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BBBSSSSBSS)B")
	public byte method1888() {
		if (this.anInt2034 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray14[this.anInt2034] = 3;
		this.aShortArray36[this.anInt2034] = 0;
		this.aShortArray32[this.anInt2034] = 32767;
		this.aShortArray31[this.anInt2034] = 0;
		this.anIntArray129[this.anInt2034] = 1024;
		this.anIntArray134[this.anInt2034] = 1024;
		this.anIntArray136[this.anInt2034] = 1024;
		this.aByteArray9[this.anInt2034] = 0;
		this.aByteArray15[this.anInt2034] = 0;
		this.anIntArray130[this.anInt2034] = 0;
		return (byte) this.anInt2034++;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BSS)V")
	public void method1890(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2040; local15++) {
			if (arg1 == this.aShortArray34[local15]) {
				this.aShortArray34[local15] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "([BB)V")
	private void method1891(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub17 local14 = new Class3_Sub17(arg0);
		@Pc(19) Class3_Sub17 local19 = new Class3_Sub17(arg0);
		@Pc(24) Class3_Sub17 local24 = new Class3_Sub17(arg0);
		@Pc(29) Class3_Sub17 local29 = new Class3_Sub17(arg0);
		@Pc(34) Class3_Sub17 local34 = new Class3_Sub17(arg0);
		local14.lb = arg0.length - 18;
		this.anInt2046 = local14.method4858();
		this.anInt2040 = local14.method4858();
		this.anInt2034 = local14.method4888();
		@Pc(59) int local59 = local14.method4888();
		@Pc(63) int local63 = local14.method4888();
		@Pc(67) int local67 = local14.method4888();
		@Pc(71) int local71 = local14.method4888();
		@Pc(75) int local75 = local14.method4888();
		@Pc(79) int local79 = local14.method4858();
		@Pc(83) int local83 = local14.method4858();
		@Pc(87) int local87 = local14.method4858();
		@Pc(91) int local91 = local14.method4858();
		@Pc(100) int local100 = this.anInt2046;
		@Pc(102) int local102 = local100;
		local100 += this.anInt2040;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt2040;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt2040;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt2040;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt2046;
		}
		@Pc(155) int local155 = local100;
		if (local67 == 1) {
			local100 += this.anInt2040;
		}
		@Pc(167) int local167 = local100;
		local100 += local91;
		@Pc(173) int local173 = local100;
		local100 += this.anInt2040 * 2;
		@Pc(182) int local182 = local100;
		local100 += this.anInt2034 * 6;
		@Pc(191) int local191 = local100;
		local100 += local79;
		@Pc(197) int local197 = local100;
		local100 += local83;
		if (local67 == 1) {
			this.aByteArray10 = new byte[this.anInt2040];
		}
		if (local75 == 1) {
			this.anIntArray138 = new int[this.anInt2046];
		}
		this.aShortArray33 = new short[this.anInt2040];
		this.aShortArray27 = new short[this.anInt2040];
		if (this.anInt2034 > 0) {
			this.aShortArray31 = new short[this.anInt2034];
			this.aShortArray32 = new short[this.anInt2034];
			this.aByteArray14 = new byte[this.anInt2034];
			this.aShortArray36 = new short[this.anInt2034];
		}
		this.anIntArray135 = new int[this.anInt2046];
		this.anIntArray131 = new int[this.anInt2046];
		this.aShortArray35 = new short[this.anInt2040];
		local14.lb = 0;
		this.aShortArray34 = new short[this.anInt2040];
		if (local63 == 255) {
			this.aByteArray13 = new byte[this.anInt2040];
		} else {
			this.aByte27 = (byte) local63;
		}
		this.anIntArray133 = new int[this.anInt2046];
		if (local71 == 1) {
			this.anIntArray137 = new int[this.anInt2040];
		}
		if (local59 == 1) {
			this.aShortArray29 = new short[this.anInt2040];
			this.aByteArray12 = new byte[this.anInt2040];
			this.aByteArray11 = new byte[this.anInt2040];
		}
		local19.lb = local191;
		local24.lb = local197;
		local29.lb = local100;
		local34.lb = local143;
		@Pc(357) int local357 = 0;
		@Pc(359) int local359 = 0;
		@Pc(361) int local361 = 0;
		@Pc(369) int local369;
		@Pc(371) int local371;
		for (@Pc(363) int local363 = 0; local363 < this.anInt2046; local363++) {
			local369 = local14.method4888();
			local371 = 0;
			if ((local369 & 0x1) != 0) {
				local371 = local19.method4837();
			}
			@Pc(381) int local381 = 0;
			if ((local369 & 0x2) != 0) {
				local381 = local24.method4837();
			}
			@Pc(391) int local391 = 0;
			if ((local369 & 0x4) != 0) {
				local391 = local29.method4837();
			}
			this.anIntArray133[local363] = local371 + local357;
			this.anIntArray135[local363] = local359 + local381;
			this.anIntArray131[local363] = local361 + local391;
			local357 = this.anIntArray133[local363];
			local359 = this.anIntArray135[local363];
			local361 = this.anIntArray131[local363];
			if (local75 == 1) {
				this.anIntArray138[local363] = local34.method4888();
			}
		}
		local14.lb = local173;
		local19.lb = local133;
		local24.lb = local109;
		local29.lb = local155;
		local34.lb = local121;
		for (local369 = 0; local369 < this.anInt2040; local369++) {
			this.aShortArray34[local369] = (short) local14.method4858();
			if (local59 == 1) {
				local371 = local19.method4888();
				if ((local371 & 0x1) == 1) {
					this.aByteArray11[local369] = 1;
					local7 = true;
				} else {
					this.aByteArray11[local369] = 0;
				}
				if ((local371 & 0x2) == 2) {
					this.aByteArray12[local369] = (byte) (local371 >> 2);
					this.aShortArray29[local369] = this.aShortArray34[local369];
					this.aShortArray34[local369] = 127;
					if (this.aShortArray29[local369] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray12[local369] = -1;
					this.aShortArray29[local369] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray13[local369] = local24.method4861();
			}
			if (local67 == 1) {
				this.aByteArray10[local369] = local29.method4861();
			}
			if (local71 == 1) {
				this.anIntArray137[local369] = local34.method4888();
			}
		}
		local14.lb = local167;
		this.anInt2038 = -1;
		local19.lb = local102;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(622) int local622;
		for (@Pc(616) int local616 = 0; local616 < this.anInt2040; local616++) {
			local622 = local19.method4888();
			if (local622 == 1) {
				local608 = (short) (local14.method4837() + local614);
				local610 = (short) (local14.method4837() + local608);
				local612 = (short) (local610 + local14.method4837());
				this.aShortArray27[local616] = local608;
				local614 = local612;
				this.aShortArray35[local616] = local610;
				this.aShortArray33[local616] = local612;
				if (local608 > this.anInt2038) {
					this.anInt2038 = local608;
				}
				if (local610 > this.anInt2038) {
					this.anInt2038 = local610;
				}
				if (this.anInt2038 < local612) {
					this.anInt2038 = local612;
				}
			}
			if (local622 == 2) {
				local610 = local612;
				local612 = (short) (local614 + local14.method4837());
				this.aShortArray27[local616] = local608;
				local614 = local612;
				this.aShortArray35[local616] = local610;
				this.aShortArray33[local616] = local612;
				if (this.anInt2038 < local612) {
					this.anInt2038 = local612;
				}
			}
			if (local622 == 3) {
				local608 = local612;
				local612 = (short) (local614 + local14.method4837());
				local614 = local612;
				this.aShortArray27[local616] = local608;
				this.aShortArray35[local616] = local610;
				this.aShortArray33[local616] = local612;
				if (this.anInt2038 < local612) {
					this.anInt2038 = local612;
				}
			}
			if (local622 == 4) {
				@Pc(779) short local779 = local608;
				local608 = local610;
				local612 = (short) (local14.method4837() + local614);
				local610 = local779;
				local614 = local612;
				this.aShortArray27[local616] = local608;
				this.aShortArray35[local616] = local779;
				this.aShortArray33[local616] = local612;
				if (local612 > this.anInt2038) {
					this.anInt2038 = local612;
				}
			}
		}
		local14.lb = local182;
		this.anInt2038++;
		for (local622 = 0; local622 < this.anInt2034; local622++) {
			this.aByteArray14[local622] = 0;
			this.aShortArray36[local622] = (short) local14.method4858();
			this.aShortArray32[local622] = (short) local14.method4858();
			this.aShortArray31[local622] = (short) local14.method4858();
		}
		if (this.aByteArray12 != null) {
			@Pc(879) boolean local879 = false;
			for (@Pc(881) int local881 = 0; local881 < this.anInt2040; local881++) {
				@Pc(890) int local890 = this.aByteArray12[local881] & 0xFF;
				if (local890 != 255) {
					if ((this.aShortArray36[local890] & 0xFFFF) == this.aShortArray27[local881] && (this.aShortArray32[local890] & 0xFFFF) == this.aShortArray35[local881] && this.aShortArray33[local881] == (this.aShortArray31[local890] & 0xFFFF)) {
						this.aByteArray12[local881] = -1;
					} else {
						local879 = true;
					}
				}
			}
			if (!local879) {
				this.aByteArray12 = null;
			}
		}
		if (!local9) {
			this.aShortArray29 = null;
		}
		if (!local7) {
			this.aByteArray11 = null;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[[I")
	public int[][] method1892(@OriginalArg(0) boolean arg0) {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg0 ? this.anInt2046 : this.anInt2038;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(33) int local33 = this.anIntArray138[local26];
			if (local33 >= 0) {
				if (local33 > local16) {
					local16 = local33;
				}
				@Pc(48) int local48 = local14[local33]++;
			}
		}
		@Pc(60) int[][] local60 = new int[local16 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local16; local62++) {
			local60[local62] = new int[local14[local62]];
			local14[local62] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < local24; local81++) {
			@Pc(88) int local88 = this.anIntArray138[local81];
			if (local88 >= 0) {
				local60[local88][local14[local88]++] = local81;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!dc;IS)I")
	private int method1894(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray133[arg0];
		@Pc(15) int local15 = arg1.anIntArray135[arg0];
		@Pc(20) int local20 = arg1.anIntArray131[arg0];
		for (@Pc(29) int local29 = 0; local29 < this.anInt2046; local29++) {
			if (local10 == this.anIntArray133[local29] && this.anIntArray135[local29] == local15 && this.anIntArray131[local29] == local20) {
				this.aShortArray30[local29] |= arg2;
				return local29;
			}
		}
		this.anIntArray133[this.anInt2046] = local10;
		this.anIntArray135[this.anInt2046] = local15;
		this.anIntArray131[this.anInt2046] = local20;
		this.aShortArray30[this.anInt2046] = arg2;
		this.anIntArray138[this.anInt2046] = arg1.anIntArray138 == null ? -1 : arg1.anIntArray138[arg0];
		return this.anInt2046++;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
	public void method1895() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt2046; local9++) {
			this.anIntArray133[local9] <<= 0x2;
			this.anIntArray135[local9] <<= 0x2;
			this.anIntArray131[local9] <<= 0x2;
		}
		if (this.anInt2034 <= 0 || this.anIntArray129 == null) {
			return;
		}
		for (@Pc(59) int local59 = 0; local59 < this.anIntArray129.length; local59++) {
			this.anIntArray129[local59] <<= 0x2;
			this.anIntArray134[local59] <<= 0x2;
			if (this.aByteArray14[local59] != 1) {
				this.anIntArray136[local59] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
	public int method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2046; local7++) {
			if (this.anIntArray133[local7] == arg0 && this.anIntArray135[local7] == arg1 && this.anIntArray131[local7] == arg2) {
				return local7;
			}
		}
		this.anIntArray133[this.anInt2046] = arg0;
		this.anIntArray135[this.anInt2046] = arg1;
		this.anIntArray131[this.anInt2046] = arg2;
		this.anInt2038 = this.anInt2046 + 1;
		return this.anInt2046++;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BBISBISII)I")
	public int method1897(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) short arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray27[this.anInt2040] = (short) arg7;
		this.aShortArray35[this.anInt2040] = (short) arg6;
		this.aShortArray33[this.anInt2040] = (short) arg4;
		this.aByteArray11[this.anInt2040] = arg1;
		this.aByteArray12[this.anInt2040] = arg0;
		this.aShortArray34[this.anInt2040] = arg5;
		this.aByteArray10[this.anInt2040] = arg3;
		this.aShortArray29[this.anInt2040] = arg2;
		return this.anInt2040++;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZI)V")
	public void method1898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2046; local7++) {
			this.anIntArray133[local7] += arg2;
			this.anIntArray135[local7] += arg0;
			this.anIntArray131[local7] += arg1;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)[[I")
	public int[][] method1901() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2040; local12++) {
			@Pc(19) int local19 = this.anIntArray137[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.anInt2040; local78++) {
			@Pc(85) int local85 = this.anIntArray137[local78];
			if (local85 >= 0) {
				local50[local85][local8[local85]++] = local78;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIII)V")
	public void method1902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(39) int local39;
		if (arg0 != 0) {
			local14 = Class3_Sub7_Sub2.anIntArray171[arg0];
			local18 = Class3_Sub7_Sub2.anIntArray170[arg0];
			for (local20 = 0; local20 < this.anInt2046; local20++) {
				local39 = this.anIntArray135[local20] * local14 + this.anIntArray133[local20] * local18 >> 14;
				this.anIntArray135[local20] = this.anIntArray135[local20] * local18 - this.anIntArray133[local20] * local14 >> 14;
				this.anIntArray133[local20] = local39;
			}
		}
		if (arg2 != 0) {
			local14 = Class3_Sub7_Sub2.anIntArray171[arg2];
			local18 = Class3_Sub7_Sub2.anIntArray170[arg2];
			for (local20 = 0; local20 < this.anInt2046; local20++) {
				local39 = this.anIntArray135[local20] * local18 - this.anIntArray131[local20] * local14 >> 14;
				this.anIntArray131[local20] = this.anIntArray135[local20] * local14 + this.anIntArray131[local20] * local18 >> 14;
				this.anIntArray135[local20] = local39;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local18 = Class3_Sub7_Sub2.anIntArray171[arg1];
		local20 = Class3_Sub7_Sub2.anIntArray170[arg1];
		for (local39 = 0; local39 < this.anInt2046; local39++) {
			@Pc(173) int local173 = local18 * this.anIntArray131[local39] + this.anIntArray133[local39] * local20 >> 14;
			this.anIntArray131[local39] = this.anIntArray131[local39] * local20 - local18 * this.anIntArray133[local39] >> 14;
			this.anIntArray133[local39] = local173;
		}
	}
}
