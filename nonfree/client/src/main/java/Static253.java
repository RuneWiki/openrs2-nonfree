import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	public static int anInt4561;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
	public static int anInt4566 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!sm;)V")
	public static void method3684(@OriginalArg(0) Class225 arg0) {
		if (Static135.anInt6872 >= 65535) {
			return;
		}
		@Pc(6) Class10_Sub4 local6 = arg0.aClass10_Sub4_1;
		Static25.aClass225Array1[Static135.anInt6872] = arg0;
		Static338.aBooleanArray18[Static135.anInt6872] = false;
		Static135.anInt6872++;
		@Pc(21) int local21 = arg0.anInt6417;
		if (arg0.aBoolean419) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6417;
		if (arg0.aBoolean420) {
			local29 = Static285.anInt5004 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5362() + Static437.anInt7214 - local6.method5355() >> Static286.anInt5018;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5362() + local6.method5355() - Static437.anInt7214 >> Static286.anInt5018;
			if (local73 >= Static24.anInt401) {
				local73 = Static24.anInt401 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray105[local41++];
				@Pc(105) int local105 = (local6.method5354() + Static437.anInt7214 - local6.method5355() >> Static286.anInt5018) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static54.anInt998) {
					local113 = Static54.anInt998 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static226.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static226.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static135.anInt6872;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static226.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static135.anInt6872 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static226.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static135.anInt6872 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static226.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static135.anInt6872 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method3686(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static418.method5490(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0 != arg1.charAt(local25); local25++) {
			}
			local15[local17++] = arg1.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}
}
