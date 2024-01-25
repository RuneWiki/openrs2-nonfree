import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!af;I)V")
	public static void method3676(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub1 arg1) {
		Static83.aBoolean108 = false;
		Static320.anInt5359 = 0;
		Static296.method4345(arg1);
		Static64.method1159(arg1);
		if (Static83.aBoolean108) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt9739) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt9739 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B[[BLclient!cc;)V")
	public static void method3678(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class49_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(23) int local23 = arg0.length;
		@Pc(44) int local44;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) byte[] local31 = arg0[local25];
			if (local31 != null) {
				@Pc(38) Class3_Sub4 local38 = new Class3_Sub4(local31);
				local44 = Static448.anIntArray394[local25] >> 8;
				@Pc(50) int local50 = Static448.anIntArray394[local25] & 0xFF;
				@Pc(56) int local56 = local44 * 64 - Static534.anInt8358;
				@Pc(63) int local63 = local50 * 64 - Static402.anInt6661;
				Static333.method4737();
				arg1.method1214(Static402.anInt6661, Static609.aClass110Array1, local63, local56, Static534.anInt8358, local38);
				arg1.method1220(local63, local56, Static119.aClass95_4, local38, local12);
				if (!arg1.aBoolean98 && Static55.anInt1158 / 8 == local44 && Static586.anInt9541 / 8 == local50 && local12[0] != -1) {
					Static481.aClass118_2 = Static73.aClass64_3.method1503(local12[2], Static300.aClass332_1, local12[0], local12[1], local12[3]);
					Static305.anInt5136 = local12[4];
				}
			}
		}
		for (@Pc(135) int local135 = 0; local135 < local23; local135++) {
			@Pc(148) int local148 = (Static448.anIntArray394[local135] >> 8) * 64 - Static534.anInt8358;
			local44 = (Static448.anIntArray394[local135] & 0xFF) * 64 - Static402.anInt6661;
			@Pc(162) byte[] local162 = arg0[local135];
			if (local162 == null && Static586.anInt9541 < 800) {
				Static333.method4737();
				arg1.method1211(local148, local44);
			}
		}
	}
}
