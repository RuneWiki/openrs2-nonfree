import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!br", name = "k", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "[Lclient!ct;")
	public Class2_Sub14_Sub1[] aClass2_Sub14_Sub1Array1;

	@OriginalMember(owner = "client!br", name = "o", descriptor = "[Lclient!fca;")
	public Class109[] aClass109Array1;

	@OriginalMember(owner = "client!br", name = "r", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "I")
	public int anInt1306;

	@OriginalMember(owner = "client!br", name = "t", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	private Class2_Sub9() {
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "([B)V")
	public Class2_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray8 = new byte[128];
		this.aClass109Array1 = new Class109[128];
		this.aClass2_Sub14_Sub1Array1 = new Class2_Sub14_Sub1[128];
		this.aByteArray10 = new byte[128];
		this.anIntArray81 = new int[128];
		this.aByteArray9 = new byte[128];
		this.aShortArray17 = new short[128];
		@Pc(36) Class2_Sub17 local36 = new Class2_Sub17(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray26[local38 + local36.anInt3378] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method2860();
		}
		local36.anInt3378++;
		local38++;
		@Pc(83) int local83 = local36.anInt3378;
		local36.anInt3378 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray26[local36.anInt3378 + local91] != 0; local91++) {
		}
		@Pc(109) byte[] local109 = new byte[local91];
		for (@Pc(111) int local111 = 0; local111 < local91; local111++) {
			local109[local111] = local36.method2860();
		}
		local91++;
		local36.anInt3378++;
		@Pc(133) int local133 = local36.anInt3378;
		local36.anInt3378 += local91;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray26[local36.anInt3378 + local141] != 0; local141++) {
		}
		@Pc(159) byte[] local159 = new byte[local141];
		for (@Pc(161) int local161 = 0; local161 < local141; local161++) {
			local159[local161] = local36.method2860();
		}
		local36.anInt3378++;
		local141++;
		@Pc(187) byte[] local187 = new byte[local141];
		@Pc(194) int local194;
		@Pc(206) int local206;
		@Pc(212) int local212;
		if (local141 <= 1) {
			local194 = local141;
		} else {
			local187[1] = 1;
			local194 = 2;
			@Pc(204) int local204 = 1;
			for (local206 = 2; local206 < local141; local206++) {
				local212 = local36.method2859();
				if (local212 == 0) {
					local204 = local194++;
				} else {
					if (local204 >= local212) {
						local212--;
					}
					local204 = local212;
				}
				local187[local206] = (byte) local204;
			}
		}
		@Pc(248) Class109[] local248 = new Class109[local194];
		for (local206 = 0; local206 < local248.length; local206++) {
			@Pc(260) Class109 local260 = local248[local206] = new Class109();
			@Pc(264) int local264 = local36.method2859();
			if (local264 > 0) {
				local260.aByteArray24 = new byte[local264 * 2];
			}
			local264 = local36.method2859();
			if (local264 > 0) {
				local260.aByteArray23 = new byte[local264 * 2 + 2];
				local260.aByteArray23[1] = 64;
			}
		}
		local212 = local36.method2859();
		@Pc(319) byte[] local319 = local212 <= 0 ? null : new byte[local212 * 2];
		local212 = local36.method2859();
		@Pc(335) byte[] local335 = local212 <= 0 ? null : new byte[local212 * 2];
		@Pc(337) int local337;
		for (local337 = 0; local36.aByteArray26[local337 + local36.anInt3378] != 0; local337++) {
		}
		@Pc(351) byte[] local351 = new byte[local337];
		for (@Pc(353) int local353 = 0; local353 < local337; local353++) {
			local351[local353] = local36.method2860();
		}
		local36.anInt3378++;
		local337++;
		@Pc(374) int local374 = 0;
		for (@Pc(376) int local376 = 0; local376 < 128; local376++) {
			local374 += local36.method2859();
			this.aShortArray17[local376] = (short) local374;
		}
		local374 = 0;
		for (@Pc(398) int local398 = 0; local398 < 128; local398++) {
			local374 += local36.method2859();
			this.aShortArray17[local398] = (short) (this.aShortArray17[local398] + (local374 << 8));
		}
		@Pc(425) int local425 = 0;
		@Pc(427) int local427 = 0;
		@Pc(429) int local429 = 0;
		for (@Pc(431) int local431 = 0; local431 < 128; local431++) {
			if (local425 == 0) {
				if (local427 >= local351.length) {
					local425 = -1;
				} else {
					local425 = local351[local427++];
				}
				local429 = local36.method2868();
			}
			this.aShortArray17[local431] = (short) (this.aShortArray17[local431] + ((local429 - 1 & 0x2) << 14));
			this.anIntArray81[local431] = local429;
			local425--;
		}
		local425 = 0;
		local427 = 0;
		@Pc(490) int local490 = 0;
		for (@Pc(492) int local492 = 0; local492 < 128; local492++) {
			if (this.anIntArray81[local492] != 0) {
				if (local425 == 0) {
					local490 = local36.aByteArray26[local83++] - 1;
					if (local427 < local55.length) {
						local425 = local55[local427++];
					} else {
						local425 = -1;
					}
				}
				this.aByteArray10[local492] = (byte) local490;
				local425--;
			}
		}
		local425 = 0;
		local427 = 0;
		@Pc(546) int local546 = 0;
		for (@Pc(548) int local548 = 0; local548 < 128; local548++) {
			if (this.anIntArray81[local548] != 0) {
				if (local425 == 0) {
					local546 = local36.aByteArray26[local133++] + 16 << 2;
					if (local427 < local109.length) {
						local425 = local109[local427++];
					} else {
						local425 = -1;
					}
				}
				this.aByteArray9[local548] = (byte) local546;
				local425--;
			}
		}
		local427 = 0;
		local425 = 0;
		@Pc(603) Class109 local603 = null;
		for (@Pc(605) int local605 = 0; local605 < 128; local605++) {
			if (this.anIntArray81[local605] != 0) {
				if (local425 == 0) {
					local603 = local248[local187[local427]];
					if (local159.length > local427) {
						local425 = local159[local427++];
					} else {
						local425 = -1;
					}
				}
				local425--;
				this.aClass109Array1[local605] = local603;
			}
		}
		local425 = 0;
		local427 = 0;
		@Pc(652) int local652 = 0;
		for (@Pc(654) int local654 = 0; local654 < 128; local654++) {
			if (local425 == 0) {
				if (local351.length > local427) {
					local425 = local351[local427++];
				} else {
					local425 = -1;
				}
				if (this.anIntArray81[local654] > 0) {
					local652 = local36.method2859() + 1;
				}
			}
			local425--;
			this.aByteArray8[local654] = (byte) local652;
		}
		this.anInt1306 = local36.method2859() + 1;
		@Pc(721) int local721;
		for (@Pc(710) int local710 = 0; local710 < local194; local710++) {
			@Pc(716) Class109 local716 = local248[local710];
			if (local716.aByteArray24 != null) {
				for (local721 = 1; local721 < local716.aByteArray24.length; local721 += 2) {
					local716.aByteArray24[local721] = local36.method2860();
				}
			}
			if (local716.aByteArray23 != null) {
				for (local721 = 3; local721 < local716.aByteArray23.length - 2; local721 += 2) {
					local716.aByteArray23[local721] = local36.method2860();
				}
			}
		}
		@Pc(770) int local770;
		if (local319 != null) {
			for (local770 = 1; local770 < local319.length; local770 += 2) {
				local319[local770] = local36.method2860();
			}
		}
		if (local335 != null) {
			for (local770 = 1; local770 < local335.length; local770 += 2) {
				local335[local770] = local36.method2860();
			}
		}
		@Pc(815) int local815;
		for (local770 = 0; local770 < local194; local770++) {
			@Pc(808) Class109 local808 = local248[local770];
			if (local808.aByteArray23 != null) {
				local374 = 0;
				for (local815 = 2; local815 < local808.aByteArray23.length; local815 += 2) {
					local374 = local36.method2859() + local374 + 1;
					local808.aByteArray23[local815] = (byte) local374;
				}
			}
		}
		@Pc(856) int local856;
		for (local721 = 0; local721 < local194; local721++) {
			@Pc(849) Class109 local849 = local248[local721];
			if (local849.aByteArray24 != null) {
				local374 = 0;
				for (local856 = 2; local856 < local849.aByteArray24.length; local856 += 2) {
					local374 = local374 + local36.method2859() + 1;
					local849.aByteArray24[local856] = (byte) local374;
				}
			}
		}
		@Pc(927) int local927;
		@Pc(950) int local950;
		@Pc(956) byte local956;
		@Pc(976) int local976;
		@Pc(978) int local978;
		@Pc(988) int local988;
		@Pc(921) byte local921;
		@Pc(1035) int local1035;
		if (local319 != null) {
			local374 = local36.method2859();
			local319[0] = (byte) local374;
			for (local815 = 2; local815 < local319.length; local815 += 2) {
				local374 += local36.method2859() + 1;
				local319[local815] = (byte) local374;
			}
			local921 = local319[0];
			@Pc(925) byte local925 = local319[1];
			for (local927 = 0; local927 < local921; local927++) {
				this.aByteArray8[local927] = (byte) (local925 * this.aByteArray8[local927] + 32 >> 6);
			}
			local950 = 2;
			while (local950 < local319.length) {
				local956 = local319[local950];
				@Pc(962) byte local962 = local319[local950 + 1];
				local976 = local925 * (local956 - local921) + (local956 - local921) / 2;
				for (local978 = local921; local978 < local956; local978++) {
					local988 = Static607.method8537(local956 - local921, local976);
					local976 += local962 - local925;
					this.aByteArray8[local978] = (byte) (local988 * this.aByteArray8[local978] + 32 >> 6);
				}
				local925 = local962;
				local950 += 2;
				local921 = local956;
			}
			for (local1035 = local921; local1035 < 128; local1035++) {
				this.aByteArray8[local1035] = (byte) (local925 * this.aByteArray8[local1035] + 32 >> 6);
			}
		}
		@Pc(1102) int local1102;
		if (local335 != null) {
			local374 = local36.method2859();
			local335[0] = (byte) local374;
			for (local815 = 2; local815 < local335.length; local815 += 2) {
				local374 = local374 + local36.method2859() + 1;
				local335[local815] = (byte) local374;
			}
			local921 = local335[0];
			local1102 = local335[1] << 1;
			for (local927 = 0; local927 < local921; local927++) {
				local950 = local1102 + (this.aByteArray9[local927] & 0xFF);
				if (local950 < 0) {
					local950 = 0;
				}
				if (local950 > 128) {
					local950 = 128;
				}
				this.aByteArray9[local927] = (byte) local950;
			}
			@Pc(1153) int local1153;
			for (local950 = 2; local950 < local335.length; local950 += 2) {
				local956 = local335[local950];
				local1153 = local335[local950 + 1] << 1;
				local976 = (local956 - local921) / 2 + local1102 * (local956 - local921);
				for (local978 = local921; local978 < local956; local978++) {
					local988 = Static607.method8537(local956 - local921, local976);
					@Pc(1188) int local1188 = local988 + (this.aByteArray9[local978] & 0xFF);
					if (local1188 < 0) {
						local1188 = 0;
					}
					if (local1188 > 128) {
						local1188 = 128;
					}
					this.aByteArray9[local978] = (byte) local1188;
					local976 += local1153 - local1102;
				}
				local1102 = local1153;
				local921 = local956;
			}
			for (local1035 = local921; local1035 < 128; local1035++) {
				local1153 = (this.aByteArray9[local1035] & 0xFF) + local1102;
				if (local1153 < 0) {
					local1153 = 0;
				}
				if (local1153 > 128) {
					local1153 = 128;
				}
				this.aByteArray9[local1035] = (byte) local1153;
			}
		}
		for (local815 = 0; local815 < local194; local815++) {
			local248[local815].anInt3101 = local36.method2859();
		}
		for (local856 = 0; local856 < local194; local856++) {
			@Pc(1290) Class109 local1290 = local248[local856];
			if (local1290.aByteArray24 != null) {
				local1290.anInt3095 = local36.method2859();
			}
			if (local1290.aByteArray23 != null) {
				local1290.anInt3096 = local36.method2859();
			}
			if (local1290.anInt3101 > 0) {
				local1290.anInt3104 = local36.method2859();
			}
		}
		for (local1102 = 0; local1102 < local194; local1102++) {
			local248[local1102].anInt3103 = local36.method2859();
		}
		for (local927 = 0; local927 < local194; local927++) {
			@Pc(1345) Class109 local1345 = local248[local927];
			if (local1345.anInt3103 > 0) {
				local1345.anInt3107 = local36.method2859();
			}
		}
		for (local950 = 0; local950 < local194; local950++) {
			@Pc(1365) Class109 local1365 = local248[local950];
			if (local1365.anInt3107 > 0) {
				local1365.anInt3098 = local36.method2859();
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I[I[BLclient!cm;)Z")
	public boolean method1216(@OriginalArg(1) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class58 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class2_Sub14_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray81[local18];
				if (local33 != 0) {
					if (local33 != local14) {
						local14 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg2.method1745(local33 >> 2, arg0);
						} else {
							local16 = arg2.method1743(arg0, local33 >> 2);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass2_Sub14_Sub1Array1[local18] = local16;
						this.anIntArray81[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method1217() {
		this.anIntArray81 = null;
	}
}
