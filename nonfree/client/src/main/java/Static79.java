import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_62 = new Class221("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "S")
	public static short aShort15 = 32767;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!sm;")
	public static Class210 aClass210_13 = new Class210();

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
	public static int anInt1520 = -1;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	public static void method1412(@OriginalArg(0) int arg0) {
		Static358.anInt6273 = arg0;
		Static276.anInt4916 = 3;
		Static269.anInt4775 = 100;
		Static10.anInt307 = -1;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)Z")
	public static boolean method1414(@OriginalArg(1) int arg0) {
		if (arg0 == 4 || arg0 == 51 || arg0 == 30 || arg0 == 58 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 19 || arg0 == 1002;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!lk;)V")
	public static void method1415(@OriginalArg(1) Class2_Sub13 arg0) {
		@Pc(13) int local13 = arg0.method4211();
		Static91.aClass243Array1 = new Class243[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			Static91.aClass243Array1[local18] = new Class243();
			Static91.aClass243Array1[local18].anInt6549 = arg0.method4211();
			Static91.aClass243Array1[local18].aString61 = arg0.method4202();
		}
		Static299.anInt5300 = arg0.method4211();
		Static232.anInt4266 = arg0.method4211();
		Static151.anInt2710 = arg0.method4211();
		Static22.aClass141_Sub1Array1 = new Class141_Sub1[Static232.anInt4266 + 1 - Static299.anInt5300];
		for (@Pc(70) int local70 = 0; local70 < Static151.anInt2710; local70++) {
			@Pc(76) int local76 = arg0.method4211();
			@Pc(84) Class141_Sub1 local84 = Static22.aClass141_Sub1Array1[local76] = new Class141_Sub1();
			local84.anInt6661 = arg0.method4240();
			local84.anInt6667 = arg0.method4239();
			local84.anInt6672 = Static299.anInt5300 + local76;
			local84.aString62 = arg0.method4202();
			local84.aString63 = arg0.method4202();
		}
		Static206.anInt3828 = arg0.method4239();
		Static73.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZLclient!km;IILclient!oj;I)V")
	public static void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class13 arg4, @OriginalArg(6) int arg5) {
		if (arg1) {
			Static248.aClass5_6.method5004((Static335.anInt5875 - Static248.aClass5_6.method4990()) / 2, (Static263.anInt4662 - Static248.aClass5_6.method4992()) / 2);
			Static208.aClass5_3.method5004((Static335.anInt5875 - Static208.aClass5_3.method4990()) / 2, 18);
		}
		arg4.method5617(Static335.anInt5875 / 2, arg0, -1, (Static209.aClass48_2 == Static311.aClass48_3 ? Static269.aClass221_168 : Static329.aClass221_202).method5229(Static189.anInt5185), Static263.anInt4662 / 2 - 26);
		@Pc(58) int local58 = Static263.anInt4662 / 2 - 18;
		arg2.method4552(Static335.anInt5875 / 2 - 152, local58, 304, 34, arg5, 0);
		arg2.method4552(Static335.anInt5875 / 2 - 151, local58 + 1, 302, 32, 0, 0);
		arg2.method4482(Static335.anInt5875 / 2 - 150, local58 + 2, Static368.anInt6425 * 3, 30, arg3, 0);
		arg2.method4482(Static368.anInt6425 * 3 + Static335.anInt5875 / 2 - 150, local58 + 2, 300 - Static368.anInt6425 * 3, 30, 0, 0);
		arg4.method5617(Static335.anInt5875 / 2, arg0, -1, Static68.aString16, Static263.anInt4662 / 2 + 4);
	}
}
