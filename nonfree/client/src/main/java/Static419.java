import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!un", name = "vb", descriptor = "I")
	public static int anInt7092;

	@OriginalMember(owner = "client!un", name = "xb", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array17;

	@OriginalMember(owner = "client!un", name = "kb", descriptor = "[I")
	public static final int[] anIntArray453 = new int[8];

	@OriginalMember(owner = "client!un", name = "wb", descriptor = "Lclient!lp;")
	public static final Class140 aClass140_36 = new Class140(8);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)V")
	public static void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass1_Sub4_2 != null) {
			local7.aClass1_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
	public static void method5743(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub3_Sub4 local13 = Static281.method3883(16, arg0);
		local13.method1006();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!qa;IIIIZIII)V")
	public static void method5745(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface5 local11 = (Interface5) Static392.method5427(arg7, arg5, arg6);
		@Pc(20) Class31 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (local11 != null) {
			local20 = Static9.aClass149_1.method3573(local11.method6263());
			local26 = local11.method6262() & 0x3;
			local30 = local11.method6261();
			if (local20.anInt793 == -1) {
				local45 = arg4;
				if (local20.anInt788 > 0) {
					local45 = arg2;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg0.method5960(local45, arg1, 4, arg3);
					} else if (local26 == 1) {
						arg0.method6018(4, arg1, local45, arg3);
					} else if (local26 == 2) {
						arg0.method5960(local45, arg1, 4, arg3 + 3);
					} else if (local26 == 3) {
						arg0.method6018(4, arg1 + 3, local45, arg3);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg0.method5951(1, arg1, local45, arg3, 1);
					} else if (local26 == 1) {
						arg0.method5951(1, arg1, local45, arg3 + 3, 1);
					} else if (local26 == 2) {
						arg0.method5951(1, arg1 + 3, local45, arg3 + 3, 1);
					} else if (local26 == 3) {
						arg0.method5951(1, arg1 + 3, local45, arg3, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg0.method6018(4, arg1, local45, arg3);
					} else if (local26 == 1) {
						arg0.method5960(local45, arg1, 4, arg3 + 3);
					} else if (local26 == 2) {
						arg0.method6018(4, arg1 + 3, local45, arg3);
					} else if (local26 == 3) {
						arg0.method5960(local45, arg1, 4, arg3);
					}
				}
			} else {
				Static414.method6103(arg1, arg3, local20, local26, arg0);
			}
		}
		local11 = (Interface5) Static313.method4388(arg7, arg5, arg6, jt.class);
		if (local11 != null) {
			local20 = Static9.aClass149_1.method3573(local11.method6263());
			local26 = local11.method6262() & 0x3;
			local30 = local11.method6261();
			if (local20.anInt793 != -1) {
				Static414.method6103(arg1, arg3, local20, local26, arg0);
			} else if (local30 == 9) {
				local45 = -1118482;
				if (local20.anInt788 > 0) {
					local45 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg0.method5979(arg1 + 3, arg3, local45, arg1, arg3 + 3);
				} else {
					arg0.method5979(arg1, arg3, local45, arg1 + 3, arg3 - -3);
				}
			}
		}
		local11 = (Interface5) Static112.method1824(arg7, arg5, arg6);
		if (local11 == null) {
			return;
		}
		local20 = Static9.aClass149_1.method3573(local11.method6263());
		local26 = local11.method6262() & 0x3;
		if (local20.anInt793 != -1) {
			Static414.method6103(arg1, arg3, local20, local26, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Lclient!uo;")
	public static Class41_Sub1 method5746() {
		return Static414.anInt7473 < Static121.aClass41_Sub1Array1.length ? Static121.aClass41_Sub1Array1[Static414.anInt7473++] : null;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)Z")
	public static boolean method5747(@OriginalArg(0) int arg0) {
		if (arg0 == 23 || arg0 == 16 || arg0 == 57 || arg0 == 22 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1002;
		}
	}
}
