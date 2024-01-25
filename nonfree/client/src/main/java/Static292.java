import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Ljava/lang/String;")
	public static final String aString215 = "shake:";

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public static int anInt5832 = 0;

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString216 = " has logged out.";

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILclient!bd;IBLclient!uh;Lclient!w;Lclient!tj;)V")
	public static void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class201 arg4, @OriginalArg(6) Class211 arg5, @OriginalArg(7) Class122 arg6) {
		@Pc(14) int local14 = arg2.anInt541 - arg3 / 2 - 5;
		@Pc(22) int local22 = arg0 + 2;
		if (arg5.anInt6595 != 0) {
			arg6.method4801(arg0 + arg4.method5263() * arg1 + 1 - local22, local14, local22, arg3 + 10, arg5.anInt6595);
		}
		if (arg5.anInt6609 != 0) {
			arg6.method4719(local22, arg5.anInt6609, local14, arg3 + 10, arg0 + 1 + (arg1 * arg4.method5263() - local22));
		}
		@Pc(80) int local80 = arg5.anInt6588;
		if (arg2.aBoolean28 && arg5.anInt6619 != -1) {
			local80 = arg5.anInt6619;
		}
		for (@Pc(93) int local93 = 0; local93 < arg1; local93++) {
			@Pc(99) String local99 = Static290.aStringArray39[local93];
			if (local93 < arg1 - 1) {
				local99 = local99.substring(0, local99.length() - 4);
			}
			arg4.method5264(arg6, local99, arg2.anInt541, arg0, local80);
			arg0 += arg4.method5263();
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ir;I)I")
	public static int method4974(@OriginalArg(0) Class100 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2289(Static221.anInt4561)) {
			local5++;
		}
		if (arg0.method2289(Static7.anInt210)) {
			local5++;
		}
		if (arg0.method2289(Static174.anInt3625)) {
			local5++;
		}
		if (arg0.method2289(Static162.anInt2150)) {
			local5++;
		}
		if (arg0.method2289(Static233.anInt4700)) {
			local5++;
		}
		if (arg0.method2289(Static197.anInt4049)) {
			local5++;
		}
		if (arg0.method2289(Static178.anInt3701)) {
			local5++;
		}
		if (arg0.method2289(Static37.anInt6455)) {
			local5++;
		}
		if (arg0.method2289(Static172.anInt3601)) {
			local5++;
		}
		if (arg0.method2289(Static331.anInt6459)) {
			local5++;
		}
		if (arg0.method2289(Static171.anInt3586)) {
			local5++;
		}
		if (arg0.method2289(Static19.anInt534)) {
			local5++;
		}
		if (arg0.method2289(Static57.anInt1245)) {
			local5++;
		}
		if (arg0.method2289(Static132.anInt2760)) {
			local5++;
		}
		if (arg0.method2289(Static343.anInt6682)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IJ)V")
	public static void method4975(@OriginalArg(1) long arg0) {
		if (Static69.aClass22Array1 != null) {
			if (Static261.anInt5200 == 1 || Static261.anInt5200 == 5) {
				Static349.method5666(arg0);
			} else if (Static261.anInt5200 == 2) {
				Static237.method4024();
			} else if (Static261.anInt5200 == 4) {
				Static339.method4912(arg0);
			} else {
				Static9.method165();
			}
		}
		Static33.method633(Static212.aClass122_2, (long) Static51.anInt1101);
		if (Static191.anInt3991 != -1) {
			Static350.method5694(Static191.anInt3991);
		}
		for (@Pc(54) int local54 = 0; local54 < Static312.anInt6281; local54++) {
			if (Static159.aBooleanArray13[local54]) {
				Static28.aBooleanArray1[local54] = true;
			}
			Static330.aBooleanArray30[local54] = Static159.aBooleanArray13[local54];
			Static159.aBooleanArray13[local54] = false;
		}
		Static279.anInt5571 = Static51.anInt1101;
		if (Static212.aClass122_2.method4747()) {
			Static284.aBoolean377 = true;
		}
		Static198.aClass181_34 = null;
		if (Static191.anInt3991 != -1) {
			Static312.anInt6281 = 0;
			Static330.method5420();
		}
		Static212.aClass122_2.method4734();
		Static337.method5522(Static212.aClass122_2);
		@Pc(107) int local107 = Static337.method5523();
		if (local107 == -1) {
			local107 = Static218.anInt4471;
		}
		Static341.method5590(local107);
		Static256.method4297(Static163.anInt3184, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905, Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901, Static347.anInt6759);
		Static347.anInt6759 = 0;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(Z)I")
	public static int method4976() {
		if ((double) Static193.aFloat15 == 3.0D) {
			return 37;
		} else if ((double) Static193.aFloat15 == 4.0D) {
			return 50;
		} else if ((double) Static193.aFloat15 == 6.0D) {
			return 75;
		} else if ((double) Static193.aFloat15 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	public static void method4977() {
		Static275.method4611();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)V")
	public static void method4978(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 8);
		local8.method2502();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)V")
	public static void method4979(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 11);
		local8.method2502();
	}
}
