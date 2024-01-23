import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "J")
	public static long aLong187;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!hi;")
	public static Class66 aClass66_45;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public static int anInt5089 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!nk;ILclient!nk;Z)V")
	public static void method4342(@OriginalArg(0) Class121 arg0, @OriginalArg(2) Class121 arg1) {
		Static130.aClass121_61 = arg1;
		Static296.aClass121_130 = arg0;
		Static104.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Lclient!sf;")
	public static Class160 method4343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass160_1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V")
	public static void method4344(@OriginalArg(1) byte arg0) {
		if (Static257.aByteArrayArrayArray20 == null) {
			Static257.aByteArrayArrayArray20 = new byte[4][104][104];
		}
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			for (@Pc(26) int local26 = 0; local26 < 104; local26++) {
				for (@Pc(31) int local31 = 0; local31 < 104; local31++) {
					Static257.aByteArrayArrayArray20[local15][local26][local31] = arg0;
				}
			}
		}
	}
}
