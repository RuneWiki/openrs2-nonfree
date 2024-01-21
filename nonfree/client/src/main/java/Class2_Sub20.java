import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "[S")
	public final short[] aShortArray23 = new short[128];

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	public final int anInt2145;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "[B")
	public final byte[] aByteArray29;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "[B")
	public final byte[] aByteArray30;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[Lclient!ne;")
	public final Class58[] aClass58Array1 = new Class58[128];

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "[Lclient!k;")
	public final Class2_Sub5_Sub1[] aClass2_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "[B")
	public final byte[] aByteArray31;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
	public Class2_Sub20(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = 0;
		this.aClass2_Sub5_Sub1Array1 = new Class2_Sub5_Sub1[128];
		this.aByteArray31 = new byte[128];
		this.aByteArray30 = new byte[128];
		this.anIntArray206 = new int[128];
		this.aByteArray29 = new byte[128];
		@Pc(38) Class2_Sub13 local38 = new Class2_Sub13(arg0);
		while (local38.aByteArray49[local38.anInt3940 + local13] != 0) {
			local13++;
		}
		@Pc(56) byte[] local56 = new byte[local13];
		for (@Pc(58) int local58 = 0; local58 < local13; local58++) {
			local56[local58] = local38.method2948();
		}
		local38.anInt3940++;
		local13++;
		@Pc(80) int local80 = local38.anInt3940;
		local38.anInt3940 += local13;
		@Pc(88) int local88;
		for (local88 = 0; local38.aByteArray49[local88 + local38.anInt3940] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local38.method2948();
		}
		local38.anInt3940++;
		@Pc(128) int local128 = local38.anInt3940;
		@Pc(130) int local130 = 0;
		local88++;
		local38.anInt3940 += local88;
		while (local38.aByteArray49[local130 + local38.anInt3940] != 0) {
			local130++;
		}
		@Pc(151) byte[] local151 = new byte[local130];
		for (@Pc(153) int local153 = 0; local153 < local130; local153++) {
			local151[local153] = local38.method2948();
		}
		local38.anInt3940++;
		local130++;
		@Pc(175) byte[] local175 = new byte[local130];
		@Pc(188) int local188;
		@Pc(190) int local190;
		@Pc(196) int local196;
		if (local130 > 1) {
			local175[1] = 1;
			@Pc(186) int local186 = 1;
			local188 = 2;
			for (local190 = 2; local190 < local130; local190++) {
				local196 = local38.method2962();
				if (local196 == 0) {
					local186 = local188++;
				} else {
					if (local186 >= local196) {
						local196--;
					}
					local186 = local196;
				}
				local175[local190] = (byte) local186;
			}
		} else {
			local188 = local130;
		}
		@Pc(229) Class58[] local229 = new Class58[local188];
		for (local190 = 0; local190 < local229.length; local190++) {
			@Pc(241) Class58 local241 = local229[local190] = new Class58();
			@Pc(245) int local245 = local38.method2962();
			if (local245 > 0) {
				local241.aByteArray33 = new byte[local245 * 2];
			}
			local245 = local38.method2962();
			if (local245 > 0) {
				local241.aByteArray34 = new byte[local245 * 2 + 2];
				local241.aByteArray34[1] = 64;
			}
		}
		local196 = local38.method2962();
		@Pc(296) byte[] local296 = local196 <= 0 ? null : new byte[local196 * 2];
		@Pc(298) int local298 = 0;
		local196 = local38.method2962();
		@Pc(311) byte[] local311 = local196 <= 0 ? null : new byte[local196 * 2];
		while (local38.aByteArray49[local298 + local38.anInt3940] != 0) {
			local298++;
		}
		@Pc(325) byte[] local325 = new byte[local298];
		for (@Pc(327) int local327 = 0; local327 < local298; local327++) {
			local325[local327] = local38.method2948();
		}
		local298++;
		@Pc(342) int local342 = 0;
		local38.anInt3940++;
		for (@Pc(350) int local350 = 0; local350 < 128; local350++) {
			local342 += local38.method2962();
			this.aShortArray23[local350] = (short) local342;
		}
		local342 = 0;
		for (@Pc(374) int local374 = 0; local374 < 128; local374++) {
			local342 += local38.method2962();
			this.aShortArray23[local374] = (short) (this.aShortArray23[local374] + (local342 << 8));
		}
		@Pc(401) int local401 = 0;
		@Pc(403) int local403 = 0;
		@Pc(405) int local405 = 0;
		for (@Pc(407) int local407 = 0; local407 < 128; local407++) {
			if (local401 == 0) {
				if (local403 < local325.length) {
					local401 = local325[local403++];
				} else {
					local401 = -1;
				}
				local405 = local38.method2919();
			}
			local401--;
			this.aShortArray23[local407] = (short) (this.aShortArray23[local407] + ((local405 - 1 & 0x2) << 14));
			this.anIntArray206[local407] = local405;
		}
		local401 = 0;
		local403 = 0;
		@Pc(461) int local461 = 0;
		for (@Pc(463) int local463 = 0; local463 < 128; local463++) {
			if (this.anIntArray206[local463] != 0) {
				if (local401 == 0) {
					if (local403 >= local56.length) {
						local401 = -1;
					} else {
						local401 = local56[local403++];
					}
					local461 = local38.aByteArray49[local80++] - 1;
				}
				this.aByteArray29[local463] = (byte) local461;
				local401--;
			}
		}
		local403 = 0;
		@Pc(510) int local510 = 0;
		local401 = 0;
		for (@Pc(514) int local514 = 0; local514 < 128; local514++) {
			if (this.anIntArray206[local514] != 0) {
				if (local401 == 0) {
					local510 = local38.aByteArray49[local128++] + 16 << 2;
					if (local105.length <= local403) {
						local401 = -1;
					} else {
						local401 = local105[local403++];
					}
				}
				local401--;
				this.aByteArray31[local514] = (byte) local510;
			}
		}
		@Pc(568) Class58 local568 = null;
		local403 = 0;
		local401 = 0;
		for (@Pc(574) int local574 = 0; local574 < 128; local574++) {
			if (this.anIntArray206[local574] != 0) {
				if (local401 == 0) {
					local568 = local229[local175[local403]];
					if (local151.length <= local403) {
						local401 = -1;
					} else {
						local401 = local151[local403++];
					}
				}
				this.aClass58Array1[local574] = local568;
				local401--;
			}
		}
		local401 = 0;
		local403 = 0;
		@Pc(617) int local617 = 0;
		for (@Pc(619) int local619 = 0; local619 < 128; local619++) {
			if (local401 == 0) {
				if (local325.length > local403) {
					local401 = local325[local403++];
				} else {
					local401 = -1;
				}
				if (this.anIntArray206[local619] > 0) {
					local617 = local38.method2962() + 1;
				}
			}
			this.aByteArray30[local619] = (byte) local617;
			local401--;
		}
		this.anInt2145 = local38.method2962() + 1;
		@Pc(686) int local686;
		for (@Pc(675) int local675 = 0; local675 < local188; local675++) {
			@Pc(681) Class58 local681 = local229[local675];
			if (local681.aByteArray33 != null) {
				for (local686 = 1; local686 < local681.aByteArray33.length; local686 += 2) {
					local681.aByteArray33[local686] = local38.method2948();
				}
			}
			if (local681.aByteArray34 != null) {
				for (local686 = 3; local686 < local681.aByteArray34.length - 2; local686 += 2) {
					local681.aByteArray34[local686] = local38.method2948();
				}
			}
		}
		@Pc(739) int local739;
		if (local296 != null) {
			for (local739 = 1; local739 < local296.length; local739 += 2) {
				local296[local739] = local38.method2948();
			}
		}
		if (local311 != null) {
			for (local739 = 1; local739 < local311.length; local739 += 2) {
				local311[local739] = local38.method2948();
			}
		}
		@Pc(784) int local784;
		for (local739 = 0; local739 < local188; local739++) {
			@Pc(777) Class58 local777 = local229[local739];
			if (local777.aByteArray34 != null) {
				local342 = 0;
				for (local784 = 2; local784 < local777.aByteArray34.length; local784 += 2) {
					local342 += local38.method2962() + 1;
					local777.aByteArray34[local784] = (byte) local342;
				}
			}
		}
		@Pc(833) int local833;
		for (local686 = 0; local686 < local188; local686++) {
			@Pc(826) Class58 local826 = local229[local686];
			if (local826.aByteArray33 != null) {
				local342 = 0;
				for (local833 = 2; local833 < local826.aByteArray33.length; local833 += 2) {
					local342 += local38.method2962() + 1;
					local826.aByteArray33[local833] = (byte) local342;
				}
			}
		}
		@Pc(910) int local910;
		@Pc(937) int local937;
		@Pc(943) byte local943;
		@Pc(963) int local963;
		@Pc(965) int local965;
		@Pc(975) int local975;
		@Pc(904) byte local904;
		@Pc(1021) int local1021;
		if (local296 != null) {
			local342 = local38.method2962();
			local296[0] = (byte) local342;
			for (local784 = 2; local784 < local296.length; local784 += 2) {
				local342 = local342 + local38.method2962() + 1;
				local296[local784] = (byte) local342;
			}
			local904 = local296[0];
			@Pc(908) byte local908 = local296[1];
			for (local910 = 0; local910 < local904; local910++) {
				this.aByteArray30[local910] = (byte) (local908 * this.aByteArray30[local910] + 32 >> 6);
			}
			local937 = 2;
			while (local937 < local296.length) {
				local943 = local296[local937];
				@Pc(949) byte local949 = local296[local937 + 1];
				local937 += 2;
				local963 = local908 * (local943 - local904) + (local943 - local904) / 2;
				for (local965 = local904; local965 < local943; local965++) {
					local975 = Static114.method1942(local963, local943 - local904);
					local963 += local949 - local908;
					this.aByteArray30[local965] = (byte) (local975 * this.aByteArray30[local965] + 32 >> 6);
				}
				local904 = local943;
				local908 = local949;
			}
			for (local1021 = local904; local1021 < 128; local1021++) {
				this.aByteArray30[local1021] = (byte) (this.aByteArray30[local1021] * local908 + 32 >> 6);
			}
		}
		@Pc(1085) int local1085;
		if (local311 != null) {
			local342 = local38.method2962();
			local311[0] = (byte) local342;
			for (local784 = 2; local784 < local311.length; local784 += 2) {
				local342 = local38.method2962() + local342 + 1;
				local311[local784] = (byte) local342;
			}
			local1085 = local311[1] << 1;
			local904 = local311[0];
			for (local910 = 0; local910 < local904; local910++) {
				local937 = local1085 + (this.aByteArray31[local910] & 0xFF);
				if (local937 < 0) {
					local937 = 0;
				}
				if (local937 > 128) {
					local937 = 128;
				}
				this.aByteArray31[local910] = (byte) local937;
			}
			local937 = 2;
			@Pc(1142) int local1142;
			while (local937 < local311.length) {
				local943 = local311[local937];
				local1142 = local311[local937 + 1] << 1;
				local937 += 2;
				local963 = (local943 - local904) / 2 + local1085 * (local943 - local904);
				for (local965 = local904; local965 < local943; local965++) {
					local975 = Static114.method1942(local963, local943 - local904);
					local963 += local1142 - local1085;
					@Pc(1184) int local1184 = local975 + (this.aByteArray31[local965] & 0xFF);
					if (local1184 < 0) {
						local1184 = 0;
					}
					if (local1184 > 128) {
						local1184 = 128;
					}
					this.aByteArray31[local965] = (byte) local1184;
				}
				local904 = local943;
				local1085 = local1142;
			}
			for (local1021 = local904; local1021 < 128; local1021++) {
				local1142 = local1085 + (this.aByteArray31[local1021] & 0xFF);
				if (local1142 < 0) {
					local1142 = 0;
				}
				if (local1142 > 128) {
					local1142 = 128;
				}
				this.aByteArray31[local1021] = (byte) local1142;
			}
		}
		for (local784 = 0; local784 < local188; local784++) {
			local229[local784].anInt2306 = local38.method2962();
		}
		for (local833 = 0; local833 < local188; local833++) {
			@Pc(1284) Class58 local1284 = local229[local833];
			if (local1284.aByteArray33 != null) {
				local1284.anInt2308 = local38.method2962();
			}
			if (local1284.aByteArray34 != null) {
				local1284.anInt2313 = local38.method2962();
			}
			if (local1284.anInt2306 > 0) {
				local1284.anInt2310 = local38.method2962();
			}
		}
		for (local1085 = 0; local1085 < local188; local1085++) {
			local229[local1085].anInt2305 = local38.method2962();
		}
		for (local910 = 0; local910 < local188; local910++) {
			@Pc(1338) Class58 local1338 = local229[local910];
			if (local1338.anInt2305 > 0) {
				local1338.anInt2309 = local38.method2962();
			}
		}
		for (local937 = 0; local937 < local188; local937++) {
			@Pc(1362) Class58 local1362 = local229[local937];
			if (local1362.anInt2309 > 0) {
				local1362.anInt2311 = local38.method2962();
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BLclient!cb;[I)Z")
	public boolean method1740(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(8) Class2_Sub5_Sub1 local8 = null;
		@Pc(14) boolean local14 = true;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray206[local18];
				if (local33 != 0) {
					if (local16 != local33) {
						local16 = local33--;
						if ((local33 & 0x1) == 0) {
							local8 = arg1.method402(arg2, local33 >> 2);
						} else {
							local8 = arg1.method404(local33 >> 2, arg2);
						}
						if (local8 == null) {
							local14 = false;
						}
					}
					if (local8 != null) {
						this.aClass2_Sub5_Sub1Array1[local18] = local8;
						this.anIntArray206[local18] = 0;
					}
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
	public void method1744() {
		this.anIntArray206 = null;
	}
}
