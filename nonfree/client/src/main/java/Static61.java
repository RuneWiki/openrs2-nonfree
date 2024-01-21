import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_451 = Static158.method3034("Hierhin gehen");

	@OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_452 = Static158.method3034("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ra;)Lclient!ra;")
	public static Class72 method1422(@OriginalArg(1) Class72 arg0) {
		@Pc(7) int local7 = Static144.method2914(Static26.method637(arg0));
		if (local7 == 0) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			arg0 = Static173.method3201(arg0.anInt3937);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ob;Lclient!ob;ISJII)V")
	public static void method1423(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) short arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static103.aBoolean115 || Static169.anInt4148 >= 500) {
			return;
		}
		Static22.aClass60Array5[Static169.anInt4148] = arg1;
		Static196.aClass60Array26[Static169.anInt4148] = arg0;
		Static140.aShortArray53[Static169.anInt4148] = arg2;
		Static144.aLongArray7[Static169.anInt4148] = arg3;
		Static6.anIntArray27[Static169.anInt4148] = arg4;
		Static120.anIntArray375[Static169.anInt4148] = arg5;
		Static169.anInt4148++;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!pe;B)V")
	public static void method1424(@OriginalArg(0) Class13 arg0) {
		Static91.aClass13_19 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)I")
	public static int method1425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!ra;)Lclient!ra;")
	public static Class72 method1429(@OriginalArg(1) Class72 arg0) {
		@Pc(15) Class72 local15 = method1422(arg0);
		if (local15 == null) {
			local15 = arg0.aClass72_9;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V")
	public static void method1432(@OriginalArg(0) int arg0) {
		Static101.anInt2911 = 1000 / arg0;
	}
}
