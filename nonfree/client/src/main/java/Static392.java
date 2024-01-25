import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!op", name = "I", descriptor = "I")
	public static int anInt6871;

	@OriginalMember(owner = "client!op", name = "X", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!op", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString61 = "";

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIIILclient!r;II[[[BII)V")
	public static void method5754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class100 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte[][][] arg10, @OriginalArg(11) int arg11) {
		if (arg11 == 0 || arg9 == 0) {
			return;
		}
		if (arg11 == 9) {
			arg3 = arg3 + 1 & 0x3;
			arg11 = 1;
		}
		if (arg11 == 10) {
			arg11 = 1;
			arg3 = arg3 + 3 & 0x3;
		}
		if (arg11 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg11 = 8;
		}
		arg7.IA(arg0, arg1, arg6, arg2, arg8, arg4, arg10[arg11 - 1][arg3], arg9, arg5);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BIIIIILclient!r;II)V")
	public static void method5756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class100 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface24 local11 = (Interface24) Static353.method5256(arg0, arg1, arg4);
		@Pc(20) Class32 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			local20 = Static541.aClass97_4.method1794(local11.method7337());
			local26 = local11.method7340() & 0x3;
			local30 = local11.method7336();
			if (local20.anInt784 == -1) {
				local37 = arg6;
				if (local20.anInt807 > 0) {
					local37 = arg7;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg5.method6189(arg2, local37, 4, arg3);
					} else if (local26 == 1) {
						arg5.method6232(arg3, arg2, 4, local37);
					} else if (local26 == 2) {
						arg5.method6189(arg2 + 3, local37, 4, arg3);
					} else if (local26 == 3) {
						arg5.method6232(arg3 + 3, arg2, 4, local37);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg5.method6261(local37, arg2, arg3, 1, 1);
					} else if (local26 == 1) {
						arg5.method6261(local37, arg2 + 3, arg3, 1, 1);
					} else if (local26 == 2) {
						arg5.method6261(local37, arg2 + 3, arg3 + 3, 1, 1);
					} else if (local26 == 3) {
						arg5.method6261(local37, arg2, arg3 + 3, 1, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg5.method6232(arg3, arg2, 4, local37);
					} else if (local26 == 1) {
						arg5.method6189(arg2 + 3, local37, 4, arg3);
					} else if (local26 == 2) {
						arg5.method6232(arg3 + 3, arg2, 4, local37);
					} else if (local26 == 3) {
						arg5.method6189(arg2, local37, 4, arg3);
					}
				}
			} else {
				Static328.method5045(arg2, arg3, arg5, local20, local26);
			}
		}
		local11 = (Interface24) Static224.method3516(arg0, arg1, arg4, vda.class);
		if (local11 != null) {
			local20 = Static541.aClass97_4.method1794(local11.method7337());
			local26 = local11.method7340() & 0x3;
			local30 = local11.method7336();
			if (local20.anInt784 != -1) {
				Static328.method5045(arg2, arg3, arg5, local20, local26);
			} else if (local30 == 9) {
				local37 = -1118482;
				if (local20.anInt807 > 0) {
					local37 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg5.method6224(arg3 + 3, local37, arg3, arg2, arg2 + 3);
				} else {
					arg5.method6224(arg3, local37, arg3 + 3, arg2, arg2 + 3);
				}
			}
		}
		local11 = (Interface24) Static317.method4928(arg0, arg1, arg4);
		if (local11 == null) {
			return;
		}
		local20 = Static541.aClass97_4.method1794(local11.method7337());
		local26 = local11.method7340() & 0x3;
		if (local20.anInt784 != -1) {
			Static328.method5045(arg2, arg3, arg5, local20, local26);
			return;
		}
	}

	@OriginalMember(owner = "client!op", name = "i", descriptor = "(I)V")
	public static void method5759() {
		if (Static356.aClass287_5.aBoolean628) {
			Static440.anInt7756 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = Runtime.class.getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static440.anInt7756 = (int) (local33 / 1048576L) + 1;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}
}
