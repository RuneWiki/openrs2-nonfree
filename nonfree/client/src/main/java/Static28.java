import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!av", name = "B", descriptor = "I")
	public static int anInt3098;

	@OriginalMember(owner = "client!av", name = "o", descriptor = "[Lclient!ev;")
	public static final Class94[] aClass94Array2 = new Class94[4];

	@OriginalMember(owner = "client!av", name = "u", descriptor = "I")
	public static int anInt3095 = 0;

	@OriginalMember(owner = "client!av", name = "X", descriptor = "[S")
	public static short[] aShortArray43 = new short[256];

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	public static void method2615() {
		Static245.aClass326_18.method7230();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "()V")
	public static void method2617() {
		if (Static319.aClass35_8 == null) {
			return;
		}
		Static63.aClass12_5.oa(Static231.anIntArray263);
		for (@Pc(10) int local10 = 0; local10 < Static364.anIntArray427.length; local10++) {
			Static63.aClass12_5.method6447(Static231.anIntArray263[3] - Static231.anIntArray263[1], -256, Static364.anIntArray427[local10] + Static208.anIntArray595[local10], Static231.anIntArray263[1]);
		}
		for (@Pc(39) int local39 = 0; local39 < Static259.anInt4761; local39++) {
			@Pc(44) Class50 local44 = Static17.aClass50Array1[local39];
			Static63.aClass12_5.MA(local44.anIntArray85[0], local44.anIntArray86[0], local44.anIntArray87[0], Static429.anIntArray497);
			Static63.aClass12_5.MA(local44.anIntArray85[1], local44.anIntArray86[1], local44.anIntArray87[1], Static105.anIntArray123);
			Static63.aClass12_5.MA(local44.anIntArray85[2], local44.anIntArray86[2], local44.anIntArray87[2], Static154.anIntArray176);
			Static63.aClass12_5.MA(local44.anIntArray85[3], local44.anIntArray86[3], local44.anIntArray87[3], Static244.anIntArray282);
			if (Static429.anIntArray497[2] != -1 && Static105.anIntArray123[2] != -1 && Static154.anIntArray176[2] != -1 && Static244.anIntArray282[2] != -1) {
				@Pc(126) int local126 = -65536;
				if (local44.aByte30 == 4) {
					local126 = -16776961;
				}
				Static63.aClass12_5.method6427(local126, Static429.anIntArray497[0], Static105.anIntArray123[1], Static105.anIntArray123[0], Static429.anIntArray497[1]);
				Static63.aClass12_5.method6427(local126, Static105.anIntArray123[0], Static154.anIntArray176[1], Static154.anIntArray176[0], Static105.anIntArray123[1]);
				Static63.aClass12_5.method6427(local126, Static154.anIntArray176[0], Static244.anIntArray282[1], Static244.anIntArray282[0], Static154.anIntArray176[1]);
				Static63.aClass12_5.method6427(local126, Static244.anIntArray282[0], Static429.anIntArray497[1], Static429.anIntArray497[0], Static244.anIntArray282[1]);
				Static63.aClass12_5.method6427(local126, Static429.anIntArray497[0], Static154.anIntArray176[1], Static154.anIntArray176[0], Static429.anIntArray497[1]);
			}
		}
		Static319.aClass35_8.method4935(10, -256, 30, "Static Opaque: OW: " + Static464.anIntArray526[0] + "/" + Static123.anIntArray153[0] + " UW: " + Static464.anIntArray526[1] + "/" + Static123.anIntArray153[1], -16777216);
		Static319.aClass35_8.method4935(10, -256, 45, "Static Trans: OW: " + Static288.anIntArray327[0] + "/" + Static520.anIntArray589[0] + " UW: " + Static288.anIntArray327[1] + "/" + Static520.anIntArray589[1], -16777216);
		Static319.aClass35_8.method4935(10, -256, 60, "Static Anim: OW: " + Static431.anIntArray499[0] + "/" + Static311.anIntArray358[0] + " UW: " + Static431.anIntArray499[1] + "/" + Static311.anIntArray358[1], -16777216);
		Static319.aClass35_8.method4935(10, -256, 75, "Dynamic: " + Static428.anInt4959 + "/" + 5000, -16777216);
		Static319.aClass35_8.method4935(10, -256, 90, "Total Opaque Onscreen: " + Static132.anInt2643 + "/" + 10000, -16777216);
		Static319.aClass35_8.method4935(10, -256, 105, "Total Trans Onscreen: " + Static335.anInt5960 + "/" + 5000, -16777216);
		Static319.aClass35_8.method4935(10, -256, 120, "Occluders: " + (Static465.anInt7900 + Static69.anInt1595) + " Active: " + Static259.anInt4761, -16777216);
		Static319.aClass35_8.method4935(10, -256, 135, "Occluded: Ground:" + Static500.anInt6882 + " Walls: " + Static486.anInt8200 + " CPs: " + Static264.anInt4970 + " Pixels: " + Static13.anInt359, -16777216);
		Static319.aClass35_8.method4935(10, -256, 150, "Occlude Calc Took: " + Static260.aLong198 / 1000L + "us", -16777216);
		if (Static227.anIntArray262 == null) {
			return;
		}
		for (@Pc(456) int local456 = 0; local456 < Static227.anIntArray262.length; local456++) {
			@Pc(462) float local462 = (float) Static227.anIntArray262[local456];
			local462 /= 4194304.0F;
			if (local462 > 1.0F) {
				local462 = 1.0F;
			}
			local462 *= 255.0F;
			local462 = 255.0F - local462;
			@Pc(483) int local483 = (int) local462;
			Static227.anIntArray262[local456] = local483 | local483 << 8 | local483 << 16 | 0xFF000000;
		}
		@Pc(510) Class10 local510 = Static63.aClass12_5.method6429(Static227.anIntArray262, Static126.anInt6657, Static126.anInt6657, Static61.anInt1533);
		local510.V(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILclient!ag;ZII)Lclient!ck;")
	public static Class52_Sub1_Sub1 method2621(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aBoolean22 || Static119.method2029(arg0) && Static119.method2029(arg2)) {
			return new Class52_Sub1_Sub1(arg1, 3553, 6408, arg0, arg2);
		} else if (arg1.aBoolean21) {
			return new Class52_Sub1_Sub1(arg1, 34037, 6408, arg0, arg2);
		} else {
			return new Class52_Sub1_Sub1(arg1, 6408, arg0, arg2, Static200.method3428(arg0), Static200.method3428(arg2));
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIB)Z")
	public static boolean method2623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
