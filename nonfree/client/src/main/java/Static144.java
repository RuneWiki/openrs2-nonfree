import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!jo", name = "L", descriptor = "Z")
	public static boolean aBoolean232 = false;

	@OriginalMember(owner = "client!jo", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString108 = "Loading title screen - ";

	@OriginalMember(owner = "client!jo", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString109 = " is already on your ignore list.";

	@OriginalMember(owner = "client!jo", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString110 = "Cancel";

	@OriginalMember(owner = "client!jo", name = "Q", descriptor = "I")
	public static int anInt3020 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZ)V")
	public static void method2581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub2_Sub15 local12 = Static17.method307(1, arg0);
		local12.method4783();
		local12.anInt5461 = arg1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIB)I")
	public static int method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) int local20 = 65536 - Class1_Sub5_Sub15.anIntArray333[arg3 * 8192 / arg2] >> 1;
		return (arg0 * (65536 - local20) >> 16) + (local20 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIII)Lclient!wm;")
	public static Class10_Sub1_Sub2 method2583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class83 local11 = Static347.aClass83ArrayArrayArray3[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class10_Sub1_Sub2 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class59 local22 = local11.aClass59_2; local22 != null; local22 = local22.aClass59_1) {
			@Pc(26) Class10_Sub1 local26 = local22.aClass10_Sub1_1;
			if (local26 instanceof Class10_Sub1_Sub2) {
				@Pc(32) Class10_Sub1_Sub2 local32 = (Class10_Sub1_Sub2) local26;
				@Pc(42) int local42 = local32.method3402() * 64 + 60 - 64;
				@Pc(49) int local49 = local32.anInt6728 - local42 >> 7;
				@Pc(56) int local56 = local32.anInt6726 - local42 >> 7;
				@Pc(63) int local63 = local42 + local32.anInt6728 >> 7;
				@Pc(70) int local70 = local42 + local32.anInt6726 >> 7;
				if (arg0 >= local49 && local56 <= arg2 && local63 >= arg0 && arg2 <= local70) {
					@Pc(102) int local102 = (local70 + 1 - arg2) * ((local63 - arg0) + 1);
					if (local19 < local102) {
						local17 = local32;
						local19 = local102;
					}
				}
			}
		}
		return local17;
	}
}
