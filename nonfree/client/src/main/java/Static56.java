import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dk", name = "Y", descriptor = "Lclient!ak;")
	public static Class9 aClass9_2;

	@OriginalMember(owner = "client!dk", name = "ab", descriptor = "Lclient!wo;")
	public static Class216 aClass216_16;

	@OriginalMember(owner = "client!dk", name = "bb", descriptor = "Lclient!wo;")
	public static Class216 aClass216_17;

	@OriginalMember(owner = "client!dk", name = "X", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_14 = new Class87(30);

	@OriginalMember(owner = "client!dk", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString19 = null;

	@OriginalMember(owner = "client!dk", name = "cb", descriptor = "S")
	public static short aShort25 = 320;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIZLclient!ak;Lclient!uo;I)V")
	public static void method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) Class32 arg5) {
		if (arg3) {
			Static77.aClass5_10.method3621((Static194.anInt4145 - Static77.aClass5_10.method3632()) / 2, (Static271.anInt5530 - Static77.aClass5_10.method3630()) / 2);
			Static91.aClass5_13.method3621((Static194.anInt4145 - Static91.aClass5_13.method3632()) / 2, 18);
		}
		arg4.method5019(-1, Static194.anInt4145 / 2, arg2, Static271.anInt5530 / 2 - 26, Static8.anInt5875 == 1 ? Static27.aClass34_21.method1285(Static259.anInt2907) : Static202.aClass34_129.method1285(Static259.anInt2907));
		@Pc(62) int local62 = Static271.anInt5530 / 2 - 18;
		arg5.method2200(Static194.anInt4145 / 2 - 152, local62, 304, 34, arg1, 0);
		arg5.method2200(Static194.anInt4145 / 2 - 151, local62 - -1, 302, 32, 0, 0);
		arg5.method2241(Static194.anInt4145 / 2 - 150, local62 + 2, Static237.anInt4904 * 3, 30, arg0, 0);
		arg5.method2241(Static194.anInt4145 / 2 + Static237.anInt4904 * 3 - 150, local62 - -2, 300 - Static237.anInt4904 * 3, 30, 0, 0);
		arg4.method5019(-1, Static194.anInt4145 / 2, arg2, Static271.anInt5530 / 2 + 4, Static307.aString59);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;IZ)Z")
	public static boolean method1460(@OriginalArg(1) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = arg0.length();
		for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
			@Pc(52) char local52 = arg0.charAt(local46);
			if (local46 == 0) {
				if (local52 == '-') {
					local28 = true;
					continue;
				}
				if (local52 == '+') {
					continue;
				}
			}
			@Pc(77) int local77;
			if (local52 >= '0' && local52 <= '9') {
				local77 = local52 - '0';
			} else if (local52 >= 'A' && local52 <= 'Z') {
				local77 = local52 - '7';
			} else if (local52 >= 'a' && local52 <= 'z') {
				local77 = local52 - 'W';
			} else {
				return false;
			}
			if (local77 >= 10) {
				return false;
			}
			if (local28) {
				local77 = -local77;
			}
			@Pc(123) int local123 = local77 + local41 * 10;
			if (local41 != local123 / 10) {
				return false;
			}
			local41 = local123;
			local39 = true;
		}
		return local39;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
	public static void method1463() {
		@Pc(5) Class87 local5 = Static320.aClass87_46;
		synchronized (Static320.aClass87_46) {
			Static320.aClass87_46.method2485();
		}
	}
}
