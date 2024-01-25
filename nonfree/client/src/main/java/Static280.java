import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!s", name = "P", descriptor = "Lclient!bb;")
	public static Class16 aClass16_32;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "I")
	public static int anInt5700 = -1;

	@OriginalMember(owner = "client!s", name = "O", descriptor = "[I")
	public static final int[] anIntArray478 = new int[4];

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	public static void method4867() {
		Static130.method2653(false);
		if (Static138.anInt3049 >= 0 && Static138.anInt3049 != 0) {
			Static259.method2702(Static138.anInt3049);
			Static138.anInt3049 = -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public static void method4869() {
		Static326.aClass1_Sub23_3 = new Class1_Sub23(Static86.aClass34_66.method1285(Static259.anInt2907), "", Static245.anInt4996, 1012, 0L, 0, 0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	public static void method4871() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static342.anInt3001 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(II)V")
	public static void method4874() {
		Static153.aClass87_30.method2473(5);
		Static318.aClass87_56.method2473(5);
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "(I)V")
	public static void method4876() {
		if (Static237.anIntArray440 != null && Static31.anIntArray94 != null) {
			return;
		}
		Static31.anIntArray94 = new int[256];
		Static237.anIntArray440 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static237.anIntArray440[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static31.anIntArray94[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
	public static void method4877() {
		if (Static295.anInt5811 == 10 || Static295.anInt5811 == 28) {
			Static1.method25(Static320.anInt5326 >> 10, Static64.anInt1797 >> 10);
		} else {
			Static1.method25(Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0] >> 3, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0] >> 3);
		}
		Static339.method5476();
		Static37.method903();
		Static306.method5151();
		Static82.method1814();
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(II)Lclient!sp;")
	public static Class193 method4882(@OriginalArg(0) int arg0) {
		@Pc(18) Class193 local18 = (Class193) Static190.aClass87_36.method2482((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static68.aClass216_22.method5648(35, arg0);
		local18 = new Class193();
		if (local28 != null) {
			local18.method4974(new Class1_Sub8(local28));
		}
		local18.method4980();
		Static190.aClass87_36.method2481(local18, (long) arg0);
		return local18;
	}
}
