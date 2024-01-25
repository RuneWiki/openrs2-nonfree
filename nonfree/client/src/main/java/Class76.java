import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class76 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[Lclient!hr;")
	public Class117[] aClass117Array1;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "[I")
	public int[] anIntArray134;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "[Lclient!vc;")
	public Class254[] aClass254Array1;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "[Lclient!ol;")
	public Class191[] aClass191Array1;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!fc", name = "Y", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!fc", name = "bb", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!fc", name = "cb", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public int anInt1808 = 0;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
	public int anInt1813 = 0;

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
	public int anInt1816 = 0;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "B")
	public byte aByte11 = 0;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt1809 = 12;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
	public int anInt1812 = 0;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([B)V")
	public Class76(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1780(arg0);
		} else {
			this.method1772(arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(III)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray22 = new byte[arg1];
		this.anIntArray132 = new int[arg1];
		this.anIntArray130 = new int[arg0];
		this.aShortArray17 = new short[arg1];
		this.aShortArray25 = new short[arg1];
		this.aShortArray20 = new short[arg1];
		this.anIntArray129 = new int[arg0];
		if (arg2 > 0) {
			this.anIntArray136 = new int[arg2];
			this.anIntArray126 = new int[arg2];
			this.anIntArray131 = new int[arg2];
			this.aShortArray23 = new short[arg2];
			this.aByteArray19 = new byte[arg2];
			this.anIntArray127 = new int[arg2];
			this.aByteArray16 = new byte[arg2];
			this.anIntArray133 = new int[arg2];
			this.aByteArray17 = new byte[arg2];
			this.aShortArray22 = new short[arg2];
			this.anIntArray134 = new int[arg2];
			this.aShortArray21 = new short[arg2];
		}
		this.aByteArray21 = new byte[arg1];
		this.aByteArray20 = new byte[arg1];
		this.aShortArray24 = new short[arg1];
		this.aShortArray19 = new short[arg1];
		this.anIntArray135 = new int[arg0];
		this.aByteArray18 = new byte[arg1];
		this.anIntArray128 = new int[arg0];
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([Lclient!fc;I)V")
	public Class76(@OriginalArg(0) Class76[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1812 = 0;
		this.anInt1808 = 0;
		this.anInt1813 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte11 = -1;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class76 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt1813 += local56.anInt1813;
				this.anInt1812 += local56.anInt1812;
				this.anInt1808 += local56.anInt1808;
				local36 |= local56.aByteArray22 != null;
				if (local56.aClass191Array1 != null) {
					local30 += local56.aClass191Array1.length;
				}
				if (local56.aClass117Array1 != null) {
					local34 += local56.aClass117Array1.length;
				}
				if (local56.aClass254Array1 != null) {
					local32 += local56.aClass254Array1.length;
				}
				if (local56.aByteArray18 == null) {
					if (this.aByte11 == -1) {
						this.aByte11 = local56.aByte11;
					}
					if (local56.aByte11 != this.aByte11) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
				local42 |= local56.aByteArray20 != null;
				local44 |= local56.aShortArray19 != null;
				local40 |= local56.aByteArray21 != null;
				local46 |= local56.anIntArray132 != null;
			}
		}
		this.anIntArray129 = new int[this.anInt1808];
		this.anIntArray128 = new int[this.anInt1808];
		this.anIntArray135 = new int[this.anInt1808];
		if (local42) {
			this.aByteArray20 = new byte[this.anInt1812];
		}
		this.aShortArray17 = new short[this.anInt1812];
		if (local44) {
			this.aShortArray19 = new short[this.anInt1812];
		}
		if (this.anInt1813 > 0) {
			this.anIntArray131 = new int[this.anInt1813];
			this.aShortArray23 = new short[this.anInt1813];
			this.anIntArray133 = new int[this.anInt1813];
			this.aShortArray21 = new short[this.anInt1813];
			this.anIntArray134 = new int[this.anInt1813];
			this.aByteArray17 = new byte[this.anInt1813];
			this.anIntArray126 = new int[this.anInt1813];
			this.aShortArray22 = new short[this.anInt1813];
			this.anIntArray127 = new int[this.anInt1813];
			this.anIntArray136 = new int[this.anInt1813];
			this.aByteArray16 = new byte[this.anInt1813];
			this.aByteArray19 = new byte[this.anInt1813];
		}
		if (local32 > 0) {
			this.aClass254Array1 = new Class254[local32];
		}
		this.aShortArray26 = new short[this.anInt1808];
		if (local30 > 0) {
			this.aClass191Array1 = new Class191[local30];
		}
		this.aShortArray25 = new short[this.anInt1812];
		if (local46) {
			this.anIntArray132 = new int[this.anInt1812];
		}
		this.anIntArray130 = new int[this.anInt1808];
		if (local34 > 0) {
			this.aClass117Array1 = new Class117[local34];
		}
		this.aShortArray20 = new short[this.anInt1812];
		if (local36) {
			this.aByteArray22 = new byte[this.anInt1812];
		}
		if (local38) {
			this.aByteArray18 = new byte[this.anInt1812];
		}
		this.aShortArray24 = new short[this.anInt1812];
		if (local40) {
			this.aByteArray21 = new byte[this.anInt1812];
		}
		this.aShortArray18 = new short[this.anInt1812];
		this.anInt1812 = 0;
		local30 = 0;
		local34 = 0;
		local32 = 0;
		this.anInt1813 = 0;
		this.anInt1808 = 0;
		@Pc(608) int local608;
		@Pc(619) int local619;
		for (@Pc(375) int local375 = 0; local375 < arg1; local375++) {
			@Pc(381) short local381 = (short) (0x1 << local375);
			@Pc(385) Class76 local385 = arg0[local375];
			if (local385 != null) {
				@Pc(392) int local392;
				if (local385.aClass117Array1 != null) {
					for (local392 = 0; local392 < local385.aClass117Array1.length; local392++) {
						@Pc(398) Class117 local398 = local385.aClass117Array1[local392];
						this.aClass117Array1[local34++] = local398.method2391(this.anInt1812 + local398.anInt2910);
					}
				}
				for (local392 = 0; local392 < local385.anInt1812; local392++) {
					if (local36 && local385.aByteArray22 != null) {
						this.aByteArray22[this.anInt1812] = local385.aByteArray22[local392];
					}
					if (local38) {
						if (local385.aByteArray18 == null) {
							this.aByteArray18[this.anInt1812] = local385.aByte11;
						} else {
							this.aByteArray18[this.anInt1812] = local385.aByteArray18[local392];
						}
					}
					if (local40 && local385.aByteArray21 != null) {
						this.aByteArray21[this.anInt1812] = local385.aByteArray21[local392];
					}
					if (local44) {
						if (local385.aShortArray19 == null) {
							this.aShortArray19[this.anInt1812] = -1;
						} else {
							this.aShortArray19[this.anInt1812] = local385.aShortArray19[local392];
						}
					}
					if (local46) {
						if (local385.anIntArray132 == null) {
							this.anIntArray132[this.anInt1812] = -1;
						} else {
							this.anIntArray132[this.anInt1812] = local385.anIntArray132[local392];
						}
					}
					this.aShortArray17[this.anInt1812] = (short) this.method1785(local385.aShortArray17[local392], local381, local385);
					this.aShortArray25[this.anInt1812] = (short) this.method1785(local385.aShortArray25[local392], local381, local385);
					this.aShortArray20[this.anInt1812] = (short) this.method1785(local385.aShortArray20[local392], local381, local385);
					this.aShortArray18[this.anInt1812] = local381;
					this.aShortArray24[this.anInt1812] = local385.aShortArray24[local392];
					this.anInt1812++;
				}
				@Pc(596) int local596;
				if (local385.aClass191Array1 != null) {
					for (local596 = 0; local596 < local385.aClass191Array1.length; local596++) {
						local608 = this.method1785(local385.aClass191Array1[local596].anInt5316, local381, local385);
						local619 = this.method1785(local385.aClass191Array1[local596].anInt5331, local381, local385);
						@Pc(630) int local630 = this.method1785(local385.aClass191Array1[local596].anInt5329, local381, local385);
						this.aClass191Array1[local30] = local385.aClass191Array1[local596].method4246(local630, local619, local608);
						local30++;
					}
				}
				if (local385.aClass254Array1 != null) {
					for (local596 = 0; local596 < local385.aClass254Array1.length; local596++) {
						local608 = this.method1785(local385.aClass254Array1[local596].anInt7217, local381, local385);
						this.aClass254Array1[local32] = local385.aClass254Array1[local596].method5787(local608);
						local32++;
					}
				}
			}
		}
		@Pc(695) int local695 = 0;
		this.anInt1816 = this.anInt1808;
		for (@Pc(701) int local701 = 0; local701 < arg1; local701++) {
			@Pc(707) short local707 = (short) (0x1 << local701);
			@Pc(711) Class76 local711 = arg0[local701];
			if (local711 != null) {
				for (local608 = 0; local608 < local711.anInt1812; local608++) {
					if (local42) {
						this.aByteArray20[local695++] = (byte) (local711.aByteArray20 == null || local711.aByteArray20[local608] == -1 ? -1 : local711.aByteArray20[local608] + this.anInt1813);
					}
				}
				for (local619 = 0; local619 < local711.anInt1813; local619++) {
					@Pc(766) byte local766 = this.aByteArray19[this.anInt1813] = local711.aByteArray19[local619];
					if (local766 == 0) {
						this.aShortArray21[this.anInt1813] = (short) this.method1785(local711.aShortArray21[local619], local707, local711);
						this.aShortArray23[this.anInt1813] = (short) this.method1785(local711.aShortArray23[local619], local707, local711);
						this.aShortArray22[this.anInt1813] = (short) this.method1785(local711.aShortArray22[local619], local707, local711);
					}
					if (local766 >= 1 && local766 <= 3) {
						this.aShortArray21[this.anInt1813] = local711.aShortArray21[local619];
						this.aShortArray23[this.anInt1813] = local711.aShortArray23[local619];
						this.aShortArray22[this.anInt1813] = local711.aShortArray22[local619];
						this.anIntArray133[this.anInt1813] = local711.anIntArray133[local619];
						this.anIntArray136[this.anInt1813] = local711.anIntArray136[local619];
						this.anIntArray126[this.anInt1813] = local711.anIntArray126[local619];
						this.aByteArray16[this.anInt1813] = local711.aByteArray16[local619];
						this.aByteArray17[this.anInt1813] = local711.aByteArray17[local619];
						this.anIntArray127[this.anInt1813] = local711.anIntArray127[local619];
					}
					if (local766 == 2) {
						this.anIntArray134[this.anInt1813] = local711.anIntArray134[local619];
						this.anIntArray131[this.anInt1813] = local711.anIntArray131[local619];
					}
					this.anInt1813++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B[B)V")
	private void method1772(@OriginalArg(1) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class2_Sub17 local12 = new Class2_Sub17(arg0);
		@Pc(17) Class2_Sub17 local17 = new Class2_Sub17(arg0);
		@Pc(22) Class2_Sub17 local22 = new Class2_Sub17(arg0);
		@Pc(27) Class2_Sub17 local27 = new Class2_Sub17(arg0);
		@Pc(36) Class2_Sub17 local36 = new Class2_Sub17(arg0);
		local12.anInt7523 = arg0.length - 18;
		this.anInt1808 = local12.method6148();
		this.anInt1812 = local12.method6148();
		this.anInt1813 = local12.method6138();
		@Pc(61) int local61 = local12.method6138();
		@Pc(65) int local65 = local12.method6138();
		@Pc(69) int local69 = local12.method6138();
		@Pc(73) int local73 = local12.method6138();
		@Pc(77) int local77 = local12.method6138();
		@Pc(81) int local81 = local12.method6148();
		@Pc(85) int local85 = local12.method6148();
		@Pc(89) int local89 = local12.method6148();
		@Pc(93) int local93 = local12.method6148();
		@Pc(102) int local102 = this.anInt1808;
		@Pc(104) int local104 = local102;
		local102 += this.anInt1812;
		@Pc(111) int local111 = local102;
		if (local65 == 255) {
			local102 += this.anInt1812;
		}
		@Pc(121) int local121 = local102;
		if (local73 == 1) {
			local102 += this.anInt1812;
		}
		@Pc(133) int local133 = local102;
		if (local61 == 1) {
			local102 += this.anInt1812;
		}
		@Pc(143) int local143 = local102;
		if (local77 == 1) {
			local102 += this.anInt1808;
		}
		@Pc(153) int local153 = local102;
		if (local69 == 1) {
			local102 += this.anInt1812;
		}
		@Pc(165) int local165 = local102;
		local102 += local93;
		@Pc(171) int local171 = local102;
		local102 += this.anInt1812 * 2;
		@Pc(180) int local180 = local102;
		local102 += this.anInt1813 * 6;
		@Pc(189) int local189 = local102;
		local102 += local81;
		@Pc(195) int local195 = local102;
		local102 += local85;
		if (local69 == 1) {
			this.aByteArray21 = new byte[this.anInt1812];
		}
		this.aShortArray17 = new short[this.anInt1812];
		if (this.anInt1813 > 0) {
			this.aShortArray21 = new short[this.anInt1813];
			this.aByteArray19 = new byte[this.anInt1813];
			this.aShortArray22 = new short[this.anInt1813];
			this.aShortArray23 = new short[this.anInt1813];
		}
		this.anIntArray130 = new int[this.anInt1808];
		this.anIntArray128 = new int[this.anInt1808];
		if (local73 == 1) {
			this.anIntArray132 = new int[this.anInt1812];
		}
		if (local77 == 1) {
			this.anIntArray135 = new int[this.anInt1808];
		}
		this.anIntArray129 = new int[this.anInt1808];
		this.aShortArray24 = new short[this.anInt1812];
		if (local65 == 255) {
			this.aByteArray18 = new byte[this.anInt1812];
		} else {
			this.aByte11 = (byte) local65;
		}
		local12.anInt7523 = 0;
		if (local61 == 1) {
			this.aByteArray22 = new byte[this.anInt1812];
			this.aByteArray20 = new byte[this.anInt1812];
			this.aShortArray19 = new short[this.anInt1812];
		}
		this.aShortArray20 = new short[this.anInt1812];
		this.aShortArray25 = new short[this.anInt1812];
		local17.anInt7523 = local189;
		local22.anInt7523 = local195;
		local27.anInt7523 = local102;
		local36.anInt7523 = local143;
		@Pc(337) int local337 = 0;
		@Pc(339) int local339 = 0;
		@Pc(341) int local341 = 0;
		@Pc(348) int local348;
		@Pc(350) int local350;
		for (@Pc(343) int local343 = 0; local343 < this.anInt1808; local343++) {
			local348 = local12.method6138();
			local350 = 0;
			if ((local348 & 0x1) != 0) {
				local350 = local17.method6134();
			}
			@Pc(360) int local360 = 0;
			if ((local348 & 0x2) != 0) {
				local360 = local22.method6134();
			}
			@Pc(373) int local373 = 0;
			if ((local348 & 0x4) != 0) {
				local373 = local27.method6134();
			}
			this.anIntArray128[local343] = local337 + local350;
			this.anIntArray130[local343] = local339 + local360;
			this.anIntArray129[local343] = local341 + local373;
			local339 = this.anIntArray130[local343];
			local341 = this.anIntArray129[local343];
			local337 = this.anIntArray128[local343];
			if (local77 == 1) {
				this.anIntArray135[local343] = local36.method6138();
			}
		}
		local12.anInt7523 = local171;
		local17.anInt7523 = local133;
		local22.anInt7523 = local111;
		local27.anInt7523 = local153;
		local36.anInt7523 = local121;
		for (local348 = 0; local348 < this.anInt1812; local348++) {
			this.aShortArray24[local348] = (short) local12.method6148();
			if (local61 == 1) {
				local350 = local17.method6138();
				if ((local350 & 0x1) == 1) {
					local5 = true;
					this.aByteArray22[local348] = 1;
				} else {
					this.aByteArray22[local348] = 0;
				}
				if ((local350 & 0x2) == 2) {
					this.aByteArray20[local348] = (byte) (local350 >> 2);
					this.aShortArray19[local348] = this.aShortArray24[local348];
					this.aShortArray24[local348] = 127;
					if (this.aShortArray19[local348] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray20[local348] = -1;
					this.aShortArray19[local348] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray18[local348] = local22.method6120();
			}
			if (local69 == 1) {
				this.aByteArray21[local348] = local27.method6120();
			}
			if (local73 == 1) {
				this.anIntArray132[local348] = local36.method6138();
			}
		}
		this.anInt1816 = -1;
		local12.anInt7523 = local165;
		local17.anInt7523 = local104;
		@Pc(586) short local586 = 0;
		@Pc(588) short local588 = 0;
		@Pc(590) short local590 = 0;
		@Pc(592) short local592 = 0;
		@Pc(599) int local599;
		for (@Pc(594) int local594 = 0; local594 < this.anInt1812; local594++) {
			local599 = local17.method6138();
			if (local599 == 1) {
				local586 = (short) (local12.method6134() + local592);
				local588 = (short) (local12.method6134() + local586);
				local590 = (short) (local12.method6134() + local588);
				local592 = local590;
				this.aShortArray17[local594] = local586;
				this.aShortArray25[local594] = local588;
				this.aShortArray20[local594] = local590;
				if (local586 > this.anInt1816) {
					this.anInt1816 = local586;
				}
				if (local588 > this.anInt1816) {
					this.anInt1816 = local588;
				}
				if (local590 > this.anInt1816) {
					this.anInt1816 = local590;
				}
			}
			if (local599 == 2) {
				local588 = local590;
				local590 = (short) (local592 + local12.method6134());
				this.aShortArray17[local594] = local586;
				local592 = local590;
				this.aShortArray25[local594] = local588;
				this.aShortArray20[local594] = local590;
				if (this.anInt1816 < local590) {
					this.anInt1816 = local590;
				}
			}
			if (local599 == 3) {
				local586 = local590;
				local590 = (short) (local12.method6134() + local592);
				this.aShortArray17[local594] = local586;
				local592 = local590;
				this.aShortArray25[local594] = local588;
				this.aShortArray20[local594] = local590;
				if (local590 > this.anInt1816) {
					this.anInt1816 = local590;
				}
			}
			if (local599 == 4) {
				@Pc(762) short local762 = local586;
				local586 = local588;
				local588 = local762;
				local590 = (short) (local12.method6134() + local592);
				this.aShortArray17[local594] = local586;
				local592 = local590;
				this.aShortArray25[local594] = local762;
				this.aShortArray20[local594] = local590;
				if (this.anInt1816 < local590) {
					this.anInt1816 = local590;
				}
			}
		}
		this.anInt1816++;
		local12.anInt7523 = local180;
		for (local599 = 0; local599 < this.anInt1813; local599++) {
			this.aByteArray19[local599] = 0;
			this.aShortArray21[local599] = (short) local12.method6148();
			this.aShortArray23[local599] = (short) local12.method6148();
			this.aShortArray22[local599] = (short) local12.method6148();
		}
		if (this.aByteArray20 != null) {
			@Pc(861) boolean local861 = false;
			for (@Pc(863) int local863 = 0; local863 < this.anInt1812; local863++) {
				@Pc(871) int local871 = this.aByteArray20[local863] & 0xFF;
				if (local871 != 255) {
					if (this.aShortArray17[local863] == (this.aShortArray21[local871] & 0xFFFF) && (this.aShortArray23[local871] & 0xFFFF) == this.aShortArray25[local863] && (this.aShortArray22[local871] & 0xFFFF) == this.aShortArray20[local863]) {
						this.aByteArray20[local863] = -1;
					} else {
						local861 = true;
					}
				}
			}
			if (!local861) {
				this.aByteArray20 = null;
			}
		}
		if (!local7) {
			this.aShortArray19 = null;
		}
		if (!local5) {
			this.aByteArray22 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)[[I")
	public int[][] method1773() {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1812; local18++) {
			@Pc(25) int local25 = this.anIntArray132[local18];
			if (local25 >= 0) {
				@Pc(34) int local34 = local14[local25]++;
				if (local16 < local25) {
					local16 = local25;
				}
			}
		}
		@Pc(52) int[][] local52 = new int[local16 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local16; local54++) {
			local52[local54] = new int[local14[local54]];
			local14[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt1812; local73++) {
			@Pc(80) int local80 = this.anIntArray132[local73];
			if (local80 >= 0) {
				local52[local80][local14[local80]++] = local73;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBII)V")
	public void method1774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local8 = Class229.anIntArray537[arg2];
			local12 = Class229.anIntArray536[arg2];
			for (local14 = 0; local14 < this.anInt1808; local14++) {
				local31 = this.anIntArray130[local14] * local8 + this.anIntArray128[local14] * local12 >> 15;
				this.anIntArray130[local14] = this.anIntArray130[local14] * local12 - this.anIntArray128[local14] * local8 >> 15;
				this.anIntArray128[local14] = local31;
			}
		}
		if (arg1 != 0) {
			local8 = Class229.anIntArray537[arg1];
			local12 = Class229.anIntArray536[arg1];
			for (local14 = 0; local14 < this.anInt1808; local14++) {
				local31 = this.anIntArray130[local14] * local12 - this.anIntArray129[local14] * local8 >> 15;
				this.anIntArray129[local14] = local12 * this.anIntArray129[local14] + local8 * this.anIntArray130[local14] >> 15;
				this.anIntArray130[local14] = local31;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local8 = Class229.anIntArray537[arg0];
		local12 = Class229.anIntArray536[arg0];
		for (local14 = 0; local14 < this.anInt1808; local14++) {
			local31 = this.anIntArray128[local14] * local12 + local8 * this.anIntArray129[local14] >> 15;
			this.anIntArray129[local14] = this.anIntArray129[local14] * local12 - this.anIntArray128[local14] * local8 >> 15;
			this.anIntArray128[local14] = local31;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public void method1775() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1808; local1++) {
			this.anIntArray128[local1] <<= 0x0;
			this.anIntArray130[local1] <<= 0x0;
			this.anIntArray129[local1] <<= 0x0;
		}
		if (this.anInt1813 <= 0 || this.anIntArray133 == null) {
			return;
		}
		for (@Pc(44) int local44 = 0; local44 < this.anIntArray133.length; local44++) {
			this.anIntArray133[local44] <<= 0x0;
			this.anIntArray136[local44] <<= 0x0;
			if (this.aByteArray19[local44] != 1) {
				this.anIntArray126[local44] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(SBISIBIBB)I")
	public int method1776(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		this.aShortArray17[this.anInt1812] = (short) arg4;
		this.aShortArray25[this.anInt1812] = (short) arg2;
		this.aShortArray20[this.anInt1812] = (short) arg6;
		this.aByteArray22[this.anInt1812] = arg5;
		this.aByteArray20[this.anInt1812] = arg1;
		this.aShortArray24[this.anInt1812] = arg3;
		this.aByteArray21[this.anInt1812] = arg7;
		this.aShortArray19[this.anInt1812] = arg0;
		return this.anInt1812++;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(SBS)V")
	public void method1778(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray19 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt1812; local17++) {
			if (arg0 == this.aShortArray19[local17]) {
				this.aShortArray19[local17] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BI)V")
	private void method1780(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub17 local8 = new Class2_Sub17(arg0);
		@Pc(13) Class2_Sub17 local13 = new Class2_Sub17(arg0);
		@Pc(18) Class2_Sub17 local18 = new Class2_Sub17(arg0);
		@Pc(23) Class2_Sub17 local23 = new Class2_Sub17(arg0);
		@Pc(28) Class2_Sub17 local28 = new Class2_Sub17(arg0);
		@Pc(33) Class2_Sub17 local33 = new Class2_Sub17(arg0);
		@Pc(38) Class2_Sub17 local38 = new Class2_Sub17(arg0);
		local8.anInt7523 = arg0.length - 23;
		this.anInt1808 = local8.method6148();
		this.anInt1812 = local8.method6148();
		this.anInt1813 = local8.method6138();
		@Pc(69) int local69 = local8.method6138();
		@Pc(78) boolean local78 = (local69 & 0x1) == 1;
		@Pc(89) boolean local89 = (local69 & 0x2) == 2;
		@Pc(100) boolean local100 = (local69 & 0x4) == 4;
		@Pc(109) boolean local109 = (local69 & 0x8) == 8;
		if (local109) {
			local8.anInt7523 -= 7;
			this.anInt1809 = local8.method6138();
			local8.anInt7523 += 6;
		}
		@Pc(132) int local132 = local8.method6138();
		@Pc(136) int local136 = local8.method6138();
		@Pc(140) int local140 = local8.method6138();
		@Pc(146) int local146 = local8.method6138();
		@Pc(150) int local150 = local8.method6138();
		@Pc(156) int local156 = local8.method6148();
		@Pc(160) int local160 = local8.method6148();
		@Pc(164) int local164 = local8.method6148();
		@Pc(168) int local168 = local8.method6148();
		@Pc(172) int local172 = local8.method6148();
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(194) int local194;
		if (this.anInt1813 > 0) {
			this.aByteArray19 = new byte[this.anInt1813];
			local8.anInt7523 = 0;
			for (local194 = 0; local194 < this.anInt1813; local194++) {
				@Pc(204) byte local204 = this.aByteArray19[local194] = local8.method6120();
				if (local204 >= 1 && local204 <= 3) {
					local176++;
				}
				if (local204 == 0) {
					local174++;
				}
				if (local204 == 2) {
					local178++;
				}
			}
		}
		local194 = this.anInt1813;
		@Pc(234) int local234 = local194;
		local194 += this.anInt1808;
		@Pc(241) int local241 = local194;
		if (local78) {
			local194 += this.anInt1812;
		}
		@Pc(250) int local250 = local194;
		local194 += this.anInt1812;
		@Pc(257) int local257 = local194;
		if (local132 == 255) {
			local194 += this.anInt1812;
		}
		@Pc(269) int local269 = local194;
		if (local140 == 1) {
			local194 += this.anInt1812;
		}
		@Pc(281) int local281 = local194;
		if (local150 == 1) {
			local194 += this.anInt1808;
		}
		@Pc(291) int local291 = local194;
		if (local136 == 1) {
			local194 += this.anInt1812;
		}
		@Pc(303) int local303 = local194;
		local194 += local168;
		@Pc(309) int local309 = local194;
		if (local146 == 1) {
			local194 += this.anInt1812 * 2;
		}
		@Pc(321) int local321 = local194;
		local194 += local172;
		@Pc(327) int local327 = local194;
		local194 += this.anInt1812 * 2;
		@Pc(336) int local336 = local194;
		local194 += local156;
		@Pc(342) int local342 = local194;
		local194 += local160;
		@Pc(348) int local348 = local194;
		local194 += local164;
		@Pc(354) int local354 = local194;
		local194 += local174 * 6;
		@Pc(362) int local362 = local194;
		local194 += local176 * 6;
		@Pc(376) int local376 = this.anInt1809 >= 14 ? 7 : 6;
		@Pc(378) int local378 = local194;
		local194 += local176 * local376;
		@Pc(386) int local386 = local194;
		local194 += local176;
		@Pc(392) int local392 = local194;
		local194 += local176;
		@Pc(398) int local398 = local194;
		local194 += local176 + local178 * 2;
		this.anIntArray128 = new int[this.anInt1808];
		this.anIntArray129 = new int[this.anInt1808];
		local8.anInt7523 = local234;
		if (local78) {
			this.aByteArray22 = new byte[this.anInt1812];
		}
		this.aShortArray25 = new short[this.anInt1812];
		if (local150 == 1) {
			this.anIntArray135 = new int[this.anInt1808];
		}
		this.aShortArray17 = new short[this.anInt1812];
		this.anIntArray130 = new int[this.anInt1808];
		if (this.anInt1813 > 0) {
			if (local176 > 0) {
				this.aByteArray16 = new byte[local176];
				this.anIntArray127 = new int[local176];
				this.aByteArray17 = new byte[local176];
				this.anIntArray136 = new int[local176];
				this.anIntArray126 = new int[local176];
				this.anIntArray133 = new int[local176];
			}
			this.aShortArray23 = new short[this.anInt1813];
			if (local178 > 0) {
				this.anIntArray134 = new int[local178];
				this.anIntArray131 = new int[local178];
			}
			this.aShortArray21 = new short[this.anInt1813];
			this.aShortArray22 = new short[this.anInt1813];
		}
		this.aShortArray24 = new short[this.anInt1812];
		if (local132 == 255) {
			this.aByteArray18 = new byte[this.anInt1812];
		} else {
			this.aByte11 = (byte) local132;
		}
		this.aShortArray20 = new short[this.anInt1812];
		if (local146 == 1 && this.anInt1813 > 0) {
			this.aByteArray20 = new byte[this.anInt1812];
		}
		if (local136 == 1) {
			this.aByteArray21 = new byte[this.anInt1812];
		}
		if (local146 == 1) {
			this.aShortArray19 = new short[this.anInt1812];
		}
		if (local140 == 1) {
			this.anIntArray132 = new int[this.anInt1812];
		}
		local13.anInt7523 = local336;
		local18.anInt7523 = local342;
		local23.anInt7523 = local348;
		local28.anInt7523 = local281;
		@Pc(593) int local593 = 0;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(604) int local604;
		for (@Pc(599) int local599 = 0; local599 < this.anInt1808; local599++) {
			local604 = local8.method6138();
			@Pc(606) int local606 = 0;
			if ((local604 & 0x1) != 0) {
				local606 = local13.method6134();
			}
			@Pc(616) int local616 = 0;
			if ((local604 & 0x2) != 0) {
				local616 = local18.method6134();
			}
			@Pc(629) int local629 = 0;
			if ((local604 & 0x4) != 0) {
				local629 = local23.method6134();
			}
			this.anIntArray128[local599] = local606 + local593;
			this.anIntArray130[local599] = local616 + local595;
			this.anIntArray129[local599] = local597 + local629;
			local597 = this.anIntArray129[local599];
			local595 = this.anIntArray130[local599];
			local593 = this.anIntArray128[local599];
			if (local150 == 1) {
				this.anIntArray135[local599] = local28.method6138();
			}
		}
		local8.anInt7523 = local327;
		local13.anInt7523 = local241;
		local18.anInt7523 = local257;
		local23.anInt7523 = local291;
		local28.anInt7523 = local269;
		local33.anInt7523 = local309;
		local38.anInt7523 = local321;
		for (local604 = 0; local604 < this.anInt1812; local604++) {
			this.aShortArray24[local604] = (short) local8.method6148();
			if (local78) {
				this.aByteArray22[local604] = local13.method6120();
			}
			if (local132 == 255) {
				this.aByteArray18[local604] = local18.method6120();
			}
			if (local136 == 1) {
				this.aByteArray21[local604] = local23.method6120();
			}
			if (local140 == 1) {
				this.anIntArray132[local604] = local28.method6138();
			}
			if (local146 == 1) {
				this.aShortArray19[local604] = (short) (local33.method6148() - 1);
			}
			if (this.aByteArray20 != null) {
				if (this.aShortArray19[local604] == -1) {
					this.aByteArray20[local604] = -1;
				} else {
					this.aByteArray20[local604] = (byte) (local38.method6138() - 1);
				}
			}
		}
		local8.anInt7523 = local303;
		this.anInt1816 = -1;
		local13.anInt7523 = local250;
		@Pc(827) short local827 = 0;
		@Pc(829) short local829 = 0;
		@Pc(831) short local831 = 0;
		@Pc(833) short local833 = 0;
		@Pc(840) int local840;
		for (@Pc(835) int local835 = 0; local835 < this.anInt1812; local835++) {
			local840 = local13.method6138();
			if (local840 == 1) {
				local827 = (short) (local833 + local8.method6134());
				local829 = (short) (local827 + local8.method6134());
				local831 = (short) (local8.method6134() + local829);
				local833 = local831;
				this.aShortArray17[local835] = local827;
				this.aShortArray25[local835] = local829;
				this.aShortArray20[local835] = local831;
				if (this.anInt1816 < local827) {
					this.anInt1816 = local827;
				}
				if (this.anInt1816 < local829) {
					this.anInt1816 = local829;
				}
				if (local831 > this.anInt1816) {
					this.anInt1816 = local831;
				}
			}
			if (local840 == 2) {
				local829 = local831;
				local831 = (short) (local833 + local8.method6134());
				local833 = local831;
				this.aShortArray17[local835] = local827;
				this.aShortArray25[local835] = local829;
				this.aShortArray20[local835] = local831;
				if (local831 > this.anInt1816) {
					this.anInt1816 = local831;
				}
			}
			if (local840 == 3) {
				local827 = local831;
				local831 = (short) (local833 + local8.method6134());
				local833 = local831;
				this.aShortArray17[local835] = local827;
				this.aShortArray25[local835] = local829;
				this.aShortArray20[local835] = local831;
				if (this.anInt1816 < local831) {
					this.anInt1816 = local831;
				}
			}
			if (local840 == 4) {
				@Pc(1001) short local1001 = local827;
				local827 = local829;
				local831 = (short) (local833 + local8.method6134());
				local829 = local1001;
				local833 = local831;
				this.aShortArray17[local835] = local827;
				this.aShortArray25[local835] = local1001;
				this.aShortArray20[local835] = local831;
				if (this.anInt1816 < local831) {
					this.anInt1816 = local831;
				}
			}
		}
		local8.anInt7523 = local354;
		this.anInt1816++;
		local13.anInt7523 = local362;
		local18.anInt7523 = local378;
		local23.anInt7523 = local386;
		local28.anInt7523 = local392;
		local33.anInt7523 = local398;
		@Pc(1083) int local1083;
		for (local840 = 0; local840 < this.anInt1813; local840++) {
			local1083 = this.aByteArray19[local840] & 0xFF;
			if (local1083 == 0) {
				this.aShortArray21[local840] = (short) local8.method6148();
				this.aShortArray23[local840] = (short) local8.method6148();
				this.aShortArray22[local840] = (short) local8.method6148();
			}
			if (local1083 == 1) {
				this.aShortArray21[local840] = (short) local13.method6148();
				this.aShortArray23[local840] = (short) local13.method6148();
				this.aShortArray22[local840] = (short) local13.method6148();
				this.anIntArray133[local840] = local18.method6148();
				if (this.anInt1809 >= 14) {
					this.anIntArray136[local840] = local18.method6145();
				} else {
					this.anIntArray136[local840] = local18.method6148();
				}
				this.anIntArray126[local840] = local18.method6148();
				this.aByteArray16[local840] = local23.method6120();
				this.aByteArray17[local840] = local28.method6120();
				this.anIntArray127[local840] = local33.method6120();
			}
			if (local1083 == 2) {
				this.aShortArray21[local840] = (short) local13.method6148();
				this.aShortArray23[local840] = (short) local13.method6148();
				this.aShortArray22[local840] = (short) local13.method6148();
				this.anIntArray133[local840] = local18.method6148();
				if (this.anInt1809 < 14) {
					this.anIntArray136[local840] = local18.method6148();
				} else {
					this.anIntArray136[local840] = local18.method6145();
				}
				this.anIntArray126[local840] = local18.method6148();
				this.aByteArray16[local840] = local23.method6120();
				this.aByteArray17[local840] = local28.method6120();
				this.anIntArray127[local840] = local33.method6120();
				this.anIntArray134[local840] = local33.method6120();
				this.anIntArray131[local840] = local33.method6120();
			}
			if (local1083 == 3) {
				this.aShortArray21[local840] = (short) local13.method6148();
				this.aShortArray23[local840] = (short) local13.method6148();
				this.aShortArray22[local840] = (short) local13.method6148();
				this.anIntArray133[local840] = local18.method6148();
				if (this.anInt1809 < 14) {
					this.anIntArray136[local840] = local18.method6148();
				} else {
					this.anIntArray136[local840] = local18.method6145();
				}
				this.anIntArray126[local840] = local18.method6148();
				this.aByteArray16[local840] = local23.method6120();
				this.aByteArray17[local840] = local28.method6120();
				this.anIntArray127[local840] = local33.method6120();
			}
		}
		local8.anInt7523 = local194;
		@Pc(1409) int local1409;
		@Pc(1414) int local1414;
		@Pc(1420) int local1420;
		@Pc(1478) int local1478;
		if (local89) {
			local1083 = local8.method6138();
			if (local1083 > 0) {
				this.aClass191Array1 = new Class191[local1083];
				for (local1409 = 0; local1409 < local1083; local1409++) {
					local1414 = local8.method6148();
					local1420 = local8.method6148();
					@Pc(1426) byte local1426;
					if (local132 == 255) {
						local1426 = this.aByteArray18[local1420];
					} else {
						local1426 = (byte) local132;
					}
					this.aClass191Array1[local1409] = new Class191(local1414, this.aShortArray17[local1420], this.aShortArray25[local1420], this.aShortArray20[local1420], local1426);
				}
			}
			local1409 = local8.method6138();
			if (local1409 > 0) {
				this.aClass254Array1 = new Class254[local1409];
				for (local1414 = 0; local1414 < local1409; local1414++) {
					local1420 = local8.method6148();
					local1478 = local8.method6148();
					this.aClass254Array1[local1414] = new Class254(local1420, local1478);
				}
			}
		}
		if (!local100) {
			return;
		}
		local1083 = local8.method6138();
		if (local1083 <= 0) {
			return;
		}
		this.aClass117Array1 = new Class117[local1083];
		for (local1409 = 0; local1409 < local1083; local1409++) {
			local1414 = local8.method6148();
			local1420 = local8.method6148();
			local1478 = local8.method6138();
			@Pc(1527) byte local1527 = local8.method6120();
			this.aClass117Array1[local1409] = new Class117(local1414, local1420, local1478, local1527);
		}
		return;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)I")
	public int method1781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt1808; local15++) {
			if (arg0 == this.anIntArray128[local15] && this.anIntArray130[local15] == arg2 && this.anIntArray129[local15] == arg1) {
				return local15;
			}
		}
		this.anIntArray128[this.anInt1808] = arg0;
		this.anIntArray130[this.anInt1808] = arg2;
		this.anIntArray129[this.anInt1808] = arg1;
		this.anInt1816 = this.anInt1808 + 1;
		return this.anInt1808++;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BSS)V")
	public void method1783(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(8) int local8 = 0; local8 < this.anInt1812; local8++) {
			if (arg0 == this.aShortArray24[local8]) {
				this.aShortArray24[local8] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ISLclient!fc;I)I")
	private int method1785(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) Class76 arg2) {
		@Pc(8) int local8 = arg2.anIntArray128[arg0];
		@Pc(13) int local13 = arg2.anIntArray130[arg0];
		@Pc(18) int local18 = arg2.anIntArray129[arg0];
		for (@Pc(20) int local20 = 0; local20 < this.anInt1808; local20++) {
			if (local8 == this.anIntArray128[local20] && this.anIntArray130[local20] == local13 && this.anIntArray129[local20] == local18) {
				this.aShortArray26[local20] |= arg1;
				return local20;
			}
		}
		this.anIntArray128[this.anInt1808] = local8;
		this.anIntArray130[this.anInt1808] = local13;
		this.anIntArray129[this.anInt1808] = local18;
		this.aShortArray26[this.anInt1808] = arg1;
		this.anIntArray135[this.anInt1808] = arg2.anIntArray135 == null ? -1 : arg2.anIntArray135[arg0];
		return this.anInt1808++;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)[[I")
	public int[][] method1786() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass117Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass117Array1[local12].anInt2914;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(34) int local34 = local8[local20]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.aClass117Array1.length; local73++) {
			@Pc(81) int local81 = this.aClass117Array1[local73].anInt2914;
			if (local81 >= 0) {
				local52[local81][local8[local81]++] = local73;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)[[I")
	public int[][] method1787() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1816; local12++) {
			@Pc(19) int local19 = this.anIntArray135[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt1816; local75++) {
			@Pc(82) int local82 = this.anIntArray135[local75];
			if (local82 >= 0) {
				local54[local82][local8[local82]++] = local75;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(SBSSBBSSBS)B")
	public byte method1789() {
		if (this.anInt1813 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray19[this.anInt1813] = 3;
		this.aShortArray21[this.anInt1813] = 0;
		this.aShortArray23[this.anInt1813] = 32767;
		this.aShortArray22[this.anInt1813] = 0;
		this.anIntArray133[this.anInt1813] = 1024;
		this.anIntArray136[this.anInt1813] = 1024;
		this.anIntArray126[this.anInt1813] = 1024;
		this.aByteArray16[this.anInt1813] = 0;
		this.aByteArray17[this.anInt1813] = 0;
		this.anIntArray127[this.anInt1813] = 0;
		return (byte) this.anInt1813++;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIII)V")
	public void method1790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(10) int local10 = 0; local10 < this.anInt1808; local10++) {
			this.anIntArray128[local10] += arg1;
			this.anIntArray130[local10] += arg2;
			this.anIntArray129[local10] += arg0;
		}
	}
}
