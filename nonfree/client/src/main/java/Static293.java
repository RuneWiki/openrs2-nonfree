import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[8];

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_65 = new Class160(39, 0);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[BIII)Z")
	public static boolean method4104(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class6_Sub14 local12 = new Class6_Sub14(arg1);
		@Pc(14) int local14 = -1;
		label56: while (true) {
			@Pc(22) int local22 = local12.method6029();
			if (local22 == 0) {
				return local7;
			}
			local14 += local22;
			@Pc(30) int local30 = 0;
			@Pc(32) boolean local32 = false;
			while (true) {
				@Pc(38) int local38;
				while (!local32) {
					local38 = local12.method5998();
					if (local38 == 0) {
						continue label56;
					}
					local30 += local38 - 1;
					@Pc(62) int local62 = local30 & 0x3F;
					@Pc(68) int local68 = local30 >> 6 & 0x3F;
					@Pc(74) int local74 = local12.method6041() >> 2;
					@Pc(78) int local78 = arg4 + local68;
					@Pc(82) int local82 = local62 + arg3;
					if (local78 > 0 && local82 > 0 && local78 < arg2 - 1 && local82 < arg0 - 1) {
						@Pc(105) Class313 local105 = Static260.aClass100_1.method2008(local14);
						if (local74 != 22 || Static480.aClass6_Sub37_Sub1_1.aBoolean402 || local105.lb != 0 || local105.anInt8469 == 1 || local105.aBoolean581) {
							if (!local105.method6965()) {
								local7 = false;
								Static235.anInt3967++;
							}
							local32 = true;
						}
					}
				}
				local38 = local12.method5998();
				if (local38 == 0) {
					break;
				}
				local12.method6041();
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	public static void method4105() {
		Static1.aClass4_1 = null;
		Static481.aClass4_31 = null;
		Static240.aClass4_12 = null;
		Static404.aClass4_23 = null;
		Static156.aClass4Array5 = null;
		Static476.aClass4_30 = null;
		Static231.aClass4_11 = null;
		Static355.aClass4_20 = null;
		Static245.aClass4_13 = null;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V")
	public static void method4107(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static177.anInt3167 = arg0;
		Static466.anInt7907 = 2;
		Static217.method3195(arg2, arg1, false);
	}
}
