import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "Lclient!kb;")
	public static Class140 aClass140_3;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public static final int anInt2828 = 1338;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_50 = new Class92(15, 8);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBI)Z")
	public static boolean method2369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static22.method654(arg1, arg0) || Static19.method503(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static173.method2864(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)I")
	public static int method2370(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method2371(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static361.method5343(local18) : local18;
		} else if (arg1 instanceof Class75) {
			@Pc(32) Class75 local32 = (Class75) arg1;
			return local32.method5746();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public static void method2372() {
		Static346.anInt6243 = -1;
		Static344.anInt6358 = -1;
		Static114.anInt5655 = -1;
		Static420.anInt7505 = 0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!hr;Ljava/lang/String;ZI)V")
	public static void method2374(@OriginalArg(0) Class29 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(20) int local20 = Static58.aClass166_6.method3887(250, arg1, null);
		@Pc(29) int local29 = Static58.aClass166_6.method3889(arg1, null, 250) * 13;
		Static126.aClass66_5.method5004(6, 6, local20 + 4 + 4, local29 - -8, -16777216, 0);
		Static126.aClass66_5.method4972(6, 6, local20 + 8, local29 + 4 + 4, -1, 0);
		arg0.method4798(null, 0, 1, -1, 0, local29, 10, arg1, 10, local20, null, -1, null);
		Static401.method5934(local20 + 8, 6, 6, local29 + 4 + 4);
		if (arg2) {
			Static126.aClass66_5.method4977();
		}
	}
}
