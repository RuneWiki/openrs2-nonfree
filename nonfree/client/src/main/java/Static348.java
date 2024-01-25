import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	public static int anInt5826;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_177 = new Class107(94, -2);

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "Lclient!gu;")
	public static final Class96 aClass96_36 = new Class96(16);

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString61 = null;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILclient!uq;I)V")
	public static void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		if (Static355.aBoolean412) {
			@Pc(13) Class184 local13 = Static161.anInt3018 == -1 ? null : Static400.aClass35_2.method867(Static161.anInt3018);
			if (Static57.method1248(arg2).method1737() && (Static410.anInt6626 & 0x20) != 0 && (local13 == null || arg2.method5548(local13.anInt5018, Static161.anInt3018) != local13.anInt5018)) {
				Static373.method5165(arg2.anInt6704, Static289.aString63 + " -> " + arg2.aString66, arg2.anInt6679, arg2.anInt6689, true, 51, false, Static139.aString22, Static347.anInt5821, 0L);
			}
			return;
		}
		@Pc(77) String local77;
		for (@Pc(68) int local68 = 9; local68 >= 5; local68--) {
			local77 = Static309.method4390(arg2, local68);
			if (local77 != null) {
				Static373.method5165(arg2.anInt6704, arg2.aString66, arg2.anInt6679, arg2.anInt6689, true, 1007, false, local77, Static422.method5613(arg2, local68), (long) (local68 + 1));
			}
		}
		local77 = Static287.method4171(arg2);
		if (local77 != null) {
			Static373.method5165(arg2.anInt6704, arg2.aString66, arg2.anInt6679, arg2.anInt6689, true, 3, false, local77, arg2.anInt6712, 0L);
		}
		for (@Pc(140) int local140 = 4; local140 >= 0; local140--) {
			@Pc(147) String local147 = Static309.method4390(arg2, local140);
			if (local147 != null) {
				Static373.method5165(arg2.anInt6704, arg2.aString66, arg2.anInt6679, arg2.anInt6689, true, 22, false, local147, Static422.method5613(arg2, local140), (long) (local140 + 1));
			}
		}
		if (!Static57.method1248(arg2).method1739()) {
			return;
		}
		if (arg2.aString69 == null) {
			Static373.method5165(arg2.anInt6704, "", arg2.anInt6679, arg2.anInt6689, true, 2, false, Static356.aClass7_134.method331(Static341.anInt5770), -1, 0L);
		} else {
			Static373.method5165(arg2.anInt6704, "", arg2.anInt6679, arg2.anInt6689, true, 2, false, arg2.aString69, -1, 0L);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)Lclient!pd;")
	public static Class188 method4851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class188 local15 = new Class188();
		local15.anInt5222 = arg0 + 1 + 5;
		local15.anInt5203 = arg1 + 6;
		local15.anInt5211 = -1;
		local15.anInt5216 = -1;
		local15.anIntArrayArray51 = new int[local15.anInt5203][local15.anInt5222];
		local15.method4320();
		return local15;
	}
}
