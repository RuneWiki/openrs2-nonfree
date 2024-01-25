import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_197 = new Class56(43, 2);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)I")
	public static int method4248(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBII)I")
	public static int method4249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1023 - arg1;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
	public static void method4250() {
		if (Static173.method2395(Static8.anInt119) || Static405.method5418(Static8.anInt119)) {
			Static342.method4552(Static235.anInt4004 >> 10, 5000, Static393.anInt7135 >> 10);
		} else {
			@Pc(31) int local31 = Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray560[0] >> 3;
			@Pc(38) int local38 = Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray559[0] >> 3;
			if (local31 >= 0 && Static337.anInt5497 >> 3 > local31 && local38 >= 0 && Static282.anInt4644 >> 3 > local38) {
				Static342.method4552(local31, 5000, local38);
			} else {
				Static342.method4552(Static337.anInt5497 >> 4, 0, Static282.anInt4644 >> 4);
			}
		}
		Static353.method4678();
		Static35.method465();
		Static162.method62();
		Static389.method5135();
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	public static void method4252() {
		try {
			if (Static350.anInt5812 == 1) {
				@Pc(20) int local20 = Static383.aClass4_Sub14_Sub1_2.method1913();
				if (local20 > 0 && Static383.aClass4_Sub14_Sub1_2.method1910()) {
					local20 -= Static107.anInt2011;
					if (local20 < 0) {
						local20 = 0;
					}
					Static383.aClass4_Sub14_Sub1_2.method1896(local20);
				} else {
					Static383.aClass4_Sub14_Sub1_2.method1918();
					Static383.aClass4_Sub14_Sub1_2.method1905();
					Static238.aClass4_Sub17_2 = null;
					Static302.aClass136_1 = null;
					if (Static252.aClass211_63 == null) {
						Static350.anInt5812 = 0;
					} else {
						Static350.anInt5812 = 2;
					}
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static383.aClass4_Sub14_Sub1_2.method1918();
			Static302.aClass136_1 = null;
			Static252.aClass211_63 = null;
			Static238.aClass4_Sub17_2 = null;
			Static350.anInt5812 = 0;
		}
	}
}
