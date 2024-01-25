import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!o;")
	public static Class259 aClass259_2;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
	public static final int anInt928 = 1338;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
	public static int anInt935 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZJII)Ljava/lang/String;")
	public static String method925(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static585.method8158(arg0);
		@Pc(10) Calendar local10 = Static390.aCalendar2;
		@Pc(28) int local28 = local10.get(5);
		@Pc(32) int local32 = local10.get(2);
		@Pc(36) int local36 = local10.get(1);
		@Pc(40) int local40 = local10.get(11);
		@Pc(44) int local44 = local10.get(12);
		return arg1 == 3 ? Static97.method1403(arg1, arg0) : Integer.toString(local28 / 10) + local28 % 10 + "-" + Static331.aStringArrayArray8[arg1][local32] + "-" + local36 + " " + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z")
	public static boolean method927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)S")
	public static short method928(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(38) int local38 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(50) int local50 = local19 + local38;
		@Pc(56) int local56;
		if (local50 == 0) {
			local56 = local38 << 1;
		} else {
			local56 = (local38 << 8) / local50;
		}
		return (short) (local50 | local56 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Lclient!ld;")
	public static Class60_Sub6 method929() {
		@Pc(14) Class60_Sub6 local14 = (Class60_Sub6) Static527.aClass385_8.method8772();
		if (local14 == null) {
			return new Class60_Sub6();
		} else {
			Static411.anInt7156--;
			return local14;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBIII)V")
	public static void method930(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 != 8 && arg2 != 16) {
			@Pc(107) Class243 local107 = Static334.aClass243ArrayArrayArray2[arg1][arg0][arg3];
			if (local107 != null) {
				if (arg2 == 1) {
					local107.aShort72 = 0;
				} else if (arg2 == 2) {
					local107.aShort74 = 0;
				}
			}
			Static19.method237();
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < Static373.anInt6284; local15++) {
			@Pc(21) Class230 local21 = Static329.aClass230Array4[local15];
			if (local21.aByte89 == arg2 && local21.aShort65 == arg0 && arg3 == local21.aShort66 || arg0 == local21.aShort64 && arg3 == local21.aShort66) {
				if (Static373.anInt6284 != local15) {
					Static695.method5647(Static329.aClass230Array4, local15 + 1, Static329.aClass230Array4, local15, Static329.aClass230Array4.length - local15 - 1);
				}
				Static373.anInt6284--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)[Lclient!rj;")
	public static Class318[] method932() {
		return new Class318[] { Static358.aClass318_13, Static450.aClass318_16, Static65.aClass318_2 };
	}
}
