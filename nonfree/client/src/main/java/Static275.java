import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jfa", name = "w", descriptor = "Lclient!la;")
	public static Class208 aClass208_63;

	@OriginalMember(owner = "client!jfa", name = "v", descriptor = "I")
	public static int anInt4791 = 0;

	@OriginalMember(owner = "client!jfa", name = "s", descriptor = "Lclient!el;")
	public static final Class109 aClass109_106 = new Class109(126, 6);

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BII)V")
	public static void method4065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static594.aClass224_12.method5256(Static582.aClass335_25.method8349(Static323.anInt5795));
		@Pc(89) int local89;
		@Pc(41) int local41;
		if (Static320.aBoolean437) {
			for (@Pc(29) Class5_Sub5_Sub18 local29 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2890(); local29 != null; local29 = (Class5_Sub5_Sub18) Static86.aClass149_5.method2894()) {
				if (local29.anInt7610 == 1) {
					local41 = Static195.method2803((Class5_Sub5_Sub19) local29.aClass149_8.aClass5_Sub5_24.aClass5_Sub5_66);
				} else {
					local41 = Static534.method549(local29);
				}
				if (local13 < local41) {
					local13 = local41;
				}
			}
			local13 += 8;
			Static42.anInt1723 = (Static519.aBoolean664 ? 26 : 22) + Static220.anInt3580 * 16;
			local89 = Static220.anInt3580 * 16 + 21;
		} else {
			for (@Pc(96) Class5_Sub5_Sub19 local96 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1916(); local96 != null; local96 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1915()) {
				local41 = Static195.method2803(local96);
				if (local13 < local41) {
					local13 = local41;
				}
			}
			local89 = Static481.anInt8130 * 16 + 21;
			Static42.anInt1723 = Static481.anInt8130 * 16 + (Static519.aBoolean664 ? 26 : 22);
			local13 += 8;
		}
		@Pc(147) int local147 = arg0 - local13 / 2;
		if (local13 + local147 > Static70.anInt1125) {
			local147 = Static70.anInt1125 - local13;
		}
		if (local147 < 0) {
			local147 = 0;
		}
		local41 = arg1;
		if (Static631.anInt10283 < arg1 + local89) {
			local41 = Static631.anInt10283 - local89;
		}
		if (local41 < 0) {
			local41 = 0;
		}
		Static327.anInt5831 = local147;
		Static526.aBoolean669 = true;
		Static498.anInt8306 = local13;
		Static507.anInt8693 = local41;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z")
	public static boolean method4066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static179.method2591(arg1, arg0) & Static287.method4313(arg1, arg0);
	}
}
