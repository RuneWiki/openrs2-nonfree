import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static int anInt4004 = -1;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static int anInt4009 = 0;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
	public static int[] anIntArray334 = new int[14];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
	public static boolean method3358(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(15) int local15 = Static17.aShortArray2[arg0];
		if (local15 >= 2000) {
			local15 -= 2000;
		}
		return local15 == 1006;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3360(@OriginalArg(0) String arg0) {
		if (Static245.aClass1_Sub6Array1 == null) {
			return;
		}
		@Pc(18) int local18 = 0;
		@Pc(22) long local22 = Static124.method4681(arg0);
		if (local22 == 0L) {
			return;
		}
		while (local18 < Static245.aClass1_Sub6Array1.length && Static245.aClass1_Sub6Array1[local18].aLong214 != local22) {
			local18++;
		}
		if (Static245.aClass1_Sub6Array1.length > local18 && Static245.aClass1_Sub6Array1[local18] != null) {
			Static127.aClass1_Sub14_Sub1_3.method1408(7);
			Static127.aClass1_Sub14_Sub1_3.method1374(Static245.aClass1_Sub6Array1[local18].aLong214);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBLclient!nk;)Lclient!cf;")
	public static Class23 method3361(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return Static31.method501(arg1, arg0) ? Static7.method113() : null;
	}
}
