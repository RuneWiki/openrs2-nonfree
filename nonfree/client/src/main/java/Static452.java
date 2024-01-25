import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "Lclient!cea;")
	public static Class48 aClass48_6;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!gga;II)Lclient!ida;")
	public static Class159 method7285(@OriginalArg(1) Class124 arg0, @OriginalArg(3) int arg1) {
		@Pc(11) byte[] local11 = arg0.method3641(arg1, 0);
		return local11 == null ? null : new Class159(local11);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V")
	public static void method7286() {
		@Pc(1) Class22 local1 = Static290.aClass22_36;
		synchronized (Static290.aClass22_36) {
			Static290.aClass22_36.method473();
		}
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(B)V")
	public static void method7287() {
		Static389.anInt7373 = Static206.aClass2_Sub8_Sub2_1.method5201();
		@Pc(18) int local18 = Static206.aClass2_Sub8_Sub2_1.method5206();
		@Pc(22) int local22 = Static206.aClass2_Sub8_Sub2_1.method5211();
		@Pc(26) int local26 = Static206.aClass2_Sub8_Sub2_1.method5211();
		@Pc(35) boolean local35 = Static206.aClass2_Sub8_Sub2_1.method5201() == 1;
		Static476.method7603();
		Static255.method4446(local18);
		Static206.aClass2_Sub8_Sub2_1.method5231();
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(60) int local60;
		for (@Pc(45) int local45 = 0; local45 < 4; local45++) {
			for (local49 = 0; local49 < Static222.anInt4533 >> 3; local49++) {
				for (local53 = 0; local53 < Static668.anInt11370 >> 3; local53++) {
					local60 = Static206.aClass2_Sub8_Sub2_1.method5233(1);
					if (local60 == 1) {
						Static232.anIntArrayArrayArray21[local45][local49][local53] = Static206.aClass2_Sub8_Sub2_1.method5233(26);
					} else {
						Static232.anIntArrayArrayArray21[local45][local49][local53] = -1;
					}
				}
			}
		}
		Static206.aClass2_Sub8_Sub2_1.method5234();
		local49 = (Static538.anInt9383 - Static206.aClass2_Sub8_Sub2_1.anInt5725) / 16;
		Static172.anIntArrayArray11 = new int[local49][4];
		for (local53 = 0; local53 < local49; local53++) {
			for (local60 = 0; local60 < 4; local60++) {
				Static172.anIntArrayArray11[local53][local60] = Static206.aClass2_Sub8_Sub2_1.method5172();
			}
		}
		Static191.anIntArray190 = new int[local49];
		Static437.anIntArray399 = new int[local49];
		Static71.aByteArrayArray4 = new byte[local49][];
		Static448.anIntArray407 = new int[local49];
		Static617.aByteArrayArray24 = new byte[local49][];
		Static375.anIntArray312 = null;
		Static446.anIntArray403 = new int[local49];
		Static37.aByteArrayArray3 = new byte[local49][];
		Static533.anIntArray479 = new int[local49];
		Static101.aByteArrayArray7 = null;
		Static424.aByteArrayArray16 = new byte[local49][];
		local49 = 0;
		for (local60 = 0; local60 < 4; local60++) {
			for (@Pc(189) int local189 = 0; local189 < Static222.anInt4533 >> 3; local189++) {
				for (@Pc(193) int local193 = 0; local193 < Static668.anInt11370 >> 3; local193++) {
					@Pc(203) int local203 = Static232.anIntArrayArrayArray21[local60][local189][local193];
					if (local203 != -1) {
						@Pc(213) int local213 = local203 >> 14 & 0x3FF;
						@Pc(219) int local219 = local203 >> 3 & 0x7FF;
						@Pc(230) int local230 = (local213 / 8 << 8) + (local219 / 8);
						for (@Pc(232) int local232 = 0; local232 < local49; local232++) {
							if (local230 == Static437.anIntArray399[local232]) {
								local230 = -1;
								break;
							}
						}
						if (local230 != -1) {
							Static437.anIntArray399[local49] = local230;
							@Pc(264) int local264 = local230 >> 8 & 0xFF;
							@Pc(268) int local268 = local230 & 0xFF;
							Static191.anIntArray190[local49] = Static52.aClass124_14.method3638("m" + local264 + "_" + local268);
							Static446.anIntArray403[local49] = Static52.aClass124_14.method3638("l" + local264 + "_" + local268);
							Static448.anIntArray407[local49] = Static52.aClass124_14.method3638("um" + local264 + "_" + local268);
							Static533.anIntArray479[local49] = Static52.aClass124_14.method3638("ul" + local264 + "_" + local268);
							local49++;
						}
					}
				}
			}
		}
		Static285.method4770(11, local22, local26, local35);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!cea;ZIZLjava/lang/String;)V")
	public static void method7288(@OriginalArg(0) Class48 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		if (!arg1) {
			Static509.method7935(arg3, arg0, 3);
			return;
		}
		@Pc(23) String local23;
		if (Static72.aString13.startsWith("win") && arg0.aBoolean75) {
			local23 = null;
			if (Static637.anApplet2 != null) {
				local23 = Static637.anApplet2.getParameter("haveie6");
			}
			if (local23 == null || !local23.equals("1")) {
				@Pc(41) Class268 local41 = Static509.method7935(arg3, arg0, 0);
				aClass48_6 = arg0;
				Static325.aString70 = arg3;
				Static11.aClass268_1 = local41;
				return;
			}
		}
		if (Static72.aString13.startsWith("mac")) {
			local23 = null;
			if (Static637.anApplet2 != null) {
				local23 = Static637.anApplet2.getParameter("havefirefox");
			}
			if (local23 != null && local23.equals("1") && arg2) {
				Static509.method7935(arg3, arg0, 1);
				return;
			}
		}
		Static509.method7935(arg3, arg0, 2);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!ol;)Lclient!kh;")
	public static Class198 method7289(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method5203();
		@Pc(14) Class236 local14 = Static566.method8589()[arg0.method5203()];
		@Pc(21) Class103 local21 = Static277.method9737()[arg0.method5203()];
		@Pc(25) int local25 = arg0.method5174();
		@Pc(29) int local29 = arg0.method5174();
		@Pc(33) int local33 = arg0.method5211();
		@Pc(37) int local37 = arg0.method5211();
		@Pc(41) int local41 = arg0.method5172();
		@Pc(45) int local45 = arg0.method5172();
		@Pc(49) int local49 = arg0.method5172();
		@Pc(58) boolean local58 = arg0.method5203() == 1;
		return new Class198(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local58);
	}
}
