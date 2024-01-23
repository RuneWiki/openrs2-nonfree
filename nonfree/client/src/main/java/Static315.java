import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	public static int anInt6131;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	public static int anInt6128 = 3353893;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString233 = " has logged in.";

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "Z")
	public static boolean aBoolean435 = true;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZ)V")
	public static void method5005(@OriginalArg(1) boolean arg0) {
		Static58.method944(arg0, Static123.anInt2333, Static66.anInt1232, Static253.anInt5224);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lclient!db;")
	public static Class31 method5006(@OriginalArg(1) int arg0) {
		@Pc(6) Class31 local6 = (Class31) Static249.aClass98_40.method2570((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static264.aClass155_110.method4121(32, arg0);
		local6 = new Class31();
		if (local21 != null) {
			local6.method758(new Class3_Sub26(local21));
		}
		local6.method760();
		Static249.aClass98_40.method2568(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method5007() {
		for (@Pc(13) Class3_Sub10 local13 = (Class3_Sub10) Static219.aClass56_21.method1281(); local13 != null; local13 = (Class3_Sub10) Static219.aClass56_21.method1278()) {
			if (local13.anInt1466 > 0) {
				local13.anInt1466--;
			}
			if (local13.anInt1466 != 0) {
				if (local13.anInt1478 > 0) {
					local13.anInt1478--;
				}
				if (local13.anInt1478 == 0 && local13.anInt1465 >= 1 && local13.anInt1475 >= 1 && local13.anInt1465 <= 102 && local13.anInt1475 <= 102 && (local13.anInt1472 < 0 || Static186.method3125(local13.anInt1472, local13.anInt1476))) {
					Static100.method1606(local13.anInt1471, local13.anInt1475, local13.anInt1476, local13.anInt1477, local13.anInt1469, local13.anInt1465, local13.anInt1472);
					local13.anInt1478 = -1;
					if (local13.anInt1472 == local13.anInt1473 && local13.anInt1473 == -1) {
						local13.method5013();
					} else if (local13.anInt1473 == local13.anInt1472 && local13.anInt1480 == local13.anInt1469 && local13.anInt1476 == local13.anInt1470) {
						local13.method5013();
					}
				}
			} else if (local13.anInt1473 < 0 || Static186.method3125(local13.anInt1473, local13.anInt1470)) {
				Static100.method1606(local13.anInt1471, local13.anInt1475, local13.anInt1470, local13.anInt1477, local13.anInt1480, local13.anInt1465, local13.anInt1473);
				local13.method5013();
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBI)V")
	public static void method5008(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class172 local3 = Static266.method4409(arg0);
		@Pc(17) int local17 = local3.anInt5445;
		@Pc(20) int local20 = local3.anInt5442;
		@Pc(23) int local23 = local3.anInt5438;
		@Pc(29) int local29 = Class3_Sub2_Sub6.anIntArray64[local23 - local20];
		if (arg1 < 0 || local29 < arg1) {
			arg1 = 0;
		}
		local29 <<= local20;
		Static247.method4162(local17, local29 & arg1 << local20 | ~local29 & Static161.anIntArray347[local17]);
	}
}
