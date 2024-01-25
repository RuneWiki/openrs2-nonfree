import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "J")
	public static long aLong38;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[Lclient!vr;")
	public static Class33[] aClass33Array8;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_33 = new Class338();

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_20 = new Class180(64, 4);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZIII)V")
	public static void method1331(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg1 && arg0 == Static601.anInt9665 && arg2 == Static288.anInt4926 && (Static34.anInt808 == Static309.anInt5138 || Static24.aClass3_Sub22_4.lb.method7116() == 1)) {
			return;
		}
		Static288.anInt4926 = arg2;
		Static34.anInt808 = Static309.anInt5138;
		Static601.anInt9665 = arg0;
		if (Static24.aClass3_Sub22_4.lb.method7116() == 1) {
			Static34.anInt808 = 0;
		}
		Static553.method7892(arg3);
		Static21.method603(Static504.aClass69_11, Static674.aClass13_22, Static253.aClass88_19, true, Static601.aClass346_14.method8440(Static609.anInt9834));
		@Pc(66) int local66 = Static287.anInt4910;
		@Pc(68) int local68 = Static72.anInt1361;
		Static287.anInt4910 = (Static601.anInt9665 - (Static158.anInt927 >> 4)) * 8;
		Static72.anInt1361 = (Static288.anInt4926 - (Static515.anInt8292 >> 4)) * 8;
		Static604.aClass3_Sub11_Sub21_3 = Static317.method4939(Static601.anInt9665 * 8, Static288.anInt4926 * 8);
		Static537.aClass130_2 = null;
		@Pc(101) int local101 = Static287.anInt4910 - local66;
		@Pc(106) int local106 = Static72.anInt1361 - local68;
		@Pc(113) int local113;
		@Pc(126) int local126;
		@Pc(245) int local245;
		@Pc(188) int local188;
		if (arg3 == 11) {
			for (local113 = 0; local113 < Static567.anInt5909; local113++) {
				@Pc(119) Class3_Sub3 local119 = Static84.aClass3_Sub3Array1[local113];
				if (local119 != null) {
					@Pc(124) Class28_Sub1_Sub1_Sub1_Sub2 local124 = local119.aClass28_Sub1_Sub1_Sub1_Sub2_1;
					for (local126 = 0; local126 < 10; local126++) {
						local124.anIntArray956[local126] -= local101;
						local124.anIntArray955[local126] -= local106;
					}
					local124.anInt10731 -= local106 * 512;
					local124.anInt10729 -= local101 * 512;
				}
			}
		} else {
			Static561.anInt9114 = 0;
			@Pc(176) boolean local176 = false;
			@Pc(182) int local182 = (Static158.anInt927 - 1) * 512;
			local188 = (Static515.anInt8292 - 1) * 512;
			for (local126 = 0; local126 < Static567.anInt5909; local126++) {
				@Pc(196) Class3_Sub3 local196 = Static84.aClass3_Sub3Array1[local126];
				if (local196 != null) {
					@Pc(201) Class28_Sub1_Sub1_Sub1_Sub2 local201 = local196.aClass28_Sub1_Sub1_Sub1_Sub2_1;
					local201.anInt10731 -= local106 * 512;
					local201.anInt10729 -= local101 * 512;
					if (local201.anInt10729 >= 0 && local201.anInt10729 <= local182 && local201.anInt10731 >= 0 && local188 >= local201.anInt10731) {
						@Pc(243) boolean local243 = true;
						for (local245 = 0; local245 < 10; local245++) {
							local201.anIntArray956[local245] -= local101;
							local201.anIntArray955[local245] -= local106;
							if (local201.anIntArray956[local245] < 0 || Static158.anInt927 <= local201.anIntArray956[local245] || local201.anIntArray955[local245] < 0 || local201.anIntArray955[local245] >= Static515.anInt8292) {
								local243 = false;
							}
						}
						if (local243) {
							Static131.anIntArray226[Static561.anInt9114++] = local201.anInt10762;
						} else {
							local201.method9335((Class300) null);
							local176 = true;
							local196.method9380();
						}
					} else {
						local201.method9335((Class300) null);
						local176 = true;
						local196.method9380();
					}
				}
			}
			if (local176) {
				Static567.anInt5909 = Static522.aClass83_34.method2378();
				Static522.aClass83_34.method2367(Static84.aClass3_Sub3Array1);
			}
		}
		for (local113 = 0; local113 < 2048; local113++) {
			@Pc(350) Class28_Sub1_Sub1_Sub1_Sub1 local350 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local113];
			if (local350 != null) {
				for (local188 = 0; local188 < 10; local188++) {
					local350.anIntArray956[local188] -= local101;
					local350.anIntArray955[local188] -= local106;
				}
				local350.anInt10729 -= local101 * 512;
				local350.anInt10731 -= local106 * 512;
			}
		}
		@Pc(400) Class142[] local400 = Static292.aClass142Array1;
		for (local188 = 0; local188 < local400.length; local188++) {
			@Pc(408) Class142 local408 = local400[local188];
			if (local408 != null) {
				local408.anInt4304 -= local101 * 512;
				local408.anInt4299 -= local106 * 512;
			}
		}
		@Pc(436) Class3_Sub23 local436;
		for (local436 = (Class3_Sub23) Static482.aClass338_192.method8177(); local436 != null; local436 = (Class3_Sub23) Static482.aClass338_192.method8168()) {
			local436.anInt3188 -= local106;
			local436.anInt3189 -= local101;
			if (Static567.anInt5924 != 4 && (local436.anInt3189 < 0 || local436.anInt3188 < 0 || local436.anInt3189 >= Static158.anInt927 || local436.anInt3188 >= Static515.anInt8292)) {
				local436.method9380();
			}
		}
		for (local436 = (Class3_Sub23) Static165.aClass338_227.method8177(); local436 != null; local436 = (Class3_Sub23) Static165.aClass338_227.method8168()) {
			local436.anInt3189 -= local101;
			local436.anInt3188 -= local106;
			if (Static567.anInt5924 != 4 && (local436.anInt3189 < 0 || local436.anInt3188 < 0 || Static158.anInt927 <= local436.anInt3189 || Static515.anInt8292 <= local436.anInt3188)) {
				local436.method9380();
			}
		}
		if (Static567.anInt5924 != 4) {
			for (@Pc(550) Class3_Sub16 local550 = (Class3_Sub16) Static98.aClass83_6.method2375(); local550 != null; local550 = (Class3_Sub16) Static98.aClass83_6.method2370()) {
				@Pc(558) int local558 = (int) (local550.aLong311 & 0x3FFFL);
				@Pc(563) int local563 = local558 - Static287.anInt4910;
				local245 = (int) (local550.aLong311 >> 14 & 0x3FFFL);
				@Pc(575) int local575 = local245 - Static72.anInt1361;
				if (local563 < 0 || local575 < 0 || local563 >= Static158.anInt927 || Static515.anInt8292 <= local575) {
					local550.method9380();
				}
			}
		}
		if (Static661.anInt10551 != 0) {
			Static514.anInt8261 -= local106;
			Static661.anInt10551 -= local101;
		}
		Static543.method7808();
		if (arg3 != 11) {
			Static38.anInt905 -= local106;
			Static509.anInt8222 -= local101 * 512;
			Static547.anInt8967 -= local101;
			Static652.anInt10382 -= local106 * 512;
			Static225.anInt4206 -= local101;
			Static532.anInt8768 -= local106;
			if (Math.abs(local101) > Static158.anInt927 || Math.abs(local106) > Static515.anInt8292) {
				Static225.method3837();
			}
		} else if (Static428.anInt6834 == 4) {
			Static96.anInt1798 -= local106 * 512;
			Static474.anInt7824 -= local101 * 512;
			Static350.anInt5703 -= local106 * 512;
			Static294.anInt6316 -= local101 * 512;
		} else {
			Static428.anInt6834 = 1;
			Static153.anInt3036 = -1;
			Static410.anInt6542 = -1;
		}
		Static313.method4795();
		Static649.method8991();
		Static540.aClass338_202.method8175();
		Static171.aClass338_90.method8175();
		Static476.aClass371_4.method8915();
		Static408.method5791();
	}
}
