import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ke", name = "nb", descriptor = "[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] aClass1_Sub1_Sub8_Sub1Array4;

	@OriginalMember(owner = "client!ke", name = "ab", descriptor = "Lclient!gb;")
	public static Class23 aClass23_1 = new Class23();

	@OriginalMember(owner = "client!ke", name = "db", descriptor = "Lclient!ea;")
	public static Class18 aClass18_589 = Static8.method128("(Z");

	@OriginalMember(owner = "client!ke", name = "eb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_590 = Static8.method128("The server is being updated)3");

	@OriginalMember(owner = "client!ke", name = "fb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_591 = aClass18_590;

	@OriginalMember(owner = "client!ke", name = "ib", descriptor = "I")
	public static int anInt2478 = 0;

	@OriginalMember(owner = "client!ke", name = "ob", descriptor = "Lclient!hc;")
	public static Class1_Sub6 aClass1_Sub6_2 = new Class1_Sub6(new byte[5000]);

	@OriginalMember(owner = "client!ke", name = "pb", descriptor = "I")
	public static int anInt2482 = 0;

	@OriginalMember(owner = "client!ke", name = "qb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_592 = Static8.method128("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)V")
	public static void method1788() {
		for (@Pc(8) int local8 = 0; local8 < Static33.anInt1116; local8++) {
			@Pc(14) int local14 = Static167.anIntArray412[local8]--;
			if (Static167.anIntArray412[local8] >= -10) {
				@Pc(87) Class12 local87 = Static159.aClass12Array1[local8];
				if (local87 == null) {
					local87 = Static181.method383(Static12.aClass16_Sub1_51, Static101.anIntArray268[local8], 0);
					if (local87 == null) {
						continue;
					}
					Static167.anIntArray412[local8] += local87.method384();
					Static159.aClass12Array1[local8] = local87;
				}
				if (Static167.anIntArray412[local8] < 0) {
					@Pc(212) int local212;
					if (Static124.anIntArray312[local8] == 0) {
						local212 = Static69.anInt2081;
					} else {
						@Pc(128) int local128 = (Static124.anIntArray312[local8] & 0xFF) * 128;
						@Pc(136) int local136 = Static124.anIntArray312[local8] >> 16 & 0xFF;
						@Pc(146) int local146 = local136 * 128 + 64 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579;
						if (local146 < 0) {
							local146 = -local146;
						}
						@Pc(162) int local162 = Static124.anIntArray312[local8] >> 8 & 0xFF;
						@Pc(172) int local172 = local162 * 128 + 64 - Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558;
						if (local172 < 0) {
							local172 = -local172;
						}
						@Pc(187) int local187 = local146 + local172 - 128;
						if (local187 > local128) {
							Static167.anIntArray412[local8] = -100;
							continue;
						}
						if (local187 < 0) {
							local187 = 0;
						}
						local212 = (local128 - local187) * Static97.anInt3004 / local128;
					}
					if (local212 > 0) {
						@Pc(223) Class1_Sub13_Sub1 local223 = local87.method381().method1445(Static174.aClass32_1);
						@Pc(228) Class1_Sub5_Sub4 local228 = Static183.method1320(local223, local212);
						local228.method1357(Static71.anIntArray190[local8] - 1);
						Static2.aClass1_Sub5_Sub2_1.method1188(local228);
					}
					Static167.anIntArray412[local8] = -100;
				}
			} else {
				Static33.anInt1116--;
				for (@Pc(30) int local30 = local8; local30 < Static33.anInt1116; local30++) {
					Static101.anIntArray268[local30] = Static101.anIntArray268[local30 + 1];
					Static159.aClass12Array1[local30] = Static159.aClass12Array1[local30 + 1];
					Static71.anIntArray190[local30] = Static71.anIntArray190[local30 + 1];
					Static167.anIntArray412[local30] = Static167.anIntArray412[local30 + 1];
					Static124.anIntArray312[local30] = Static124.anIntArray312[local30 + 1];
				}
				local8--;
			}
		}
		if (Static116.aBoolean143 && !Static46.method3211()) {
			if (Static94.anInt2923 != 0 && Static157.anInt4311 != -1) {
				Static28.method2243(Static94.anInt2923, 0, Static115.aClass16_Sub1_36, Static157.anInt4311);
			}
			Static116.aBoolean143 = false;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIB)Z")
	public static boolean method1789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V")
	public static void method1790() {
		if (!Static149.aBoolean185) {
			Static84.aClass18Array13[0] = Static129.aClass18_928;
			anInt2478 = 1;
			Static114.anIntArray288[0] = 1004;
			Static180.aClass18Array25[0] = Static62.aClass18_472;
		}
		if (Static73.anInt1882 != -1) {
			Static133.method2582(Static73.anInt1882);
		}
		for (@Pc(35) int local35 = 0; local35 < Static180.anInt4780; local35++) {
			if (Static88.aBooleanArray8[local35]) {
				Static9.aBooleanArray1[local35] = true;
			}
			Static169.aBooleanArray15[local35] = Static88.aBooleanArray8[local35];
			Static88.aBooleanArray8[local35] = false;
		}
		Static171.anInt4624 = -1;
		Static11.aClass20_2 = null;
		Static127.anInt3641 = -1;
		Static25.anInt870 = Static41.anInt1322;
		if (Static73.anInt1882 != -1) {
			Static180.anInt4780 = 0;
			Static170.method3125(0, Static73.anInt1882, 765, 0, 0, -1, 503, 0);
		}
		Static63.method2002();
		Static155.method2903();
		if (Static149.aBoolean185) {
			Static146.method2774();
		} else if (Static171.anInt4624 != -1) {
			Static111.method2267(Static171.anInt4624, Static127.anInt3641);
		}
		if (Static124.anInt3517 == 3) {
			for (@Pc(109) int local109 = 0; local109 < Static180.anInt4780; local109++) {
				if (Static169.aBooleanArray15[local109]) {
					Static63.method1998(Static146.anIntArray376[local109], Static97.anIntArray265[local109], Static24.anIntArray49[local109], Static154.anIntArray391[local109], 16711935, 128);
				} else if (Static9.aBooleanArray1[local109]) {
					Static63.method1998(Static146.anIntArray376[local109], Static97.anIntArray265[local109], Static24.anIntArray49[local109], Static154.anIntArray391[local109], 16711680, 128);
				}
			}
		}
		Static39.method779(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579, Static9.anInt295, Static180.anInt4776, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558);
		Static180.anInt4776 = 0;
	}

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "(I)V")
	public static void method1792() {
		aClass1_Sub6_2 = null;
		aClass18_591 = null;
		aClass23_1 = null;
		aClass18_592 = null;
		aClass18_590 = null;
		aClass1_Sub1_Sub8_Sub1Array4 = null;
		aClass18_589 = null;
	}
}
