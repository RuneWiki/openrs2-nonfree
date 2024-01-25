import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	public static int anInt292;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Lclient!nn;")
	public static Class79_Sub1 aClass79_Sub1_1;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_4 = new Class265(27, 6);

	@OriginalMember(owner = "client!an", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!an", name = "o", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_5 = new Class265(85, 5);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(CI)Z")
	public static boolean method254(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static22.method465(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static328.aCharArray5;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static95.aCharArray1;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(54) char local54 = local46[local48];
				if (local54 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZIIIIII)V")
	public static void method259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static8.anInt223 && Static184.anInt3600 >= arg4 && Static430.anInt7123 <= arg0 && arg2 <= Static181.anInt3543) {
			if (arg5 == 1) {
				Static79.method1466(arg3, arg0, arg2, arg4, arg1);
			} else {
				Static397.method5225(arg3, arg1, arg4, arg5, arg2, arg0);
			}
		} else if (arg5 == 1) {
			Static149.method2454(arg1, arg2, arg3, arg0, arg4);
		} else {
			Static83.method1611(arg5, arg4, arg0, arg2, arg1, arg3);
		}
	}
}
