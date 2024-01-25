import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
	public static int anInt4359;

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
	public static int anInt4363;

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "Lclient!dj;")
	public static final Class74 aClass74_10 = new Class74(9, 0, 4, 1);

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "[I")
	public static final int[] anIntArray228 = new int[1];

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	public static int anInt4366 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method3851(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static222.anInt4237 >= 100) {
			Static612.method8491(Static59.aClass43_39.method1598(Static325.anInt6083));
			return;
		}
		@Pc(29) String local29 = Static22.method978(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(75) String local75;
		for (@Pc(34) int local34 = 0; local34 < Static222.anInt4237; local34++) {
			@Pc(42) String local42 = Static22.method978(Static553.aStringArray35[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static612.method8491(arg0 + Static59.aClass43_40.method1598(Static325.anInt6083));
				return;
			}
			if (Static383.aStringArray26[local34] != null) {
				local75 = Static22.method978(Static383.aStringArray26[local34]);
				if (local75 != null && local75.equals(local29)) {
					Static612.method8491(arg0 + Static59.aClass43_40.method1598(Static325.anInt6083));
					return;
				}
			}
		}
		for (@Pc(102) int local102 = 0; local102 < Static68.anInt1696; local102++) {
			local75 = Static22.method978(Static422.aStringArray29[local102]);
			if (local75 != null && local75.equals(local29)) {
				Static612.method8491(Static59.aClass43_45.method1598(Static325.anInt6083) + arg0 + Static59.aClass43_46.method1598(Static325.anInt6083));
				return;
			}
			if (Static159.aStringArray13[local102] != null) {
				@Pc(150) String local150 = Static22.method978(Static159.aStringArray13[local102]);
				if (local150 != null && local150.equals(local29)) {
					Static612.method8491(Static59.aClass43_45.method1598(Static325.anInt6083) + arg0 + Static59.aClass43_46.method1598(Static325.anInt6083));
					return;
				}
			}
		}
		if (Static22.method978(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString63).equals(local29)) {
			Static612.method8491(Static59.aClass43_42.method1598(Static325.anInt6083));
			return;
		}
		@Pc(208) Class3_Sub14 local208 = Static139.method2308(Static390.aClass130_99, Static24.aClass233_1);
		local208.aClass3_Sub3_Sub2_2.method4220(Static161.method2888(arg0) + 1);
		local208.aClass3_Sub3_Sub2_2.method4241(arg0);
		local208.aClass3_Sub3_Sub2_2.method4220(arg1 ? 1 : 0);
		Static562.method8096(local208);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3852(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static214.method3619("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBILclient!ha;III)V")
	public static void method3853(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if ((Static215.aClass24_14 == null || Static120.aClass24_3 == null || Static619.aClass24_36 == null) && Static474.aClass196_98.method5111(Static239.anInt4467) && Static474.aClass196_98.method5111(Static503.anInt8687) && Static474.aClass196_98.method5111(Static495.anInt8541)) {
			@Pc(27) Class107 local27 = Static645.method2771(Static474.aClass196_98, Static503.anInt8687, 0);
			Static120.aClass24_3 = arg2.method7525(local27, true);
			local27.method2763();
			Static438.aClass24_26 = arg2.method7525(local27, true);
			Static215.aClass24_14 = arg2.method7525(Static645.method2771(Static474.aClass196_98, Static239.anInt4467, 0), true);
			@Pc(52) Class107 local52 = Static645.method2771(Static474.aClass196_98, Static495.anInt8541, 0);
			Static619.aClass24_36 = arg2.method7525(local52, true);
			local52.method2763();
			Static177.aClass24_4 = arg2.method7525(local52, true);
		}
		if (Static215.aClass24_14 == null || Static120.aClass24_3 == null || Static619.aClass24_36 == null) {
			return;
		}
		@Pc(93) int local93 = (arg4 - Static619.aClass24_36.method8558() * 2) / Static215.aClass24_14.method8558();
		for (@Pc(95) int local95 = 0; local95 < local93; local95++) {
			Static215.aClass24_14.method8559(arg3 + Static619.aClass24_36.method8558() + Static215.aClass24_14.method8558() * local95, -Static215.aClass24_14.method8578() + arg1 + arg0);
		}
		@Pc(136) int local136 = (arg1 - Static619.aClass24_36.method8578() - 20) / Static120.aClass24_3.method8578();
		for (@Pc(138) int local138 = 0; local138 < local136; local138++) {
			Static120.aClass24_3.method8559(arg3, Static120.aClass24_3.method8578() * local138 + arg0 + 20);
			Static438.aClass24_26.method8559(arg3 + arg4 - Static438.aClass24_26.method8558(), local138 * Static120.aClass24_3.method8578() + 20 + arg0);
		}
		Static619.aClass24_36.method8559(arg3, arg0 + arg1 - Static619.aClass24_36.method8578());
		Static177.aClass24_4.method8559(arg3 + arg4 - Static619.aClass24_36.method8558(), arg1 + arg0 + -Static619.aClass24_36.method8578());
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!jc;I)V")
	public static void method3855(@OriginalArg(1) Class3_Sub3_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static241.anInt4470 = 0;
		Static17.aBoolean61 = false;
		Static127.method2500(arg0);
		Static90.method2063(arg0);
		if (Static17.aBoolean61) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt4736 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt4736 + " psize:" + arg1);
		}
	}
}
