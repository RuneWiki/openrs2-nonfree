import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "Lclient!ci;")
	public static Class38 aClass38_49;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)J")
	public static long method3933() {
		return Static151.aClass89_1.method3425();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)V")
	public static void method3934(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub1_Sub5 local13 = Static431.method5935(6, arg0);
		local13.method517();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3936(@OriginalArg(1) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static103.anInt2186 > 0) {
			local24 = Static25.aByteArrayArray5[--Static103.anInt2186];
			Static25.aByteArrayArray5[Static103.anInt2186] = null;
			return local24;
		} else if (arg0 == 5000 && Static288.anInt5356 > 0) {
			local24 = Static94.aByteArrayArray7[--Static288.anInt5356];
			Static94.aByteArrayArray7[Static288.anInt5356] = null;
			return local24;
		} else if (arg0 == 30000 && Static435.anInt7453 > 0) {
			local24 = Static82.aByteArrayArray6[--Static435.anInt7453];
			Static82.aByteArrayArray6[Static435.anInt7453] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}
}
