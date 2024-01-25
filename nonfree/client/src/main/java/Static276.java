import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
	public static int anInt5208;

	@OriginalMember(owner = "client!rj", name = "S", descriptor = "Lclient!dp;")
	public static Class53 aClass53_128;

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method4748(@OriginalArg(1) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static175.anInt3287;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(26) Class200 local26 = Static278.method5284(arg0[local18]);
			if (local26.anInt5934 != -1) {
				@Pc(38) Class40 local38 = (Class40) Static133.aClass70_45.method1396((long) local26.anInt5934);
				if (local38 == null) {
					@Pc(46) Class88 local46 = Static363.method2255(Static269.aClass53_124, local26.anInt5934, 0);
					if (local46 != null) {
						local38 = Static289.aClass81_7.method3015(local46);
						Static133.aClass70_45.method1406(local38, (long) local26.anInt5934);
					}
				}
				if (local38 != null) {
					Static291.aClass40Array35[local16] = local38;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZIZII)V")
	public static void method4749(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= arg4) {
			return;
		}
		@Pc(26) int local26 = (arg2 + arg4) / 2;
		@Pc(28) int local28 = arg2;
		@Pc(32) Class64_Sub1 local32 = Static139.aClass64_Sub1Array1[local26];
		Static139.aClass64_Sub1Array1[local26] = Static139.aClass64_Sub1Array1[arg4];
		Static139.aClass64_Sub1Array1[arg4] = local32;
		for (@Pc(44) int local44 = arg2; local44 < arg4; local44++) {
			if (Static305.method5239(arg1, arg3, local32, arg5, Static139.aClass64_Sub1Array1[local44], arg0) <= 0) {
				@Pc(64) Class64_Sub1 local64 = Static139.aClass64_Sub1Array1[local44];
				Static139.aClass64_Sub1Array1[local44] = Static139.aClass64_Sub1Array1[local28];
				Static139.aClass64_Sub1Array1[local28++] = local64;
			}
		}
		Static139.aClass64_Sub1Array1[arg4] = Static139.aClass64_Sub1Array1[local28];
		Static139.aClass64_Sub1Array1[local28] = local32;
		method4749(arg0, arg1, arg2, arg3, local28 - 1, arg5);
		method4749(arg0, arg1, local28 + 1, arg3, arg4, arg5);
	}
}
