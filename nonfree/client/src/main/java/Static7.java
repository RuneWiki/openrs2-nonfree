import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "t", descriptor = "I")
	public static int anInt6404;

	@OriginalMember(owner = "client!ada", name = "z", descriptor = "[Lclient!hu;")
	public static Class21[] aClass21Array16;

	@OriginalMember(owner = "client!ada", name = "B", descriptor = "I")
	public static int anInt6410;

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_81 = new Class71(60, 1);

	@OriginalMember(owner = "client!ada", name = "y", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "()V")
	public static void method5202() {
		if (Static245.anInt10232 == 0 || Static400.aClass27_15 == null) {
			return;
		}
		Static269.aClass16_11.K(Static636.anIntArray623);
		for (@Pc(12) int local12 = 0; local12 < Static630.anIntArray621.length; local12++) {
			Static269.aClass16_11.method6116(Static630.anIntArray621[local12] + Static546.anIntArray513[local12], Static636.anIntArray623[1], -256, Static636.anIntArray623[3] - Static636.anIntArray623[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static396.anInt9377; local41++) {
			@Pc(46) Class372 local46 = Static16.aClass372Array1[local41];
			Static269.aClass16_11.H(local46.anIntArray618[0], local46.anIntArray617[0], local46.anIntArray619[0], Static314.anIntArray365);
			Static269.aClass16_11.H(local46.anIntArray618[1], local46.anIntArray617[1], local46.anIntArray619[1], Static495.anIntArray88);
			Static269.aClass16_11.H(local46.anIntArray618[2], local46.anIntArray617[2], local46.anIntArray619[2], Static284.anIntArray342);
			Static269.aClass16_11.H(local46.anIntArray618[3], local46.anIntArray617[3], local46.anIntArray619[3], Static176.anIntArray231);
			if (Static314.anIntArray365[2] != -1 && Static495.anIntArray88[2] != -1 && Static284.anIntArray342[2] != -1 && Static176.anIntArray231[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte129 == 4) {
					local128 = -16776961;
				}
				Static269.aClass16_11.method6105(Static314.anIntArray365[0], Static495.anIntArray88[1], Static314.anIntArray365[1], local128, Static495.anIntArray88[0]);
				Static269.aClass16_11.method6105(Static495.anIntArray88[0], Static284.anIntArray342[1], Static495.anIntArray88[1], local128, Static284.anIntArray342[0]);
				Static269.aClass16_11.method6105(Static284.anIntArray342[0], Static176.anIntArray231[1], Static284.anIntArray342[1], local128, Static176.anIntArray231[0]);
				Static269.aClass16_11.method6105(Static176.anIntArray231[0], Static314.anIntArray365[1], Static176.anIntArray231[1], local128, Static314.anIntArray365[0]);
				Static269.aClass16_11.method6105(Static314.anIntArray365[0], Static284.anIntArray342[1], Static314.anIntArray365[1], local128, Static284.anIntArray342[0]);
			}
		}
		Static400.aClass27_15.method6993(10, -16777216, 75, -256, "Dynamic: " + Static1.anInt10286 + "/" + 5000);
		Static400.aClass27_15.method6993(10, -16777216, 90, -256, "Total Opaque Onscreen: " + Static42.anInt1523 + "/" + 10000);
		Static400.aClass27_15.method6993(10, -16777216, 105, -256, "Total Trans Onscreen: " + Static132.anInt3519 + "/" + 5000);
		Static400.aClass27_15.method6993(10, -16777216, 120, -256, "Occluders: " + (Static160.anInt4007 + Static128.anInt3432) + " Active: " + Static396.anInt9377);
		Static400.aClass27_15.method6993(10, -16777216, 135, -256, "Occluded: Ground:" + Static133.anInt3542 + " Walls: " + Static299.anInt5988 + " CPs: " + Static36.anInt1451 + " Pixels: " + Static359.anInt6889);
		Static400.aClass27_15.method6993(10, -16777216, 150, -256, "Occlude Calc Took: " + Static514.aLong236 / 1000L + "us");
		if (Static245.anInt10232 != 2 || Static169.anIntArray223 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static169.anIntArray223.length; local355++) {
			@Pc(361) float local361 = (float) Static169.anIntArray223[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static169.anIntArray223[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class21 local410 = Static269.aClass16_11.method6132(Static46.anInt1571, Static169.anIntArray223, Static225.anInt10572, Static225.anInt10572);
		local410.method5791(10, 170, 1, 0, 0);
	}
}
