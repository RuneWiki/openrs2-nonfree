import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "[Lclient!u;")
	public final Class1_Sub14_Sub1[] aClass1_Sub14_Sub1Array1 = new Class1_Sub14_Sub1[128];

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "[B")
	public final byte[] aByteArray2 = new byte[128];

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "[B")
	public final byte[] aByteArray3 = new byte[128];

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "[Lclient!ve;")
	public final Class77[] aClass77Array1 = new Class77[128];

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "[S")
	public final short[] aShortArray17;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "[B")
	public final byte[] aByteArray4;

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
	public final int anInt478;

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "[I")
	private int[] anIntArray79 = new int[128];

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "([B)V")
	public Class1_Sub6(@OriginalArg(0) byte[] arg0) {
		@Pc(25) int local25 = 0;
		this.aShortArray17 = new short[128];
		this.aByteArray4 = new byte[128];
		@Pc(38) Class1_Sub12 local38 = new Class1_Sub12(arg0);
		while (local38.aByteArray12[local38.anInt1694 + local25] != 0) {
			local25++;
		}
		@Pc(53) byte[] local53 = new byte[local25];
		for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
			local53[local55] = local38.method1211();
		}
		local25++;
		@Pc(70) int local70 = 0;
		local38.anInt1694++;
		@Pc(79) int local79 = local38.anInt1694;
		local38.anInt1694 += local25;
		while (local38.aByteArray12[local38.anInt1694 + local70] != 0) {
			local70++;
		}
		@Pc(100) byte[] local100 = new byte[local70];
		for (@Pc(102) int local102 = 0; local102 < local70; local102++) {
			local100[local102] = local38.method1211();
		}
		local38.anInt1694++;
		local70++;
		@Pc(127) int local127 = 0;
		@Pc(130) int local130 = local38.anInt1694;
		local38.anInt1694 += local70;
		while (local38.aByteArray12[local38.anInt1694 + local127] != 0) {
			local127++;
		}
		@Pc(154) byte[] local154 = new byte[local127];
		for (@Pc(156) int local156 = 0; local156 < local127; local156++) {
			local154[local156] = local38.method1211();
		}
		local127++;
		local38.anInt1694++;
		@Pc(178) byte[] local178 = new byte[local127];
		@Pc(187) int local187;
		@Pc(191) int local191;
		@Pc(197) int local197;
		if (local127 > 1) {
			local178[1] = 1;
			local187 = 2;
			@Pc(189) int local189 = 1;
			for (local191 = 2; local191 < local127; local191++) {
				local197 = local38.method1190();
				if (local197 == 0) {
					local189 = local187++;
				} else {
					if (local197 <= local189) {
						local197--;
					}
					local189 = local197;
				}
				local178[local191] = (byte) local189;
			}
		} else {
			local187 = local127;
		}
		@Pc(237) Class77[] local237 = new Class77[local187];
		for (local191 = 0; local191 < local237.length; local191++) {
			@Pc(249) Class77 local249 = local237[local191] = new Class77();
			@Pc(253) int local253 = local38.method1190();
			if (local253 > 0) {
				local249.aByteArray42 = new byte[local253 * 2];
			}
			local253 = local38.method1190();
			if (local253 > 0) {
				local249.aByteArray41 = new byte[local253 * 2 + 2];
				local249.aByteArray41[1] = 64;
			}
		}
		local197 = local38.method1190();
		@Pc(301) byte[] local301 = local197 > 0 ? new byte[local197 * 2] : null;
		local197 = local38.method1190();
		@Pc(317) byte[] local317 = local197 <= 0 ? null : new byte[local197 * 2];
		@Pc(319) int local319;
		for (local319 = 0; local38.aByteArray12[local319 + local38.anInt1694] != 0; local319++) {
		}
		@Pc(333) byte[] local333 = new byte[local319];
		for (@Pc(335) int local335 = 0; local335 < local319; local335++) {
			local333[local335] = local38.method1211();
		}
		local319++;
		local38.anInt1694++;
		@Pc(360) int local360 = 0;
		for (@Pc(362) int local362 = 0; local362 < 128; local362++) {
			local360 += local38.method1190();
			this.aShortArray17[local362] = (short) local360;
		}
		local360 = 0;
		for (@Pc(386) int local386 = 0; local386 < 128; local386++) {
			local360 += local38.method1190();
			this.aShortArray17[local386] = (short) (this.aShortArray17[local386] + (local360 << 8));
		}
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		for (@Pc(417) int local417 = 0; local417 < 128; local417++) {
			if (local411 == 0) {
				if (local333.length <= local413) {
					local411 = -1;
				} else {
					local411 = local333[local413++];
				}
				local415 = local38.method1169();
			}
			this.aShortArray17[local417] = (short) (this.aShortArray17[local417] + ((local415 - 1 & 0x2) << 14));
			local411--;
			this.anIntArray79[local417] = local415;
		}
		local413 = 0;
		local411 = 0;
		@Pc(475) int local475 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray79[local477] != 0) {
				if (local411 == 0) {
					if (local53.length <= local413) {
						local411 = -1;
					} else {
						local411 = local53[local413++];
					}
					local475 = local38.aByteArray12[local79++] - 1;
				}
				this.aByteArray3[local477] = (byte) local475;
				local411--;
			}
		}
		local411 = 0;
		local413 = 0;
		@Pc(524) int local524 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray79[local526] != 0) {
				if (local411 == 0) {
					if (local100.length > local413) {
						local411 = local100[local413++];
					} else {
						local411 = -1;
					}
					local524 = local38.aByteArray12[local130++] + 16 << 2;
				}
				local411--;
				this.aByteArray4[local526] = (byte) local524;
			}
		}
		@Pc(571) Class77 local571 = null;
		local411 = 0;
		local413 = 0;
		for (@Pc(577) int local577 = 0; local577 < 128; local577++) {
			if (this.anIntArray79[local577] != 0) {
				if (local411 == 0) {
					local571 = local237[local178[local413]];
					if (local413 < local154.length) {
						local411 = local154[local413++];
					} else {
						local411 = -1;
					}
				}
				this.aClass77Array1[local577] = local571;
				local411--;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(623) int local623 = 0;
		for (@Pc(625) int local625 = 0; local625 < 128; local625++) {
			if (local411 == 0) {
				if (local413 >= local333.length) {
					local411 = -1;
				} else {
					local411 = local333[local413++];
				}
				if (this.anIntArray79[local625] > 0) {
					local623 = local38.method1190() + 1;
				}
			}
			this.aByteArray2[local625] = (byte) local623;
			local411--;
		}
		this.anInt478 = local38.method1190() + 1;
		@Pc(687) int local687;
		for (@Pc(676) int local676 = 0; local676 < local187; local676++) {
			@Pc(682) Class77 local682 = local237[local676];
			if (local682.aByteArray42 != null) {
				for (local687 = 1; local687 < local682.aByteArray42.length; local687 += 2) {
					local682.aByteArray42[local687] = local38.method1211();
				}
			}
			if (local682.aByteArray41 != null) {
				for (local687 = 3; local687 < local682.aByteArray41.length - 2; local687 += 2) {
					local682.aByteArray41[local687] = local38.method1211();
				}
			}
		}
		@Pc(736) int local736;
		if (local301 != null) {
			for (local736 = 1; local736 < local301.length; local736 += 2) {
				local301[local736] = local38.method1211();
			}
		}
		if (local317 != null) {
			for (local736 = 1; local736 < local317.length; local736 += 2) {
				local317[local736] = local38.method1211();
			}
		}
		@Pc(789) int local789;
		for (local736 = 0; local736 < local187; local736++) {
			@Pc(782) Class77 local782 = local237[local736];
			if (local782.aByteArray41 != null) {
				local360 = 0;
				for (local789 = 2; local789 < local782.aByteArray41.length; local789 += 2) {
					local360 += local38.method1190() + 1;
					local782.aByteArray41[local789] = (byte) local360;
				}
			}
		}
		@Pc(830) int local830;
		for (local687 = 0; local687 < local187; local687++) {
			@Pc(823) Class77 local823 = local237[local687];
			if (local823.aByteArray42 != null) {
				local360 = 0;
				for (local830 = 2; local830 < local823.aByteArray42.length; local830 += 2) {
					local360 += local38.method1190() + 1;
					local823.aByteArray42[local830] = (byte) local360;
				}
			}
		}
		@Pc(911) int local911;
		@Pc(938) int local938;
		@Pc(950) byte local950;
		@Pc(964) int local964;
		@Pc(966) int local966;
		@Pc(975) int local975;
		@Pc(905) byte local905;
		@Pc(1016) int local1016;
		if (local301 != null) {
			local360 = local38.method1190();
			local301[0] = (byte) local360;
			for (local789 = 2; local789 < local301.length; local789 += 2) {
				local360 = local360 + local38.method1190() + 1;
				local301[local789] = (byte) local360;
			}
			local905 = local301[0];
			@Pc(909) byte local909 = local301[1];
			for (local911 = 0; local911 < local905; local911++) {
				this.aByteArray2[local911] = (byte) (this.aByteArray2[local911] * local909 + 32 >> 6);
			}
			for (local938 = 2; local938 < local301.length; local938 += 2) {
				@Pc(946) byte local946 = local301[local938 + 1];
				local950 = local301[local938];
				local964 = (local950 - local905) * local909 + (local950 - local905) / 2;
				for (local966 = local905; local966 < local950; local966++) {
					local975 = Static68.method1380(local950 - local905, local964);
					this.aByteArray2[local966] = (byte) (this.aByteArray2[local966] * local975 + 32 >> 6);
					local964 += local946 - local909;
				}
				local909 = local946;
				local905 = local950;
			}
			for (local1016 = local905; local1016 < 128; local1016++) {
				this.aByteArray2[local1016] = (byte) (local909 * this.aByteArray2[local1016] + 32 >> 6);
			}
		}
		@Pc(1082) int local1082;
		if (local317 != null) {
			local360 = local38.method1190();
			local317[0] = (byte) local360;
			for (local789 = 2; local789 < local317.length; local789 += 2) {
				local360 += local38.method1190() + 1;
				local317[local789] = (byte) local360;
			}
			local1082 = local317[1] << 1;
			local905 = local317[0];
			for (local911 = 0; local911 < local905; local911++) {
				local938 = local1082 + (this.aByteArray4[local911] & 0xFF);
				if (local938 < 0) {
					local938 = 0;
				}
				if (local938 > 128) {
					local938 = 128;
				}
				this.aByteArray4[local911] = (byte) local938;
			}
			@Pc(1152) int local1152;
			for (local938 = 2; local938 < local317.length; local938 += 2) {
				local950 = local317[local938];
				local964 = (local950 - local905) * local1082 + (local950 - local905) / 2;
				local1152 = local317[local938 + 1] << 1;
				for (local966 = local905; local966 < local950; local966++) {
					local975 = Static68.method1380(local950 - local905, local964);
					@Pc(1174) int local1174 = (this.aByteArray4[local966] & 0xFF) + local975;
					local964 += local1152 - local1082;
					if (local1174 < 0) {
						local1174 = 0;
					}
					if (local1174 > 128) {
						local1174 = 128;
					}
					this.aByteArray4[local966] = (byte) local1174;
				}
				local905 = local950;
				local1082 = local1152;
			}
			for (local1016 = local905; local1016 < 128; local1016++) {
				local1152 = local1082 + (this.aByteArray4[local1016] & 0xFF);
				if (local1152 < 0) {
					local1152 = 0;
				}
				if (local1152 > 128) {
					local1152 = 128;
				}
				this.aByteArray4[local1016] = (byte) local1152;
			}
		}
		for (local789 = 0; local789 < local187; local789++) {
			local237[local789].anInt2889 = local38.method1190();
		}
		for (local830 = 0; local830 < local187; local830++) {
			@Pc(1281) Class77 local1281 = local237[local830];
			if (local1281.aByteArray42 != null) {
				local1281.anInt2876 = local38.method1190();
			}
			if (local1281.aByteArray41 != null) {
				local1281.anInt2879 = local38.method1190();
			}
			if (local1281.anInt2889 > 0) {
				local1281.anInt2884 = local38.method1190();
			}
		}
		for (local1082 = 0; local1082 < local187; local1082++) {
			local237[local1082].anInt2881 = local38.method1190();
		}
		for (local911 = 0; local911 < local187; local911++) {
			@Pc(1339) Class77 local1339 = local237[local911];
			if (local1339.anInt2881 > 0) {
				local1339.anInt2883 = local38.method1190();
			}
		}
		for (local938 = 0; local938 < local187; local938++) {
			@Pc(1366) Class77 local1366 = local237[local938];
			if (local1366.anInt2883 > 0) {
				local1366.anInt2885 = local38.method1190();
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([ILclient!p;B[B)Z")
	public boolean method406(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub14_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(30) int local30 = this.anIntArray79[local13];
				if (local30 != 0) {
					if (local9 != local30) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local11 = arg1.method1504(arg0, local30 >> 2);
						} else {
							local11 = arg1.method1510(arg0, local30 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub14_Sub1Array1[local13] = local11;
						this.anIntArray79[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public void method407() {
		this.anIntArray79 = null;
	}
}
