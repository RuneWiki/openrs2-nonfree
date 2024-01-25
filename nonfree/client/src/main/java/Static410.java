import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!um", name = "o", descriptor = "[Lclient!o;")
	public static Class13[] aClass13Array21;

	@OriginalMember(owner = "client!um", name = "hb", descriptor = "Lclient!o;")
	public static Class13 aClass13_23;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < 1 || arg1 < 1 || Static166.anInt2852 - 2 < arg3 || arg1 > Static426.anInt6923 - 2) {
			return;
		}
		@Pc(33) int local33 = arg0;
		if (arg0 < 3 && Static372.method4855(arg3, arg1)) {
			local33 = arg0 + 1;
		}
		if (!Static2.aClass148_Sub1_1.method3047(Static288.anInt4743) && !Static375.method4874(local33, Static280.anInt4592, arg1, arg3)) {
			return;
		}
		if (Static309.aClass270ArrayArrayArray3 == null) {
			return;
		}
		Static318.aClass118_Sub1_2.method4313(arg2, arg1, Static361.aClass71Array1[arg0], arg0, arg3, Static82.aClass163_1);
		if (arg5 < 0) {
			return;
		}
		@Pc(79) boolean local79 = Static2.aClass148_Sub1_1.aBoolean254;
		Static2.aClass148_Sub1_1.aBoolean254 = true;
		Static318.aClass118_Sub1_2.method4315(arg7, arg6, arg0, local33, arg3, arg4, arg5, Static82.aClass163_1, arg1, Static361.aClass71Array1[arg0]);
		Static2.aClass148_Sub1_1.aBoolean254 = local79;
		return;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!s;")
	public static Class2_Sub30 method5196(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(19) Class local19 = Class.forName("Class2_Sub30_Sub2");
			@Pc(23) Class2_Sub30 local23 = (Class2_Sub30) local19.getDeclaredConstructor().newInstance();
			local23.method4495(arg0);
			return local23;
		} catch (@Pc(30) Throwable local30) {
			@Pc(34) Class2_Sub30_Sub1 local34 = new Class2_Sub30_Sub1();
			local34.method4495(arg0);
			return local34;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public static void method5197() {
		for (@Pc(17) Class2_Sub5_Sub10 local17 = (Class2_Sub5_Sub10) Static330.aClass156_48.method3155(); local17 != null; local17 = (Class2_Sub5_Sub10) Static330.aClass156_48.method3150()) {
			@Pc(22) Class3_Sub4_Sub4 local22 = local17.aClass3_Sub4_Sub4_1;
			if (local22.anInt5885 < Static266.anInt4392) {
				local17.method5703();
				local22.method4608();
			} else if (Static266.anInt4392 >= local22.anInt5876) {
				if (local22.anInt5882 > 0) {
					@Pc(54) Class2_Sub28 local54 = (Class2_Sub28) Static49.aClass72_11.method1659((long) (local22.anInt5882 - 1));
					if (local54 != null) {
						@Pc(59) Class3_Sub4_Sub1_Sub1 local59 = local54.aClass3_Sub4_Sub1_Sub1_1;
						if (local59.anInt6833 >= 0 && Static166.anInt2852 * 128 > local59.anInt6833 && local59.anInt6835 >= 0 && local59.anInt6835 < Static426.anInt6923 * 128) {
							local22.method4607(local59.anInt6835, local59.anInt6833, Static302.method3973(local59.anInt6835, local59.anInt6833, local22.aByte91) - local22.anInt5869, Static266.anInt4392);
						}
					}
				}
				if (local22.anInt5882 < 0) {
					@Pc(108) int local108 = -local22.anInt5882 - 1;
					@Pc(113) Class3_Sub4_Sub1_Sub2 local113;
					if (Static201.anInt3383 == local108) {
						local113 = Static60.aClass3_Sub4_Sub1_Sub2_1;
					} else {
						local113 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local108];
					}
					if (local113 != null && local113.anInt6833 >= 0 && Static166.anInt2852 * 128 > local113.anInt6833 && local113.anInt6835 >= 0 && local113.anInt6835 < Static426.anInt6923 * 128) {
						local22.method4607(local113.anInt6835, local113.anInt6833, Static302.method3973(local113.anInt6835, local113.anInt6833, local22.aByte91) - local22.anInt5869, Static266.anInt4392);
					}
				}
				local22.method4605(Static233.anInt6983);
				Static249.method3169(local22, true);
			}
		}
	}
}
