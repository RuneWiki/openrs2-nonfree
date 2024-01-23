import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
	public static int anInt2798;

	@OriginalMember(owner = "client!ke", name = "V", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
	public static int anInt2799 = 0;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)Lclient!ab;")
	public static Class2 method2262(@OriginalArg(1) int arg0) {
		@Pc(10) Class2 local10 = (Class2) Static296.aClass172_49.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static28.aClass22_13.method665(34, arg0);
		local10 = new Class2();
		if (local21 != null) {
			local10.method13(new Class4_Sub24(local21), arg0);
		}
		Static296.aClass172_49.method4345(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)V")
	public static void method2263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static207.anInt2136 > 0) {
			Static210.method3313(Static207.anInt2136);
			Static207.anInt2136 = 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(20) int local20 = Static258.anInt5069 * arg1;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 1; local24 < 255; local24++) {
			@Pc(40) int local40 = Static232.anIntArray375[local24] * (256 - local24) / 256;
			if (local40 < 0) {
				local40 = 0;
			}
			local14 += local40;
			@Pc(50) int local50;
			for (local50 = local40; local50 < 128; local50++) {
				@Pc(61) int local61 = Static258.anIntArray399[arg0 + local20++];
				@Pc(66) int local66 = Static49.anIntArray120[local14++];
				if (local66 == 0) {
					Static273.aClass4_Sub2_Sub4_Sub2_9.anIntArray409[local22++] = local61;
				} else {
					@Pc(72) int local72 = local66 + 18;
					@Pc(77) int local77 = 238 - local66;
					local66 = Static104.anIntArray185[local66];
					if (local72 > 255) {
						local72 = 255;
					}
					if (local77 > 255) {
						local77 = 255;
					}
					Static273.aClass4_Sub2_Sub4_Sub2_9.anIntArray409[local22++] = (local77 * (local61 & 0xFF00FF) + local72 * (local66 & 0xFF00FF) & 0xFF00FF00) + ((local66 & 0xFF00) * local72 + local77 * (local61 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			for (local50 = 0; local50 < local40; local50++) {
				Static273.aClass4_Sub2_Sub4_Sub2_9.anIntArray409[local22++] = Static258.anIntArray399[arg0 + local20++];
			}
			local20 += Static258.anInt5069 - 128;
		}
		if (Static251.aBoolean330) {
			Static87.method1454(Static273.aClass4_Sub2_Sub4_Sub2_9.anIntArray409, arg0, arg1, Static273.aClass4_Sub2_Sub4_Sub2_9.anInt5193, Static273.aClass4_Sub2_Sub4_Sub2_9.anInt5191);
		} else {
			Static273.aClass4_Sub2_Sub4_Sub2_9.method4135(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)V")
	public static void method2264() {
		@Pc(8) int local8 = Static169.method2691();
		if (local8 == 0) {
			Static185.aByteArrayArrayArray10 = null;
			Static308.method4714(0);
		} else if (local8 == 1) {
			Static47.method939((byte) 0);
			Static308.method4714(512);
			if (Static27.aByteArrayArrayArray2 != null) {
				Static1.method3();
			}
		} else {
			Static47.method939((byte) (Static180.anInt3623 - 4 & 0xFF));
			Static308.method4714(2);
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)Lclient!dg;")
	public static Class33 method2265(@OriginalArg(0) int arg0) {
		@Pc(16) Class33 local16 = (Class33) Static84.aClass172_14.method4347((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) byte[] local26 = Static136.aClass22_46.method665(32, arg0);
		local16 = new Class33();
		if (local26 != null) {
			local16.method988(new Class4_Sub24(local26));
		}
		local16.method993();
		Static84.aClass172_14.method4345(local16, (long) arg0);
		return local16;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(II)V")
	public static void method2266(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub33 local12 = (Class4_Sub33) Static49.aClass163_15.method4188((long) arg0);
		if (local12 != null) {
			for (@Pc(22) int local22 = 0; local22 < local12.anIntArray463.length; local22++) {
				local12.anIntArray463[local22] = -1;
				local12.anIntArray464[local22] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(II)V")
	public static void method2267() {
		Static176.aClass172_46.method4349(5);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method2269(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)V")
	public static void method2271() {
		Static95.aClass172_18.method4350();
	}
}
