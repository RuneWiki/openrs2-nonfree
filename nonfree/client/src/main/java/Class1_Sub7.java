import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "[B")
	public byte[] aByteArray5 = new byte[128];

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "[S")
	public short[] aShortArray3 = new short[128];

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "[Lclient!bk;")
	public Class12[] aClass12Array1 = new Class12[128];

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "[B")
	public byte[] aByteArray6 = new byte[128];

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	public int anInt535;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "[B")
	public byte[] aByteArray7 = new byte[128];

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "[I")
	private int[] anIntArray55 = new int[128];

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "[Lclient!qa;")
	public Class1_Sub15_Sub1[] aClass1_Sub15_Sub1Array1 = new Class1_Sub15_Sub1[128];

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B)V")
	public Class1_Sub7(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class1_Sub17 local38 = new Class1_Sub17(arg0);
		while (local38.aByteArray40[local38.anInt2656 + local33] != 0) {
			local33++;
		}
		@Pc(56) byte[] local56 = new byte[local33];
		for (@Pc(58) int local58 = 0; local58 < local33; local58++) {
			local56[local58] = local38.method2155();
		}
		local38.anInt2656++;
		local33++;
		@Pc(84) int local84 = local38.anInt2656;
		local38.anInt2656 += local33;
		@Pc(92) int local92;
		for (local92 = 0; local38.aByteArray40[local38.anInt2656 + local92] != 0; local92++) {
		}
		@Pc(110) byte[] local110 = new byte[local92];
		for (@Pc(112) int local112 = 0; local112 < local92; local112++) {
			local110[local112] = local38.method2155();
		}
		local38.anInt2656++;
		@Pc(137) int local137 = local38.anInt2656;
		@Pc(139) int local139 = 0;
		local92++;
		local38.anInt2656 += local92;
		while (local38.aByteArray40[local139 + local38.anInt2656] != 0) {
			local139++;
		}
		@Pc(160) byte[] local160 = new byte[local139];
		for (@Pc(162) int local162 = 0; local162 < local139; local162++) {
			local160[local162] = local38.method2155();
		}
		local139++;
		local38.anInt2656++;
		@Pc(188) byte[] local188 = new byte[local139];
		@Pc(197) int local197;
		@Pc(201) int local201;
		@Pc(207) int local207;
		if (local139 > 1) {
			local188[1] = 1;
			local197 = 2;
			@Pc(199) int local199 = 1;
			for (local201 = 2; local201 < local139; local201++) {
				local207 = local38.method2142();
				if (local207 == 0) {
					local199 = local197++;
				} else {
					if (local207 <= local199) {
						local207--;
					}
					local199 = local207;
				}
				local188[local201] = (byte) local199;
			}
		} else {
			local197 = local139;
		}
		@Pc(240) Class12[] local240 = new Class12[local197];
		for (local201 = 0; local201 < local240.length; local201++) {
			@Pc(252) Class12 local252 = local240[local201] = new Class12();
			@Pc(256) int local256 = local38.method2142();
			if (local256 > 0) {
				local252.aByteArray4 = new byte[local256 * 2];
			}
			local256 = local38.method2142();
			if (local256 > 0) {
				local252.aByteArray3 = new byte[local256 * 2 + 2];
				local252.aByteArray3[1] = 64;
			}
		}
		local207 = local38.method2142();
		@Pc(308) byte[] local308 = local207 <= 0 ? null : new byte[local207 * 2];
		local207 = local38.method2142();
		@Pc(314) int local314;
		for (local314 = 0; local38.aByteArray40[local38.anInt2656 + local314] != 0; local314++) {
		}
		@Pc(338) byte[] local338 = local207 <= 0 ? null : new byte[local207 * 2];
		@Pc(341) byte[] local341 = new byte[local314];
		for (@Pc(343) int local343 = 0; local343 < local314; local343++) {
			local341[local343] = local38.method2155();
		}
		local314++;
		@Pc(362) int local362 = 0;
		local38.anInt2656++;
		for (@Pc(370) int local370 = 0; local370 < 128; local370++) {
			local362 += local38.method2142();
			this.aShortArray3[local370] = (short) local362;
		}
		local362 = 0;
		for (@Pc(394) int local394 = 0; local394 < 128; local394++) {
			local362 += local38.method2142();
			this.aShortArray3[local394] = (short) (this.aShortArray3[local394] + (local362 << 8));
		}
		@Pc(421) int local421 = 0;
		@Pc(423) int local423 = 0;
		@Pc(425) int local425 = 0;
		for (@Pc(427) int local427 = 0; local427 < 128; local427++) {
			if (local421 == 0) {
				if (local341.length > local423) {
					local421 = local341[local423++];
				} else {
					local421 = -1;
				}
				local425 = local38.method2164();
			}
			local421--;
			this.aShortArray3[local427] = (short) (this.aShortArray3[local427] + ((local425 - 1 & 0x2) << 14));
			this.anIntArray55[local427] = local425;
		}
		local423 = 0;
		local421 = 0;
		@Pc(481) int local481 = 0;
		for (@Pc(483) int local483 = 0; local483 < 128; local483++) {
			if (this.anIntArray55[local483] != 0) {
				if (local421 == 0) {
					if (local56.length > local423) {
						local421 = local56[local423++];
					} else {
						local421 = -1;
					}
					local481 = local38.aByteArray40[local84++] - 1;
				}
				this.aByteArray6[local483] = (byte) local481;
				local421--;
			}
		}
		@Pc(533) int local533 = 0;
		local421 = 0;
		local423 = 0;
		for (@Pc(539) int local539 = 0; local539 < 128; local539++) {
			if (this.anIntArray55[local539] != 0) {
				if (local421 == 0) {
					local533 = local38.aByteArray40[local137++] + 16 << 2;
					if (local423 < local110.length) {
						local421 = local110[local423++];
					} else {
						local421 = -1;
					}
				}
				local421--;
				this.aByteArray5[local539] = (byte) local533;
			}
		}
		local423 = 0;
		local421 = 0;
		@Pc(600) Class12 local600 = null;
		for (@Pc(602) int local602 = 0; local602 < 128; local602++) {
			if (this.anIntArray55[local602] != 0) {
				if (local421 == 0) {
					local600 = local240[local188[local423]];
					if (local160.length <= local423) {
						local421 = -1;
					} else {
						local421 = local160[local423++];
					}
				}
				this.aClass12Array1[local602] = local600;
				local421--;
			}
		}
		local423 = 0;
		local421 = 0;
		@Pc(657) int local657 = 0;
		for (@Pc(659) int local659 = 0; local659 < 128; local659++) {
			if (local421 == 0) {
				if (local341.length <= local423) {
					local421 = -1;
				} else {
					local421 = local341[local423++];
				}
				if (this.anIntArray55[local659] > 0) {
					local657 = local38.method2142() + 1;
				}
			}
			local421--;
			this.aByteArray7[local659] = (byte) local657;
		}
		this.anInt535 = local38.method2142() + 1;
		@Pc(724) int local724;
		for (@Pc(713) int local713 = 0; local713 < local197; local713++) {
			@Pc(719) Class12 local719 = local240[local713];
			if (local719.aByteArray4 != null) {
				for (local724 = 1; local724 < local719.aByteArray4.length; local724 += 2) {
					local719.aByteArray4[local724] = local38.method2155();
				}
			}
			if (local719.aByteArray3 != null) {
				for (local724 = 3; local724 < local719.aByteArray3.length - 2; local724 += 2) {
					local719.aByteArray3[local724] = local38.method2155();
				}
			}
		}
		@Pc(781) int local781;
		if (local308 != null) {
			for (local781 = 1; local781 < local308.length; local781 += 2) {
				local308[local781] = local38.method2155();
			}
		}
		if (local338 != null) {
			for (local781 = 1; local781 < local338.length; local781 += 2) {
				local338[local781] = local38.method2155();
			}
		}
		@Pc(834) int local834;
		for (local781 = 0; local781 < local197; local781++) {
			@Pc(827) Class12 local827 = local240[local781];
			if (local827.aByteArray3 != null) {
				local362 = 0;
				for (local834 = 2; local834 < local827.aByteArray3.length; local834 += 2) {
					local362 = local38.method2142() + local362 + 1;
					local827.aByteArray3[local834] = (byte) local362;
				}
			}
		}
		@Pc(875) int local875;
		for (local724 = 0; local724 < local197; local724++) {
			@Pc(868) Class12 local868 = local240[local724];
			if (local868.aByteArray4 != null) {
				local362 = 0;
				for (local875 = 2; local875 < local868.aByteArray4.length; local875 += 2) {
					local362 = local38.method2142() + local362 + 1;
					local868.aByteArray4[local875] = (byte) local362;
				}
			}
		}
		@Pc(948) int local948;
		@Pc(971) int local971;
		@Pc(977) byte local977;
		@Pc(991) int local991;
		@Pc(999) int local999;
		@Pc(1008) int local1008;
		@Pc(942) byte local942;
		@Pc(1045) int local1045;
		if (local308 != null) {
			local362 = local38.method2142();
			local308[0] = (byte) local362;
			for (local834 = 2; local834 < local308.length; local834 += 2) {
				local362 -= -local38.method2142() - 1;
				local308[local834] = (byte) local362;
			}
			local942 = local308[0];
			@Pc(946) byte local946 = local308[1];
			for (local948 = 0; local948 < local942; local948++) {
				this.aByteArray7[local948] = (byte) (local946 * this.aByteArray7[local948] + 32 >> 6);
			}
			for (local971 = 2; local971 < local308.length; local971 += 2) {
				local977 = local308[local971];
				local991 = (local977 - local942) / 2 + local946 * (local977 - local942);
				@Pc(997) byte local997 = local308[local971 + 1];
				for (local999 = local942; local999 < local977; local999++) {
					local1008 = Static105.method1614(local977 - local942, local991);
					local991 += local997 - local946;
					this.aByteArray7[local999] = (byte) (local1008 * this.aByteArray7[local999] + 32 >> 6);
				}
				local946 = local997;
				local942 = local977;
			}
			for (local1045 = local942; local1045 < 128; local1045++) {
				this.aByteArray7[local1045] = (byte) (local946 * this.aByteArray7[local1045] + 32 >> 6);
			}
		}
		@Pc(1113) int local1113;
		if (local338 != null) {
			local362 = local38.method2142();
			local338[0] = (byte) local362;
			for (local834 = 2; local834 < local338.length; local834 += 2) {
				local362 = local38.method2142() + local362 + 1;
				local338[local834] = (byte) local362;
			}
			local942 = local338[0];
			local1113 = local338[1] << 1;
			for (local948 = 0; local948 < local942; local948++) {
				local971 = local1113 + (this.aByteArray5[local948] & 0xFF);
				if (local971 < 0) {
					local971 = 0;
				}
				if (local971 > 128) {
					local971 = 128;
				}
				this.aByteArray5[local948] = (byte) local971;
			}
			local971 = 2;
			@Pc(1164) int local1164;
			while (local971 < local338.length) {
				local977 = local338[local971];
				local1164 = local338[local971 + 1] << 1;
				local991 = (local977 - local942) / 2 + local1113 * (local977 - local942);
				for (local999 = local942; local999 < local977; local999++) {
					local1008 = Static105.method1614(local977 - local942, local991);
					local991 += local1164 - local1113;
					@Pc(1205) int local1205 = local1008 + (this.aByteArray5[local999] & 0xFF);
					if (local1205 < 0) {
						local1205 = 0;
					}
					if (local1205 > 128) {
						local1205 = 128;
					}
					this.aByteArray5[local999] = (byte) local1205;
				}
				local971 += 2;
				local1113 = local1164;
				local942 = local977;
			}
			for (local1045 = local942; local1045 < 128; local1045++) {
				local1164 = local1113 + (this.aByteArray5[local1045] & 0xFF);
				if (local1164 < 0) {
					local1164 = 0;
				}
				if (local1164 > 128) {
					local1164 = 128;
				}
				this.aByteArray5[local1045] = (byte) local1164;
			}
		}
		for (local834 = 0; local834 < local197; local834++) {
			local240[local834].anInt431 = local38.method2142();
		}
		for (local875 = 0; local875 < local197; local875++) {
			@Pc(1299) Class12 local1299 = local240[local875];
			if (local1299.aByteArray4 != null) {
				local1299.anInt425 = local38.method2142();
			}
			if (local1299.aByteArray3 != null) {
				local1299.anInt428 = local38.method2142();
			}
			if (local1299.anInt431 > 0) {
				local1299.anInt429 = local38.method2142();
			}
		}
		for (local1113 = 0; local1113 < local197; local1113++) {
			local240[local1113].anInt432 = local38.method2142();
		}
		for (local948 = 0; local948 < local197; local948++) {
			@Pc(1354) Class12 local1354 = local240[local948];
			if (local1354.anInt432 > 0) {
				local1354.anInt426 = local38.method2142();
			}
		}
		for (local971 = 0; local971 < local197; local971++) {
			@Pc(1374) Class12 local1374 = local240[local971];
			if (local1374.anInt426 > 0) {
				local1374.anInt424 = local38.method2142();
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z[I[BLclient!kk;)Z")
	public boolean method391(@OriginalArg(1) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = true;
		@Pc(11) Class1_Sub15_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray55[local13];
				if (local25 != 0) {
					if (local25 != local7) {
						local7 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg2.method1842(arg0, local25 >> 2);
						} else {
							local11 = arg2.method1846(local25 >> 2, arg0);
						}
						if (local11 == null) {
							local9 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub15_Sub1Array1[local13] = local11;
						this.anIntArray55[local13] = 0;
					}
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	public void method392() {
		this.anIntArray55 = null;
	}
}
