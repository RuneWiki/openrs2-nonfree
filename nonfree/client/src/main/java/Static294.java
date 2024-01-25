import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!or", name = "x", descriptor = "[[[Lclient!mm;")
	public static Class162[][][] aClass162ArrayArrayArray2;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_166 = new Class214(90, -2);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IBIIIII)V")
	public static void method4497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static458.method6215(arg0);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg0;
		@Pc(23) int local23 = -arg0;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(80) int local80;
		@Pc(91) int local91;
		if (Static162.anInt1715 <= arg1 && Static55.anInt1319 >= arg1) {
			@Pc(52) int[] local52 = Static400.anIntArrayArray54[arg1];
			local61 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 - arg0);
			local69 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg0 + arg3);
			local80 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 - local14);
			local91 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 + local14);
			Static236.method3990(local80, local61, local52, arg4);
			Static236.method3990(local91, local80, local52, arg5);
			Static236.method3990(local69, local91, local52, arg4);
		}
		while (local20 > local10) {
			local32 += 2;
			local30 += 2;
			local28 += local32;
			local23 += local30;
			if (local28 >= 0 && local25 >= 1) {
				local25--;
				Static418.anIntArray250[local25] = local10;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(206) int local206;
			@Pc(215) int local215;
			@Pc(226) int[] local226;
			@Pc(153) int local153;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				local153 = arg1 - local20;
				local61 = arg1 + local20;
				if (local61 >= Static162.anInt1715 && Static55.anInt1319 >= local153) {
					if (local20 < local14) {
						local69 = Static418.anIntArray250[local20];
						local80 = Static22.method360(Static418.anInt3023, Static176.anInt3462, local10 + arg3);
						local91 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 - local10);
						local206 = Static22.method360(Static418.anInt3023, Static176.anInt3462, local69 + arg3);
						local215 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 - local69);
						if (Static55.anInt1319 >= local61) {
							local226 = Static400.anIntArrayArray54[local61];
							Static236.method3990(local215, local91, local226, arg4);
							Static236.method3990(local206, local215, local226, arg5);
							Static236.method3990(local80, local206, local226, arg4);
						}
						if (Static162.anInt1715 <= local153) {
							local226 = Static400.anIntArrayArray54[local153];
							Static236.method3990(local215, local91, local226, arg4);
							Static236.method3990(local206, local215, local226, arg5);
							Static236.method3990(local80, local206, local226, arg4);
						}
					} else {
						local69 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 + local10);
						local80 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 - local10);
						if (local61 <= Static55.anInt1319) {
							Static236.method3990(local69, local80, Static400.anIntArrayArray54[local61], arg4);
						}
						if (Static162.anInt1715 <= local153) {
							Static236.method3990(local69, local80, Static400.anIntArrayArray54[local153], arg4);
						}
					}
				}
			}
			local153 = arg1 - local10;
			local61 = local10 + arg1;
			if (local61 >= Static162.anInt1715 && Static55.anInt1319 >= local153) {
				local69 = local20 + arg3;
				local80 = arg3 - local20;
				if (Static176.anInt3462 <= local69 && local80 <= Static418.anInt3023) {
					local69 = Static22.method360(Static418.anInt3023, Static176.anInt3462, local69);
					local80 = Static22.method360(Static418.anInt3023, Static176.anInt3462, local80);
					if (local10 < local14) {
						local91 = local10 > local25 ? Static418.anIntArray250[local10] : local25;
						local206 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 + local91);
						local215 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3 - local91);
						if (local61 <= Static55.anInt1319) {
							local226 = Static400.anIntArrayArray54[local61];
							Static236.method3990(local215, local80, local226, arg4);
							Static236.method3990(local206, local215, local226, arg5);
							Static236.method3990(local69, local206, local226, arg4);
						}
						if (local153 >= Static162.anInt1715) {
							local226 = Static400.anIntArrayArray54[local153];
							Static236.method3990(local215, local80, local226, arg4);
							Static236.method3990(local206, local215, local226, arg5);
							Static236.method3990(local69, local206, local226, arg4);
						}
					} else {
						if (local61 <= Static55.anInt1319) {
							Static236.method3990(local69, local80, Static400.anIntArrayArray54[local61], arg4);
						}
						if (local153 >= Static162.anInt1715) {
							Static236.method3990(local69, local80, Static400.anIntArrayArray54[local153], arg4);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
	public static void method4499(@OriginalArg(1) int arg0) {
		Static456.anInt7802 = arg0;
		Static298.aClass83_39.method2346();
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(B)V")
	public static void method4500() {
		if (!Static449.aBoolean564) {
			return;
		}
		@Pc(11) Class240 local11 = Static231.method3929(Static383.anInt6696, Static344.anInt6075);
		if (local11 != null && local11.anObjectArray6 != null) {
			@Pc(20) Class4_Sub10 local20 = new Class4_Sub10();
			local20.aClass240_5 = local11;
			local20.anObjectArray4 = local11.anObjectArray6;
			Static64.method1462(local20);
		}
		Static449.aBoolean564 = false;
		Static457.anInt7815 = -1;
		Static25.anInt464 = -1;
		if (local11 != null) {
			Static273.method4374(local11);
		}
	}
}
