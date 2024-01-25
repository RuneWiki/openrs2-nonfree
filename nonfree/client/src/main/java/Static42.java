import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
	public static int anInt1523;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "[I")
	public static final int[] anIntArray60 = new int[25];

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "Lclient!mk;")
	public static final Class207 aClass207_1 = new Class207();

	@OriginalMember(owner = "client!bi", name = "J", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V")
	public static void method1332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = Static340.anInt6655;
		@Pc(15) int local15 = Static108.anInt2818;
		if (Static513.aBoolean642) {
			local13 += Static550.method8313();
			local15 += Static530.method7484();
		}
		@Pc(38) Class21 local38;
		if (Static85.anInt8479 == 1) {
			local38 = Static147.aClass21Array6[Static459.anInt8403 / 100];
			local38.method5796(local13 - 8, local15 + -8);
			Static460.method6945(local15 - 8, local38.method5785() + -8 + local15, local13 - 8, local38.method5779() + -8 + local13);
		}
		if (Static85.anInt8479 == 2) {
			local38 = Static147.aClass21Array6[Static459.anInt8403 / 100 + 4];
			local38.method5796(local13 - 8, local15 + -8);
			Static460.method6945(local15 - 8, local15 + -8 - -local38.method5785(), local13 - 8, local38.method5779() + (local13 - 8));
		}
		Static95.method2216();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V")
	public static void method1336(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static212.anInt4965 != -1) {
				Static297.method4905(Static212.anInt4965);
			}
			for (@Pc(23) Class8_Sub51 local23 = (Class8_Sub51) Static218.aClass253_14.method6593(); local23 != null; local23 = (Class8_Sub51) Static218.aClass253_14.method6595()) {
				if (!local23.method8639()) {
					local23 = (Class8_Sub51) Static218.aClass253_14.method6593();
					if (local23 == null) {
						break;
					}
				}
				Static406.method6452(true, local23, false);
			}
			Static212.anInt4965 = -1;
			Static218.aClass253_14 = new Class253(8);
			Static348.method5528();
			Static212.anInt4965 = Static524.anInt9099;
			Static131.method2902(false);
			Static121.method2707();
			Static273.method4691(Static212.anInt4965);
		}
		Static617.aBoolean747 = true;
	}
}
