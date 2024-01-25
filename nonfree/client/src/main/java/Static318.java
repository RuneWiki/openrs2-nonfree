import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!kka", name = "q", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!kka", name = "x", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!kka", name = "p", descriptor = "I")
	public static int anInt5798 = 0;

	@OriginalMember(owner = "client!kka", name = "u", descriptor = "I")
	public static int anInt5802 = 0;

	@OriginalMember(owner = "client!kka", name = "w", descriptor = "Lclient!in;")
	public static final Class169 aClass169_152 = new Class169(103, 10);

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(III)Z")
	public static boolean method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static350.method6055(arg1, arg0) | Static89.method1569(arg1, arg0) | Static194.method3765(arg0, arg1)) & Static59.method1119(arg0, arg1);
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(I)V")
	public static void method5255() {
		for (@Pc(10) Class2_Sub1_Sub12 local10 = (Class2_Sub1_Sub12) Static370.aClass271_42.method7177(); local10 != null; local10 = (Class2_Sub1_Sub12) Static370.aClass271_42.method7175()) {
			@Pc(24) Class15_Sub3_Sub3_Sub3 local24 = local10.aClass15_Sub3_Sub3_Sub3_1;
			if (Static62.anInt1184 > local24.anInt4401) {
				local10.method9825();
				local24.method4015();
			} else if (local24.anInt4402 <= Static62.anInt1184) {
				local24.method4014();
				if (local24.anInt4422 > 0) {
					@Pc(52) Class2_Sub6 local52 = (Class2_Sub6) Static630.aClass335_29.method8357((long) (local24.anInt4422 - 1));
					if (local52 != null) {
						@Pc(57) Class15_Sub3_Sub3_Sub1_Sub2 local57 = local52.aClass15_Sub3_Sub3_Sub1_Sub2_1;
						if (local57.anInt11022 >= 0 && Static222.anInt4533 * 512 > local57.anInt11022 && local57.anInt11024 >= 0 && local57.anInt11024 < Static668.anInt11370 * 512) {
							local24.method4011(local57.anInt11024, Static10.method154(local57.anInt11024, local57.anInt11022, local24.aByte142) - local24.anInt4398, Static62.anInt1184, local57.anInt11022);
						}
					}
				}
				if (local24.anInt4422 < 0) {
					@Pc(104) int local104 = -local24.anInt4422 - 1;
					@Pc(111) Class15_Sub3_Sub3_Sub1_Sub1 local111;
					if (Static659.anInt11273 == local104) {
						local111 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2;
					} else {
						local111 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local104];
					}
					if (local111 != null && local111.anInt11022 >= 0 && Static222.anInt4533 * 512 > local111.anInt11022 && local111.anInt11024 >= 0 && Static668.anInt11370 * 512 > local111.anInt11024) {
						local24.method4011(local111.anInt11024, Static10.method154(local111.anInt11024, local111.anInt11022, local24.aByte142) - local24.anInt4398, Static62.anInt1184, local111.anInt11022);
					}
				}
				local24.method4012(Static87.anInt1634);
				Static69.method1291(local24, true);
			}
		}
	}

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "(III)Z")
	public static boolean method5257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static564.method8558(arg1, arg0)) {
			return Static69.method1292(arg0, arg1) | (arg0 & 0xB000) != 0 | Static573.method8708(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static140.method7796(arg1, arg0) | Static160.method9141(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(BIIII)V")
	public static void method5258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class2_Sub12 local6 = (Class2_Sub12) Static158.aClass271_21.method7177(); local6 != null; local6 = (Class2_Sub12) Static158.aClass271_21.method7175()) {
			Static238.method4271(arg2, arg3, arg0, local6, arg1);
		}
		@Pc(183) boolean local183;
		for (@Pc(33) Class2_Sub12 local33 = (Class2_Sub12) Static148.aClass271_11.method7177(); local33 != null; local33 = (Class2_Sub12) Static148.aClass271_11.method7175()) {
			@Pc(37) byte local37 = 1;
			@Pc(42) Class248 local42 = local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.method3673();
			if (local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt3968 == -1 || local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.aBoolean314) {
				local37 = 0;
			} else if (local42.anInt7475 == local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt3968 || local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt3968 == local42.anInt7443 || local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt3968 == local42.anInt7472 || local42.anInt7447 == local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt3968) {
				local37 = 2;
			} else if (local42.anInt7440 == local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt3968 || local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt3968 == local42.anInt7458 || local42.anInt7451 == local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt3968 || local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt3968 == local42.anInt7437) {
				local37 = 3;
			}
			if (local33.anInt1196 != local37) {
				@Pc(139) int local139 = Static623.method9262(local33.aClass15_Sub3_Sub3_Sub1_Sub2_2);
				@Pc(143) Class312 local143 = local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.aClass312_1;
				if (local143.anIntArray458 != null) {
					local143 = local143.method7953(Static113.aClass282_1);
				}
				if (local143 == null || local139 == -1) {
					local33.anInt1211 = -1;
					local33.aBoolean65 = false;
					local33.anInt1196 = local37;
				} else if (local139 == local33.anInt1211 && local143.aBoolean660 == local33.aBoolean65) {
					local33.anInt1206 = local143.anInt9059;
					local33.anInt1196 = local37;
				} else {
					local183 = false;
					if (local33.aClass2_Sub26_Sub5_1 == null) {
						local183 = true;
					} else {
						local33.anInt1206 -= 512;
						if (local33.anInt1206 <= 0) {
							Static270.aClass2_Sub26_Sub4_2.method7390(local33.aClass2_Sub26_Sub5_1);
							local33.aClass2_Sub26_Sub5_1 = null;
							local183 = true;
						}
					}
					if (local183) {
						local33.anInt1196 = local37;
						local33.anInt1206 = local143.anInt9059;
						local33.aBoolean65 = local143.aBoolean660;
						local33.aClass2_Sub44_Sub1_2 = null;
						local33.anInt1211 = local139;
						local33.aClass2_Sub46_2 = null;
					}
				}
			}
			local33.anInt1207 = local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt11022;
			local33.anInt1200 = local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt11022 + (local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.method3690() << 8);
			local33.anInt1202 = local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt11024;
			local33.anInt1201 = local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.anInt11024 + (local33.aClass15_Sub3_Sub3_Sub1_Sub2_2.method3690() << 8);
			Static238.method4271(arg2, arg3, arg0, local33, arg1);
		}
		for (@Pc(299) Class2_Sub12 local299 = (Class2_Sub12) Static555.aClass335_42.method8358(); local299 != null; local299 = (Class2_Sub12) Static555.aClass335_42.method8355()) {
			@Pc(303) byte local303 = 1;
			@Pc(308) Class248 local308 = local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.method3673();
			if (local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt3968 == -1 || local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.aBoolean314) {
				local303 = 0;
			} else if (local308.anInt7475 == local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt3968 || local308.anInt7443 == local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt3968 || local308.anInt7472 == local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt3968 || local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt3968 == local308.anInt7447) {
				local303 = 2;
			} else if (local308.anInt7440 == local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt3968 || local308.anInt7458 == local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt3968 || local308.anInt7451 == local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt3968 || local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt3968 == local308.anInt7437) {
				local303 = 3;
			}
			if (local303 != local299.anInt1196) {
				@Pc(397) int local397 = Static170.method3354(local299.aClass15_Sub3_Sub3_Sub1_Sub1_1);
				if (local397 == local299.anInt1211 && local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.aBoolean177 == local299.aBoolean65) {
					local299.anInt1206 = local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt2380;
					local299.anInt1196 = local303;
				} else {
					local183 = false;
					if (local299.aClass2_Sub26_Sub5_1 == null) {
						local183 = true;
					} else {
						local299.anInt1206 -= 512;
						if (local299.anInt1206 <= 0) {
							Static270.aClass2_Sub26_Sub4_2.method7390(local299.aClass2_Sub26_Sub5_1);
							local299.aClass2_Sub26_Sub5_1 = null;
							local183 = true;
						}
					}
					if (local183) {
						local299.aBoolean65 = local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.aBoolean177;
						local299.anInt1196 = local303;
						local299.anInt1206 = local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt2380;
						local299.aClass2_Sub46_2 = null;
						local299.aClass2_Sub44_Sub1_2 = null;
						local299.anInt1211 = local397;
					}
				}
			}
			local299.anInt1207 = local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt11022;
			local299.anInt1200 = local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt11022 + (local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.method3690() << 8);
			local299.anInt1202 = local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt11024;
			local299.anInt1201 = local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt11024 + (local299.aClass15_Sub3_Sub3_Sub1_Sub1_1.method3690() << 8);
			Static238.method4271(arg2, arg3, arg0, local299, arg1);
		}
	}
}
