import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!co", name = "s", descriptor = "[I")
	public static int[] anIntArray472 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!co", name = "D", descriptor = "I")
	public static int anInt5487 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method4130(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(40) int local40 = 2;
		for (@Pc(44) int local44 = arg0 / 10; local44 != 0; local44 /= 10) {
			local40++;
		}
		@Pc(59) char[] local59 = new char[local40];
		local59[0] = '+';
		for (@Pc(72) int local72 = local40 - 1; local72 > 0; local72--) {
			@Pc(76) int local76 = arg0;
			arg0 /= 10;
			@Pc(87) int local87 = local76 - arg0 * 10;
			if (local87 >= 10) {
				local59[local72] = (char) (local87 + 87);
			} else {
				local59[local72] = (char) (local87 + 48);
			}
		}
		return new String(local59);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method4131(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static231.aBoolean376) {
			try {
				@Pc(23) Class45 local23 = (Class45) Class.forName("Class45_Sub1").getDeclaredConstructor().newInstance();
				local23.method3806(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static231.aBoolean376 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
	public static void method4132() {
		Static132.aByteArrayArrayArray6 = null;
		Static21.anIntArray42 = null;
		Static183.anIntArray269 = null;
		Static40.aByteArrayArrayArray1 = null;
		Static74.anIntArrayArrayArray3 = null;
		Static4.anIntArray6 = null;
		Static75.aByteArrayArrayArray4 = null;
		Static254.aByteArrayArrayArray15 = null;
		Static153.anIntArray246 = null;
		Static44.anIntArray72 = null;
		Static147.aByteArrayArrayArray8 = null;
		Static42.anIntArray63 = null;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	public static void method4134(@OriginalArg(0) int arg0) {
		Static57.anInt1262 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)I")
	public static int method4135(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(I)Z")
	public static boolean method4136() {
		@Pc(11) Class47 local11 = Static266.aClass47_1;
		synchronized (Static266.aClass47_1) {
			if (Static210.anInt4476 == Static270.anInt5341) {
				return false;
			} else {
				Static60.anInt1301 = Static157.anIntArray498[Static210.anInt4476];
				Static27.aChar1 = Static207.aCharArray5[Static210.anInt4476];
				Static210.anInt4476 = Static210.anInt4476 + 1 & 0x7F;
				return true;
			}
		}
	}
}
