import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
	public static int anInt5910 = -2;

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_97 = new Class2(65, 4);

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "Lclient!hf;")
	public static Class103 aClass103_1 = new Class103(8);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLclient!ya;)V")
	public static void method4736(@OriginalArg(1) Class51 arg0) {
		@Pc(7) int local7 = Static415.anInt6598;
		@Pc(9) int local9 = Static351.anInt5637;
		@Pc(11) int local11 = Static171.anInt3077;
		@Pc(15) int local15 = Static253.anInt4289 - 3;
		if (Static446.aClass11_20 == null || Static368.aClass11_19 == null) {
			if (Static25.aClass178_9.method3848(Static426.anInt7021) && Static25.aClass178_9.method3848(Static127.anInt2463)) {
				Static446.aClass11_20 = arg0.method5308(Static469.method5145(Static25.aClass178_9, Static426.anInt7021, 0));
				@Pc(44) Class246 local44 = Static469.method5145(Static25.aClass178_9, Static127.anInt2463, 0);
				Static368.aClass11_19 = arg0.method5308(local44);
				local44.method5147();
				Static21.aClass11_2 = arg0.method5308(local44);
			} else {
				arg0.O(local7, local9, local11, 20, 255 - Static259.anInt4366 << 24 | Static366.anInt5866, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static446.aClass11_20 != null && Static368.aClass11_19 != null) {
			local87 = (local11 - Static368.aClass11_19.la() * 2) / Static446.aClass11_20.la();
			for (local89 = 0; local89 < local87; local89++) {
				Static446.aClass11_20.method4394(Static368.aClass11_19.la() + local7 + local89 * Static446.aClass11_20.la(), local9);
			}
			Static368.aClass11_19.method4394(local7, local9);
			Static21.aClass11_2.method4394(local11 + local7 - Static21.aClass11_2.la(), local9);
		}
		Static305.aClass63_15.method4581(-1, local9 + 14, Static233.anInt5381 | 0xFF000000, Static448.aClass55_146.method1205(Static5.anInt20), local7 + 3);
		arg0.O(local7, local9 + 20, local11, local15 - 20, Static366.anInt5866 | 255 - Static259.anInt4366 << 24, 1);
		local87 = Static154.aClass50_1.method1860();
		local89 = Static154.aClass50_1.method1870();
		@Pc(176) int local176 = 0;
		@Pc(198) int local198;
		for (@Pc(181) Class7_Sub39 local181 = (Class7_Sub39) Static237.aClass85_26.method2010(); local181 != null; local181 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
			local198 = local9 + (-local176 + (Static102.anInt2085 - 1)) * 16 + 13 + 20;
			local176++;
			if (local7 < local87 && local87 < local11 + local7 && local89 > local198 - 13 && local89 < local198 + 4 && local181.aBoolean392) {
				arg0.O(local7, local198 - 12, local11, 16, Static427.anInt7127 | 255 - Static4.anInt7499 << 24, 1);
			}
		}
		if ((Static218.aClass11_13 == null || Static3.aClass11_1 == null || Static293.aClass11_15 == null) && Static25.aClass178_9.method3848(Static322.anInt5340) && Static25.aClass178_9.method3848(Static374.anInt6088) && Static25.aClass178_9.method3848(Static220.anInt3888)) {
			@Pc(282) Class246 local282 = Static469.method5145(Static25.aClass178_9, Static374.anInt6088, 0);
			Static3.aClass11_1 = arg0.method5308(local282);
			local282.method5147();
			Static336.aClass11_17 = arg0.method5308(local282);
			Static218.aClass11_13 = arg0.method5308(Static469.method5145(Static25.aClass178_9, Static322.anInt5340, 0));
			@Pc(307) Class246 local307 = Static469.method5145(Static25.aClass178_9, Static220.anInt3888, 0);
			Static293.aClass11_15 = arg0.method5308(local307);
			local307.method5147();
			Static245.aClass11_14 = arg0.method5308(local307);
		}
		local176 = 0;
		@Pc(379) int local379;
		@Pc(340) int local340;
		if (Static218.aClass11_13 != null && Static3.aClass11_1 != null && Static293.aClass11_15 != null) {
			local198 = (local11 - Static293.aClass11_15.la() * 2) / Static218.aClass11_13.la();
			for (local340 = 0; local340 < local198; local340++) {
				Static218.aClass11_13.method4394(local7 + Static293.aClass11_15.la() + Static218.aClass11_13.la() * local340, -Static218.aClass11_13.ma() + (local9 - -local15));
			}
			local379 = (local15 - Static293.aClass11_15.ma() - 20) / Static3.aClass11_1.ma();
			for (@Pc(381) int local381 = 0; local381 < local379; local381++) {
				Static3.aClass11_1.method4394(local7, local9 + Static3.aClass11_1.ma() * local381 + 20);
				Static336.aClass11_17.method4394(local7 + local11 - Static336.aClass11_17.la(), Static3.aClass11_1.ma() * local381 + local9 + 20);
			}
			Static293.aClass11_15.method4394(local7, local15 + local9 - Static293.aClass11_15.ma());
			Static245.aClass11_14.method4394(local11 + local7 - Static293.aClass11_15.la(), -Static293.aClass11_15.ma() + local15 + local9);
		}
		for (@Pc(449) Class7_Sub39 local449 = (Class7_Sub39) Static237.aClass85_26.method2010(); local449 != null; local449 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
			local340 = local9 + (Static102.anInt2085 + -1 + -local176) * 16 + 33;
			local379 = Static233.anInt5381 | 0xFF000000;
			if (local87 > local7 && local87 < local7 + local11 && local340 - 13 < local89 && local340 + 4 > local89 && local449.aBoolean392) {
				local379 = Static413.anInt6557 | 0xFF000000;
			}
			@Pc(498) int[] local498 = null;
			if (Static59.method821(local449.anInt5893)) {
				local498 = Static259.aClass206_2.method4320((int) local449.aLong186).anIntArray81;
			} else if (local449.anInt5895 != -1) {
				local498 = Static259.aClass206_2.method4320(local449.anInt5895).anIntArray81;
			} else if (Static300.method4007(local449.anInt5893)) {
				@Pc(536) Class26_Sub2_Sub4_Sub1 local536 = Static171.aClass26_Sub2_Sub4_Sub1Array1[(int) local449.aLong186];
				if (local536 != null) {
					@Pc(541) Class249 local541 = local536.aClass249_1;
					if (local541.anIntArray579 != null) {
						local541 = local541.method5179(Static224.aClass239_7);
					}
					if (local541 != null) {
						local498 = local541.anIntArray582;
					}
				}
			} else if (Static139.method2166(local449.anInt5893)) {
				@Pc(575) Class189 local575;
				if (local449.anInt5893 == 1011) {
					local575 = Static411.aClass142_4.method3148((int) local449.aLong186);
				} else {
					local575 = Static411.aClass142_4.method3148((int) (local449.aLong186 >>> 32 & 0x7FFFFFFFL));
				}
				if (local575.anIntArray448 != null) {
					local575 = local575.method4038(Static224.aClass239_7);
				}
				if (local575 != null) {
					local498 = local575.anIntArray449;
				}
			}
			@Pc(604) String local604 = Static336.method4381(local449);
			if (local498 != null) {
				local604 = local604 + Static96.method1690(local498);
			}
			Static305.aClass63_15.method4586(local7 + 3, Static68.anIntArray99, local379, local340, Static423.aClass11Array15, local604);
			if (local449.aBoolean391) {
				Static454.aClass11_21.method4394(Static35.aClass57_13.method1387(local604) + local7 + 5, local340 + -12);
			}
			local176++;
		}
		Static261.method3518(Static253.anInt4289, Static171.anInt3077, Static415.anInt6598, Static351.anInt5637);
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)V")
	public static void method4738() {
		if (Static139.anInt2671 < 0) {
			return;
		}
		@Pc(16) long local16 = Static158.method2342();
		Static139.anInt2671 = (int) ((long) Static139.anInt2671 + Static188.aLong118 - local16);
		if (Static139.anInt2671 <= 0) {
			Static431.aFloat214 = Static34.aClass156_1.aFloat121;
			Static295.anInt4913 = Static34.aClass156_1.anInt4250;
			Static374.aFloat174 = Static34.aClass156_1.aFloat124;
			Static427.anInt7140 = Static34.aClass156_1.anInt4254;
			Static203.aFloat103 = Static34.aClass156_1.aFloat120;
			Static80.aFloat46 = Static34.aClass156_1.aFloat122;
			Static312.anInt5171 = Static34.aClass156_1.anInt4253;
			Static147.aClass96_1 = Static34.aClass156_1.aClass96_3;
			Static220.aFloat109 = Static34.aClass156_1.aFloat119;
			Static360.aFloat167 = Static34.aClass156_1.aFloat123;
			Static139.anInt2671 = -1;
		} else {
			@Pc(70) int local70 = (Static139.anInt2671 << 8) / Static284.anInt870;
			@Pc(75) int local75 = 255 - local70;
			@Pc(80) float local80 = (float) local70 / 255.0F;
			@Pc(84) float local84 = 1.0F - local80;
			Static427.anInt7140 = (local70 * (Static190.anInt3383 & 0xFF00) + (Static34.aClass156_1.anInt4254 & 0xFF00) * local75 & 0xFF0000) + (local75 * (Static34.aClass156_1.anInt4254 & 0xFF00FF) + (Static190.anInt3383 & 0xFF00FF) * local70 & 0xFF00FF00) >>> 8;
			Static374.aFloat174 = Static172.aFloat91 + (Static34.aClass156_1.aFloat124 - Static172.aFloat91) * local84;
			Static220.aFloat109 = Static298.aFloat146 + (Static34.aClass156_1.aFloat119 - Static298.aFloat146) * local84;
			Static360.aFloat167 = Static170.aFloat135 + local84 * (Static34.aClass156_1.aFloat123 - Static170.aFloat135);
			Static80.aFloat46 = Static329.aFloat156 + local84 * (Static34.aClass156_1.aFloat122 - Static329.aFloat156);
			Static295.anInt4913 = Static254.anInt4290 * local70 + local75 * Static34.aClass156_1.anInt4250 >> 8;
			Static431.aFloat214 = Static275.aFloat133 + (Static34.aClass156_1.aFloat121 - Static275.aFloat133) * local84;
			Static312.anInt5171 = (local70 * (Static394.anInt6303 & 0xFF00FF) + (Static34.aClass156_1.anInt4253 & 0xFF00FF) * local75 & 0xFF00FF00) + (local75 * (Static34.aClass156_1.anInt4253 & 0xFF00) + local70 * (Static394.anInt6303 & 0xFF00) & 0xFF0000) >>> 8;
			Static203.aFloat103 = Static133.aFloat63 + local84 * (Static34.aClass156_1.aFloat120 - Static133.aFloat63);
			if (Static34.aClass156_1.aClass96_3 != Static203.aClass96_2) {
				Static147.aClass96_1 = Static253.aClass51_7.method5320(Static203.aClass96_2, Static34.aClass156_1.aClass96_3, local84, Static147.aClass96_1);
			}
		}
		Static188.aLong118 = local16;
	}
}
