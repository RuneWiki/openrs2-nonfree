import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!ci;")
	public static Class38 aClass38_77;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V")
	public static void method5366(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub1_Sub5 local13 = Static431.method5935(5, arg0);
		local13.method517();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIII)V")
	public static void method5368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static157.aClass185_Sub1_1.anInt5554 != 0 && arg1 != 0 && Static93.anInt2064 < 50 && arg3 != -1) {
			Static121.aClass7Array2[Static93.anInt2064++] = new Class7((byte) 1, arg3, arg1, arg4, arg0, arg2);
		}
	}
}
