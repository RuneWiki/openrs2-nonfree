import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static int anInt948 = 0;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString35 = "white:";

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString36 = "Please wait...";

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
	public static int anInt961 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BILclient!nc;)V")
	public static void method787(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub5_Sub1 arg1) {
		@Pc(16) Class3_Sub20 local16 = (Class3_Sub20) Static245.aClass30_32.method663((long) arg0);
		if (local16 == null) {
			return;
		}
		if (local16.aClass3_Sub15_Sub1_3 != null) {
			Static86.aClass3_Sub15_Sub2_1.method2432(local16.aClass3_Sub15_Sub1_3);
			local16.aClass3_Sub15_Sub1_3 = null;
		}
		local16.method5013();
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method791() {
		Static272.aByte15 = 0;
		Static81.anInt1533 = 0;
		Static247.anInt4992 = 0;
		Static6.aBoolean11 = false;
		Static230.anInt4489 = 0;
		Static36.anInt639 = -1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)V")
	public static void method792() {
		Static153.aClass98_21.method2565(5);
		Static304.aClass98_46.method2565(5);
	}
}
