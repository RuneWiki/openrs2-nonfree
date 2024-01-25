import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "[I")
	public static final int[] anIntArray274 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!rp;Ljava/lang/Object;I)V")
	public static void method4294(@OriginalArg(0) Class298 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < 50 && arg0.anEventQueue1.peekEvent() != null; local9++) {
			Static143.method2414(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ht;Z)V")
	public static void method4295(@OriginalArg(0) Class9_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort126; local2 <= arg0.aShort127; local2++) {
			for (@Pc(6) int local6 = arg0.aShort124; local6 <= arg0.aShort125; local6++) {
				@Pc(16) Class351 local16 = Static567.aClass351ArrayArrayArray4[arg0.aByte127][local2][local6];
				if (local16 != null) {
					@Pc(21) Class105 local21 = local16.aClass105_3;
					@Pc(23) Class105 local23 = null;
					while (local21 != null) {
						if (local21.aClass9_Sub2_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass105_3 = local21.aClass105_1;
							} else {
								local23.aClass105_1 = local21.aClass105_1;
							}
							local21.method2553();
							break;
						}
						local23 = local21;
						local21 = local21.aClass105_1;
					}
				}
			}
		}
		if (!arg1) {
			Static214.method3762(arg0);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg7 && arg2 == arg4 && arg5 == arg6 && arg8 == arg0) {
			Static68.method1191(arg7, arg3, arg4, arg5, arg8);
			return;
		}
		@Pc(35) int local35 = arg7;
		@Pc(37) int local37 = arg4;
		@Pc(41) int local41 = arg7 * 3;
		@Pc(45) int local45 = arg4 * 3;
		@Pc(49) int local49 = arg1 * 3;
		@Pc(53) int local53 = arg2 * 3;
		@Pc(57) int local57 = arg6 * 3;
		@Pc(61) int local61 = arg0 * 3;
		@Pc(71) int local71 = arg5 + local49 - arg7 - local57;
		@Pc(80) int local80 = arg8 + local53 - local61 - arg4;
		@Pc(91) int local91 = local57 + local41 - local49 - local49;
		@Pc(100) int local100 = local45 + local61 - local53 - local53;
		@Pc(104) int local104 = local49 - local41;
		@Pc(109) int local109 = local53 - local45;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local119 * local111 >> 12;
			@Pc(129) int local129 = local71 * local125;
			@Pc(133) int local133 = local125 * local80;
			@Pc(137) int local137 = local91 * local119;
			@Pc(141) int local141 = local100 * local119;
			@Pc(145) int local145 = local111 * local104;
			@Pc(149) int local149 = local109 * local111;
			@Pc(159) int local159 = (local145 + local137 + local129 >> 12) + arg7;
			@Pc(170) int local170 = arg4 + (local133 + local141 + local149 >> 12);
			Static68.method1191(local35, arg3, local37, local159, local170);
			local37 = local170;
			local35 = local159;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)Z")
	public static boolean method4303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static27.method374(arg1, arg0) || Static282.method4597(arg0, arg1);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public static void method4305(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static598.aFloat67 < Static598.aFloat68) {
			Static598.aFloat67 = (float) ((double) Static598.aFloat67 + (double) Static598.aFloat67 / 30.0D);
			if (Static598.aFloat67 > Static598.aFloat68) {
				Static598.aFloat67 = Static598.aFloat68;
			}
			Static510.method7387();
			Static598.anInt2987 = (int) Static598.aFloat67 >> 1;
			Static598.aByteArrayArrayArray8 = Static517.method7519(Static598.anInt2987);
		} else if (Static598.aFloat68 < Static598.aFloat67) {
			Static598.aFloat67 = (float) ((double) Static598.aFloat67 - (double) Static598.aFloat67 / 30.0D);
			if (Static598.aFloat67 < Static598.aFloat68) {
				Static598.aFloat67 = Static598.aFloat68;
			}
			Static510.method7387();
			Static598.anInt2987 = (int) Static598.aFloat67 >> 1;
			Static598.aByteArrayArrayArray8 = Static517.method7519(Static598.anInt2987);
		}
		if (Static433.anInt7555 != -1 && Static108.anInt2182 != -1) {
			@Pc(78) int local78 = Static433.anInt7555 - Static122.anInt2649;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(95) int local95 = Static108.anInt2182 - Static168.anInt3275;
			Static122.anInt2649 += local78;
			if (local95 < 2 || local95 > 2) {
				local95 /= 8;
			}
			if (local78 == 0 && local95 == 0) {
				Static108.anInt2182 = -1;
				Static433.anInt7555 = -1;
			}
			Static168.anInt3275 += local95;
			Static510.method7387();
		}
		if (Static476.anInt8998 > 0) {
			Static156.anInt3180--;
			if (Static156.anInt3180 == 0) {
				Static156.anInt3180 = 100;
				Static476.anInt8998--;
			}
		} else {
			Static464.anInt7910 = -1;
			Static475.anInt8130 = -1;
		}
		if (!Static406.aBoolean515 || Static181.aClass216_30 == null) {
			return;
		}
		for (@Pc(170) Class3_Sub49 local170 = (Class3_Sub49) Static181.aClass216_30.method5457(); local170 != null; local170 = (Class3_Sub49) Static181.aClass216_30.method5458()) {
			@Pc(179) Class179 local179 = Static598.aClass154_2.method3947(local170.aClass3_Sub47_1.anInt9169);
			if (local170.method8073(arg1, arg0)) {
				if (local179.aStringArray40 != null) {
					if (local179.aStringArray40[4] != null) {
						Static139.method2380(true, -1, false, -1, local179.aString43, (long) local170.aClass3_Sub47_1.anInt9169, false, 0, (long) local170.aClass3_Sub47_1.anInt9169, local179.anInt5334, 1011, local179.aStringArray40[4]);
					}
					if (local179.aStringArray40[3] != null) {
						Static139.method2380(true, -1, false, -1, local179.aString43, (long) local170.aClass3_Sub47_1.anInt9169, false, 0, (long) local170.aClass3_Sub47_1.anInt9169, local179.anInt5334, 1004, local179.aStringArray40[3]);
					}
					if (local179.aStringArray40[2] != null) {
						Static139.method2380(true, -1, false, -1, local179.aString43, (long) local170.aClass3_Sub47_1.anInt9169, false, 0, (long) local170.aClass3_Sub47_1.anInt9169, local179.anInt5334, 1008, local179.aStringArray40[2]);
					}
					if (local179.aStringArray40[1] != null) {
						Static139.method2380(true, -1, false, -1, local179.aString43, (long) local170.aClass3_Sub47_1.anInt9169, false, 0, (long) local170.aClass3_Sub47_1.anInt9169, local179.anInt5334, 1010, local179.aStringArray40[1]);
					}
					if (local179.aStringArray40[0] != null) {
						Static139.method2380(true, -1, false, -1, local179.aString43, (long) local170.aClass3_Sub47_1.anInt9169, false, 0, (long) local170.aClass3_Sub47_1.anInt9169, local179.anInt5334, 1012, local179.aStringArray40[0]);
					}
				}
				if (!local170.aClass3_Sub47_1.aBoolean678) {
					local170.aClass3_Sub47_1.aBoolean678 = true;
					Static400.method6281(Static163.aClass379_4, local170.aClass3_Sub47_1.anInt9169, local179.anInt5334);
				}
				if (local170.aClass3_Sub47_1.aBoolean678) {
					Static400.method6281(Static9.aClass379_1, local170.aClass3_Sub47_1.anInt9169, local179.anInt5334);
				}
			} else if (local170.aClass3_Sub47_1.aBoolean678) {
				local170.aClass3_Sub47_1.aBoolean678 = false;
				Static400.method6281(Static543.aClass379_10, local170.aClass3_Sub47_1.anInt9169, local179.anInt5334);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method4306(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class371 local9 = Static91.aClass371Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static91.aClass371Array1[local11] = Static91.aClass371Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class371(arg1, arg2, arg5, arg0, arg6, arg7, arg3, arg4);
		} else {
			local9.method8485(arg7, arg2, arg4, arg6, arg0, arg5, arg1, arg3);
		}
		Static91.aClass371Array1[0] = local9;
		Static372.anInt6808 = Static303.anInt8405;
		Static179.anInt3439++;
	}
}
