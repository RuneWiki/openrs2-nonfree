import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString133;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!el;")
	public static Class109 aClass109_216 = new Class109(90, -1);

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!um;")
	public static final Class354 aClass354_22 = new Class354("", 12);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method8825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(14) Class273 local14 = local7.aClass273_67; local14 != null; local14 = local14.aClass273_114) {
			@Pc(18) Class8_Sub1_Sub3 local18 = local14.aClass8_Sub1_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort109 == arg1 && local18.aShort108 == arg2) {
				Static486.method7027(local18, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)Lclient!dja;")
	public static Class88 method8826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class88 local7 = new Class88();
		local7.anInt1765 = arg0 + 5 + 1;
		local7.anInt1778 = -1;
		local7.anInt1781 = arg1 + 1 + 5;
		local7.anInt1763 = -1;
		local7.anIntArrayArray12 = new int[local7.anInt1765][local7.anInt1781];
		local7.method1595();
		return local7;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Z")
	public static boolean method8829(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}
}
