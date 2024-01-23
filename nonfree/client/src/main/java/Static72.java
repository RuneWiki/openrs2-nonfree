import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V")
	public static void method1145() {
		Static11.aClass61_23.method1381(5);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIIIII)V")
	public static void method1147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = (arg1 - 32) * arg1 / arg4;
		if (local14 < 8) {
			local14 = 8;
		}
		Static267.aClass43Array5[0].method4298(arg3, arg0);
		@Pc(38) int local38 = arg2 * (arg1 - local14 - 32) / (arg4 - arg1);
		Static267.aClass43Array5[1].method4298(arg3, arg1 + arg0 - 16);
		if (!Static116.aBoolean188) {
			Static103.method1664(arg3, arg0 + 16, 16, arg1 - 32, Static123.anInt2477);
			Static103.method1664(arg3, arg0 + local38 + 16, 16, local14, Static10.anInt94);
			Static103.method1683(arg3, local38 + arg0 + 16, local14, Static54.anInt1189);
			Static103.method1683(arg3 + 1, arg0 + 16 + local38, local14, Static54.anInt1189);
			Static103.method1677(arg3, arg0 + local38 + 16, 16, Static54.anInt1189);
			Static103.method1677(arg3, local38 + arg0 + 17, 16, Static54.anInt1189);
			Static103.method1683(arg3 + 15, local38 + arg0 + 16, local14, Static152.anInt3121);
			Static103.method1683(arg3 + 14, local38 + 17 + arg0, local14 - 1, Static152.anInt3121);
			Static103.method1677(arg3, arg0 + local38 + local14 + 15, 16, Static152.anInt3121);
			Static103.method1677(arg3 + 1, arg0 - -14 + local38 - -local14, 15, Static152.anInt3121);
			return;
		}
		Static126.method1994(arg3, arg0 + 16, 16, arg1 - 32, Static123.anInt2477);
		Static126.method1994(arg3, arg0 + local38 + 16, 16, local14, Static10.anInt94);
		Static126.method1990(arg3, arg0 + local38 + 16, local14, Static54.anInt1189);
		Static126.method1990(arg3 + 1, local38 + 16 + arg0, local14, Static54.anInt1189);
		Static126.method1996(arg3, arg0 + local38 + 16, 16, Static54.anInt1189);
		Static126.method1996(arg3, arg0 + local38 + 17, 16, Static54.anInt1189);
		Static126.method1990(arg3 + 15, local38 + arg0 + 16, local14, Static152.anInt3121);
		Static126.method1990(arg3 + 14, local38 + arg0 + 17, local14 - 1, Static152.anInt3121);
		Static126.method1996(arg3, local38 + arg0 + local14 + 15, 16, Static152.anInt3121);
		Static126.method1996(arg3 + 1, local38 + arg0 + 14 + local14, 15, Static152.anInt3121);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!pk;BI)Lclient!eg;")
	public static Class8_Sub1_Sub7_Sub1 method1148(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1) {
		return Static34.method533(arg0, arg1) ? Static10.method89() : null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1149(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			@Pc(32) long local32 = arg0;
			while (local32 != 0L) {
				local32 /= 37L;
				local30++;
			}
			@Pc(58) StringBuffer local58 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(66) long local66 = arg0;
				arg0 /= 37L;
				local58.append(Static64.aCharArray1[(int) (local66 - arg0 * 37L)]);
			}
			return local58.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)I")
	public static int method1151(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
