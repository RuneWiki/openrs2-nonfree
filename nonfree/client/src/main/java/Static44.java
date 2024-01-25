import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bia", name = "i", descriptor = "Z")
	public static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)V")
	public static void method611() {
		for (@Pc(10) int local10 = 0; local10 < Static317.aByteArrayArrayArray13.length; local10++) {
			for (@Pc(14) int local14 = 0; local14 < Static317.aByteArrayArrayArray13[0].length; local14++) {
				for (@Pc(18) int local18 = 0; local18 < Static317.aByteArrayArrayArray13[0][0].length; local18++) {
					Static317.aByteArrayArrayArray13[local10][local14][local18] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)V")
	public static void method612() {
		Static79.method1208();
		Static491.method7177();
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lclient!bg;[[BI)V")
	public static void method616(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(13) int local13 = Static373.aByteArrayArray15.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(21) byte[] local21 = arg1[local15];
			if (local21 != null) {
				@Pc(34) int local34 = (Static249.anIntArray245[local15] >> 8) * 64 - Static454.anInt7910;
				@Pc(44) int local44 = (Static249.anIntArray245[local15] & 0xFF) * 64 - Static48.anInt750;
				Static491.method7177();
				arg0.method536(local44, local34, Static137.aClass234Array1, local21, Static563.aClass143_13);
			}
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lclient!ha;II)Lclient!qda;")
	public static Class59 method617(@OriginalArg(0) Class143 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class5_Sub27 local15 = (Class5_Sub27) Static298.aClass335_23.method7766((long) arg1);
		if (local15 != null) {
			@Pc(22) Class5_Sub1_Sub3 local22 = local15.aClass104_Sub1_1.method2096();
			local15.aBoolean265 = true;
			if (local22 != null) {
				return local22.method6771(arg0);
			}
		}
		return null;
	}
}
