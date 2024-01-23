import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "N", descriptor = "I")
	public static int anInt166 = 0;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
	public static int anInt169 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BIIII)V")
	public static void method134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static155.anInt2919 < 100) {
			Static3.method48();
		}
		if (Static283.aBoolean393) {
			Static234.method3975(arg2, arg3, arg0 + arg2, arg1 + arg3);
		} else {
			Static143.method2449(arg2, arg3, arg0 + arg2, arg3 + arg1);
		}
		@Pc(59) int local59;
		@Pc(52) int local52;
		if (Static155.anInt2919 < 100) {
			local52 = arg3 + arg1 / 2 - 18 - 20;
			local59 = arg2 + arg0 / 2;
			if (Static283.aBoolean393) {
				Static234.method3973(arg2, arg3, arg0, arg1, 0);
				Static234.method3979(local59 - 152, local52, 304, 34, 9179409);
				Static234.method3973(local59 - 150, local52 + 2, Static155.anInt2919 * 3, 30, 9179409);
			} else {
				Static143.method2462(arg2, arg3, arg0, arg1, 0);
				Static143.method2455(local59 - 152, local52, 304, 34, 9179409);
				Static143.method2462(local59 - 150, local52 - -2, Static155.anInt2919 * 3, 30, 9179409);
			}
			Static224.aClass3_Sub4_Sub2_14.method3684(Static171.aString115, local59, local52 + 20, 16777215, -1);
			return;
		}
		Static293.anInt5846 = Static158.anInt2949 - (int) ((float) arg0 / Static228.aFloat19);
		Static171.anInt3225 = (int) ((float) (arg0 * 2) / Static228.aFloat19);
		Static9.anInt189 = Static168.anInt3167 - (int) ((float) arg1 / Static228.aFloat19);
		Static203.anInt3978 = (int) ((float) (arg1 * 2) / Static228.aFloat19);
		local52 = Static158.anInt2949 + (int) ((float) arg0 / Static228.aFloat19);
		@Pc(176) int local176 = (int) ((float) arg1 / Static228.aFloat19) + Static168.anInt3167;
		local59 = Static168.anInt3167 - (int) ((float) arg1 / Static228.aFloat19);
		@Pc(194) int local194 = Static158.anInt2949 - (int) ((float) arg0 / Static228.aFloat19);
		@Pc(222) Class56 local222;
		if (Static283.aBoolean393) {
			if (Static232.aClass3_Sub4_Sub12_Sub2_3 == null || arg0 != Static232.aClass3_Sub4_Sub12_Sub2_3.anInt5728 || arg1 != Static232.aClass3_Sub4_Sub12_Sub2_3.anInt5729) {
				Static232.aClass3_Sub4_Sub12_Sub2_3 = null;
				Static232.aClass3_Sub4_Sub12_Sub2_3 = new Class3_Sub4_Sub12_Sub2(arg0, arg1);
			}
			Static143.method2446(Static232.aClass3_Sub4_Sub12_Sub2_3.anIntArray596, arg0, arg1);
			Static228.method1187(local194, local59, local52, local176, 0, 0, arg0, arg1 + 1);
			Static228.method1195();
			local222 = Static228.method1183();
			Static209.method4937(local222, arg2, arg3);
			Static232.aClass3_Sub4_Sub12_Sub2_3.method4720();
			Static234.method3969(Static232.aClass3_Sub4_Sub12_Sub2_3.anIntArray596, arg2, arg3, arg0, arg1);
			Static143.anIntArray316 = null;
		} else {
			Static228.method1187(local194, local59, local52, local176, arg2, arg3, arg0 + arg2, arg3 + 1 + arg1);
			Static228.method1195();
			local222 = Static228.method1183();
			Static209.method4937(local222, 0, 0);
		}
		if (Static135.anInt2616 > 0) {
			Static157.anInt2942--;
			if (Static157.anInt2942 == 0) {
				Static157.anInt2942 = 20;
				Static135.anInt2616--;
			}
		}
		if (!Static95.aBoolean141) {
			return;
		}
		@Pc(321) int local321 = arg3 + arg1 - 8;
		@Pc(327) int local327 = arg0 + arg2 - 5;
		@Pc(329) int local329 = 16776960;
		Static248.aClass3_Sub4_Sub2_11.method3699("Fps:" + Static199.anInt3877, local327, local321, 16776960, -1);
		@Pc(345) Runtime local345 = Runtime.getRuntime();
		@Pc(355) int local355 = (int) ((local345.totalMemory() - local345.freeMemory()) / 1024L);
		@Pc(356) int local356 = local321 - 15;
		if (local355 > 65536) {
			local329 = 16711680;
		}
		Static248.aClass3_Sub4_Sub2_11.method3699("Mem:" + local355 + "k", local327, local356, local329, -1);
		local321 = local356 - 15;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
	public static void method135(@OriginalArg(1) int arg0) {
		if (Static12.anInt234 == arg0) {
			@Pc(21) Interface1 local21 = Static59.anInterface1Array1[arg0];
			local21.method3985(Static240.anInt4879);
		}
	}
}
