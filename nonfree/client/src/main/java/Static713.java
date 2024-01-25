import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static713 {

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIILclient!nt;)V")
	public static void method9475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class270 arg2) {
		Static561.aClass270_18 = arg2;
		Static477.anInt7514 = arg0;
		Static655.anInt10078 = arg1;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II[Ljava/lang/String;B)Ljava/lang/String;")
	public static String method9476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(19) String local19 = arg2[arg0];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(33) int local33 = arg1 + arg0;
			@Pc(35) int local35 = 0;
			for (@Pc(46) int local46 = arg0; local46 < local33; local46++) {
				@Pc(52) String local52 = arg2[local46];
				if (local52 == null) {
					local35 += 4;
				} else {
					local35 += local52.length();
				}
			}
			@Pc(73) StringBuffer local73 = new StringBuffer(local35);
			for (@Pc(75) int local75 = arg0; local75 < local33; local75++) {
				@Pc(83) String local83 = arg2[local75];
				if (local83 == null) {
					local73.append("null");
				} else {
					local73.append(local83);
				}
			}
			return local73.toString();
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method9478(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) int local12 = Static607.anInt9201;
		@Pc(14) int[] local14 = Static384.anIntArray436;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			@Pc(26) Class9_Sub1_Sub1_Sub2_Sub1 local26 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local14[local18]];
			if (local26 != null && local26 != Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 && local26.aString4 != null && local26.aString4.equalsIgnoreCase(arg1)) {
				@Pc(47) Class144 local47 = null;
				if (arg0 == 1) {
					local47 = Static58.aClass144_12;
				} else if (arg0 == 4) {
					local47 = Static263.aClass144_43;
				} else if (arg0 == 5) {
					local47 = Static315.aClass144_49;
				} else if (arg0 == 6) {
					local47 = Static467.aClass144_73;
				} else if (arg0 == 7) {
					local47 = Static71.aClass144_13;
				} else if (arg0 == 9) {
					local47 = Static303.aClass144_47;
				}
				if (local47 != null) {
					@Pc(102) Class3_Sub29 local102 = Static507.method6901(local47, Static95.aClass292_2.aClass88_2);
					local102.aClass3_Sub2_Sub1_1.method2020(0);
					local102.aClass3_Sub2_Sub1_1.method2055(local14[local18]);
					Static95.aClass292_2.method6855(local102);
				}
				local16 = true;
				break;
			}
		}
		if (!local16) {
			Static304.method4498(Static430.aClass257_21.method5699(Static456.anInt7118) + arg1);
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!nt;B)V")
	public static void method9479(@OriginalArg(0) Class270 arg0) {
		if (!Static474.aBoolean505) {
			return;
		}
		if (arg0.anObjectArray23 != null) {
			@Pc(15) Class270 local15 = Static1.method9504(Static418.anInt6410, Static216.anInt3565);
			if (local15 != null) {
				@Pc(21) Class3_Sub41 local21 = new Class3_Sub41();
				local21.aClass270_13 = local15;
				local21.anObjectArray4 = arg0.anObjectArray23;
				local21.aClass270_12 = arg0;
				Static540.method7160(local21);
			}
		}
		@Pc(43) Class3_Sub29 local43 = Static507.method6901(Static426.aClass144_66, Static95.aClass292_2.aClass88_2);
		local43.aClass3_Sub2_Sub1_1.method2055(arg0.anInt7001);
		local43.aClass3_Sub2_Sub1_1.method2018(arg0.anInt6973);
		local43.aClass3_Sub2_Sub1_1.method2037(Static418.anInt6410);
		local43.aClass3_Sub2_Sub1_1.method2055(arg0.anInt7020);
		local43.aClass3_Sub2_Sub1_1.method2024(Static216.anInt3565);
		local43.aClass3_Sub2_Sub1_1.method2010(Static318.anInt1773);
		Static95.aClass292_2.method6855(local43);
	}
}
