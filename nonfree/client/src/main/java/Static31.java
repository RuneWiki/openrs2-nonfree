import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!td;")
	public static Class156 aClass156_2;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "[I")
	public static int[] anIntArray78;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "[Lclient!om;")
	public static Class125[] aClass125Array1 = new Class125[14];

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
	public static int anInt745 = 0;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString42 = "Starting 3d Library";

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "[I")
	public static int[] anIntArray77 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	public static void method643() {
		Static191.aClass135_19.method3324();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method644(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)Lclient!ii;")
	public static Class1_Sub2_Sub12 method645(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub12 local10 = (Class1_Sub2_Sub12) Static23.aClass49_1.method1381((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static72.aClass91_57.method2495(11, arg0);
		local10 = new Class1_Sub2_Sub12();
		if (local29 != null) {
			local10.method2057(new Class1_Sub11(local29));
		}
		Static23.aClass49_1.method1385(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!tj;Z)V")
	public static void method646(@OriginalArg(0) Class12_Sub2 arg0) {
		@Pc(9) int local9;
		for (local9 = 0; local9 < Static124.anIntArray257.length; local9++) {
			Static124.anIntArray257[local9] = 0;
		}
		@Pc(40) int local40;
		for (local9 = 0; local9 < 5000; local9++) {
			local40 = (int) ((double) 256 * 128.0D * Math.random());
			Static124.anIntArray257[local40] = (int) (Math.random() * 284.0D);
		}
		@Pc(70) int local70;
		@Pc(79) int local79;
		for (local9 = 0; local9 < 20; local9++) {
			for (local40 = 1; local40 < 255; local40++) {
				for (local70 = 1; local70 < 127; local70++) {
					local79 = local70 + (local40 << 7);
					Static151.anIntArray555[local79] = (Static124.anIntArray257[local79 + 128] + Static124.anIntArray257[local79 - 1] + Static124.anIntArray257[local79 + 1] + Static124.anIntArray257[local79 + -128]) / 4;
				}
			}
			@Pc(117) int[] local117 = Static124.anIntArray257;
			Static124.anIntArray257 = Static151.anIntArray555;
			Static151.anIntArray555 = local117;
		}
		if (arg0 == null) {
			return;
		}
		local9 = 0;
		for (local40 = 0; local40 < arg0.anInt5026; local40++) {
			for (local70 = 0; local70 < arg0.anInt5018; local70++) {
				if (arg0.aByteArray66[local9++] != 0) {
					local79 = arg0.anInt5028 + local70 + 16;
					@Pc(164) int local164 = arg0.anInt5022 + local40 + 16;
					@Pc(170) int local170 = (local164 << 7) + local79;
					Static124.anIntArray257[local170] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)I")
	public static int method647() {
		if (Static237.aFrame2 != null) {
			return 3;
		} else if (Static277.aBoolean412 && Static253.aBoolean377) {
			return 2;
		} else if (Static277.aBoolean412 && !Static253.aBoolean377) {
			return 1;
		} else {
			return 0;
		}
	}
}
