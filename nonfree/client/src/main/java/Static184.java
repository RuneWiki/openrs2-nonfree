import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Lclient!mg;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[100];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public static void method2898() {
		Static397.method5304(Static38.aClass135_Sub1_1.aBoolean367);
		Static306.aClass1_Sub19_Sub4_3 = new Class1_Sub19_Sub4();
		Static306.aClass1_Sub19_Sub4_3.method3657();
		Static229.aClass66_1 = Static432.method5742(0, Static77.aClass180_1, Static155.aCanvas4, 22050);
		Static229.aClass66_1.method5629(Static306.aClass1_Sub19_Sub4_3);
		Static296.method4280(Static30.aClass246_24, Static209.aClass246_117, Static306.aClass1_Sub19_Sub4_3, Static261.aClass246_145);
		Static253.aClass66_2 = Static432.method5742(1, Static77.aClass180_1, Static155.aCanvas4, 2048);
		Static59.aClass1_Sub19_Sub2_1 = new Class1_Sub19_Sub2();
		Static253.aClass66_2.method5629(Static59.aClass1_Sub19_Sub2_1);
		Static187.aClass173_1 = new Class173(22050, Static247.anInt7108);
		Static412.anInt6646 = Static312.aClass246_168.method5478("scape main");
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	public static void method2899() {
		Static416.aClass181_60.method4101();
		for (@Pc(18) Class1_Sub3 local18 = (Class1_Sub3) Static55.aClass181_63.method4112(); local18 != null; local18 = (Class1_Sub3) Static55.aClass181_63.method4104()) {
			if (local18.anInt117 < 1000) {
				local18.method6020();
				Static416.aClass181_60.method4102(local18);
			}
		}
		Static416.aClass181_60.method4103(Static55.aClass181_63);
		@Pc(46) int local46 = -1;
		@Pc(51) Class1_Sub7 local51 = (Class1_Sub7) Static447.aClass181_64.method4112();
		if (local51 != null) {
			local46 = local51.method3628();
		}
		if (!Static385.aBoolean436) {
			if (local46 == 0 && (Static357.anInt5884 == 1 && Static217.anInt4004 > 2 || Static352.method4870())) {
				local46 = 2;
			}
			if (local46 == 2 && Static217.anInt4004 > 0 && local51 != null) {
				if (Static455.aClass251_14 == null && Static34.anInt714 == 0) {
					Static124.method5866(local51.method3632(), local51.method3633());
				} else {
					Static452.anInt7262 = 2;
				}
			}
			if (local46 == 0 && Static217.anInt4004 > 0) {
				Static251.method3760();
			}
			if (Static455.aClass251_14 == null && Static34.anInt714 == 0) {
				Static144.aClass1_Sub3_4 = null;
				Static452.anInt7262 = 0;
				return;
			}
			return;
		}
		@Pc(125) int local125;
		@Pc(129) int local129;
		if (local46 == -1) {
			local125 = Static125.aClass114_1.method2701();
			local129 = Static125.aClass114_1.method2698();
			if (Static280.anInt4913 - 10 > local125 || Static280.anInt4913 + Static270.anInt4802 + 10 < local125 || local129 < Static315.anInt5432 - 10 || local129 > Static315.anInt5432 + Static389.anInt6274 + 10) {
				Static310.method4414();
			}
		}
		if (local46 != 0) {
			return;
		}
		local125 = Static280.anInt4913;
		local129 = Static315.anInt5432;
		@Pc(177) int local177 = Static270.anInt4802;
		@Pc(181) int local181 = local51.method3633();
		@Pc(185) int local185 = local51.method3632();
		@Pc(187) int local187 = -1;
		@Pc(206) int local206;
		for (@Pc(189) int local189 = 0; local189 < Static217.anInt4004; local189++) {
			if (Static297.aBoolean374) {
				local206 = (Static217.anInt4004 - local189 - 1) * 16 + local129 + 33;
				if (local181 > local125 && local181 < local125 + local177 && local206 - 13 < local185 && local206 + 4 > local185) {
					local187 = local189;
				}
			} else {
				local206 = (Static217.anInt4004 - local189 - 1) * 16 + local129 + 31;
				if (local125 < local181 && local177 + local125 > local181 && local185 > local206 - 13 && local206 + 3 > local185) {
					local187 = local189;
				}
			}
		}
		if (local187 != -1) {
			local206 = 0;
			@Pc(295) Class162 local295 = new Class162(Static55.aClass181_63);
			for (@Pc(300) Class1_Sub3 local300 = (Class1_Sub3) local295.method3754(); local300 != null; local300 = (Class1_Sub3) local295.method3757()) {
				if (local206 == local187) {
					Static98.method1762(local181, local185, local300);
				}
				local206++;
			}
		}
		Static310.method4414();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILclient!jt;Z)V")
	public static void method2901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class129 arg3) {
		for (@Pc(15) Class1_Sub35 local15 = (Class1_Sub35) Static298.aClass181_57.method4112(); local15 != null; local15 = (Class1_Sub35) Static298.aClass181_57.method4104()) {
			if (arg1 == local15.anInt5284 && arg0 << 7 == local15.anInt5290 && local15.anInt5279 == arg2 << 7 && local15.aClass129_1.anInt3530 == arg3.anInt3530) {
				if (local15.aClass1_Sub19_Sub1_3 != null) {
					Static59.aClass1_Sub19_Sub2_1.method2185(local15.aClass1_Sub19_Sub1_3);
					local15.aClass1_Sub19_Sub1_3 = null;
				}
				if (local15.aClass1_Sub19_Sub1_4 != null) {
					Static59.aClass1_Sub19_Sub2_1.method2185(local15.aClass1_Sub19_Sub1_4);
					local15.aClass1_Sub19_Sub1_4 = null;
				}
				local15.method6020();
				return;
			}
		}
	}
}
