import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static512 {

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
	public static int anInt8072;

	@OriginalMember(owner = "client!rca", name = "q", descriptor = "I")
	public static int anInt8073;

	@OriginalMember(owner = "client!rca", name = "t", descriptor = "Lclient!ff;")
	public static Class113 aClass113_3;

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
	public static int anInt8070 = 0;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)Z")
	public static boolean method6691(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
