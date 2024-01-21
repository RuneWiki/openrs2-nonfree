import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!sf", name = "hb", descriptor = "[I")
	public static int[] anIntArray295;

	@OriginalMember(owner = "client!sf", name = "Hb", descriptor = "I")
	public static int anInt3589;

	@OriginalMember(owner = "client!sf", name = "Z", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1727 = Static193.method3027("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!sf", name = "fb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1730 = Static193.method3027("Starting 3d library");

	@OriginalMember(owner = "client!sf", name = "cb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1728 = aClass70_1730;

	@OriginalMember(owner = "client!sf", name = "db", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1729 = Static193.method3027("overlay)3dat");

	@OriginalMember(owner = "client!sf", name = "Bb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1734 = Static193.method3027("Please enter your password)3");

	@OriginalMember(owner = "client!sf", name = "kb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1731 = aClass70_1734;

	@OriginalMember(owner = "client!sf", name = "Db", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1735 = Static193.method3027("Members only world");

	@OriginalMember(owner = "client!sf", name = "mb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1732 = aClass70_1735;

	@OriginalMember(owner = "client!sf", name = "qb", descriptor = "[I")
	public static final int[] anIntArray297 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!sf", name = "yb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1733 = Static193.method3027(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!sf", name = "Cb", descriptor = "Lclient!vc;")
	public static final Class94 aClass94_9 = new Class94(4);

	@OriginalMember(owner = "client!sf", name = "Gb", descriptor = "I")
	public static int anInt3588 = 0;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Z")
	public static boolean method2726(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIIIIIIII)V")
	public static void method2727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg3 - arg6;
		@Pc(14) int local14 = arg4 - arg7;
		@Pc(23) int local23 = (arg5 - arg2 << 16) / local9;
		@Pc(32) int local32 = (arg0 - arg1 << 16) / local14;
		@Pc(46) boolean local46;
		if (Static90.anInt1789 > 0 && Static90.anInt1789 % 10 < 5) {
			local46 = true;
		} else {
			local46 = false;
		}
		@Pc(68) int local68;
		@Pc(73) int local73;
		@Pc(94) int local94;
		@Pc(110) int local110;
		@Pc(104) int local104;
		@Pc(153) int local153;
		@Pc(159) int local159;
		for (@Pc(52) int local52 = 0; local52 < local9; local52++) {
			@Pc(60) int local60 = local52 * local23 >> 16;
			local68 = local23 * (local52 + 1) >> 16;
			local73 = local68 - local60;
			if (local73 > 0) {
				local60 += arg2;
				@Pc(92) int[][] local92 = Static8.anIntArrayArrayArray1[local52 + arg6 >> 6];
				for (local94 = 0; local94 < local14; local94++) {
					local104 = local32 * (local94 + 1) >> 16;
					local110 = local32 * local94 >> 16;
					@Pc(115) int local115 = local104 - local110;
					if (local115 > 0) {
						local110 += arg1;
						@Pc(134) int local134 = arg7 + local94 >> 6;
						if (local92[local134] != null) {
							local153 = (arg6 + local52 & 0x3F) + ((local94 + arg7 & 0x3F) << 6);
							local159 = local92[local134][local153];
							if (local159 != 0) {
								@Pc(167) Class3_Sub3_Sub9 local167 = Static161.method2421(local159 - 1);
								if (local46 && Static98.anInt2025 == local167.anInt999) {
									@Pc(177) Class3_Sub9 local177 = new Class3_Sub9();
									local177.anInt1403 = local110;
									local177.anInt1405 = local167.anInt999;
									local177.anInt1406 = local60;
									Static5.aClass10_8.method261(local177);
								}
								Static40.aClass3_Sub3_Sub2_Sub1Array5[local167.anInt999].method185(local60 - 7, local110 + -7);
							}
						}
					}
				}
			}
		}
		if (Static87.aDouble115 == Static178.aDouble94) {
			for (@Pc(227) Class3_Sub1 local227 = (Class3_Sub1) Static172.aClass10_94.method267(); local227 != null; local227 = (Class3_Sub1) Static172.aClass10_94.method268()) {
				local68 = local227.anInt26;
				local68 -= Static157.anInt3260;
				local73 = local227.anInt24;
				local110 = local227.anInt25;
				@Pc(259) int local259 = arg2 + (arg5 - arg2) * (-arg6 + local68) / (arg3 - arg6);
				local73 = Static50.anInt1046 + Static115.anInt2318 - local73;
				local94 = (local73 - arg7) * (arg0 - arg1) / (arg4 - arg7) + arg1;
				@Pc(284) Class3_Sub3_Sub2_Sub3 local284 = null;
				if (local110 == 0) {
					if (Static87.aDouble115 == 3.0D) {
						local284 = Static134.aClass3_Sub3_Sub2_Sub3_8;
					}
					if (Static87.aDouble115 == 4.0D) {
						local284 = Static106.aClass3_Sub3_Sub2_Sub3_3;
					}
					if (Static87.aDouble115 == 6.0D) {
						local284 = Static109.aClass3_Sub3_Sub2_Sub3_5;
					}
					if (Static87.aDouble115 == 8.0D) {
						local284 = Static118.aClass3_Sub3_Sub2_Sub3_7;
					}
				}
				local104 = 16777215;
				if (local110 == 1) {
					if (Static87.aDouble115 == 3.0D) {
						local284 = Static109.aClass3_Sub3_Sub2_Sub3_5;
					}
					if (Static87.aDouble115 == 4.0D) {
						local284 = Static118.aClass3_Sub3_Sub2_Sub3_7;
					}
					if (Static87.aDouble115 == 6.0D) {
						local284 = Static64.aClass3_Sub3_Sub2_Sub3_2;
					}
					if (Static87.aDouble115 == 8.0D) {
						local284 = Static108.aClass3_Sub3_Sub2_Sub3_6;
					}
				}
				if (local110 == 2) {
					local104 = 16755200;
					if (Static87.aDouble115 == 3.0D) {
						local284 = Static64.aClass3_Sub3_Sub2_Sub3_2;
					}
					if (Static87.aDouble115 == 4.0D) {
						local284 = Static108.aClass3_Sub3_Sub2_Sub3_6;
					}
					if (Static87.aDouble115 == 6.0D) {
						local284 = Static172.aClass3_Sub3_Sub2_Sub3_9;
					}
					if (Static87.aDouble115 == 8.0D) {
						local284 = Static34.aClass3_Sub3_Sub2_Sub3_1;
					}
				}
				if (local284 != null) {
					@Pc(380) Class70[] local380 = local227.aClass70Array1;
					local153 = local380.length;
					local94 -= (local153 - 1) * local284.method2603() / 2;
					local94 += local284.method2596() / 2;
					for (local159 = 0; local159 < local153; local159++) {
						local284.method2602(local380[local159], local259, local94, local104);
						local94 += local284.method2603();
					}
				}
			}
		}
		for (@Pc(439) Class3_Sub9 local439 = (Class3_Sub9) Static5.aClass10_8.method267(); local439 != null; local439 = (Class3_Sub9) Static5.aClass10_8.method268()) {
			Static40.aClass3_Sub3_Sub2_Sub1Array5[local439.anInt1405].method185(local439.anInt1406 - 7, local439.anInt1403 + -7);
			Static104.method3078(local439.anInt1406, local439.anInt1403, 15, 16776960, 128);
			Static104.method3078(local439.anInt1406, local439.anInt1403, 7, 16777215, 256);
		}
		Static5.aClass10_8.method262();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ja;Ljava/lang/Object;Z)V")
	public static void method2728(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg0.anEventQueue1.peekEvent() != null; local19++) {
			Static119.method1720(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)V")
	public static void method2729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].anInt830 = arg3;
		}
	}
}
