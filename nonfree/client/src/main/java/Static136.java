import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
	public static int anInt2832;

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
	public static int anInt2833 = 0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZI)Z")
	public static boolean method2572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)Z")
	public static boolean method2573() {
		@Pc(7) Class5 local7 = Static521.aClass99_78.aClass5_102.aClass5_283;
		if (local7 == null || local7 == Static521.aClass99_78.aClass5_102) {
			return false;
		}
		@Pc(23) Class5_Sub47 local23 = (Class5_Sub47) local7;
		if (local23.anInt8474 >= 2000) {
			local23.anInt8474 -= 2000;
		}
		return local23.anInt8474 == 1007;
	}
}
