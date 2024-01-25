import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
	public static int anInt8096;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(17) int local17 = arg1 - arg5;
		@Pc(22) int local22 = arg6 + arg5;
		for (@Pc(24) int local24 = arg6; local24 < local22; local24++) {
			Static259.method4236(arg3, arg0, arg2, Static618.anIntArrayArray101[local24]);
		}
		for (@Pc(44) int local44 = arg1; local44 > local17; local44--) {
			Static259.method4236(arg3, arg0, arg2, Static618.anIntArrayArray101[local44]);
		}
		@Pc(67) int local67 = arg0 - arg5;
		@Pc(71) int local71 = arg3 + arg5;
		for (@Pc(73) int local73 = local22; local73 <= local17; local73++) {
			@Pc(79) int[] local79 = Static618.anIntArrayArray101[local73];
			Static259.method4236(arg3, local71, arg2, local79);
			Static259.method4236(local71, local67, arg4, local79);
			Static259.method4236(local67, arg0, arg2, local79);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZII)I")
	public static int method6787(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg2 & arg1 - 1;
		@Pc(28) int local28 = Static146.method2805(local7, local17);
		@Pc(35) int local35 = Static146.method2805(local7 + 1, local17);
		@Pc(42) int local42 = Static146.method2805(local7, local17 + 1);
		@Pc(56) int local56 = Static146.method2805(local7 + 1, local17 + 1);
		@Pc(63) int local63 = Static536.method7487(local28, arg1, local35, local13);
		@Pc(70) int local70 = Static536.method7487(local42, arg1, local56, local13);
		return Static536.method7487(local63, arg1, local70, local23);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
	public static void method6788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static400.anInt7142 = arg0;
		Static312.anInt5689 = arg1;
		if (Static244.anInt4841 == 0) {
			Static250.anInt8280 = Static617.anInt10026 * 2 + Static312.anInt5689;
			Static326.anInt5898 = Static400.anInt7142 + Static53.anInt1152 * 2;
		} else if (Static244.anInt4841 == 1) {
			Static466.anInt4483 = Static225.anInt4617 + Static312.anInt5689 / Static531.anInt8888 + 2;
			Static207.anInt4335 = Static521.anInt8696 + Static400.anInt7142 / Static155.anInt3544 + 2;
			Static250.anInt8280 = Static466.anInt4483 * Static531.anInt8888;
			Static326.anInt5898 = Static155.anInt3544 * Static207.anInt4335;
			Static53.anInt1152 = Static326.anInt5898 - Static400.anInt7142 >> 1;
			Static617.anInt10026 = Static250.anInt8280 - Static312.anInt5689 >> 1;
		} else if (Static244.anInt4841 == 2) {
			Static326.anInt5898 = Static400.anInt7142;
			Static250.anInt8280 = Static312.anInt5689;
			return;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/lang/String;IZIZLjava/lang/String;I)V")
	public static void method6789(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static64.aClass97_12.anInt3014 = 1;
		@Pc(9) String local9 = arg4.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = -1;
		@Pc(16) String local16 = null;
		if (arg1 != -1) {
			@Pc(24) Class79 local24 = Static584.aClass206_2.method4916(arg1);
			if (local24 == null || local24.method1707() != arg2) {
				return;
			}
			if (local24.method1707()) {
				local16 = local24.aString26;
			} else {
				local14 = local24.anInt2016;
			}
		}
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < Static570.aClass267_2.anInt7871; local55++) {
			@Pc(61) Class245 local61 = Static570.aClass267_2.method6597(local55);
			if ((!arg3 || local61.aBoolean567) && local61.anInt7460 == -1 && local61.anInt7478 == -1 && local61.anInt7499 == 0 && local61.aString72.toLowerCase().indexOf(local9) != -1) {
				if (arg1 != -1) {
					if (arg2) {
						if (!arg0.equals(local61.method6271(local16, arg1))) {
							continue;
						}
					} else if (local61.method6277(arg1, local14) != arg5) {
						continue;
					}
				}
				if (local53 >= 250) {
					Static275.aShortArray60 = null;
					Static214.anInt4435 = -1;
					return;
				}
				if (local12.length <= local53) {
					@Pc(130) short[] local130 = new short[local12.length * 2];
					for (@Pc(132) int local132 = 0; local132 < local53; local132++) {
						local130[local132] = local12[local132];
					}
					local12 = local130;
				}
				local12[local53++] = (short) local55;
			}
		}
		Static214.anInt4435 = local53;
		Static291.anInt5470 = 0;
		Static275.aShortArray60 = local12;
		@Pc(173) String[] local173 = new String[Static214.anInt4435];
		for (@Pc(179) int local179 = 0; local179 < Static214.anInt4435; local179++) {
			local173[local179] = Static570.aClass267_2.method6597(local12[local179]).aString72;
		}
		Static323.method4875(Static275.aShortArray60, local173);
		Static64.aClass97_12.method2556();
		Static64.aClass97_12.anInt3014 = 2;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method6791(@OriginalArg(1) String arg0) {
		return Static551.method7658(arg0, dca.class);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!aa;IIIILclient!dm;IILclient!ha;)V")
	public static void method6792(@OriginalArg(0) Class1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class78 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class87 arg7) {
		@Pc(21) Class105 local21 = Static259.aClass248_2.method6347(arg1);
		if (local21 == null || !local21.aBoolean280 || !local21.method2791(Static438.aClass198_1)) {
			return;
		}
		@Pc(41) int local41;
		if (local21.anIntArray236 != null) {
			@Pc(39) int[] local39 = new int[local21.anIntArray236.length];
			@Pc(54) int local54;
			@Pc(64) int local64;
			@Pc(68) int local68;
			for (local41 = 0; local41 < local39.length / 2; local41++) {
				if (Static2.anInt31 == 4) {
					local54 = (int) Static378.aFloat160 & 0x3FFF;
				} else {
					local54 = Static415.anInt7576 + (int) Static378.aFloat160 & 0x3FFF;
				}
				local64 = Class353.anIntArray681[local54];
				local68 = Class353.anIntArray682[local54];
				if (Static2.anInt31 != 4) {
					local64 = local64 * 256 / (Static30.anInt6668 + 256);
					local68 = local68 * 256 / (Static30.anInt6668 + 256);
				}
				local39[local41 * 2] = arg6 + arg4.anInt1964 / 2 + (local64 * (local21.anIntArray236[local41 * 2 + 1] * 4 + arg5) - -((local21.anIntArray236[local41 * 2] * 4 + arg2) * local68) >> 14);
				local39[local41 * 2 + 1] = arg4.anInt1991 / 2 + arg3 - ((arg5 + local21.anIntArray236[local41 * 2 + 1] * 4) * local68 - (local21.anIntArray236[local41 * 2] * 4 + arg2) * local64 >> 14);
			}
			Static241.method3977(arg7, local39, local21.anInt3332, arg4.anIntArray181, arg4.anIntArray178);
			if (local21.anInt3323 > 0) {
				@Pc(225) int local225;
				@Pc(235) int local235;
				@Pc(258) int local258;
				@Pc(267) int local267;
				for (local54 = 0; local54 < local39.length / 2 - 1; local54++) {
					local64 = local39[local54 * 2];
					local68 = local39[local54 * 2 + 1];
					local225 = local39[(local54 + 1) * 2];
					local235 = local39[local54 * 2 + 2 + 1];
					if (local64 > local225) {
						local258 = local64;
						local267 = local68;
						local64 = local225;
						local68 = local235;
						local225 = local258;
						local235 = local267;
					} else if (local64 == local225 && local68 > local235) {
						local258 = local68;
						local68 = local235;
						local235 = local258;
					}
					arg7.method7889(local64, local68, local225, local235, local21.anIntArray234[local21.aByteArray32[local54] & 0xFF], arg0, arg6, arg3, local21.anInt3323, local21.anInt3345, local21.anInt3322);
				}
				local64 = local39[local39.length - 2];
				local68 = local39[local39.length - 1];
				local225 = local39[0];
				local235 = local39[1];
				if (local64 > local225) {
					local258 = local64;
					local267 = local68;
					local64 = local225;
					local68 = local235;
					local225 = local258;
					local235 = local267;
				} else if (local64 == local225 && local235 < local68) {
					local258 = local68;
					local68 = local235;
					local235 = local258;
				}
				arg7.method7889(local64, local68, local225, local235, local21.anIntArray234[local21.aByteArray32[local21.aByteArray32.length - 1] & 0xFF], arg0, arg6, arg3, local21.anInt3323, local21.anInt3345, local21.anInt3322);
			} else {
				for (local54 = 0; local54 < local39.length / 2 - 1; local54++) {
					arg7.method7935(local39[local54 * 2], local39[local54 * 2 + 1], local39[local54 * 2 + 2], local39[(local54 + 1) * 2 + 1], local21.anIntArray234[local21.aByteArray32[local54] & 0xFF], arg0, arg6, arg3);
				}
				arg7.method7935(local39[local39.length - 2], local39[local39.length - 1], local39[0], local39[1], local21.anIntArray234[local21.aByteArray32[local21.aByteArray32.length - 1] & 0xFF], arg0, arg6, arg3);
			}
		}
		@Pc(499) Class20 local499 = null;
		if (local21.anInt3335 != -1) {
			local499 = local21.method2787(false, arg7);
			if (local499 != null) {
				Static190.method8303(arg6, arg3, arg4, local499, arg2, arg5, arg0);
			}
		}
		if (local21.aString34 == null) {
			return;
		}
		local41 = 0;
		if (local499 != null) {
			local41 = local499.method4595();
		}
		@Pc(534) Class64 local534 = Static573.aClass64_15;
		@Pc(536) Class114 local536 = Static72.aClass114_9;
		if (local21.anInt3352 == 1) {
			local534 = Static428.aClass64_11;
			local536 = Static305.aClass114_29;
		}
		if (local21.anInt3352 == 2) {
			local536 = Static240.aClass114_19;
			local534 = Static4.aClass64_1;
		}
		Static539.method7531(arg5, local534, arg2, arg4, arg3, arg6, local21.aString34, local41, local536, local21.anInt3347, arg0);
		return;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	public static void method6793() {
		if (Static234.anApplet2 == null) {
			return;
		}
		try {
			@Pc(18) String local18 = Static234.anApplet2.getParameter("cookiehost");
			@Pc(26) int local26 = (int) (Static438.method6517() / 86400000L) - 11745;
			@Pc(38) String local38 = "usrdob=" + local26 + "; version=1; path=/; domain=" + local18;
			Static648.method3665(Static234.anApplet2, "document.cookie=\"" + local38 + "\"");
		} catch (@Pc(52) Throwable local52) {
		}
	}
}
