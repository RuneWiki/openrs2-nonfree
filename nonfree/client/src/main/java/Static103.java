import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	public static int anInt2776;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!he;")
	private static Class26 aClass26_1507 = Static6.method100("New User");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!he;")
	public static Class26 aClass26_1506 = aClass26_1507;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public static int anInt2778 = 0;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_1508 = Static6.method100("sl_button");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZII)V")
	public static void method1903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static47.anInt1417 = -1;
			Static15.anInt408 = -1;
			return;
		}
		@Pc(39) int local39 = Static110.method2006(arg0, arg2, Static132.anInt3270) - arg1;
		@Pc(43) int local43 = Class3_Sub1_Sub4_Sub4.anIntArray392[Static81.anInt2248];
		@Pc(47) int local47 = arg2 - Static54.anInt1624;
		@Pc(55) int local55 = Class3_Sub1_Sub4_Sub4.anIntArray391[Static32.anInt1052];
		@Pc(59) int local59 = arg0 - Static10.anInt282;
		@Pc(63) int local63 = Class3_Sub1_Sub4_Sub4.anIntArray392[Static32.anInt1052];
		@Pc(67) int local67 = Class3_Sub1_Sub4_Sub4.anIntArray391[Static81.anInt2248];
		@Pc(77) int local77 = local59 * local63 + local55 * local47 >> 16;
		@Pc(81) int local81 = local39 - Static79.anInt2157;
		@Pc(92) int local92 = local63 * local47 - local59 * local55 >> 16;
		@Pc(94) int local94 = local77;
		@Pc(105) int local105 = local81 * local43 - local92 * local67 >> 16;
		@Pc(116) int local116 = local81 * local67 + local92 * local43 >> 16;
		if (local116 >= 50) {
			Static47.anInt1417 = (local94 << 9) / local116 + 256;
			Static15.anInt408 = (local105 << 9) / local116 + 167;
		} else {
			Static47.anInt1417 = -1;
			Static15.anInt408 = -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	public static void method1904() {
		Static112.aBoolean164 = true;
		Static98.aBoolean151 = true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!he;Lclient!ef;ILclient!he;)[Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1[] method1905(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) Class26 arg2) {
		@Pc(9) int local9 = arg1.method574(arg2);
		@Pc(19) int local19 = arg1.method567(arg0, local9);
		return Static42.method807(arg1, local19, local9);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method1906() {
		aClass26_1508 = null;
		aClass26_1507 = null;
		aClass26_1506 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIIII)I")
	public static int method1907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg0;
			arg0 = arg5;
			arg5 = local12;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg4;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg1;
		} else {
			return 7 + 1 - arg4 - arg5;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!dd;")
	public static Class6 method1908(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class6_Sub1");
			@Pc(15) Class6 local15 = (Class6) local11.getDeclaredConstructor().newInstance();
			local15.method880(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class6_Sub2 local28 = new Class6_Sub2();
			local28.method880(arg1, arg2, arg0);
			return local28;
		}
	}
}
