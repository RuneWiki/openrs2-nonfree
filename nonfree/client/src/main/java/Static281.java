import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
	public static int anInt4758;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_170 = new Class67(76, 6);

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public static int anInt4757 = 0;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "[I")
	public static final int[] anIntArray357 = new int[14];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	public static void method3759() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static188.anInt3431 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)Z")
	public static boolean method3761() {
		try {
			if (Static270.anInt1979 == 2) {
				if (Static45.aClass1_Sub14_1 == null) {
					Static45.aClass1_Sub14_1 = Static468.method1504(Static371.aClass185_97, Static64.anInt996, Static318.anInt5262);
					if (Static45.aClass1_Sub14_1 == null) {
						return false;
					}
				}
				if (Static246.aClass58_1 == null) {
					Static246.aClass58_1 = new Class58(Static49.aClass185_12, Static293.aClass185_76);
				}
				if (Static181.aClass1_Sub9_Sub3_2.method4640(Static246.aClass58_1, Static45.aClass1_Sub14_1, Static337.aClass185_55)) {
					Static181.aClass1_Sub9_Sub3_2.method4632();
					Static181.aClass1_Sub9_Sub3_2.method4642(Static451.anInt7187);
					Static181.aClass1_Sub9_Sub3_2.method4633(Static107.aBoolean183, Static45.aClass1_Sub14_1);
					Static246.aClass58_1 = null;
					Static45.aClass1_Sub14_1 = null;
					Static270.anInt1979 = 0;
					Static371.aClass185_97 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static181.aClass1_Sub9_Sub3_2.method4629();
			Static371.aClass185_97 = null;
			Static270.anInt1979 = 0;
			Static246.aClass58_1 = null;
			Static45.aClass1_Sub14_1 = null;
		}
		return false;
	}
}
