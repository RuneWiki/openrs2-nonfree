import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!k", name = "w", descriptor = "I")
	public static int anInt2696;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "Lclient!p;")
	public static Class133 aClass133_4;

	@OriginalMember(owner = "client!k", name = "z", descriptor = "[I")
	public static int[] anIntArray221;

	@OriginalMember(owner = "client!k", name = "C", descriptor = "Lclient!ph;")
	public static Class138 aClass138_43;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "I")
	public static int anInt2697 = -1;

	@OriginalMember(owner = "client!k", name = "A", descriptor = "[I")
	public static int[] anIntArray222 = new int[128];

	@OriginalMember(owner = "client!k", name = "B", descriptor = "I")
	public static int anInt2698 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2200(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		while (local15 > local12 && Static263.method3942(arg0.charAt(local12))) {
			local12++;
		}
		while (local15 > local12 && Static263.method3942(arg0.charAt(local15 - 1))) {
			local15--;
		}
		@Pc(52) int local52 = local15 - local12;
		if (local52 < 1 || local52 > 20) {
			return null;
		}
		@Pc(66) StringBuffer local66 = new StringBuffer(local52);
		for (@Pc(68) int local68 = local12; local68 < local15; local68++) {
			@Pc(75) char local75 = arg0.charAt(local68);
			if (Static283.method4218(local75)) {
				@Pc(85) char local85 = Static104.method1643(local75);
				if (local85 != '\u0000') {
					local66.append(local85);
				}
			}
		}
		if (local66.length() == 0) {
			return null;
		} else {
			return local66.toString();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = arg1 - 334;
		if (local3 < 0) {
			local3 = 0;
		} else if (local3 > 100) {
			local3 = 100;
		}
		@Pc(30) int local30 = 2048 - arg3 & 0x7FF;
		@Pc(32) int local32 = 0;
		@Pc(43) int local43 = Static256.aShort39 + (Static230.aShort38 - Static256.aShort39) * local3 / 100;
		@Pc(49) int local49 = arg6 * local43 >> 8;
		@Pc(56) int local56 = 2048 - arg4 & 0x7FF;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = local49;
		@Pc(68) int local68;
		@Pc(72) int local72;
		if (local56 != 0) {
			local68 = Class17.anIntArray22[local56];
			local72 = Class17.anIntArray24[local56];
			local32 = local68 * -local49 >> 16;
			local60 = local72 * local49 >> 16;
		}
		if (local30 != 0) {
			local68 = Class17.anIntArray22[local30];
			local72 = Class17.anIntArray24[local30];
			local58 = local60 * local68 >> 16;
			local60 = local72 * local60 >> 16;
		}
		Static243.anInt5653 = arg2 - local58;
		Static105.anInt2016 = arg0 - local60;
		Static140.anInt2757 = arg4;
		Static262.anInt2349 = arg3;
		Static141.anInt2760 = arg5 - local32;
	}
}
