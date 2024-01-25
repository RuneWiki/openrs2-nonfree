import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_34 = new Class81(108, 12);

	@OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
	public static int anInt1858 = 0;

	@OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
	public static int anInt1859 = 13156520;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method1339(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static269.aClass188_72.anInt5309 = 1;
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(18) short[] local18 = new short[16];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < Static350.aClass149_2.anInt4314; local22++) {
			@Pc(29) Class30 local29 = Static350.aClass149_2.method3483(local22);
			if ((!arg1 || local29.aBoolean90) && local29.anInt1001 == -1 && local29.anInt1021 == -1 && local29.anInt1017 == 0 && local29.aString5.toLowerCase().indexOf(local15) != -1) {
				if (local20 >= 250) {
					Static26.anInt564 = -1;
					Static435.aShortArray105 = null;
					return;
				}
				if (local20 >= local18.length) {
					@Pc(82) short[] local82 = new short[local18.length * 2];
					for (@Pc(84) int local84 = 0; local84 < local20; local84++) {
						local82[local84] = local18[local84];
					}
					local18 = local82;
				}
				local18[local20++] = (short) local22;
			}
		}
		Static435.aShortArray105 = local18;
		Static24.anInt521 = 0;
		Static26.anInt564 = local20;
		@Pc(118) String[] local118 = new String[Static26.anInt564];
		for (@Pc(120) int local120 = 0; local120 < Static26.anInt564; local120++) {
			local118[local120] = Static350.aClass149_2.method3483(local18[local120]).aString5;
		}
		Static225.method3480(Static435.aShortArray105, local118);
		Static269.aClass188_72.method4293();
		Static269.aClass188_72.anInt5309 = 2;
	}
}
