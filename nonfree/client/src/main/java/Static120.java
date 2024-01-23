import java.awt.event.ActionEvent;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
	public static int anInt2577;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	public static void method2206() {
		Static246.aClass46_33.method1077();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public static void method2207() {
		Static169.aClass46_29.method1079();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method2208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg6 && arg1 == arg3 && arg5 == arg4 && arg0 == arg8) {
			Static261.method4341(arg4, arg1, arg6, arg8, arg7);
			return;
		}
		@Pc(31) int local31 = arg6;
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = arg2 * 3;
		@Pc(41) int local41 = arg1 * 3;
		@Pc(45) int local45 = arg6 * 3;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(57) int local57 = arg0 * 3;
		@Pc(66) int local66 = local37 + arg4 - arg6 - local53;
		@Pc(76) int local76 = local45 + local53 - local37 - local37;
		@Pc(86) int local86 = local57 + local41 - local49 - local49;
		@Pc(96) int local96 = local49 + arg8 - arg1 - local57;
		@Pc(100) int local100 = local37 - local45;
		@Pc(105) int local105 = local49 - local41;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(118) int local118 = local107 * local107 >> 12;
			@Pc(124) int local124 = local118 * local107 >> 12;
			@Pc(128) int local128 = local66 * local124;
			@Pc(132) int local132 = local96 * local124;
			@Pc(136) int local136 = local76 * local118;
			@Pc(140) int local140 = local86 * local118;
			@Pc(144) int local144 = local105 * local107;
			@Pc(148) int local148 = local100 * local107;
			@Pc(160) int local160 = arg1 + (local132 + local140 + local144 >> 12);
			@Pc(171) int local171 = arg6 + (local148 + local128 + local136 >> 12);
			Static261.method4341(local171, local33, local31, local160, arg7);
			local33 = local160;
			local31 = local171;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/Object;Lclient!vl;I)V")
	public static void method2209(@OriginalArg(0) Object arg0, @OriginalArg(1) Class177 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg1.anEventQueue1.peekEvent() != null; local12++) {
			Static134.method2329(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method2210(@OriginalArg(1) Class2_Sub26 arg0) {
		label86: while (true) {
			if (arg0.anInt5328 < arg0.aByteArray72.length) {
				@Pc(9) boolean local9 = false;
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 0;
				if (arg0.method4261() == 1) {
					local9 = true;
					local13 = arg0.method4261();
					local11 = arg0.method4261();
				}
				@Pc(33) int local33 = arg0.method4261();
				@Pc(37) int local37 = arg0.method4261();
				@Pc(44) int local44 = local33 * 64 - Static115.anInt2461;
				@Pc(54) int local54 = Static239.anInt4870 + Static52.anInt1205 - local37 * 64 - 1;
				@Pc(91) byte local91;
				@Pc(76) int local76;
				if (local44 >= 0 && local54 - 63 >= 0 && Static142.anInt3081 > local44 + 63 && local54 < Static52.anInt1205) {
					local76 = local44 >> 6;
					@Pc(115) int local115 = local54 >> 6;
					@Pc(117) int local117 = 0;
					while (true) {
						if (local117 >= 64) {
							continue label86;
						}
						for (@Pc(124) int local124 = 0; local124 < 64; local124++) {
							if (!local9 || local13 * 8 <= local117 && local117 < local13 * 8 + 8 && local124 >= local11 * 8 && local124 < local11 * 8 + 8) {
								local91 = arg0.method4220();
								if (local91 != 0) {
									if (Static294.aByteArrayArrayArray16[local76][local115] == null) {
										Static294.aByteArrayArrayArray16[local76][local115] = new byte[4096];
									}
									Static294.aByteArrayArrayArray16[local76][local115][(63 - local124 << 6) + local117] = local91;
									@Pc(207) byte local207 = arg0.method4220();
									if (Static59.aByteArrayArrayArray4[local76][local115] == null) {
										Static59.aByteArrayArrayArray4[local76][local115] = new byte[4096];
									}
									Static59.aByteArrayArrayArray4[local76][local115][local117 + (63 - local124 << 6)] = local207;
								}
							}
						}
						local117++;
					}
				}
				local76 = 0;
				while (true) {
					if ((local9 ? 64 : 4096) <= local76) {
						continue label86;
					}
					local91 = arg0.method4220();
					if (local91 != 0) {
						arg0.anInt5328++;
					}
					local76++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ii;ILclient!fk;)Lclient!fn;")
	public static Class2_Sub12 method2211(@OriginalArg(0) Class79 arg0, @OriginalArg(2) Class57 arg1) {
		@Pc(24) long local24 = ((long) arg1.anInt1612 << 32) + ((long) arg1.anInt1616 << 56) - (long) (-arg1.anInt1609 + -(arg1.anInt1606 + 1 << 16));
		@Pc(34) Class2_Sub12 local34 = (Class2_Sub12) arg0.method2002(local24);
		if (local34 == null) {
			local34 = new Class2_Sub12(arg1.anInt1606, (float) arg1.anInt1609, true, false, arg1.anInt1612);
			arg0.method1994(local24, local34);
		}
		return local34;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method2212(@OriginalArg(0) long arg0) {
		Static232.aCalendar1.setTime(new Date(arg0));
		@Pc(9) int local9 = Static232.aCalendar1.get(7);
		@Pc(21) int local21 = Static232.aCalendar1.get(5);
		@Pc(25) int local25 = Static232.aCalendar1.get(2);
		@Pc(29) int local29 = Static232.aCalendar1.get(1);
		@Pc(33) int local33 = Static232.aCalendar1.get(11);
		@Pc(37) int local37 = Static232.aCalendar1.get(12);
		@Pc(41) int local41 = Static232.aCalendar1.get(13);
		return Static221.aStringArray25[local9 - 1] + ", " + local21 / 10 + local21 % 10 + "-" + Static141.aStringArray12[local25] + "-" + local29 + " " + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
	public static void method2213(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static121.aBoolean198) {
			Static121.aBoolean198 = arg0;
			Static102.method1925();
		}
	}
}
