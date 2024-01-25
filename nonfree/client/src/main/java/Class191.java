import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class191 {

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "[I")
	public int[] anIntArray270;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "[Lclient!fk;")
	public Class103[] aClass103Array3;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "[I")
	public int[] anIntArray272;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "[I")
	public int[] anIntArray273;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "[I")
	public int[] anIntArray274;

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "[Lclient!rea;")
	public Class287[] aClass287Array1;

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!kk", name = "D", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!kk", name = "G", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!kk", name = "N", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!kk", name = "O", descriptor = "[Lclient!nba;")
	public Class227[] aClass227Array3;

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!kk", name = "U", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!kk", name = "Y", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!kk", name = "cb", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!kk", name = "db", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	public int anInt5612 = 0;

	@OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
	public int anInt5621 = 12;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
	public int anInt5618 = 0;

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "B")
	public byte aByte60 = 0;

	@OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
	public int anInt5626 = 0;

	@OriginalMember(owner = "client!kk", name = "X", descriptor = "I")
	public int anInt5628 = 0;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	private Class191() {
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([B)V")
	public Class191(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4758(arg0);
		} else {
			this.method4767(arg0);
		}
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(III)V")
	public Class191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray65 = new short[arg1];
		this.aShortArray61 = new short[arg1];
		this.aShortArray68 = new short[arg1];
		this.aByteArray64 = new byte[arg1];
		this.anIntArray279 = new int[arg0];
		this.anIntArray278 = new int[arg0];
		this.aByteArray65 = new byte[arg1];
		this.anIntArray269 = new int[arg1];
		if (arg2 > 0) {
			this.aByteArray66 = new byte[arg2];
			this.aShortArray64 = new short[arg2];
			this.aByteArray60 = new byte[arg2];
			this.aShortArray62 = new short[arg2];
			this.aShortArray67 = new short[arg2];
			this.anIntArray275 = new int[arg2];
			this.anIntArray273 = new int[arg2];
			this.anIntArray274 = new int[arg2];
			this.anIntArray270 = new int[arg2];
			this.anIntArray277 = new int[arg2];
			this.anIntArray276 = new int[arg2];
			this.aByteArray63 = new byte[arg2];
		}
		this.aByteArray62 = new byte[arg1];
		this.anIntArray271 = new int[arg0];
		this.aShortArray59 = new short[arg1];
		this.aByteArray61 = new byte[arg1];
		this.aShortArray66 = new short[arg1];
		this.anIntArray272 = new int[arg0];
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([Lclient!kk;I)V")
	public Class191(@OriginalArg(0) Class191[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5628 = 0;
		this.anInt5618 = 0;
		this.anInt5626 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte60 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class191 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5626 += local59.anInt5626;
				this.anInt5618 += local59.anInt5618;
				this.anInt5628 += local59.anInt5628;
				if (local59.aClass287Array1 != null) {
					local36 += local59.aClass287Array1.length;
				}
				if (local59.aClass103Array3 != null) {
					local34 += local59.aClass103Array3.length;
				}
				local38 |= local59.aByteArray65 != null;
				if (local59.aClass227Array3 != null) {
					local32 += local59.aClass227Array3.length;
				}
				local42 |= local59.aByteArray61 != null;
				local46 |= local59.aShortArray65 != null;
				if (local59.aByteArray62 == null) {
					if (this.aByte60 == -1) {
						this.aByte60 = local59.aByte60;
					}
					if (this.aByte60 != local59.aByte60) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local51 |= local59.anIntArray269 != null;
				local44 |= local59.aByteArray64 != null;
			}
		}
		this.aShortArray63 = new short[this.anInt5618];
		if (local46) {
			this.aShortArray65 = new short[this.anInt5626];
		}
		this.aShortArray68 = new short[this.anInt5626];
		if (local38) {
			this.aByteArray65 = new byte[this.anInt5626];
		}
		this.anIntArray271 = new int[this.anInt5618];
		this.anIntArray279 = new int[this.anInt5618];
		this.aShortArray66 = new short[this.anInt5626];
		if (local34 > 0) {
			this.aClass103Array3 = new Class103[local34];
		}
		if (this.anInt5628 > 0) {
			this.aShortArray62 = new short[this.anInt5628];
			this.anIntArray274 = new int[this.anInt5628];
			this.aByteArray66 = new byte[this.anInt5628];
			this.anIntArray273 = new int[this.anInt5628];
			this.aShortArray67 = new short[this.anInt5628];
			this.aByteArray63 = new byte[this.anInt5628];
			this.anIntArray277 = new int[this.anInt5628];
			this.anIntArray275 = new int[this.anInt5628];
			this.anIntArray276 = new int[this.anInt5628];
			this.aShortArray64 = new short[this.anInt5628];
			this.aByteArray60 = new byte[this.anInt5628];
			this.anIntArray270 = new int[this.anInt5628];
		}
		this.aShortArray60 = new short[this.anInt5626];
		this.anIntArray272 = new int[this.anInt5618];
		this.anIntArray278 = new int[this.anInt5618];
		if (local36 > 0) {
			this.aClass287Array1 = new Class287[local36];
		}
		if (local44) {
			this.aByteArray64 = new byte[this.anInt5626];
		}
		this.aShortArray59 = new short[this.anInt5626];
		if (local51) {
			this.anIntArray269 = new int[this.anInt5626];
		}
		if (local40) {
			this.aByteArray62 = new byte[this.anInt5626];
		}
		if (local32 > 0) {
			this.aClass227Array3 = new Class227[local32];
		}
		this.aShortArray61 = new short[this.anInt5626];
		if (local42) {
			this.aByteArray61 = new byte[this.anInt5626];
		}
		local34 = 0;
		this.anInt5628 = 0;
		this.anInt5618 = 0;
		local32 = 0;
		local36 = 0;
		this.anInt5626 = 0;
		@Pc(613) int local613;
		@Pc(624) int local624;
		for (@Pc(373) int local373 = 0; local373 < arg1; local373++) {
			@Pc(380) short local380 = (short) (0x1 << local373);
			@Pc(384) Class191 local384 = arg0[local373];
			if (local384 != null) {
				@Pc(391) int local391;
				if (local384.aClass287Array1 != null) {
					for (local391 = 0; local391 < local384.aClass287Array1.length; local391++) {
						@Pc(398) Class287 local398 = local384.aClass287Array1[local391];
						this.aClass287Array1[local36++] = local398.method6960(this.anInt5626 + local398.anInt8501);
					}
				}
				for (local391 = 0; local391 < local384.anInt5626; local391++) {
					if (local38 && local384.aByteArray65 != null) {
						this.aByteArray65[this.anInt5626] = local384.aByteArray65[local391];
					}
					if (local40) {
						if (local384.aByteArray62 == null) {
							this.aByteArray62[this.anInt5626] = local384.aByte60;
						} else {
							this.aByteArray62[this.anInt5626] = local384.aByteArray62[local391];
						}
					}
					if (local42 && local384.aByteArray61 != null) {
						this.aByteArray61[this.anInt5626] = local384.aByteArray61[local391];
					}
					if (local46) {
						if (local384.aShortArray65 == null) {
							this.aShortArray65[this.anInt5626] = -1;
						} else {
							this.aShortArray65[this.anInt5626] = local384.aShortArray65[local391];
						}
					}
					if (local51) {
						if (local384.anIntArray269 == null) {
							this.anIntArray269[this.anInt5626] = -1;
						} else {
							this.anIntArray269[this.anInt5626] = local384.anIntArray269[local391];
						}
					}
					this.aShortArray61[this.anInt5626] = (short) this.method4769(local384, local380, local384.aShortArray61[local391]);
					this.aShortArray59[this.anInt5626] = (short) this.method4769(local384, local380, local384.aShortArray59[local391]);
					this.aShortArray68[this.anInt5626] = (short) this.method4769(local384, local380, local384.aShortArray68[local391]);
					this.aShortArray60[this.anInt5626] = local380;
					this.aShortArray66[this.anInt5626] = local384.aShortArray66[local391];
					this.anInt5626++;
				}
				@Pc(600) int local600;
				if (local384.aClass227Array3 != null) {
					for (local600 = 0; local600 < local384.aClass227Array3.length; local600++) {
						local613 = this.method4769(local384, local380, local384.aClass227Array3[local600].anInt6582);
						local624 = this.method4769(local384, local380, local384.aClass227Array3[local600].anInt6581);
						@Pc(635) int local635 = this.method4769(local384, local380, local384.aClass227Array3[local600].anInt6587);
						this.aClass227Array3[local32] = local384.aClass227Array3[local600].method5527(local624, local613, local635);
						local32++;
					}
				}
				if (local384.aClass103Array3 != null) {
					for (local600 = 0; local600 < local384.aClass103Array3.length; local600++) {
						local613 = this.method4769(local384, local380, local384.aClass103Array3[local600].anInt2993);
						this.aClass103Array3[local34] = local384.aClass103Array3[local600].method2735(local613);
						local34++;
					}
				}
			}
		}
		@Pc(701) int local701 = 0;
		this.anInt5612 = this.anInt5618;
		for (@Pc(707) int local707 = 0; local707 < arg1; local707++) {
			@Pc(714) short local714 = (short) (0x1 << local707);
			@Pc(718) Class191 local718 = arg0[local707];
			if (local718 != null) {
				for (local613 = 0; local613 < local718.anInt5626; local613++) {
					if (local44) {
						this.aByteArray64[local701++] = (byte) (local718.aByteArray64 == null || local718.aByteArray64[local613] == -1 ? -1 : this.anInt5628 + local718.aByteArray64[local613]);
					}
				}
				for (local624 = 0; local624 < local718.anInt5628; local624++) {
					@Pc(770) byte local770 = this.aByteArray60[this.anInt5628] = local718.aByteArray60[local624];
					if (local770 == 0) {
						this.aShortArray67[this.anInt5628] = (short) this.method4769(local718, local714, local718.aShortArray67[local624]);
						this.aShortArray64[this.anInt5628] = (short) this.method4769(local718, local714, local718.aShortArray64[local624]);
						this.aShortArray62[this.anInt5628] = (short) this.method4769(local718, local714, local718.aShortArray62[local624]);
					}
					if (local770 >= 1 && local770 <= 3) {
						this.aShortArray67[this.anInt5628] = local718.aShortArray67[local624];
						this.aShortArray64[this.anInt5628] = local718.aShortArray64[local624];
						this.aShortArray62[this.anInt5628] = local718.aShortArray62[local624];
						this.anIntArray277[this.anInt5628] = local718.anIntArray277[local624];
						this.anIntArray275[this.anInt5628] = local718.anIntArray275[local624];
						this.anIntArray274[this.anInt5628] = local718.anIntArray274[local624];
						this.aByteArray63[this.anInt5628] = local718.aByteArray63[local624];
						this.aByteArray66[this.anInt5628] = local718.aByteArray66[local624];
						this.anIntArray270[this.anInt5628] = local718.anIntArray270[local624];
					}
					if (local770 == 2) {
						this.anIntArray273[this.anInt5628] = local718.anIntArray273[local624];
						this.anIntArray276[this.anInt5628] = local718.anIntArray276[local624];
					}
					this.anInt5628++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)I")
	public int method4755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt5618; local13++) {
			if (this.anIntArray278[local13] == arg0 && arg1 == this.anIntArray272[local13] && arg2 == this.anIntArray279[local13]) {
				return local13;
			}
		}
		this.anIntArray278[this.anInt5618] = arg0;
		this.anIntArray272[this.anInt5618] = arg1;
		this.anIntArray279[this.anInt5618] = arg2;
		this.anInt5612 = this.anInt5618 + 1;
		return this.anInt5618++;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(SSB)V")
	public void method4756(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5626; local3++) {
			if (arg0 == this.aShortArray66[local3]) {
				this.aShortArray66[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(SBSIBSSBSS)B")
	public byte method4757() {
		if (this.anInt5628 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray60[this.anInt5628] = 3;
		this.aShortArray67[this.anInt5628] = 0;
		this.aShortArray64[this.anInt5628] = 32767;
		this.aShortArray62[this.anInt5628] = 0;
		this.anIntArray277[this.anInt5628] = 1024;
		this.anIntArray275[this.anInt5628] = 1024;
		this.anIntArray274[this.anInt5628] = 1024;
		this.aByteArray63[this.anInt5628] = 0;
		this.aByteArray66[this.anInt5628] = 0;
		this.anIntArray270[this.anInt5628] = 0;
		return (byte) this.anInt5628++;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([BZ)V")
	private void method4758(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(arg0);
		@Pc(15) Class4_Sub11 local15 = new Class4_Sub11(arg0);
		@Pc(20) Class4_Sub11 local20 = new Class4_Sub11(arg0);
		@Pc(25) Class4_Sub11 local25 = new Class4_Sub11(arg0);
		@Pc(30) Class4_Sub11 local30 = new Class4_Sub11(arg0);
		@Pc(35) Class4_Sub11 local35 = new Class4_Sub11(arg0);
		@Pc(40) Class4_Sub11 local40 = new Class4_Sub11(arg0);
		local10.anInt5831 = arg0.length - 23;
		this.anInt5618 = local10.method4936();
		this.anInt5626 = local10.method4936();
		this.anInt5628 = local10.method4905();
		@Pc(65) int local65 = local10.method4905();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(107) boolean local107 = (local65 & 0x8) == 8;
		if (local107) {
			local10.anInt5831 -= 7;
			this.anInt5621 = local10.method4905();
			local10.anInt5831 += 6;
		}
		@Pc(130) int local130 = local10.method4905();
		@Pc(134) int local134 = local10.method4905();
		@Pc(138) int local138 = local10.method4905();
		@Pc(142) int local142 = local10.method4905();
		@Pc(146) int local146 = local10.method4905();
		@Pc(150) int local150 = local10.method4936();
		@Pc(154) int local154 = local10.method4936();
		@Pc(158) int local158 = local10.method4936();
		@Pc(162) int local162 = local10.method4936();
		@Pc(166) int local166 = local10.method4936();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(185) int local185;
		if (this.anInt5628 > 0) {
			local10.anInt5831 = 0;
			this.aByteArray60 = new byte[this.anInt5628];
			for (local185 = 0; local185 < this.anInt5628; local185++) {
				@Pc(196) byte local196 = this.aByteArray60[local185] = local10.method4925();
				if (local196 == 0) {
					local168++;
				}
				if (local196 >= 1 && local196 <= 3) {
					local170++;
				}
				if (local196 == 2) {
					local172++;
				}
			}
		}
		local185 = this.anInt5628;
		@Pc(231) int local231 = local185;
		local185 += this.anInt5618;
		@Pc(238) int local238 = local185;
		if (local74) {
			local185 += this.anInt5626;
		}
		@Pc(247) int local247 = local185;
		local185 += this.anInt5626;
		@Pc(254) int local254 = local185;
		if (local130 == 255) {
			local185 += this.anInt5626;
		}
		@Pc(266) int local266 = local185;
		if (local138 == 1) {
			local185 += this.anInt5626;
		}
		@Pc(276) int local276 = local185;
		if (local146 == 1) {
			local185 += this.anInt5618;
		}
		@Pc(286) int local286 = local185;
		if (local134 == 1) {
			local185 += this.anInt5626;
		}
		@Pc(298) int local298 = local185;
		local185 += local162;
		@Pc(304) int local304 = local185;
		if (local142 == 1) {
			local185 += this.anInt5626 * 2;
		}
		@Pc(316) int local316 = local185;
		local185 += local166;
		@Pc(322) int local322 = local185;
		local185 += this.anInt5626 * 2;
		@Pc(331) int local331 = local185;
		local185 += local150;
		@Pc(337) int local337 = local185;
		local185 += local154;
		@Pc(343) int local343 = local185;
		local185 += local158;
		@Pc(349) int local349 = local185;
		local185 += local168 * 6;
		@Pc(357) int local357 = local185;
		local185 += local170 * 6;
		@Pc(365) byte local365 = 6;
		if (this.anInt5621 == 14) {
			local365 = 7;
		} else if (this.anInt5621 >= 15) {
			local365 = 9;
		}
		@Pc(387) int local387 = local185;
		local185 += local170 * local365;
		@Pc(395) int local395 = local185;
		local185 += local170;
		@Pc(401) int local401 = local185;
		local185 += local170;
		@Pc(407) int local407 = local185;
		local185 += local172 * 2 + local170;
		this.anIntArray279 = new int[this.anInt5618];
		if (local130 == 255) {
			this.aByteArray62 = new byte[this.anInt5626];
		} else {
			this.aByte60 = (byte) local130;
		}
		this.anIntArray278 = new int[this.anInt5618];
		this.aShortArray61 = new short[this.anInt5626];
		this.aShortArray68 = new short[this.anInt5626];
		this.anIntArray272 = new int[this.anInt5618];
		local10.anInt5831 = local231;
		if (local142 == 1) {
			this.aShortArray65 = new short[this.anInt5626];
		}
		if (local142 == 1 && this.anInt5628 > 0) {
			this.aByteArray64 = new byte[this.anInt5626];
		}
		this.aShortArray66 = new short[this.anInt5626];
		if (this.anInt5628 > 0) {
			if (local170 > 0) {
				this.aByteArray63 = new byte[local170];
				this.anIntArray274 = new int[local170];
				this.anIntArray275 = new int[local170];
				this.anIntArray277 = new int[local170];
				this.aByteArray66 = new byte[local170];
				this.anIntArray270 = new int[local170];
			}
			this.aShortArray62 = new short[this.anInt5628];
			if (local172 > 0) {
				this.anIntArray273 = new int[local172];
				this.anIntArray276 = new int[local172];
			}
			this.aShortArray67 = new short[this.anInt5628];
			this.aShortArray64 = new short[this.anInt5628];
		}
		if (local134 == 1) {
			this.aByteArray61 = new byte[this.anInt5626];
		}
		this.aShortArray59 = new short[this.anInt5626];
		if (local74) {
			this.aByteArray65 = new byte[this.anInt5626];
		}
		if (local146 == 1) {
			this.anIntArray271 = new int[this.anInt5618];
		}
		if (local138 == 1) {
			this.anIntArray269 = new int[this.anInt5626];
		}
		local15.anInt5831 = local331;
		local20.anInt5831 = local337;
		local25.anInt5831 = local343;
		local30.anInt5831 = local276;
		@Pc(598) int local598 = 0;
		@Pc(600) int local600 = 0;
		@Pc(602) int local602 = 0;
		@Pc(610) int local610;
		for (@Pc(604) int local604 = 0; local604 < this.anInt5618; local604++) {
			local610 = local10.method4905();
			@Pc(612) int local612 = 0;
			if ((local610 & 0x1) != 0) {
				local612 = local15.method4904();
			}
			@Pc(622) int local622 = 0;
			if ((local610 & 0x2) != 0) {
				local622 = local20.method4904();
			}
			@Pc(635) int local635 = 0;
			if ((local610 & 0x4) != 0) {
				local635 = local25.method4904();
			}
			this.anIntArray278[local604] = local598 + local612;
			this.anIntArray272[local604] = local622 + local600;
			this.anIntArray279[local604] = local635 + local602;
			local598 = this.anIntArray278[local604];
			local602 = this.anIntArray279[local604];
			local600 = this.anIntArray272[local604];
			if (local146 == 1) {
				this.anIntArray271[local604] = local30.method4905();
			}
		}
		local10.anInt5831 = local322;
		local15.anInt5831 = local238;
		local20.anInt5831 = local254;
		local25.anInt5831 = local286;
		local30.anInt5831 = local266;
		local35.anInt5831 = local304;
		local40.anInt5831 = local316;
		for (local610 = 0; local610 < this.anInt5626; local610++) {
			this.aShortArray66[local610] = (short) local10.method4936();
			if (local74) {
				this.aByteArray65[local610] = local15.method4925();
			}
			if (local130 == 255) {
				this.aByteArray62[local610] = local20.method4925();
			}
			if (local134 == 1) {
				this.aByteArray61[local610] = local25.method4925();
			}
			if (local138 == 1) {
				this.anIntArray269[local610] = local30.method4905();
			}
			if (local142 == 1) {
				this.aShortArray65[local610] = (short) (local35.method4936() - 1);
			}
			if (this.aByteArray64 != null) {
				if (this.aShortArray65[local610] == -1) {
					this.aByteArray64[local610] = -1;
				} else {
					this.aByteArray64[local610] = (byte) (local40.method4905() - 1);
				}
			}
		}
		local10.anInt5831 = local298;
		this.anInt5612 = -1;
		local15.anInt5831 = local247;
		@Pc(833) short local833 = 0;
		@Pc(835) short local835 = 0;
		@Pc(837) short local837 = 0;
		@Pc(839) short local839 = 0;
		@Pc(847) int local847;
		for (@Pc(841) int local841 = 0; local841 < this.anInt5626; local841++) {
			local847 = local15.method4905();
			if (local847 == 1) {
				local833 = (short) (local839 + local10.method4904());
				local835 = (short) (local833 + local10.method4904());
				local837 = (short) (local835 + local10.method4904());
				local839 = local837;
				this.aShortArray61[local841] = local833;
				this.aShortArray59[local841] = local835;
				this.aShortArray68[local841] = local837;
				if (local833 > this.anInt5612) {
					this.anInt5612 = local833;
				}
				if (local835 > this.anInt5612) {
					this.anInt5612 = local835;
				}
				if (this.anInt5612 < local837) {
					this.anInt5612 = local837;
				}
			}
			if (local847 == 2) {
				local835 = local837;
				local837 = (short) (local10.method4904() + local839);
				local839 = local837;
				this.aShortArray61[local841] = local833;
				this.aShortArray59[local841] = local835;
				this.aShortArray68[local841] = local837;
				if (local837 > this.anInt5612) {
					this.anInt5612 = local837;
				}
			}
			if (local847 == 3) {
				local833 = local837;
				local837 = (short) (local10.method4904() + local839);
				local839 = local837;
				this.aShortArray61[local841] = local833;
				this.aShortArray59[local841] = local835;
				this.aShortArray68[local841] = local837;
				if (this.anInt5612 < local837) {
					this.anInt5612 = local837;
				}
			}
			if (local847 == 4) {
				@Pc(1010) short local1010 = local833;
				local833 = local835;
				local837 = (short) (local10.method4904() + local839);
				local835 = local1010;
				this.aShortArray61[local841] = local833;
				local839 = local837;
				this.aShortArray59[local841] = local1010;
				this.aShortArray68[local841] = local837;
				if (this.anInt5612 < local837) {
					this.anInt5612 = local837;
				}
			}
		}
		local10.anInt5831 = local349;
		this.anInt5612++;
		local15.anInt5831 = local357;
		local20.anInt5831 = local387;
		local25.anInt5831 = local395;
		local30.anInt5831 = local401;
		local35.anInt5831 = local407;
		@Pc(1085) int local1085;
		for (local847 = 0; local847 < this.anInt5628; local847++) {
			local1085 = this.aByteArray60[local847] & 0xFF;
			if (local1085 == 0) {
				this.aShortArray67[local847] = (short) local10.method4936();
				this.aShortArray64[local847] = (short) local10.method4936();
				this.aShortArray62[local847] = (short) local10.method4936();
			}
			if (local1085 == 1) {
				this.aShortArray67[local847] = (short) local15.method4936();
				this.aShortArray64[local847] = (short) local15.method4936();
				this.aShortArray62[local847] = (short) local15.method4936();
				if (this.anInt5621 < 15) {
					this.anIntArray277[local847] = local20.method4936();
					if (this.anInt5621 >= 14) {
						this.anIntArray275[local847] = local20.method4934();
					} else {
						this.anIntArray275[local847] = local20.method4936();
					}
					this.anIntArray274[local847] = local20.method4936();
				} else {
					this.anIntArray277[local847] = local20.method4934();
					this.anIntArray275[local847] = local20.method4934();
					this.anIntArray274[local847] = local20.method4934();
				}
				this.aByteArray63[local847] = local25.method4925();
				this.aByteArray66[local847] = local30.method4925();
				this.anIntArray270[local847] = local35.method4925();
			}
			if (local1085 == 2) {
				this.aShortArray67[local847] = (short) local15.method4936();
				this.aShortArray64[local847] = (short) local15.method4936();
				this.aShortArray62[local847] = (short) local15.method4936();
				if (this.anInt5621 < 15) {
					this.anIntArray277[local847] = local20.method4936();
					if (this.anInt5621 >= 14) {
						this.anIntArray275[local847] = local20.method4934();
					} else {
						this.anIntArray275[local847] = local20.method4936();
					}
					this.anIntArray274[local847] = local20.method4936();
				} else {
					this.anIntArray277[local847] = local20.method4934();
					this.anIntArray275[local847] = local20.method4934();
					this.anIntArray274[local847] = local20.method4934();
				}
				this.aByteArray63[local847] = local25.method4925();
				this.aByteArray66[local847] = local30.method4925();
				this.anIntArray270[local847] = local35.method4925();
				this.anIntArray273[local847] = local35.method4925();
				this.anIntArray276[local847] = local35.method4925();
			}
			if (local1085 == 3) {
				this.aShortArray67[local847] = (short) local15.method4936();
				this.aShortArray64[local847] = (short) local15.method4936();
				this.aShortArray62[local847] = (short) local15.method4936();
				if (this.anInt5621 >= 15) {
					this.anIntArray277[local847] = local20.method4934();
					this.anIntArray275[local847] = local20.method4934();
					this.anIntArray274[local847] = local20.method4934();
				} else {
					this.anIntArray277[local847] = local20.method4936();
					if (this.anInt5621 < 14) {
						this.anIntArray275[local847] = local20.method4936();
					} else {
						this.anIntArray275[local847] = local20.method4934();
					}
					this.anIntArray274[local847] = local20.method4936();
				}
				this.aByteArray63[local847] = local25.method4925();
				this.aByteArray66[local847] = local30.method4925();
				this.anIntArray270[local847] = local35.method4925();
			}
		}
		local10.anInt5831 = local185;
		@Pc(1486) int local1486;
		@Pc(1492) int local1492;
		@Pc(1496) int local1496;
		@Pc(1562) int local1562;
		if (local85) {
			local1085 = local10.method4905();
			if (local1085 > 0) {
				this.aClass227Array3 = new Class227[local1085];
				for (local1486 = 0; local1486 < local1085; local1486++) {
					local1492 = local10.method4936();
					local1496 = local10.method4936();
					@Pc(1506) byte local1506;
					if (local130 == 255) {
						local1506 = this.aByteArray62[local1496];
					} else {
						local1506 = (byte) local130;
					}
					this.aClass227Array3[local1486] = new Class227(local1492, this.aShortArray61[local1496], this.aShortArray59[local1496], this.aShortArray68[local1496], local1506);
				}
			}
			local1486 = local10.method4905();
			if (local1486 > 0) {
				this.aClass103Array3 = new Class103[local1486];
				for (local1492 = 0; local1492 < local1486; local1492++) {
					local1496 = local10.method4936();
					local1562 = local10.method4936();
					this.aClass103Array3[local1492] = new Class103(local1496, local1562);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1085 = local10.method4905();
		if (local1085 <= 0) {
			return;
		}
		this.aClass287Array1 = new Class287[local1085];
		for (local1486 = 0; local1486 < local1085; local1486++) {
			local1492 = local10.method4936();
			local1496 = local10.method4936();
			local1562 = local10.method4905();
			@Pc(1611) byte local1611 = local10.method4925();
			this.aClass287Array1[local1486] = new Class287(local1492, local1496, local1562, local1611);
		}
		return;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)[[I")
	public int[][] method4759() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.aClass287Array1.length; local17++) {
			@Pc(25) int local25 = this.aClass287Array1[local17].anInt8502;
			if (local25 >= 0) {
				if (local25 > local15) {
					local15 = local25;
				}
				@Pc(39) int local39 = local8[local25]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local15 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local15; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass287Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass287Array1[local78].anInt8502;
			if (local86 >= 0) {
				local57[local86][local8[local86]++] = local78;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBSSIBIBB)I")
	public int method4760(@OriginalArg(0) int arg0, @OriginalArg(2) short arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray61[this.anInt5626] = (short) arg5;
		this.aShortArray59[this.anInt5626] = (short) arg0;
		this.aShortArray68[this.anInt5626] = (short) arg3;
		this.aByteArray65[this.anInt5626] = arg7;
		this.aByteArray64[this.anInt5626] = arg4;
		this.aShortArray66[this.anInt5626] = arg1;
		this.aByteArray61[this.anInt5626] = arg6;
		this.aShortArray65[this.anInt5626] = arg2;
		return this.anInt5626++;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZII)V")
	public void method4762(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(23) int local23;
		@Pc(41) int local41;
		if (arg1 != 0) {
			local17 = Class4_Sub27.anIntArray296[arg1];
			local21 = Class4_Sub27.anIntArray297[arg1];
			for (local23 = 0; local23 < this.anInt5618; local23++) {
				local41 = local21 * this.anIntArray278[local23] + local17 * this.anIntArray272[local23] >> 14;
				this.anIntArray272[local23] = local21 * this.anIntArray272[local23] - this.anIntArray278[local23] * local17 >> 14;
				this.anIntArray278[local23] = local41;
			}
		}
		if (arg0 != 0) {
			local17 = Class4_Sub27.anIntArray296[arg0];
			local21 = Class4_Sub27.anIntArray297[arg0];
			for (local23 = 0; local23 < this.anInt5618; local23++) {
				local41 = local21 * this.anIntArray272[local23] - this.anIntArray279[local23] * local17 >> 14;
				this.anIntArray279[local23] = this.anIntArray272[local23] * local17 + local21 * this.anIntArray279[local23] >> 14;
				this.anIntArray272[local23] = local41;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local17 = Class4_Sub27.anIntArray296[arg2];
		local21 = Class4_Sub27.anIntArray297[arg2];
		for (local23 = 0; local23 < this.anInt5618; local23++) {
			local41 = local17 * this.anIntArray279[local23] + this.anIntArray278[local23] * local21 >> 14;
			this.anIntArray279[local23] = this.anIntArray279[local23] * local21 - local17 * this.anIntArray278[local23] >> 14;
			this.anIntArray278[local23] = local41;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(SBS)V")
	public void method4763(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray65 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt5626; local15++) {
			if (this.aShortArray65[local15] == arg0) {
				this.aShortArray65[local15] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZB)[[I")
	public int[][] method4764(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt5618 : this.anInt5612;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray271[local20];
			if (local27 >= 0) {
				@Pc(36) int local36 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(61) int[][] local61 = new int[local10 + 1][];
		for (@Pc(68) int local68 = 0; local68 <= local10; local68++) {
			local61[local68] = new int[local8[local68]];
			local8[local68] = 0;
		}
		for (@Pc(91) int local91 = 0; local91 < local18; local91++) {
			@Pc(98) int local98 = this.anIntArray271[local91];
			if (local98 >= 0) {
				local61[local98][local8[local98]++] = local91;
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(IIII)V")
	public void method4766(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5618; local15++) {
			this.anIntArray278[local15] += arg1;
			this.anIntArray272[local15] += arg2;
			this.anIntArray279[local15] += arg0;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[B)V")
	private void method4767(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg0);
		@Pc(19) Class4_Sub11 local19 = new Class4_Sub11(arg0);
		@Pc(24) Class4_Sub11 local24 = new Class4_Sub11(arg0);
		@Pc(29) Class4_Sub11 local29 = new Class4_Sub11(arg0);
		@Pc(34) Class4_Sub11 local34 = new Class4_Sub11(arg0);
		local14.anInt5831 = arg0.length - 18;
		this.anInt5618 = local14.method4936();
		this.anInt5626 = local14.method4936();
		this.anInt5628 = local14.method4905();
		@Pc(63) int local63 = local14.method4905();
		@Pc(69) int local69 = local14.method4905();
		@Pc(75) int local75 = local14.method4905();
		@Pc(79) int local79 = local14.method4905();
		@Pc(85) int local85 = local14.method4905();
		@Pc(89) int local89 = local14.method4936();
		@Pc(93) int local93 = local14.method4936();
		@Pc(97) int local97 = local14.method4936();
		@Pc(101) int local101 = local14.method4936();
		@Pc(110) int local110 = this.anInt5618;
		@Pc(112) int local112 = local110;
		local110 += this.anInt5626;
		@Pc(119) int local119 = local110;
		if (local69 == 255) {
			local110 += this.anInt5626;
		}
		@Pc(131) int local131 = local110;
		if (local79 == 1) {
			local110 += this.anInt5626;
		}
		@Pc(141) int local141 = local110;
		if (local63 == 1) {
			local110 += this.anInt5626;
		}
		@Pc(151) int local151 = local110;
		if (local85 == 1) {
			local110 += this.anInt5618;
		}
		@Pc(163) int local163 = local110;
		if (local75 == 1) {
			local110 += this.anInt5626;
		}
		@Pc(175) int local175 = local110;
		local110 += local101;
		@Pc(181) int local181 = local110;
		local110 += this.anInt5626 * 2;
		@Pc(190) int local190 = local110;
		local110 += this.anInt5628 * 6;
		@Pc(199) int local199 = local110;
		local110 += local89;
		@Pc(205) int local205 = local110;
		local110 += local93;
		this.anIntArray279 = new int[this.anInt5618];
		local14.anInt5831 = 0;
		if (this.anInt5628 > 0) {
			this.aShortArray67 = new short[this.anInt5628];
			this.aShortArray64 = new short[this.anInt5628];
			this.aShortArray62 = new short[this.anInt5628];
			this.aByteArray60 = new byte[this.anInt5628];
		}
		this.anIntArray272 = new int[this.anInt5618];
		this.aShortArray68 = new short[this.anInt5626];
		if (local63 == 1) {
			this.aByteArray64 = new byte[this.anInt5626];
			this.aShortArray65 = new short[this.anInt5626];
			this.aByteArray65 = new byte[this.anInt5626];
		}
		if (local85 == 1) {
			this.anIntArray271 = new int[this.anInt5618];
		}
		this.aShortArray61 = new short[this.anInt5626];
		this.aShortArray66 = new short[this.anInt5626];
		if (local69 == 255) {
			this.aByteArray62 = new byte[this.anInt5626];
		} else {
			this.aByte60 = (byte) local69;
		}
		this.anIntArray278 = new int[this.anInt5618];
		if (local75 == 1) {
			this.aByteArray61 = new byte[this.anInt5626];
		}
		this.aShortArray59 = new short[this.anInt5626];
		if (local79 == 1) {
			this.anIntArray269 = new int[this.anInt5626];
		}
		local19.anInt5831 = local199;
		local24.anInt5831 = local205;
		local29.anInt5831 = local110;
		local34.anInt5831 = local151;
		@Pc(354) int local354 = 0;
		@Pc(356) int local356 = 0;
		@Pc(358) int local358 = 0;
		@Pc(366) int local366;
		@Pc(368) int local368;
		for (@Pc(360) int local360 = 0; local360 < this.anInt5618; local360++) {
			local366 = local14.method4905();
			local368 = 0;
			if ((local366 & 0x1) != 0) {
				local368 = local19.method4904();
			}
			@Pc(378) int local378 = 0;
			if ((local366 & 0x2) != 0) {
				local378 = local24.method4904();
			}
			@Pc(388) int local388 = 0;
			if ((local366 & 0x4) != 0) {
				local388 = local29.method4904();
			}
			this.anIntArray278[local360] = local368 + local354;
			this.anIntArray272[local360] = local356 + local378;
			this.anIntArray279[local360] = local388 + local358;
			local354 = this.anIntArray278[local360];
			local358 = this.anIntArray279[local360];
			local356 = this.anIntArray272[local360];
			if (local85 == 1) {
				this.anIntArray271[local360] = local34.method4905();
			}
		}
		local14.anInt5831 = local181;
		local19.anInt5831 = local141;
		local24.anInt5831 = local119;
		local29.anInt5831 = local163;
		local34.anInt5831 = local131;
		for (local366 = 0; local366 < this.anInt5626; local366++) {
			this.aShortArray66[local366] = (short) local14.method4936();
			if (local63 == 1) {
				local368 = local19.method4905();
				if ((local368 & 0x1) == 1) {
					local7 = true;
					this.aByteArray65[local366] = 1;
				} else {
					this.aByteArray65[local366] = 0;
				}
				if ((local368 & 0x2) == 2) {
					this.aByteArray64[local366] = (byte) (local368 >> 2);
					this.aShortArray65[local366] = this.aShortArray66[local366];
					this.aShortArray66[local366] = 127;
					if (this.aShortArray65[local366] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray64[local366] = -1;
					this.aShortArray65[local366] = -1;
				}
			}
			if (local69 == 255) {
				this.aByteArray62[local366] = local24.method4925();
			}
			if (local75 == 1) {
				this.aByteArray61[local366] = local29.method4925();
			}
			if (local79 == 1) {
				this.anIntArray269[local366] = local34.method4905();
			}
		}
		local14.anInt5831 = local175;
		this.anInt5612 = -1;
		local19.anInt5831 = local112;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(618) int local618;
		for (@Pc(612) int local612 = 0; local612 < this.anInt5626; local612++) {
			local618 = local19.method4905();
			if (local618 == 1) {
				local604 = (short) (local14.method4904() + local610);
				local606 = (short) (local14.method4904() + local604);
				local608 = (short) (local14.method4904() + local606);
				this.aShortArray61[local612] = local604;
				local610 = local608;
				this.aShortArray59[local612] = local606;
				this.aShortArray68[local612] = local608;
				if (this.anInt5612 < local604) {
					this.anInt5612 = local604;
				}
				if (this.anInt5612 < local606) {
					this.anInt5612 = local606;
				}
				if (local608 > this.anInt5612) {
					this.anInt5612 = local608;
				}
			}
			if (local618 == 2) {
				local606 = local608;
				local608 = (short) (local14.method4904() + local610);
				local610 = local608;
				this.aShortArray61[local612] = local604;
				this.aShortArray59[local612] = local606;
				this.aShortArray68[local612] = local608;
				if (local608 > this.anInt5612) {
					this.anInt5612 = local608;
				}
			}
			if (local618 == 3) {
				local604 = local608;
				local608 = (short) (local14.method4904() + local610);
				this.aShortArray61[local612] = local604;
				local610 = local608;
				this.aShortArray59[local612] = local606;
				this.aShortArray68[local612] = local608;
				if (local608 > this.anInt5612) {
					this.anInt5612 = local608;
				}
			}
			if (local618 == 4) {
				@Pc(777) short local777 = local604;
				local604 = local606;
				local606 = local777;
				local608 = (short) (local610 + local14.method4904());
				this.aShortArray61[local612] = local604;
				local610 = local608;
				this.aShortArray59[local612] = local777;
				this.aShortArray68[local612] = local608;
				if (local608 > this.anInt5612) {
					this.anInt5612 = local608;
				}
			}
		}
		this.anInt5612++;
		local14.anInt5831 = local190;
		for (local618 = 0; local618 < this.anInt5628; local618++) {
			this.aByteArray60[local618] = 0;
			this.aShortArray67[local618] = (short) local14.method4936();
			this.aShortArray64[local618] = (short) local14.method4936();
			this.aShortArray62[local618] = (short) local14.method4936();
		}
		if (this.aByteArray64 != null) {
			@Pc(873) boolean local873 = false;
			for (@Pc(875) int local875 = 0; local875 < this.anInt5626; local875++) {
				@Pc(884) int local884 = this.aByteArray64[local875] & 0xFF;
				if (local884 != 255) {
					if ((this.aShortArray67[local884] & 0xFFFF) == this.aShortArray61[local875] && this.aShortArray59[local875] == (this.aShortArray64[local884] & 0xFFFF) && this.aShortArray68[local875] == (this.aShortArray62[local884] & 0xFFFF)) {
						this.aByteArray64[local875] = -1;
					} else {
						local873 = true;
					}
				}
			}
			if (!local873) {
				this.aByteArray64 = null;
			}
		}
		if (!local9) {
			this.aShortArray65 = null;
		}
		if (!local7) {
			this.aByteArray65 = null;
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)[[I")
	public int[][] method4768() {
		@Pc(18) int[] local18 = new int[256];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anInt5626; local22++) {
			@Pc(29) int local29 = this.anIntArray269[local22];
			if (local29 >= 0) {
				if (local20 < local29) {
					local20 = local29;
				}
				@Pc(43) int local43 = local18[local29]++;
			}
		}
		@Pc(60) int[][] local60 = new int[local20 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local20; local62++) {
			local60[local62] = new int[local18[local62]];
			local18[local62] = 0;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt5626; local85++) {
			@Pc(92) int local92 = this.anIntArray269[local85];
			if (local92 >= 0) {
				local60[local92][local18[local92]++] = local85;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!kk;SIZ)I")
	private int method4769(@OriginalArg(0) Class191 arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(17) int local17 = arg0.anIntArray278[arg2];
		@Pc(22) int local22 = arg0.anIntArray272[arg2];
		@Pc(27) int local27 = arg0.anIntArray279[arg2];
		for (@Pc(29) int local29 = 0; local29 < this.anInt5618; local29++) {
			if (this.anIntArray278[local29] == local17 && this.anIntArray272[local29] == local22 && local27 == this.anIntArray279[local29]) {
				this.aShortArray63[local29] |= arg1;
				return local29;
			}
		}
		this.anIntArray278[this.anInt5618] = local17;
		this.anIntArray272[this.anInt5618] = local22;
		this.anIntArray279[this.anInt5618] = local27;
		this.aShortArray63[this.anInt5618] = arg1;
		this.anIntArray271[this.anInt5618] = arg0.anIntArray271 == null ? -1 : arg0.anIntArray271[arg2];
		return this.anInt5618++;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)V")
	public void method4770() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5618; local3++) {
			this.anIntArray278[local3] <<= 0x2;
			this.anIntArray272[local3] <<= 0x2;
			this.anIntArray279[local3] <<= 0x2;
		}
		if (this.anInt5628 <= 0 || this.anIntArray277 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray277.length; local52++) {
			this.anIntArray277[local52] <<= 0x2;
			this.anIntArray275[local52] <<= 0x2;
			if (this.aByteArray60[local52] != 1) {
				this.anIntArray274[local52] <<= 0x2;
			}
		}
	}
}
