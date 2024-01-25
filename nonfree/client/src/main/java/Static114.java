import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
	public static int anInt3048;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
	public static int anInt3043 = -1;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_24 = new Class94(29, 3);

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBIIII)V")
	public static void method2844(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 - arg0;
		@Pc(14) int local14 = arg3 - arg2;
		if (local9 == 0) {
			if (local14 != 0) {
				Static111.method2807(arg2, arg0, arg1, arg3);
			}
		} else if (local14 == 0) {
			Static327.method5624(arg4, arg1, arg0, arg2);
		} else {
			@Pc(46) int local46 = (local14 << 12) / local9;
			@Pc(55) int local55 = arg2 - (local46 * arg0 >> 12);
			@Pc(68) int local68;
			@Pc(66) int local66;
			if (arg0 < Static161.anInt7734) {
				local66 = (local46 * Static161.anInt7734 >> 12) + local55;
				local68 = Static161.anInt7734;
			} else if (Static38.anInt823 < arg0) {
				local66 = local55 + (Static38.anInt823 * local46 >> 12);
				local68 = Static38.anInt823;
			} else {
				local68 = arg0;
				local66 = arg2;
			}
			@Pc(111) int local111;
			@Pc(113) int local113;
			if (Static161.anInt7734 > arg4) {
				local111 = Static161.anInt7734;
				local113 = (local46 * Static161.anInt7734 >> 12) + local55;
			} else if (arg4 <= Static38.anInt823) {
				local111 = arg4;
				local113 = arg3;
			} else {
				local111 = Static38.anInt823;
				local113 = local55 + (Static38.anInt823 * local46 >> 12);
			}
			if (Static380.anInt7421 > local113) {
				local111 = (Static380.anInt7421 - local55 << 12) / local46;
				local113 = Static380.anInt7421;
			} else if (local113 > Static237.anInt5159) {
				local111 = (Static237.anInt5159 - local55 << 12) / local46;
				local113 = Static237.anInt5159;
			}
			if (Static380.anInt7421 > local66) {
				local68 = (Static380.anInt7421 - local55 << 12) / local46;
				local66 = Static380.anInt7421;
			} else if (local66 > Static237.anInt5159) {
				local68 = (Static237.anInt5159 - local55 << 12) / local46;
				local66 = Static237.anInt5159;
			}
			Static438.method6940(local68, local66, local113, local111, arg1);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IILclient!at;B)V")
	public static void method2845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray10 != null) {
			@Pc(13) Class2_Sub44 local13 = new Class2_Sub44();
			local13.anObjectArray32 = arg2.anObjectArray10;
			local13.aClass24_15 = arg2;
			Static284.method5153(local13);
		}
		Static151.anInt3895 = arg2.anInt432;
		Static58.anInt10722 = arg0;
		Static237.anInt5148 = arg1;
		Static64.anInt2065 = arg2.anInt501;
		Static475.aBoolean695 = true;
		Static194.anInt4509 = arg2.anInt439;
		Static183.anInt4410 = arg2.anInt504;
		Static397.anInt7582 = arg2.anInt510;
		Static553.method8248(arg2);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method2848(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static131.method3026(0, arg0, arg1.length - 1, arg1);
	}
}
