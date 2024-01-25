import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!in", name = "n", descriptor = "I")
	public static int anInt4250;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_125 = new Class235(69, 0);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IBZII)V")
	public static void method3418(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static113.anInt2222 == 0) {
			Static507.method7074(false);
		} else {
			Static207.anInt4059 = Static113.anInt2222;
			Static523.method7235(0);
		}
		Static577.anInt9508 = arg0;
		Static577.aBoolean744 = arg1;
		Static79.anInt1743 = arg3;
		Static226.method5073(arg2);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public static void method3419() {
		if (Static503.aClass134_14 != null) {
			Static503.aClass134_14.method6939();
			Static348.aClass64_10 = null;
			Static503.aClass134_14 = null;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z[[BLclient!bd;)V")
	public static void method3421(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class26_Sub1 arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.anInt490; local12++) {
			Static510.method7089();
			for (@Pc(18) int local18 = 0; local18 < Static71.anInt1410 >> 3; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static471.anInt8012 >> 3; local22++) {
					@Pc(32) int local32 = Static192.anIntArrayArrayArray5[local12][local18][local22];
					if (local32 != -1) {
						@Pc(41) int local41 = local32 >> 24 & 0x3;
						if (!arg1.aBoolean48 || local41 == 0) {
							@Pc(55) int local55 = local32 >> 1 & 0x3;
							@Pc(61) int local61 = local32 >> 14 & 0x3FF;
							@Pc(67) int local67 = local32 >> 3 & 0x7FF;
							@Pc(77) int local77 = local67 / 8 + (local61 / 8 << 8);
							for (@Pc(79) int local79 = 0; local79 < Static566.anIntArray710.length; local79++) {
								if (Static566.anIntArray710[local79] == local77 && arg0[local79] != null) {
									arg1.method417(local22 * 8, arg0[local79], local18 * 8, local12, (local67 & 0x7) * 8, Static16.aClass134_1, (local61 & 0x7) * 8, Static478.aClass59Array2, local55, local41);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3422(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static442.method6116(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static233.anInt7999; local25++) {
			@Pc(31) String local31 = Static29.aStringArray4[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static442.method6116(local31);
			if (local31 != null && local31.equals(local20)) {
				Static233.anInt7999--;
				for (@Pc(55) int local55 = local25; local55 < Static233.anInt7999; local55++) {
					Static29.aStringArray4[local55] = Static29.aStringArray4[local55 + 1];
					Static563.aStringArray39[local55] = Static563.aStringArray39[local55 + 1];
					Static534.aStringArray37[local55] = Static534.aStringArray37[local55 + 1];
					Static574.aStringArray41[local55] = Static574.aStringArray41[local55 + 1];
					Static469.aBooleanArray18[local55] = Static469.aBooleanArray18[local55 + 1];
				}
				Static498.anInt8553 = Static233.anInt8002;
				@Pc(112) Class1_Sub11 local112 = Static276.method3885(Static105.aClass70_19, Static481.aClass276_2);
				local112.aClass1_Sub35_Sub2_1.method5777(Static358.method4886(arg0));
				local112.aClass1_Sub35_Sub2_1.method5761(arg0);
				Static48.method743(local112);
				return;
			}
		}
	}
}
