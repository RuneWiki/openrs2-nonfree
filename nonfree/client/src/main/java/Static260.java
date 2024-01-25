import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "Lclient!ha;")
	public static final Class89 aClass89_3 = new Class89("LIVE", 0);

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_101 = new Class205(25, 2);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZLclient!gf;I)V")
	public static void method4023(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub5_Sub1_Sub1 arg1) {
		if (Static285.anInt4946 >= 400 || arg1 == Static206.aClass1_Sub5_Sub1_Sub1_1) {
			return;
		}
		@Pc(45) String local45;
		@Pc(94) int local94;
		if (arg1.anInt2271 == 0) {
			@Pc(49) boolean local49 = true;
			if (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2286 != -1 && arg1.anInt2286 != -1) {
				@Pc(73) int local73 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2300 > arg1.anInt2300 ? Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2300 : arg1.anInt2300;
				@Pc(84) int local84 = arg1.anInt2286 <= Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2286 ? arg1.anInt2286 : Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2286;
				local94 = local73 * 10 / 100 + local84 + 5;
				@Pc(100) int local100 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2300 - arg1.anInt2300;
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local100 > local94) {
					local49 = false;
				}
			}
			@Pc(123) String local123 = Static119.aClass150_1 == Static275.aClass150_3 ? Static5.aClass32_3.method701(Static107.anInt2498) : Static79.aClass32_70.method701(Static107.anInt2498);
			if (arg1.anInt2265 <= arg1.anInt2300) {
				local45 = arg1.method2253() + (local49 ? Static324.method4798(arg1.anInt2300, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2300) : "<col=ffffff>") + " (" + local123 + arg1.anInt2300 + ")";
			} else {
				local45 = arg1.method2253() + (local49 ? Static324.method4798(arg1.anInt2300, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2300) : "<col=ffffff>") + " (" + local123 + arg1.anInt2300 + "+" + (arg1.anInt2265 - arg1.anInt2300) + ")";
			}
		} else {
			local45 = arg1.method2253() + " (" + Static378.aClass32_99.method701(Static107.anInt2498) + arg1.anInt2271 + ")";
		}
		if (Static110.aBoolean180) {
			if (!arg0 && (Static33.anInt698 & 0x8) != 0) {
				Static137.method4192(false, Static217.aString47 + " -> <col=ffffff>" + local45, true, Static391.aString68, 0, (long) arg1.anInt6413, 44, 0, -1, Static345.anInt6624);
			}
		} else if (arg0) {
			Static137.method4192(true, "", false, "<col=cccccc>" + local45, 0, 0L, -1, 0, 0, -1);
		} else {
			for (@Pc(242) int local242 = 7; local242 >= 0; local242--) {
				if (Static292.aStringArray132[local242] != null) {
					@Pc(250) short local250 = 0;
					if (Static275.aClass150_3 == Static195.aClass150_2 && Static292.aStringArray132[local242].equalsIgnoreCase(Static258.aClass32_66.method701(Static107.anInt2498))) {
						if (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2300 < arg1.anInt2300) {
							local250 = 2000;
						}
						if (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2267 != 0 && arg1.anInt2267 != 0) {
							if (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2267 == arg1.anInt2267) {
								local250 = 2000;
							} else {
								local250 = 0;
							}
						}
					} else if (Static2.aBooleanArray1[local242]) {
						local250 = 2000;
					}
					@Pc(305) short local305 = (short) (Static322.aShortArray103[local242] + local250);
					local94 = Static176.anIntArray656[local242] == -1 ? Static181.anInt6176 : Static176.anIntArray656[local242];
					Static137.method4192(false, "<col=ffffff>" + local45, true, Static292.aStringArray132[local242], 0, (long) arg1.anInt6413, local305, 0, -1, local94);
				}
			}
		}
		if (arg0) {
			return;
		}
		for (@Pc(375) Class2_Sub26 local375 = (Class2_Sub26) Static195.aClass30_28.method694(); local375 != null; local375 = (Class2_Sub26) Static195.aClass30_28.method682()) {
			if (local375.anInt3594 == 60) {
				local375.aString39 = "<col=ffffff>" + local45;
				return;
			}
		}
	}
}
