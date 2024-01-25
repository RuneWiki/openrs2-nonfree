import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dia", name = "h", descriptor = "I")
	public static int anInt1937;

	@OriginalMember(owner = "client!dia", name = "r", descriptor = "Lclient!ld;")
	public static Class203 aClass203_1;

	@OriginalMember(owner = "client!dia", name = "k", descriptor = "I")
	public static int anInt1939 = 0;

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(B)V")
	public static void method1717() {
		if (Static74.aClass104_2 != Static120.aClass104_5) {
			try {
				Static683.method5174(Static563.aClient1, "tbrefresh");
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method1718(@OriginalArg(1) Class132 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = 0;
		if (Static594.aBoolean693) {
			local7 = Static234.method3562();
			local14 = Static314.method4504();
		}
		@Pc(26) int local26 = Static643.anInt10391 + local7;
		@Pc(30) int local30 = local14 + Static32.anInt784;
		@Pc(32) int local32 = Static279.anInt4804;
		@Pc(36) int local36 = Static122.anInt2157 - 3;
		Static618.method8529(Static52.aClass41_24.method1007(Static616.anInt10077), Static643.anInt10391 + local7, Static279.anInt4804, local14 + Static32.anInt784, arg0, Static122.anInt2157);
		@Pc(61) int local61 = Static193.aClass128_1.method5191() + local7;
		@Pc(67) int local67 = local14 + Static193.aClass128_1.method5188();
		@Pc(71) int local71;
		@Pc(76) Class6_Sub4_Sub10 local76;
		@Pc(89) int local89;
		@Pc(190) int local190;
		@Pc(266) Class6_Sub4_Sub12 local266;
		@Pc(177) Class6_Sub4_Sub12 local177;
		if (Static217.aBoolean218) {
			local71 = 0;
			for (local76 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8910(); local76 != null; local76 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8908()) {
				local89 = local30 + local71 * 16 + 13 + 20;
				if (Static643.anInt10391 + local7 < local61 && local7 + Static643.anInt10391 + Static279.anInt4804 > local61 && local89 - 13 < local67 && local89 + 4 > local67 && (local76.anInt5448 > 1 || ((Class6_Sub4_Sub12) local76.aClass384_11.aClass6_Sub4_62.aClass6_Sub4_67).aBoolean506)) {
					arg0.aa(local7 + Static643.anInt10391, local89 - 12, Static279.anInt4804, 16, Static166.anInt2808 | 255 - Static284.anInt4848 << 24, 1);
				}
				local71++;
			}
			if (Static275.aClass6_Sub4_Sub10_1 != null) {
				local71 = 0;
				Static618.method8529(Static275.aClass6_Sub4_Sub10_1.aString71, Static347.anInt10656, Static314.anInt5338, Static166.anInt2811, arg0, Static494.anInt8391);
				for (local177 = (Class6_Sub4_Sub12) Static275.aClass6_Sub4_Sub10_1.aClass384_11.method8910(); local177 != null; local177 = (Class6_Sub4_Sub12) Static275.aClass6_Sub4_Sub10_1.aClass384_11.method8908()) {
					local190 = Static166.anInt2811 + local71 * 16 + 33;
					if (Static347.anInt10656 < local61 && local61 < Static347.anInt10656 + Static314.anInt5338 && local190 - 13 < local67 && local67 < local190 + 4 && local177.aBoolean506) {
						arg0.aa(Static347.anInt10656, local190 - 12, Static314.anInt5338, 16, 255 - Static284.anInt4848 << 24 | Static166.anInt2808, 1);
					}
					local71++;
				}
				Static32.method791(Static166.anInt2811, Static314.anInt5338, Static494.anInt8391, Static347.anInt10656, arg0);
			}
		} else {
			local71 = 0;
			for (local266 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8538(); local266 != null; local266 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8530()) {
				local89 = local30 + (-local71 + Static183.anInt3155 - 1) * 16 + 33;
				if (local61 > local7 + Static643.anInt10391 && Static279.anInt4804 + Static643.anInt10391 + local7 > local61 && local89 - 13 < local67 && local89 + 4 > local67 && local266.aBoolean506) {
					arg0.aa(local7 + Static643.anInt10391, local89 + -12, Static279.anInt4804, 16, Static166.anInt2808 | 255 - Static284.anInt4848 << 24, 1);
				}
				local71++;
			}
		}
		Static32.method791(local14 + Static32.anInt784, Static279.anInt4804, Static122.anInt2157, local7 + Static643.anInt10391, arg0);
		if (Static217.aBoolean218) {
			local71 = 0;
			for (local76 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8910(); local76 != null; local76 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8908()) {
				local89 = local71 * 16 + local14 + Static32.anInt784 + 13 + 20;
				local71++;
				if (local76.anInt5448 == 1) {
					Static503.method6620(local7 + Static643.anInt10391, local67, (Class6_Sub4_Sub12) local76.aClass384_11.aClass6_Sub4_62.aClass6_Sub4_67, local89, Static291.anInt4908 | 0xFF000000, Static562.anInt9362 | 0xFF000000, Static122.anInt2157, local61, Static279.anInt4804, arg0, local14 + Static32.anInt784);
				} else {
					Static229.method3319(local67, local14 + Static32.anInt784, local7 + Static643.anInt10391, arg0, local89, local61, Static562.anInt9362 | 0xFF000000, Static279.anInt4804, Static291.anInt4908 | 0xFF000000, Static122.anInt2157, local76);
				}
			}
			if (Static275.aClass6_Sub4_Sub10_1 != null) {
				local71 = 0;
				for (local177 = (Class6_Sub4_Sub12) Static275.aClass6_Sub4_Sub10_1.aClass384_11.method8910(); local177 != null; local177 = (Class6_Sub4_Sub12) Static275.aClass6_Sub4_Sub10_1.aClass384_11.method8908()) {
					local190 = local71 * 16 + Static166.anInt2811 + 13 + 20;
					Static503.method6620(Static347.anInt10656, local67, local177, local190, Static291.anInt4908 | 0xFF000000, Static562.anInt9362 | 0xFF000000, Static494.anInt8391, local61, Static314.anInt5338, arg0, Static166.anInt2811);
					local71++;
				}
				Static103.method1674(Static314.anInt5338, Static494.anInt8391, Static166.anInt2811, Static347.anInt10656);
			}
		} else {
			local71 = 0;
			for (local266 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8538(); local266 != null; local266 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8530()) {
				local89 = (Static183.anInt3155 - local71 - 1) * 16 + local30 + 20 + 13;
				Static503.method6620(local26, local67, local266, local89, Static291.anInt4908 | 0xFF000000, Static562.anInt9362 | 0xFF000000, local36, local61, local32, arg0, local30);
				local71++;
			}
		}
		Static103.method1674(Static279.anInt4804, Static122.anInt2157, local14 + Static32.anInt784, Static643.anInt10391 - -local7);
	}
}
