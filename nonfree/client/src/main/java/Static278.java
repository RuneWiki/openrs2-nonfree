import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	public static int anInt5564;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Lclient!ak;")
	public static Class7 aClass7_225;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!cd;")
	public static Class22 aClass22_21 = new Class22(16);

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "[I")
	public static int[] anIntArray657 = new int[25];

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean425 = true;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	public static int anInt5569 = -1;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
	public static int anInt5580 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V")
	public static void method4269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static163.method3579(12, arg1);
		local8.method1859();
		local8.anInt2282 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public static void method4270() {
		for (@Pc(9) int local9 = 0; local9 < Static101.anInt1926; local9++) {
			@Pc(20) int local20 = Static294.anIntArray687[local9];
			@Pc(24) Class6_Sub6_Sub1 local24 = Static211.aClass6_Sub6_Sub1Array2[local20];
			@Pc(28) int local28 = Static63.aClass1_Sub18_Sub1_1.method3122();
			if ((local28 & 0x2) != 0) {
				local28 += Static63.aClass1_Sub18_Sub1_1.method3122() << 8;
			}
			@Pc(54) int local54;
			@Pc(65) int local65;
			if ((local28 & 0x4) != 0) {
				local54 = Static63.aClass1_Sub18_Sub1_1.method3118();
				if (local54 == 65535) {
					local54 = -1;
				}
				@Pc(61) boolean local61 = true;
				local65 = Static63.aClass1_Sub18_Sub1_1.method3074();
				if (local54 != -1 && local24.anInt4580 != -1 && Static262.method4031(Static280.method4295(local54).anInt838).anInt4013 < Static262.method4031(Static280.method4295(local24.anInt4580).anInt838).anInt4013) {
					local61 = false;
				}
				if (local61) {
					local24.anInt4578 = 0;
					local24.anInt4571 = 1;
					local24.anInt4548 = (local65 & 0xFFFF) + Static261.anInt5259;
					if (Static261.anInt5259 < local24.anInt4548) {
						local24.anInt4578 = -1;
					}
					local24.anInt4580 = local54;
					local24.anInt4525 = 0;
					local24.anInt4520 = local65 >> 16;
					if (local24.anInt4580 != -1 && local24.anInt4548 == Static261.anInt5259) {
						@Pc(158) int local158 = Static280.method4295(local24.anInt4580).anInt838;
						if (local158 != -1) {
							@Pc(166) Class133 local166 = Static262.method4031(local158);
							if (local166 != null && local166.anIntArray461 != null) {
								Static128.method1976(false, local166, local24.anInt4569, 0, local24.anInt4562);
							}
						}
					}
				}
			}
			if ((local28 & 0x20) != 0) {
				local54 = Static63.aClass1_Sub18_Sub1_1.method3057();
				local65 = Static63.aClass1_Sub18_Sub1_1.method3122();
				local24.method3507(local65, local54, Static261.anInt5259);
			}
			if ((local28 & 0x100) != 0) {
				local54 = Static63.aClass1_Sub18_Sub1_1.method3122();
				@Pc(214) int[] local214 = new int[local54];
				@Pc(217) int[] local217 = new int[local54];
				@Pc(220) int[] local220 = new int[local54];
				for (@Pc(222) int local222 = 0; local222 < local54; local222++) {
					@Pc(231) int local231 = Static63.aClass1_Sub18_Sub1_1.method3107();
					if (local231 == 65535) {
						local231 = -1;
					}
					local217[local222] = local231;
					local220[local222] = Static63.aClass1_Sub18_Sub1_1.method3084();
					local214[local222] = Static63.aClass1_Sub18_Sub1_1.method3118();
				}
				Static223.method3578(local220, local214, local217, local24);
			}
			if ((local28 & 0x80) != 0) {
				local24.anInt4513 = Static63.aClass1_Sub18_Sub1_1.method3103();
				if (local24.anInt4513 == 65535) {
					local24.anInt4513 = -1;
				}
			}
			if ((local28 & 0x1) != 0) {
				local24.aString145 = Static63.aClass1_Sub18_Sub1_1.method3101();
				local24.anInt4563 = 100;
			}
			if ((local28 & 0x8) != 0) {
				local54 = Static63.aClass1_Sub18_Sub1_1.method3057();
				local65 = Static63.aClass1_Sub18_Sub1_1.method3099();
				local24.method3507(local65, local54, Static261.anInt5259);
				local24.anInt4502 = Static261.anInt5259 + 300;
				local24.anInt4536 = Static63.aClass1_Sub18_Sub1_1.method3057();
			}
			if ((local28 & 0x200) != 0) {
				local24.anInt4552 = Static63.aClass1_Sub18_Sub1_1.method3107();
				local24.anInt4517 = Static63.aClass1_Sub18_Sub1_1.method3118();
			}
			if ((local28 & 0x40) != 0) {
				if (local24.aClass19_1.method505()) {
					Static165.method2523(local24);
				}
				local24.method3458(Static24.method424(Static63.aClass1_Sub18_Sub1_1.method3118()));
				local24.method3511(local24.aClass19_1.anInt629);
				local24.anInt4546 = local24.aClass19_1.anInt656;
				local24.anInt4503 = local24.aClass19_1.anInt673;
				if (local24.aClass19_1.method505()) {
					Static280.method4296(null, null, Static159.anInt2978, local24, local24.anIntArray519[0], local24.anIntArray516[0], 0);
				}
			}
			if ((local28 & 0x10) != 0) {
				local54 = Static63.aClass1_Sub18_Sub1_1.method3107();
				if (local54 == 65535) {
					local54 = -1;
				}
				local65 = Static63.aClass1_Sub18_Sub1_1.method3099();
				Static224.method3590(local65, local54, local24);
			}
		}
	}
}
