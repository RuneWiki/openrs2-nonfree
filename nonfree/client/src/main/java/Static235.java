import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	public static int anInt4004;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BLclient!ya;)V")
	public static void method3184(@OriginalArg(1) Class135 arg0) {
		arg0.OA(0, 0, Static345.anInt5723, 350);
		arg0.O(0, 0, Static345.anInt5723, 350, Static5.anInt89 << 24 | 0x332277, 1);
		@Pc(34) int local34 = 350 / Static306.anInt5009;
		@Pc(46) int local46;
		if (Static197.anInt3567 > 0) {
			local46 = 346 - Static306.anInt5009 - 4;
			@Pc(56) int local56 = local34 * local46 / (local34 + Static197.anInt3567 - 1);
			@Pc(58) int local58 = 4;
			if (Static197.anInt3567 > 1) {
				local58 = (Static197.anInt3567 - Static278.anInt4618 - 1) * (-local56 + local46) / (Static197.anInt3567 - 1) + 4;
			}
			arg0.O(Static345.anInt5723 - 16, local58, 12, local56, Static5.anInt89 << 24 | 0x332277, 2);
			for (@Pc(97) int local97 = Static278.anInt4618; local34 + Static278.anInt4618 > local97 && Static197.anInt3567 > local97; local97++) {
				@Pc(108) String[] local108 = Static15.method181(Static307.aStringArray35[local97], '\b');
				@Pc(117) int local117 = (Static345.anInt5723 - 8 - 16) / local108.length;
				for (@Pc(119) int local119 = 0; local119 < local108.length; local119++) {
					@Pc(127) int local127 = local119 * local117 + 8;
					arg0.OA(local127, 0, local117 + local127 - 8, 350);
					Static283.aClass123_6.method5784(local127, -1, local108[local119], -16777216, 348 - Static260.anInt7669 - Static221.aClass158_6.anInt3839 - (-Static278.anInt4618 + local97) * Static306.anInt5009);
				}
			}
		}
		arg0.OA(0, 0, Static345.anInt5723, 350);
		arg0.method5402(Static345.anInt5723, 0, -1, 350 - Static260.anInt7669);
		Static49.aClass123_1.method5784(10, -1, "--> " + Static406.aString70, -16777216, 349 - Static363.aClass158_11.anInt3839);
		local46 = -1;
		if (Static265.anInt4371 % 30 > 15) {
			local46 = 16777215;
		}
		arg0.method5368(12, Static363.aClass158_11.method3038("--> " + Static406.aString70.substring(0, Static396.anInt6462)) + 10, 350 - Static363.aClass158_11.anInt3839 + -11, local46);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Lclient!hd;")
	public static Class110 method3185(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static412.aClass110ArrayArray2[local12] == null || Static412.aClass110ArrayArray2[local12][local16] == null) {
			@Pc(30) boolean local30 = Static131.method1881(local12);
			if (!local30) {
				return null;
			}
		}
		return Static412.aClass110ArrayArray2[local12][local16];
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)V")
	public static void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(7, arg0);
		local8.method5529();
		local8.anInt6873 = arg1;
	}
}
