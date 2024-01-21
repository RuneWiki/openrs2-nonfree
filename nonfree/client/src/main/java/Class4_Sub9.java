import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "[I")
	private int[] anIntArray64 = new int[128];

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "[B")
	public final byte[] aByteArray35 = new byte[128];

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "[B")
	public final byte[] aByteArray36 = new byte[128];

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "[Lclient!af;")
	public final Class7[] aClass7Array1 = new Class7[128];

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "[B")
	public final byte[] aByteArray37 = new byte[128];

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "[S")
	public final short[] aShortArray1 = new short[128];

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
	public final int anInt838;

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "[Lclient!ge;")
	public final Class4_Sub1_Sub1[] aClass4_Sub1_Sub1Array1 = new Class4_Sub1_Sub1[128];

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
	public Class4_Sub9(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class4_Sub13 local38 = new Class4_Sub13(arg0);
		while (local38.aByteArray68[local38.anInt1643 + local33] != 0) {
			local33++;
		}
		@Pc(52) byte[] local52 = new byte[local33];
		for (@Pc(54) int local54 = 0; local54 < local33; local54++) {
			local52[local54] = local38.method1224();
		}
		local38.anInt1643++;
		@Pc(79) int local79 = local38.anInt1643;
		local33++;
		local38.anInt1643 += local33;
		@Pc(88) int local88;
		for (local88 = 0; local38.aByteArray68[local88 + local38.anInt1643] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local38.method1224();
		}
		local88++;
		local38.anInt1643++;
		@Pc(129) int local129 = local38.anInt1643;
		local38.anInt1643 += local88;
		@Pc(137) int local137;
		for (local137 = 0; local38.aByteArray68[local38.anInt1643 + local137] != 0; local137++) {
		}
		@Pc(151) byte[] local151 = new byte[local137];
		for (@Pc(153) int local153 = 0; local153 < local137; local153++) {
			local151[local153] = local38.method1224();
		}
		local38.anInt1643++;
		local137++;
		@Pc(175) byte[] local175 = new byte[local137];
		@Pc(180) int local180;
		@Pc(192) int local192;
		@Pc(198) int local198;
		if (local137 <= 1) {
			local180 = local137;
		} else {
			local180 = 2;
			local175[1] = 1;
			@Pc(190) int local190 = 1;
			for (local192 = 2; local192 < local137; local192++) {
				local198 = local38.method1223();
				if (local198 == 0) {
					local190 = local180++;
				} else {
					if (local198 <= local190) {
						local198--;
					}
					local190 = local198;
				}
				local175[local192] = (byte) local190;
			}
		}
		@Pc(230) Class7[] local230 = new Class7[local180];
		for (local192 = 0; local192 < local230.length; local192++) {
			@Pc(242) Class7 local242 = local230[local192] = new Class7();
			@Pc(246) int local246 = local38.method1223();
			if (local246 > 0) {
				local242.aByteArray3 = new byte[local246 * 2];
			}
			local246 = local38.method1223();
			if (local246 > 0) {
				local242.aByteArray4 = new byte[local246 * 2 + 2];
				local242.aByteArray4[1] = 64;
			}
		}
		local198 = local38.method1223();
		@Pc(294) byte[] local294 = local198 <= 0 ? null : new byte[local198 * 2];
		@Pc(296) int local296 = 0;
		local198 = local38.method1223();
		@Pc(312) byte[] local312 = local198 > 0 ? new byte[local198 * 2] : null;
		while (local38.aByteArray68[local38.anInt1643 + local296] != 0) {
			local296++;
		}
		@Pc(330) byte[] local330 = new byte[local296];
		for (@Pc(332) int local332 = 0; local332 < local296; local332++) {
			local330[local332] = local38.method1224();
		}
		local296++;
		local38.anInt1643++;
		@Pc(357) int local357 = 0;
		for (@Pc(359) int local359 = 0; local359 < 128; local359++) {
			local357 += local38.method1223();
			this.aShortArray1[local359] = (short) local357;
		}
		local357 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local357 += local38.method1223();
			this.aShortArray1[local381] = (short) (this.aShortArray1[local381] + (local357 << 8));
		}
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		for (@Pc(412) int local412 = 0; local412 < 128; local412++) {
			if (local408 == 0) {
				if (local330.length > local406) {
					local408 = local330[local406++];
				} else {
					local408 = -1;
				}
				local410 = local38.method1239();
			}
			this.aShortArray1[local412] = (short) (this.aShortArray1[local412] + ((local410 - 1 & 0x2) << 14));
			this.anIntArray64[local412] = local410;
			local408--;
		}
		local408 = 0;
		local406 = 0;
		@Pc(469) int local469 = 0;
		for (@Pc(471) int local471 = 0; local471 < 128; local471++) {
			if (this.anIntArray64[local471] != 0) {
				if (local408 == 0) {
					if (local406 < local52.length) {
						local408 = local52[local406++];
					} else {
						local408 = -1;
					}
					local469 = local38.aByteArray68[local79++] - 1;
				}
				local408--;
				this.aByteArray35[local471] = (byte) local469;
			}
		}
		local408 = 0;
		@Pc(526) int local526 = 0;
		local406 = 0;
		for (@Pc(530) int local530 = 0; local530 < 128; local530++) {
			if (this.anIntArray64[local530] != 0) {
				if (local408 == 0) {
					local526 = local38.aByteArray68[local129++] + 16 << 2;
					if (local406 >= local105.length) {
						local408 = -1;
					} else {
						local408 = local105[local406++];
					}
				}
				this.aByteArray37[local530] = (byte) local526;
				local408--;
			}
		}
		local408 = 0;
		local406 = 0;
		@Pc(585) Class7 local585 = null;
		for (@Pc(587) int local587 = 0; local587 < 128; local587++) {
			if (this.anIntArray64[local587] != 0) {
				if (local408 == 0) {
					local585 = local230[local175[local406]];
					if (local406 >= local151.length) {
						local408 = -1;
					} else {
						local408 = local151[local406++];
					}
				}
				local408--;
				this.aClass7Array1[local587] = local585;
			}
		}
		local408 = 0;
		local406 = 0;
		@Pc(637) int local637 = 0;
		for (@Pc(639) int local639 = 0; local639 < 128; local639++) {
			if (local408 == 0) {
				if (local406 < local330.length) {
					local408 = local330[local406++];
				} else {
					local408 = -1;
				}
				if (this.anIntArray64[local639] > 0) {
					local637 = local38.method1223() + 1;
				}
			}
			this.aByteArray36[local639] = (byte) local637;
			local408--;
		}
		this.anInt838 = local38.method1223() + 1;
		@Pc(705) int local705;
		for (@Pc(694) int local694 = 0; local694 < local180; local694++) {
			@Pc(700) Class7 local700 = local230[local694];
			if (local700.aByteArray3 != null) {
				for (local705 = 1; local705 < local700.aByteArray3.length; local705 += 2) {
					local700.aByteArray3[local705] = local38.method1224();
				}
			}
			if (local700.aByteArray4 != null) {
				for (local705 = 3; local705 < local700.aByteArray4.length - 2; local705 += 2) {
					local700.aByteArray4[local705] = local38.method1224();
				}
			}
		}
		@Pc(758) int local758;
		if (local294 != null) {
			for (local758 = 1; local758 < local294.length; local758 += 2) {
				local294[local758] = local38.method1224();
			}
		}
		if (local312 != null) {
			for (local758 = 1; local758 < local312.length; local758 += 2) {
				local312[local758] = local38.method1224();
			}
		}
		@Pc(803) int local803;
		for (local758 = 0; local758 < local180; local758++) {
			@Pc(796) Class7 local796 = local230[local758];
			if (local796.aByteArray4 != null) {
				local357 = 0;
				for (local803 = 2; local803 < local796.aByteArray4.length; local803 += 2) {
					local357 = local38.method1223() + local357 + 1;
					local796.aByteArray4[local803] = (byte) local357;
				}
			}
		}
		@Pc(844) int local844;
		for (local705 = 0; local705 < local180; local705++) {
			@Pc(837) Class7 local837 = local230[local705];
			if (local837.aByteArray3 != null) {
				local357 = 0;
				for (local844 = 2; local844 < local837.aByteArray3.length; local844 += 2) {
					local357 = local357 + local38.method1223() + 1;
					local837.aByteArray3[local844] = (byte) local357;
				}
			}
		}
		@Pc(922) int local922;
		@Pc(949) int local949;
		@Pc(955) byte local955;
		@Pc(975) int local975;
		@Pc(977) int local977;
		@Pc(987) int local987;
		@Pc(916) byte local916;
		@Pc(1029) int local1029;
		if (local294 != null) {
			local357 = local38.method1223();
			local294[0] = (byte) local357;
			for (local803 = 2; local803 < local294.length; local803 += 2) {
				local357 = local357 + local38.method1223() + 1;
				local294[local803] = (byte) local357;
			}
			local916 = local294[0];
			@Pc(920) byte local920 = local294[1];
			for (local922 = 0; local922 < local916; local922++) {
				this.aByteArray36[local922] = (byte) (local920 * this.aByteArray36[local922] + 32 >> 6);
			}
			local949 = 2;
			while (local294.length > local949) {
				local955 = local294[local949];
				@Pc(961) byte local961 = local294[local949 + 1];
				local949 += 2;
				local975 = (local955 - local916) / 2 + (local955 - local916) * local920;
				for (local977 = local916; local977 < local955; local977++) {
					local987 = Static104.method1821(local955 - local916, local975);
					local975 += local961 - local920;
					this.aByteArray36[local977] = (byte) (local987 * this.aByteArray36[local977] + 32 >> 6);
				}
				local920 = local961;
				local916 = local955;
			}
			for (local1029 = local916; local1029 < 128; local1029++) {
				this.aByteArray36[local1029] = (byte) (this.aByteArray36[local1029] * local920 + 32 >> 6);
			}
		}
		@Pc(1093) int local1093;
		if (local312 != null) {
			local357 = local38.method1223();
			local312[0] = (byte) local357;
			for (local803 = 2; local803 < local312.length; local803 += 2) {
				local357 += local38.method1223() + 1;
				local312[local803] = (byte) local357;
			}
			local916 = local312[0];
			local1093 = local312[1] << 1;
			for (local922 = 0; local922 < local916; local922++) {
				local949 = (this.aByteArray37[local922] & 0xFF) + local1093;
				if (local949 < 0) {
					local949 = 0;
				}
				if (local949 > 128) {
					local949 = 128;
				}
				this.aByteArray37[local922] = (byte) local949;
			}
			local949 = 2;
			@Pc(1144) int local1144;
			while (local949 < local312.length) {
				local955 = local312[local949];
				local1144 = local312[local949 + 1] << 1;
				local975 = (local955 - local916) * local1093 + (local955 - local916) / 2;
				local949 += 2;
				for (local977 = local916; local977 < local955; local977++) {
					local987 = Static104.method1821(local955 - local916, local975);
					@Pc(1181) int local1181 = (this.aByteArray37[local977] & 0xFF) + local987;
					if (local1181 < 0) {
						local1181 = 0;
					}
					local975 += local1144 - local1093;
					if (local1181 > 128) {
						local1181 = 128;
					}
					this.aByteArray37[local977] = (byte) local1181;
				}
				local1093 = local1144;
				local916 = local955;
			}
			for (local1029 = local916; local1029 < 128; local1029++) {
				local1144 = (this.aByteArray37[local1029] & 0xFF) + local1093;
				if (local1144 < 0) {
					local1144 = 0;
				}
				if (local1144 > 128) {
					local1144 = 128;
				}
				this.aByteArray37[local1029] = (byte) local1144;
			}
		}
		for (local803 = 0; local803 < local180; local803++) {
			local230[local803].anInt75 = local38.method1223();
		}
		for (local844 = 0; local844 < local180; local844++) {
			@Pc(1283) Class7 local1283 = local230[local844];
			if (local1283.aByteArray3 != null) {
				local1283.anInt79 = local38.method1223();
			}
			if (local1283.aByteArray4 != null) {
				local1283.anInt73 = local38.method1223();
			}
			if (local1283.anInt75 > 0) {
				local1283.anInt77 = local38.method1223();
			}
		}
		for (local1093 = 0; local1093 < local180; local1093++) {
			local230[local1093].anInt82 = local38.method1223();
		}
		for (local922 = 0; local922 < local180; local922++) {
			@Pc(1341) Class7 local1341 = local230[local922];
			if (local1341.anInt82 > 0) {
				local1341.anInt76 = local38.method1223();
			}
		}
		for (local949 = 0; local949 < local180; local949++) {
			@Pc(1364) Class7 local1364 = local230[local949];
			if (local1364.anInt76 > 0) {
				local1364.anInt74 = local38.method1223();
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
	public void method592() {
		this.anIntArray64 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!rd;[I[B)Z")
	public boolean method593(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class4_Sub1_Sub1 local11 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg2 == null || arg2[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray64[local19];
				if (local34 != 0) {
					if (local9 != local34) {
						local9 = local34--;
						if ((local34 & 0x1) == 0) {
							local11 = arg0.method1812(arg1, local34 >> 2);
						} else {
							local11 = arg0.method1813(arg1, local34 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass4_Sub1_Sub1Array1[local19] = local11;
						this.anIntArray64[local19] = 0;
					}
				}
			}
		}
		return local7;
	}
}
