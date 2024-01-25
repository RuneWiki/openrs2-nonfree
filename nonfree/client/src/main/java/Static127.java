import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
	public static int anInt2215;

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "[I")
	public static int[] anIntArray104 = new int[2];

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_85 = new Class214(108, -1);

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IC)Z")
	public static boolean method1749(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
	public static void method1752(@OriginalArg(1) int arg0) {
		Static12.anInt231 = 1000 / arg0;
	}
}
