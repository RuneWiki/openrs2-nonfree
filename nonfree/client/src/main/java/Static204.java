import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
	public static int anInt8127 = 0;

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
	public static int anInt8130 = 0;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
	public static void method7271() {
		for (@Pc(17) Class2_Sub18 local17 = (Class2_Sub18) Static284.aClass335_14.method8358(); local17 != null; local17 = (Class2_Sub18) Static284.aClass335_14.method8355()) {
			if (local17.aBoolean111) {
				local17.aBoolean111 = false;
			} else {
				Static274.method4661(local17.anInt1619);
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIZILclient!gga;ZLclient!of;)V")
	public static void method7272(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class124 arg2, @OriginalArg(6) Class2_Sub26_Sub3 arg3) {
		Static494.method7792(arg0, arg1, arg2);
		Static151.aClass2_Sub26_Sub3_5 = arg3;
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V")
	public static void method7273() {
		for (@Pc(7) int local7 = 0; local7 < Static395.anInt7388; local7++) {
			@Pc(19) int local19 = Static340.method5709(Static395.anInt7388, local7 + Static7.anInt133) * Static19.anInt353;
			for (@Pc(21) int local21 = 0; local21 < Static19.anInt353; local21++) {
				@Pc(32) int local32 = local19 + Static340.method5709(Static19.anInt353, local21 + Static130.anInt2508);
				if (Static282.anIntArray265[local32] == Static468.anInt8414) {
					Static17.anInterface17Array7[local32].method9556(0, 0, Static532.anInt9333, Static341.anInt6402, local21 * Static532.anInt9333, Static341.anInt6402 * local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
	public static void method7274() {
		if (Static96.aClass48_5.aBoolean76) {
			Static65.anInt1229 = 96;
			return;
		}
		try {
			@Pc(19) Method local19 = Runtime.class.getMethod("maxMemory");
			if (local19 != null) {
				try {
					@Pc(23) Runtime local23 = Runtime.getRuntime();
					@Pc(29) Long local29 = (Long) local19.invoke(local23, (Object[]) null);
					Static65.anInt1229 = (int) (local29 / 1048576L) + 1;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}
}
