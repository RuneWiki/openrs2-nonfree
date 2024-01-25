import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!oh;")
	public static Class237 aClass237_123;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "[Lclient!ab;")
	public static Class3[] aClass3Array1 = null;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method7347() {
		Static350.aBoolean470 = false;
		Static121.method2707();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLclient!tp;I)Ljava/lang/String;")
	public static String method7348(@OriginalArg(1) Class331 arg0, @OriginalArg(2) int arg1) {
		if (!Static73.method1921(arg0).method5220(arg1) && arg0.anObjectArray10 == null) {
			return null;
		} else if (arg0.aStringArray34 == null || arg0.aStringArray34.length <= arg1 || arg0.aStringArray34[arg1] == null || arg0.aStringArray34[arg1].trim().length() == 0) {
			return Static54.aBoolean127 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray34[arg1];
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BIII)V")
	public static void method7349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static628.anInt10493 + arg2;
		@Pc(21) int local21 = Static594.anInt10160 + arg0;
		if (Static405.aClass56ArrayArrayArray2 == null || arg2 < 0 || arg0 < 0 || Static372.anInt7082 <= arg2 || arg0 >= Static218.anInt5023 || Static155.aClass8_Sub25_6.aClass36_Sub13_1.method4838() == 0 && Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 != arg1) {
			return;
		}
		@Pc(58) long local58 = (long) (local9 | arg1 << 28 | local21 << 14);
		@Pc(64) Class8_Sub26 local64 = (Class8_Sub26) Static567.aClass253_38.method6594(local58);
		if (local64 == null) {
			Static324.method5346(arg1, arg2, arg0);
			return;
		}
		@Pc(78) Class8_Sub11 local78 = (Class8_Sub11) local64.aClass43_25.method1422();
		if (local78 == null) {
			Static324.method5346(arg1, arg2, arg0);
			return;
		}
		@Pc(92) Class15_Sub1_Sub1_Sub1 local92 = (Class15_Sub1_Sub1_Sub1) Static324.method5346(arg1, arg2, arg0);
		if (local92 == null) {
			local92 = new Class15_Sub1_Sub1_Sub1(arg2 << 9, Static34.aClass86Array5[arg1].method8086(arg0, arg2), arg0 << 9, arg1, arg1);
		} else {
			local92.anInt7765 = local92.anInt7769 = -1;
		}
		local92.anInt7784 = local78.anInt2019;
		local92.anInt7780 = local78.anInt2018;
		label56: while (true) {
			@Pc(135) Class8_Sub11 local135 = (Class8_Sub11) local64.aClass43_25.method1426();
			if (local135 == null) {
				break;
			}
			if (local92.anInt7780 != local135.anInt2018) {
				local92.anInt7777 = local135.anInt2019;
				local92.anInt7765 = local135.anInt2018;
				while (true) {
					@Pc(160) Class8_Sub11 local160 = (Class8_Sub11) local64.aClass43_25.method1426();
					if (local160 == null) {
						break label56;
					}
					if (local160.anInt2018 != local92.anInt7780 && local92.anInt7765 != local160.anInt2018) {
						local92.anInt7774 = local160.anInt2019;
						local92.anInt7769 = local160.anInt2018;
					}
				}
			}
		}
		@Pc(208) int local208 = Static177.method3098((arg0 << 9) + 256, (arg2 << 9) + 256, arg1);
		local92.aByte124 = (byte) arg1;
		local92.anInt7771 = 0;
		local92.anInt10301 = arg2 << 9;
		local92.aByte125 = (byte) arg1;
		local92.anInt10298 = arg0 << 9;
		local92.anInt10297 = local208;
		if (Static61.method1675(arg0, arg2)) {
			local92.aByte125++;
		}
		Static53.method1580(arg1, arg2, arg0, local208, local92);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z")
	public static boolean method7351(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII)V")
	public static void method7352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static174.anInt4169 = arg1;
		Static101.anInt2723 = arg0;
		Static56.anInt1868 = arg4;
		Static132.anInt3517 = arg2;
		Static191.anInt4496 = arg3;
		Static182.anInt4250 = arg5;
	}
}
