import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
	public static int anInt2003;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZILjava/lang/String;Ljava/lang/String;IZ)V")
	public static void method1649(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(6) boolean arg5) {
		Static428.aClass353_79.anInt9949 = 1;
		@Pc(11) String local11 = arg3.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg0 != -1) {
			@Pc(26) Class223 local26 = Static26.aClass179_1.method5148(arg0);
			if (local26 == null || local26.method5911() != arg5) {
				return;
			}
			if (local26.method5911()) {
				local18 = local26.aString83;
			} else {
				local16 = local26.anInt6887;
			}
		}
		@Pc(52) int local52 = 0;
		@Pc(141) int local141;
		for (@Pc(54) int local54 = 0; local54 < Static266.aClass138_1.anInt4296; local54++) {
			@Pc(61) Class347 local61 = Static266.aClass138_1.method3730(local54);
			if ((!arg1 || local61.aBoolean671) && local61.anInt9773 == -1 && local61.anInt9728 == -1 && local61.anInt9757 == 0 && local61.aString109.toLowerCase().indexOf(local11) != -1) {
				if (arg0 != -1) {
					if (arg5) {
						if (!arg4.equals(local61.method8252(local18, arg0))) {
							continue;
						}
					} else if (local61.method8245(local16, arg0) != arg2) {
						continue;
					}
				}
				if (local52 >= 250) {
					Static126.anInt2428 = -1;
					Static293.aShortArray76 = null;
					return;
				}
				if (local14.length <= local52) {
					@Pc(139) short[] local139 = new short[local14.length * 2];
					for (local141 = 0; local141 < local52; local141++) {
						local139[local141] = local14[local141];
					}
					local14 = local139;
				}
				local14[local52++] = (short) local54;
			}
		}
		Static293.aShortArray76 = local14;
		Static3.anInt52 = 0;
		Static126.anInt2428 = local52;
		@Pc(187) String[] local187 = new String[Static126.anInt2428];
		for (local141 = 0; local141 < Static126.anInt2428; local141++) {
			local187[local141] = Static266.aClass138_1.method3730(local14[local141]).aString109;
		}
		Static232.method4005(local187, Static293.aShortArray76);
		Static428.aClass353_79.method8417();
		Static428.aClass353_79.anInt9949 = 2;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBI)I")
	public static int method1655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(35) int local35 = (local7 * (arg0 & 0xFF00) & 0xFF0000 | local7 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return ((local12 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local12 & 0xFF0000) >>> 8) + local35;
	}
}
