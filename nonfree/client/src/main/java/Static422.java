import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!bi;")
	public static Class31 aClass31_95;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	public static int anInt7309 = 2;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!gf;I)I")
	public static int method6052(@OriginalArg(0) Class120 arg0) {
		if (Static22.aClass120_2 == arg0) {
			return 5890;
		} else if (Static184.aClass120_3 == arg0) {
			return 34167;
		} else if (arg0 == Static232.aClass120_4) {
			return 34168;
		} else if (arg0 == Static19.aClass120_1) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)Z")
	public static boolean method6062(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
	public static Object method6064(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static89.aBoolean190) {
			try {
				@Pc(25) Class230 local25 = (Class230) Class.forName("Class230_Sub1").getDeclaredConstructor().newInstance();
				local25.method5477(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static89.aBoolean190 = true;
			}
		}
		return arg0;
	}
}
