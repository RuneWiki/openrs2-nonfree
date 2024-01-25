import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
	public static int anInt2296;

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "Lclient!la;")
	public static Class57 aClass57_4;

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
	public static int anInt2297;

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "Lclient!rv;")
	public static Class10_Sub7_Sub4 aClass10_Sub7_Sub4_1;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!je;")
	public static final Class127 aClass127_6 = new Class127(13, 0, 1, 0);

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "Lclient!mn;")
	public static Class167 aClass167_12 = new Class167(8);

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "Lclient!s;")
	public static final Class217 aClass217_51 = new Class217(38, 3);

	@OriginalMember(owner = "client!fj", name = "y", descriptor = "Z")
	public static boolean aBoolean142 = true;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIZIII)I")
	public static int method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(16) int local16 = arg5;
			arg5 = arg2;
			arg2 = local16;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg5;
		} else {
			return 7 + 1 - arg0 - arg2;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)Z")
	public static boolean method1979(@OriginalArg(1) int arg0) {
		if (arg0 == 51 || arg0 == 9 || arg0 == 6 || arg0 == 22 || arg0 == 20) {
			return true;
		} else {
			return arg0 == 11 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)[Lclient!lf;")
	public static Class153[] method1981() {
		return new Class153[] { Static273.aClass153_4, Static68.aClass153_1, Static189.aClass153_3 };
	}
}
