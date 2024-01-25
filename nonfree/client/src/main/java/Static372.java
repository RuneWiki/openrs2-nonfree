import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
	public static int anInt1537;

	@OriginalMember(owner = "client!sr", name = "E", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_60 = new Class184(24, 4);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!mv;[I[I[IB)V")
	public static void method1265(@OriginalArg(0) Class1_Sub3_Sub3_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(9) int local9 = 0; local9 < arg3.length; local9++) {
			@Pc(14) int local14 = arg3[local9];
			@Pc(18) int local18 = arg2[local9];
			@Pc(22) int local22 = arg1[local9];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && arg0.aClass34Array3.length > local24) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass34Array3[local24] = null;
					} else {
						@Pc(41) Class96 local41 = Static196.aClass30_2.method942(local14);
						@Pc(44) int local44 = local41.anInt3320;
						@Pc(49) Class34 local49 = arg0.aClass34Array3[local24];
						if (local49 != null) {
							if (local14 == local49.anInt1238) {
								if (local44 == 0) {
									local49 = arg0.aClass34Array3[local24] = null;
								} else if (local44 == 1) {
									local49.anInt1234 = 0;
									local49.anInt1235 = 0;
									local49.anInt1232 = local22;
									local49.anInt1239 = 1;
									local49.anInt1230 = 0;
									Static86.method1483(arg0.anInt6053, 0, arg0.aByte77, arg0.anInt6055, local41, arg0 == Static113.aClass1_Sub3_Sub3_Sub1_4);
								} else if (local44 == 2) {
									local49.anInt1235 = 0;
								}
							} else if (local41.anInt3323 >= Static196.aClass30_2.method942(local49.anInt1238).anInt3323) {
								local49 = arg0.aClass34Array3[local24] = null;
							}
						}
						if (local49 == null) {
							local49 = arg0.aClass34Array3[local24] = new Class34();
							local49.anInt1230 = 0;
							local49.anInt1239 = 1;
							local49.anInt1235 = 0;
							local49.anInt1234 = 0;
							local49.anInt1232 = local22;
							local49.anInt1238 = local14;
							Static86.method1483(arg0.anInt6053, 0, arg0.aByte77, arg0.anInt6055, local41, Static113.aClass1_Sub3_Sub3_Sub1_4 == arg0);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!oh;")
	public static Class1_Sub3 method1267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class217 local7 = Static151.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class182 local14 = local7.aClass182_3; local14 != null; local14 = local14.aClass182_2) {
			@Pc(18) Class1_Sub3 local18 = local14.aClass1_Sub3_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort181 == arg1 && local18.aShort179 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(Z)V")
	public static void method1268() {
		Static247.aClass22_11 = null;
		Static352.aClass22Array20 = null;
		Static8.aClass22Array3 = null;
		Static106.aClass22Array7 = null;
		Static240.aClass22Array17 = null;
		Static183.aClass65_3 = null;
		Static277.aClass65_5 = null;
		Static402.aClass22Array23 = null;
		Static168.aClass22Array11 = null;
		Static55.aClass22_2 = null;
		Static63.aClass22Array22 = null;
		Static267.aClass22Array18 = null;
		Static96.aClass22Array5 = null;
		Static399.aClass65_7 = null;
		Static198.aClass22Array13 = null;
		Static431.aClass22Array26 = null;
		Static426.aClass22Array25 = null;
		Static169.aClass22Array12 = null;
	}
}
