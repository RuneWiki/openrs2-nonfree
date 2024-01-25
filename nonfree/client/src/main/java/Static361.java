import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
	public static final int[] anIntArray443 = new int[14];

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
	public static int anInt6264 = 0;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Z")
	public static boolean aBoolean570 = false;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBLclient!uu;I)V")
	public static void method4870(@OriginalArg(0) int arg0, @OriginalArg(2) Class247 arg1, @OriginalArg(3) int arg2) {
		Static290.anInt6409 = arg2;
		Static161.aClass247_6 = arg1;
		Static260.anInt4896 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III[BII)Z")
	public static boolean method4871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class4_Sub12 local12 = new Class4_Sub12(arg3);
		@Pc(14) int local14 = -1;
		label54: while (true) {
			@Pc(18) int local18 = local12.method2499();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(34) int local34;
				while (!local28) {
					local34 = local12.method2506();
					if (local34 == 0) {
						continue label54;
					}
					local26 += local34 - 1;
					@Pc(61) int local61 = local26 & 0x3F;
					@Pc(67) int local67 = local26 >> 6 & 0x3F;
					@Pc(73) int local73 = local12.method2490() >> 2;
					@Pc(77) int local77 = arg1 + local67;
					@Pc(81) int local81 = arg4 + local61;
					if (local77 > 0 && local81 > 0 && local77 < arg0 - 1 && arg2 - 1 > local81) {
						@Pc(110) Class202 local110 = Static267.aClass262_2.method5560(local14);
						if (local73 != 22 || Static323.aClass50_Sub1_1.aBoolean305 || local110.anInt5813 != 0 || local110.anInt5851 == 1 || local110.aBoolean539) {
							local28 = true;
							if (!local110.method4592()) {
								Static275.anInt5144++;
								local7 = false;
							}
						}
					}
				}
				local34 = local12.method2506();
				if (local34 == 0) {
					break;
				}
				local12.method2490();
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method4872() {
		Static429.method5476(Static327.aClass215_76);
		Static3.aClass4_Sub12_Sub1_5.method2551(0);
	}
}
