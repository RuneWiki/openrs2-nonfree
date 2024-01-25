import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fc", name = "V", descriptor = "Lclient!vi;")
	public static Class251 aClass251_1;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_30 = new Class84("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
	public static int anInt1938 = 0;

	@OriginalMember(owner = "client!fc", name = "W", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_8 = new Class225(11, 0, 1, 2);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ea;ILclient!ss;IIILclient!qa;I)V")
	public static void method1630(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class219 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class109 arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class231 local10 = Static1.aClass224_1.method5302(arg7);
		if (local10 == null || !local10.aBoolean445 || !local10.method5358(Static51.aClass79_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray568 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray568.length];
			@Pc(44) int local44;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static310.anInt5540 == 4) {
					local44 = (int) Static274.aFloat78 & 0x3FFF;
				} else {
					local44 = Static182.anInt7140 + (int) Static274.aFloat78 & 0x3FFF;
				}
				@Pc(55) int local55 = Class4.anIntArray7[local44];
				@Pc(59) int local59 = Class4.anIntArray6[local44];
				if (Static310.anInt5540 != 4) {
					local55 = local55 * 256 / (Static427.anInt7386 + 256);
					local59 = local59 * 256 / (Static427.anInt7386 + 256);
				}
				local28[local30 * 2] = ((local10.anIntArray568[local30 * 2 + 1] * 4 + arg0) * local55 + local59 * (arg2 + local10.anIntArray568[local30 * 2] * 4) >> 15) + arg3.anInt6398 / 2 + arg5;
				local28[local30 * 2 + 1] = arg3.anInt6363 / 2 + arg4 - ((arg0 + local10.anIntArray568[local30 * 2 + 1] * 4) * local59 - local55 * (arg2 + local10.anIntArray568[local30 * 2] * 4) >> 15);
			}
			Static252.method3708(arg6, local28, local10.anInt6842, arg3.anIntArray522, arg3.anIntArray526);
			for (local44 = 0; local44 < local28.length / 2 - 1; local44++) {
				arg6.method4680(local28[local44 * 2], local28[local44 * 2 + 1], local28[(local44 + 1) * 2], local28[local44 * 2 + 3], local10.anInt6851, arg1, arg5, arg4);
			}
			arg6.method4680(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt6851, arg1, arg5, arg4);
		}
		@Pc(264) Class80 local264 = null;
		if (local10.anInt6847 != -1) {
			local264 = local10.method5364(false, arg6);
			if (local264 != null) {
				Static157.method2368(arg1, arg4, arg2, arg0, arg3, local264, arg5);
			}
		}
		if (local10.aString54 == null) {
			return;
		}
		local30 = 0;
		if (local264 != null) {
			local30 = local264.qa();
		}
		@Pc(298) Class129 local298 = Static197.aClass129_2;
		@Pc(300) Class101 local300 = Static40.aClass101_1;
		if (local10.anInt6848 == 1) {
			local300 = Static98.aClass101_2;
			local298 = Static372.aClass129_6;
		}
		if (local10.anInt6848 == 2) {
			local298 = Static139.aClass129_1;
			local300 = Static167.aClass101_3;
		}
		Static295.method4206(arg5, arg2, arg1, local298, local10.aString54, arg4, local30, arg0, local300, arg3, local10.anInt6853);
	}
}
