import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Lclient!ph;")
	public static Class138 aClass138_73;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "Lclient!ph;")
	public static Class138 aClass138_74;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
	public static boolean method4002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static239.anInt4831; local1++) {
			@Pc(8) Class47 local8 = Static64.aClass47Array5[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt1352 == 1) {
				local17 = local8.anInt1347 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt1357 + (local8.anInt1361 * local17 >> 8);
					local39 = local8.anInt1349 + (local8.anInt1343 * local17 >> 8);
					local49 = local8.anInt1341 + (local8.anInt1340 * local17 >> 8);
					local59 = local8.anInt1345 + (local8.anInt1338 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1352 == 2) {
				local17 = arg0 - local8.anInt1347;
				if (local17 > 0) {
					local29 = local8.anInt1357 + (local8.anInt1361 * local17 >> 8);
					local39 = local8.anInt1349 + (local8.anInt1343 * local17 >> 8);
					local49 = local8.anInt1341 + (local8.anInt1340 * local17 >> 8);
					local59 = local8.anInt1345 + (local8.anInt1338 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1352 == 3) {
				local17 = local8.anInt1357 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt1347 + (local8.anInt1353 * local17 >> 8);
					local39 = local8.anInt1342 + (local8.anInt1356 * local17 >> 8);
					local49 = local8.anInt1341 + (local8.anInt1340 * local17 >> 8);
					local59 = local8.anInt1345 + (local8.anInt1338 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1352 == 4) {
				local17 = arg2 - local8.anInt1357;
				if (local17 > 0) {
					local29 = local8.anInt1347 + (local8.anInt1353 * local17 >> 8);
					local39 = local8.anInt1342 + (local8.anInt1356 * local17 >> 8);
					local49 = local8.anInt1341 + (local8.anInt1340 * local17 >> 8);
					local59 = local8.anInt1345 + (local8.anInt1338 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1352 == 5) {
				local17 = arg1 - local8.anInt1341;
				if (local17 > 0) {
					local29 = local8.anInt1347 + (local8.anInt1353 * local17 >> 8);
					local39 = local8.anInt1342 + (local8.anInt1356 * local17 >> 8);
					local49 = local8.anInt1357 + (local8.anInt1361 * local17 >> 8);
					local59 = local8.anInt1349 + (local8.anInt1343 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	public static void method4004() {
		Static232.aClass169_102.method4020(5);
		Static134.aClass169_75.method4020(5);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(4) Class1_Sub19 local4 = (Class1_Sub19) Static114.aClass24_16.method460();
		@Pc(10) Class1_Sub19 local10 = null;
		while (local4 != null) {
			if (arg7 == local4.anInt3722 && local4.anInt3719 == arg0 && local4.anInt3725 == arg3 && local4.anInt3717 == arg2) {
				local10 = local4;
				break;
			}
			local4 = (Class1_Sub19) Static114.aClass24_16.method464();
		}
		if (local10 == null) {
			local10 = new Class1_Sub19();
			local10.anInt3717 = arg2;
			local10.anInt3722 = arg7;
			local10.anInt3719 = arg0;
			local10.anInt3725 = arg3;
			Static7.method109(local10);
			Static114.aClass24_16.method473(local10);
		}
		local10.anInt3716 = arg1;
		local10.anInt3728 = arg6;
		local10.anInt3726 = arg8;
		local10.anInt3723 = arg4;
		local10.anInt3715 = arg5;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)Lclient!rb;")
	public static Class149 method4006(@OriginalArg(1) int arg0) {
		@Pc(6) Class149 local6 = (Class149) Static245.aClass169_67.method4017((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static309.aClass138_89.method3346(Static82.method1237(arg0), Static272.method4021(arg0));
		local6 = new Class149();
		local6.anInt4808 = arg0;
		if (local27 != null) {
			local6.method3736(new Class1_Sub14(local27));
		}
		local6.method3744();
		if (local6.anInt4800 != -1) {
			local6.method3743(method4006(local6.anInt4800), method4006(local6.anInt4787));
		}
		if (local6.anInt4805 != -1) {
			local6.method3738(method4006(local6.anInt4794), method4006(local6.anInt4805));
		}
		if (!Static124.aBoolean189 && local6.aBoolean343) {
			local6.aStringArray38 = Static85.aStringArray14;
			local6.aStringArray39 = Static238.aStringArray40;
			local6.aString159 = Static286.aString180;
			local6.anInt4804 = 0;
			local6.aBoolean342 = false;
		}
		Static245.aClass169_67.method4016(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)V")
	public static void method4010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 * Static311.anInt5846 >> 8;
		if (arg0 == -1 && !Static113.aBoolean168) {
			Static254.method3871();
		} else if (arg0 != -1 && (Static142.anInt2796 != arg0 || !Static44.method780()) && local11 != 0 && !Static113.aBoolean168) {
			Static45.method812(Static132.aClass138_42, local11, arg0);
		}
		Static142.anInt2796 = arg0;
	}
}
