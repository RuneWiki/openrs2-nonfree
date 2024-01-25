import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class6_Sub35 extends Class6 {

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
	public int anInt6262;

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!rp", name = "v", descriptor = "[Lclient!hh;")
	public Class6_Sub17_Sub1[] aClass6_Sub17_Sub1Array1;

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!rp", name = "x", descriptor = "[Lclient!pa;")
	public Class190[] aClass190Array1;

	@OriginalMember(owner = "client!rp", name = "y", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	private Class6_Sub35() {
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "([B)V")
	public Class6_Sub35(@OriginalArg(0) byte[] arg0) {
		this.aByteArray77 = new byte[128];
		this.aClass190Array1 = new Class190[128];
		this.aClass6_Sub17_Sub1Array1 = new Class6_Sub17_Sub1[128];
		this.aByteArray76 = new byte[128];
		this.anIntArray402 = new int[128];
		this.aShortArray93 = new short[128];
		this.aByteArray75 = new byte[128];
		@Pc(36) Class6_Sub1 local36 = new Class6_Sub1(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray96[local36.anInt7898 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method6438();
		}
		local38++;
		local36.anInt7898++;
		@Pc(81) int local81 = local36.anInt7898;
		local36.anInt7898 += local38;
		@Pc(89) int local89;
		for (local89 = 0; local36.aByteArray96[local89 + local36.anInt7898] != 0; local89++) {
		}
		@Pc(103) byte[] local103 = new byte[local89];
		for (@Pc(105) int local105 = 0; local105 < local89; local105++) {
			local103[local105] = local36.method6438();
		}
		local89++;
		local36.anInt7898++;
		@Pc(127) int local127 = local36.anInt7898;
		local36.anInt7898 += local89;
		@Pc(135) int local135;
		for (local135 = 0; local36.aByteArray96[local135 + local36.anInt7898] != 0; local135++) {
		}
		@Pc(152) byte[] local152 = new byte[local135];
		for (@Pc(154) int local154 = 0; local154 < local135; local154++) {
			local152[local154] = local36.method6438();
		}
		local135++;
		local36.anInt7898++;
		@Pc(180) byte[] local180 = new byte[local135];
		@Pc(191) int local191;
		@Pc(193) int local193;
		@Pc(199) int local199;
		if (local135 > 1) {
			local180[1] = 1;
			@Pc(189) int local189 = 1;
			local191 = 2;
			for (local193 = 2; local193 < local135; local193++) {
				local199 = local36.method6433();
				if (local199 == 0) {
					local189 = local191++;
				} else {
					if (local189 >= local199) {
						local199--;
					}
					local189 = local199;
				}
				local180[local193] = (byte) local189;
			}
		} else {
			local191 = local135;
		}
		@Pc(236) Class190[] local236 = new Class190[local191];
		for (local193 = 0; local193 < local236.length; local193++) {
			@Pc(248) Class190 local248 = local236[local193] = new Class190();
			@Pc(252) int local252 = local36.method6433();
			if (local252 > 0) {
				local248.aByteArray65 = new byte[local252 * 2];
			}
			local252 = local36.method6433();
			if (local252 > 0) {
				local248.aByteArray64 = new byte[local252 * 2 + 2];
				local248.aByteArray64[1] = 64;
			}
		}
		local199 = local36.method6433();
		@Pc(307) byte[] local307 = local199 <= 0 ? null : new byte[local199 * 2];
		local199 = local36.method6433();
		@Pc(323) byte[] local323 = local199 <= 0 ? null : new byte[local199 * 2];
		@Pc(325) int local325;
		for (local325 = 0; local36.aByteArray96[local325 + local36.anInt7898] != 0; local325++) {
		}
		@Pc(339) byte[] local339 = new byte[local325];
		for (@Pc(341) int local341 = 0; local341 < local325; local341++) {
			local339[local341] = local36.method6438();
		}
		local36.anInt7898++;
		local325++;
		@Pc(366) int local366 = 0;
		for (@Pc(368) int local368 = 0; local368 < 128; local368++) {
			local366 += local36.method6433();
			this.aShortArray93[local368] = (short) local366;
		}
		local366 = 0;
		for (@Pc(392) int local392 = 0; local392 < 128; local392++) {
			local366 += local36.method6433();
			this.aShortArray93[local392] = (short) (this.aShortArray93[local392] + (local366 << 8));
		}
		@Pc(419) int local419 = 0;
		@Pc(421) int local421 = 0;
		@Pc(423) int local423 = 0;
		for (@Pc(425) int local425 = 0; local425 < 128; local425++) {
			if (local419 == 0) {
				if (local421 < local339.length) {
					local419 = local339[local421++];
				} else {
					local419 = -1;
				}
				local423 = local36.method6460();
			}
			this.aShortArray93[local425] = (short) (this.aShortArray93[local425] + ((local423 - 1 & 0x2) << 14));
			this.anIntArray402[local425] = local423;
			local419--;
		}
		local419 = 0;
		local421 = 0;
		@Pc(479) int local479 = 0;
		for (@Pc(481) int local481 = 0; local481 < 128; local481++) {
			if (this.anIntArray402[local481] != 0) {
				if (local419 == 0) {
					if (local53.length <= local421) {
						local419 = -1;
					} else {
						local419 = local53[local421++];
					}
					local479 = local36.aByteArray96[local81++] - 1;
				}
				local419--;
				this.aByteArray77[local481] = (byte) local479;
			}
		}
		local421 = 0;
		local419 = 0;
		@Pc(528) int local528 = 0;
		for (@Pc(530) int local530 = 0; local530 < 128; local530++) {
			if (this.anIntArray402[local530] != 0) {
				if (local419 == 0) {
					local528 = local36.aByteArray96[local127++] + 16 << 2;
					if (local421 >= local103.length) {
						local419 = -1;
					} else {
						local419 = local103[local421++];
					}
				}
				this.aByteArray75[local530] = (byte) local528;
				local419--;
			}
		}
		local419 = 0;
		local421 = 0;
		@Pc(582) Class190 local582 = null;
		for (@Pc(584) int local584 = 0; local584 < 128; local584++) {
			if (this.anIntArray402[local584] != 0) {
				if (local419 == 0) {
					local582 = local236[local180[local421]];
					if (local152.length <= local421) {
						local419 = -1;
					} else {
						local419 = local152[local421++];
					}
				}
				local419--;
				this.aClass190Array1[local584] = local582;
			}
		}
		local419 = 0;
		local421 = 0;
		@Pc(639) int local639 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local419 == 0) {
				if (local421 >= local339.length) {
					local419 = -1;
				} else {
					local419 = local339[local421++];
				}
				if (this.anIntArray402[local641] > 0) {
					local639 = local36.method6433() + 1;
				}
			}
			this.aByteArray76[local641] = (byte) local639;
			local419--;
		}
		this.anInt6262 = local36.method6433() + 1;
		@Pc(709) int local709;
		for (@Pc(698) int local698 = 0; local698 < local191; local698++) {
			@Pc(704) Class190 local704 = local236[local698];
			if (local704.aByteArray65 != null) {
				for (local709 = 1; local709 < local704.aByteArray65.length; local709 += 2) {
					local704.aByteArray65[local709] = local36.method6438();
				}
			}
			if (local704.aByteArray64 != null) {
				for (local709 = 3; local709 < local704.aByteArray64.length - 2; local709 += 2) {
					local704.aByteArray64[local709] = local36.method6438();
				}
			}
		}
		@Pc(762) int local762;
		if (local307 != null) {
			for (local762 = 1; local762 < local307.length; local762 += 2) {
				local307[local762] = local36.method6438();
			}
		}
		if (local323 != null) {
			for (local762 = 1; local762 < local323.length; local762 += 2) {
				local323[local762] = local36.method6438();
			}
		}
		@Pc(815) int local815;
		for (local762 = 0; local762 < local191; local762++) {
			@Pc(808) Class190 local808 = local236[local762];
			if (local808.aByteArray64 != null) {
				local366 = 0;
				for (local815 = 2; local815 < local808.aByteArray64.length; local815 += 2) {
					local366 += local36.method6433() + 1;
					local808.aByteArray64[local815] = (byte) local366;
				}
			}
		}
		@Pc(860) int local860;
		for (local709 = 0; local709 < local191; local709++) {
			@Pc(853) Class190 local853 = local236[local709];
			if (local853.aByteArray65 != null) {
				local366 = 0;
				for (local860 = 2; local860 < local853.aByteArray65.length; local860 += 2) {
					local366 = local366 + local36.method6433() + 1;
					local853.aByteArray65[local860] = (byte) local366;
				}
			}
		}
		@Pc(934) int local934;
		@Pc(961) int local961;
		@Pc(967) byte local967;
		@Pc(987) int local987;
		@Pc(989) int local989;
		@Pc(998) int local998;
		@Pc(928) byte local928;
		@Pc(1038) int local1038;
		if (local307 != null) {
			local366 = local36.method6433();
			local307[0] = (byte) local366;
			for (local815 = 2; local815 < local307.length; local815 += 2) {
				local366 = local366 + local36.method6433() + 1;
				local307[local815] = (byte) local366;
			}
			local928 = local307[0];
			@Pc(932) byte local932 = local307[1];
			for (local934 = 0; local934 < local928; local934++) {
				this.aByteArray76[local934] = (byte) (this.aByteArray76[local934] * local932 + 32 >> 6);
			}
			for (local961 = 2; local961 < local307.length; local961 += 2) {
				local967 = local307[local961];
				@Pc(973) byte local973 = local307[local961 + 1];
				local987 = (local967 - local928) / 2 + local932 * (local967 - local928);
				for (local989 = local928; local989 < local967; local989++) {
					local998 = Static45.method6532(local967 - local928, local987);
					this.aByteArray76[local989] = (byte) (local998 * this.aByteArray76[local989] + 32 >> 6);
					local987 += local973 - local932;
				}
				local928 = local967;
				local932 = local973;
			}
			for (local1038 = local928; local1038 < 128; local1038++) {
				this.aByteArray76[local1038] = (byte) (local932 * this.aByteArray76[local1038] + 32 >> 6);
			}
		}
		@Pc(1104) int local1104;
		if (local323 != null) {
			local366 = local36.method6433();
			local323[0] = (byte) local366;
			for (local815 = 2; local815 < local323.length; local815 += 2) {
				local366 = local366 + local36.method6433() + 1;
				local323[local815] = (byte) local366;
			}
			local928 = local323[0];
			local1104 = local323[1] << 1;
			for (local934 = 0; local934 < local928; local934++) {
				local961 = (this.aByteArray75[local934] & 0xFF) + local1104;
				if (local961 < 0) {
					local961 = 0;
				}
				if (local961 > 128) {
					local961 = 128;
				}
				this.aByteArray75[local934] = (byte) local961;
			}
			local961 = 2;
			@Pc(1156) int local1156;
			while (local323.length > local961) {
				local967 = local323[local961];
				local1156 = local323[local961 + 1] << 1;
				local987 = local1104 * (local967 - local928) + (local967 - local928) / 2;
				for (local989 = local928; local989 < local967; local989++) {
					local998 = Static45.method6532(local967 - local928, local987);
					@Pc(1192) int local1192 = (this.aByteArray75[local989] & 0xFF) + local998;
					if (local1192 < 0) {
						local1192 = 0;
					}
					if (local1192 > 128) {
						local1192 = 128;
					}
					this.aByteArray75[local989] = (byte) local1192;
					local987 += local1156 - local1104;
				}
				local961 += 2;
				local1104 = local1156;
				local928 = local967;
			}
			for (local1038 = local928; local1038 < 128; local1038++) {
				local1156 = local1104 + (this.aByteArray75[local1038] & 0xFF);
				if (local1156 < 0) {
					local1156 = 0;
				}
				if (local1156 > 128) {
					local1156 = 128;
				}
				this.aByteArray75[local1038] = (byte) local1156;
			}
		}
		for (local815 = 0; local815 < local191; local815++) {
			local236[local815].anInt5280 = local36.method6433();
		}
		for (local860 = 0; local860 < local191; local860++) {
			@Pc(1294) Class190 local1294 = local236[local860];
			if (local1294.aByteArray65 != null) {
				local1294.anInt5273 = local36.method6433();
			}
			if (local1294.aByteArray64 != null) {
				local1294.anInt5272 = local36.method6433();
			}
			if (local1294.anInt5280 > 0) {
				local1294.anInt5276 = local36.method6433();
			}
		}
		for (local1104 = 0; local1104 < local191; local1104++) {
			local236[local1104].anInt5278 = local36.method6433();
		}
		for (local934 = 0; local934 < local191; local934++) {
			@Pc(1349) Class190 local1349 = local236[local934];
			if (local1349.anInt5278 > 0) {
				local1349.anInt5271 = local36.method6433();
			}
		}
		for (local961 = 0; local961 < local191; local961++) {
			@Pc(1369) Class190 local1369 = local236[local961];
			if (local1369.anInt5271 > 0) {
				local1369.anInt5277 = local36.method6433();
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "([ILclient!ii;I[B)Z")
	public boolean method5207(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class6_Sub17_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(31) int local31 = this.anIntArray402[local13];
				if (local31 != 0) {
					if (local31 != local9) {
						local9 = local31--;
						if ((local31 & 0x1) == 0) {
							local11 = arg1.method2804(arg0, local31 >> 2);
						} else {
							local11 = arg1.method2809(arg0, local31 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass6_Sub17_Sub1Array1[local13] = local11;
						this.anIntArray402[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(Z)V")
	public void method5208() {
		this.anIntArray402 = null;
	}
}
