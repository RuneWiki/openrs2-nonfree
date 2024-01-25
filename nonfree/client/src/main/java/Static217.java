import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
	public static int anInt4351;

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
	public static int anInt4363;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
	public static int anInt4357 = 0;

	@OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
	public static int anInt4366 = 0;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public static void method3369() {
		Static5.aClass1_Sub3_Sub1_1.method320();
		@Pc(11) int local11 = Static5.aClass1_Sub3_Sub1_1.method321(8);
		@Pc(20) int local20;
		if (Static197.anInt4078 > local11) {
			for (local20 = local11; local20 < Static197.anInt4078; local20++) {
				Static362.anIntArray614[Static48.anInt1182++] = Static415.anIntArray701[local20];
			}
		}
		if (local11 > Static197.anInt4078) {
			throw new RuntimeException("gnpov1");
		}
		Static197.anInt4078 = 0;
		for (local20 = 0; local20 < local11; local20++) {
			@Pc(65) int local65 = Static415.anIntArray701[local20];
			@Pc(73) Class30_Sub1_Sub1_Sub1 local73 = ((Class1_Sub27) Static24.aClass38_3.method765((long) local65)).aClass30_Sub1_Sub1_Sub1_2;
			@Pc(78) int local78 = Static5.aClass1_Sub3_Sub1_1.method321(1);
			if (local78 == 0) {
				Static415.anIntArray701[Static197.anInt4078++] = local65;
				local73.anInt1239 = Static187.anInt3975;
			} else {
				@Pc(99) int local99 = Static5.aClass1_Sub3_Sub1_1.method321(2);
				if (local99 == 0) {
					Static415.anIntArray701[Static197.anInt4078++] = local65;
					local73.anInt1239 = Static187.anInt3975;
					Static96.anIntArray253[Static424.anInt7540++] = local65;
				} else {
					@Pc(145) int local145;
					@Pc(155) int local155;
					if (local99 == 1) {
						Static415.anIntArray701[Static197.anInt4078++] = local65;
						local73.anInt1239 = Static187.anInt3975;
						local145 = Static5.aClass1_Sub3_Sub1_1.method321(3);
						local73.method672(1, local145);
						local155 = Static5.aClass1_Sub3_Sub1_1.method321(1);
						if (local155 == 1) {
							Static96.anIntArray253[Static424.anInt7540++] = local65;
						}
					} else if (local99 == 2) {
						Static415.anIntArray701[Static197.anInt4078++] = local65;
						local73.anInt1239 = Static187.anInt3975;
						if (Static5.aClass1_Sub3_Sub1_1.method321(1) == 1) {
							local145 = Static5.aClass1_Sub3_Sub1_1.method321(3);
							local73.method672(2, local145);
							local155 = Static5.aClass1_Sub3_Sub1_1.method321(3);
							local73.method672(2, local155);
						} else {
							local145 = Static5.aClass1_Sub3_Sub1_1.method321(3);
							local73.method672(0, local145);
						}
						local145 = Static5.aClass1_Sub3_Sub1_1.method321(1);
						if (local145 == 1) {
							Static96.anIntArray253[Static424.anInt7540++] = local65;
						}
					} else if (local99 == 3) {
						Static362.anIntArray614[Static48.anInt1182++] = local65;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZIII)V")
	public static void method3382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg1 - arg4;
		@Pc(13) int local13 = arg2 - arg0;
		if (local13 == 0) {
			if (local8 != 0) {
				Static204.method3270(arg1, arg0, arg3, arg4);
			}
		} else if (local8 == 0) {
			Static108.method1768(arg4, arg0, arg2, arg3);
		} else {
			if (local8 < 0) {
				local8 = -local8;
			}
			if (local13 < 0) {
				local13 = -local13;
			}
			@Pc(60) boolean local60 = local13 < local8;
			@Pc(64) int local64;
			@Pc(68) int local68;
			if (local60) {
				local64 = arg0;
				arg0 = arg4;
				local68 = arg2;
				arg4 = local64;
				arg2 = arg1;
				arg1 = local68;
			}
			if (arg0 > arg2) {
				local64 = arg0;
				local68 = arg4;
				arg0 = arg2;
				arg4 = arg1;
				arg2 = local64;
				arg1 = local68;
			}
			local64 = arg4;
			local68 = arg2 - arg0;
			@Pc(104) int local104 = arg1 - arg4;
			@Pc(109) int local109 = -(local68 >> 1);
			@Pc(116) int local116 = arg1 > arg4 ? 1 : -1;
			if (local104 < 0) {
				local104 = -local104;
			}
			@Pc(130) int local130;
			if (local60) {
				for (local130 = arg0; local130 <= arg2; local130++) {
					Static60.anIntArrayArray14[local130][local64] = arg3;
					local109 += local104;
					if (local109 > 0) {
						local64 += local116;
						local109 -= local68;
					}
				}
			} else {
				for (local130 = arg0; local130 <= arg2; local130++) {
					local109 += local104;
					Static60.anIntArrayArray14[local64][local130] = arg3;
					if (local109 > 0) {
						local109 -= local68;
						local64 += local116;
					}
				}
			}
		}
	}
}
