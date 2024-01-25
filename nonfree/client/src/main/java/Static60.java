import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!co", name = "L", descriptor = "Lclient!tj;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_51 = new Class107(96, 8);

	@OriginalMember(owner = "client!co", name = "J", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_9 = new Class179(37, 3);

	@OriginalMember(owner = "client!co", name = "K", descriptor = "Lclient!bt;")
	public static final Class29 aClass29_1 = new Class29(128);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IJ)V")
	public static void method1281(@OriginalArg(1) long arg0) {
		@Pc(14) int local14 = Static130.anInt2614 + Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300;
		@Pc(19) int local19 = Static247.anInt7109 + Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298;
		if (Static3.anInt108 - local14 < -500 || Static3.anInt108 - local14 > 500 || Static299.anInt698 - local19 < -500 || Static299.anInt698 - local19 > 500) {
			Static3.anInt108 = local14;
			Static299.anInt698 = local19;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (Static3.anInt108 != local14) {
			local62 = local14 - Static3.anInt108;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local62 < local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local70 < local62) {
				local70 = local62;
			}
			Static3.anInt108 += local70;
		}
		if (!Static38.aClass135_Sub1_1.aBoolean362) {
			Static142.aFloat89 += (float) arg0 * Static245.aFloat66 / 6.0F;
			Static201.aFloat56 += (float) arg0 * Static316.aFloat76 / 6.0F;
		}
		if (Static299.anInt698 != local19) {
			local62 = local19 - Static299.anInt698;
			local70 = (int) ((long) local62 * arg0 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local62 < local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local70 < local62) {
				local70 = local62;
			}
			Static299.anInt698 += local70;
		}
		Static363.method2948();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIB)V")
	public static void method1282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static193.method2984(Static246.aClass179_61);
		Static92.aClass1_Sub5_Sub1_1.method5375(arg1);
		Static92.aClass1_Sub5_Sub1_1.method5373(arg0);
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(III)Z")
	public static boolean method1283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static199.method3241(arg0, arg1) & Static285.method4144(arg0, arg1);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ya;Lclient!or;IIIII)V")
	public static void method1285(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static68.anInt1553) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static132.anInt2639) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static87.anInt1875 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class80 local62 = client.lb[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static105.aClass149Array1[local17].l(local23, local32) + Static105.aClass149Array1[local17].l(local23 + 1, local32) + Static105.aClass149Array1[local17].l(local23, local32 + 1) + Static105.aClass149Array1[local17].l(local23 + 1, local32 + 1)) / 4 - (Static105.aClass149Array1[arg2].l(arg3, arg4) + Static105.aClass149Array1[arg2].l(arg3 + 1, arg4) + Static105.aClass149Array1[arg2].l(arg3, arg4 + 1) + Static105.aClass149Array1[arg2].l(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class31_Sub3 local143 = local62.aClass31_Sub3_3;
									@Pc(146) Class31_Sub3 local146 = local62.aClass31_Sub3_2;
									if (local143 != null && local143.method5971()) {
										arg1.method5972((local32 - arg4) * Static186.anInt3374 + (1 - arg6) * Static69.anInt1593, arg0, (local23 - arg3) * Static186.anInt3374 + (1 - arg5) * Static69.anInt1593, local143, local140, local1);
									}
									if (local146 != null && local146.method5971()) {
										arg1.method5972((local32 - arg4) * Static186.anInt3374 + (1 - arg6) * Static69.anInt1593, arg0, (local23 - arg3) * Static186.anInt3374 + (1 - arg5) * Static69.anInt1593, local146, local140, local1);
									}
									for (@Pc(219) Class22 local219 = local62.aClass22_2; local219 != null; local219 = local219.aClass22_1) {
										@Pc(223) Class31_Sub2 local223 = local219.aClass31_Sub2_1;
										if (local223 != null && local223.method5971() && (local23 == local223.aShort103 || local23 == local3) && (local32 == local223.aShort102 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort100 + 1 - local223.aShort103;
											@Pc(260) int local260 = local223.aShort101 + 1 - local223.aShort102;
											arg1.method5972((local223.aShort102 - arg4) * Static186.anInt3374 + (local260 - arg6) * Static69.anInt1593, arg0, (local223.aShort103 - arg3) * Static186.anInt3374 + (local252 - arg5) * Static69.anInt1593, local223, local140, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
