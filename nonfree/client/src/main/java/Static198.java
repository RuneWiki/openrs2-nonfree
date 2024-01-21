import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1268 = Static81.method1507("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
	public static int anInt4435 = 0;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	public static int anInt4436 = 0;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1269 = Static81.method1507("<col=ff0000>");

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1270 = Static81.method1507("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1271 = Static81.method1507(":trade:");

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public static void method3352() {
		@Pc(7) int local7 = Static10.anInt1519;
		@Pc(9) int local9 = Static109.anInt2509;
		@Pc(11) int local11 = Static110.anInt2525;
		@Pc(13) int local13 = Static7.anInt173;
		Static90.method3482(local7, local11, local9, local13, 6116423);
		Static90.method3482(local7 + 1, local11 + 1, local9 - 2, 16, 0);
		Static90.method3490(local7 + 1, local11 + 18, local9 - 2, local13 + -19, 0);
		Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1273(Static195.aClass24_1249, local7 + 3, local11 - -14, 6116423, -1);
		@Pc(60) int local60 = Static24.anInt661;
		@Pc(62) int local62 = Static7.anInt174;
		for (@Pc(64) int local64 = 0; local64 < Static156.anInt3437; local64++) {
			@Pc(79) int local79 = (Static156.anInt3437 - local64 - 1) * 15 + local11 + 31;
			@Pc(81) int local81 = 16777215;
			if (local60 > local7 && local9 + local7 > local60 && local62 > local79 - 13 && local79 + 3 > local62) {
				local81 = 16776960;
			}
			Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1273(Static123.method2077(local64), local7 + 3, local79, local81, 0);
		}
		Static110.method1906(Static109.anInt2509, Static7.anInt173, Static110.anInt2525, Static10.anInt1519);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[B)V")
	public static void method3353(@OriginalArg(1) byte[] arg0) {
		@Pc(10) int local10 = 0;
		while (true) {
			while (local10 < arg0.length) {
				@Pc(23) int local23 = (arg0[local10++] & 0xFF) * 64 - Static174.anInt3876;
				@Pc(34) int local34 = (arg0[local10++] & 0xFF) * 64 - Static122.anInt2713;
				@Pc(72) byte local72;
				@Pc(52) int local52;
				if (local23 > 0 && local34 > 0 && Static146.anInt3124 > local23 + 64 && local34 + 64 < Static189.anInt4212) {
					local52 = local23 >> 6;
					@Pc(61) int local61 = Static189.anInt4212 - local34 - 1 >> 6;
					for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
						for (@Pc(66) int local66 = -64; local66 < 0; local66++) {
							local72 = arg0[local10++];
							if (local72 != 0) {
								if (Static202.aByteArrayArrayArray14[local52][local61] == null) {
									Static202.aByteArrayArrayArray14[local52][local61] = new byte[4096];
								}
								Static202.aByteArrayArrayArray14[local52][local61][local63 + (-(local66 + 1) << 6)] = local72;
								@Pc(107) byte local107 = arg0[local10++];
								if (Static148.aByteArrayArrayArray10[local52][local61] == null) {
									Static148.aByteArrayArrayArray10[local52][local61] = new byte[4096];
								}
								Static148.aByteArrayArrayArray10[local52][local61][(-(local66 + 1) << 6) + local63] = local107;
							}
						}
					}
				} else {
					for (local52 = -4096; local52 < 0; local52++) {
						local72 = arg0[local10++];
						if (local72 != 0) {
							local10++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLclient!fj;)Lclient!fd;")
	public static Class22_Sub1 method3354(@OriginalArg(1) Class1_Sub7 arg0) {
		return new Class22_Sub1(arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2745(), arg0.method2745(), arg0.method2771());
	}
}
