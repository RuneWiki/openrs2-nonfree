import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!d", name = "k", descriptor = "[I")
	public static int[] anIntArray102;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_36 = new Class36(49, 2);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!bo;ILclient!ps;BLclient!qa;I)Z")
	public static boolean method1255(@OriginalArg(0) Class25 arg0, @OriginalArg(2) Class4_Sub32 arg1, @OriginalArg(4) Class30 arg2) {
		@Pc(12) int local12 = Integer.MAX_VALUE;
		@Pc(14) int local14 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg0.anIntArray71 != null) {
			local16 = Static137.anInt5586 - (arg1.anInt5602 + arg0.anInt845 - Static137.anInt5591) * (Static137.anInt5586 - Static137.anInt5587) / (Static137.anInt5583 - Static137.anInt5591);
			local18 = Static137.anInt5586 - (Static137.anInt5586 - Static137.anInt5587) * (-Static137.anInt5591 + arg1.anInt5602 + arg0.anInt841) / (Static137.anInt5583 - Static137.anInt5591);
			local14 = (arg1.anInt5605 + arg0.anInt851 - Static137.anInt5590) * (Static137.anInt5582 - Static137.anInt5589) / (Static137.anInt5585 - Static137.anInt5590) + Static137.anInt5589;
			local12 = Static137.anInt5589 + (arg1.anInt5605 + arg0.anInt848 - Static137.anInt5590) * (Static137.anInt5582 - Static137.anInt5589) / (Static137.anInt5585 - Static137.anInt5590);
		}
		@Pc(104) Class3 local104 = null;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		if (arg0.anInt855 != -1) {
			if (arg1.aBoolean373 && arg0.anInt870 != -1) {
				local104 = arg0.method670(arg2, true);
			} else {
				local104 = arg0.method670(arg2, false);
			}
			if (local104 != null) {
				local106 = arg1.anInt5603 - (local104.ja() + 1 >> 1);
				if (local106 < local12) {
					local12 = local106;
				}
				local108 = arg1.anInt5603 + (local104.ja() + 1 >> 1);
				local110 = arg1.anInt5607 - (local104.JA() + 1 >> 1);
				if (local14 < local108) {
					local14 = local108;
				}
				if (local110 < local16) {
					local16 = local110;
				}
				local112 = arg1.anInt5607 + (local104.JA() + 1 >> 1);
				if (local18 < local112) {
					local18 = local112;
				}
			}
		}
		@Pc(208) Class264 local208 = null;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(272) int local272;
		@Pc(299) int local299;
		if (arg0.aString8 != null) {
			local208 = Static39.method1432(arg0.anInt861);
			if (local208 != null) {
				local210 = Static26.aClass215_1.method4966(null, Static21.aStringArray3, arg0.aString8, null);
				local212 = arg1.anInt5607;
				if (local104 == null) {
					local212 -= local208.method5726() * local210 / 2;
				} else {
					local212 -= (local104.JA() >> 1) + (local210 * local208.method5725());
				}
				for (local272 = 0; local272 < local210; local272++) {
					@Pc(278) String local278 = Static21.aStringArray3[local272];
					if (local210 - 1 > local272) {
						local278 = local278.substring(0, local278.length() - 4);
					}
					local299 = local208.method5724(local278);
					if (local299 > local214) {
						local214 = local299;
					}
				}
				local216 = arg1.anInt5603 - local214 / 2;
				local218 = local214 / 2 + arg1.anInt5603;
				if (local12 > local216) {
					local12 = local216;
				}
				local220 = local212;
				if (local218 > local14) {
					local14 = local218;
				}
				local222 = local210 * local208.method5725() + local212;
				if (local220 < local16) {
					local16 = local220;
				}
				if (local18 < local222) {
					local18 = local222;
				}
			}
		}
		if (Static137.anInt5589 > local14 || local12 > Static137.anInt5582 || Static137.anInt5587 > local18 || Static137.anInt5586 < local16) {
			return true;
		}
		@Pc(407) int local407;
		if (arg0.anIntArray71 != null) {
			@Pc(405) int[] local405 = new int[arg0.anIntArray71.length];
			for (local407 = 0; local407 < local405.length / 2; local407++) {
				local299 = arg0.anIntArray71[local407 * 2] + arg1.anInt5605;
				@Pc(432) int local432 = arg0.anIntArray71[local407 * 2 + 1] + arg1.anInt5602;
				local405[local407 * 2] = Static137.anInt5589 + (local299 - Static137.anInt5590) * (Static137.anInt5582 - Static137.anInt5589) / (Static137.anInt5585 - Static137.anInt5590);
				local405[local407 * 2 + 1] = Static137.anInt5586 - (Static137.anInt5586 - Static137.anInt5587) * (local432 - Static137.anInt5591) / (Static137.anInt5583 - Static137.anInt5591);
			}
			Static135.method1960(arg2, local405, arg0.anInt847);
			for (local299 = 0; local299 < local405.length / 2 - 1; local299++) {
				arg2.method4694(arg0.anInt867, local405[local299 * 2], local405[local299 * 2 + 1], local405[(local299 + 1) * 2 + 1], local405[local299 * 2 + 2]);
			}
			arg2.method4694(arg0.anInt867, local405[local405.length - 2], local405[local405.length - 1], local405[1], local405[0]);
		}
		if (local104 != null) {
			if (Static2.anInt6973 > 0 && (Static129.anInt2584 != -1 && Static129.anInt2584 == arg1.anInt5601 || Static158.anInt2992 != -1 && Static158.anInt2992 == arg0.anInt865)) {
				if (Static98.anInt2095 > 50) {
					local272 = (100 - Static98.anInt2095) * 2;
				} else {
					local272 = Static98.anInt2095 * 2;
				}
				local407 = local272 << 24 | 0xFFFF00;
				arg2.method4687(local407, local104.UA() / 2 + 7, arg1.anInt5607, arg1.anInt5603);
				arg2.method4687(local407, local104.UA() / 2 + 5, arg1.anInt5607, arg1.anInt5603);
				arg2.method4687(local407, local104.UA() / 2 + 3, arg1.anInt5607, arg1.anInt5603);
				arg2.method4687(local407, local104.UA() / 2 + 1, arg1.anInt5607, arg1.anInt5603);
				arg2.method4687(local407, local104.UA() / 2, arg1.anInt5607, arg1.anInt5603);
			}
			local104.method5877(arg1.anInt5603 - (local104.ja() >> 1), arg1.anInt5607 - (local104.JA() >> 1));
		}
		if (arg0.aString8 != null && local208 != null) {
			Static346.method4893(local212, arg1, arg0, local208, arg2, local214, local210);
		}
		if (arg0.anInt855 != -1 || arg0.aString8 != null) {
			@Pc(712) Class4_Sub42 local712 = new Class4_Sub42(arg1);
			local712.anInt7115 = local112;
			local712.anInt7113 = local220;
			local712.anInt7119 = local222;
			local712.anInt7116 = local110;
			local712.anInt7114 = local106;
			local712.anInt7118 = local216;
			local712.anInt7112 = local108;
			local712.anInt7117 = local218;
			Static113.aClass258_17.method5526(local712);
		}
		return false;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IBI)V")
	public static void method1256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub1_Sub8 local12 = Static416.method5456(arg1, 7);
		local12.method2762();
		local12.anInt3611 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!hu;I)[Lclient!mg;")
	public static Class155[] method1257(@OriginalArg(0) Class114 arg0) {
		if (!arg0.method2344()) {
			return new Class155[0];
		}
		@Pc(16) Class108 local16 = arg0.method2340();
		while (local16.anInt2803 == 0) {
			Static20.method1515(10L);
		}
		if (local16.anInt2803 == 2) {
			return new Class155[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject4;
		@Pc(51) Class155[] local51 = new Class155[local37.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class155 local59 = new Class155();
			local51[local53] = local59;
			local59.anInt4448 = local37[local53 << 2];
			local59.anInt4445 = local37[(local53 << 2) + 1];
			local59.anInt4446 = local37[(local53 << 2) + 2];
			local59.anInt4450 = local37[(local53 << 2) + 3];
		}
		return local51;
	}
}
