import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!vv", name = "z", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_374 = new Class12(66, -2);

	@OriginalMember(owner = "client!vv", name = "B", descriptor = "Lclient!tn;")
	public static Class229 aClass229_14 = null;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method5832(@OriginalArg(1) Class121 arg0) {
		@Pc(7) int local7 = Static256.anInt4398;
		@Pc(9) int local9 = Static423.anInt7379;
		@Pc(11) int local11 = Static102.anInt1978;
		@Pc(15) int local15 = Static369.anInt6690 - 3;
		if (Static50.aClass78_5 == null || Static265.aClass78_15 == null) {
			if (Static353.aClass109_79.method2348(Static376.anInt6771) && Static353.aClass109_79.method2348(Static368.anInt6681)) {
				Static50.aClass78_5 = arg0.method4589(Static457.method1163(Static353.aClass109_79, Static376.anInt6771, 0));
				@Pc(63) Class63 local63 = Static457.method1163(Static353.aClass109_79, Static368.anInt6681, 0);
				Static265.aClass78_15 = arg0.method4589(local63);
				local63.method1164();
				Static129.aClass78_8 = arg0.method4589(local63);
			} else {
				arg0.NA(local7, local9, local11, 20, 255 - Static84.anInt6177 << 24 | Static383.anInt3778, 1);
			}
		}
		@Pc(92) int local92;
		@Pc(90) int local90;
		if (Static50.aClass78_5 != null && Static265.aClass78_15 != null) {
			local90 = (local11 - Static265.aClass78_15.UA() * 2) / Static50.aClass78_5.UA();
			for (local92 = 0; local92 < local90; local92++) {
				Static50.aClass78_5.method6003(local7 + Static265.aClass78_15.UA() + Static50.aClass78_5.UA() * local92, local9);
			}
			Static265.aClass78_15.method6003(local7, local9);
			Static129.aClass78_8.method6003(local11 + local7 - Static129.aClass78_8.UA(), local9);
		}
		Static237.aClass4_5.method5839(-1, local9 + 14, Static223.anInt3885 | 0xFF000000, local7 + 3, Static357.aClass96_98.method1935(Static389.anInt7061));
		arg0.NA(local7, local9 + 20, local11, local15 - 20, -Static84.anInt6177 + 255 << 24 | Static383.anInt3778, 1);
		local90 = Static38.aClass32_1.method3517();
		local92 = Static38.aClass32_1.method3524();
		@Pc(180) int local180 = 0;
		@Pc(201) int local201;
		for (@Pc(185) Class1_Sub3 local185 = (Class1_Sub3) Static251.aClass142_26.method3199(); local185 != null; local185 = (Class1_Sub3) Static251.aClass142_26.method3198()) {
			local201 = (Static119.anInt2296 - local180 - 1) * 16 + local9 + 13 + 20;
			local180++;
			if (local7 < local90 && local11 + local7 > local90 && local92 > local201 - 13 && local92 < local201 + 4 && local185.aBoolean15) {
				arg0.NA(local7, local201 - 12, local11, 16, 255 - Static170.anInt3039 << 24 | Static188.anInt3478, 1);
			}
		}
		if ((Static73.aClass78_7 == null || Static412.aClass78_22 == null || Static223.aClass78_14 == null) && Static353.aClass109_79.method2348(Static10.anInt7348) && Static353.aClass109_79.method2348(Static92.anInt1794) && Static353.aClass109_79.method2348(Static409.anInt7195)) {
			@Pc(289) Class63 local289 = Static457.method1163(Static353.aClass109_79, Static92.anInt1794, 0);
			Static412.aClass78_22 = arg0.method4589(local289);
			local289.method1164();
			Static50.aClass78_4 = arg0.method4589(local289);
			Static73.aClass78_7 = arg0.method4589(Static457.method1163(Static353.aClass109_79, Static10.anInt7348, 0));
			@Pc(314) Class63 local314 = Static457.method1163(Static353.aClass109_79, Static409.anInt7195, 0);
			Static223.aClass78_14 = arg0.method4589(local314);
			local314.method1164();
			Static376.aClass78_19 = arg0.method4589(local314);
		}
		@Pc(384) int local384;
		@Pc(345) int local345;
		if (Static73.aClass78_7 != null && Static412.aClass78_22 != null && Static223.aClass78_14 != null) {
			local201 = (local11 - Static223.aClass78_14.UA() * 2) / Static73.aClass78_7.UA();
			for (local345 = 0; local345 < local201; local345++) {
				Static73.aClass78_7.method6003(local7 + Static223.aClass78_14.UA() + local345 * Static73.aClass78_7.UA(), local15 + local9 - Static73.aClass78_7.qa());
			}
			local384 = (local15 - Static223.aClass78_14.qa() - 20) / Static412.aClass78_22.qa();
			for (@Pc(386) int local386 = 0; local386 < local384; local386++) {
				Static412.aClass78_22.method6003(local7, local9 + local386 * Static412.aClass78_22.qa() + 20);
				Static50.aClass78_4.method6003(local11 + local7 - Static50.aClass78_4.UA(), Static412.aClass78_22.qa() * local386 + (local9 - -20));
			}
			Static223.aClass78_14.method6003(local7, local9 + local15 - Static223.aClass78_14.qa());
			Static376.aClass78_19.method6003(local11 + local7 - Static223.aClass78_14.UA(), local15 + local9 + -Static223.aClass78_14.qa());
		}
		local180 = 0;
		for (@Pc(460) Class1_Sub3 local460 = (Class1_Sub3) Static251.aClass142_26.method3199(); local460 != null; local460 = (Class1_Sub3) Static251.aClass142_26.method3198()) {
			local345 = (Static119.anInt2296 - local180 - 1) * 16 + local9 + 20 + 13;
			local384 = Static223.anInt3885 | 0xFF000000;
			if (local90 > local7 && local7 + local11 > local90 && local345 - 13 < local92 && local345 + 4 > local92 && local460.aBoolean15) {
				local384 = Static262.anInt4465 | 0xFF000000;
			}
			@Pc(523) int[] local523 = null;
			if (Static192.method3012(local460.anInt227)) {
				local523 = Static388.aClass193_3.method4249((int) local460.aLong15).anIntArray457;
			} else if (local460.anInt224 != -1) {
				local523 = Static388.aClass193_3.method4249(local460.anInt224).anIntArray457;
			} else if (Static430.method5801(local460.anInt227)) {
				@Pc(562) Class47_Sub1_Sub5_Sub1 local562 = Static307.aClass47_Sub1_Sub5_Sub1Array1[(int) local460.aLong15];
				if (local562 != null) {
					@Pc(567) Class196 local567 = local562.aClass196_1;
					if (local567.anIntArray419 != null) {
						local567 = local567.method4412(Static237.aClass80_1);
					}
					if (local567 != null) {
						local523 = local567.anIntArray420;
					}
				}
			} else if (Static112.method1762(local460.anInt227)) {
				@Pc(603) Class29 local603;
				if (local460.anInt227 == 1001) {
					local603 = Static251.aClass207_2.method4977((int) local460.aLong15);
				} else {
					local603 = Static251.aClass207_2.method4977((int) (local460.aLong15 >>> 32 & 0x7FFFFFFFL));
				}
				if (local603.anIntArray36 != null) {
					local603 = local603.method475(Static237.aClass80_1);
				}
				if (local603 != null) {
					local523 = local603.anIntArray34;
				}
			}
			@Pc(632) String local632 = Static329.method4757(local460);
			if (local523 != null) {
				local632 = local632 + Static301.method4107(local523);
			}
			Static237.aClass4_5.method5846(local7 + 3, Static13.aClass78Array1, local632, Static275.anIntArray364, local345, local384);
			if (local460.aBoolean16) {
				Static55.aClass78_6.method6003(local7 + Static126.aClass62_6.method1157(local632) + 5, local345 + -12);
			}
			local180++;
		}
		Static220.method2313(Static102.anInt1978, Static423.anInt7379, Static256.anInt4398, Static369.anInt6690);
	}
}
