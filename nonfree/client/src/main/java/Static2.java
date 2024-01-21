import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "Lclient!kh;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
	public static int anInt36;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "Lclient!vd;")
	public static Class2_Sub5_Sub3 aClass2_Sub5_Sub3_1;

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "Lclient!cd;")
	public static Class10 aClass10_28 = Static51.method932("rect_debug=");

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "Lclient!cd;")
	public static Class10 aClass10_29 = Static51.method932("titlebox");

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "Lclient!cd;")
	public static Class10 aClass10_30 = Static51.method932(" x ");

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "Lclient!cd;")
	private static Class10 aClass10_31 = Static51.method932("Hidden");

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "Lclient!cd;")
	public static Class10 aClass10_32 = aClass10_31;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!kh;)V")
	public static void method29(@OriginalArg(1) Class29 arg0) {
		Static36.aClass29_20 = arg0;
		Static40.anInt980 = Static36.aClass29_20.method1039(16);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public static void method30() {
		aClass10_30 = null;
		aClass10_31 = null;
		aClass10_32 = null;
		aClass29_1 = null;
		aClass2_Sub5_Sub3_1 = null;
		aClass10_28 = null;
		aClass10_29 = null;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
	public static void method32(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub24 local12 = (Class2_Sub24) Static179.aClass18_13.method683((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray396.length; local17++) {
				local12.anIntArray396[local17] = -1;
				local12.anIntArray395[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!kh;ILclient!cd;Lclient!cd;)Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3 method33(@OriginalArg(0) Class29 arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) Class10 arg2) {
		@Pc(16) int local16 = arg0.method1026(arg1);
		@Pc(22) int local22 = arg0.method1020(local16, arg2);
		return Static99.method1644(local22, local16, arg0);
	}
}
