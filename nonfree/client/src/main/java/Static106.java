import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!l", name = "T", descriptor = "I")
	public static int anInt2579 = 0;

	@OriginalMember(owner = "client!l", name = "Z", descriptor = "[S")
	public static short[] aShortArray75 = new short[256];

	@OriginalMember(owner = "client!l", name = "bb", descriptor = "Lclient!i;")
	public static Class41 aClass41_759 = Static184.method2923("::");

	@OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
	public static int anInt2584 = -1;

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "Lclient!i;")
	public static Class41 aClass41_760 = Static184.method2923("<)4col>");

	@OriginalMember(owner = "client!l", name = "kb", descriptor = "[I")
	public static int[] anIntArray254 = new int[4096];

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1814(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static149.aClass29_1);
		arg0.removeFocusListener(Static149.aClass29_1);
		Static29.anInt700 = -1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIBI)V")
	public static void method1815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == Static125.anInt1525 && Static96.anInt2367 == arg3 && (arg0 == Static142.anInt3258 || !Static217.aBoolean290)) {
			return;
		}
		Static142.anInt3258 = arg0;
		if (!Static217.aBoolean290) {
			Static142.anInt3258 = 0;
		}
		Static96.anInt2367 = arg3;
		Static125.anInt1525 = arg2;
		Static116.method1955(25);
		Static31.method606(Static215.aClass41_1270, true);
		@Pc(49) int local49 = Static198.anInt4451;
		@Pc(51) int local51 = Static168.anInt3899;
		Static168.anInt3899 = arg3 * 8 - 48;
		@Pc(62) int local62 = Static168.anInt3899 - local51;
		Static198.anInt4451 = (arg2 - 6) * 8;
		@Pc(73) int local73 = Static198.anInt4451 - local49;
		for (@Pc(79) int local79 = 0; local79 < 32768; local79++) {
			@Pc(85) Class12_Sub3_Sub2 local85 = Static199.aClass12_Sub3_Sub2Array1[local79];
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < 10; local89++) {
					local85.anIntArray412[local89] -= local73;
					local85.anIntArray414[local89] -= local62;
				}
				local85.anInt3949 -= local62 * 128;
				local85.anInt3961 -= local73 * 128;
			}
		}
		for (@Pc(135) int local135 = 0; local135 < 2048; local135++) {
			@Pc(141) Class12_Sub3_Sub1 local141 = Static216.aClass12_Sub3_Sub1Array1[local135];
			if (local141 != null) {
				for (@Pc(145) int local145 = 0; local145 < 10; local145++) {
					local141.anIntArray412[local145] -= local73;
					local141.anIntArray414[local145] -= local62;
				}
				local141.anInt3961 -= local73 * 128;
				local141.anInt3949 -= local62 * 128;
			}
		}
		Static134.anInt3147 = arg0;
		@Pc(193) byte local193 = 0;
		@Pc(195) byte local195 = 104;
		Static213.aClass12_Sub3_Sub1_1.method2722(false, arg4, arg1);
		@Pc(203) byte local203 = 0;
		@Pc(205) byte local205 = 1;
		if (local73 < 0) {
			local195 = -1;
			local205 = -1;
			local193 = 103;
		}
		@Pc(218) byte local218 = 1;
		@Pc(220) byte local220 = 104;
		if (local62 < 0) {
			local220 = -1;
			local218 = -1;
			local203 = 103;
		}
		for (@Pc(230) int local230 = local193; local230 != local195; local230 += local205) {
			for (@Pc(234) int local234 = local203; local234 != local220; local234 += local218) {
				@Pc(240) int local240 = local73 + local230;
				@Pc(245) int local245 = local234 + local62;
				for (@Pc(247) int local247 = 0; local247 < 4; local247++) {
					if (local240 >= 0 && local245 >= 0 && local240 < 104 && local245 < 104) {
						Static119.aClass108ArrayArrayArray1[local247][local230][local234] = Static119.aClass108ArrayArrayArray1[local247][local240][local245];
					} else {
						Static119.aClass108ArrayArrayArray1[local247][local230][local234] = null;
					}
				}
			}
		}
		for (@Pc(319) Class2_Sub20 local319 = (Class2_Sub20) Static56.aClass108_4.method3322(); local319 != null; local319 = (Class2_Sub20) Static56.aClass108_4.method3331()) {
			local319.anInt3289 -= local73;
			local319.anInt3282 -= local62;
			if (local319.anInt3289 < 0 || local319.anInt3282 < 0 || local319.anInt3289 >= 104 || local319.anInt3282 >= 104) {
				local319.method3314();
			}
		}
		if (Static102.anInt2490 != 0) {
			Static102.anInt2490 -= local73;
			Static125.anInt1524 -= local62;
		}
		Static154.anInt3612 = -1;
		Static160.aBoolean233 = false;
		Static156.anInt3673 = 0;
		Static38.aClass108_2.method3328();
		Static150.aClass108_13.method3328();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!i;I)I")
	public static int method1818(@OriginalArg(0) Class41 arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static131.anInt2996; local19++) {
			if (arg0.method1413(Static21.aClass41Array71[local19])) {
				return local19;
			}
		}
		return -1;
	}
}
