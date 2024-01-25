import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!ps", name = "H", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_62 = new Class340();

	@OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
	public static int anInt8073 = -2;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZIII)V")
	public static void method7116(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg1 && Static253.anInt4790 == arg3 && arg2 == Static405.anInt9127 && (Static504.anInt8428 == Static621.anInt9796 || Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() == 1)) {
			return;
		}
		Static253.anInt4790 = arg3;
		Static405.anInt9127 = arg2;
		Static621.anInt9796 = Static504.anInt8428;
		if (Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() == 1) {
			Static621.anInt9796 = 0;
		}
		Static307.method4889(arg0);
		Static562.method7944(Static507.aClass53_16, Static50.aClass43_12.method596(Static601.anInt9518), Static180.aClass67_5, Static202.aClass75_5, true);
		@Pc(71) int local71 = Static50.anInt606;
		Static50.anInt606 = (Static253.anInt4790 - (Static29.anInt380 >> 4)) * 8;
		@Pc(82) int local82 = Static404.anInt7039;
		Static404.anInt7039 = (Static405.anInt9127 - (Static327.anInt5650 >> 4)) * 8;
		Static680.aClass6_Sub2_Sub9_3 = Static627.method6471(Static253.anInt4790 * 8, Static405.anInt9127 * 8);
		Static66.aClass176_1 = null;
		@Pc(106) int local106 = Static50.anInt606 - local71;
		@Pc(116) int local116 = Static404.anInt7039 - local82;
		@Pc(137) int local137;
		@Pc(139) int local139;
		@Pc(217) int local217;
		@Pc(329) int local329;
		if (arg0 == 12) {
			for (local329 = 0; local329 < Static251.anInt4781; local329++) {
				@Pc(335) Class6_Sub11 local335 = Static216.aClass6_Sub11Array1[local329];
				if (local335 != null) {
					@Pc(340) Class60_Sub1_Sub1_Sub3_Sub2 local340 = local335.aClass60_Sub1_Sub1_Sub3_Sub2_1;
					for (local139 = 0; local139 < 10; local139++) {
						local340.anIntArray263[local139] -= local106;
						local340.anIntArray264[local139] -= local116;
					}
					local340.anInt9048 -= local106 * 512;
					local340.anInt9057 -= local116 * 512;
				}
			}
		} else {
			@Pc(123) boolean local123 = false;
			Static201.anInt4069 = 0;
			@Pc(131) int local131 = (Static29.anInt380 - 1) * 512;
			local137 = Static327.anInt5650 * 512 - 512;
			for (local139 = 0; local139 < Static251.anInt4781; local139++) {
				@Pc(145) Class6_Sub11 local145 = Static216.aClass6_Sub11Array1[local139];
				if (local145 != null) {
					@Pc(150) Class60_Sub1_Sub1_Sub3_Sub2 local150 = local145.aClass60_Sub1_Sub1_Sub3_Sub2_1;
					local150.anInt9057 -= local116 * 512;
					local150.anInt9048 -= local106 * 512;
					if (local150.anInt9048 >= 0 && local131 >= local150.anInt9048 && local150.anInt9057 >= 0 && local137 >= local150.anInt9057) {
						@Pc(215) boolean local215 = true;
						for (local217 = 0; local217 < 10; local217++) {
							local150.anIntArray263[local217] -= local106;
							local150.anIntArray264[local217] -= local116;
							if (local150.anIntArray263[local217] < 0 || local150.anIntArray263[local217] >= Static29.anInt380 || local150.anIntArray264[local217] < 0 || local150.anIntArray264[local217] >= Static327.anInt5650) {
								local215 = false;
							}
						}
						if (local215) {
							Static531.anIntArray580[Static201.anInt4069++] = local150.anInt4845;
						} else {
							local150.method4435((Class294) null);
							local123 = true;
							local145.method9051();
						}
					} else {
						local150.method4435((Class294) null);
						local145.method9051();
						local123 = true;
					}
				}
			}
			if (local123) {
				Static251.anInt4781 = Static419.aClass74_45.method1400();
				Static419.aClass74_45.method1402(Static216.aClass6_Sub11Array1);
			}
		}
		for (local329 = 0; local329 < 2048; local329++) {
			@Pc(400) Class60_Sub1_Sub1_Sub3_Sub1 local400 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local329];
			if (local400 != null) {
				for (local137 = 0; local137 < 10; local137++) {
					local400.anIntArray263[local137] -= local106;
					local400.anIntArray264[local137] -= local116;
				}
				local400.anInt9057 -= local116 * 512;
				local400.anInt9048 -= local106 * 512;
			}
		}
		@Pc(456) Class232[] local456 = Static236.aClass232Array1;
		for (local137 = 0; local137 < local456.length; local137++) {
			@Pc(464) Class232 local464 = local456[local137];
			if (local464 != null) {
				local464.anInt6174 -= local116 * 512;
				local464.anInt6167 -= local106 * 512;
			}
		}
		@Pc(494) Class6_Sub50 local494;
		for (local494 = (Class6_Sub50) Static666.aClass340_75.method8124(); local494 != null; local494 = (Class6_Sub50) Static666.aClass340_75.method8134()) {
			local494.anInt9409 -= local116;
			local494.anInt9410 -= local106;
			if (Static541.anInt9249 != 4 && (local494.anInt9410 < 0 || local494.anInt9409 < 0 || Static29.anInt380 <= local494.anInt9410 || Static327.anInt5650 <= local494.anInt9409)) {
				local494.method9051();
			}
		}
		for (local494 = (Class6_Sub50) Static39.aClass340_2.method8124(); local494 != null; local494 = (Class6_Sub50) Static39.aClass340_2.method8134()) {
			local494.anInt9409 -= local116;
			local494.anInt9410 -= local106;
			if (Static541.anInt9249 != 4 && (local494.anInt9410 < 0 || local494.anInt9409 < 0 || Static29.anInt380 <= local494.anInt9410 || local494.anInt9409 >= Static327.anInt5650)) {
				local494.method9051();
			}
		}
		if (Static541.anInt9249 != 4) {
			for (@Pc(641) Class6_Sub36 local641 = (Class6_Sub36) Static650.aClass74_72.method1404(); local641 != null; local641 = (Class6_Sub36) Static650.aClass74_72.method1405()) {
				@Pc(649) int local649 = (int) (local641.aLong346 & 0x3FFFL);
				@Pc(653) int local653 = local649 - Static50.anInt606;
				local217 = (int) (local641.aLong346 >> 14 & 0x3FFFL);
				@Pc(665) int local665 = local217 - Static404.anInt7039;
				if (local653 < 0 || local665 < 0 || local653 >= Static29.anInt380 || local665 >= Static327.anInt5650) {
					local641.method9051();
				}
			}
		}
		if (Static97.anInt1434 != 0) {
			Static97.anInt1434 -= local106;
			Static208.anInt4167 -= local116;
		}
		Static136.method2602();
		if (arg0 != 12) {
			Static365.anInt6155 -= local116 * 512;
			Static675.anInt5495 -= local116;
			Static484.anInt8246 -= local116;
			Static104.anInt2080 -= local106;
			Static438.anInt7455 -= local106;
			Static475.anInt8090 -= local106 * 512;
			if (Math.abs(local106) > Static29.anInt380 || Math.abs(local116) > Static327.anInt5650) {
				Static433.method6599();
			}
		} else if (Static526.anInt8626 == 4) {
			Static331.anInt8309 -= local116 * 512;
			Static170.anInt3533 -= local106 * 512;
			Static553.anInt8968 -= local116 * 512;
			Static492.anInt3485 -= local106 * 512;
		} else {
			Static526.anInt8626 = 1;
			Static16.anInt232 = -1;
			Static126.anInt2529 = -1;
		}
		Static414.method6396();
		Static120.method2195();
		Static276.aClass340_37.method8129();
		Static437.aClass340_58.method8129();
		Static292.aClass385_4.method8774();
		Static553.method7846();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method7117(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(24) int local24 = local8.length() - 3; local24 > 0; local24 -= 3) {
			local8 = local8.substring(0, local24) + "," + local8.substring(local24);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static50.aClass43_32.method596(Static601.anInt9518) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static50.aClass43_34.method596(Static601.anInt9518) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
