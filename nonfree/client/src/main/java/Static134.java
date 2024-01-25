import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!il", name = "h", descriptor = "Lclient!fg;")
	public static Class70 aClass70_46 = new Class70(64);

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZZ[B)Ljava/lang/Object;")
	public static Object method2594(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static103.aBoolean169) {
			try {
				@Pc(23) Class47 local23 = (Class47) Class.forName("Class47_Sub1").getDeclaredConstructor().newInstance();
				local23.method2572(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static103.aBoolean169 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II[I)[I")
	public static int[] method2597(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int[] local8 = new int[1152];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 36; local16++) {
				@Pc(22) int local22 = arg1[local10];
				if (local22 == 0) {
					if (local16 > 0 && arg1[local10 - 1] != 0) {
						local22 = arg0;
					} else if (local12 > 0 && arg1[local10 - 36] != 0) {
						local22 = arg0;
					} else if (local16 < 35 && arg1[local10 + 1] != 0) {
						local22 = arg0;
					} else if (local12 < 31 && arg1[local10 + 36] != 0) {
						local22 = arg0;
					}
				}
				local8[local10++] = local22;
			}
		}
		return local8;
	}
}
