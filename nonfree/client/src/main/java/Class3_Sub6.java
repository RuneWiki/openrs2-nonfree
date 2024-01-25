import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "[Lclient!ma;")
	public Class3_Sub12_Sub1[] aClass3_Sub12_Sub1Array1;

	@OriginalMember(owner = "client!bea", name = "n", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!bea", name = "p", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!bea", name = "q", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!bea", name = "t", descriptor = "[Lclient!od;")
	public Class242[] aClass242Array1;

	@OriginalMember(owner = "client!bea", name = "u", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!bea", name = "x", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!bea", name = "y", descriptor = "I")
	public int anInt630;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "()V")
	private Class3_Sub6() {
	}

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "([B)V")
	public Class3_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray4 = new byte[128];
		this.aByteArray6 = new byte[128];
		this.aByteArray5 = new byte[128];
		this.aClass242Array1 = new Class242[128];
		this.aShortArray7 = new short[128];
		this.anIntArray37 = new int[128];
		this.aClass3_Sub12_Sub1Array1 = new Class3_Sub12_Sub1[128];
		@Pc(36) Class3_Sub15 local36 = new Class3_Sub15(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray106[local38 + local36.anInt10282] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method8440();
		}
		local36.anInt10282++;
		local38++;
		@Pc(76) int local76 = local36.anInt10282;
		local36.anInt10282 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray106[local84 + local36.anInt10282] != 0; local84++) {
		}
		@Pc(98) byte[] local98 = new byte[local84];
		for (@Pc(100) int local100 = 0; local100 < local84; local100++) {
			local98[local100] = local36.method8440();
		}
		local36.anInt10282++;
		local84++;
		@Pc(126) int local126 = local36.anInt10282;
		local36.anInt10282 += local84;
		@Pc(134) int local134;
		for (local134 = 0; local36.aByteArray106[local134 + local36.anInt10282] != 0; local134++) {
		}
		@Pc(148) byte[] local148 = new byte[local134];
		for (@Pc(150) int local150 = 0; local150 < local134; local150++) {
			local148[local150] = local36.method8440();
		}
		local134++;
		local36.anInt10282++;
		@Pc(176) byte[] local176 = new byte[local134];
		@Pc(187) int local187;
		@Pc(189) int local189;
		@Pc(195) int local195;
		if (local134 > 1) {
			local176[1] = 1;
			@Pc(185) int local185 = 1;
			local187 = 2;
			for (local189 = 2; local189 < local134; local189++) {
				local195 = local36.method8401();
				if (local195 == 0) {
					local185 = local187++;
				} else {
					if (local185 >= local195) {
						local195--;
					}
					local185 = local195;
				}
				local176[local189] = (byte) local185;
			}
		} else {
			local187 = local134;
		}
		@Pc(227) Class242[] local227 = new Class242[local187];
		for (local189 = 0; local189 < local227.length; local189++) {
			@Pc(239) Class242 local239 = local227[local189] = new Class242();
			@Pc(243) int local243 = local36.method8401();
			if (local243 > 0) {
				local239.aByteArray78 = new byte[local243 * 2];
			}
			local243 = local36.method8401();
			if (local243 > 0) {
				local239.aByteArray79 = new byte[local243 * 2 + 2];
				local239.aByteArray79[1] = 64;
			}
		}
		local195 = local36.method8401();
		@Pc(295) byte[] local295 = local195 > 0 ? new byte[local195 * 2] : null;
		local195 = local36.method8401();
		@Pc(308) byte[] local308 = local195 <= 0 ? null : new byte[local195 * 2];
		@Pc(310) int local310;
		for (local310 = 0; local36.aByteArray106[local36.anInt10282 + local310] != 0; local310++) {
		}
		@Pc(328) byte[] local328 = new byte[local310];
		for (@Pc(330) int local330 = 0; local330 < local310; local330++) {
			local328[local330] = local36.method8440();
		}
		local310++;
		local36.anInt10282++;
		@Pc(351) int local351 = 0;
		for (@Pc(353) int local353 = 0; local353 < 128; local353++) {
			local351 += local36.method8401();
			this.aShortArray7[local353] = (short) local351;
		}
		local351 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local351 += local36.method8401();
			this.aShortArray7[local377] = (short) (this.aShortArray7[local377] + (local351 << 8));
		}
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		for (@Pc(410) int local410 = 0; local410 < 128; local410++) {
			if (local404 == 0) {
				if (local328.length > local406) {
					local404 = local328[local406++];
				} else {
					local404 = -1;
				}
				local408 = local36.method8427();
			}
			this.aShortArray7[local410] = (short) (this.aShortArray7[local410] + ((local408 - 1 & 0x2) << 14));
			this.anIntArray37[local410] = local408;
			local404--;
		}
		local404 = 0;
		local406 = 0;
		@Pc(468) int local468 = 0;
		for (@Pc(470) int local470 = 0; local470 < 128; local470++) {
			if (this.anIntArray37[local470] != 0) {
				if (local404 == 0) {
					if (local52.length <= local406) {
						local404 = -1;
					} else {
						local404 = local52[local406++];
					}
					local468 = local36.aByteArray106[local76++] - 1;
				}
				local404--;
				this.aByteArray6[local470] = (byte) local468;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(524) int local524 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray37[local526] != 0) {
				if (local404 == 0) {
					if (local98.length <= local406) {
						local404 = -1;
					} else {
						local404 = local98[local406++];
					}
					local524 = local36.aByteArray106[local126++] + 16 << 2;
				}
				local404--;
				this.aByteArray4[local526] = (byte) local524;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(578) Class242 local578 = null;
		for (@Pc(580) int local580 = 0; local580 < 128; local580++) {
			if (this.anIntArray37[local580] != 0) {
				if (local404 == 0) {
					local578 = local227[local176[local406]];
					if (local148.length > local406) {
						local404 = local148[local406++];
					} else {
						local404 = -1;
					}
				}
				local404--;
				this.aClass242Array1[local580] = local578;
			}
		}
		local404 = 0;
		local406 = 0;
		@Pc(628) int local628 = 0;
		for (@Pc(630) int local630 = 0; local630 < 128; local630++) {
			if (local404 == 0) {
				if (local328.length > local406) {
					local404 = local328[local406++];
				} else {
					local404 = -1;
				}
				if (this.anIntArray37[local630] > 0) {
					local628 = local36.method8401() + 1;
				}
			}
			local404--;
			this.aByteArray5[local630] = (byte) local628;
		}
		this.anInt630 = local36.method8401() + 1;
		@Pc(698) int local698;
		for (@Pc(687) int local687 = 0; local687 < local187; local687++) {
			@Pc(693) Class242 local693 = local227[local687];
			if (local693.aByteArray78 != null) {
				for (local698 = 1; local698 < local693.aByteArray78.length; local698 += 2) {
					local693.aByteArray78[local698] = local36.method8440();
				}
			}
			if (local693.aByteArray79 != null) {
				for (local698 = 3; local698 < local693.aByteArray79.length - 2; local698 += 2) {
					local693.aByteArray79[local698] = local36.method8440();
				}
			}
		}
		@Pc(751) int local751;
		if (local295 != null) {
			for (local751 = 1; local751 < local295.length; local751 += 2) {
				local295[local751] = local36.method8440();
			}
		}
		if (local308 != null) {
			for (local751 = 1; local751 < local308.length; local751 += 2) {
				local308[local751] = local36.method8440();
			}
		}
		@Pc(796) int local796;
		for (local751 = 0; local751 < local187; local751++) {
			@Pc(789) Class242 local789 = local227[local751];
			if (local789.aByteArray79 != null) {
				local351 = 0;
				for (local796 = 2; local796 < local789.aByteArray79.length; local796 += 2) {
					local351 = local36.method8401() + local351 + 1;
					local789.aByteArray79[local796] = (byte) local351;
				}
			}
		}
		@Pc(841) int local841;
		for (local698 = 0; local698 < local187; local698++) {
			@Pc(834) Class242 local834 = local227[local698];
			if (local834.aByteArray78 != null) {
				local351 = 0;
				for (local841 = 2; local841 < local834.aByteArray78.length; local841 += 2) {
					local351 = local36.method8401() + local351 + 1;
					local834.aByteArray78[local841] = (byte) local351;
				}
			}
		}
		@Pc(918) int local918;
		@Pc(945) int local945;
		@Pc(951) byte local951;
		@Pc(971) int local971;
		@Pc(973) int local973;
		@Pc(983) int local983;
		@Pc(912) byte local912;
		@Pc(1028) int local1028;
		if (local295 != null) {
			local351 = local36.method8401();
			local295[0] = (byte) local351;
			for (local796 = 2; local796 < local295.length; local796 += 2) {
				local351 = local36.method8401() + local351 + 1;
				local295[local796] = (byte) local351;
			}
			local912 = local295[0];
			@Pc(916) byte local916 = local295[1];
			for (local918 = 0; local918 < local912; local918++) {
				this.aByteArray5[local918] = (byte) (local916 * this.aByteArray5[local918] + 32 >> 6);
			}
			local945 = 2;
			while (local295.length > local945) {
				local951 = local295[local945];
				@Pc(957) byte local957 = local295[local945 + 1];
				local971 = (local951 - local912) * local916 + (local951 - local912) / 2;
				for (local973 = local912; local973 < local951; local973++) {
					local983 = Static634.method8589(local971, local951 - local912);
					this.aByteArray5[local973] = (byte) (local983 * this.aByteArray5[local973] + 32 >> 6);
					local971 += local957 - local916;
				}
				local945 += 2;
				local912 = local951;
				local916 = local957;
			}
			for (local1028 = local912; local1028 < 128; local1028++) {
				this.aByteArray5[local1028] = (byte) (local916 * this.aByteArray5[local1028] + 32 >> 6);
			}
		}
		@Pc(1100) int local1100;
		if (local308 != null) {
			local351 = local36.method8401();
			local308[0] = (byte) local351;
			for (local796 = 2; local796 < local308.length; local796 += 2) {
				local351 += local36.method8401() + 1;
				local308[local796] = (byte) local351;
			}
			local912 = local308[0];
			local1100 = local308[1] << 1;
			for (local918 = 0; local918 < local912; local918++) {
				local945 = (this.aByteArray4[local918] & 0xFF) + local1100;
				if (local945 < 0) {
					local945 = 0;
				}
				if (local945 > 128) {
					local945 = 128;
				}
				this.aByteArray4[local918] = (byte) local945;
			}
			@Pc(1151) int local1151;
			for (local945 = 2; local945 < local308.length; local945 += 2) {
				local951 = local308[local945];
				local1151 = local308[local945 + 1] << 1;
				local971 = (local951 - local912) / 2 + (local951 - local912) * local1100;
				for (local973 = local912; local973 < local951; local973++) {
					local983 = Static634.method8589(local971, local951 - local912);
					@Pc(1185) int local1185 = (this.aByteArray4[local973] & 0xFF) + local983;
					if (local1185 < 0) {
						local1185 = 0;
					}
					if (local1185 > 128) {
						local1185 = 128;
					}
					this.aByteArray4[local973] = (byte) local1185;
					local971 += local1151 - local1100;
				}
				local912 = local951;
				local1100 = local1151;
			}
			for (local1028 = local912; local1028 < 128; local1028++) {
				local1151 = (this.aByteArray4[local1028] & 0xFF) + local1100;
				if (local1151 < 0) {
					local1151 = 0;
				}
				if (local1151 > 128) {
					local1151 = 128;
				}
				this.aByteArray4[local1028] = (byte) local1151;
			}
		}
		for (local796 = 0; local796 < local187; local796++) {
			local227[local796].anInt7555 = local36.method8401();
		}
		for (local841 = 0; local841 < local187; local841++) {
			@Pc(1291) Class242 local1291 = local227[local841];
			if (local1291.aByteArray78 != null) {
				local1291.anInt7552 = local36.method8401();
			}
			if (local1291.aByteArray79 != null) {
				local1291.anInt7546 = local36.method8401();
			}
			if (local1291.anInt7555 > 0) {
				local1291.anInt7551 = local36.method8401();
			}
		}
		for (local1100 = 0; local1100 < local187; local1100++) {
			local227[local1100].anInt7548 = local36.method8401();
		}
		for (local918 = 0; local918 < local187; local918++) {
			@Pc(1349) Class242 local1349 = local227[local918];
			if (local1349.anInt7548 > 0) {
				local1349.anInt7554 = local36.method8401();
			}
		}
		for (local945 = 0; local945 < local187; local945++) {
			@Pc(1376) Class242 local1376 = local227[local945];
			if (local1376.anInt7554 > 0) {
				local1376.anInt7549 = local36.method8401();
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([IZLclient!dd;[B)Z")
	public boolean method621(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class58 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub12_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray37[local13];
				if (local28 != 0) {
					if (local28 != local9) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg1.method2251(local28 >> 2, arg0);
						} else {
							local11 = arg1.method2246(local28 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub12_Sub1Array1[local13] = local11;
						this.anIntArray37[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	public void method623() {
		this.anIntArray37 = null;
	}
}
