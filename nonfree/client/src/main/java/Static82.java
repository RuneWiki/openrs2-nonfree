import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!ce;")
	public static final Class31 aClass31_3 = new Class31(64);

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt1507 = 2;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString54 = "Please remove ";

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method1378() {
		Static60.aClass70_26.method1399();
		Static174.aClass70_58.method1399();
		Static221.aClass70_72.method1399();
		Static186.aClass70_63.method1399();
		Static1.aClass70_1.method1399();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I")
	public static int method1379() {
		if (Static201.aBoolean284 || Static256.anInt4749 <= 0) {
			@Pc(14) int local14 = Static7.anInt149;
			@Pc(16) int local16 = Static79.anInt1449;
			@Pc(18) int local18 = Static194.anInt3666;
			@Pc(20) int local20 = Static267.anInt4963;
			@Pc(22) int local22 = Static25.anInt507;
			if (local18 < local14 && local22 + local18 > local14) {
				@Pc(36) int local36 = -1;
				@Pc(55) int local55;
				for (@Pc(38) int local38 = 0; local38 < Static256.anInt4749; local38++) {
					if (Static10.aBoolean19) {
						local55 = local20 + (Static256.anInt4749 + -1 - local38) * 16 + 33;
						if (local55 - 13 < local16 && local55 + 3 >= local16) {
							local36 = local38;
						}
					} else {
						local55 = (Static256.anInt4749 - local38 - 1) * 16 + local20 + 31;
						if (local16 > local55 - 13 && local16 <= local55 + 3) {
							local36 = local38;
						}
					}
				}
				if (local36 != -1) {
					local55 = 0;
					@Pc(116) Class4 local116 = new Class4(Static214.aClass211_24);
					for (@Pc(121) Class6_Sub32 local121 = (Class6_Sub32) local116.method51(); local121 != null; local121 = (Class6_Sub32) local116.method49()) {
						if (local55++ == local36) {
							return local121.anInt4927;
						}
					}
				}
			}
			return -1;
		} else if (Static176.aBoolean237 && Static354.aBooleanArray30[81] && Static256.anInt4749 > 2) {
			return ((Class6_Sub32) Static214.aClass211_24.aClass6_237.aClass6_247.aClass6_247).anInt4927;
		} else {
			return ((Class6_Sub32) Static214.aClass211_24.aClass6_237.aClass6_247).anInt4927;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
	public static void method1381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 >= Static311.anInt5837 && arg1 <= Static265.anInt4933) {
			@Pc(19) int local19 = Static6.method125(arg2, Static230.anInt4308, Static327.anInt3039);
			@Pc(25) int local25 = Static6.method125(arg0, Static230.anInt4308, Static327.anInt3039);
			Static225.method3953(local25, arg3, arg1, local19);
		}
	}
}
