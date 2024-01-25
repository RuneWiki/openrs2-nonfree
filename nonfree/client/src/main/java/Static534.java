import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!we", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray60;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZII)V")
	public static void method7449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static61.anInt1459 + arg1;
		@Pc(13) int local13 = Static203.anInt4534 + arg2;
		if (Static120.aClass37ArrayArrayArray1 == null || arg1 < 0 || arg2 < 0 || arg1 >= Static37.anInt7512 || Static329.anInt6247 <= arg2) {
			return;
		}
		@Pc(51) long local51 = (long) (arg0 << 28 | local13 << 14 | local9);
		@Pc(57) Class12_Sub28 local57 = (Class12_Sub28) Static295.aClass68_45.method1917(local51);
		if (local57 == null) {
			Static146.method2877(arg0, arg1, arg2);
			return;
		}
		@Pc(71) Class12_Sub46 local71 = (Class12_Sub46) local57.aClass73_42.method2005();
		if (local71 == null) {
			Static146.method2877(arg0, arg1, arg2);
			return;
		}
		@Pc(85) Class30_Sub5_Sub1 local85 = (Class30_Sub5_Sub1) Static146.method2877(arg0, arg1, arg2);
		if (local85 == null) {
			local85 = new Class30_Sub5_Sub1();
		} else {
			local85.anInt5625 = local85.anInt5619 = -1;
		}
		local85.anInt5627 = local71.anInt8179;
		local85.anInt5617 = local71.anInt8181;
		label46: while (true) {
			@Pc(113) Class12_Sub46 local113 = (Class12_Sub46) local57.aClass73_42.method2009();
			if (local113 == null) {
				break;
			}
			if (local85.anInt5627 != local113.anInt8179) {
				local85.anInt5625 = local113.anInt8179;
				local85.anInt5618 = local113.anInt8181;
				while (true) {
					@Pc(134) Class12_Sub46 local134 = (Class12_Sub46) local57.aClass73_42.method2009();
					if (local134 == null) {
						break label46;
					}
					if (local85.anInt5627 != local134.anInt8179 && local134.anInt8179 != local85.anInt5625) {
						local85.anInt5619 = local134.anInt8179;
						local85.anInt5615 = local134.anInt8181;
					}
				}
			}
		}
		@Pc(183) int local183 = Static443.method6717((arg1 << 7) + 64, (arg2 << 7) + 64, arg0);
		Static393.method6191(arg0, arg1, arg2, local183, local85);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(JJ)J")
	public static long method7450(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
