import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
	public static int anInt8985;

	@OriginalMember(owner = "client!ss", name = "C", descriptor = "Lclient!bt;")
	public static Class3_Sub9_Sub1 aClass3_Sub9_Sub1_2;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(III)Z")
	public static boolean method7624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIII)V")
	public static void method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg2; local7++) {
			Static526.method7369(Static299.anIntArrayArray58[local7], arg0, arg1, arg4);
		}
	}
}
