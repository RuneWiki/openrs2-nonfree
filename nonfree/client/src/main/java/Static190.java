import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "Lclient!oe;")
	public static Class266 aClass266_2;

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_94 = new Class160(112, 7);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_95 = new Class160(77, 6);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)Z")
	public static boolean method2832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static227.method3836(arg1, arg2)) {
			return (arg1 & 0x9000) != 0 | Static646.method9071(arg1, arg2) | Static195.method2932(arg2, arg1) ? true : (Static238.method3986(arg1, arg2) | (arg1 & 0x2000) != 0 | Static218.method3766(arg1, arg2)) & (arg2 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(JJ)J")
	public static long method2833(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
	public static void method2835() {
		if (Static556.aClass342ArrayArray1 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static556.aClass342ArrayArray1.length; local14++) {
			for (@Pc(17) int local17 = 0; local17 < Static556.aClass342ArrayArray1[local14].length; local17++) {
				Static556.aClass342ArrayArray1[local14][local17] = Static494.aClass342_2;
			}
		}
	}
}
