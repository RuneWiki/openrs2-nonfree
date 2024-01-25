import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "[Lclient!ku;")
	public static Class184[] aClass184Array1;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!oa;B)V")
	public static void method3191(@OriginalArg(0) Class14 arg0) {
		arg0.ca(0, 0, Static240.anInt4852, 350);
		arg0.C(0, 0, Static240.anInt4852, 350, Static61.anInt1278 << 24 | 0x332277, 1);
		@Pc(32) int local32 = 350 / Static221.anInt4605;
		@Pc(41) int local41;
		if (Static351.anInt9535 > 0) {
			local41 = 346 - Static221.anInt4605 - 4;
			@Pc(52) int local52 = local32 * local41 / (local32 + Static351.anInt9535 - 1);
			@Pc(54) int local54 = 4;
			if (Static351.anInt9535 > 1) {
				local54 = (local41 - local52) * ((Static351.anInt9535 - Static259.anInt5052) + -1) / (Static351.anInt9535 - 1) + 4;
			}
			arg0.C(Static240.anInt4852 - 16, local54, 12, local52, Static61.anInt1278 << 24 | 0x332277, 2);
			for (@Pc(92) int local92 = Static259.anInt5052; local32 + Static259.anInt5052 > local92 && Static351.anInt9535 > local92; local92++) {
				@Pc(101) String[] local101 = Static115.method2011('\b', Static272.aStringArray17[local92]);
				@Pc(110) int local110 = (Static240.anInt4852 - 16 - 8) / local101.length;
				for (@Pc(112) int local112 = 0; local112 < local101.length; local112++) {
					@Pc(120) int local120 = local112 * local110 + 8;
					arg0.ca(local120, 0, local120 + local110 - 8, 350);
					Static101.aClass92_9.method6390(350 - (local92 - Static259.anInt5052) * Static221.anInt4605 - Static572.anInt9366 - Static8.aClass327_1.anInt8797 - 2, -1, local120, -16777216, local101[local112]);
				}
			}
		}
		arg0.ca(0, 0, Static240.anInt4852, 350);
		arg0.method6899(-1, Static240.anInt4852, 0, 350 - Static572.anInt9366);
		Static114.aClass92_4.method6390(350 - Static555.aClass327_13.anInt8797 - 1, -1, 10, -16777216, "--> " + Static342.aString46);
		if (!Static470.aBoolean53) {
			return;
		}
		local41 = -1;
		if (Static312.anInt5688 % 30 > 15) {
			local41 = 16777215;
		}
		arg0.method6845(12, local41, Static555.aClass327_13.method7196("--> " + Static342.aString46.substring(0, Static400.anInt7014)) + 10, -Static555.aClass327_13.anInt8797 + 350 - 11);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public static void method3192(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static217.aFloat72 = 3.0F;
		} else if (arg0 == 50) {
			Static217.aFloat72 = 4.0F;
		} else if (arg0 == 75) {
			Static217.aFloat72 = 6.0F;
		} else if (arg0 == 100) {
			Static217.aFloat72 = 8.0F;
		} else if (arg0 == 200) {
			Static217.aFloat72 = 16.0F;
		}
		Static562.anInt9257 = -1;
		Static562.anInt9257 = -1;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method3193(@OriginalArg(1) Class14 arg0) {
		for (@Pc(10) Class98_Sub3 local10 = (Class98_Sub3) Static439.aClass40_6.method1132(); local10 != null; local10 = (Class98_Sub3) Static439.aClass40_6.method1129()) {
			if (local10.aBoolean371) {
				local10.method4527(arg0);
			}
		}
	}
}
