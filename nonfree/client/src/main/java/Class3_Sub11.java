import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!k", name = "H", descriptor = "[I")
	private int[] anIntArray200 = new int[128];

	@OriginalMember(owner = "client!k", name = "J", descriptor = "[Lclient!fc;")
	public final Class3_Sub9_Sub1[] aClass3_Sub9_Sub1Array1 = new Class3_Sub9_Sub1[128];

	@OriginalMember(owner = "client!k", name = "K", descriptor = "[B")
	public final byte[] aByteArray45 = new byte[128];

	@OriginalMember(owner = "client!k", name = "P", descriptor = "I")
	public final int anInt1787;

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "[S")
	public final short[] aShortArray7 = new short[128];

	@OriginalMember(owner = "client!k", name = "V", descriptor = "[Lclient!ta;")
	public final Class70[] aClass70Array1 = new Class70[128];

	@OriginalMember(owner = "client!k", name = "X", descriptor = "[B")
	public final byte[] aByteArray46 = new byte[128];

	@OriginalMember(owner = "client!k", name = "ab", descriptor = "[B")
	public final byte[] aByteArray47;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "([B)V")
	public Class3_Sub11(@OriginalArg(0) byte[] arg0) {
		@Pc(29) int local29 = 0;
		this.aByteArray47 = new byte[128];
		@Pc(38) Class3_Sub12 local38 = new Class3_Sub12(arg0);
		while (local38.aByteArray77[local38.anInt2886 + local29] != 0) {
			local29++;
		}
		@Pc(53) byte[] local53 = new byte[local29];
		for (@Pc(55) int local55 = 0; local55 < local29; local55++) {
			local53[local55] = local38.method1958();
		}
		local38.anInt2886++;
		local29++;
		@Pc(77) int local77 = local38.anInt2886;
		local38.anInt2886 += local29;
		@Pc(85) int local85;
		for (local85 = 0; local38.aByteArray77[local38.anInt2886 + local85] != 0; local85++) {
		}
		@Pc(102) byte[] local102 = new byte[local85];
		for (@Pc(104) int local104 = 0; local104 < local85; local104++) {
			local102[local104] = local38.method1958();
		}
		local38.anInt2886++;
		@Pc(129) int local129 = local38.anInt2886;
		local85++;
		local38.anInt2886 += local85;
		@Pc(138) int local138;
		for (local138 = 0; local38.aByteArray77[local38.anInt2886 + local138] != 0; local138++) {
		}
		@Pc(155) byte[] local155 = new byte[local138];
		for (@Pc(157) int local157 = 0; local157 < local138; local157++) {
			local155[local157] = local38.method1958();
		}
		local138++;
		local38.anInt2886++;
		@Pc(183) byte[] local183 = new byte[local138];
		@Pc(196) int local196;
		@Pc(198) int local198;
		@Pc(204) int local204;
		if (local138 > 1) {
			local183[1] = 1;
			@Pc(194) int local194 = 1;
			local196 = 2;
			for (local198 = 2; local198 < local138; local198++) {
				local204 = local38.method1936();
				if (local204 == 0) {
					local194 = local196++;
				} else {
					if (local194 >= local204) {
						local204--;
					}
					local194 = local204;
				}
				local183[local198] = (byte) local194;
			}
		} else {
			local196 = local138;
		}
		@Pc(241) Class70[] local241 = new Class70[local196];
		for (local198 = 0; local198 < local241.length; local198++) {
			@Pc(253) Class70 local253 = local241[local198] = new Class70();
			@Pc(257) int local257 = local38.method1936();
			if (local257 > 0) {
				local253.aByteArray82 = new byte[local257 * 2];
			}
			local257 = local38.method1936();
			if (local257 > 0) {
				local253.aByteArray81 = new byte[local257 * 2 + 2];
				local253.aByteArray81[1] = 64;
			}
		}
		local204 = local38.method1936();
		@Pc(306) byte[] local306 = local204 <= 0 ? null : new byte[local204 * 2];
		local204 = local38.method1936();
		@Pc(322) byte[] local322 = local204 <= 0 ? null : new byte[local204 * 2];
		@Pc(324) int local324;
		for (local324 = 0; local38.aByteArray77[local38.anInt2886 + local324] != 0; local324++) {
		}
		@Pc(341) byte[] local341 = new byte[local324];
		for (@Pc(343) int local343 = 0; local343 < local324; local343++) {
			local341[local343] = local38.method1958();
		}
		local324++;
		local38.anInt2886++;
		@Pc(368) int local368 = 0;
		for (@Pc(370) int local370 = 0; local370 < 128; local370++) {
			local368 += local38.method1936();
			this.aShortArray7[local370] = (short) local368;
		}
		local368 = 0;
		for (@Pc(394) int local394 = 0; local394 < 128; local394++) {
			local368 += local38.method1936();
			this.aShortArray7[local394] = (short) (this.aShortArray7[local394] + (local368 << 8));
		}
		@Pc(421) int local421 = 0;
		@Pc(423) int local423 = 0;
		@Pc(425) int local425 = 0;
		for (@Pc(427) int local427 = 0; local427 < 128; local427++) {
			if (local425 == 0) {
				if (local341.length > local423) {
					local425 = local341[local423++];
				} else {
					local425 = -1;
				}
				local421 = local38.method1932();
			}
			this.aShortArray7[local427] = (short) (this.aShortArray7[local427] + ((local421 - 1 & 0x2) << 14));
			this.anIntArray200[local427] = local421;
			local425--;
		}
		local425 = 0;
		local423 = 0;
		@Pc(481) int local481 = 0;
		for (@Pc(483) int local483 = 0; local483 < 128; local483++) {
			if (this.anIntArray200[local483] != 0) {
				if (local425 == 0) {
					local481 = local38.aByteArray77[local77++] - 1;
					if (local423 >= local53.length) {
						local425 = -1;
					} else {
						local425 = local53[local423++];
					}
				}
				local425--;
				this.aByteArray45[local483] = (byte) local481;
			}
		}
		local425 = 0;
		local423 = 0;
		@Pc(533) int local533 = 0;
		for (@Pc(535) int local535 = 0; local535 < 128; local535++) {
			if (this.anIntArray200[local535] != 0) {
				if (local425 == 0) {
					local533 = local38.aByteArray77[local129++] + 16 << 2;
					if (local102.length > local423) {
						local425 = local102[local423++];
					} else {
						local425 = -1;
					}
				}
				local425--;
				this.aByteArray47[local535] = (byte) local533;
			}
		}
		local425 = 0;
		@Pc(594) Class70 local594 = null;
		local423 = 0;
		for (@Pc(598) int local598 = 0; local598 < 128; local598++) {
			if (this.anIntArray200[local598] != 0) {
				if (local425 == 0) {
					local594 = local241[local183[local423]];
					if (local423 >= local155.length) {
						local425 = -1;
					} else {
						local425 = local155[local423++];
					}
				}
				local425--;
				this.aClass70Array1[local598] = local594;
			}
		}
		local423 = 0;
		@Pc(642) int local642 = 0;
		local425 = 0;
		for (@Pc(646) int local646 = 0; local646 < 128; local646++) {
			if (local425 == 0) {
				if (local423 < local341.length) {
					local425 = local341[local423++];
				} else {
					local425 = -1;
				}
				if (this.anIntArray200[local646] > 0) {
					local642 = local38.method1936() + 1;
				}
			}
			this.aByteArray46[local646] = (byte) local642;
			local425--;
		}
		this.anInt1787 = local38.method1936() + 1;
		@Pc(707) int local707;
		for (@Pc(696) int local696 = 0; local696 < local196; local696++) {
			@Pc(702) Class70 local702 = local241[local696];
			if (local702.aByteArray82 != null) {
				for (local707 = 1; local707 < local702.aByteArray82.length; local707 += 2) {
					local702.aByteArray82[local707] = local38.method1958();
				}
			}
			if (local702.aByteArray81 != null) {
				for (local707 = 3; local707 < local702.aByteArray81.length - 2; local707 += 2) {
					local702.aByteArray81[local707] = local38.method1958();
				}
			}
		}
		@Pc(752) int local752;
		if (local306 != null) {
			for (local752 = 1; local752 < local306.length; local752 += 2) {
				local306[local752] = local38.method1958();
			}
		}
		if (local322 != null) {
			for (local752 = 1; local752 < local322.length; local752 += 2) {
				local322[local752] = local38.method1958();
			}
		}
		@Pc(797) int local797;
		for (local752 = 0; local752 < local196; local752++) {
			@Pc(790) Class70 local790 = local241[local752];
			if (local790.aByteArray81 != null) {
				local368 = 0;
				for (local797 = 2; local797 < local790.aByteArray81.length; local797 += 2) {
					local368 = local368 + local38.method1936() + 1;
					local790.aByteArray81[local797] = (byte) local368;
				}
			}
		}
		@Pc(839) int local839;
		for (local707 = 0; local707 < local196; local707++) {
			@Pc(832) Class70 local832 = local241[local707];
			if (local832.aByteArray82 != null) {
				local368 = 0;
				for (local839 = 2; local839 < local832.aByteArray82.length; local839 += 2) {
					local368 = local38.method1936() + local368 + 1;
					local832.aByteArray82[local839] = (byte) local368;
				}
			}
		}
		@Pc(909) int local909;
		@Pc(932) int local932;
		@Pc(944) byte local944;
		@Pc(958) int local958;
		@Pc(960) int local960;
		@Pc(969) int local969;
		@Pc(903) byte local903;
		@Pc(1011) int local1011;
		if (local306 != null) {
			local368 = local38.method1936();
			local306[0] = (byte) local368;
			for (local797 = 2; local797 < local306.length; local797 += 2) {
				local368 = local368 + local38.method1936() + 1;
				local306[local797] = (byte) local368;
			}
			local903 = local306[0];
			@Pc(907) byte local907 = local306[1];
			for (local909 = 0; local909 < local903; local909++) {
				this.aByteArray46[local909] = (byte) (this.aByteArray46[local909] * local907 + 32 >> 6);
			}
			local932 = 2;
			while (local306.length > local932) {
				@Pc(940) byte local940 = local306[local932 + 1];
				local944 = local306[local932];
				local932 += 2;
				local958 = (local944 - local903) / 2 + (local944 - local903) * local907;
				for (local960 = local903; local960 < local944; local960++) {
					local969 = Static59.method1197(local958, local944 - local903);
					local958 += local940 - local907;
					this.aByteArray46[local960] = (byte) (local969 * this.aByteArray46[local960] + 32 >> 6);
				}
				local907 = local940;
				local903 = local944;
			}
			for (local1011 = local903; local1011 < 128; local1011++) {
				this.aByteArray46[local1011] = (byte) (this.aByteArray46[local1011] * local907 + 32 >> 6);
			}
		}
		@Pc(1077) int local1077;
		if (local322 != null) {
			local368 = local38.method1936();
			local322[0] = (byte) local368;
			for (local797 = 2; local797 < local322.length; local797 += 2) {
				local368 += local38.method1936() + 1;
				local322[local797] = (byte) local368;
			}
			local903 = local322[0];
			local1077 = local322[1] << 1;
			for (local909 = 0; local909 < local903; local909++) {
				local932 = local1077 + (this.aByteArray47[local909] & 0xFF);
				if (local932 < 0) {
					local932 = 0;
				}
				if (local932 > 128) {
					local932 = 128;
				}
				this.aByteArray47[local909] = (byte) local932;
			}
			local932 = 2;
			@Pc(1127) int local1127;
			while (local322.length > local932) {
				local944 = local322[local932];
				local1127 = local322[local932 + 1] << 1;
				local932 += 2;
				local958 = (local944 - local903) * local1077 + (local944 - local903) / 2;
				for (local960 = local903; local960 < local944; local960++) {
					local969 = Static59.method1197(local958, local944 - local903);
					@Pc(1163) int local1163 = (this.aByteArray47[local960] & 0xFF) + local969;
					local958 += local1127 - local1077;
					if (local1163 < 0) {
						local1163 = 0;
					}
					if (local1163 > 128) {
						local1163 = 128;
					}
					this.aByteArray47[local960] = (byte) local1163;
				}
				local903 = local944;
				local1077 = local1127;
			}
			for (local1011 = local903; local1011 < 128; local1011++) {
				local1127 = (this.aByteArray47[local1011] & 0xFF) + local1077;
				if (local1127 < 0) {
					local1127 = 0;
				}
				if (local1127 > 128) {
					local1127 = 128;
				}
				this.aByteArray47[local1011] = (byte) local1127;
			}
		}
		for (local797 = 0; local797 < local196; local797++) {
			local241[local797].anInt3102 = local38.method1936();
		}
		for (local839 = 0; local839 < local196; local839++) {
			@Pc(1269) Class70 local1269 = local241[local839];
			if (local1269.aByteArray82 != null) {
				local1269.anInt3097 = local38.method1936();
			}
			if (local1269.aByteArray81 != null) {
				local1269.anInt3109 = local38.method1936();
			}
			if (local1269.anInt3102 > 0) {
				local1269.anInt3103 = local38.method1936();
			}
		}
		for (local1077 = 0; local1077 < local196; local1077++) {
			local241[local1077].anInt3107 = local38.method1936();
		}
		for (local909 = 0; local909 < local196; local909++) {
			@Pc(1331) Class70 local1331 = local241[local909];
			if (local1331.anInt3107 > 0) {
				local1331.anInt3101 = local38.method1936();
			}
		}
		for (local932 = 0; local932 < local196; local932++) {
			@Pc(1351) Class70 local1351 = local241[local932];
			if (local1351.anInt3101 > 0) {
				local1351.anInt3106 = local38.method1936();
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([BLclient!hf;B[I)Z")
	public boolean method1158(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) int local7 = 0;
		@Pc(14) Class3_Sub9_Sub1 local14 = null;
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray200[local18];
				if (local33 != 0) {
					if (local33 != local7) {
						local7 = local33--;
						if ((local33 & 0x1) == 0) {
							local14 = arg1.method988(local33 >> 2, arg2);
						} else {
							local14 = arg1.method986(arg2, local33 >> 2);
						}
						if (local14 == null) {
							local16 = false;
						}
					}
					if (local14 != null) {
						this.aClass3_Sub9_Sub1Array1[local18] = local14;
						this.anIntArray200[local18] = 0;
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V")
	public void method1161() {
		this.anIntArray200 = null;
	}
}
