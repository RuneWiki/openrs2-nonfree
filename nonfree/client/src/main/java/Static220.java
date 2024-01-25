import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!iga", name = "H", descriptor = "Lclient!bi;")
	public static Class31 aClass31_49;

	@OriginalMember(owner = "client!iga", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIILclient!no;IB)Lclient!mn;")
	public static Class114_Sub1_Sub1 method3803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class66_Sub3 arg3, @OriginalArg(4) int arg4) {
		if (arg3.aBoolean477 || Static422.method6062(arg2) && Static422.method6062(arg0)) {
			return new Class114_Sub1_Sub1(arg3, 3553, arg4, arg1, arg2, arg0, true);
		} else if (arg3.aBoolean489) {
			return new Class114_Sub1_Sub1(arg3, 34037, arg4, arg1, arg2, arg0, true);
		} else {
			return new Class114_Sub1_Sub1(arg3, arg4, arg1, arg2, arg0, Static514.method7261(arg2), Static514.method7261(arg0), true);
		}
	}

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "(B)V")
	public static void method3805() {
		for (@Pc(10) Class4_Sub7_Sub12 local10 = (Class4_Sub7_Sub12) Static11.aClass124_1.method3267(); local10 != null; local10 = (Class4_Sub7_Sub12) Static11.aClass124_1.method3273()) {
			@Pc(17) Class10_Sub1_Sub3 local17 = local10.aClass10_Sub1_Sub3_1;
			if (Static237.anInt7561 > local17.anInt6197) {
				local10.method8013();
				local17.method5253();
			} else if (local17.anInt6202 <= Static237.anInt7561) {
				if (local17.anInt6182 > 0) {
					@Pc(45) Class4_Sub50 local45 = (Class4_Sub50) Static106.aClass183_8.method4289((long) (local17.anInt6182 - 1));
					if (local45 != null) {
						@Pc(50) Class10_Sub1_Sub2_Sub1 local50 = local45.aClass10_Sub1_Sub2_Sub1_1;
						if (local50.anInt8934 >= 0 && Static38.anInt740 * 512 > local50.anInt8934 && local50.anInt8929 >= 0 && local50.anInt8929 < Static38.anInt741 * 512) {
							local17.method5248(Static237.anInt7561, local50.anInt8934, local50.anInt8929, Static160.method3164(local50.anInt8934, local17.aByte101, local50.anInt8929) - local17.anInt6184);
						}
					}
				}
				if (local17.anInt6182 < 0) {
					@Pc(110) int local110 = -local17.anInt6182 - 1;
					@Pc(121) Class10_Sub1_Sub2_Sub2 local121;
					if (Static416.anInt7186 == local110) {
						local121 = Static129.aClass10_Sub1_Sub2_Sub2_1;
					} else {
						local121 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local110];
					}
					if (local121 != null && local121.anInt8934 >= 0 && Static38.anInt740 * 512 > local121.anInt8934 && local121.anInt8929 >= 0 && local121.anInt8929 < Static38.anInt741 * 512) {
						local17.method5248(Static237.anInt7561, local121.anInt8934, local121.anInt8929, Static160.method3164(local121.anInt8934, local17.aByte101, local121.anInt8929) - local17.anInt6184);
					}
				}
				local17.method5254(Static426.anInt7338);
				Static314.method7738(local17, true);
			}
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(BLclient!bi;)V")
	public static void method3806(@OriginalArg(1) Class31 arg0) {
		Static37.anInt736 = 0;
		Static386.anInt6807 = 0;
		Static471.aClass8_7 = new Class8();
		Static533.aClass26_Sub1_Sub1_Sub1Array2 = new Class26_Sub1_Sub1_Sub1[1024];
		Static181.aClass26_Sub3Array1 = new Class26_Sub3[Static416.anIntArray597[Static400.anInt6962] + 1];
		Static69.anInt1428 = 0;
		Static478.anInt8049 = 0;
		Static485.method6740(arg0);
		Static10.method265(arg0);
	}
}
