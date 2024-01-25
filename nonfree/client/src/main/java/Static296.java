import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static296 {

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "Lclient!sfa;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "I")
	public static int anInt5545;

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "I")
	public static final int anInt5549 = 1405;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V")
	public static void method4635() {
		Static22.method8509();
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)Z")
	public static boolean method4637(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
