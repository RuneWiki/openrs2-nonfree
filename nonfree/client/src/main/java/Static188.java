import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	public static int anInt3531;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_4 = new Class316(11, 7);

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_31 = new Class70(17, 2);

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_6 = new Class101(11, 0, 1, 2);

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_5 = new Class316(13, -1);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZII)Z")
	public static boolean method2905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method2907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (!Static109.method2409(arg7, arg1, arg8)) {
			return false;
		}
		@Pc(30) int local30 = Static247.anIntArray356[1];
		@Pc(34) int local34 = Static247.anIntArray356[2];
		@Pc(38) int local38 = Static247.anIntArray356[0];
		if (!Static109.method2409(arg6, arg4, arg0)) {
			return false;
		}
		@Pc(50) int local50 = Static247.anIntArray356[0];
		@Pc(54) int local54 = Static247.anIntArray356[2];
		@Pc(58) int local58 = Static247.anIntArray356[1];
		if (Static109.method2409(arg2, arg5, arg3)) {
			@Pc(70) int local70 = Static247.anIntArray356[0];
			@Pc(74) int local74 = Static247.anIntArray356[2];
			@Pc(78) int local78 = Static247.anIntArray356[1];
			return Static220.method3411(local58, local30, local50, local54, local34, local74, local78, local38, local70);
		} else {
			return false;
		}
	}
}
