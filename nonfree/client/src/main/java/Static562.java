import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "[Lclient!vj;")
	public static Class21_Sub1[] aClass21_Sub1Array2;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
	public static final int[] anIntArray576 = new int[32];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method7946(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class4_Sub39 local17 = Static32.method999(Static402.aClass356_1, Static357.aClass344_59);
			local17.aClass4_Sub13_Sub2_1.method7052(Static393.method6014(arg0));
			local17.aClass4_Sub13_Sub2_1.method7002(arg0);
			Static50.method1166(local17);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Lclient!iga;")
	public static Class149 method7947() {
		try {
			return (Class149) Class.forName("Class149_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class149_Sub2();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method7948(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = local19 + (arg0 ? Static115.aClass213_2.anInt6344 : Static115.aClass213_2.anInt6346);
		for (@Pc(37) int local37 = local19; local37 < local29; local37++) {
			@Pc(44) Class4_Sub6_Sub3 local44 = Static115.aClass213_2.method5000(local37);
			if (local44.aBoolean193 && local44.method1925().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static519.aShortArray130 = null;
					Static393.anInt7666 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local13; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local13++] = (short) local37;
			}
		}
		Static393.anInt7666 = local13;
		Static191.anInt3979 = 0;
		Static519.aShortArray130 = local11;
		@Pc(116) String[] local116 = new String[Static393.anInt7666];
		for (@Pc(118) int local118 = 0; local118 < Static393.anInt7666; local118++) {
			local116[local118] = Static115.aClass213_2.method5000(local11[local118]).method1925();
		}
		Static292.method4721(Static519.aShortArray130, local116);
	}
}
