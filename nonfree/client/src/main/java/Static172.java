import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!ee;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
	public static int anInt4394;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method4047(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(13) int local13 = Static153.method2742(arg0, arg1);
		@Pc(18) String[] local18 = new String[local13 + 1];
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local13; local24++) {
			@Pc(27) int local27;
			for (local27 = local22; arg1 != arg0.charAt(local27); local27++) {
			}
			local18[local20++] = arg0.substring(local22, local27);
			local22 = local27 + 1;
		}
		local18[local13] = arg0.substring(local22);
		return local18;
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
	public static void method4053() {
		@Pc(14) int local14;
		for (@Pc(5) int local5 = -1; local5 < Static22.anInt472; local5++) {
			if (local5 == -1) {
				local14 = 2047;
			} else {
				local14 = Static88.anIntArray137[local5];
			}
			@Pc(21) Class4_Sub5_Sub2_Sub1 local21 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local14];
			if (local21 != null && local21.anInt5368 > 0) {
				local21.anInt5368--;
				if (local21.anInt5368 == 0) {
					local21.aString53 = null;
				}
			}
		}
		for (local14 = 0; local14 < Static133.anInt2579; local14++) {
			@Pc(63) int local63 = Static95.anIntArray160[local14];
			@Pc(67) Class4_Sub5_Sub2_Sub2 local67 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local63];
			if (local67 != null && local67.anInt5368 > 0) {
				local67.anInt5368--;
				if (local67.anInt5368 == 0) {
					local67.aString53 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLclient!rg;)Lclient!pg;")
	public static Class7_Sub2 method4056(@OriginalArg(1) Class5_Sub12 arg0) {
		return new Class7_Sub2(arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5066(), arg0.method5072(), arg0.method5072(), arg0.method5115());
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLclient!vg;Z)V")
	public static void method4060(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class201 arg1) {
		@Pc(15) int local15 = arg1.anInt6493 == 0 ? arg1.anInt6505 : arg1.anInt6493;
		@Pc(27) int local27 = arg1.anInt6539 == 0 ? arg1.anInt6510 : arg1.anInt6539;
		Static62.method967(arg1.anInt6541, arg0, local27, local15, Static304.aClass201ArrayArray1[arg1.anInt6541 >> 16]);
		if (arg1.aClass201Array121 != null) {
			Static62.method967(arg1.anInt6541, arg0, local27, local15, arg1.aClass201Array121);
		}
		@Pc(67) Class5_Sub18 local67 = (Class5_Sub18) Static198.aClass190_21.method5466((long) arg1.anInt6541);
		if (local67 != null) {
			Static175.method2604(local27, local67.anInt1871, arg0, local15);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!gg;IIII)V")
	public static void method4061(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static111.method1963(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static350.anInt6715) {
			Static111.method1963(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static111.method1963(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static236.anInt4222) {
			Static111.method1963(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static236.anInt4222) {
			Static111.method1963(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static350.anInt6715 && arg4 <= Static236.anInt4222) {
			Static111.method1963(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static111.method1963(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static350.anInt6715 && arg4 > 0) {
			Static111.method1963(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
