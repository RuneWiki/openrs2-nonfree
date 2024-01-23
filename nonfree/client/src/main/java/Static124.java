import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
	public static int anInt4548;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "[[I")
	public static int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
	public static int anInt4550;

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
	public static int anInt4551;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "Lclient!wi;")
	public static Class1_Sub16_Sub1 aClass1_Sub16_Sub1_3 = new Class1_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "Z")
	public static volatile boolean aBoolean205 = true;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	public static void method3506() {
		Static55.aClass53_10.method1498();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Z")
	public static boolean method3507(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBIIIIIIIZII)Z")
	public static boolean method3511(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (Static73.aClass5_Sub1_Sub1_1.anInt3584 == 2) {
			return Static190.method3188(arg8, arg3, arg5, arg2, arg9, arg0, arg1, arg7, arg6, arg10, arg4);
		} else if (Static73.aClass5_Sub1_Sub1_1.anInt3584 > 2) {
			return Static182.method3080(arg7, arg6, Static73.aClass5_Sub1_Sub1_1.anInt3584, arg5, arg2, arg9, arg4, arg3, arg0, arg1, arg8, arg10);
		} else {
			return Static165.method2816(arg8, arg2, arg1, arg7, arg0, arg9, arg6, arg3, arg5, arg10, arg4);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBI)Lclient!hb;")
	public static Class1_Sub13 method3518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub13 local7 = new Class1_Sub13();
		local7.anInt1677 = arg2;
		local7.anInt1675 = arg0;
		Static120.aClass102_14.method3083(local7, (long) arg1);
		Static207.method3440(arg2);
		@Pc(26) Class71 local26 = Static7.method102(arg1);
		if (local26 != null) {
			Static82.method1438(local26);
		}
		if (Static172.aClass71_30 != null) {
			Static82.method1438(Static172.aClass71_30);
			Static172.aClass71_30 = null;
		}
		Static202.anInt4289 = 0;
		Static156.aBoolean164 = false;
		Static221.method3642(Static72.anInt1644, Static200.anInt4245, Static184.anInt3998, Static53.anInt1242);
		if (local26 != null) {
			Static180.method3046(false, local26);
		}
		Static42.method3754(arg2);
		if (Static9.anInt179 != -1) {
			Static55.method955(Static9.anInt179, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method3527() {
		Static82.method1438(Static111.aClass71_22);
		Static144.anInt3149++;
		if (Static100.aBoolean91 && Static32.aBoolean27) {
			@Pc(26) int local26 = Static205.anInt4361;
			local26 -= Static222.anInt4666;
			if (Static118.anInt2543 > local26) {
				local26 = Static118.anInt2543;
			}
			@Pc(37) int local37 = Static15.anInt373;
			local37 -= Static167.anInt3761;
			if (local26 + Static111.aClass71_22.anInt2802 > Static118.anInt2543 - -Static218.aClass71_20.anInt2802) {
				local26 = Static118.anInt2543 + Static218.aClass71_20.anInt2802 - Static111.aClass71_22.anInt2802;
			}
			if (local37 < Static168.anInt3765) {
				local37 = Static168.anInt3765;
			}
			if (Static218.aClass71_20.anInt2835 + Static168.anInt3765 < Static111.aClass71_22.anInt2835 + local37) {
				local37 = Static218.aClass71_20.anInt2835 + Static168.anInt3765 - Static111.aClass71_22.anInt2835;
			}
			@Pc(97) int local97 = local26 - Static77.anInt1720;
			@Pc(100) int local100 = Static111.aClass71_22.anInt2843;
			@Pc(107) int local107 = local26 + Static218.aClass71_20.anInt2842 - Static118.anInt2543;
			@Pc(120) int local120 = local37 - Static193.anInt4183;
			if (Static144.anInt3149 > Static111.aClass71_22.anInt2857 && (local100 < local97 || local97 < -local100 || local120 > local100 || local120 < -local100)) {
				Static33.aBoolean35 = true;
			}
			@Pc(163) int local163 = Static218.aClass71_20.anInt2779 + local37 - Static168.anInt3765;
			@Pc(172) Class1_Sub21 local172;
			if (Static111.aClass71_22.anObjectArray27 != null && Static33.aBoolean35) {
				local172 = new Class1_Sub21();
				local172.anInt3105 = local163;
				local172.anObjectArray32 = Static111.aClass71_22.anObjectArray27;
				local172.aClass71_25 = Static111.aClass71_22;
				local172.anInt3104 = local107;
				Static65.method1119(local172);
			}
			if (Static71.anInt1636 == 0) {
				if (Static33.aBoolean35) {
					if (Static111.aClass71_22.anObjectArray12 != null) {
						local172 = new Class1_Sub21();
						local172.anInt3105 = local163;
						local172.aClass71_26 = Static75.aClass71_11;
						local172.anInt3104 = local107;
						local172.aClass71_25 = Static111.aClass71_22;
						local172.anObjectArray32 = Static111.aClass71_22.anObjectArray12;
						Static65.method1119(local172);
					}
					if (Static75.aClass71_11 != null && Static33.method579(Static111.aClass71_22) != null) {
						Static167.aClass1_Sub16_Sub1_2.method3823(160);
						Static167.aClass1_Sub16_Sub1_2.method3815(Static75.aClass71_11.anInt2807);
						Static167.aClass1_Sub16_Sub1_2.method3796(Static75.aClass71_11.anInt2788);
						Static167.aClass1_Sub16_Sub1_2.method3789(Static111.aClass71_22.anInt2788);
						Static167.aClass1_Sub16_Sub1_2.method3813(Static111.aClass71_22.anInt2807);
					}
				} else if ((Static179.anInt3918 == 1 || Static62.method1084(Static202.anInt4289 - 1)) && Static202.anInt4289 > 2) {
					Static58.method1031();
				} else if (Static202.anInt4289 > 0) {
					Static179.method3039(Static202.anInt4289 - 1);
				}
				Static111.aClass71_22 = null;
			}
		} else if (Static144.anInt3149 > 1) {
			Static111.aClass71_22 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)Lclient!kh;")
	public static Class65 method3529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass65_1;
	}
}
