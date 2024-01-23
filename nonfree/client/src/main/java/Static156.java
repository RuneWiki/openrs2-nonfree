import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "Lclient!se;")
	public static Class122 aClass122_12;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
	public static int anInt3722 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Z")
	public static boolean method2772(@OriginalArg(1) int arg0) {
		if (Static18.aBooleanArray1[arg0]) {
			return true;
		} else if (Static57.aClass51_21.method1879(arg0)) {
			@Pc(23) int local23 = Static57.aClass51_21.method1875(arg0);
			if (local23 == 0) {
				Static18.aBooleanArray1[arg0] = true;
				return true;
			}
			if (Static80.aClass122ArrayArray1[arg0] == null) {
				Static80.aClass122ArrayArray1[arg0] = new Class122[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static80.aClass122ArrayArray1[arg0][local45] == null) {
					@Pc(66) byte[] local66 = Static57.aClass51_21.method1874(arg0, local45);
					if (local66 != null) {
						@Pc(78) Class122 local78 = Static80.aClass122ArrayArray1[arg0][local45] = new Class122();
						local78.anInt4686 = local45 + (arg0 << 16);
						if (local66[0] == -1) {
							local78.method3526(new Class1_Sub13(local66));
						} else {
							local78.method3523(new Class1_Sub13(local66));
						}
					}
				}
			}
			Static18.aBooleanArray1[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
