import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "Lclient!uaa;")
	public static Class337 aClass337_1;

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "[I")
	public static final int[] anIntArray773 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BIIILclient!ck;II)Z")
	public static boolean method8213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class55 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static592.aBoolean843 || !Static157.aBoolean242) {
			return false;
		} else if (Static525.anInt8753 < 100) {
			return false;
		} else if (arg2 != arg0 || arg5 != arg4) {
			for (@Pc(54) int local54 = arg0; local54 <= arg2; local54++) {
				for (@Pc(58) int local58 = arg5; local58 <= arg4; local58++) {
					if (-Static650.anInt10507 == Static471.anIntArrayArrayArray11[arg1][local54][local58]) {
						return false;
					}
				}
			}
			if (Static612.method8499(arg3)) {
				Static115.anInt1792++;
				return true;
			} else {
				return false;
			}
		} else if (!Static422.method6374(arg1, arg0, arg5)) {
			return false;
		} else if (Static612.method8499(arg3)) {
			Static115.anInt1792++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
	public static void method8215(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static650.method8917(arg2, arg1, (String) null, arg0, false, arg3);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)Z")
	public static boolean method8223(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}
