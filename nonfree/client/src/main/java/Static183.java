import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IBI)Z")
	public static boolean method3007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static358.aBoolean477) {
			return false;
		} else if (Static350.anInt7294 < 100) {
			return false;
		} else if (Static351.method5319(arg1, arg0, arg2)) {
			@Pc(26) int local26 = arg0 << Static392.anInt3635;
			@Pc(30) int local30 = arg2 << Static392.anInt3635;
			if (Static154.method2625(arg3, Static168.anInt3487, local30, Static255.aClass115Array2[arg1].method8055(arg2, arg0), Static168.anInt3487, local26)) {
				Static217.anInt8618++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V")
	public static void method3009(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static313.anInt6277 = arg2;
		Static274.anInt5755 = 2;
		Static200.method3273(false, arg1, arg0);
	}
}
