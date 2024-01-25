import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!is", name = "e", descriptor = "Lclient!si;")
	public static Class54 aClass54_4;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public static int anInt10334;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "Lclient!mq;")
	public static Class212 aClass212_10;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_151 = new Class287(28, 3);

	@OriginalMember(owner = "client!is", name = "c", descriptor = "I")
	public static int anInt10332 = -1;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method8179(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(32) String local32;
		if (Static372.anInt6493 >= 200 && !Static577.aBoolean689 || Static372.anInt6493 >= 200) {
			Static260.method4014(Static573.aClass350_14.method7730(Static201.anInt4321));
			local32 = Static573.aClass350_15.method7730(Static201.anInt4321);
			if (local32 != null) {
				Static260.method4014(local32);
			}
			return;
		}
		local32 = Static468.method6414(arg0);
		if (local32 == null) {
			return;
		}
		@Pc(87) String local87;
		for (@Pc(48) int local48 = 0; local48 < Static372.anInt6493; local48++) {
			@Pc(56) String local56 = Static468.method6414(Static437.aStringArray36[local48]);
			if (local56 != null && local56.equals(local32)) {
				Static260.method4014(arg0 + Static573.aClass350_42.method7730(Static201.anInt4321));
				return;
			}
			if (Static530.aStringArray44[local48] != null) {
				local87 = Static468.method6414(Static530.aStringArray44[local48]);
				if (local87 != null && local87.equals(local32)) {
					Static260.method4014(arg0 + Static573.aClass350_42.method7730(Static201.anInt4321));
					return;
				}
			}
		}
		for (@Pc(114) int local114 = 0; local114 < Static336.anInt6067; local114++) {
			local87 = Static468.method6414(Static101.aStringArray10[local114]);
			if (local87 != null && local87.equals(local32)) {
				Static260.method4014(Static573.aClass350_47.method7730(Static201.anInt4321) + arg0 + Static573.aClass350_48.method7730(Static201.anInt4321));
				return;
			}
			if (Static554.aStringArray46[local114] != null) {
				@Pc(158) String local158 = Static468.method6414(Static554.aStringArray46[local114]);
				if (local158 != null && local158.equals(local32)) {
					Static260.method4014(Static573.aClass350_47.method7730(Static201.anInt4321) + arg0 + Static573.aClass350_48.method7730(Static201.anInt4321));
					return;
				}
			}
		}
		if (Static468.method6414(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString183).equals(local32)) {
			Static260.method4014(Static573.aClass350_45.method7730(Static201.anInt4321));
		} else {
			@Pc(224) Class3_Sub10 local224 = Static129.method2403(Static452.aClass353_2, Static73.aClass287_125);
			local224.aClass3_Sub26_Sub1_1.method6809(Static158.method2898(arg0));
			local224.aClass3_Sub26_Sub1_1.method6772(arg0);
			Static193.method3398(local224);
		}
	}
}
