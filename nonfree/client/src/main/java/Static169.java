import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Lclient!bi;")
	public static Class25 aClass25_3;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	public static int anInt5687;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "Lclient!g;")
	public static Class83 aClass83_110;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "[[Lclient!qe;")
	public static Class189[][] aClass189ArrayArray3;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
	public static final int anInt5689 = anInt5687;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_163 = new Class208(7, -1);

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
	public static final int anInt5691 = anInt5687 >> 2;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!rs;IIIII)V")
	public static void method5038(@OriginalArg(0) Class103 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3024 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub8_Sub1Array3[local4] != null) {
				arg0.anInt3024++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt3024; local22++) {
			@Pc(31) long local31 = Static132.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class2_Sub8_Sub1 local41;
			while (local31 != 0L) {
				local41 = Static41.aClass2_Sub8_Sub1Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub8_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static132.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static41.aClass2_Sub8_Sub1Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub8_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(91) int local91 = local22; local91 < arg0.anInt3024 - 1; local91++) {
				arg0.aClass2_Sub8_Sub1Array3[local91] = arg0.aClass2_Sub8_Sub1Array3[local91 + 1];
			}
			arg0.anInt3024--;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I")
	public static int method5039(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static87.method1486(arg0);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ph;III[Z)V")
	public static void method5042(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static128.aClass149Array1 == Static248.aClass149Array3) {
			return;
		}
		@Pc(9) int local9 = Static210.aClass149Array5[arg1].method5839(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class149 local22 = Static210.aClass149Array5[local11];
				if (local22 != null) {
					local22.method5840(arg0, arg2, local9 - local22.method5839(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZILclient!cj;)V")
	public static void method5045(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub2_Sub1_Sub1 arg1) {
		if (Static233.anInt4642 >= 400 || arg1 == Static182.aClass1_Sub2_Sub1_Sub1_1) {
			return;
		}
		@Pc(151) String local151;
		@Pc(78) int local78;
		if (arg1.anInt969 == 0) {
			@Pc(29) boolean local29 = true;
			if (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt974 != -1 && arg1.anInt974 != -1) {
				@Pc(53) int local53 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt956 > arg1.anInt956 ? Static182.aClass1_Sub2_Sub1_Sub1_1.anInt956 : arg1.anInt956;
				@Pc(68) int local68 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt974 >= arg1.anInt974 ? arg1.anInt974 : Static182.aClass1_Sub2_Sub1_Sub1_1.anInt974;
				local78 = local68 + local53 * 10 / 100 + 5;
				@Pc(85) int local85 = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt956 - arg1.anInt956;
				if (local85 < 0) {
					local85 = -local85;
				}
				if (local78 < local85) {
					local29 = false;
				}
			}
			@Pc(112) String local112 = Static85.aClass38_1 == Static202.aClass38_2 ? Static88.aClass62_61.method1389(Static200.anInt4144) : Static350.aClass62_228.method1389(Static200.anInt4144);
			if (arg1.anInt961 <= arg1.anInt956) {
				local151 = arg1.method705() + (local29 ? Static369.method5880(Static182.aClass1_Sub2_Sub1_Sub1_1.anInt956, arg1.anInt956) : "<col=ffffff>") + " (" + local112 + arg1.anInt956 + ")";
			} else {
				local151 = arg1.method705() + (local29 ? Static369.method5880(Static182.aClass1_Sub2_Sub1_Sub1_1.anInt956, arg1.anInt956) : "<col=ffffff>") + " (" + local112 + arg1.anInt956 + "+" + (arg1.anInt961 - arg1.anInt956) + ")";
			}
		} else {
			local151 = arg1.method705() + " (" + Static316.aClass62_208.method1389(Static200.anInt4144) + arg1.anInt969 + ")";
		}
		if (Static45.aBoolean446) {
			if (!arg0 && (Static272.anInt5116 & 0x8) != 0) {
				Static51.method787((long) arg1.anInt5374, 0, 4, -1, Static5.anInt136, Static207.aString34, 0, false, Static343.aString60 + " -> <col=ffffff>" + local151, true);
			}
		} else if (arg0) {
			Static51.method787(0L, 0, -1, 0, -1, "<col=cccccc>" + local151, 0, true, "", false);
		} else {
			for (@Pc(221) int local221 = 7; local221 >= 0; local221--) {
				if (Static209.aStringArray22[local221] != null) {
					@Pc(229) short local229 = 0;
					if (Static85.aClass38_1 == Static255.aClass38_3 && Static209.aStringArray22[local221].equalsIgnoreCase(Static370.aClass62_169.method1389(Static200.anInt4144))) {
						if (arg1.anInt956 > Static182.aClass1_Sub2_Sub1_Sub1_1.anInt956) {
							local229 = 2000;
						}
						if (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt970 != 0 && arg1.anInt970 != 0) {
							if (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt970 == arg1.anInt970) {
								local229 = 2000;
							} else {
								local229 = 0;
							}
						}
					} else if (Static312.aBooleanArray25[local221]) {
						local229 = 2000;
					}
					@Pc(290) short local290 = (short) (local229 + Static85.aShortArray18[local221]);
					local78 = Static38.anIntArray57[local221] == -1 ? Static134.anInt2940 : Static38.anIntArray57[local221];
					Static51.method787((long) arg1.anInt5374, 0, local290, -1, local78, Static209.aStringArray22[local221], 0, false, "<col=ffffff>" + local151, true);
				}
			}
		}
		if (arg0) {
			return;
		}
		for (@Pc(396) Class2_Sub43 local396 = (Class2_Sub43) Static262.aClass238_29.method5795(); local396 != null; local396 = (Class2_Sub43) Static262.aClass238_29.method5799()) {
			if (local396.anInt7126 == 9) {
				local396.aString63 = "<col=ffffff>" + local151;
				return;
			}
		}
	}
}
