import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!of;")
	public static Class40 aClass40_12;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
	public static int anInt3680;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
	public static int anInt3676 = 0;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "Z")
	public static boolean aBoolean281 = true;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
	public static final int anInt3685 = -9017772;

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString156 = "wave:";

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I")
	public static int method3620(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (local19 * arg0 >> 12) + 40960;
		return local27 * local13 >> 12;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIIIII)V")
	public static void method3621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static230.anInt4308 || Static327.anInt3039 > arg4) {
			return;
		}
		@Pc(23) boolean local23;
		if (arg1 < Static311.anInt5837) {
			arg1 = Static311.anInt5837;
			local23 = false;
		} else if (arg1 <= Static265.anInt4933) {
			local23 = true;
		} else {
			arg1 = Static265.anInt4933;
			local23 = false;
		}
		@Pc(42) boolean local42;
		if (arg2 < Static311.anInt5837) {
			arg2 = Static311.anInt5837;
			local42 = false;
		} else if (Static265.anInt4933 >= arg2) {
			local42 = true;
		} else {
			arg2 = Static265.anInt4933;
			local42 = false;
		}
		if (Static327.anInt3039 > arg0) {
			arg0 = Static327.anInt3039;
		} else {
			Static14.method247(arg2, arg3, Static11.anIntArrayArray11[arg0++], arg1);
		}
		if (Static230.anInt4308 < arg4) {
			arg4 = Static230.anInt4308;
		} else {
			Static14.method247(arg2, arg3, Static11.anIntArrayArray11[arg4--], arg1);
		}
		@Pc(107) int local107;
		if (local23 && local42) {
			for (local107 = arg0; local107 <= arg4; local107++) {
				@Pc(151) int[] local151 = Static11.anIntArrayArray11[local107];
				local151[arg1] = local151[arg2] = arg3;
			}
		} else if (local23) {
			for (local107 = arg0; local107 <= arg4; local107++) {
				Static11.anIntArrayArray11[local107][arg1] = arg3;
			}
		} else if (local42) {
			for (local107 = arg0; local107 <= arg4; local107++) {
				Static11.anIntArrayArray11[local107][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)Lclient!fb;")
	public static Class66 method3622(@OriginalArg(1) int arg0) {
		@Pc(5) Class70 local5 = Static30.aClass70_18;
		@Pc(14) Class66 local14;
		synchronized (Static30.aClass70_18) {
			local14 = (Class66) Static30.aClass70_18.method1396((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static233.aClass53_106.method1033(Static219.method3904(arg0), Static88.method1492(arg0));
		local14 = new Class66();
		local14.anInt1497 = arg0;
		if (local34 != null) {
			local14.method1377(new Class6_Sub10(local34));
		}
		local14.method1372();
		if (!Static78.aBoolean96 && local14.aBoolean103) {
			local14.aStringArray10 = null;
			local14.anIntArray163 = null;
		}
		if (local14.aBoolean106) {
			local14.aBoolean101 = false;
			local14.anInt1486 = 0;
		}
		@Pc(80) Class70 local80 = Static30.aClass70_18;
		synchronized (Static30.aClass70_18) {
			Static30.aClass70_18.method1406(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!qp;)Ljava/lang/String;")
	public static String method3623(@OriginalArg(1) Class6_Sub32 arg0) {
		return arg0.aString209 == null || arg0.aString209.length() <= 0 ? arg0.aString208 : arg0.aString208 + Static184.aString142 + arg0.aString209;
	}
}
