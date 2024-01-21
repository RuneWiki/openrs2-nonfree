import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!u;")
	public static Class76 aClass76_54;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!u;")
	public static Class76 aClass76_55;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	public static int anInt1966 = 0;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
	public static int anInt1967 = 0;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_614 = Static49.method1293(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Lclient!rf;")
	private static Class70 aClass70_616 = Static49.method1293("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_615 = aClass70_616;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_617 = Static49.method1293("headicons_hint");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)I")
	public static int method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method1486() {
		Static131.aClass1_Sub9_Sub1_3.method1283(211);
		Static131.aClass1_Sub9_Sub1_3.method1263(0L);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI[Lclient!ig;)V")
	public static void method1487(@OriginalArg(1) int arg0, @OriginalArg(2) Class39[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(11) Class39 local11 = arg1[local3];
			if (local11 != null) {
				if (local11.anInt2342 == 0) {
					if (local11.aClass39Array1 != null) {
						method1487(arg0, local11.aClass39Array1);
					}
					@Pc(35) Class1_Sub14 local35 = (Class1_Sub14) Static128.aClass30_14.method1467((long) local11.anInt2355);
					if (local35 != null) {
						Static31.method792(arg0, local35.anInt2467);
					}
				}
				@Pc(51) Class1_Sub19 local51;
				if (arg0 == 0 && local11.anObjectArray2 != null) {
					local51 = new Class1_Sub19();
					local51.aClass39_31 = local11;
					local51.anObjectArray27 = local11.anObjectArray2;
					Static60.method1460(local51);
				}
				if (arg0 == 1 && local11.anObjectArray22 != null) {
					if (local11.anInt2344 >= 0) {
						@Pc(81) Class39 local81 = Static128.method3227(local11.anInt2355);
						if (local81 == null || local81.aClass39Array1 == null || local11.anInt2344 >= local81.aClass39Array1.length || local81.aClass39Array1[local11.anInt2344] != local11) {
							continue;
						}
					}
					local51 = new Class1_Sub19();
					local51.anObjectArray27 = local11.anObjectArray22;
					local51.aClass39_31 = local11;
					Static60.method1460(local51);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public static void method1488() {
		aClass76_54 = null;
		aClass76_55 = null;
		aClass70_617 = null;
		aClass70_614 = null;
		aClass70_616 = null;
		aClass70_615 = null;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(IIII)V")
	public static void method1489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class54 local13 = local7.aClass54_1;
		if (local13 != null) {
			local13.anInt3119 = local13.anInt3119 * arg3 / 16;
			local13.anInt3118 = local13.anInt3118 * arg3 / 16;
		}
	}
}
