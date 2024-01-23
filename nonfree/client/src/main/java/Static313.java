import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	public static int anInt6050 = 0;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
	public static volatile int anInt6053 = 0;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	public static int anInt6054 = -1;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString372 = null;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public static void method4828() {
		Static206.aByteArrayArrayArray18 = null;
		Static8.aByteArrayArrayArray1 = null;
		Static170.anIntArrayArrayArray9 = null;
		Static229.anIntArray465 = null;
		Static76.anIntArray649 = null;
		Static151.aByteArrayArrayArray15 = null;
		Static78.aByteArrayArrayArray4 = null;
		Static57.aByteArrayArrayArray3 = null;
		Static242.anIntArray491 = null;
		Static303.anIntArray650 = null;
		Static253.anIntArray523 = null;
		Static264.anIntArray549 = null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!f;III)V")
	public static void method4830(@OriginalArg(0) Class53_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt4007 == arg1 && arg1 != -1) {
			@Pc(89) Class46 local89 = Static156.method2501(arg1);
			@Pc(92) int local92 = local89.anInt1238;
			if (local92 == 1) {
				arg0.anInt3996 = arg2;
				arg0.anInt3970 = 0;
				arg0.anInt4044 = 0;
				arg0.anInt4011 = 1;
				arg0.anInt4001 = 0;
				Static213.method3474(local89, arg0.anInt4002, arg0.anInt3974, arg0.anInt3970, arg0 == Static154.aClass53_Sub1_Sub1_2);
			}
			if (local92 == 2) {
				arg0.anInt4001 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt4007 == -1 || Static156.method2501(arg1).anInt1243 >= Static156.method2501(arg0.anInt4007).anInt1243) {
			arg0.anInt4007 = arg1;
			arg0.anInt4044 = 0;
			arg0.anInt3996 = arg2;
			arg0.anInt3970 = 0;
			arg0.anInt4011 = 1;
			arg0.anInt4001 = 0;
			arg0.anInt4030 = arg0.anInt3965;
			if (arg0.anInt4007 != -1) {
				Static213.method3474(Static156.method2501(arg0.anInt4007), arg0.anInt4002, arg0.anInt3974, arg0.anInt3970, arg0 == Static154.aClass53_Sub1_Sub1_2);
			}
		}
	}
}
