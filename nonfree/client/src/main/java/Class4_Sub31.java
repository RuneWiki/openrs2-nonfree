import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
	public int anInt4413;

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "[Lclient!qc;")
	public Class164[] aClass164Array1;

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "[I")
	private int[] anIntArray368;

	@OriginalMember(owner = "client!nl", name = "B", descriptor = "[Lclient!wo;")
	public Class4_Sub5_Sub1[] aClass4_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!nl", name = "D", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	private Class4_Sub31() {
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([B)V")
	public Class4_Sub31(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub5_Sub1Array1 = new Class4_Sub5_Sub1[128];
		this.aByteArray53 = new byte[128];
		this.aByteArray51 = new byte[128];
		this.aByteArray52 = new byte[128];
		this.anIntArray368 = new int[128];
		this.aShortArray67 = new short[128];
		this.aClass164Array1 = new Class164[128];
		@Pc(36) Class4_Sub7 local36 = new Class4_Sub7(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray42[local36.anInt2667 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method2393();
		}
		local38++;
		local36.anInt2667++;
		@Pc(80) int local80 = local36.anInt2667;
		local36.anInt2667 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray42[local88 + local36.anInt2667] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method2393();
		}
		local88++;
		local36.anInt2667++;
		@Pc(129) int local129 = local36.anInt2667;
		local36.anInt2667 += local88;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray42[local36.anInt2667 + local137] != 0; local137++) {
		}
		@Pc(151) byte[] local151 = new byte[local137];
		for (@Pc(153) int local153 = 0; local153 < local137; local153++) {
			local151[local153] = local36.method2393();
		}
		local36.anInt2667++;
		local137++;
		@Pc(179) byte[] local179 = new byte[local137];
		@Pc(186) int local186;
		@Pc(198) int local198;
		@Pc(204) int local204;
		if (local137 <= 1) {
			local186 = local137;
		} else {
			local179[1] = 1;
			@Pc(194) int local194 = 1;
			local186 = 2;
			for (local198 = 2; local198 < local137; local198++) {
				local204 = local36.method2380();
				if (local204 == 0) {
					local194 = local186++;
				} else {
					if (local204 <= local194) {
						local204--;
					}
					local194 = local204;
				}
				local179[local198] = (byte) local194;
			}
		}
		@Pc(240) Class164[] local240 = new Class164[local186];
		for (local198 = 0; local198 < local240.length; local198++) {
			@Pc(252) Class164 local252 = local240[local198] = new Class164();
			@Pc(256) int local256 = local36.method2380();
			if (local256 > 0) {
				local252.aByteArray80 = new byte[local256 * 2];
			}
			local256 = local36.method2380();
			if (local256 > 0) {
				local252.aByteArray79 = new byte[local256 * 2 + 2];
				local252.aByteArray79[1] = 64;
			}
		}
		local204 = local36.method2380();
		@Pc(311) byte[] local311 = local204 <= 0 ? null : new byte[local204 * 2];
		local204 = local36.method2380();
		@Pc(327) byte[] local327 = local204 <= 0 ? null : new byte[local204 * 2];
		@Pc(329) int local329;
		for (local329 = 0; local36.aByteArray42[local36.anInt2667 + local329] != 0; local329++) {
		}
		@Pc(343) byte[] local343 = new byte[local329];
		for (@Pc(345) int local345 = 0; local345 < local329; local345++) {
			local343[local345] = local36.method2393();
		}
		local329++;
		local36.anInt2667++;
		@Pc(370) int local370 = 0;
		for (@Pc(372) int local372 = 0; local372 < 128; local372++) {
			local370 += local36.method2380();
			this.aShortArray67[local372] = (short) local370;
		}
		local370 = 0;
		for (@Pc(394) int local394 = 0; local394 < 128; local394++) {
			local370 += local36.method2380();
			this.aShortArray67[local394] = (short) (this.aShortArray67[local394] + (local370 << 8));
		}
		@Pc(421) int local421 = 0;
		@Pc(423) int local423 = 0;
		@Pc(425) int local425 = 0;
		for (@Pc(427) int local427 = 0; local427 < 128; local427++) {
			if (local421 == 0) {
				if (local343.length > local423) {
					local421 = local343[local423++];
				} else {
					local421 = -1;
				}
				local425 = local36.method2359();
			}
			this.aShortArray67[local427] = (short) (this.aShortArray67[local427] + ((local425 - 1 & 0x2) << 14));
			local421--;
			this.anIntArray368[local427] = local425;
		}
		local423 = 0;
		local421 = 0;
		@Pc(482) int local482 = 0;
		for (@Pc(484) int local484 = 0; local484 < 128; local484++) {
			if (this.anIntArray368[local484] != 0) {
				if (local421 == 0) {
					if (local52.length > local423) {
						local421 = local52[local423++];
					} else {
						local421 = -1;
					}
					local482 = local36.aByteArray42[local80++] - 1;
				}
				local421--;
				this.aByteArray52[local484] = (byte) local482;
			}
		}
		local421 = 0;
		local423 = 0;
		@Pc(536) int local536 = 0;
		for (@Pc(538) int local538 = 0; local538 < 128; local538++) {
			if (this.anIntArray368[local538] != 0) {
				if (local421 == 0) {
					local536 = local36.aByteArray42[local129++] + 16 << 2;
					if (local105.length <= local423) {
						local421 = -1;
					} else {
						local421 = local105[local423++];
					}
				}
				this.aByteArray51[local538] = (byte) local536;
				local421--;
			}
		}
		local423 = 0;
		local421 = 0;
		@Pc(594) Class164 local594 = null;
		for (@Pc(596) int local596 = 0; local596 < 128; local596++) {
			if (this.anIntArray368[local596] != 0) {
				if (local421 == 0) {
					local594 = local240[local179[local423]];
					if (local423 >= local151.length) {
						local421 = -1;
					} else {
						local421 = local151[local423++];
					}
				}
				this.aClass164Array1[local596] = local594;
				local421--;
			}
		}
		local421 = 0;
		local423 = 0;
		@Pc(648) int local648 = 0;
		for (@Pc(650) int local650 = 0; local650 < 128; local650++) {
			if (local421 == 0) {
				if (local423 < local343.length) {
					local421 = local343[local423++];
				} else {
					local421 = -1;
				}
				if (this.anIntArray368[local650] > 0) {
					local648 = local36.method2380() + 1;
				}
			}
			this.aByteArray53[local650] = (byte) local648;
			local421--;
		}
		this.anInt4413 = local36.method2380() + 1;
		@Pc(719) int local719;
		for (@Pc(708) int local708 = 0; local708 < local186; local708++) {
			@Pc(714) Class164 local714 = local240[local708];
			if (local714.aByteArray80 != null) {
				for (local719 = 1; local719 < local714.aByteArray80.length; local719 += 2) {
					local714.aByteArray80[local719] = local36.method2393();
				}
			}
			if (local714.aByteArray79 != null) {
				for (local719 = 3; local719 < local714.aByteArray79.length - 2; local719 += 2) {
					local714.aByteArray79[local719] = local36.method2393();
				}
			}
		}
		@Pc(768) int local768;
		if (local311 != null) {
			for (local768 = 1; local768 < local311.length; local768 += 2) {
				local311[local768] = local36.method2393();
			}
		}
		if (local327 != null) {
			for (local768 = 1; local768 < local327.length; local768 += 2) {
				local327[local768] = local36.method2393();
			}
		}
		@Pc(821) int local821;
		for (local768 = 0; local768 < local186; local768++) {
			@Pc(814) Class164 local814 = local240[local768];
			if (local814.aByteArray79 != null) {
				local370 = 0;
				for (local821 = 2; local821 < local814.aByteArray79.length; local821 += 2) {
					local370 += local36.method2380() + 1;
					local814.aByteArray79[local821] = (byte) local370;
				}
			}
		}
		@Pc(866) int local866;
		for (local719 = 0; local719 < local186; local719++) {
			@Pc(859) Class164 local859 = local240[local719];
			if (local859.aByteArray80 != null) {
				local370 = 0;
				for (local866 = 2; local866 < local859.aByteArray80.length; local866 += 2) {
					local370 += local36.method2380() + 1;
					local859.aByteArray80[local866] = (byte) local370;
				}
			}
		}
		@Pc(940) int local940;
		@Pc(963) int local963;
		@Pc(969) byte local969;
		@Pc(989) int local989;
		@Pc(991) int local991;
		@Pc(1001) int local1001;
		@Pc(934) byte local934;
		@Pc(1041) int local1041;
		if (local311 != null) {
			local370 = local36.method2380();
			local311[0] = (byte) local370;
			for (local821 = 2; local821 < local311.length; local821 += 2) {
				local370 = local370 + local36.method2380() + 1;
				local311[local821] = (byte) local370;
			}
			local934 = local311[0];
			@Pc(938) byte local938 = local311[1];
			for (local940 = 0; local940 < local934; local940++) {
				this.aByteArray53[local940] = (byte) (this.aByteArray53[local940] * local938 + 32 >> 6);
			}
			local963 = 2;
			while (local963 < local311.length) {
				local969 = local311[local963];
				@Pc(975) byte local975 = local311[local963 + 1];
				local989 = (local969 - local934) * local938 + (local969 - local934) / 2;
				for (local991 = local934; local991 < local969; local991++) {
					local1001 = Static131.method2639(local989, local969 - local934);
					local989 += local975 - local938;
					this.aByteArray53[local991] = (byte) (local1001 * this.aByteArray53[local991] + 32 >> 6);
				}
				local934 = local969;
				local963 += 2;
				local938 = local975;
			}
			for (local1041 = local934; local1041 < 128; local1041++) {
				this.aByteArray53[local1041] = (byte) (this.aByteArray53[local1041] * local938 + 32 >> 6);
			}
		}
		@Pc(1109) int local1109;
		if (local327 != null) {
			local370 = local36.method2380();
			local327[0] = (byte) local370;
			for (local821 = 2; local821 < local327.length; local821 += 2) {
				local370 = local36.method2380() + local370 + 1;
				local327[local821] = (byte) local370;
			}
			local934 = local327[0];
			local1109 = local327[1] << 1;
			for (local940 = 0; local940 < local934; local940++) {
				local963 = (this.aByteArray51[local940] & 0xFF) + local1109;
				if (local963 < 0) {
					local963 = 0;
				}
				if (local963 > 128) {
					local963 = 128;
				}
				this.aByteArray51[local940] = (byte) local963;
			}
			local963 = 2;
			@Pc(1167) int local1167;
			while (local327.length > local963) {
				local969 = local327[local963];
				local1167 = local327[local963 + 1] << 1;
				local989 = (local969 - local934) / 2 + (local969 - local934) * local1109;
				for (local991 = local934; local991 < local969; local991++) {
					local1001 = Static131.method2639(local989, local969 - local934);
					@Pc(1200) int local1200 = local1001 + (this.aByteArray51[local991] & 0xFF);
					if (local1200 < 0) {
						local1200 = 0;
					}
					if (local1200 > 128) {
						local1200 = 128;
					}
					this.aByteArray51[local991] = (byte) local1200;
					local989 += local1167 - local1109;
				}
				local963 += 2;
				local934 = local969;
				local1109 = local1167;
			}
			for (local1041 = local934; local1041 < 128; local1041++) {
				local1167 = local1109 + (this.aByteArray51[local1041] & 0xFF);
				if (local1167 < 0) {
					local1167 = 0;
				}
				if (local1167 > 128) {
					local1167 = 128;
				}
				this.aByteArray51[local1041] = (byte) local1167;
			}
		}
		for (local821 = 0; local821 < local186; local821++) {
			local240[local821].anInt5256 = local36.method2380();
		}
		for (local866 = 0; local866 < local186; local866++) {
			@Pc(1303) Class164 local1303 = local240[local866];
			if (local1303.aByteArray80 != null) {
				local1303.anInt5251 = local36.method2380();
			}
			if (local1303.aByteArray79 != null) {
				local1303.anInt5250 = local36.method2380();
			}
			if (local1303.anInt5256 > 0) {
				local1303.anInt5254 = local36.method2380();
			}
		}
		for (local1109 = 0; local1109 < local186; local1109++) {
			local240[local1109].anInt5253 = local36.method2380();
		}
		for (local940 = 0; local940 < local186; local940++) {
			@Pc(1365) Class164 local1365 = local240[local940];
			if (local1365.anInt5253 > 0) {
				local1365.anInt5252 = local36.method2380();
			}
		}
		for (local963 = 0; local963 < local186; local963++) {
			@Pc(1389) Class164 local1389 = local240[local963];
			if (local1389.anInt5252 > 0) {
				local1389.anInt5249 = local36.method2380();
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!qb;[I[B)Z")
	public boolean method3680(@OriginalArg(1) Class163 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class4_Sub5_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(36) int local36 = this.anIntArray368[local13];
				if (local36 != 0) {
					if (local9 != local36) {
						local9 = local36--;
						if ((local36 & 0x1) == 0) {
							local11 = arg0.method4356(arg1, local36 >> 2);
						} else {
							local11 = arg0.method4354(arg1, local36 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass4_Sub5_Sub1Array1[local13] = local11;
						this.anIntArray368[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
	public void method3684() {
		this.anIntArray368 = null;
	}
}
