import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_34 = new Class187(38, 7);

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
	public static int anInt2030 = 0;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!sga;Lclient!sga;)V")
	public static void method1837(@OriginalArg(1) Class41 arg0, @OriginalArg(2) Class41 arg1) {
		if (arg1.aClass41_68 != null) {
			arg1.method8644();
		}
		arg1.aClass41_67 = arg0;
		arg1.aClass41_68 = arg0.aClass41_68;
		arg1.aClass41_68.aClass41_67 = arg1;
		arg1.aClass41_67.aClass41_68 = arg1;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method1838(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static455.anInt7921; local14++) {
			if (arg0.equalsIgnoreCase(Static275.aStringArray17[local14])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static221.aStringArray11[local14])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Z")
	public static boolean method1839(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIBIIII)Lclient!ag;")
	public static Class11 method1841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg1 * 32147369L ^ (long) arg3 * 986053L ^ (long) arg5 * 475427L ^ (long) arg4 * 67481L ^ (long) arg2 * 97549L ^ (long) arg0 * 76724863L;
		@Pc(39) Class11 local39 = (Class11) Static360.aClass265_37.method6577(local33);
		if (local39 == null) {
			local39 = Static96.aClass143_3.method6191(arg4, arg2, arg5, arg3, arg1, arg0);
			Static360.aClass265_37.method6566(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}
}
