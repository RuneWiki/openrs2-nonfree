import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!st", name = "h", descriptor = "I")
	public static int anInt8991 = -1;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString111 = null;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIII)V")
	public static void method7628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static303.anInt9951 <= arg2 && arg4 <= Static408.anInt6951 && Static255.anInt4818 <= arg0 && Static658.anInt10079 >= arg3) {
			if (arg5 == 1) {
				Static126.method2228(arg0, arg2, arg3, arg4, arg1);
			} else {
				Static425.method6063(arg2, arg4, arg3, arg1, arg0, arg5);
			}
		} else if (arg5 == 1) {
			Static588.method7904(arg4, arg2, arg3, arg0, arg1);
		} else {
			Static115.method2121(arg0, arg3, arg4, arg1, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;ZBLjava/lang/String;I)V")
	public static void method7629(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		Static99.method1967(arg2, arg0, arg3, -1, arg1, true);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZIIII)V")
	public static void method7630(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class3_Sub29 local20 = (Class3_Sub29) Static106.aClass62_11.method1682(local14);
		if (local20 == null) {
			local20 = new Class3_Sub29();
			Static106.aClass62_11.method1686(local14, local20);
		}
		if (local20.anIntArray353.length <= arg3) {
			@Pc(45) int[] local45 = new int[arg3 + 1];
			@Pc(50) int[] local50 = new int[arg3 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray353.length; local52++) {
				local45[local52] = local20.anIntArray353[local52];
				local50[local52] = local20.anIntArray354[local52];
			}
			for (@Pc(78) int local78 = local20.anIntArray353.length; local78 < arg3; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local20.anIntArray353 = local45;
			local20.anIntArray354 = local50;
		}
		local20.anIntArray353[arg3] = arg4;
		local20.anIntArray354[arg3] = arg1;
	}
}
