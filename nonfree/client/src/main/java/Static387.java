import java.awt.Rectangle;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
	public static int anInt6465 = 0;

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
	public static int anInt6472 = 0;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIBII)V")
	public static void method5432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static514.anInt8102; local3++) {
			@Pc(9) Rectangle local9 = Class167_Sub2.aRectangleArray2[local3];
			if (local9.width + local9.x > arg0 && arg0 + arg2 > local9.x && local9.height + local9.y > arg3 && local9.y < arg1 + arg3) {
				Static170.aBooleanArray10[local3] = true;
			}
		}
		Static63.method1147(arg3, arg2 + arg0, arg0, arg1 + arg3);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IBIILclient!tha;)V")
	public static void method5433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub48 arg3) {
		@Pc(20) long local20 = (long) (arg2 << 28 | arg0 << 14 | arg1);
		@Pc(28) Class3_Sub20 local28 = (Class3_Sub20) Static462.aClass333_29.method7489(local20);
		if (local28 == null) {
			local28 = new Class3_Sub20();
			Static462.aClass333_29.method7488(local20, local28);
			local28.aClass302_17.method6613(arg3);
			return;
		}
		@Pc(53) Class15 local53 = Static117.aClass197_2.method4518(arg3.anInt9328);
		@Pc(56) int local56 = local53.anInt461;
		if (local53.anInt454 == 1) {
			local56 *= arg3.anInt9332 + 1;
		}
		for (@Pc(75) Class3_Sub48 local75 = (Class3_Sub48) local28.aClass302_17.method6603(); local75 != null; local75 = (Class3_Sub48) local28.aClass302_17.method6605()) {
			local53 = Static117.aClass197_2.method4518(local75.anInt9328);
			@Pc(86) int local86 = local53.anInt461;
			if (local53.anInt454 == 1) {
				local86 *= local75.anInt9332 + 1;
			}
			if (local56 > local86) {
				Static341.method4981(arg3, local75);
				return;
			}
		}
		local28.aClass302_17.method6613(arg3);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5436(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
