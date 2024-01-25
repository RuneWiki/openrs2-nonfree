import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public static int anInt2079;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!vp;")
	public static Class309 aClass309_3 = null;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static19.method827(arg0, arg3, arg2, arg4, 0, arg5, arg1);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method1975(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static542.aClass160_105.anInt4800 = 1;
		@Pc(9) String local9 = arg0.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static454.aClass153_2.anInt4594; local21++) {
			@Pc(27) Class192 local27 = Static454.aClass153_2.method4007(local21);
			if ((!arg1 || local27.aBoolean397) && local27.anInt5814 == -1 && local27.anInt5784 == -1 && local27.anInt5765 == 0 && local27.aString55.toLowerCase().indexOf(local9) != -1) {
				if (local14 >= 250) {
					Static357.anInt6481 = -1;
					Static210.aShortArray70 = null;
					return;
				}
				if (local14 >= local12.length) {
					@Pc(73) short[] local73 = new short[local12.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local14; local75++) {
						local73[local75] = local12[local75];
					}
					local12 = local73;
				}
				local12[local14++] = (short) local21;
			}
		}
		Static249.anInt4839 = 0;
		Static210.aShortArray70 = local12;
		Static357.anInt6481 = local14;
		@Pc(108) String[] local108 = new String[Static357.anInt6481];
		for (@Pc(110) int local110 = 0; local110 < Static357.anInt6481; local110++) {
			local108[local110] = Static454.aClass153_2.method4007(local12[local110]).aString55;
		}
		Static473.method6886(local108, Static210.aShortArray70);
		Static542.aClass160_105.method4201();
		Static542.aClass160_105.anInt4800 = 2;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIII)V")
	public static void method1977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 * Static89.aClass1_Sub28_Sub1_1.anInt4899 >> 8;
		if (arg0 == -1 && !Static289.aBoolean391) {
			Static363.method6956();
		} else if (arg0 != -1 && (arg0 != Static547.anInt9477 || !Static277.method4741()) && local10 != 0 && !Static289.aBoolean391) {
			Static392.method5910(local10, arg0, arg2, Static45.aClass160_10);
		}
		Static547.anInt9477 = arg0;
	}
}
