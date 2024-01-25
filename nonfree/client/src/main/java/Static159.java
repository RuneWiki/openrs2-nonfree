import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
	public static int anInt5733;

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_115 = new Class92(63, 3);

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "J")
	public static long aLong168 = 0L;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!ts;II)V")
	public static void method4786(@OriginalArg(0) int arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class22 local8 = arg1.method5734(Static126.aClass66_5);
		if (local8 == null) {
			return;
		}
		Static126.aClass66_5.method5044(arg2, arg0, arg2 + arg1.anInt6898, arg0 - -arg1.anInt6899);
		if (Static420.anInt7505 >= 3) {
			Static126.aClass66_5.method5005(local8, arg2, arg0);
		} else {
			Static41.aClass87_4.method6570((float) arg2 + (float) arg1.anInt6898 / 2.0F, (float) arg1.anInt6899 / 2.0F + (float) arg0, ((int) -Static265.aFloat51 & 0x3FFF) << 2, local8, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIII)V")
	public static void method4801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg0;
		@Pc(15) int local15 = arg2 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static326.method4705(arg1, arg3, arg0, arg4);
			}
		} else if (local10 == 0) {
			Static226.method4724(arg0, arg4, arg2, arg3);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(70) boolean local70 = local15 < local10;
			@Pc(74) int local74;
			@Pc(78) int local78;
			if (local70) {
				local74 = arg3;
				arg3 = arg0;
				local78 = arg2;
				arg2 = arg1;
				arg0 = local74;
				arg1 = local78;
			}
			if (arg2 < arg3) {
				local74 = arg3;
				local78 = arg0;
				arg3 = arg2;
				arg0 = arg1;
				arg2 = local74;
				arg1 = local78;
			}
			local74 = arg0;
			local78 = arg2 - arg3;
			@Pc(114) int local114 = arg1 - arg0;
			@Pc(119) int local119 = -(local78 >> 1);
			if (local114 < 0) {
				local114 = -local114;
			}
			@Pc(131) int local131 = arg0 < arg1 ? 1 : -1;
			@Pc(135) int local135;
			if (local70) {
				for (local135 = arg3; local135 <= arg2; local135++) {
					Static62.anIntArrayArray7[local135][local74] = arg4;
					local119 += local114;
					if (local119 > 0) {
						local119 -= local78;
						local74 += local131;
					}
				}
			} else {
				for (local135 = arg3; local135 <= arg2; local135++) {
					Static62.anIntArrayArray7[local74][local135] = arg4;
					local119 += local114;
					if (local119 > 0) {
						local74 += local131;
						local119 -= local78;
					}
				}
			}
		}
	}
}
