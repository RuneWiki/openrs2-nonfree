import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!sm;")
	public static Class185 aClass185_1;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!bi;")
	public static Class18 method2380(@OriginalArg(1) int arg0) {
		@Pc(5) Class198 local5 = Static140.aClass198_108;
		@Pc(14) Class18 local14;
		synchronized (Static140.aClass198_108) {
			local14 = (Class18) Static140.aClass198_108.method5210((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static282.aClass193_81.method5047(Static256.method4471(arg0), Static197.method3720(arg0));
		local14 = new Class18();
		local14.anInt534 = arg0;
		if (local34 != null) {
			local14.method419(new Class4_Sub11(local34));
		}
		local14.method412();
		if (local14.aBoolean46) {
			local14.aBoolean38 = false;
			local14.anInt526 = 0;
		}
		if (!Static286.aBoolean484 && local14.aBoolean44) {
			local14.aStringArray3 = null;
			local14.anIntArray21 = null;
		}
		@Pc(75) Class198 local75 = Static140.aClass198_108;
		synchronized (Static140.aClass198_108) {
			Static140.aClass198_108.method5201(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
	public static void method2381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg0);
		@Pc(24) int local24 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg3);
		@Pc(30) int local30 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg2);
		@Pc(36) int local36 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg1);
		for (@Pc(38) int local38 = local11; local38 <= local24; local38++) {
			Static135.method2878(Static223.anIntArrayArray124[local38], local36, arg4, local30);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IC)Z")
	public static boolean method2382(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(30) char[] local30 = Static5.aCharArray5;
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				@Pc(38) char local38 = local30[local32];
				if (local38 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
