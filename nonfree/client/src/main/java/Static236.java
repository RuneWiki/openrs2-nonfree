import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
	public static final int[] anIntArray365 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public static int anInt4586 = 0;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString265 = "";

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4028(@OriginalArg(0) String arg0) {
		if (Static206.aStringArray28 == null) {
			Static225.method3904();
		}
		@Pc(22) String[] local22 = Static219.method3847('\n', arg0);
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			for (@Pc(31) int local31 = Static206.aStringArray28.length - 1; local31 > 0; local31--) {
				Static206.aStringArray28[local31] = Static206.aStringArray28[local31 - 1];
			}
			Static206.aStringArray28[0] = local22[local24];
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public static void method4031() {
		Static148.aClass211_14 = new Class211();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
	public static void method4033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static267.anInt5127 = arg2;
		Static328.anInt6217 = arg0;
		Static341.anInt6374 = arg3;
		Static99.anInt2187 = arg1;
		Static256.anInt4992 = arg4;
		if (Static341.anInt6374 >= 100) {
			@Pc(27) int local27 = Static99.anInt2187 * 128 + 64;
			@Pc(33) int local33 = Static256.anInt4992 * 128 + 64;
			@Pc(42) int local42 = Static66.method1393(local33, Static156.anInt3123, local27) - Static267.anInt5127;
			@Pc(47) int local47 = local27 - Static347.anInt6472;
			@Pc(51) int local51 = local42 - Static339.anInt6354;
			@Pc(56) int local56 = local33 - Static347.anInt6471;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local56 * local56 + local47 * local47));
			Static311.anInt6461 = (int) (Math.atan2((double) local51, (double) local67) * 2607.5945876176133D) & 0x3FFF;
			Static199.anInt3858 = (int) (-2607.5945876176133D * Math.atan2((double) local47, (double) local56)) & 0x3FFF;
			if (Static311.anInt6461 < 1024) {
				Static311.anInt6461 = 1024;
			}
			if (Static311.anInt6461 > 3072) {
				Static311.anInt6461 = 3072;
			}
		}
		Static215.anInt4279 = 2;
	}
}
