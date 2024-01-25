import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_105;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z")
	public static boolean method6409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZZIBLjava/lang/String;Ljava/lang/String;)V")
	public static void method6410(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static114.aClass251_27.anInt6868 = 1;
		@Pc(11) String local11 = arg5.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg3 != -1) {
			@Pc(28) Class320 local28 = Static577.aClass185_2.method4519(arg3);
			if (local28 == null || local28.method7085() != arg2) {
				return;
			}
			if (local28.method7085()) {
				local18 = local28.aString96;
			} else {
				local16 = local28.anInt8653;
			}
		}
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < Static444.aClass322_2.anInt8716; local51++) {
			@Pc(58) Class237 local58 = Static444.aClass322_2.method7141(local51);
			if ((!arg1 || local58.aBoolean453) && local58.anInt6539 == -1 && local58.anInt6560 == -1 && local58.anInt6565 == 0 && local58.aString58.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg2) {
						if (!arg4.equals(local58.method5543(local18, arg3))) {
							continue;
						}
					} else if (local58.method5531(local16, arg3) != arg0) {
						continue;
					}
				}
				if (local49 >= 250) {
					Static113.aShortArray14 = null;
					Static148.anInt3249 = -1;
					return;
				}
				if (local14.length <= local49) {
					@Pc(140) short[] local140 = new short[local14.length * 2];
					for (@Pc(142) int local142 = 0; local142 < local49; local142++) {
						local140[local142] = local14[local142];
					}
					local14 = local140;
				}
				local14[local49++] = (short) local51;
			}
		}
		Static148.anInt3249 = local49;
		Static113.aShortArray14 = local14;
		Static234.anInt4753 = 0;
		@Pc(184) String[] local184 = new String[Static148.anInt3249];
		for (@Pc(186) int local186 = 0; local186 < Static148.anInt3249; local186++) {
			local184[local186] = Static444.aClass322_2.method7141(local14[local186]).aString58;
		}
		Static430.method6179(local184, Static113.aShortArray14);
		Static114.aClass251_27.method5777();
		Static114.aClass251_27.anInt6868 = 2;
	}
}
