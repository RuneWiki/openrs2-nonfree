import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
	public static int anInt4083;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_96 = new Class150(24, -1);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method3489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static152.method2792(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(32) int local32 = arg2;
		@Pc(35) int local35 = -arg2;
		@Pc(37) int local37 = local15;
		@Pc(40) int local40 = -local15;
		@Pc(42) int local42 = -1;
		@Pc(44) int local44 = -1;
		@Pc(48) int[] local48 = Static352.anIntArrayArray51[arg4];
		@Pc(53) int local53 = arg3 - local15;
		Static321.method5153(arg0, arg3 - arg2, local48, local53);
		@Pc(66) int local66 = arg3 + local15;
		Static321.method5153(arg5, local53, local48, local66);
		Static321.method5153(arg0, local66, local48, arg2 + arg3);
		while (local10 < local32) {
			local44 += 2;
			local42 += 2;
			local35 += local42;
			local40 += local44;
			if (local40 >= 0 && local37 >= 1) {
				Static442.anIntArray584[local37] = local10;
				local37--;
				local40 -= local37 << 1;
			}
			local10++;
			@Pc(136) int[] local136;
			@Pc(143) int[] local143;
			@Pc(147) int local147;
			@Pc(152) int local152;
			@Pc(192) int local192;
			@Pc(197) int local197;
			@Pc(202) int local202;
			if (local35 >= 0) {
				local32--;
				local35 -= local32 << 1;
				if (local15 <= local32) {
					local136 = Static352.anIntArrayArray51[arg4 + local32];
					local143 = Static352.anIntArrayArray51[arg4 - local32];
					local147 = local10 + arg3;
					local152 = arg3 - local10;
					Static321.method5153(arg0, local152, local136, local147);
					Static321.method5153(arg0, local152, local143, local147);
				} else {
					local136 = Static352.anIntArrayArray51[arg4 + local32];
					local143 = Static352.anIntArrayArray51[arg4 - local32];
					local147 = Static442.anIntArray584[local32];
					local152 = local10 + arg3;
					local192 = arg3 - local10;
					local197 = arg3 + local147;
					local202 = arg3 - local147;
					Static321.method5153(arg0, local192, local136, local202);
					Static321.method5153(arg5, local202, local136, local197);
					Static321.method5153(arg0, local197, local136, local152);
					Static321.method5153(arg0, local192, local143, local202);
					Static321.method5153(arg5, local202, local143, local197);
					Static321.method5153(arg0, local197, local143, local152);
				}
			}
			local136 = Static352.anIntArrayArray51[local10 + arg4];
			local143 = Static352.anIntArrayArray51[arg4 - local10];
			local147 = arg3 + local32;
			local152 = arg3 - local32;
			if (local10 < local15) {
				local192 = local37 < local10 ? Static442.anIntArray584[local10] : local37;
				local197 = arg3 + local192;
				local202 = arg3 - local192;
				Static321.method5153(arg0, local152, local136, local202);
				Static321.method5153(arg5, local202, local136, local197);
				Static321.method5153(arg0, local197, local136, local147);
				Static321.method5153(arg0, local152, local143, local202);
				Static321.method5153(arg5, local202, local143, local197);
				Static321.method5153(arg0, local197, local143, local147);
			} else {
				Static321.method5153(arg0, local152, local136, local147);
				Static321.method5153(arg0, local152, local143, local147);
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
	public static void method3490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			Static415.method5995(Static427.aClass236_70);
		}
		if (arg1 == 1) {
			Static415.method5995(Static20.aClass236_2);
		}
		Static164.aClass5_Sub3_Sub1_2.method4200(Static338.anInt6353 + arg2);
		Static164.aClass5_Sub3_Sub1_2.method4229(Static515.anInt3214 + arg0);
		Static164.aClass5_Sub3_Sub1_2.method4180(Static59.aClass18_1.method5977(82) ? 1 : 0);
		Static40.anInt919 = arg2;
		Static384.anInt7374 = arg0;
		Static415.aBoolean523 = false;
		Static111.method2212();
	}
}
