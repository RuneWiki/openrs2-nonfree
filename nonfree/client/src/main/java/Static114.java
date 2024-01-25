import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "J")
	public static long aLong33;

	@OriginalMember(owner = "client!eaa", name = "o", descriptor = "Lclient!pj;")
	public static Class248 aClass248_20;

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_29 = new Class98(7, 8);

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "[B")
	public static final byte[] aByteArray28 = new byte[2048];

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_30 = new Class98(30, -1);

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
	public static int anInt1963 = 0;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILclient!oa;B)Lclient!mj;")
	public static Class202 method1793(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1) {
		@Pc(17) Class118 local17 = Static85.method1185(arg0, arg1);
		return local17 == null ? null : local17.aClass202_8;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1795(@OriginalArg(0) String arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static243.aStringArray23.length; local15++) {
			if (Static243.aStringArray23[local15].equalsIgnoreCase(arg0)) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method1796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 + arg6 > arg5 && arg6 < arg3 + arg5) {
			return arg7 < arg0 + arg2 && arg2 < arg4 + arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II[J[Ljava/lang/Object;I)V")
	public static void method1797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) Object[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg0) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local16;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local30;
		@Pc(48) int local48 = local16 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg1; local50 < arg0; local50++) {
			if (arg2[local50] < (long) (local50 & local48) + local16) {
				@Pc(71) long local71 = arg2[local50];
				arg2[local50] = arg2[local12];
				arg2[local12] = local71;
				@Pc(85) Object local85 = arg3[local50];
				arg3[local50] = arg3[local12];
				arg3[local12++] = local85;
			}
		}
		arg2[arg0] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg0] = arg3[local12];
		arg3[local12] = local30;
		method1797(local12 - 1, arg1, arg2, arg3);
		method1797(arg0, local12 + 1, arg2, arg3);
	}
}
