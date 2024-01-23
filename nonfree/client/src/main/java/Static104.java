import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!pe;")
	public static Class130 aClass130_1;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "Lclient!pk;")
	public static Class132 aClass132_39;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString80 = "Starting 3d Library";

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString81 = "Loading world list data";

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString82 = "Loaded sprites";

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)I")
	public static int method1688() {
		return 15;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!bk;I)V")
	public static void method1689(@OriginalArg(0) Class17 arg0) {
		Static54.anInt1180 = 3;
		Static273.method4053(true);
		Static229.anInt4665 = 0;
		Static275.anInt5409 = 255;
		Static273.aBoolean455 = true;
		Static174.anInt3451 = 0;
		Static153.aBoolean257 = true;
		Static172.anInt3425 = 0;
		Static11.aBoolean244 = true;
		Static214.aBoolean355 = true;
		Static270.anInt5337 = 2;
		Static76.aBoolean117 = true;
		Static215.anInt4429 = 0;
		Static35.aBoolean50 = true;
		Static277.aBoolean477 = true;
		Static150.aBoolean367 = true;
		Static172.anInt3426 = 127;
		Static113.aBoolean182 = true;
		Static106.anInt2205 = 127;
		@Pc(54) Class35 local54 = null;
		Static37.aBoolean314 = true;
		Static198.aBoolean317 = true;
		if (Static16.anInt3524 >= 96) {
			Static223.method3485(2);
		} else {
			Static223.method3485(0);
		}
		Static109.aBoolean177 = false;
		Static279.anInt5448 = 0;
		Static185.anInt3690 = 0;
		Static163.aBoolean361 = false;
		Static81.aBoolean129 = true;
		Static270.aBoolean450 = false;
		Static99.anInt2072 = 0;
		try {
			@Pc(86) Class163 local86 = arg0.method438("runescape");
			while (local86.anInt5259 == 0) {
				Static162.method2645(1L);
			}
			if (local86.anInt5259 == 1) {
				local54 = (Class35) local86.anObject7;
				@Pc(112) byte[] local112 = new byte[(int) local54.method778()];
				@Pc(129) int local129;
				for (@Pc(114) int local114 = 0; local114 < local112.length; local114 += local129) {
					local129 = local54.method783(local112.length - local114, local112, local114);
					if (local129 == -1) {
						throw new IOException("EOF");
					}
				}
				Static263.method3991(new Class8_Sub2(local112));
			}
		} catch (@Pc(153) Exception local153) {
		}
		try {
			if (local54 != null) {
				local54.method779();
			}
		} catch (@Pc(162) Exception local162) {
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
	public static void method1691() {
		Static215.anImage3 = null;
		Static282.aFontMetrics2 = null;
		Static292.aFont1 = null;
	}
}
