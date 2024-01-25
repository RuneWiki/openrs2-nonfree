import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!nca", name = "Y", descriptor = "Lclient!qo;")
	public static Class243 aClass243_5;

	@OriginalMember(owner = "client!nca", name = "S", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_95 = new Class6(85, 6);

	@OriginalMember(owner = "client!nca", name = "U", descriptor = "[Lclient!vk;")
	public static final Class306[] aClass306Array1 = new Class306[6];

	@OriginalMember(owner = "client!nca", name = "Z", descriptor = "[I")
	public static final int[] anIntArray425 = new int[1];

	@OriginalMember(owner = "client!nca", name = "ab", descriptor = "Z")
	public static volatile boolean aBoolean412 = false;

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "(I)V")
	public static void method5198() {
		if (Static51.anInt7926 == 6) {
			Static140.method2961(false);
		} else {
			Static494.aClass154_2 = Static453.aClass154_1;
			Static453.aClass154_1 = null;
			Static265.method4401(12);
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method5199(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(17) int local17 = local6 + 3 & 0xFFFFFFFC;
		@Pc(28) int local28 = local17 / 4 * 3;
		if (local6 <= local17 - 2 || Static164.method3254(arg0.charAt(local17 - 2)) == -1) {
			local28 -= 2;
		} else if (local17 - 1 >= local6 || Static164.method3254(arg0.charAt(local17 - 1)) == -1) {
			local28--;
		}
		@Pc(66) byte[] local66 = new byte[local28];
		Static470.method5657(local66, 0, arg0);
		return local66;
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(BI)I")
	public static int method5202(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static220.method3918(arg0);
	}
}
