import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "Lclient!pq;")
	public static Class251 aClass251_77;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "Lclient!sk;")
	public static Class294 aClass294_1;

	@OriginalMember(owner = "client!kn", name = "r", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Lclient!ej;")
	public static final Class84 aClass84_8 = new Class84("", 12);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II[Lclient!fca;ZBI)V")
	public static void method3780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
			@Pc(17) Class97 local17 = arg2[local11];
			if (local17 != null && arg0 == local17.anInt2325) {
				Static84.method1342(local17, arg1, arg4, arg3);
				Static199.method2986(arg1, arg4, local17);
				if (local17.anInt2307 - local17.anInt2340 < local17.anInt2271) {
					local17.anInt2271 = local17.anInt2307 - local17.anInt2340;
				}
				if (local17.anInt2271 < 0) {
					local17.anInt2271 = 0;
				}
				if (local17.anInt2334 > local17.anInt2321 - local17.anInt2305) {
					local17.anInt2334 = local17.anInt2321 - local17.anInt2305;
				}
				if (local17.anInt2334 < 0) {
					local17.anInt2334 = 0;
				}
				if (local17.anInt2264 == 0) {
					Static443.method6362(arg3, local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method3782(@OriginalArg(1) Class121 arg0) {
		if (Static16.anInt312 != Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 && (Static208.aClass9ArrayArrayArray3 != null && Static281.method4014(Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103, arg0))) {
			Static16.anInt312 = Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103;
		}
	}
}
