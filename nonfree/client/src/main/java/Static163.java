import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "I")
	public static int anInt3040;

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
	public static int anInt3041;

	@OriginalMember(owner = "client!hu", name = "z", descriptor = "I")
	public static int anInt3042;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!ht;I[II[I)Lclient!vm;")
	public static Class62_Sub2 method2621(@OriginalArg(0) int arg0, @OriginalArg(1) Class109_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg3 * arg0];
		for (@Pc(20) int local20 = 0; local20 < arg3; local20++) {
			@Pc(30) int local30 = arg2[local20] + arg0 * local20;
			for (@Pc(32) int local32 = 0; local32 < arg4[local20]; local32++) {
				local10[local30++] = -1;
			}
		}
		return new Class62_Sub2(arg1, arg0, arg3, local10);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
	public static void method2622() {
		if (Static211.aBoolean268) {
			return;
		}
		Static211.aBoolean268 = true;
		Static255.aBoolean311 = true;
		if (Static389.aClass128_Sub1_1.aBoolean233) {
			Static274.aFloat78 = (int) Static274.aFloat78 + 191 & 0xFFFFFF80;
		} else {
			Static107.aFloat33 += (24.0F - Static107.aFloat33) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(B)V")
	public static void method2623() {
		@Pc(9) Class83 local9 = Static92.aClass83_14;
		synchronized (Static92.aClass83_14) {
			Static92.aClass83_14.method1669();
		}
		local9 = Static193.aClass83_8;
		synchronized (Static193.aClass83_8) {
			Static193.aClass83_8.method1669();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II[Lclient!ss;IZI)V")
	public static void method2624(@OriginalArg(0) int arg0, @OriginalArg(2) Class219[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) Class219 local18 = arg1[local12];
			if (local18 != null && local18.anInt6379 == arg2) {
				Static175.method2726(arg0, arg3, local18, arg4);
				Static185.method2826(arg4, arg0, local18);
				if (local18.anInt6368 > local18.anInt6404 - local18.anInt6398) {
					local18.anInt6368 = local18.anInt6404 - local18.anInt6398;
				}
				if (local18.anInt6368 < 0) {
					local18.anInt6368 = 0;
				}
				if (local18.anInt6413 - local18.anInt6363 < local18.anInt6371) {
					local18.anInt6371 = local18.anInt6413 - local18.anInt6363;
				}
				if (local18.anInt6371 < 0) {
					local18.anInt6371 = 0;
				}
				if (local18.anInt6377 == 0) {
					Static251.method3698(arg3, local18);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!ss;ZII)V")
	public static void method2625(@OriginalArg(0) Class219 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static442.aClass219_14 != null || Static108.aBoolean111 || (arg0 == null || Static153.method5067(arg0) == null)) {
			return;
		}
		Static442.aClass219_14 = arg0;
		Static207.aClass219_11 = Static153.method5067(arg0);
		Static63.anInt1323 = arg1;
		Static368.anInt6278 = 0;
		Static285.anInt7840 = arg2;
		Static385.aBoolean439 = false;
	}
}
