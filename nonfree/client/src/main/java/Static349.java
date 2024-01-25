import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Lclient!qi;")
	public static Class19 aClass19_4;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
	public static boolean aBoolean421 = true;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	public static int anInt6296 = -1;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
	public static int anInt6298 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V")
	public static void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 - arg2 >= Static311.anInt5837 && Static265.anInt4933 >= arg0 + arg2 && arg3 - arg2 >= Static327.anInt3039 && arg3 + arg2 <= Static230.anInt4308) {
			Static265.method4493(arg0, arg1, arg2, arg3);
		} else {
			Static149.method2911(arg1, arg3, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
	public static void method5744() {
		if (Static81.anInt1483 != -1) {
			Static317.method5316(false, Static81.anInt1483, -1, -1);
			Static81.anInt1483 = -1;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J")
	public static long method5745() {
		return Static98.aClass10_1.method3296();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5746(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(17) String local17 = Static205.method5718(arg0);
		if (local17 == null) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static57.anInt1094; local22++) {
			@Pc(30) String local30 = Static205.method5718(Static86.aStringArray11[local22]);
			if (local30 != null && local30.equals(local17)) {
				Static57.anInt1094--;
				for (@Pc(42) int local42 = local22; local42 < Static57.anInt1094; local42++) {
					Static86.aStringArray11[local42] = Static86.aStringArray11[local42 + 1];
					Static328.aStringArray42[local42] = Static328.aStringArray42[local42 + 1];
					Static31.anIntArray63[local42] = Static31.anIntArray63[local42 + 1];
					Static295.aStringArray36[local42] = Static295.aStringArray36[local42 + 1];
					Static108.anIntArray272[local42] = Static108.anIntArray272[local42 + 1];
					Static354.aBooleanArray29[local42] = Static354.aBooleanArray29[local42 + 1];
				}
				Static138.anInt4574 = Static234.anInt36;
				Static131.aClass6_Sub10_Sub1_2.method2886(25);
				Static131.aClass6_Sub10_Sub1_2.method3968(Static302.method5198(arg0));
				Static131.aClass6_Sub10_Sub1_2.method3966(arg0);
				return;
			}
		}
	}
}
