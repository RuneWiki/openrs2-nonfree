import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!tea", name = "D", descriptor = "Lclient!pn;")
	public static Class3_Sub44 aClass3_Sub44_1 = new Class3_Sub44(0, 0);

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IBI)Z")
	public static boolean method8333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIBI)V")
	public static void method8337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class3_Sub49 local6 = (Class3_Sub49) Static352.aClass357_30.method8391(); local6 != null; local6 = (Class3_Sub49) Static352.aClass357_30.method8392()) {
			Static408.method6085(arg1, arg2, local6, arg0, arg3);
		}
		@Pc(151) int local151;
		@Pc(191) boolean local191;
		for (@Pc(35) Class3_Sub49 local35 = (Class3_Sub49) Static627.aClass357_58.method8391(); local35 != null; local35 = (Class3_Sub49) Static627.aClass357_58.method8392()) {
			@Pc(41) byte local41 = 1;
			@Pc(46) Class274 local46 = local35.aClass19_Sub1_Sub3_Sub2_Sub1_3.method6600();
			@Pc(54) int local54 = local35.aClass19_Sub1_Sub3_Sub2_Sub1_3.aClass100_8.method8976();
			if (local54 == -1 || local35.aClass19_Sub1_Sub3_Sub2_Sub1_3.aBoolean595) {
				local41 = 0;
			} else if (local54 == local46.anInt8174 || local46.anInt8180 == local54 || local54 == local46.anInt8171 || local54 == local46.anInt8197) {
				local41 = 2;
			} else if (local46.anInt8185 == local54 || local46.anInt8166 == local54 || local54 == local46.anInt8159 || local46.anInt8181 == local54) {
				local41 = 3;
			}
			if (local35.anInt9903 != local41) {
				local151 = Static168.method8930(local35.aClass19_Sub1_Sub3_Sub2_Sub1_3);
				@Pc(155) Class18 local155 = local35.aClass19_Sub1_Sub3_Sub2_Sub1_3.aClass18_1;
				if (local155.anIntArray23 != null) {
					local155 = local155.method407(Static577.aClass362_1);
				}
				if (local155 == null || local151 == -1) {
					local35.anInt9910 = -1;
					local35.aBoolean720 = false;
					local35.anInt9903 = local41;
				} else if (local35.anInt9910 == local151 && local155.aBoolean24 == local35.aBoolean720) {
					local35.anInt9907 = local155.anInt445;
					local35.anInt9903 = local41;
				} else {
					local191 = false;
					if (local35.aClass3_Sub22_Sub1_3 == null) {
						local191 = true;
					} else {
						local35.anInt9907 -= 512;
						if (local35.anInt9907 <= 0) {
							Static155.aClass3_Sub22_Sub4_1.method9062(local35.aClass3_Sub22_Sub1_3);
							local35.aClass3_Sub22_Sub1_3 = null;
							local191 = true;
						}
					}
					if (local191) {
						local35.aClass3_Sub33_Sub1_3 = null;
						local35.anInt9910 = local151;
						local35.anInt9907 = local155.anInt445;
						local35.aClass3_Sub36_2 = null;
						local35.anInt9903 = local41;
						local35.aBoolean720 = local155.aBoolean24;
					}
				}
			}
			local35.anInt9904 = local35.aClass19_Sub1_Sub3_Sub2_Sub1_3.anInt11204;
			local35.anInt9899 = local35.aClass19_Sub1_Sub3_Sub2_Sub1_3.anInt11204 + (local35.aClass19_Sub1_Sub3_Sub2_Sub1_3.method6592() << 8);
			local35.anInt9906 = local35.aClass19_Sub1_Sub3_Sub2_Sub1_3.anInt11211;
			local35.anInt9897 = local35.aClass19_Sub1_Sub3_Sub2_Sub1_3.anInt11211 + (local35.aClass19_Sub1_Sub3_Sub2_Sub1_3.method6592() << 8);
			Static408.method6085(arg1, arg2, local35, arg0, arg3);
		}
		for (@Pc(322) Class3_Sub49 local322 = (Class3_Sub49) Static81.aClass136_7.method3509(); local322 != null; local322 = (Class3_Sub49) Static81.aClass136_7.method3506()) {
			@Pc(328) byte local328 = 1;
			@Pc(333) Class274 local333 = local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.method6600();
			local151 = local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.aClass100_8.method8976();
			if (local151 == -1 || local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.aBoolean595) {
				local328 = 0;
			} else if (local151 == local333.anInt8174 || local151 == local333.anInt8180 || local333.anInt8171 == local151 || local151 == local333.anInt8197) {
				local328 = 2;
			} else if (local333.anInt8185 == local151 || local151 == local333.anInt8166 || local151 == local333.anInt8159 || local151 == local333.anInt8181) {
				local328 = 3;
			}
			if (local322.anInt9903 != local328) {
				@Pc(437) int local437 = Static681.method8984(local322.aClass19_Sub1_Sub3_Sub2_Sub2_3, -11542);
				if (local322.anInt9910 == local437 && local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.aBoolean598 == local322.aBoolean720) {
					local322.anInt9907 = local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.anInt7846;
					local322.anInt9903 = local328;
				} else {
					local191 = false;
					if (local322.aClass3_Sub22_Sub1_3 == null) {
						local191 = true;
					} else {
						local322.anInt9907 -= 512;
						if (local322.anInt9907 <= 0) {
							Static155.aClass3_Sub22_Sub4_1.method9062(local322.aClass3_Sub22_Sub1_3);
							local191 = true;
							local322.aClass3_Sub22_Sub1_3 = null;
						}
					}
					if (local191) {
						local322.aClass3_Sub36_2 = null;
						local322.aClass3_Sub33_Sub1_3 = null;
						local322.aBoolean720 = local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.aBoolean598;
						local322.anInt9910 = local437;
						local322.anInt9907 = local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.anInt7846;
						local322.anInt9903 = local328;
					}
				}
			}
			local322.anInt9904 = local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.anInt11204;
			local322.anInt9899 = local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.anInt11204 + (local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.method6592() << 8);
			local322.anInt9906 = local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.anInt11211;
			local322.anInt9897 = local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.anInt11211 + (local322.aClass19_Sub1_Sub3_Sub2_Sub2_3.method6592() << 8);
			Static408.method6085(arg1, arg2, local322, arg0, arg3);
		}
		if (-77 != -77) {
			aClass3_Sub44_1 = null;
		}
	}
}
