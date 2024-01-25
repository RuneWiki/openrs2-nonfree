import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
	public static int anInt1498;

	@OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
	public static int anInt1499;

	@OriginalMember(owner = "client!cfa", name = "J", descriptor = "Lclient!wd;")
	public static final Class358 aClass358_6 = new Class358(9, 0, 4, 1);

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(III)Z")
	public static boolean method1419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(BLjava/lang/String;)V")
	public static void method1420(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(37) String local37;
		if (Static591.anInt9675 >= 200 && !Static65.aBoolean118 || Static591.anInt9675 >= 200) {
			Static550.method7295(Static544.aClass343_14.method7222(Static256.anInt4535));
			local37 = Static544.aClass343_15.method7222(Static256.anInt4535);
			if (local37 != null) {
				Static550.method7295(local37);
			}
			return;
		}
		local37 = Static131.method2611(arg0);
		if (local37 == null) {
			return;
		}
		@Pc(92) String local92;
		for (@Pc(53) int local53 = 0; local53 < Static591.anInt9675; local53++) {
			@Pc(61) String local61 = Static131.method2611(Static22.aStringArray1[local53]);
			if (local61 != null && local61.equals(local37)) {
				Static550.method7295(arg0 + Static544.aClass343_42.method7222(Static256.anInt4535));
				return;
			}
			if (Static91.aStringArray6[local53] != null) {
				local92 = Static131.method2611(Static91.aStringArray6[local53]);
				if (local92 != null && local92.equals(local37)) {
					Static550.method7295(arg0 + Static544.aClass343_42.method7222(Static256.anInt4535));
					return;
				}
			}
		}
		for (@Pc(119) int local119 = 0; local119 < Static579.anInt9370; local119++) {
			local92 = Static131.method2611(Static483.aStringArray33[local119]);
			if (local92 != null && local92.equals(local37)) {
				Static550.method7295(Static544.aClass343_47.method7222(Static256.anInt4535) + arg0 + Static544.aClass343_48.method7222(Static256.anInt4535));
				return;
			}
			if (Static527.aStringArray36[local119] != null) {
				@Pc(163) String local163 = Static131.method2611(Static527.aStringArray36[local119]);
				if (local163 != null && local163.equals(local37)) {
					Static550.method7295(Static544.aClass343_47.method7222(Static256.anInt4535) + arg0 + Static544.aClass343_48.method7222(Static256.anInt4535));
					return;
				}
			}
		}
		if (Static131.method2611(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aString95).equals(local37)) {
			Static550.method7295(Static544.aClass343_45.method7222(Static256.anInt4535));
		} else {
			@Pc(221) Class3_Sub42 local221 = Static591.method7910(Static9.aClass199_3, Static2.aClass303_4);
			local221.aClass3_Sub11_Sub1_1.method5213(Static325.method4707(arg0));
			local221.aClass3_Sub11_Sub1_1.method5227(arg0);
			Static511.method6885(local221);
		}
	}
}
