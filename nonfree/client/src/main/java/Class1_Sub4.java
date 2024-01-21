import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "[S")
	public final short[] aShortArray1 = new short[128];

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "[I")
	private int[] anIntArray37 = new int[128];

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "[Lclient!hb;")
	public final Class32[] aClass32Array1 = new Class32[128];

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
	public final int anInt279;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "[B")
	public final byte[] aByteArray9 = new byte[128];

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "[Lclient!vb;")
	public final Class1_Sub9_Sub1[] aClass1_Sub9_Sub1Array1 = new Class1_Sub9_Sub1[128];

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "[B")
	public final byte[] aByteArray10 = new byte[128];

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "[B")
	public final byte[] aByteArray11 = new byte[128];

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub4(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class1_Sub20 local38 = new Class1_Sub20(arg0);
		while (local38.aByteArray36[local38.anInt2951 + local33] != 0) {
			local33++;
		}
		@Pc(52) byte[] local52 = new byte[local33];
		for (@Pc(54) int local54 = 0; local54 < local33; local54++) {
			local52[local54] = local38.method2099();
		}
		local33++;
		@Pc(69) int local69 = 0;
		local38.anInt2951++;
		@Pc(78) int local78 = local38.anInt2951;
		local38.anInt2951 += local33;
		while (local38.aByteArray36[local69 + local38.anInt2951] != 0) {
			local69++;
		}
		@Pc(98) byte[] local98 = new byte[local69];
		for (@Pc(100) int local100 = 0; local100 < local69; local100++) {
			local98[local100] = local38.method2099();
		}
		local38.anInt2951++;
		@Pc(120) int local120 = 0;
		local69++;
		@Pc(124) int local124 = local38.anInt2951;
		local38.anInt2951 += local69;
		while (local38.aByteArray36[local38.anInt2951 + local120] != 0) {
			local120++;
		}
		@Pc(144) byte[] local144 = new byte[local120];
		for (@Pc(146) int local146 = 0; local146 < local120; local146++) {
			local144[local146] = local38.method2099();
		}
		local120++;
		local38.anInt2951++;
		@Pc(172) byte[] local172 = new byte[local120];
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(191) int local191;
		if (local120 > 1) {
			local177 = 2;
			@Pc(179) int local179 = 1;
			local172[1] = 1;
			for (local185 = 2; local185 < local120; local185++) {
				local191 = local38.method2053();
				if (local191 == 0) {
					local179 = local177++;
				} else {
					if (local191 <= local179) {
						local191--;
					}
					local179 = local191;
				}
				local172[local185] = (byte) local179;
			}
		} else {
			local177 = local120;
		}
		@Pc(223) Class32[] local223 = new Class32[local177];
		for (local185 = 0; local185 < local223.length; local185++) {
			@Pc(235) Class32 local235 = local223[local185] = new Class32();
			@Pc(239) int local239 = local38.method2053();
			if (local239 > 0) {
				local235.aByteArray24 = new byte[local239 * 2];
			}
			local239 = local38.method2053();
			if (local239 > 0) {
				local235.aByteArray23 = new byte[local239 * 2 + 2];
				local235.aByteArray23[1] = 64;
			}
		}
		local191 = local38.method2053();
		@Pc(297) byte[] local297 = local191 <= 0 ? null : new byte[local191 * 2];
		local191 = local38.method2053();
		@Pc(303) int local303 = 0;
		@Pc(315) byte[] local315 = local191 > 0 ? new byte[local191 * 2] : null;
		while (local38.aByteArray36[local38.anInt2951 + local303] != 0) {
			local303++;
		}
		@Pc(330) byte[] local330 = new byte[local303];
		for (@Pc(332) int local332 = 0; local332 < local303; local332++) {
			local330[local332] = local38.method2099();
		}
		local303++;
		local38.anInt2951++;
		@Pc(357) int local357 = 0;
		for (@Pc(359) int local359 = 0; local359 < 128; local359++) {
			local357 += local38.method2053();
			this.aShortArray1[local359] = (short) local357;
		}
		local357 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local357 += local38.method2053();
			this.aShortArray1[local381] = (short) (this.aShortArray1[local381] + (local357 << 8));
		}
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		for (@Pc(412) int local412 = 0; local412 < 128; local412++) {
			if (local406 == 0) {
				if (local330.length > local410) {
					local406 = local330[local410++];
				} else {
					local406 = -1;
				}
				local408 = local38.method2071();
			}
			local406--;
			this.aShortArray1[local412] = (short) (this.aShortArray1[local412] + ((local408 - 1 & 0x2) << 14));
			this.anIntArray37[local412] = local408;
		}
		local410 = 0;
		@Pc(467) int local467 = 0;
		local406 = 0;
		for (@Pc(471) int local471 = 0; local471 < 128; local471++) {
			if (this.anIntArray37[local471] != 0) {
				if (local406 == 0) {
					local467 = local38.aByteArray36[local78++] - 1;
					if (local410 < local52.length) {
						local406 = local52[local410++];
					} else {
						local406 = -1;
					}
				}
				this.aByteArray9[local471] = (byte) local467;
				local406--;
			}
		}
		local410 = 0;
		@Pc(526) int local526 = 0;
		local406 = 0;
		for (@Pc(530) int local530 = 0; local530 < 128; local530++) {
			if (this.anIntArray37[local530] != 0) {
				if (local406 == 0) {
					if (local98.length > local410) {
						local406 = local98[local410++];
					} else {
						local406 = -1;
					}
					local526 = local38.aByteArray36[local124++] + 16 << 2;
				}
				local406--;
				this.aByteArray11[local530] = (byte) local526;
			}
		}
		local406 = 0;
		local410 = 0;
		@Pc(582) Class32 local582 = null;
		for (@Pc(584) int local584 = 0; local584 < 128; local584++) {
			if (this.anIntArray37[local584] != 0) {
				if (local406 == 0) {
					local582 = local223[local172[local410]];
					if (local144.length > local410) {
						local406 = local144[local410++];
					} else {
						local406 = -1;
					}
				}
				local406--;
				this.aClass32Array1[local584] = local582;
			}
		}
		local410 = 0;
		local406 = 0;
		@Pc(639) int local639 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local406 == 0) {
				if (local410 < local330.length) {
					local406 = local330[local410++];
				} else {
					local406 = -1;
				}
				if (this.anIntArray37[local641] > 0) {
					local639 = local38.method2053() + 1;
				}
			}
			this.aByteArray10[local641] = (byte) local639;
			local406--;
		}
		this.anInt279 = local38.method2053() + 1;
		@Pc(709) int local709;
		for (@Pc(698) int local698 = 0; local698 < local177; local698++) {
			@Pc(704) Class32 local704 = local223[local698];
			if (local704.aByteArray24 != null) {
				for (local709 = 1; local709 < local704.aByteArray24.length; local709 += 2) {
					local704.aByteArray24[local709] = local38.method2099();
				}
			}
			if (local704.aByteArray23 != null) {
				for (local709 = 3; local709 < local704.aByteArray23.length - 2; local709 += 2) {
					local704.aByteArray23[local709] = local38.method2099();
				}
			}
		}
		@Pc(758) int local758;
		if (local297 != null) {
			for (local758 = 1; local758 < local297.length; local758 += 2) {
				local297[local758] = local38.method2099();
			}
		}
		if (local315 != null) {
			for (local758 = 1; local758 < local315.length; local758 += 2) {
				local315[local758] = local38.method2099();
			}
		}
		@Pc(803) int local803;
		for (local758 = 0; local758 < local177; local758++) {
			@Pc(796) Class32 local796 = local223[local758];
			if (local796.aByteArray23 != null) {
				local357 = 0;
				for (local803 = 2; local803 < local796.aByteArray23.length; local803 += 2) {
					local357 = local38.method2053() + local357 + 1;
					local796.aByteArray23[local803] = (byte) local357;
				}
			}
		}
		@Pc(852) int local852;
		for (local709 = 0; local709 < local177; local709++) {
			@Pc(845) Class32 local845 = local223[local709];
			if (local845.aByteArray24 != null) {
				local357 = 0;
				for (local852 = 2; local852 < local845.aByteArray24.length; local852 += 2) {
					local357 = local38.method2053() + local357 + 1;
					local845.aByteArray24[local852] = (byte) local357;
				}
			}
		}
		@Pc(929) int local929;
		@Pc(952) int local952;
		@Pc(958) byte local958;
		@Pc(971) int local971;
		@Pc(979) int local979;
		@Pc(989) int local989;
		@Pc(923) byte local923;
		@Pc(1032) int local1032;
		if (local297 != null) {
			local357 = local38.method2053();
			local297[0] = (byte) local357;
			for (local803 = 2; local803 < local297.length; local803 += 2) {
				local357 = local38.method2053() + local357 + 1;
				local297[local803] = (byte) local357;
			}
			local923 = local297[0];
			@Pc(927) byte local927 = local297[1];
			for (local929 = 0; local929 < local923; local929++) {
				this.aByteArray10[local929] = (byte) (this.aByteArray10[local929] * local927 + 32 >> 6);
			}
			for (local952 = 2; local952 < local297.length; local952 += 2) {
				local958 = local297[local952];
				local971 = (local958 - local923) / 2 + local927 * (local958 - local923);
				@Pc(977) byte local977 = local297[local952 + 1];
				for (local979 = local923; local979 < local958; local979++) {
					local989 = Static57.method1043(local971, local958 - local923);
					local971 += local977 - local927;
					this.aByteArray10[local979] = (byte) (local989 * this.aByteArray10[local979] + 32 >> 6);
				}
				local927 = local977;
				local923 = local958;
			}
			for (local1032 = local923; local1032 < 128; local1032++) {
				this.aByteArray10[local1032] = (byte) (this.aByteArray10[local1032] * local927 + 32 >> 6);
			}
		}
		@Pc(1098) int local1098;
		if (local315 != null) {
			local357 = local38.method2053();
			local315[0] = (byte) local357;
			for (local803 = 2; local803 < local315.length; local803 += 2) {
				local357 = local38.method2053() + local357 + 1;
				local315[local803] = (byte) local357;
			}
			local923 = local315[0];
			local1098 = local315[1] << 1;
			for (local929 = 0; local929 < local923; local929++) {
				local952 = local1098 + (this.aByteArray11[local929] & 0xFF);
				if (local952 < 0) {
					local952 = 0;
				}
				if (local952 > 128) {
					local952 = 128;
				}
				this.aByteArray11[local929] = (byte) local952;
			}
			local952 = 2;
			@Pc(1145) int local1145;
			while (local952 < local315.length) {
				local1145 = local315[local952 + 1] << 1;
				local958 = local315[local952];
				local971 = (local958 - local923) / 2 + local1098 * (local958 - local923);
				local952 += 2;
				for (local979 = local923; local979 < local958; local979++) {
					local989 = Static57.method1043(local971, local958 - local923);
					local971 += local1145 - local1098;
					@Pc(1190) int local1190 = local989 + (this.aByteArray11[local979] & 0xFF);
					if (local1190 < 0) {
						local1190 = 0;
					}
					if (local1190 > 128) {
						local1190 = 128;
					}
					this.aByteArray11[local979] = (byte) local1190;
				}
				local923 = local958;
				local1098 = local1145;
			}
			for (local1032 = local923; local1032 < 128; local1032++) {
				local1145 = local1098 + (this.aByteArray11[local1032] & 0xFF);
				if (local1145 < 0) {
					local1145 = 0;
				}
				if (local1145 > 128) {
					local1145 = 128;
				}
				this.aByteArray11[local1032] = (byte) local1145;
			}
		}
		for (local803 = 0; local803 < local177; local803++) {
			local223[local803].anInt1138 = local38.method2053();
		}
		for (local852 = 0; local852 < local177; local852++) {
			@Pc(1289) Class32 local1289 = local223[local852];
			if (local1289.aByteArray24 != null) {
				local1289.anInt1147 = local38.method2053();
			}
			if (local1289.aByteArray23 != null) {
				local1289.anInt1148 = local38.method2053();
			}
			if (local1289.anInt1138 > 0) {
				local1289.anInt1141 = local38.method2053();
			}
		}
		for (local1098 = 0; local1098 < local177; local1098++) {
			local223[local1098].anInt1145 = local38.method2053();
		}
		for (local929 = 0; local929 < local177; local929++) {
			@Pc(1347) Class32 local1347 = local223[local929];
			if (local1347.anInt1145 > 0) {
				local1347.anInt1136 = local38.method2053();
			}
		}
		for (local952 = 0; local952 < local177; local952++) {
			@Pc(1370) Class32 local1370 = local223[local952];
			if (local1370.anInt1136 > 0) {
				local1370.anInt1143 = local38.method2053();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!q;[BI[I)Z")
	public boolean method258(@OriginalArg(0) Class60 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class1_Sub9_Sub1 local17 = null;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg1 == null || arg1[local21] != 0) {
				@Pc(33) int local33 = this.anIntArray37[local21];
				if (local33 != 0) {
					if (local33 != local19) {
						local19 = local33--;
						if ((local33 & 0x1) == 0) {
							local17 = arg0.method1637(arg2, local33 >> 2);
						} else {
							local17 = arg0.method1639(local33 >> 2, arg2);
						}
						if (local17 == null) {
							local7 = false;
						}
					}
					if (local17 != null) {
						this.aClass1_Sub9_Sub1Array1[local21] = local17;
						this.anIntArray37[local21] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
	public void method260() {
		this.anIntArray37 = null;
	}
}
