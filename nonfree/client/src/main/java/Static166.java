import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "[I")
	public static int[] anIntArray334;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "Lclient!lm;")
	public static Class134 aClass134_74;

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "Lclient!lm;")
	public static Class134 aClass134_75;

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
	public static int anInt3450 = 0;

	@OriginalMember(owner = "client!ld", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString127 = "M";

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
	public static int anInt3452 = 0;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)V")
	public static void method2920() {
		Static223.aClass37_30.method920(5);
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
	public static void method2922() {
		@Pc(10) Class37 local10 = Static314.aClass37_102;
		synchronized (Static314.aClass37_102) {
			Static314.aClass37_102.method914();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)I")
	public static int method2923(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2924(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V")
	public static void method2925() {
		@Pc(7) Class3 local7 = Static224.aClass3_1;
		synchronized (Static224.aClass3_1) {
			Static174.anInt5783++;
			Static347.anInt6680 = Static267.anInt5495;
			@Pc(31) int local31;
			if (Static94.anInt1779 >= 0) {
				while (Static94.anInt1779 != Static129.anInt2575) {
					local31 = Static149.anIntArray299[Static129.anInt2575];
					Static129.anInt2575 = Static129.anInt2575 + 1 & 0x7F;
					if (local31 >= 0) {
						Static112.aBooleanArray11[local31] = true;
					} else {
						Static112.aBooleanArray11[~local31] = false;
					}
				}
			} else {
				for (local31 = 0; local31 < 112; local31++) {
					Static112.aBooleanArray11[local31] = false;
				}
				Static94.anInt1779 = Static129.anInt2575;
			}
			Static267.anInt5495 = Static165.anInt3407;
		}
	}
}
