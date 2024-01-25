import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "[I")
	public static final int[] anIntArray435 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
	public static int anInt3691 = 0;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!vj;IZLjava/awt/Component;)Lclient!ck;")
	public static Class34 method3624(@OriginalArg(0) int arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static22.anInt358 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class34 local35 = (Class34) Class.forName("Class34_Sub1").getDeclaredConstructor().newInstance();
			local35.anInt6401 = arg0;
			local35.anIntArray722 = new int[(Static16.aBoolean25 ? 2 : 1) * 256];
			local35.method5824(arg3);
			local35.anInt6402 = (arg0 & -1024) + 1024;
			if (local35.anInt6402 > 16384) {
				local35.anInt6402 = 16384;
			}
			local35.method5818(local35.anInt6402);
			if (Static76.anInt2851 > 0 && Static225.aClass33_1 == null) {
				Static225.aClass33_1 = new Class33();
				Static225.aClass33_1.aClass206_2 = arg1;
				arg1.method5526(Static225.aClass33_1, Static76.anInt2851);
			}
			if (Static225.aClass33_1 != null) {
				if (Static225.aClass33_1.aClass34Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static225.aClass33_1.aClass34Array1[arg2] = local35;
			}
			return local35;
		} catch (@Pc(107) Throwable local107) {
			try {
				@Pc(113) Class34_Sub2 local113 = new Class34_Sub2(arg1, arg2);
				local113.anInt6401 = arg0;
				local113.anIntArray722 = new int[(Static16.aBoolean25 ? 2 : 1) * 256];
				local113.method5824(arg3);
				local113.anInt6402 = 16384;
				local113.method5818(local113.anInt6402);
				if (Static76.anInt2851 > 0 && Static225.aClass33_1 == null) {
					Static225.aClass33_1 = new Class33();
					Static225.aClass33_1.aClass206_2 = arg1;
					arg1.method5526(Static225.aClass33_1, Static76.anInt2851);
				}
				if (Static225.aClass33_1 != null) {
					if (Static225.aClass33_1.aClass34Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static225.aClass33_1.aClass34Array1[arg2] = local113;
				}
				return local113;
			} catch (@Pc(175) Throwable local175) {
				return new Class34();
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	public static void method3625() {
		@Pc(1) Class137 local1 = Static270.aClass137_1;
		synchronized (Static270.aClass137_1) {
			Static270.aClass137_1.method3630();
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
	public static void method3627() {
		@Pc(1) Class70 local1 = Static290.aClass70_91;
		synchronized (Static290.aClass70_91) {
			Static290.aClass70_91.method1405();
		}
		local1 = Static66.aClass70_27;
		synchronized (Static66.aClass70_27) {
			Static66.aClass70_27.method1405();
		}
		@Pc(38) Class137 local38 = Static270.aClass137_1;
		synchronized (Static270.aClass137_1) {
			Static270.aClass137_1.method3628();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)Z")
	public static boolean method3634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static90.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static318.anInt5896) {
			return false;
		} else if (local7 == Static318.anInt5896) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static151.method3070(local22 + 1, Static203.aClass106Array3[arg0].method5720(arg1, arg2), local26 + 1) && Static151.method3070(local22 + 128 - 1, Static203.aClass106Array3[arg0].method5720(arg1 + 1, arg2), local26 + 1) && Static151.method3070(local22 + 128 - 1, Static203.aClass106Array3[arg0].method5720(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static151.method3070(local22 + 1, Static203.aClass106Array3[arg0].method5720(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static90.anIntArrayArrayArray2[arg0][arg1][arg2] = Static318.anInt5896;
				return true;
			} else {
				Static90.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static318.anInt5896;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)I")
	public static int method3635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
