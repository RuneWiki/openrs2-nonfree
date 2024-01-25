import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!iaa", name = "J", descriptor = "Lclient!ir;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!iaa", name = "L", descriptor = "I")
	public static int anInt3875;

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(IIB)Z")
	public static boolean method3458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static246.method3792(arg1, arg0) || Static429.method6065(arg1, arg0);
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(Z)V")
	public static void method3459() {
		for (@Pc(3) int local3 = 0; local3 < Static503.aByteArrayArrayArray11.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static503.aByteArrayArrayArray11[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static503.aByteArrayArrayArray11[0][0].length; local11++) {
					Static503.aByteArrayArrayArray11[local3][local7][local11] = 0;
				}
			}
		}
	}
}
