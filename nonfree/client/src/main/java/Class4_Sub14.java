import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public int anInt2620;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "[Lclient!fc;")
	public Class4_Sub16_Sub1[] aClass4_Sub16_Sub1Array1;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[Lclient!gw;")
	public Class132[] aClass132Array1;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class4_Sub14() {
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V")
	public Class4_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray33 = new byte[128];
		this.anIntArray243 = new int[128];
		this.aByteArray34 = new byte[128];
		this.aClass4_Sub16_Sub1Array1 = new Class4_Sub16_Sub1[128];
		this.aClass132Array1 = new Class132[128];
		this.aByteArray32 = new byte[128];
		this.aShortArray54 = new short[128];
		@Pc(36) Class4_Sub9 local36 = new Class4_Sub9(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray97[local38 + local36.anInt7219] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method6021();
		}
		local36.anInt7219++;
		local38++;
		@Pc(80) int local80 = local36.anInt7219;
		local36.anInt7219 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray97[local88 + local36.anInt7219] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method6021();
		}
		local88++;
		local36.anInt7219++;
		@Pc(133) int local133 = local36.anInt7219;
		local36.anInt7219 += local88;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray97[local36.anInt7219 + local141] != 0; local141++) {
		}
		@Pc(155) byte[] local155 = new byte[local141];
		for (@Pc(157) int local157 = 0; local157 < local141; local157++) {
			local155[local157] = local36.method6021();
		}
		local36.anInt7219++;
		local141++;
		@Pc(179) byte[] local179 = new byte[local141];
		@Pc(190) int local190;
		@Pc(192) int local192;
		@Pc(198) int local198;
		if (local141 > 1) {
			local179[1] = 1;
			@Pc(188) int local188 = 1;
			local190 = 2;
			for (local192 = 2; local192 < local141; local192++) {
				local198 = local36.method6015();
				if (local198 == 0) {
					local188 = local190++;
				} else {
					if (local198 <= local188) {
						local198--;
					}
					local188 = local198;
				}
				local179[local192] = (byte) local188;
			}
		} else {
			local190 = local141;
		}
		@Pc(227) Class132[] local227 = new Class132[local190];
		for (local192 = 0; local192 < local227.length; local192++) {
			@Pc(239) Class132 local239 = local227[local192] = new Class132();
			@Pc(243) int local243 = local36.method6015();
			if (local243 > 0) {
				local239.aByteArray44 = new byte[local243 * 2];
			}
			local243 = local36.method6015();
			if (local243 > 0) {
				local239.aByteArray45 = new byte[local243 * 2 + 2];
				local239.aByteArray45[1] = 64;
			}
		}
		local198 = local36.method6015();
		@Pc(291) byte[] local291 = local198 <= 0 ? null : new byte[local198 * 2];
		local198 = local36.method6015();
		@Pc(304) byte[] local304 = local198 <= 0 ? null : new byte[local198 * 2];
		@Pc(306) int local306;
		for (local306 = 0; local36.aByteArray97[local36.anInt7219 + local306] != 0; local306++) {
		}
		@Pc(320) byte[] local320 = new byte[local306];
		for (@Pc(322) int local322 = 0; local322 < local306; local322++) {
			local320[local322] = local36.method6021();
		}
		local36.anInt7219++;
		local306++;
		@Pc(343) int local343 = 0;
		for (@Pc(345) int local345 = 0; local345 < 128; local345++) {
			local343 += local36.method6015();
			this.aShortArray54[local345] = (short) local343;
		}
		local343 = 0;
		for (@Pc(367) int local367 = 0; local367 < 128; local367++) {
			local343 += local36.method6015();
			this.aShortArray54[local367] = (short) (this.aShortArray54[local367] + (local343 << 8));
		}
		@Pc(394) int local394 = 0;
		@Pc(396) int local396 = 0;
		@Pc(398) int local398 = 0;
		for (@Pc(400) int local400 = 0; local400 < 128; local400++) {
			if (local394 == 0) {
				if (local396 >= local320.length) {
					local394 = -1;
				} else {
					local394 = local320[local396++];
				}
				local398 = local36.method5969();
			}
			this.aShortArray54[local400] = (short) (this.aShortArray54[local400] + ((local398 - 1 & 0x2) << 14));
			this.anIntArray243[local400] = local398;
			local394--;
		}
		local394 = 0;
		local396 = 0;
		@Pc(457) int local457 = 0;
		for (@Pc(459) int local459 = 0; local459 < 128; local459++) {
			if (this.anIntArray243[local459] != 0) {
				if (local394 == 0) {
					local457 = local36.aByteArray97[local80++] - 1;
					if (local52.length > local396) {
						local394 = local52[local396++];
					} else {
						local394 = -1;
					}
				}
				this.aByteArray33[local459] = (byte) local457;
				local394--;
			}
		}
		local396 = 0;
		local394 = 0;
		@Pc(516) int local516 = 0;
		for (@Pc(518) int local518 = 0; local518 < 128; local518++) {
			if (this.anIntArray243[local518] != 0) {
				if (local394 == 0) {
					local516 = local36.aByteArray97[local133++] + 16 << 2;
					if (local105.length <= local396) {
						local394 = -1;
					} else {
						local394 = local105[local396++];
					}
				}
				local394--;
				this.aByteArray32[local518] = (byte) local516;
			}
		}
		local396 = 0;
		local394 = 0;
		@Pc(567) Class132 local567 = null;
		for (@Pc(569) int local569 = 0; local569 < 128; local569++) {
			if (this.anIntArray243[local569] != 0) {
				if (local394 == 0) {
					local567 = local227[local179[local396]];
					if (local396 >= local155.length) {
						local394 = -1;
					} else {
						local394 = local155[local396++];
					}
				}
				this.aClass132Array1[local569] = local567;
				local394--;
			}
		}
		local394 = 0;
		local396 = 0;
		@Pc(617) int local617 = 0;
		for (@Pc(619) int local619 = 0; local619 < 128; local619++) {
			if (local394 == 0) {
				if (local320.length > local396) {
					local394 = local320[local396++];
				} else {
					local394 = -1;
				}
				if (this.anIntArray243[local619] > 0) {
					local617 = local36.method6015() + 1;
				}
			}
			this.aByteArray34[local619] = (byte) local617;
			local394--;
		}
		this.anInt2620 = local36.method6015() + 1;
		@Pc(686) int local686;
		for (@Pc(675) int local675 = 0; local675 < local190; local675++) {
			@Pc(681) Class132 local681 = local227[local675];
			if (local681.aByteArray44 != null) {
				for (local686 = 1; local686 < local681.aByteArray44.length; local686 += 2) {
					local681.aByteArray44[local686] = local36.method6021();
				}
			}
			if (local681.aByteArray45 != null) {
				for (local686 = 3; local686 < local681.aByteArray45.length - 2; local686 += 2) {
					local681.aByteArray45[local686] = local36.method6021();
				}
			}
		}
		@Pc(739) int local739;
		if (local291 != null) {
			for (local739 = 1; local739 < local291.length; local739 += 2) {
				local291[local739] = local36.method6021();
			}
		}
		if (local304 != null) {
			for (local739 = 1; local739 < local304.length; local739 += 2) {
				local304[local739] = local36.method6021();
			}
		}
		@Pc(792) int local792;
		for (local739 = 0; local739 < local190; local739++) {
			@Pc(785) Class132 local785 = local227[local739];
			if (local785.aByteArray45 != null) {
				local343 = 0;
				for (local792 = 2; local792 < local785.aByteArray45.length; local792 += 2) {
					local343 += local36.method6015() + 1;
					local785.aByteArray45[local792] = (byte) local343;
				}
			}
		}
		@Pc(837) int local837;
		for (local686 = 0; local686 < local190; local686++) {
			@Pc(830) Class132 local830 = local227[local686];
			if (local830.aByteArray44 != null) {
				local343 = 0;
				for (local837 = 2; local837 < local830.aByteArray44.length; local837 += 2) {
					local343 = local36.method6015() + local343 + 1;
					local830.aByteArray44[local837] = (byte) local343;
				}
			}
		}
		@Pc(910) int local910;
		@Pc(933) int local933;
		@Pc(939) byte local939;
		@Pc(959) int local959;
		@Pc(961) int local961;
		@Pc(971) int local971;
		@Pc(904) byte local904;
		@Pc(1009) int local1009;
		if (local291 != null) {
			local343 = local36.method6015();
			local291[0] = (byte) local343;
			for (local792 = 2; local792 < local291.length; local792 += 2) {
				local343 = local343 + local36.method6015() + 1;
				local291[local792] = (byte) local343;
			}
			local904 = local291[0];
			@Pc(908) byte local908 = local291[1];
			for (local910 = 0; local910 < local904; local910++) {
				this.aByteArray34[local910] = (byte) (this.aByteArray34[local910] * local908 + 32 >> 6);
			}
			local933 = 2;
			while (local291.length > local933) {
				local939 = local291[local933];
				@Pc(945) byte local945 = local291[local933 + 1];
				local959 = (local939 - local904) / 2 + (local939 - local904) * local908;
				for (local961 = local904; local961 < local939; local961++) {
					local971 = Static256.method4267(local939 - local904, local959);
					this.aByteArray34[local961] = (byte) (this.aByteArray34[local961] * local971 + 32 >> 6);
					local959 += local945 - local908;
				}
				local904 = local939;
				local933 += 2;
				local908 = local945;
			}
			for (local1009 = local904; local1009 < 128; local1009++) {
				this.aByteArray34[local1009] = (byte) (local908 * this.aByteArray34[local1009] + 32 >> 6);
			}
		}
		@Pc(1077) int local1077;
		if (local304 != null) {
			local343 = local36.method6015();
			local304[0] = (byte) local343;
			for (local792 = 2; local792 < local304.length; local792 += 2) {
				local343 += local36.method6015() + 1;
				local304[local792] = (byte) local343;
			}
			local904 = local304[0];
			local1077 = local304[1] << 1;
			for (local910 = 0; local910 < local904; local910++) {
				local933 = local1077 + (this.aByteArray32[local910] & 0xFF);
				if (local933 < 0) {
					local933 = 0;
				}
				if (local933 > 128) {
					local933 = 128;
				}
				this.aByteArray32[local910] = (byte) local933;
			}
			local933 = 2;
			@Pc(1127) int local1127;
			while (local304.length > local933) {
				local939 = local304[local933];
				local1127 = local304[local933 + 1] << 1;
				local959 = local1077 * (local939 - local904) + (local939 - local904) / 2;
				for (local961 = local904; local961 < local939; local961++) {
					local971 = Static256.method4267(local939 - local904, local959);
					@Pc(1164) int local1164 = (this.aByteArray32[local961] & 0xFF) + local971;
					if (local1164 < 0) {
						local1164 = 0;
					}
					if (local1164 > 128) {
						local1164 = 128;
					}
					local959 += local1127 - local1077;
					this.aByteArray32[local961] = (byte) local1164;
				}
				local933 += 2;
				local904 = local939;
				local1077 = local1127;
			}
			for (local1009 = local904; local1009 < 128; local1009++) {
				local1127 = local1077 + (this.aByteArray32[local1009] & 0xFF);
				if (local1127 < 0) {
					local1127 = 0;
				}
				if (local1127 > 128) {
					local1127 = 128;
				}
				this.aByteArray32[local1009] = (byte) local1127;
			}
		}
		for (local792 = 0; local792 < local190; local792++) {
			local227[local792].anInt3830 = local36.method6015();
		}
		for (local837 = 0; local837 < local190; local837++) {
			@Pc(1270) Class132 local1270 = local227[local837];
			if (local1270.aByteArray44 != null) {
				local1270.anInt3836 = local36.method6015();
			}
			if (local1270.aByteArray45 != null) {
				local1270.anInt3835 = local36.method6015();
			}
			if (local1270.anInt3830 > 0) {
				local1270.anInt3833 = local36.method6015();
			}
		}
		for (local1077 = 0; local1077 < local190; local1077++) {
			local227[local1077].anInt3831 = local36.method6015();
		}
		for (local910 = 0; local910 < local190; local910++) {
			@Pc(1325) Class132 local1325 = local227[local910];
			if (local1325.anInt3831 > 0) {
				local1325.anInt3837 = local36.method6015();
			}
		}
		for (local933 = 0; local933 < local190; local933++) {
			@Pc(1349) Class132 local1349 = local227[local933];
			if (local1349.anInt3837 > 0) {
				local1349.anInt3834 = local36.method6015();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([IBLclient!ns;[B)Z")
	public boolean method2334(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class246 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class4_Sub16_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray243[local18];
				if (local30 != 0) {
					if (local14 != local30) {
						local14 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg1.method5449(local30 >> 2, arg0);
						} else {
							local16 = arg1.method5453(arg0, local30 >> 2);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass4_Sub16_Sub1Array1[local18] = local16;
						this.anIntArray243[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public void method2335() {
		this.anIntArray243 = null;
	}
}
