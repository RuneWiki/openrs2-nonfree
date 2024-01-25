import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!dda;")
	public static Class53 aClass53_148;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "[B")
	public static final byte[] aByteArray119 = new byte[2048];

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar9 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method7606(@OriginalArg(1) Class39 arg0) {
		arg0.N(0, 0, Static461.anInt8348, 350);
		arg0.f(0, 0, Static461.anInt8348, 350, Static18.anInt431 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static291.anInt5364;
		@Pc(39) int local39;
		if (Static262.anInt7160 > 0) {
			local39 = 346 - Static291.anInt5364 - 4;
			@Pc(50) int local50 = local27 * local39 / (local27 + Static262.anInt7160 - 1);
			@Pc(52) int local52 = 4;
			if (Static262.anInt7160 > 1) {
				local52 = (Static262.anInt7160 - Static62.anInt1194 - 1) * (-local50 + local39) / (Static262.anInt7160 - 1) + 4;
			}
			arg0.f(Static461.anInt8348 - 16, local52, 12, local50, Static18.anInt431 << 24 | 0x332277, 2);
			for (@Pc(91) int local91 = Static62.anInt1194; local91 < Static62.anInt1194 + local27 && Static262.anInt7160 > local91; local91++) {
				@Pc(100) String[] local100 = Static225.method3542('\b', Static277.aStringArray27[local91]);
				@Pc(107) int local107 = (Static461.anInt8348 - 24) / local100.length;
				for (@Pc(109) int local109 = 0; local109 < local100.length; local109++) {
					@Pc(118) int local118 = local107 * local109 + 8;
					arg0.N(local118, 0, local118 + local107 - 8, 350);
					Static477.aClass47_4.method7617(-1, -16777216, local100[local109], local118, 350 - Static75.anInt1564 - Static124.aClass52_6.anInt1673 - Static291.anInt5364 * (-Static62.anInt1194 + local91) - 2);
				}
			}
		}
		arg0.N(0, 0, Static461.anInt8348, 350);
		arg0.method6067(-1, 350 - Static75.anInt1564, 0, Static461.anInt8348);
		Static175.aClass47_1.method7617(-1, -16777216, "--> " + Static118.aString57, 10, 350 - Static188.aClass52_2.anInt1673 - 1);
		if (!Static186.aBoolean264) {
			return;
		}
		local39 = -1;
		if (Static115.anInt2326 % 30 > 15) {
			local39 = 16777215;
		}
		arg0.method6071(12, local39, 339 - Static188.aClass52_2.anInt1673, Static188.aClass52_2.method1582("--> " + Static118.aString57.substring(0, Static210.anInt3785)) + 10);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method7614(@OriginalArg(0) Class39 arg0) {
		if (Static135.anInt2544 != Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 && (Static399.aClass262ArrayArrayArray2 != null && Static513.method7501(Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90, arg0))) {
			Static135.anInt2544 = Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90;
		}
	}
}
