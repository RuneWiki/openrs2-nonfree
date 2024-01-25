import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public static int anInt3398;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!mo;")
	public static Class143 aClass143_67;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	public static int anInt3401 = 999999;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString122 = "Attack";

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
	public static final int[] anIntArray298 = new int[4096];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(CB)Z")
	public static boolean method3221(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BILclient!jg;)V")
	public static void method3222(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub4 arg1) {
		if (Static231.aClass107_4 == null) {
			return;
		}
		try {
			Static231.aClass107_4.method3004(0L);
			Static231.aClass107_4.method3000(arg0, 24, arg1.aByteArray74);
		} catch (@Pc(25) Exception local25) {
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
	public static void method3223(@OriginalArg(1) boolean arg0) {
		Static1.method5709(Static294.anInt5659, Static324.anInt6226, arg0, Static46.anInt1173);
	}
}
