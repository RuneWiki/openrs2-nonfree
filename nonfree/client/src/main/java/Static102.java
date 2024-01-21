import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	public static int anInt2504;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!wa;")
	public static Class87 aClass87_8;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_709 = Static38.method685("jolt");

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Lclient!ai;")
	private static Class6 aClass6_712 = Static38.method685("Your account is already logged in)3");

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!ai;")
	public static Class6 aClass6_710 = aClass6_712;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!ai;")
	public static Class6 aClass6_711 = Static38.method685("Passwort: ");

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "[J")
	public static long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "[J")
	public static long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!mb;ILclient!je;I)V")
	public static void method1694(@OriginalArg(0) Class10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2) {
		@Pc(12) byte[] local12 = null;
		@Pc(14) Class84 local14 = Static25.aClass84_2;
		synchronized (Static25.aClass84_2) {
			for (@Pc(21) Class2_Sub12 local21 = (Class2_Sub12) Static25.aClass84_2.method2694(); local21 != null; local21 = (Class2_Sub12) Static25.aClass84_2.method2697()) {
				if (local21.aLong241 == (long) arg1 && arg2 == local21.aClass40_1 && local21.anInt1762 == 0) {
					local12 = local21.aByteArray7;
					break;
				}
			}
		}
		if (local12 == null) {
			@Pc(68) byte[] local68 = arg2.method1174(arg1);
			arg0.method1608(arg1, local68, true, arg2);
		} else {
			arg0.method1608(arg1, local12, true, arg2);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLclient!c;Lclient!c;)I")
	public static int method1695(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1589(Static9.aClass6_75, Static13.aClass6_112)) {
			local5++;
		}
		if (arg1.method1589(Static9.aClass6_75, Static180.aClass6_1273)) {
			local5++;
		}
		if (arg1.method1589(Static9.aClass6_75, Static182.aClass6_1279)) {
			local5++;
		}
		if (arg1.method1589(Static9.aClass6_75, Static132.aClass6_888)) {
			local5++;
		}
		if (arg1.method1589(Static9.aClass6_75, Static170.aClass6_1185)) {
			local5++;
		}
		if (arg1.method1589(Static9.aClass6_75, Static136.aClass6_925)) {
			local5++;
		}
		arg1.method1589(Static9.aClass6_75, Static173.aClass6_1207);
		arg1.method1589(Static9.aClass6_75, Static51.aClass6_389);
		arg1.method1589(Static9.aClass6_75, Static89.aClass6_664);
		arg1.method1589(Static9.aClass6_75, Static109.aClass6_1027);
		arg1.method1589(Static9.aClass6_75, Static146.aClass6_1197);
		return local5;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method1696() {
		aClass6_710 = null;
		aLongArray3 = null;
		aClass6_711 = null;
		aClass87_8 = null;
		aClass6_712 = null;
		aLongArray4 = null;
		aClass6_709 = null;
	}
}
