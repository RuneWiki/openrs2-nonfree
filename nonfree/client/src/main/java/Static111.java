import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!m", name = "O", descriptor = "[I")
	public static int[] anIntArray308;

	@OriginalMember(owner = "client!m", name = "K", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1576 = Static118.method2249("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!m", name = "P", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1577 = Static118.method2249(" has logged out)3");

	@OriginalMember(owner = "client!m", name = "R", descriptor = "[I")
	public static final int[] anIntArray309 = new int[50];

	@OriginalMember(owner = "client!m", name = "U", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1578 = aClass65_1577;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZB)V")
	public static void method2032(@OriginalArg(0) boolean arg0) {
		Static16.method298();
		Static177.anInt3991++;
		if (Static177.anInt3991 < 50 && !arg0) {
			return;
		}
		Static177.anInt3991 = 0;
		if (Static190.aBoolean165 || Static123.aClass23_4 == null) {
			return;
		}
		Static45.aClass1_Sub14_Sub1_8.method1761(213);
		try {
			Static123.aClass23_4.method726(Static45.aClass1_Sub14_Sub1_8.anInt2306, Static45.aClass1_Sub14_Sub1_8.aByteArray29);
			Static45.aClass1_Sub14_Sub1_8.anInt2306 = 0;
		} catch (@Pc(52) IOException local52) {
			Static190.aBoolean165 = true;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(JB)V")
	public static void method2033(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static45.aClass1_Sub14_Sub1_8.method1761(205);
			Static45.aClass1_Sub14_Sub1_8.method1721(arg0);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Z")
	public static boolean method2034(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}
