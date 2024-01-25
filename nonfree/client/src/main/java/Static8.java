import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
	public static int anInt187 = 0;

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "Lclient!fi;")
	public static Class76 aClass76_1 = null;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIILclient!za;III)V")
	public static void method142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class200 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) Interface2 local16 = (Interface2) Static73.method1080(arg0, arg5, arg1);
		@Pc(25) Class114 local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(53) int local53;
		if (local16 != null) {
			local25 = Static398.aClass256_4.method5782(local16.method6037());
			local31 = local16.method6034() & 0x3;
			local35 = local16.method6035();
			if (local25.anInt2986 == -1) {
				local53 = arg7;
				if (local25.anInt3001 > 0) {
					local53 = arg2;
				}
				if (local35 == 0 || local35 == 2) {
					if (local31 == 0) {
						arg4.method5824(local53, 4, arg3, arg6);
					} else if (local31 == 1) {
						arg4.method5815(local53, arg6, 4, arg3);
					} else if (local31 == 2) {
						arg4.method5824(local53, 4, arg3, arg6 + 3);
					} else if (local31 == 3) {
						arg4.method5815(local53, arg6, 4, arg3 + 3);
					}
				}
				if (local35 == 3) {
					if (local31 == 0) {
						arg4.method5856(arg3, local53, 1, 1, arg6);
					} else if (local31 == 1) {
						arg4.method5856(arg3, local53, 1, 1, arg6 + 3);
					} else if (local31 == 2) {
						arg4.method5856(arg3 + 3, local53, 1, 1, arg6 + 3);
					} else if (local31 == 3) {
						arg4.method5856(arg3 + 3, local53, 1, 1, arg6);
					}
				}
				if (local35 == 2) {
					if (local31 == 0) {
						arg4.method5815(local53, arg6, 4, arg3);
					} else if (local31 == 1) {
						arg4.method5824(local53, 4, arg3, arg6 + 3);
					} else if (local31 == 2) {
						arg4.method5815(local53, arg6, 4, arg3 + 3);
					} else if (local31 == 3) {
						arg4.method5824(local53, 4, arg3, arg6);
					}
				}
			} else {
				Static178.method4585(arg3, local25, local31, arg4, arg6);
			}
		}
		local16 = (Interface2) Static12.method194(arg0, arg5, arg1, bs.class);
		if (local16 != null) {
			local25 = Static398.aClass256_4.method5782(local16.method6037());
			local31 = local16.method6034() & 0x3;
			local35 = local16.method6035();
			if (local25.anInt2986 != -1) {
				Static178.method4585(arg3, local25, local31, arg4, arg6);
			} else if (local35 == 9) {
				local53 = -1118482;
				if (local25.anInt3001 > 0) {
					local53 = -1179648;
				}
				if (local31 == 0 || local31 == 2) {
					arg4.method5876(arg3, arg3 + 3, arg6 + 3, arg6, local53);
				} else {
					arg4.method5876(arg3 + 3, arg3, arg6 + 3, arg6, local53);
				}
			}
		}
		local16 = (Interface2) Static285.method3519(arg0, arg5, arg1);
		if (local16 == null) {
			return;
		}
		local25 = Static398.aClass256_4.method5782(local16.method6037());
		local31 = local16.method6034() & 0x3;
		if (local25.anInt2986 != -1) {
			Static178.method4585(arg3, local25, local31, arg4, arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
	public static void method145() {
		if (Static144.aString23.toLowerCase().indexOf("microsoft") != -1) {
			Static133.anIntArray129[188] = 71;
			Static133.anIntArray129[186] = 57;
			Static133.anIntArray129[221] = 43;
			Static133.anIntArray129[189] = 26;
			Static133.anIntArray129[190] = 72;
			Static133.anIntArray129[187] = 27;
			Static133.anIntArray129[191] = 73;
			Static133.anIntArray129[223] = 28;
			Static133.anIntArray129[220] = 74;
			Static133.anIntArray129[222] = 59;
			Static133.anIntArray129[192] = 58;
			Static133.anIntArray129[219] = 42;
			return;
		}
		Static133.anIntArray129[92] = 74;
		Static133.anIntArray129[61] = 27;
		if (Static144.aMethod1 == null) {
			Static133.anIntArray129[192] = 58;
			Static133.anIntArray129[222] = 59;
		} else {
			Static133.anIntArray129[222] = 58;
			Static133.anIntArray129[192] = 28;
			Static133.anIntArray129[520] = 59;
		}
		Static133.anIntArray129[47] = 73;
		Static133.anIntArray129[59] = 57;
		Static133.anIntArray129[93] = 43;
		Static133.anIntArray129[91] = 42;
		Static133.anIntArray129[46] = 72;
		Static133.anIntArray129[45] = 26;
		Static133.anIntArray129[44] = 71;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[BB)Ljava/lang/String;")
	public static String method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg2[arg0 + local12] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(41) char local41 = Static319.aCharArray6[local22 - 128];
					if (local41 == '\u0000') {
						local41 = '?';
					}
					local22 = local41;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	public static void method149() {
		@Pc(5) Class44 local5 = Static200.aClass44_32;
		synchronized (Static200.aClass44_32) {
			Static200.aClass44_32.method1031();
		}
		local5 = Static335.aClass44_55;
		synchronized (Static335.aClass44_55) {
			Static335.aClass44_55.method1031();
		}
	}
}
