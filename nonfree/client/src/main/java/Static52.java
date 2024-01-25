import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "Lclient!fs;")
	public static Class76 aClass76_15;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_4 = new Class68(8);

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "[I")
	public static int[] anIntArray53 = new int[2];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([BI)[B")
	public static byte[] method841(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static459.method3330(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V")
	public static void method842(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub1_Sub11 local13 = Static405.method5222(arg0, 7);
		local13.method2608();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!ba;III[Z)Z")
	public static boolean method844(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static417.aClass65Array4 != Static285.aClass65Array3) {
			@Pc(11) int local11 = Static67.aClass65Array1[arg1].a(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class65 local18 = Static67.aClass65Array1[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.a(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4022(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.b(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
