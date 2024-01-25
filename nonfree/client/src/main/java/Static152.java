import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static152 {

	@OriginalMember(owner = "client!em", name = "f", descriptor = "B")
	public static byte aByte44;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Lclient!lb;")
	public static Class221 aClass221_39;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "Lclient!bka;")
	public static Class9 aClass9_6;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_5 = new Class206(2, 16);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIILclient!lb;ZI)V")
	public static void method2444(@OriginalArg(2) int arg0, @OriginalArg(3) Class221 arg1, @OriginalArg(5) int arg2) {
		Static348.method5050(arg2, arg0, (long) 0, arg1);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z")
	public static boolean method2445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static266.method4099(arg0, arg1) || Static284.method4284(arg1, arg0);
	}
}
