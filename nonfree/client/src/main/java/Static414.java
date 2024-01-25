import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "Lclient!jd;")
	public static Class20 aClass20_26;

	@OriginalMember(owner = "client!oba", name = "p", descriptor = "[Lclient!jd;")
	public static Class20[] aClass20Array11;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "([BB)Lclient!fi;")
	public static Class14_Sub3_Sub8 method6184(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class14_Sub3_Sub8 local9 = new Class14_Sub3_Sub8();
		@Pc(14) Class14_Sub29 local14 = new Class14_Sub29(arg0);
		local14.anInt7264 = local14.aByteArray84.length - 2;
		@Pc(25) int local25 = local14.method5900();
		@Pc(36) int local36 = local14.aByteArray84.length - local25 - 16 - 2;
		local14.anInt7264 = local36;
		@Pc(48) int local48 = local14.method5878();
		local9.anInt3174 = local14.method5900();
		local9.anInt3170 = local14.method5900();
		local9.anInt3173 = local14.method5900();
		local9.anInt3169 = local14.method5900();
		local9.anInt3177 = local14.method5900();
		local9.anInt3171 = local14.method5900();
		@Pc(82) int local82 = local14.method5866();
		@Pc(90) int local90;
		@Pc(96) int local96;
		if (local82 > 0) {
			local9.aClass187Array1 = new Class187[local82];
			for (local90 = 0; local90 < local82; local90++) {
				local96 = local14.method5900();
				@Pc(103) Class187 local103 = new Class187(Static330.method5181(local96));
				local9.aClass187Array1[local90] = local103;
				while (local96-- > 0) {
					@Pc(114) int local114 = local14.method5878();
					@Pc(118) int local118 = local14.method5878();
					local103.method4077((long) local114, new Class14_Sub18(local118));
				}
			}
		}
		local14.anInt7264 = 0;
		local9.aString38 = local14.method5886();
		local9.anIntArray259 = new int[local48];
		local90 = 0;
		while (local36 > local14.anInt7264) {
			local96 = local14.method5900();
			if (local96 == 3) {
				if (local9.aStringArray9 == null) {
					local9.aStringArray9 = new String[local48];
				}
				local9.aStringArray9[local90] = local14.method5898().intern();
			} else if (local96 == 54) {
				if (local9.aLongArray3 == null) {
					local9.aLongArray3 = new long[local48];
				}
				local9.aLongArray3[local90] = local14.method5907();
			} else {
				if (local9.anIntArray257 == null) {
					local9.anIntArray257 = new int[local48];
				}
				if (local96 >= 150 || local96 == 21 || local96 == 38 || local96 == 39) {
					local9.anIntArray257[local90] = local14.method5866();
				} else {
					local9.anIntArray257[local90] = local14.method5878();
				}
			}
			local9.anIntArray259[local90++] = local96;
		}
		return local9;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIILclient!wn;)V")
	public static void method6185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub3_Sub21 arg2) {
		if (!Static505.aBoolean629) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(26) int local26;
		for (@Pc(18) Class14_Sub3_Sub11 local18 = (Class14_Sub3_Sub11) arg2.aClass73_13.method1826(); local18 != null; local18 = (Class14_Sub3_Sub11) arg2.aClass73_13.method1827()) {
			local26 = Static549.method7757(local18);
			if (local26 > local10) {
				local10 = local26;
			}
		}
		local10 += 8;
		local26 = arg2.anInt11129 * 16 + 21;
		Static623.anInt10488 = arg2.anInt11129 * 16 + (Static575.aBoolean699 ? 26 : 22);
		@Pc(67) int local67 = Static189.anInt3555 + Static222.anInt4164;
		if (local10 + local67 > Static561.anInt9759) {
			local67 = Static222.anInt4164 - local10;
		}
		if (local67 < 0) {
			local67 = 0;
		}
		@Pc(90) int local90 = Static575.aBoolean699 ? 33 : 31;
		@Pc(97) int local97 = arg1 + 13 - local90;
		if (Static639.anInt10685 < local26 + local97) {
			local97 = Static639.anInt10685 - local26;
		}
		Static652.anInt10893 = local67;
		if (local97 < 0) {
			local97 = 0;
		}
		Static539.anInt9256 = local97;
		Static62.anInt9091 = local10;
		Static665.aClass14_Sub3_Sub21_4 = arg2;
	}
}
