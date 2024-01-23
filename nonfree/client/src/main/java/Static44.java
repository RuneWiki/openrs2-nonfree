import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public static int anInt1071;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
	public static int[] anIntArray132 = new int[5];

	@OriginalMember(owner = "client!de", name = "k", descriptor = "I")
	public static int anInt1072 = 0;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method877() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static103.aBooleanArray18[local3] = false;
		}
		Static248.anInt5065 = -1;
		Static186.anInt4094 = 0;
		Static106.anInt2378 = 5;
		Static121.anInt2627 = 0;
		Static226.anInt4821 = -1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Lclient!eb;")
	public static Class1_Sub3_Sub6 method878(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub6 local10 = (Class1_Sub3_Sub6) Static157.aClass162_6.method4003((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30 = Static208.aClass168_154.method4058(0, arg0);
		if (local30 == null || local30.length <= 1) {
			return null;
		} else {
			local10 = Static245.method3803(local30);
			Static157.aClass162_6.method4005(local10, (long) arg0);
			return local10;
		}
	}
}
