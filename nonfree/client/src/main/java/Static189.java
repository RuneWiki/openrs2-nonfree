import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "Lclient!nq;")
	public static Class144 aClass144_13;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "[I")
	public static int[] anIntArray45 = new int[2];

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
	public static int anInt625 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(CI)Z")
	public static boolean method494(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static102.aCharArray2;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (local42 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!ep;Lclient!ms;IIBLclient!sg;I)V")
	public static void method496(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Class137 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class97 arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static81.anInt1498 == 4) {
			local18 = (int) Static246.aFloat51 & 0x3FFF;
		} else {
			local18 = (int) Static246.aFloat51 + Static303.anInt4931 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg2.anInt4060 / 2, arg2.anInt4110 / 2) + 10;
		@Pc(46) int local46 = arg3 * arg3 + arg4 * arg4;
		if (local46 > local37 * local37) {
			return;
		}
		@Pc(60) int local60 = Class140.anIntArray330[local18];
		@Pc(64) int local64 = Class140.anIntArray329[local18];
		if (Static81.anInt1498 != 4) {
			local60 = local60 * 256 / (Static231.anInt5050 + 256);
			local64 = local64 * 256 / (Static231.anInt5050 + 256);
		}
		@Pc(93) int local93 = arg3 * local64 + local60 * arg4 >> 15;
		@Pc(104) int local104 = arg4 * local64 - arg3 * local60 >> 15;
		arg5.method5552(arg0 + arg2.anInt4060 / 2 + local93 - arg5.method5542() / 2, arg6 + arg2.anInt4110 / 2 + -local104 - arg5.method5557() / 2, arg1, arg0, arg6);
	}
}
