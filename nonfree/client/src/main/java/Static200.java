import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!ia;")
	public static Class134 aClass134_2;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
	public static final int[] anIntArray315 = new int[8];

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
	public static final int[] anIntArray316 = new int[64];

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_58 = new Class252(61, 3);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!qa;Lclient!ra;ZZII)V")
	public static void method3758(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) Class36 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static242.aClass104_19.method7716((Static70.anInt1753 - Static242.aClass104_19.EA()) / 2, (Static508.anInt8910 - Static242.aClass104_19.ma()) / 2);
			Static322.aClass104_22.method7716((Static70.anInt1753 - Static322.aClass104_22.EA()) / 2, 18);
		}
		@Pc(31) String local31 = "";
		if (Static332.aClass250_4 == Static71.aClass250_1) {
			local31 = Static105.aClass45_38.method1474(Static544.anInt7853);
		} else if (Static332.aClass250_4 == Static116.aClass250_2) {
			local31 = Static434.aClass45_114.method1474(Static544.anInt7853);
		}
		arg2.method7948(local31, -1, Static508.anInt8910 / 2 - 26, arg4, Static70.anInt1753 / 2);
		@Pc(69) int local69 = Static508.anInt8910 / 2 - 18;
		arg1.method7181(Static70.anInt1753 / 2 - 152, local69, 304, 34, arg5, 0);
		arg1.method7181(Static70.anInt1753 / 2 - 151, local69 + 1, 302, 32, 0, 0);
		arg1.f(Static70.anInt1753 / 2 - 150, local69 + 2, Static439.anInt7698 * 3, 30, arg0, 0);
		arg1.f(Static70.anInt1753 / 2 + Static439.anInt7698 * 3 - 150, local69 - -2, 300 - Static439.anInt7698 * 3, 30, 0, 0);
		arg2.method7948(Static439.aString187, -1, Static508.anInt8910 / 2 + 4, arg4, Static70.anInt1753 / 2);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V")
	public static void method3759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static316.method5451(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg4;
		@Pc(27) int local27 = -arg4;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static143.anIntArrayArray33[arg0];
		@Pc(45) int local45 = arg5 - local15;
		@Pc(49) int local49 = local15 + arg5;
		Static313.method5430(local45, arg3, local40, arg5 - arg4);
		Static313.method5430(local49, arg2, local40, local45);
		Static313.method5430(arg4 + arg5, arg3, local40, local49);
		while (local24 > local10) {
			local34 += 2;
			local36 += 2;
			local27 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				Static109.anIntArray179[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(128) int[] local128;
			@Pc(135) int[] local135;
			@Pc(139) int local139;
			@Pc(144) int local144;
			@Pc(148) int local148;
			@Pc(152) int local152;
			@Pc(156) int local156;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local24 < local15) {
					local128 = Static143.anIntArrayArray33[local24 + arg0];
					local135 = Static143.anIntArrayArray33[arg0 - local24];
					local139 = Static109.anIntArray179[local24];
					local144 = arg5 + local10;
					local148 = arg5 - local10;
					local152 = local139 + arg5;
					local156 = arg5 - local139;
					Static313.method5430(local156, arg3, local128, local148);
					Static313.method5430(local152, arg2, local128, local156);
					Static313.method5430(local144, arg3, local128, local152);
					Static313.method5430(local156, arg3, local135, local148);
					Static313.method5430(local152, arg2, local135, local156);
					Static313.method5430(local144, arg3, local135, local152);
				} else {
					local128 = Static143.anIntArrayArray33[local24 + arg0];
					local135 = Static143.anIntArrayArray33[arg0 - local24];
					local139 = arg5 + local10;
					local144 = arg5 - local10;
					Static313.method5430(local139, arg3, local128, local144);
					Static313.method5430(local139, arg3, local135, local144);
				}
			}
			local128 = Static143.anIntArrayArray33[local10 + arg0];
			local135 = Static143.anIntArrayArray33[arg0 - local10];
			local139 = arg5 + local24;
			local144 = arg5 - local24;
			if (local10 >= local15) {
				Static313.method5430(local139, arg3, local128, local144);
				Static313.method5430(local139, arg3, local135, local144);
			} else {
				local148 = local29 < local10 ? Static109.anIntArray179[local10] : local29;
				local152 = local148 + arg5;
				local156 = arg5 - local148;
				Static313.method5430(local156, arg3, local128, local144);
				Static313.method5430(local152, arg2, local128, local156);
				Static313.method5430(local139, arg3, local128, local152);
				Static313.method5430(local156, arg3, local135, local144);
				Static313.method5430(local152, arg2, local135, local156);
				Static313.method5430(local139, arg3, local135, local152);
			}
		}
	}
}
