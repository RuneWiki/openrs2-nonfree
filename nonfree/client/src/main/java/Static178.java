import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "[Lclient!bc;")
	public static Class12[] aClass12Array5;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
	public static int anInt3973;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	public static int anInt3968 = 0;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLclient!km;Lclient!bn;Lclient!km;Z)V")
	public static void method3181(@OriginalArg(1) Class91 arg0, @OriginalArg(2) Class1_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) Class91 arg2) {
		Static164.aClass91_130 = arg0;
		Static147.aClass91_117 = arg2;
		Static239.aBoolean363 = true;
		@Pc(15) int local15 = Static164.aClass91_130.method2492() - 1;
		anInt3973 = Static164.aClass91_130.method2510(local15) + local15 * 256;
		Static54.aStringArray18 = new String[] { null, null, null, null, Static183.aString265 };
		Static171.aStringArray45 = new String[] { null, null, Static77.aString98, null, null };
		Static156.aClass1_Sub2_Sub1_Sub2_2 = arg1;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!lj;)V")
	public static void method3182(@OriginalArg(1) Class1_Sub20 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt3343 == 0) {
			local5 = Static108.method1986(arg0.anInt3349, arg0.anInt3353, arg0.anInt3341);
		}
		@Pc(22) int local22 = -1;
		if (arg0.anInt3343 == 1) {
			local5 = Static298.method4460(arg0.anInt3349, arg0.anInt3353, arg0.anInt3341);
		}
		if (arg0.anInt3343 == 2) {
			local5 = Static47.method929(arg0.anInt3349, arg0.anInt3353, arg0.anInt3341);
		}
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		if (arg0.anInt3343 == 3) {
			local5 = Static151.method4444(arg0.anInt3349, arg0.anInt3353, arg0.anInt3341);
		}
		if (local5 != 0L) {
			local22 = Integer.MAX_VALUE & (int) (local5 >>> 32);
			local58 = (int) local5 >> 20 & 0x3;
			local56 = (int) local5 >> 14 & 0x1F;
		}
		arg0.anInt3352 = local56;
		arg0.anInt3345 = local58;
		arg0.anInt3342 = local22;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBII)V")
	public static void method3183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = Static184.anInt3815 * arg0 >> 8;
		if (local5 != 0 && arg1 != -1) {
			Static236.method3627(Static49.aClass91_45, arg1, local5);
			Static142.aBoolean225 = true;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[Lclient!in;IIBZ)V")
	public static void method3185(@OriginalArg(0) int arg0, @OriginalArg(1) Class71[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(19) Class71 local19 = arg1[local7];
			if (local19 != null && arg2 == local19.anInt2674) {
				Static202.method3259(arg3, arg0, arg4, local19);
				Static7.method1805(arg0, local19, arg3);
				if (local19.anInt2650 - local19.anInt2698 < local19.anInt2646) {
					local19.anInt2646 = local19.anInt2650 - local19.anInt2698;
				}
				if (local19.anInt2646 < 0) {
					local19.anInt2646 = 0;
				}
				if (local19.anInt2647 - local19.anInt2722 < local19.anInt2652) {
					local19.anInt2652 = local19.anInt2647 - local19.anInt2722;
				}
				if (local19.anInt2652 < 0) {
					local19.anInt2652 = 0;
				}
				if (local19.anInt2712 == 0) {
					Static239.method3686(arg4, local19);
				}
			}
		}
	}
}
