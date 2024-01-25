import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	public static int anInt7247 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
	public static void method5635(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub2 local12 = Static15.method236(arg0, 9);
		local12.method435();
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method5637() {
		for (@Pc(3) int local3 = 0; local3 < Static367.aByteArrayArrayArray16.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static367.aByteArrayArrayArray16[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static367.aByteArrayArrayArray16[0][0].length; local11++) {
					Static367.aByteArrayArrayArray16[local3][local7][local11] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BIIIIII)V")
	public static void method5638(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static445.anInt7762 = arg2;
		Static375.anInt6696 = arg5;
		Static63.anInt1754 = arg0;
		Static97.anInt2179 = arg1;
		Static422.anInt7371 = arg3;
		Static448.anInt7802 = arg4;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Lclient!ft;")
	public static Class91 method5639(@OriginalArg(0) int arg0) {
		@Pc(15) Class91 local15 = (Class91) Static375.aClass129_59.method3023((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static296.aClass188_78.method4283(0, arg0);
		local15 = new Class91();
		if (local25 != null) {
			local15.method1791(new Class2_Sub20(local25), arg0);
		}
		Static375.aClass129_59.method3029(local15, (long) arg0);
		return local15;
	}
}
