import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static272 {

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
	public static int anInt5251;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!eq;)V")
	public static void method4390(@OriginalArg(1) Class97 arg0) {
		Static121.aClass97_31 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!dm;I)V")
	public static void method4391(@OriginalArg(0) Class78 arg0) {
		if (arg0.anInt1955 == 5 && arg0.anInt2006 != -1) {
			Static632.method8489(arg0, Static600.aClass87_15);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BII)Z")
	public static boolean method4392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static312.method4756(arg0, arg1) || Static336.method5206(arg0, arg1);
	}
}
