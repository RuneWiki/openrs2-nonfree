import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method3799() {
		Static247.anInt5536 = 1;
		Static286.aBoolean461 = false;
		Static125.anInt2489 = 0;
		Static3.anInt4885 = -1;
		Static272.anInt5358 = 0;
		Static62.anInt5014 = 0;
		Static130.anInt2600 = -3;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!pk;II)Lclient!ul;")
	public static Class8_Sub33 method3800(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method3177(arg1);
		return local13 == null ? null : new Class8_Sub33(local13);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(JZ)V")
	public static void method3801(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static173.anInt3444 >= 100 && !Static288.aBoolean98 || Static173.anInt3444 >= 200) {
			Static47.method746(0, Static144.aString101, "");
			return;
		}
		@Pc(31) String local31 = Static121.method1945(arg0);
		@Pc(33) int local33;
		for (local33 = 0; local33 < Static173.anInt3444; local33++) {
			if (arg0 == Static98.aLongArray7[local33]) {
				Static47.method746(0, local31 + Static52.aString44, "");
				return;
			}
		}
		for (local33 = 0; local33 < Static30.anInt728; local33++) {
			if (Static213.aLongArray11[local33] == arg0) {
				Static47.method746(0, Static225.aString163 + local31 + Static111.aString85, "");
				return;
			}
		}
		if (local31.equals(Static21.aClass36_Sub3_Sub1_1.aString144)) {
			Static47.method746(0, Static113.aString86, "");
			return;
		}
		Static47.aStringArray15[Static173.anInt3444] = local31;
		Static98.aLongArray7[Static173.anInt3444] = arg0;
		Static63.anIntArray95[Static173.anInt3444] = 0;
		Static173.aStringArray51[Static173.anInt3444] = "";
		Static220.anIntArray340[Static173.anInt3444] = 0;
		Static57.aBooleanArray4[Static173.anInt3444] = false;
		Static295.anInt3737 = Static157.anInt5706;
		Static173.anInt3444++;
		Static66.aClass8_Sub2_Sub1_4.method2398(132);
		Static66.aClass8_Sub2_Sub1_4.method2378(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	public static void method3802(@OriginalArg(1) int arg0) {
		@Pc(10) Class8_Sub1_Sub6 local10 = Static181.method2779(10, arg0);
		local10.method929();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)V")
	public static void method3804(@OriginalArg(1) boolean arg0) {
		@Pc(17) byte local17;
		@Pc(15) byte[][] local15;
		if (Static116.aBoolean188 && arg0) {
			local15 = Static13.aByteArrayArray1;
			local17 = 1;
		} else {
			local17 = 4;
			local15 = Static282.aByteArrayArray5;
		}
		for (@Pc(25) int local25 = 0; local25 < local17; local25++) {
			Static16.method2745();
			for (@Pc(36) int local36 = 0; local36 < 13; local36++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(56) int local56 = Static4.anIntArrayArrayArray1[local25][local36][local43];
					if (local56 != -1) {
						@Pc(67) int local67 = local56 >> 24 & 0x3;
						if (!arg0 || local67 == 0) {
							@Pc(78) int local78 = local56 >> 1 & 0x3;
							@Pc(84) int local84 = local56 >> 14 & 0x3FF;
							@Pc(90) int local90 = local56 >> 3 & 0x7FF;
							@Pc(100) int local100 = local90 / 8 + (local84 / 8 << 8);
							for (@Pc(102) int local102 = 0; local102 < Static13.anIntArray15.length; local102++) {
								if (local100 == Static13.anIntArray15[local102] && local15[local102] != null) {
									Static243.method3657(local25, (local84 & 0x7) * 8, (local90 & 0x7) * 8, local67, local15[local102], Static159.aClass112Array1, local78, local36 * 8, arg0, local43 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B[Ljava/lang/String;[S)V")
	public static void method3805(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static208.method3297(arg0, arg1, arg0.length - 1, 0);
	}
}
