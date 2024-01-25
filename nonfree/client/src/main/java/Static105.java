import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
	public static int anInt2194;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
	public static int anInt2196;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "Lclient!iq;")
	public static Class104 aClass104_70;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_75 = new Class157(43, 4);

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
	public static int anInt2192 = 0;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
	public static int anInt2195 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method2073(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static178.aBoolean611) {
			try {
				@Pc(25) Class119 local25 = (Class119) Class.forName("Class119_Sub1").getDeclaredConstructor().newInstance();
				local25.method3353(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static178.aBoolean611 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!dr;IIIIIII)V")
	public static void method2077(@OriginalArg(1) Class37 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Interface8 local15 = (Interface8) Static356.method5687(arg5, arg1, arg6);
		@Pc(25) Class74 local25;
		@Pc(31) int local31;
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (local15 != null) {
			local25 = Static228.method4210(local15.method5502());
			local31 = local15.method5501() & 0x3;
			local37 = local15.method5503();
			if (local25.anInt2070 == -1) {
				local44 = arg7;
				if (local25.anInt2086 > 0) {
					local44 = arg3;
				}
				if (local37 == 0 || local37 == 2) {
					if (local31 == 0) {
						arg0.method3739(arg4, local44, 4, arg2);
					} else if (local31 == 1) {
						arg0.method3660(4, arg4, arg2, local44);
					} else if (local31 == 2) {
						arg0.method3739(arg4, local44, 4, arg2 + 3);
					} else if (local31 == 3) {
						arg0.method3660(4, arg4 + 3, arg2, local44);
					}
				}
				if (local37 == 3) {
					if (local31 == 0) {
						arg0.method3694(1, local44, 1, arg2, arg4);
					} else if (local31 == 1) {
						arg0.method3694(1, local44, 1, arg2 + 3, arg4);
					} else if (local31 == 2) {
						arg0.method3694(1, local44, 1, arg2 + 3, arg4 + 3);
					} else if (local31 == 3) {
						arg0.method3694(1, local44, 1, arg2, arg4 + 3);
					}
				}
				if (local37 == 2) {
					if (local31 == 0) {
						arg0.method3660(4, arg4, arg2, local44);
					} else if (local31 == 1) {
						arg0.method3739(arg4, local44, 4, arg2 + 3);
					} else if (local31 == 2) {
						arg0.method3660(4, arg4 + 3, arg2, local44);
					} else if (local31 == 3) {
						arg0.method3739(arg4, local44, 4, arg2);
					}
				}
			} else {
				Static122.method2385(local25, arg0, local31, arg4, arg2);
			}
		}
		local15 = (Interface8) Static109.method2112(arg5, arg1, arg6, rc.class);
		if (local15 != null) {
			local25 = Static228.method4210(local15.method5502());
			local31 = local15.method5501() & 0x3;
			local37 = local15.method5503();
			if (local25.anInt2070 != -1) {
				Static122.method2385(local25, arg0, local31, arg4, arg2);
			} else if (local37 == 9) {
				local44 = -1118482;
				if (local25.anInt2086 > 0) {
					local44 = -1179648;
				}
				if (local31 == 0 || local31 == 2) {
					arg0.method3681(arg4, arg4 + 3, arg2, local44, arg2 + 3);
				} else {
					arg0.method3681(arg4 + 3, arg4, arg2, local44, arg2 + 3);
				}
			}
		}
		local15 = (Interface8) Static217.method4135(arg5, arg1, arg6);
		if (local15 == null) {
			return;
		}
		local25 = Static228.method4210(local15.method5502());
		local31 = local15.method5501() & 0x3;
		if (local25.anInt2070 != -1) {
			Static122.method2385(local25, arg0, local31, arg4, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!lp;Ljava/lang/String;IZ)V")
	public static void method2078(@OriginalArg(0) Class71 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(21) int local21 = Static213.aClass82_7.method2237(arg1, null, 250);
		@Pc(30) int local30 = Static213.aClass82_7.method2238(250, null, arg1) * 13;
		Static51.aClass37_1.method3712(6, 6, local21 + 4 + 4, local30 - -8, -16777216, 0);
		Static51.aClass37_1.method3697(6, 6, local21 + 4 + 4, local30 + 4 - -4, -1, 0);
		arg0.method5246(local30, -1, -1, 0, 0, null, 10, null, 10, local21, null, arg1, 0, 1, 1);
		Static237.method4317(6, local30 + 4 + 4, local21 + 4 - -4, 6);
		if (arg2) {
			Static51.aClass37_1.method3742();
		}
	}
}
