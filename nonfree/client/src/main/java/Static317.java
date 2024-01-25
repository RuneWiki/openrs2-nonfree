import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
	public static int anInt6258;

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_202 = new Class221(59, -2);

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_196 = new Class157(18, 15);

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_21 = new Class143(3, 15);

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_147 = new Class140(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
	public static int anInt6257 = 0;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
	public static void method5261() {
		for (@Pc(7) int local7 = 0; local7 < Static186.anInt4092; local7++) {
			@Pc(13) int local13 = Static171.anIntArray292[local7];
			@Pc(17) Class1_Sub2_Sub3_Sub2 local17 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local13];
			if (local17 != null) {
				Static313.method5192(local17, local17.aClass139_1.anInt4778);
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!iq;B)V")
	public static void method5262(@OriginalArg(0) Class104 arg0) {
		Static282.aClass104_147 = arg0;
		Static161.anInt3751 = Static282.aClass104_147.method2745(16);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZZ)V")
	public static void method5263(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static273.aClass2_Sub12_Sub2_3.method3167(Static275.anInt5636) >= 15) {
				@Pc(22) int local22 = Static273.aClass2_Sub12_Sub2_3.method3172(15);
				if (local22 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static95.aClass1_Sub2_Sub3_Sub2Array1[local22] == null) {
						Static95.aClass1_Sub2_Sub3_Sub2Array1[local22] = new Class1_Sub2_Sub3_Sub2();
						Static95.aClass1_Sub2_Sub3_Sub2Array1[local22].anInt6896 = local22;
						local27 = true;
					}
					@Pc(48) Class1_Sub2_Sub3_Sub2 local48 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local22];
					Static171.anIntArray292[Static186.anInt4092++] = local22;
					local48.anInt6932 = Static6.anInt91;
					if (local48.aClass139_1 != null && local48.aClass139_1.method4126()) {
						Static282.method4799(local48);
					}
					@Pc(79) int local79 = Static273.aClass2_Sub12_Sub2_3.method3172(1);
					@Pc(88) int local88 = Static273.aClass2_Sub12_Sub2_3.method3172(2);
					@Pc(95) int local95;
					if (arg0) {
						local95 = Static273.aClass2_Sub12_Sub2_3.method3172(8);
						if (local95 > 127) {
							local95 -= 256;
						}
					} else {
						local95 = Static273.aClass2_Sub12_Sub2_3.method3172(5);
						if (local95 > 15) {
							local95 -= 32;
						}
					}
					@Pc(119) int local119 = Static273.aClass2_Sub12_Sub2_3.method3172(1);
					if (local119 == 1) {
						Static281.anIntArray443[Static159.anInt2743++] = local22;
					}
					@Pc(147) int local147 = (Static273.aClass2_Sub12_Sub2_3.method3172(3) + 4 & 0xF3C00007) << 11;
					@Pc(158) int local158;
					if (arg0) {
						local158 = Static273.aClass2_Sub12_Sub2_3.method3172(8);
						if (local158 > 127) {
							local158 -= 256;
						}
					} else {
						local158 = Static273.aClass2_Sub12_Sub2_3.method3172(5);
						if (local158 > 15) {
							local158 -= 32;
						}
					}
					local48.method5790(Static90.method1809(Static273.aClass2_Sub12_Sub2_3.method3172(14)));
					local48.method5782(local48.aClass139_1.anInt4778);
					local48.anInt6919 = local48.aClass139_1.anInt4805 << 3;
					if (local48.anInt6919 == 0) {
						local48.method5785(0);
					} else if (local27) {
						local48.method5785(local147);
					}
					local48.method5791(local79 == 1, local95 + Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0], local158 + Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0], local48.method5787(), local88);
					if (local48.aClass139_1.method4126()) {
						Static177.method3424(0, null, local48.aByte77, null, local48.anIntArray534[0], local48.anIntArray535[0], local48);
					}
					continue;
				}
			}
			Static273.aClass2_Sub12_Sub2_3.method3164();
			return;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIBI)V")
	public static void method5264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 + 1;
		Static115.method2278(Static364.anIntArrayArray57[arg1], arg2, arg3, arg4);
		@Pc(18) int local18 = arg0 - 1;
		Static115.method2278(Static364.anIntArrayArray57[arg0], arg2, arg3, arg4);
		for (@Pc(33) int local33 = local9; local33 <= local18; local33++) {
			@Pc(39) int[] local39 = Static364.anIntArrayArray57[local33];
			local39[arg4] = local39[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)V")
	public static void method5265(@OriginalArg(1) int arg0) {
		Static306.anInt4217 = arg0;
		@Pc(12) Class107 local12 = Static310.aClass107_51;
		synchronized (Static310.aClass107_51) {
			Static310.aClass107_51.method3015();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(CBI)I")
	public static int method5266(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local12 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local12 = 1762;
		}
		return local12;
	}
}
