import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Lclient!sh;")
	public static final Class307 aClass307_4 = new Class307();

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5749(@OriginalArg(1) String arg0) {
		@Pc(12) String local12 = null;
		@Pc(16) int local16 = arg0.indexOf("--> ");
		if (local16 >= 0) {
			local12 = arg0.substring(0, local16 + 4);
			arg0 = arg0.substring(local16 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(41) int local41 = arg0.indexOf(" ", "directlogin ".length());
			if (local41 >= 0) {
				@Pc(49) int local49 = arg0.length();
				arg0 = arg0.substring(0, local41) + " ";
				for (@Pc(65) int local65 = local41 + 1; local65 < local49; local65++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local12 == null ? arg0 : local12 + arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!lk;ILclient!ua;ZIIILclient!r;)V")
	public static void method5752(@OriginalArg(0) int arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class146 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class43 arg7) {
		@Pc(15) Class40 local15 = Static191.aClass168_2.method4062(arg0);
		if (local15 == null || !local15.aBoolean95 || !local15.method1125(Static427.aClass56_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray104 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray104.length];
			@Pc(45) int local45;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static446.anInt7363 == 4) {
					local45 = (int) Static439.aFloat151 & 0x3FFF;
				} else {
					local45 = (int) Static439.aFloat151 + Static278.anInt5101 & 0x3FFF;
				}
				@Pc(59) int local59 = Class3_Sub17.anIntArray175[local45];
				@Pc(63) int local63 = Class3_Sub17.anIntArray177[local45];
				if (Static446.anInt7363 != 4) {
					local63 = local63 * 256 / (Static435.anInt7196 + 256);
					local59 = local59 * 256 / (Static435.anInt7196 + 256);
				}
				local33[local35 * 2] = arg1.anInt5513 / 2 + arg6 + (local59 * (arg2 - -(local15.anIntArray104[local35 * 2 + 1] * 4)) - -((arg4 - -(local15.anIntArray104[local35 * 2] * 4)) * local63) >> 14);
				local33[local35 * 2 + 1] = arg1.anInt5476 / 2 + arg5 - (-(local59 * (local15.anIntArray104[local35 * 2] * 4 + arg4)) + (arg2 - -(local15.anIntArray104[local35 * 2 + 1] * 4)) * local63 >> 14);
			}
			Static38.method667(arg7, local33, local15.anInt1383, arg1.anIntArray419, arg1.anIntArray417);
			for (local45 = 0; local45 < local33.length / 2 - 1; local45++) {
				arg7.method7156(local33[local45 * 2], local33[local45 * 2 + 1], local33[local45 * 2 + 2], local33[(local45 + 1) * 2 + 1], local15.anInt1398, arg3, arg6, arg5);
			}
			arg7.method7156(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anInt1398, arg3, arg6, arg5);
		}
		@Pc(265) Class46 local265 = null;
		if (local15.anInt1385 != -1) {
			local265 = local15.method1118(arg7, false);
			if (local265 != null) {
				Static555.method7393(arg1, arg2, arg5, arg4, arg3, local265, arg6);
			}
		}
		if (local15.aString25 == null) {
			return;
		}
		local35 = 0;
		if (local265 != null) {
			local35 = local265.u();
		}
		@Pc(298) Class117 local298 = Static410.aClass117_8;
		@Pc(300) Class58 local300 = Static519.aClass58_13;
		if (local15.anInt1380 == 1) {
			local298 = Static49.aClass117_1;
			local300 = Static103.aClass58_6;
		}
		if (local15.anInt1380 == 2) {
			local298 = Static480.aClass117_9;
			local300 = Static159.aClass58_7;
		}
		Static522.method6948(arg3, arg5, arg2, arg6, arg1, local298, local35, local15.aString25, arg4, local300, local15.anInt1390);
		return;
	}
}
