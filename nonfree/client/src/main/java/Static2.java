import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "J")
	public static long aLong1;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2 = null;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_3 = Static193.method3027("runes");

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_4 = Static193.method3027("::noclip");

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_5 = Static193.method3027("Nehmen");

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_6 = Static193.method3027("Stufe)2");

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	public static void method8(@OriginalArg(0) int arg0) {
		Static174.anInt3527 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static89.anInt659; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static126.anInt2489; local6++) {
				if (Static118.aClass3_Sub6ArrayArrayArray1[arg0][local3][local6] == null) {
					Static118.aClass3_Sub6ArrayArrayArray1[arg0][local3][local6] = new Class3_Sub6(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
	public static void method10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass64_1 = null;
		}
	}
}
