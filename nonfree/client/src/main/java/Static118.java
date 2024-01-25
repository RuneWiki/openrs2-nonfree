import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public static int anInt2485;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method2105() {
		if (Static113.aBoolean192 || Static10.aClass2_Sub7_Sub21_1 == null) {
			return "";
		} else if ((Static10.aClass2_Sub7_Sub21_1.aString107 == null || Static10.aClass2_Sub7_Sub21_1.aString107.length() == 0) && Static10.aClass2_Sub7_Sub21_1.aString108 != null && Static10.aClass2_Sub7_Sub21_1.aString108.length() > 0) {
			return Static10.aClass2_Sub7_Sub21_1.aString108;
		} else {
			return Static10.aClass2_Sub7_Sub21_1.aString107;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method2106(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static511.aClass91Array3 == Static332.aClass91Array2) {
			return;
		}
		@Pc(10) int local10 = Static124.aClass91Array1[arg1].method7446(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class91 local23 = Static124.aClass91Array1[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7446(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
