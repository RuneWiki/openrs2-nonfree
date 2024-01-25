import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array9;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_63 = new Class81(37, -2);

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	public static final int anInt2295 = 1338;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBIIILclient!he;I)V")
	public static void method1980(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class20_Sub2_Sub4_Sub1 arg2, @OriginalArg(6) int arg3) {
		Static484.method6766(arg1, 0, arg2.anInt8795, arg2.aByte116, arg3, arg2.anInt8796, arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method1982() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static498.aClass254Array1[local3] = null;
		}
		Static419.anInt7122 = 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V")
	public static void method1983(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static337.method5034(arg0, null, arg5, arg2, arg4, arg3, arg1, -1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method1984(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(24) byte[] local24 = (byte[]) arg0;
			return arg1 ? Static541.method7810(local24) : local24;
		} else if (arg0 instanceof Class317) {
			@Pc(38) Class317 local38 = (Class317) arg0;
			return local38.method7060();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Lclient!ri;")
	public static Class285 method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass285_6;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIBII)V")
	public static void method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static468.method6610(arg0, Static126.anInt6658, Static494.anInt8295);
		@Pc(17) int local17 = Static468.method6610(arg1, Static126.anInt6658, Static494.anInt8295);
		@Pc(23) int local23 = Static468.method6610(arg5, Static487.anInt8210, Static278.anInt5111);
		@Pc(29) int local29 = Static468.method6610(arg2, Static487.anInt8210, Static278.anInt5111);
		@Pc(45) int local45 = Static468.method6610(arg3 + arg0, Static126.anInt6658, Static494.anInt8295);
		@Pc(53) int local53 = Static468.method6610(arg1 - arg3, Static126.anInt6658, Static494.anInt8295);
		for (@Pc(55) int local55 = local11; local55 < local45; local55++) {
			Static250.method4000(local29, Static478.anIntArrayArray51[local55], local23, arg4);
		}
		for (@Pc(71) int local71 = local17; local71 > local53; local71--) {
			Static250.method4000(local29, Static478.anIntArrayArray51[local71], local23, arg4);
		}
		@Pc(97) int local97 = Static468.method6610(arg3 + arg5, Static487.anInt8210, Static278.anInt5111);
		@Pc(105) int local105 = Static468.method6610(arg2 - arg3, Static487.anInt8210, Static278.anInt5111);
		for (@Pc(107) int local107 = local45; local107 <= local53; local107++) {
			@Pc(113) int[] local113 = Static478.anIntArrayArray51[local107];
			Static250.method4000(local97, local113, local23, arg4);
			Static250.method4000(local29, local113, local105, arg4);
		}
	}
}
