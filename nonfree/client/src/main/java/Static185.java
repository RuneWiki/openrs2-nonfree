import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hfa", name = "K", descriptor = "I")
	public static int anInt3863;

	@OriginalMember(owner = "client!hfa", name = "P", descriptor = "[Lclient!ln;")
	public static Class197[] aClass197Array1;

	@OriginalMember(owner = "client!hfa", name = "G", descriptor = "I")
	public static int anInt3860 = 0;

	@OriginalMember(owner = "client!hfa", name = "H", descriptor = "Lclient!hs;")
	public static final Class138 aClass138_3 = new Class138();

	@OriginalMember(owner = "client!hfa", name = "N", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!hfa", name = "O", descriptor = "Lclient!vh;")
	public static final Class6_Sub50 aClass6_Sub50_1 = new Class6_Sub50(0, 0);

	@OriginalMember(owner = "client!hfa", name = "Q", descriptor = "I")
	public static int anInt3865 = -1;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIB)Z")
	public static boolean method3397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method3398(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local20 - 2 >= local6 || Static357.method5415(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local20 - 1 >= local6 || Static357.method5415(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(71) byte[] local71 = new byte[local26];
		Static9.method205(local71, arg0, 0);
		return local71;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BZ)V")
	public static void method3399(@OriginalArg(1) boolean arg0) {
		if (Static509.aClass236_6 == null) {
			Static168.method3167();
		}
		if (arg0) {
			Static509.aClass236_6.method5512();
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IB)V")
	public static void method3400(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub2_Sub7 local12 = Static401.method5861(arg0, 10);
		local12.method2580();
	}
}
