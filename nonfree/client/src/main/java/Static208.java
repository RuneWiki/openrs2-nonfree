import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "Lclient!he;")
	public static Class100 aClass100_39;

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "[Lclient!il;")
	public static Class118[] aClass118Array1;

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_54 = new Class267("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)I")
	public static int method3210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
	public static void method3212() {
		Static131.method2328(false);
		Static238.anInt4370 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < Static39.aByteArrayArray6.length; local16++) {
			if (Static344.anIntArray411[local16] != -1 && Static39.aByteArrayArray6[local16] == null) {
				Static39.aByteArrayArray6[local16] = Static332.aClass100_63.method2520(0, Static344.anIntArray411[local16]);
				if (Static39.aByteArrayArray6[local16] == null) {
					Static238.anInt4370++;
					local14 = false;
				}
			}
			if (Static426.anIntArray519[local16] != -1 && Static269.aByteArrayArray17[local16] == null) {
				Static269.aByteArrayArray17[local16] = Static332.aClass100_63.method2511(Static426.anIntArray519[local16], Static386.anIntArrayArray46[local16], 0);
				if (Static269.aByteArrayArray17[local16] == null) {
					local14 = false;
					Static238.anInt4370++;
				}
			}
			if (Static188.anIntArray230[local16] != -1 && Static137.aByteArrayArray11[local16] == null) {
				Static137.aByteArrayArray11[local16] = Static332.aClass100_63.method2520(0, Static188.anIntArray230[local16]);
				if (Static137.aByteArrayArray11[local16] == null) {
					Static238.anInt4370++;
					local14 = false;
				}
			}
			if (Static372.anIntArray460[local16] != -1 && Static213.aByteArrayArray23[local16] == null) {
				Static213.aByteArrayArray23[local16] = Static332.aClass100_63.method2520(0, Static372.anIntArray460[local16]);
				if (Static213.aByteArrayArray23[local16] == null) {
					local14 = false;
					Static238.anInt4370++;
				}
			}
			if (Static174.anIntArray219 != null && Static298.aByteArrayArray20[local16] == null && Static174.anIntArray219[local16] != -1) {
				Static298.aByteArrayArray20[local16] = Static332.aClass100_63.method2511(Static174.anIntArray219[local16], Static386.anIntArrayArray46[local16], 0);
				if (Static298.aByteArrayArray20[local16] == null) {
					Static238.anInt4370++;
					local14 = false;
				}
			}
		}
		if (Static39.aClass202_3 == null) {
			if (Static96.aClass6_Sub2_Sub15_5 == null || !Static173.aClass100_34.method2503(Static96.aClass6_Sub2_Sub15_5.aString64 + "_staticelements")) {
				Static39.aClass202_3 = new Class202(0);
			} else if (Static173.aClass100_34.method2496(Static96.aClass6_Sub2_Sub15_5.aString64 + "_staticelements")) {
				Static39.aClass202_3 = Static116.method2021(Static96.aClass6_Sub2_Sub15_5.aString64 + "_staticelements", Static173.aClass100_34, Static48.aBoolean101);
			} else {
				local14 = false;
				Static238.anInt4370++;
			}
		}
		if (!local14) {
			Static399.anInt7156 = 1;
			return;
		}
		Static252.anInt4606 = 0;
		local14 = true;
		@Pc(268) int local268;
		@Pc(279) int local279;
		for (@Pc(249) int local249 = 0; local249 < Static39.aByteArrayArray6.length; local249++) {
			@Pc(255) byte[] local255 = Static269.aByteArrayArray17[local249];
			if (local255 != null) {
				local268 = (Static411.anIntArray508[local249] >> 8) * 64 - Static2.anInt6396;
				local279 = (Static411.anIntArray508[local249] & 0xFF) * 64 - Static348.anInt6273;
				if (Static98.anInt6276 != 0) {
					local279 = 10;
					local268 = 10;
				}
				local14 &= Static88.method4150(local279, local255, Static117.anInt2450, local268, Static181.anInt3574);
			}
			local255 = Static213.aByteArrayArray23[local249];
			if (local255 != null) {
				local268 = (Static411.anIntArray508[local249] >> 8) * 64 - Static2.anInt6396;
				local279 = (Static411.anIntArray508[local249] & 0xFF) * 64 - Static348.anInt6273;
				if (Static98.anInt6276 != 0) {
					local279 = 10;
					local268 = 10;
				}
				local14 &= Static88.method4150(local279, local255, Static117.anInt2450, local268, Static181.anInt3574);
			}
		}
		if (!local14) {
			Static399.anInt7156 = 2;
			return;
		}
		if (Static399.anInt7156 != 0) {
			Static134.method2374(Static35.aClass29_1, Static54.aClass267_20.method6581(Static161.anInt3239) + "<br>(100%)", true);
		}
		Static280.method4210();
		Static225.method3368();
		@Pc(388) boolean local388 = false;
		if (Static126.aClass66_5.method4978() && Static291.aClass28_Sub1_1.aBoolean86) {
			for (local268 = 0; local268 < Static39.aByteArrayArray6.length; local268++) {
				if (Static213.aByteArrayArray23[local268] != null || Static137.aByteArrayArray11[local268] != null) {
					local388 = true;
					break;
				}
			}
		}
		if (Static291.aClass28_Sub1_1.aBoolean84) {
			local268 = Static193.anIntArray236[Static98.anInt6275];
		} else {
			local268 = Static317.anIntArray137[Static98.anInt6275];
		}
		if (Static126.aClass66_5.method5008()) {
			local268++;
		}
		Static372.method5581(Static181.anInt3574, Static117.anInt2450, local268, local388, Static126.aClass66_5.method5012() > 0);
		for (local279 = 0; local279 < 4; local279++) {
			Static209.aClass210Array2[local279].method4714();
		}
		Static296.method4395();
		Static290.method4373(false);
		Static267.method4084();
		Static249.aClass107_1 = null;
		Static280.method4210();
		System.gc();
		Static131.method2328(true);
		Static5.method201();
		Static168.aBoolean222 = Static291.aClass28_Sub1_1.aBoolean74;
		Static415.aBoolean470 = !Static291.aClass28_Sub1_1.aBoolean83;
		Static152.aBoolean198 = Static291.aClass28_Sub1_1.aBoolean86;
		Static221.anInt4009 = Static291.aClass28_Sub1_1.anInt1034;
		Static439.aBoolean17 = Static270.anInt4876 >= 96;
		Static327.anInt5636 = Static291.aClass28_Sub1_1.method832(Static294.anInt5208) ? -1 : Static232.anInt4221;
		Static103.aBoolean152 = Static294.anInt5208 == 1 || Static291.aClass28_Sub1_1.aBoolean76;
		Static393.aClass115_Sub1_2 = new Class115_Sub1(4, Static181.anInt3574, Static117.anInt2450, false);
		if (Static98.anInt6276 == 0) {
			Static143.method2457(Static39.aByteArrayArray6, Static393.aClass115_Sub1_2);
		} else {
			Static342.method4962(Static39.aByteArrayArray6, Static393.aClass115_Sub1_2);
		}
		Static352.method5247(Static181.anInt3574 >> 4, Static117.anInt2450 >> 4);
		Static118.method2055();
		if (local388) {
			Static35.method860(true);
			Static276.aClass115_Sub1_1 = new Class115_Sub1(1, Static181.anInt3574, Static117.anInt2450, true);
			if (Static98.anInt6276 == 0) {
				Static143.method2457(Static137.aByteArrayArray11, Static276.aClass115_Sub1_1);
				Static131.method2328(true);
			} else {
				Static342.method4962(Static137.aByteArrayArray11, Static276.aClass115_Sub1_1);
				Static131.method2328(true);
			}
			Static276.aClass115_Sub1_1.method5994(Static393.aClass115_Sub1_2.anIntArrayArrayArray14[0]);
			Static276.aClass115_Sub1_1.method5987(null, null, Static126.aClass66_5);
			Static35.method860(false);
		}
		Static393.aClass115_Sub1_2.method5987(local388 ? Static276.aClass115_Sub1_1.anIntArrayArrayArray14 : null, Static209.aClass210Array2, Static126.aClass66_5);
		if (Static98.anInt6276 == 0) {
			Static131.method2328(true);
			Static398.method1695(Static393.aClass115_Sub1_2, Static269.aByteArrayArray17);
			if (Static298.aByteArrayArray20 != null) {
				Static390.method5730();
			}
		} else {
			Static131.method2328(true);
			Static262.method2114(Static269.aByteArrayArray17, Static393.aClass115_Sub1_2);
		}
		Static225.method3368();
		Static131.method2328(true);
		Static393.aClass115_Sub1_2.method5995(Static126.aClass66_5, null, local388 ? Static288.aClass86Array3[0] : null);
		Static393.aClass115_Sub1_2.method6006(Static126.aClass66_5);
		Static131.method2328(true);
		if (local388) {
			Static35.method860(true);
			Static131.method2328(true);
			if (Static98.anInt6276 == 0) {
				Static398.method1695(Static276.aClass115_Sub1_1, Static213.aByteArrayArray23);
			} else {
				Static262.method2114(Static213.aByteArrayArray23, Static276.aClass115_Sub1_1);
			}
			Static225.method3368();
			Static131.method2328(true);
			Static276.aClass115_Sub1_1.method5995(Static126.aClass66_5, Static87.aClass86Array2[0], null);
			Static276.aClass115_Sub1_1.method6006(Static126.aClass66_5);
			Static131.method2328(true);
			Static35.method860(false);
		}
		Static244.method6370();
		@Pc(721) int local721 = Static393.aClass115_Sub1_2.anInt7280;
		if (local721 > Static388.anInt6870) {
			local721 = Static388.anInt6870;
		}
		if (Static388.anInt6870 - 1 > local721) {
			local721 = Static388.anInt6870 - 1;
		}
		if (Static291.aClass28_Sub1_1.method832(Static294.anInt5208)) {
			Static4.method6482(0);
		} else {
			Static4.method6482(local721);
		}
		@Pc(754) int local754;
		@Pc(758) int local758;
		for (@Pc(750) int local750 = 0; local750 < 4; local750++) {
			for (local754 = 0; local754 < Static181.anInt3574; local754++) {
				for (local758 = 0; local758 < Static117.anInt2450; local758++) {
					Static336.method4889(local754, local758, local750);
				}
			}
		}
		Static346.method5190();
		Static280.method4210();
		Static290.method4369();
		Static225.method3368();
		Static79.aBoolean139 = false;
		Static77.method1513();
		if (Static133.aFrame3 != null && Static177.aClass73_6 != null && Static217.anInt3941 == 25) {
			Static403.method5961(Static354.aClass92_124);
			Static109.aClass6_Sub1_Sub1_5.method6461(1057001181);
		}
		if (Static98.anInt6276 == 0) {
			local754 = (Static96.anInt5953 - (Static181.anInt3574 >> 4)) / 8;
			local758 = ((Static181.anInt3574 >> 4) + Static96.anInt5953) / 8;
			@Pc(850) int local850 = (Static372.anInt6696 - (Static117.anInt2450 >> 4)) / 8;
			@Pc(858) int local858 = ((Static117.anInt2450 >> 4) + Static372.anInt6696) / 8;
			for (@Pc(862) int local862 = local754 - 1; local862 <= local758 + 1; local862++) {
				for (@Pc(868) int local868 = local850 - 1; local868 <= local858 + 1; local868++) {
					if (local862 < local754 || local862 > local758 || local868 < local850 || local868 > local858) {
						Static332.aClass100_63.method2518("m" + local862 + "_" + local868);
						Static332.aClass100_63.method2518("l" + local862 + "_" + local868);
					}
				}
			}
		}
		if (Static217.anInt3941 == 28) {
			Static100.method1818(10);
		} else {
			Static100.method1818(30);
			if (Static177.aClass73_6 != null) {
				Static403.method5961(Static369.aClass92_85);
			}
		}
		Static431.method6287();
		Static280.method4210();
		Static76.method6388();
	}
}
