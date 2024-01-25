import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "[I")
	public static final int[] anIntArray197 = new int[2];

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	public static int anInt3720 = -1;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BII)Z")
	public static boolean method3029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static235.method3090(arg1, arg0) & Static447.method5582(arg0, arg1);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZLclient!je;Lclient!ea;ILclient!vg;ILjava/lang/String;Lclient!oa;I)V")
	public static void method3031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class122 arg3, @OriginalArg(5) Class59 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class250 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8, @OriginalArg(10) Class16 arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static100.anInt1781 == 4) {
			local13 = (int) Static95.aFloat27 & 0x3FFF;
		} else {
			local13 = (int) Static95.aFloat27 + Static171.anInt2824 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg6.anInt7041 / 2, arg6.anInt6997 / 2) + 10;
		@Pc(43) int local43 = arg10 * arg10 + arg7 * arg7;
		if (local35 * local35 < local43) {
			return;
		}
		@Pc(57) int local57 = Class1_Sub1_Sub25.anIntArray249[local13];
		@Pc(61) int local61 = Class1_Sub1_Sub25.anIntArray248[local13];
		if (Static100.anInt1781 != 4) {
			local61 = local61 * 256 / (Static305.anInt5082 + 256);
			local57 = local57 * 256 / (Static305.anInt5082 + 256);
		}
		@Pc(93) int local93 = local57 * arg10 + arg7 * local61 >> 15;
		@Pc(104) int local104 = arg10 * local61 - local57 * arg7 >> 15;
		@Pc(111) int local111 = arg3.method2473(100, null, arg8);
		@Pc(117) int local117 = local93 - local111 / 2;
		@Pc(125) int local125 = arg3.method2467(arg8, null);
		if (local117 >= -arg6.anInt7041 && local117 <= arg6.anInt7041 && -arg6.anInt6997 <= local104 && local104 <= arg6.anInt6997) {
			arg9.method5481(0, arg0, null, 50, null, arg2, arg4, local111, arg6.anInt7041 / 2 + local117 + arg1, arg8, arg2 + arg6.anInt6997 / 2 - local104 - arg5 - local125, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZII)Z")
	public static boolean method3032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3033(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static145.anInt2445; local11++) {
			if (arg0.equalsIgnoreCase(Static108.aStringArray17[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
