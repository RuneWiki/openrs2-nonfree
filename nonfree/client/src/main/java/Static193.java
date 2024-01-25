import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
	public static void method3173() {
		Static413.aClass303_1 = new Class303(8);
		Static173.anInt3657 = 0;
		for (@Pc(21) Class21_Sub5 local21 = (Class21_Sub5) Static109.aClass158_8.method3726(); local21 != null; local21 = (Class21_Sub5) Static109.aClass158_8.method3721()) {
			local21.method3045();
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3174(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)Z")
	public static boolean method3175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && Static266.aByteArrayArrayArray10[1].length > arg1 && Static266.aByteArrayArrayArray10[1][arg1].length > arg0) {
			return (Static266.aByteArrayArrayArray10[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
