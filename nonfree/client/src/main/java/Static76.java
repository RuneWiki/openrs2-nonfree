import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "Lclient!nm;")
	public static Class119 aClass119_79;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "Lclient!jo;")
	public static Class96 aClass96_23 = new Class96();

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "[C")
	public static char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "J")
	public static long aLong182 = 0L;

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "[I")
	public static int[] anIntArray542 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public static void method3984() {
		if (Static54.aBoolean118) {
			return;
		}
		Static54.aBoolean118 = true;
		Static167.aBoolean68 = true;
		if (Static240.aBoolean404) {
			Static8.aFloat4 = (int) Static8.aFloat4 + 47 & 0xFFFFFFF0;
		} else {
			Static241.aFloat81 += (12.0F - Static241.aFloat81) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)V")
	public static void method3985() {
		Static89.aClass175_13.method4288(5);
		Static111.aClass175_17.method4288(5);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	public static void method3988() {
		Static49.method905();
		Static292.method4396();
		Static64.method1136();
		Static145.method2519();
		Static17.method271();
		Static179.method3041();
		Static87.method1720();
		Static189.method3225();
		Static236.method3801();
		Static17.method276();
		Static86.method1717();
		Static254.method3979();
		Static91.method1739();
		Static221.method3567();
		Static243.method3858();
		Static121.method2200();
		Static246.method3873();
		Static58.method1031();
		Static145.method2521();
		if (Static106.anInt3751 != 0) {
			for (@Pc(53) int local53 = 0; local53 < Static158.aByteArrayArray14.length; local53++) {
				Static158.aByteArrayArray14[local53] = null;
			}
			Static206.anInt3976 = 0;
		}
		Static9.method170();
		Static138.method3847();
		Static261.method4038();
		Static14.method211();
		Static238.aClass175_30.method4287();
		if (!Static71.aBoolean165) {
			((Class52_Sub1) Static119.anInterface5_1).method1488();
		}
		Static16.aClass112_1.method2959();
		Static270.aClass119_84.method3218();
		Static103.aClass119_39.method3218();
		Static34.aClass119_13.method3218();
		Static125.aClass119_46.method3218();
		Static67.aClass119_20.method3218();
		Static197.aClass119_68.method3218();
		Static58.aClass119_18.method3218();
		Static45.aClass119_15.method3218();
		Static121.aClass119_45.method3218();
		Static265.aClass119_83.method3218();
		Static21.aClass119_6.method3218();
		Static31.aClass175_6.method4287();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;BLclient!fh;)I")
	public static int method3989(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		@Pc(11) int local11 = arg1.anInt2018;
		@Pc(15) byte[] local15 = Static132.method2309(arg0);
		arg1.method1831(local15.length);
		arg1.anInt2018 += Static35.aClass169_1.method4204(0, local15, local15.length, arg1.anInt2018, arg1.aByteArray63);
		return arg1.anInt2018 - local11;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public static void method3990() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(27) Long local27 = (Long) local12.invoke(local20, (Object[]) null);
					Static73.anInt1579 = (int) (local27 / 1048576L) + 1;
				} catch (@Pc(37) Throwable local37) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}
}
