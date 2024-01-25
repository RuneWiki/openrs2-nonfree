import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public static int anInt5592;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public static int anInt5591 = 0;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!vk;")
	public static final Class207 aClass207_33 = new Class207(512);

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString218 = "";

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method4888() {
		@Pc(1) Class37 local1 = Static114.aClass37_39;
		synchronized (Static114.aClass37_39) {
			Static114.aClass37_39.method919();
		}
		local1 = Static287.aClass37_91;
		synchronized (Static287.aClass37_91) {
			Static287.aClass37_91.method919();
		}
		local1 = Static211.aClass37_70;
		synchronized (Static211.aClass37_70) {
			Static211.aClass37_70.method919();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static274.method4904(arg5)) {
			Static254.method4546(arg2, arg6, arg0, Static313.aClass163ArrayArray1[arg5], arg4, arg3, arg1, arg7, -1);
		} else if (arg0 == -1) {
			for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
				Static19.aBooleanArray1[local24] = true;
			}
		} else {
			Static19.aBooleanArray1[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)Z")
	public static boolean method4893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface4 local9 = (Interface4) Static107.method1713(arg1, arg2, arg0);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static170.method3033(local9) & true;
		}
		local9 = (Interface4) Static183.method3234(arg1, arg2, arg0, jb.class);
		if (local9 != null) {
			local11 &= Static170.method3033(local9);
		}
		local9 = (Interface4) Static137.method4969(arg1, arg2, arg0);
		if (local9 != null) {
			local11 &= Static170.method3033(local9);
		}
		return local11;
	}
}
