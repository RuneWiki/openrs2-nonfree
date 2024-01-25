import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!sja;")
	public static final Class342 aClass342_53 = new Class342();

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(23) int local23;
		if (Static221.method3276(arg1)) {
			local23 = 0;
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = 0;
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = 0;
			if (Static347.aBoolean360) {
				local50 = Static520.anInt8156;
				local44 = Static205.anInt3396;
				local23 = Static135.anInt10696;
				local46 = Static338.anInt5414;
				local48 = Static220.anInt3601;
				Static520.anInt8156 = 1;
			}
			if (Static158.aClass270ArrayArray1[arg1] == null) {
				Static286.method4024(arg6, arg7, Static172.aClass270ArrayArray2[arg1], arg5, -1, arg0, arg2 < 0, arg4, arg3, arg2);
			} else {
				Static286.method4024(arg6, arg7, Static158.aClass270ArrayArray1[arg1], arg5, -1, arg0, arg2 < 0, arg4, arg3, arg2);
			}
			if (Static347.aBoolean360) {
				if (arg2 >= 0 && Static520.anInt8156 == 2) {
					Static218.method3251(Static220.anInt3601, Static135.anInt10696, Static338.anInt5414, Static205.anInt3396);
				}
				Static220.anInt3601 = local48;
				Static520.anInt8156 = local50;
				Static338.anInt5414 = local46;
				Static205.anInt3396 = local44;
				Static135.anInt10696 = local23;
			}
		} else if (arg2 == -1) {
			for (local23 = 0; local23 < 100; local23++) {
				Static572.aBooleanArray23[local23] = true;
			}
		} else {
			Static572.aBooleanArray23[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5770(@OriginalArg(1) String arg0) {
		return Static393.aHashtable4.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lclient!go;")
	public static Class142 method5772() {
		return new Class142(1, false);
	}
}
