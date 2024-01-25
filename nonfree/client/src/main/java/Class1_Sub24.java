import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "[I")
	private int[] anIntArray288;

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "[Lclient!mr;")
	public Class168[] aClass168Array1;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "[Lclient!bv;")
	public Class1_Sub6_Sub1[] aClass1_Sub6_Sub1Array1;

	@OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
	public int anInt3483;

	static {
		new Class96("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	private Class1_Sub24() {
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([B)V")
	public Class1_Sub24(@OriginalArg(0) byte[] arg0) {
		this.anIntArray288 = new int[128];
		this.aShortArray55 = new short[128];
		this.aByteArray38 = new byte[128];
		this.aByteArray39 = new byte[128];
		this.aClass1_Sub6_Sub1Array1 = new Class1_Sub6_Sub1[128];
		this.aClass168Array1 = new Class168[128];
		this.aByteArray37 = new byte[128];
		@Pc(36) Class1_Sub14 local36 = new Class1_Sub14(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray65[local38 + local36.anInt5695] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method4529();
		}
		local38++;
		local36.anInt5695++;
		@Pc(80) int local80 = local36.anInt5695;
		local36.anInt5695 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray65[local88 + local36.anInt5695] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = local36.method4529();
		}
		local88++;
		local36.anInt5695++;
		@Pc(130) int local130 = local36.anInt5695;
		local36.anInt5695 += local88;
		@Pc(138) int local138;
		for (local138 = 0; local36.aByteArray65[local138 + local36.anInt5695] != 0; local138++) {
		}
		@Pc(155) byte[] local155 = new byte[local138];
		for (@Pc(157) int local157 = 0; local157 < local138; local157++) {
			local155[local157] = local36.method4529();
		}
		local138++;
		local36.anInt5695++;
		@Pc(179) byte[] local179 = new byte[local138];
		@Pc(188) int local188;
		@Pc(192) int local192;
		@Pc(198) int local198;
		if (local138 > 1) {
			local179[1] = 1;
			local188 = 2;
			@Pc(190) int local190 = 1;
			for (local192 = 2; local192 < local138; local192++) {
				local198 = local36.method4548();
				if (local198 == 0) {
					local190 = local188++;
				} else {
					if (local190 >= local198) {
						local198--;
					}
					local190 = local198;
				}
				local179[local192] = (byte) local190;
			}
		} else {
			local188 = local138;
		}
		@Pc(238) Class168[] local238 = new Class168[local188];
		for (local192 = 0; local192 < local238.length; local192++) {
			@Pc(250) Class168 local250 = local238[local192] = new Class168();
			@Pc(254) int local254 = local36.method4548();
			if (local254 > 0) {
				local250.aByteArray51 = new byte[local254 * 2];
			}
			local254 = local36.method4548();
			if (local254 > 0) {
				local250.aByteArray50 = new byte[local254 * 2 + 2];
				local250.aByteArray50[1] = 64;
			}
		}
		local198 = local36.method4548();
		@Pc(299) byte[] local299 = local198 <= 0 ? null : new byte[local198 * 2];
		local198 = local36.method4548();
		@Pc(315) byte[] local315 = local198 > 0 ? new byte[local198 * 2] : null;
		@Pc(317) int local317;
		for (local317 = 0; local36.aByteArray65[local317 + local36.anInt5695] != 0; local317++) {
		}
		@Pc(334) byte[] local334 = new byte[local317];
		for (@Pc(336) int local336 = 0; local336 < local317; local336++) {
			local334[local336] = local36.method4529();
		}
		local36.anInt5695++;
		local317++;
		@Pc(357) int local357 = 0;
		for (@Pc(359) int local359 = 0; local359 < 128; local359++) {
			local357 += local36.method4548();
			this.aShortArray55[local359] = (short) local357;
		}
		local357 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local357 += local36.method4548();
			this.aShortArray55[local381] = (short) (this.aShortArray55[local381] + (local357 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local408 == 0) {
				if (local410 >= local334.length) {
					local408 = -1;
				} else {
					local408 = local334[local410++];
				}
				local412 = local36.method4541();
			}
			this.aShortArray55[local414] = (short) (this.aShortArray55[local414] + ((local412 - 1 & 0x2) << 14));
			local408--;
			this.anIntArray288[local414] = local412;
		}
		local408 = 0;
		local410 = 0;
		@Pc(468) int local468 = 0;
		for (@Pc(470) int local470 = 0; local470 < 128; local470++) {
			if (this.anIntArray288[local470] != 0) {
				if (local408 == 0) {
					if (local410 >= local52.length) {
						local408 = -1;
					} else {
						local408 = local52[local410++];
					}
					local468 = local36.aByteArray65[local80++] - 1;
				}
				this.aByteArray37[local470] = (byte) local468;
				local408--;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(527) int local527 = 0;
		for (@Pc(529) int local529 = 0; local529 < 128; local529++) {
			if (this.anIntArray288[local529] != 0) {
				if (local408 == 0) {
					local527 = local36.aByteArray65[local130++] + 16 << 2;
					if (local102.length > local410) {
						local408 = local102[local410++];
					} else {
						local408 = -1;
					}
				}
				local408--;
				this.aByteArray38[local529] = (byte) local527;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(583) Class168 local583 = null;
		for (@Pc(585) int local585 = 0; local585 < 128; local585++) {
			if (this.anIntArray288[local585] != 0) {
				if (local408 == 0) {
					local583 = local238[local179[local410]];
					if (local155.length <= local410) {
						local408 = -1;
					} else {
						local408 = local155[local410++];
					}
				}
				local408--;
				this.aClass168Array1[local585] = local583;
			}
		}
		local410 = 0;
		local408 = 0;
		@Pc(633) int local633 = 0;
		for (@Pc(635) int local635 = 0; local635 < 128; local635++) {
			if (local408 == 0) {
				if (local334.length > local410) {
					local408 = local334[local410++];
				} else {
					local408 = -1;
				}
				if (this.anIntArray288[local635] > 0) {
					local633 = local36.method4548() + 1;
				}
			}
			local408--;
			this.aByteArray39[local635] = (byte) local633;
		}
		this.anInt3483 = local36.method4548() + 1;
		@Pc(704) int local704;
		for (@Pc(693) int local693 = 0; local693 < local188; local693++) {
			@Pc(699) Class168 local699 = local238[local693];
			if (local699.aByteArray51 != null) {
				for (local704 = 1; local704 < local699.aByteArray51.length; local704 += 2) {
					local699.aByteArray51[local704] = local36.method4529();
				}
			}
			if (local699.aByteArray50 != null) {
				for (local704 = 3; local704 < local699.aByteArray50.length - 2; local704 += 2) {
					local699.aByteArray50[local704] = local36.method4529();
				}
			}
		}
		@Pc(761) int local761;
		if (local299 != null) {
			for (local761 = 1; local761 < local299.length; local761 += 2) {
				local299[local761] = local36.method4529();
			}
		}
		if (local315 != null) {
			for (local761 = 1; local761 < local315.length; local761 += 2) {
				local315[local761] = local36.method4529();
			}
		}
		@Pc(810) int local810;
		for (local761 = 0; local761 < local188; local761++) {
			@Pc(803) Class168 local803 = local238[local761];
			if (local803.aByteArray50 != null) {
				local357 = 0;
				for (local810 = 2; local810 < local803.aByteArray50.length; local810 += 2) {
					local357 = local357 + local36.method4548() + 1;
					local803.aByteArray50[local810] = (byte) local357;
				}
			}
		}
		@Pc(852) int local852;
		for (local704 = 0; local704 < local188; local704++) {
			@Pc(845) Class168 local845 = local238[local704];
			if (local845.aByteArray51 != null) {
				local357 = 0;
				for (local852 = 2; local852 < local845.aByteArray51.length; local852 += 2) {
					local357 = local357 + local36.method4548() + 1;
					local845.aByteArray51[local852] = (byte) local357;
				}
			}
		}
		@Pc(930) int local930;
		@Pc(957) int local957;
		@Pc(963) byte local963;
		@Pc(983) int local983;
		@Pc(985) int local985;
		@Pc(994) int local994;
		@Pc(924) byte local924;
		@Pc(1039) int local1039;
		if (local299 != null) {
			local357 = local36.method4548();
			local299[0] = (byte) local357;
			for (local810 = 2; local810 < local299.length; local810 += 2) {
				local357 -= -local36.method4548() - 1;
				local299[local810] = (byte) local357;
			}
			local924 = local299[0];
			@Pc(928) byte local928 = local299[1];
			for (local930 = 0; local930 < local924; local930++) {
				this.aByteArray39[local930] = (byte) (local928 * this.aByteArray39[local930] + 32 >> 6);
			}
			local957 = 2;
			while (local957 < local299.length) {
				local963 = local299[local957];
				@Pc(969) byte local969 = local299[local957 + 1];
				local983 = (local963 - local924) * local928 + (local963 - local924) / 2;
				for (local985 = local924; local985 < local963; local985++) {
					local994 = Static301.method4108(local983, local963 - local924);
					local983 += local969 - local928;
					this.aByteArray39[local985] = (byte) (this.aByteArray39[local985] * local994 + 32 >> 6);
				}
				local957 += 2;
				local928 = local969;
				local924 = local963;
			}
			for (local1039 = local924; local1039 < 128; local1039++) {
				this.aByteArray39[local1039] = (byte) (local928 * this.aByteArray39[local1039] + 32 >> 6);
			}
		}
		@Pc(1111) int local1111;
		if (local315 != null) {
			local357 = local36.method4548();
			local315[0] = (byte) local357;
			for (local810 = 2; local810 < local315.length; local810 += 2) {
				local357 = local36.method4548() + local357 + 1;
				local315[local810] = (byte) local357;
			}
			local924 = local315[0];
			local1111 = local315[1] << 1;
			for (local930 = 0; local930 < local924; local930++) {
				local957 = local1111 + (this.aByteArray38[local930] & 0xFF);
				if (local957 < 0) {
					local957 = 0;
				}
				if (local957 > 128) {
					local957 = 128;
				}
				this.aByteArray38[local930] = (byte) local957;
			}
			@Pc(1163) int local1163;
			for (local957 = 2; local957 < local315.length; local957 += 2) {
				local963 = local315[local957];
				local1163 = local315[local957 + 1] << 1;
				local983 = (local963 - local924) / 2 + local1111 * (local963 - local924);
				for (local985 = local924; local985 < local963; local985++) {
					local994 = Static301.method4108(local983, local963 - local924);
					@Pc(1198) int local1198 = local994 + (this.aByteArray38[local985] & 0xFF);
					if (local1198 < 0) {
						local1198 = 0;
					}
					if (local1198 > 128) {
						local1198 = 128;
					}
					local983 += local1163 - local1111;
					this.aByteArray38[local985] = (byte) local1198;
				}
				local1111 = local1163;
				local924 = local963;
			}
			for (local1039 = local924; local1039 < 128; local1039++) {
				local1163 = (this.aByteArray38[local1039] & 0xFF) + local1111;
				if (local1163 < 0) {
					local1163 = 0;
				}
				if (local1163 > 128) {
					local1163 = 128;
				}
				this.aByteArray38[local1039] = (byte) local1163;
			}
		}
		for (local810 = 0; local810 < local188; local810++) {
			local238[local810].anInt4367 = local36.method4548();
		}
		for (local852 = 0; local852 < local188; local852++) {
			@Pc(1303) Class168 local1303 = local238[local852];
			if (local1303.aByteArray51 != null) {
				local1303.anInt4368 = local36.method4548();
			}
			if (local1303.aByteArray50 != null) {
				local1303.anInt4369 = local36.method4548();
			}
			if (local1303.anInt4367 > 0) {
				local1303.anInt4371 = local36.method4548();
			}
		}
		for (local1111 = 0; local1111 < local188; local1111++) {
			local238[local1111].anInt4374 = local36.method4548();
		}
		for (local930 = 0; local930 < local188; local930++) {
			@Pc(1354) Class168 local1354 = local238[local930];
			if (local1354.anInt4374 > 0) {
				local1354.anInt4372 = local36.method4548();
			}
		}
		for (local957 = 0; local957 < local188; local957++) {
			@Pc(1381) Class168 local1381 = local238[local957];
			if (local1381.anInt4372 > 0) {
				local1381.anInt4370 = local36.method4548();
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[I[BLclient!uh;)Z")
	public boolean method2986(@OriginalArg(1) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class240 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(16) Class1_Sub6_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray288[local18];
				if (local33 != 0) {
					if (local33 != local9) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg2.method5491(arg0, local33 >> 2);
						} else {
							local16 = arg2.method5493(local33 >> 2, arg0);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass1_Sub6_Sub1Array1[local18] = local16;
						this.anIntArray288[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
	public void method2987() {
		this.anIntArray288 = null;
	}
}
