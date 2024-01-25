import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BZLjava/lang/String;ZILjava/lang/String;I)V")
	public static void method2808(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static467.aClass176_114.anInt4548 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(20) int local20 = -1;
		@Pc(22) String local22 = null;
		if (arg3 != -1) {
			@Pc(31) Class106 local31 = Static484.aClass313_2.method7381(arg3);
			if (local31 == null || arg0 != local31.method2801()) {
				return;
			}
			if (local31.method2801()) {
				local22 = local31.aString27;
			} else {
				local20 = local31.anInt3103;
			}
		}
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < Static521.aClass273_2.anInt8075; local54++) {
			@Pc(61) Class242 local61 = Static521.aClass273_2.method6712(local54);
			if ((!arg2 || local61.aBoolean502) && local61.anInt7089 == -1 && local61.anInt7081 == -1 && local61.anInt7102 == 0 && local61.aString71.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg0) {
						if (!arg4.equals(local61.method5895(arg3, local22))) {
							continue;
						}
					} else if (local61.method5896(local20, arg3) != arg5) {
						continue;
					}
				}
				if (local52 >= 250) {
					Static256.aShortArray58 = null;
					Static291.anInt5926 = -1;
					return;
				}
				if (local14.length <= local52) {
					@Pc(142) short[] local142 = new short[local14.length * 2];
					for (@Pc(144) int local144 = 0; local144 < local52; local144++) {
						local142[local144] = local14[local144];
					}
					local14 = local142;
				}
				local14[local52++] = (short) local54;
			}
		}
		Static291.anInt5926 = local52;
		Static256.aShortArray58 = local14;
		Static15.anInt243 = 0;
		@Pc(182) String[] local182 = new String[Static291.anInt5926];
		for (@Pc(184) int local184 = 0; local184 < Static291.anInt5926; local184++) {
			local182[local184] = Static521.aClass273_2.method6712(local14[local184]).aString71;
		}
		Static9.method172(local182, Static256.aShortArray58);
		Static467.aClass176_114.method3979();
		Static467.aClass176_114.anInt4548 = 2;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZI)V")
	public static void method2809(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static135.anInt2897 = arg1;
		Static313.anInt4728 = 3;
		Static480.method8253(Static105.aClass342_2.anInt9881, Static105.aClass342_2.aString96);
		if (arg0) {
			Static263.method4439("", false, "");
		} else {
			Static517.method7563();
			Static263.method4439(Static98.aString8, false, Static143.aString26);
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public static void method2810() {
		if (Static443.anInt8270 != -1) {
			Static356.method5759(-1, Static443.anInt8270, false, -1);
			Static443.anInt8270 = -1;
		}
	}
}
