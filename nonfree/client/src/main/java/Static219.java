import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
	public static int anInt3586;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	public static int anInt3587;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "Lclient!eo;")
	public static final Class94 aClass94_3 = new Class94(false);

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "Lclient!eo;")
	public static Class94 aClass94_4 = aClass94_3;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BILclient!wu;Lclient!wu;)V")
	public static void method3015(@OriginalArg(2) Class380 arg0, @OriginalArg(3) Class380 arg1) {
		Static189.aClass380_47 = arg1;
		Static555.aClass380_125 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!jk;IILclient!ha;Lclient!gfa;)Z")
	public static boolean method3019(@OriginalArg(1) Class172 arg0, @OriginalArg(4) Class95 arg1, @OriginalArg(5) Class2_Sub14 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray286 != null) {
			local9 = (arg0.anInt4322 + arg2.anInt3133 - Static193.anInt1553) * (Static193.anInt1552 - Static193.anInt1549) / (Static193.anInt1543 - Static193.anInt1553) + Static193.anInt1549;
			local7 = (Static193.anInt1552 - Static193.anInt1549) * (arg2.anInt3133 + arg0.anInt4349 - Static193.anInt1553) / (Static193.anInt1543 - Static193.anInt1553) + Static193.anInt1549;
			local13 = Static193.anInt1554 - (Static193.anInt1554 - Static193.anInt1547) * (-Static193.anInt1546 + arg0.anInt4341 - -arg2.anInt3126) / (Static193.anInt1545 - Static193.anInt1546);
			local11 = Static193.anInt1554 - (Static193.anInt1554 - Static193.anInt1547) * (arg2.anInt3126 + arg0.anInt4336 - Static193.anInt1546) / (Static193.anInt1545 - Static193.anInt1546);
		}
		@Pc(103) Class61 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		if (arg0.anInt4332 != -1) {
			if (arg2.aBoolean227 && arg0.anInt4340 != -1) {
				local103 = arg0.method3765(true, arg1);
			} else {
				local103 = arg0.method3765(false, arg1);
			}
			if (local103 != null) {
				local105 = arg2.anInt3125 - (local103.method6446() + 1 >> 1);
				if (local105 < local7) {
					local7 = local105;
				}
				local107 = arg2.anInt3125 + (local103.method6446() + 1 >> 1);
				local109 = arg2.anInt3127 - (local103.method6438() + 1 >> 1);
				if (local9 < local107) {
					local9 = local107;
				}
				local111 = arg2.anInt3127 + (local103.method6438() + 1 >> 1);
				if (local11 > local109) {
					local11 = local109;
				}
				if (local111 > local13) {
					local13 = local111;
				}
			}
		}
		@Pc(211) Class55 local211 = null;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(307) int local307;
		if (arg0.aString42 != null) {
			local211 = Static394.method5391(arg0.anInt4343);
			if (local211 != null) {
				local213 = Static251.aClass256_8.method5541(arg0.aString42, Static597.aStringArray46, null, null);
				local215 = arg0.anInt4347 * (Static193.anInt1552 - Static193.anInt1549) / (Static193.anInt1543 - Static193.anInt1553) + arg2.anInt3125;
				local217 = arg2.anInt3127 - (Static193.anInt1554 - Static193.anInt1547) * arg0.anInt4334 / (Static193.anInt1545 - Static193.anInt1546);
				if (local103 == null) {
					local217 -= local211.method1006() * local213 / 2;
				} else {
					local217 -= (local103.method6438() >> 1) + local211.method1012() * local213;
				}
				for (local307 = 0; local307 < local213; local307++) {
					@Pc(313) String local313 = Static597.aStringArray46[local307];
					if (local213 - 1 > local307) {
						local313 = local313.substring(0, local313.length() - 4);
					}
					@Pc(334) int local334 = local211.method1009(local313);
					if (local334 > local219) {
						local219 = local334;
					}
				}
				local221 = local215 - local219 / 2;
				local223 = local219 / 2 + local215;
				if (local221 < local7) {
					local7 = local221;
				}
				local225 = local217;
				if (local223 > local9) {
					local9 = local223;
				}
				local227 = local217 + local213 * local211.method1012();
				if (local11 > local225) {
					local11 = local225;
				}
				if (local13 < local227) {
					local13 = local227;
				}
			}
		}
		if (Static193.anInt1549 > local9 || Static193.anInt1552 < local7 || local13 < Static193.anInt1547 || Static193.anInt1554 < local11) {
			return true;
		}
		Static193.method1294(arg1, arg2, arg0);
		if (local103 != null) {
			if (Static95.anInt1808 > 0 && (Static525.anInt5960 != -1 && arg2.anInt3128 == Static525.anInt5960 || Static249.anInt3980 != -1 && Static249.anInt3980 == arg0.anInt4330)) {
				if (Static20.anInt544 > 50) {
					local307 = (100 - Static20.anInt544) * 2;
				} else {
					local307 = Static20.anInt544 * 2;
				}
				@Pc(474) int local474 = local307 << 24 | 0xFFFF00;
				arg1.method6947(local103.method6445() / 2 + 7, local474, arg2.anInt3127, arg2.anInt3125);
				arg1.method6947(local103.method6445() / 2 + 5, local474, arg2.anInt3127, arg2.anInt3125);
				arg1.method6947(local103.method6445() / 2 + 3, local474, arg2.anInt3127, arg2.anInt3125);
				arg1.method6947(local103.method6445() / 2 + 1, local474, arg2.anInt3127, arg2.anInt3125);
				arg1.method6947(local103.method6445() / 2, local474, arg2.anInt3127, arg2.anInt3125);
			}
			local103.method6431(arg2.anInt3125 - (local103.method6446() >> 1), arg2.anInt3127 - (local103.method6438() >> 1));
		}
		if (arg0.aString42 != null && local211 != null) {
			Static374.method5048(local215, arg2, local219, arg0, local213, local217, local211, arg1);
		}
		if (arg0.anInt4332 != -1 || arg0.aString42 != null) {
			@Pc(586) Class2_Sub23 local586 = new Class2_Sub23(arg2);
			local586.anInt4463 = local107;
			local586.anInt4459 = local227;
			local586.anInt4462 = local109;
			local586.anInt4456 = local225;
			local586.anInt4455 = local105;
			local586.anInt4461 = local223;
			local586.anInt4464 = local221;
			local586.anInt4457 = local111;
			Static372.aClass109_37.method2323(local586);
		}
		return false;
	}
}
