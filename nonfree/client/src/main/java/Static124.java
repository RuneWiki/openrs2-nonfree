import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!io", name = "W", descriptor = "[I")
	public static int[] anIntArray283;

	@OriginalMember(owner = "client!io", name = "ab", descriptor = "I")
	public static int anInt2371 = 0;

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(II)V")
	public static void method2077(@OriginalArg(1) int arg0) {
		Static11.anIntArray541 = new int[arg0];
		Static174.anIntArray398 = new int[arg0];
		Static286.anIntArray569 = new int[arg0];
		Static100.anIntArray184 = new int[arg0];
		Static64.anIntArray110 = new int[arg0];
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BZ)I")
	public static int method2078(@OriginalArg(1) boolean arg0) {
		@Pc(13) long local13 = Static128.method2196();
		for (@Pc(25) Class3_Sub32 local25 = arg0 ? (Class3_Sub32) Static187.aClass30_20.method664() : (Class3_Sub32) Static187.aClass30_20.method671(); local25 != null; local25 = (Class3_Sub32) Static187.aClass30_20.method671()) {
			if ((local25.aLong242 & 0x3FFFFFFFFFFFFFFFL) < local13) {
				if ((local25.aLong242 & 0x4000000000000000L) != 0L) {
					@Pc(47) int local47 = (int) local25.aLong243;
					Static161.anIntArray347[local47] = Static229.anIntArray496[local47];
					local25.method5013();
					return local47;
				}
				local25.method5013();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
	public static void method2079(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static73.method1117(0, arg0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZIIIBI)V")
	public static void method2081(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (Static283.aBoolean393) {
			@Pc(24) int local24 = arg1 - 334;
			if (local24 < 0) {
				local24 = 0;
			} else if (local24 > 100) {
				local24 = 100;
			}
			@Pc(52) int local52 = local24 * (Static45.aShort1 - Static279.aShort50) / 100 + Static279.aShort50;
			if (local52 < Static219.aShort37) {
				local52 = Static219.aShort37;
			} else if (local52 > Static115.aShort24) {
				local52 = Static115.aShort24;
			}
			@Pc(79) int local79 = local52 * 512 * arg1 / (arg3 * 334);
			@Pc(109) int local109;
			@Pc(116) int local116;
			@Pc(84) short local84;
			if (Static49.aShort10 > local79) {
				local84 = Static49.aShort10;
				local52 = local84 * arg3 * 334 / (arg1 * 512);
				if (local52 > Static115.aShort24) {
					local52 = Static115.aShort24;
					local109 = arg1 * 512 * local52 / (local84 * 334);
					local116 = (arg3 - local109) / 2;
					if (arg0) {
						Static234.method3976();
						Static234.method3973(arg2, arg4, local116, arg1, 0);
						Static234.method3973(arg2 + arg3 - local116, arg4, local116, arg1, 0);
					}
					arg3 -= local116 * 2;
					arg2 += local116;
				}
			} else if (local79 > Static109.aShort33) {
				local84 = Static109.aShort33;
				local52 = local84 * arg3 * 334 / (arg1 * 512);
				if (Static219.aShort37 > local52) {
					local52 = Static219.aShort37;
					local109 = arg3 * 334 * local84 / (local52 * 512);
					local116 = (arg1 - local109) / 2;
					if (arg0) {
						Static234.method3976();
						Static234.method3973(arg2, arg4, arg3, local116, 0);
						Static234.method3973(arg2, arg4 + arg1 - local116, arg3, local116, 0);
					}
					arg4 += local116;
					arg1 -= local116 * 2;
				}
			}
			Static75.anInt1415 = arg1 * local52 / 334;
		}
		Static250.anInt5158 = (short) arg1;
		Static62.anInt1157 = (short) arg3;
		Static92.anInt1683 = arg2;
		Static246.anInt4989 = arg4;
	}
}
