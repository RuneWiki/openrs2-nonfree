import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!in", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString71;

	@OriginalMember(owner = "client!in", name = "N", descriptor = "Lclient!pf;")
	public static Class1_Sub18_Sub1 aClass1_Sub18_Sub1_2 = new Class1_Sub18_Sub1(5000);

	@OriginalMember(owner = "client!in", name = "S", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!ak;ZLclient!ak;)V")
	public static void method1852(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static202.aClass7_167 = arg0;
		Static13.aClass7_145 = arg1;
		Static292.anInt5800 = Static13.aClass7_145.method265(3);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)V")
	public static void method1856(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub2_Sub11 local14 = Static163.method3579(12, arg0);
		local14.method1853();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(8) int local8 = 0; local8 < Static166.aClass50_2.anInt1409; local8++) {
			if (Static166.aClass50_2.method1170(local8)) {
				@Pc(49) int[] local49 = Static188.aClass1_Sub2_Sub13_2.method2813(Static166.aClass50_2.anIntArray169[local8] >> 14 & 0x3FFF, Static166.aClass50_2.anIntArray169[local8] >> 28 & 0x3, Static166.aClass50_2.anIntArray169[local8] & 0x3FFF);
				if (local49 != null) {
					@Pc(58) int local58 = local49[1] - Static219.anInt4487;
					@Pc(69) int local69 = Static77.anInt1559 + Static198.anInt3851 - local49[2] - 1;
					@Pc(74) int local74 = Static166.aClass50_2.method1167(local8);
					@Pc(90) int local90 = arg7 + (arg4 - arg7) * (local69 - arg5) / (arg1 - arg5);
					@Pc(105) int local105 = (arg0 - arg3) * (local58 - arg6) / (arg2 - arg6) + arg3;
					@Pc(107) Class62 local107 = null;
					@Pc(109) int local109 = 16777215;
					if (local74 == 0) {
						if ((double) Static243.aFloat145 == 3.0D) {
							local107 = Static49.aClass62_1;
						}
						if ((double) Static243.aFloat145 == 4.0D) {
							local107 = Static190.aClass62_8;
						}
						if ((double) Static243.aFloat145 == 6.0D) {
							local107 = Static149.aClass62_6;
						}
						if ((double) Static243.aFloat145 >= 8.0D) {
							local107 = Static168.aClass62_7;
						}
					}
					if (local74 == 1) {
						if ((double) Static243.aFloat145 == 3.0D) {
							local107 = Static149.aClass62_6;
						}
						if ((double) Static243.aFloat145 == 4.0D) {
							local107 = Static168.aClass62_7;
						}
						if ((double) Static243.aFloat145 == 6.0D) {
							local107 = Static103.aClass62_4;
						}
						if ((double) Static243.aFloat145 >= 8.0D) {
							local107 = Static65.aClass62_3;
						}
					}
					if (local74 == 2) {
						local109 = 16755200;
						if ((double) Static243.aFloat145 == 3.0D) {
							local107 = Static103.aClass62_4;
						}
						if ((double) Static243.aFloat145 == 4.0D) {
							local107 = Static65.aClass62_3;
						}
						if ((double) Static243.aFloat145 == 6.0D) {
							local107 = Static145.aClass62_5;
						}
						if ((double) Static243.aFloat145 >= 8.0D) {
							local107 = Static60.aClass62_2;
						}
					}
					if (Static166.aClass50_2.anIntArray168[local8] != -1) {
						local109 = Static166.aClass50_2.anIntArray168[local8];
					}
					if (local107 != null) {
						@Pc(238) int local238 = Static169.aClass1_Sub2_Sub12_3.method4397(Static166.aClass50_2.aStringArray6[local8], null, Static272.aStringArray33);
						local90 -= (local238 - 1) * local107.method1452() / 2;
						local90 += local107.method1450() / 2;
						for (@Pc(258) int local258 = 0; local258 < local238; local258++) {
							@Pc(269) String local269 = Static272.aStringArray33[local258];
							if (local258 < local238 - 1) {
								local269 = local269.substring(0, local269.length() - 4);
							}
							local107.method1453(local269, local105, local90, local109);
							local90 += local107.method1452();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "h", descriptor = "(I)V")
	public static void method1858() {
		for (@Pc(15) Class1_Sub32 local15 = (Class1_Sub32) Static67.aClass22_7.method640(); local15 != null; local15 = (Class1_Sub32) Static67.aClass22_7.method637()) {
			@Pc(21) int local21 = local15.anInt5665;
			if (Static228.method3502(local21)) {
				@Pc(30) boolean local30 = true;
				@Pc(34) Class127[] local34 = Static86.aClass127ArrayArray1[local21];
				@Pc(36) int local36;
				for (local36 = 0; local36 < local34.length; local36++) {
					if (local34[local36] != null) {
						local30 = local34[local36].aBoolean261;
						break;
					}
				}
				if (!local30) {
					local36 = (int) local15.aLong202;
					@Pc(69) Class127 local69 = Static75.method1287(local36);
					if (local69 != null) {
						Static155.method2392(local69);
					}
				}
			}
		}
	}
}
