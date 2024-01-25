import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!qba", name = "g", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!qba", name = "h", descriptor = "[I")
	private int[] anIntArray498;

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "[Lclient!jda;")
	public Class3_Sub30_Sub1[] aClass3_Sub30_Sub1Array1;

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
	public int anInt7999;

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "[S")
	public short[] aShortArray117;

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "[Lclient!laa;")
	public Class197[] aClass197Array1;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V")
	private Class3_Sub44() {
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "([B)V")
	public Class3_Sub44(@OriginalArg(0) byte[] arg0) {
		this.aByteArray86 = new byte[128];
		this.aByteArray87 = new byte[128];
		this.aByteArray85 = new byte[128];
		this.anIntArray498 = new int[128];
		this.aShortArray117 = new short[128];
		this.aClass3_Sub30_Sub1Array1 = new Class3_Sub30_Sub1[128];
		this.aClass197Array1 = new Class197[128];
		@Pc(36) Class3_Sub3 local36 = new Class3_Sub3(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray54[local38 + local36.anInt4736] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method4254();
		}
		local38++;
		local36.anInt4736++;
		@Pc(80) int local80 = local36.anInt4736;
		local36.anInt4736 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray54[local36.anInt4736 + local88] != 0; local88++) {
		}
		@Pc(106) byte[] local106 = new byte[local88];
		for (@Pc(108) int local108 = 0; local108 < local88; local108++) {
			local106[local108] = local36.method4254();
		}
		local36.anInt4736++;
		local88++;
		@Pc(130) int local130 = local36.anInt4736;
		local36.anInt4736 += local88;
		@Pc(138) int local138;
		for (local138 = 0; local36.aByteArray54[local138 + local36.anInt4736] != 0; local138++) {
		}
		@Pc(152) byte[] local152 = new byte[local138];
		for (@Pc(154) int local154 = 0; local154 < local138; local154++) {
			local152[local154] = local36.method4254();
		}
		local36.anInt4736++;
		local138++;
		@Pc(176) byte[] local176 = new byte[local138];
		@Pc(181) int local181;
		@Pc(193) int local193;
		@Pc(199) int local199;
		if (local138 <= 1) {
			local181 = local138;
		} else {
			local176[1] = 1;
			local181 = 2;
			@Pc(191) int local191 = 1;
			for (local193 = 2; local193 < local138; local193++) {
				local199 = local36.method4225();
				if (local199 == 0) {
					local191 = local181++;
				} else {
					if (local199 <= local191) {
						local199--;
					}
					local191 = local199;
				}
				local176[local193] = (byte) local191;
			}
		}
		@Pc(231) Class197[] local231 = new Class197[local181];
		for (local193 = 0; local193 < local231.length; local193++) {
			@Pc(243) Class197 local243 = local231[local193] = new Class197();
			@Pc(247) int local247 = local36.method4225();
			if (local247 > 0) {
				local243.aByteArray62 = new byte[local247 * 2];
			}
			local247 = local36.method4225();
			if (local247 > 0) {
				local243.aByteArray63 = new byte[local247 * 2 + 2];
				local243.aByteArray63[1] = 64;
			}
		}
		local199 = local36.method4225();
		@Pc(305) byte[] local305 = local199 <= 0 ? null : new byte[local199 * 2];
		local199 = local36.method4225();
		@Pc(321) byte[] local321 = local199 > 0 ? new byte[local199 * 2] : null;
		@Pc(323) int local323;
		for (local323 = 0; local36.aByteArray54[local36.anInt4736 + local323] != 0; local323++) {
		}
		@Pc(341) byte[] local341 = new byte[local323];
		for (@Pc(343) int local343 = 0; local343 < local323; local343++) {
			local341[local343] = local36.method4254();
		}
		local323++;
		local36.anInt4736++;
		@Pc(368) int local368 = 0;
		for (@Pc(370) int local370 = 0; local370 < 128; local370++) {
			local368 += local36.method4225();
			this.aShortArray117[local370] = (short) local368;
		}
		local368 = 0;
		for (@Pc(392) int local392 = 0; local392 < 128; local392++) {
			local368 += local36.method4225();
			this.aShortArray117[local392] = (short) (this.aShortArray117[local392] + (local368 << 8));
		}
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		@Pc(421) int local421 = 0;
		for (@Pc(423) int local423 = 0; local423 < 128; local423++) {
			if (local417 == 0) {
				if (local419 < local341.length) {
					local417 = local341[local419++];
				} else {
					local417 = -1;
				}
				local421 = local36.method4219();
			}
			this.aShortArray117[local423] = (short) (this.aShortArray117[local423] + ((local421 - 1 & 0x2) << 14));
			local417--;
			this.anIntArray498[local423] = local421;
		}
		local419 = 0;
		local417 = 0;
		@Pc(478) int local478 = 0;
		for (@Pc(480) int local480 = 0; local480 < 128; local480++) {
			if (this.anIntArray498[local480] != 0) {
				if (local417 == 0) {
					local478 = local36.aByteArray54[local80++] - 1;
					if (local419 >= local52.length) {
						local417 = -1;
					} else {
						local417 = local52[local419++];
					}
				}
				this.aByteArray86[local480] = (byte) local478;
				local417--;
			}
		}
		local419 = 0;
		local417 = 0;
		@Pc(534) int local534 = 0;
		for (@Pc(536) int local536 = 0; local536 < 128; local536++) {
			if (this.anIntArray498[local536] != 0) {
				if (local417 == 0) {
					if (local106.length <= local419) {
						local417 = -1;
					} else {
						local417 = local106[local419++];
					}
					local534 = local36.aByteArray54[local130++] + 16 << 2;
				}
				this.aByteArray85[local536] = (byte) local534;
				local417--;
			}
		}
		local419 = 0;
		local417 = 0;
		@Pc(588) Class197 local588 = null;
		for (@Pc(590) int local590 = 0; local590 < 128; local590++) {
			if (this.anIntArray498[local590] != 0) {
				if (local417 == 0) {
					local588 = local231[local176[local419]];
					if (local152.length <= local419) {
						local417 = -1;
					} else {
						local417 = local152[local419++];
					}
				}
				local417--;
				this.aClass197Array1[local590] = local588;
			}
		}
		local417 = 0;
		local419 = 0;
		@Pc(639) int local639 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local417 == 0) {
				if (local341.length > local419) {
					local417 = local341[local419++];
				} else {
					local417 = -1;
				}
				if (this.anIntArray498[local641] > 0) {
					local639 = local36.method4225() + 1;
				}
			}
			local417--;
			this.aByteArray87[local641] = (byte) local639;
		}
		this.anInt7999 = local36.method4225() + 1;
		@Pc(706) int local706;
		for (@Pc(695) int local695 = 0; local695 < local181; local695++) {
			@Pc(701) Class197 local701 = local231[local695];
			if (local701.aByteArray62 != null) {
				for (local706 = 1; local706 < local701.aByteArray62.length; local706 += 2) {
					local701.aByteArray62[local706] = local36.method4254();
				}
			}
			if (local701.aByteArray63 != null) {
				for (local706 = 3; local706 < local701.aByteArray63.length - 2; local706 += 2) {
					local701.aByteArray63[local706] = local36.method4254();
				}
			}
		}
		@Pc(759) int local759;
		if (local305 != null) {
			for (local759 = 1; local759 < local305.length; local759 += 2) {
				local305[local759] = local36.method4254();
			}
		}
		if (local321 != null) {
			for (local759 = 1; local759 < local321.length; local759 += 2) {
				local321[local759] = local36.method4254();
			}
		}
		@Pc(804) int local804;
		for (local759 = 0; local759 < local181; local759++) {
			@Pc(797) Class197 local797 = local231[local759];
			if (local797.aByteArray63 != null) {
				local368 = 0;
				for (local804 = 2; local804 < local797.aByteArray63.length; local804 += 2) {
					local368 = local368 + local36.method4225() + 1;
					local797.aByteArray63[local804] = (byte) local368;
				}
			}
		}
		@Pc(849) int local849;
		for (local706 = 0; local706 < local181; local706++) {
			@Pc(842) Class197 local842 = local231[local706];
			if (local842.aByteArray62 != null) {
				local368 = 0;
				for (local849 = 2; local849 < local842.aByteArray62.length; local849 += 2) {
					local368 = local368 + local36.method4225() + 1;
					local842.aByteArray62[local849] = (byte) local368;
				}
			}
		}
		@Pc(926) int local926;
		@Pc(953) int local953;
		@Pc(959) byte local959;
		@Pc(980) int local980;
		@Pc(982) int local982;
		@Pc(991) int local991;
		@Pc(920) byte local920;
		@Pc(1032) int local1032;
		if (local305 != null) {
			local368 = local36.method4225();
			local305[0] = (byte) local368;
			for (local804 = 2; local804 < local305.length; local804 += 2) {
				local368 = local368 + local36.method4225() + 1;
				local305[local804] = (byte) local368;
			}
			local920 = local305[0];
			@Pc(924) byte local924 = local305[1];
			for (local926 = 0; local926 < local920; local926++) {
				this.aByteArray87[local926] = (byte) (local924 * this.aByteArray87[local926] + 32 >> 6);
			}
			for (local953 = 2; local953 < local305.length; local953 += 2) {
				local959 = local305[local953];
				@Pc(965) byte local965 = local305[local953 + 1];
				local980 = (local959 - local920) * local924 + (local959 - local920) / 2;
				for (local982 = local920; local982 < local959; local982++) {
					local991 = Static376.method6064(local959 - local920, local980);
					local980 += local965 - local924;
					this.aByteArray87[local982] = (byte) (this.aByteArray87[local982] * local991 + 32 >> 6);
				}
				local924 = local965;
				local920 = local959;
			}
			for (local1032 = local920; local1032 < 128; local1032++) {
				this.aByteArray87[local1032] = (byte) (this.aByteArray87[local1032] * local924 + 32 >> 6);
			}
		}
		@Pc(1102) int local1102;
		if (local321 != null) {
			local368 = local36.method4225();
			local321[0] = (byte) local368;
			for (local804 = 2; local804 < local321.length; local804 += 2) {
				local368 = local36.method4225() + local368 + 1;
				local321[local804] = (byte) local368;
			}
			local920 = local321[0];
			local1102 = local321[1] << 1;
			for (local926 = 0; local926 < local920; local926++) {
				local953 = local1102 + (this.aByteArray85[local926] & 0xFF);
				if (local953 < 0) {
					local953 = 0;
				}
				if (local953 > 128) {
					local953 = 128;
				}
				this.aByteArray85[local926] = (byte) local953;
			}
			local953 = 2;
			@Pc(1155) int local1155;
			while (local321.length > local953) {
				local959 = local321[local953];
				local1155 = local321[local953 + 1] << 1;
				local980 = local1102 * (local959 - local920) + (local959 - local920) / 2;
				for (local982 = local920; local982 < local959; local982++) {
					local991 = Static376.method6064(local959 - local920, local980);
					@Pc(1189) int local1189 = local991 + (this.aByteArray85[local982] & 0xFF);
					if (local1189 < 0) {
						local1189 = 0;
					}
					if (local1189 > 128) {
						local1189 = 128;
					}
					this.aByteArray85[local982] = (byte) local1189;
					local980 += local1155 - local1102;
				}
				local1102 = local1155;
				local953 += 2;
				local920 = local959;
			}
			for (local1032 = local920; local1032 < 128; local1032++) {
				local1155 = local1102 + (this.aByteArray85[local1032] & 0xFF);
				if (local1155 < 0) {
					local1155 = 0;
				}
				if (local1155 > 128) {
					local1155 = 128;
				}
				this.aByteArray85[local1032] = (byte) local1155;
			}
		}
		for (local804 = 0; local804 < local181; local804++) {
			local231[local804].anInt5877 = local36.method4225();
		}
		for (local849 = 0; local849 < local181; local849++) {
			@Pc(1295) Class197 local1295 = local231[local849];
			if (local1295.aByteArray62 != null) {
				local1295.anInt5884 = local36.method4225();
			}
			if (local1295.aByteArray63 != null) {
				local1295.anInt5878 = local36.method4225();
			}
			if (local1295.anInt5877 > 0) {
				local1295.anInt5883 = local36.method4225();
			}
		}
		for (local1102 = 0; local1102 < local181; local1102++) {
			local231[local1102].anInt5879 = local36.method4225();
		}
		for (local926 = 0; local926 < local181; local926++) {
			@Pc(1353) Class197 local1353 = local231[local926];
			if (local1353.anInt5879 > 0) {
				local1353.anInt5876 = local36.method4225();
			}
		}
		for (local953 = 0; local953 < local181; local953++) {
			@Pc(1373) Class197 local1373 = local231[local953];
			if (local1373.anInt5876 > 0) {
				local1373.anInt5880 = local36.method4225();
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "([II[BLclient!ck;)Z")
	public boolean method6953(@OriginalArg(0) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class52 arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class3_Sub30_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray498[local18];
				if (local30 != 0) {
					if (local30 != local14) {
						local14 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg2.method1766(arg0, local30 >> 2);
						} else {
							local16 = arg2.method1761(arg0, local30 >> 2);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass3_Sub30_Sub1Array1[local18] = local16;
						this.anIntArray498[local18] = 0;
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(Z)V")
	public void method6955() {
		this.anIntArray498 = null;
	}
}
