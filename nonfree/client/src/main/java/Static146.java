import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Lclient!md;")
	public static Class44 aClass44_4;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "I")
	public static volatile int anInt4045 = 0;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1033 = Static8.method128("Continue");

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1034 = Static8.method128("_");

	@OriginalMember(owner = "client!se", name = "f", descriptor = "[J")
	public static long[] aLongArray5 = new long[200];

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public static int anInt4048 = 0;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[I")
	public static int[] anIntArray376 = new int[100];

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1035 = Static8.method128("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1036 = aClass18_1033;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)I")
	public static int method2768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg0 & 0x3;
		if (local13 == 0) {
			return arg2;
		} else if (local13 == 1) {
			return 7 - arg1;
		} else if (local13 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method2769() {
		aLongArray5 = null;
		aClass18_1034 = null;
		anIntArray376 = null;
		aClass18_1036 = null;
		aClass18_1033 = null;
		aClass44_4 = null;
		aClass18_1035 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method2770() {
		Static27.aBoolean26 = false;
		Static138.aBoolean170 = false;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)J")
	public static synchronized long method2771() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (Static19.aLong19 > local1) {
			Static10.aLong11 += Static19.aLong19 - local1;
		}
		Static19.aLong19 = local1;
		return local1 + Static10.aLong11;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	public static void method2772() {
		for (@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) Static145.aClass59_53.method2417(); local15 != null; local15 = (Class1_Sub3) Static145.aClass59_53.method2424()) {
			if (local15.anInt221 > 0) {
				local15.anInt221--;
			}
			if (local15.anInt221 != 0) {
				if (local15.anInt215 > 0) {
					local15.anInt215--;
				}
				if (local15.anInt215 == 0 && local15.anInt228 >= 1 && local15.anInt222 >= 1 && local15.anInt228 <= 102 && local15.anInt222 <= 102 && (local15.anInt229 < 0 || Static14.method245(local15.anInt217, local15.anInt229))) {
					Static86.method1874(local15.anInt217, local15.anInt229, local15.anInt214, local15.anInt222, local15.anInt212, local15.anInt225, local15.anInt228);
					local15.anInt215 = -1;
					if (local15.anInt229 == local15.anInt223 && local15.anInt223 == -1) {
						local15.method3198();
					} else if (local15.anInt229 == local15.anInt223 && local15.anInt225 == local15.anInt226 && local15.anInt220 == local15.anInt217) {
						local15.method3198();
					}
				}
			} else if (local15.anInt223 < 0 || Static14.method245(local15.anInt220, local15.anInt223)) {
				Static86.method1874(local15.anInt220, local15.anInt223, local15.anInt214, local15.anInt222, local15.anInt212, local15.anInt226, local15.anInt228);
				local15.method3198();
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
	public static void method2773() {
		Static15.aClass66_2.method2604();
		Static164.aClass66_22.method2604();
		Static165.aClass66_23.method2604();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void method2774() {
		@Pc(7) int local7 = Static124.anInt3518;
		@Pc(9) int local9 = Static132.anInt3760;
		@Pc(11) int local11 = Static110.anInt3236;
		@Pc(15) int local15 = Static32.anInt1094;
		Static63.method1990(local7, local11, local9, local15, 6116423);
		Static63.method1990(local7 + 1, local11 + 1, local9 - 2, 16, 0);
		Static63.method2007(local7 + 1, local11 + 18, local9 - 2, local15 + -19, 0);
		Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2016(Static145.aClass18_1032, local7 + 3, local11 + 14, 6116423, -1);
		@Pc(69) int local69 = Static9.anInt293;
		@Pc(71) int local71 = Static154.anInt4252;
		for (@Pc(73) int local73 = 0; local73 < Static80.anInt2478; local73++) {
			@Pc(87) int local87 = local11 + (Static80.anInt2478 - local73 + -1) * 15 + 31;
			@Pc(89) int local89 = 16777215;
			if (local71 > local7 && local71 < local7 + local9 && local69 > local87 - 13 && local87 + 3 > local69) {
				local89 = 16776960;
			}
			Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2016(Static125.method2488(local73), local7 + 3, local87, local89, 0);
		}
		Static74.method1571(Static32.anInt1094, Static132.anInt3760, Static124.anInt3518, Static110.anInt3236);
	}
}
