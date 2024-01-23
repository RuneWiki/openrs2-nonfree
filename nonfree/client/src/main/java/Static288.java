import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
	public static int anInt5482 = 0;

	@OriginalMember(owner = "client!uj", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString182 = "cyan:";

	@OriginalMember(owner = "client!uj", name = "X", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!uj", name = "Y", descriptor = "[Lclient!vb;")
	public static Class184[] aClass184Array1 = new Class184[50];

	@OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
	public static int anInt5487 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4282(@OriginalArg(1) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(20) String local20 = arg1[arg2];
			return local20 == null ? "null" : local20.toString();
		} else {
			@Pc(29) int local29 = 0;
			@Pc(34) int local34 = arg0 + arg2;
			for (@Pc(36) int local36 = arg2; local36 < local34; local36++) {
				@Pc(48) String local48 = arg1[local36];
				if (local48 == null) {
					local29 += 4;
				} else {
					local29 += local48.length();
				}
			}
			@Pc(66) StringBuffer local66 = new StringBuffer(local29);
			for (@Pc(68) int local68 = arg2; local68 < local34; local68++) {
				@Pc(75) String local75 = arg1[local68];
				if (local75 == null) {
					local66.append("null");
				} else {
					local66.append(local75);
				}
			}
			return local66.toString();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!id;)Z")
	public static boolean method4283(@OriginalArg(1) Class81 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean164) {
			return false;
		} else if (!arg0.method1800()) {
			return false;
		} else if (Static49.aClass156_3.method3821((long) arg0.anInt2199) == null) {
			return Static98.aClass156_8.method3821((long) arg0.anInt2195) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZBI[Lclient!qf;)V")
	public static void method4284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class146[] arg4) {
		for (@Pc(13) int local13 = 0; local13 < arg4.length; local13++) {
			@Pc(21) Class146 local21 = arg4[local13];
			if (local21 != null && arg1 == local21.anInt4416) {
				Static310.method1128(arg0, arg2, arg3, local21);
				Static127.method2019(arg3, local21, arg0);
				if (local21.anInt4419 - local21.anInt4345 < local21.anInt4341) {
					local21.anInt4341 = local21.anInt4419 - local21.anInt4345;
				}
				if (local21.anInt4341 < 0) {
					local21.anInt4341 = 0;
				}
				if (local21.anInt4418 > local21.anInt4383 - local21.anInt4371) {
					local21.anInt4418 = local21.anInt4383 - local21.anInt4371;
				}
				if (local21.anInt4418 < 0) {
					local21.anInt4418 = 0;
				}
				if (local21.anInt4370 == 0) {
					Static45.method813(arg2, local21);
				}
			}
		}
	}
}
