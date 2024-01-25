import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!la;")
	public static Class196 aClass196_80;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
	public static int anInt7324;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Z")
	public static boolean aBoolean521 = true;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString79 = null;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_101 = new Class130(59, 3);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6378(@OriginalArg(0) String arg0) {
		if (!Static190.aBoolean232 || (Static37.anInt1189 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static274.anInt4964;
		@Pc(18) int[] local18 = Static70.anIntArray392;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class4_Sub1_Sub2_Sub1_Sub2 local28 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local18[local20]];
			if (local28.aString63 != null && local28.aString63.equalsIgnoreCase(arg0) && (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 == local28 && (Static37.anInt1189 & 0x10) != 0 || local28 != null && (Static37.anInt1189 & 0x8) != 0)) {
				@Pc(58) Class3_Sub14 local58 = Static139.method2308(Static549.aClass130_124, Static24.aClass233_1);
				local58.aClass3_Sub3_Sub2_2.method4226(local18[local20]);
				local58.aClass3_Sub3_Sub2_2.method4253(Static235.anInt4449);
				local58.aClass3_Sub3_Sub2_2.method4266(Static161.anInt3179);
				local58.aClass3_Sub3_Sub2_2.method4216(0);
				local58.aClass3_Sub3_Sub2_2.method4253(Static433.anInt7818);
				Static562.method8096(local58);
				local14 = true;
				Static396.method5709(local28.method5059(), 0, -2, local28.method5059(), local28.anIntArray309[0], local28.anIntArray310[0], 0, true);
				break;
			}
		}
		if (!local14) {
			Static612.method8491(Static59.aClass43_21.method1598(Static325.anInt6083) + arg0);
		}
		if (Static190.aBoolean232) {
			Static282.method4549();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZIILclient!la;)Lclient!gw;")
	public static Class3_Sub4_Sub11 method6380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class196 arg2) {
		@Pc(14) Class3_Sub3 local14 = new Class3_Sub3(arg2.method5102(arg0, arg1));
		@Pc(47) Class3_Sub4_Sub11 local47 = new Class3_Sub4_Sub11(arg1, local14.method4233(), local14.method4233(), local14.method4207(), local14.method4207(), local14.method4225() == 1, local14.method4225(), local14.method4225());
		@Pc(51) int local51 = local14.method4225();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass223_17.method5868(new Class3_Sub41(local14.method4225(), local14.method4221(), local14.method4221(), local14.method4221(), local14.method4221(), local14.method4221(), local14.method4221(), local14.method4221(), local14.method4221()));
		}
		local47.method3419();
		return local47;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
	public static boolean method6381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
