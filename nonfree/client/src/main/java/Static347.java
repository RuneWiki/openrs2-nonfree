import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static347 {

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	public static int anInt7042;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "Lclient!xa;")
	public static Class37 aClass37_31;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "Z")
	public static boolean aBoolean596 = false;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)Z")
	public static boolean method5854(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Z")
	public static boolean method5855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static464.method7108(arg1, arg0) | (arg1 & 0x800) != 0 || Static251.method4498(arg1, arg0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public static void method5856(@OriginalArg(1) int arg0) {
		if (Static370.anIntArray467 == null || arg0 > Static370.anIntArray467.length) {
			Static370.anIntArray467 = new int[arg0];
		}
	}
}
