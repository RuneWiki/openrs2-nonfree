import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_62 = new Class70(22, 2);

	@OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
	public static int anInt5818 = 0;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Lclient!vg;")
	public static Class341 method4758(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static578.aClass341ArrayArray2[local12] == null || Static578.aClass341ArrayArray2[local12][local16] == null) {
			@Pc(30) boolean local30 = Static504.method4690(local12);
			if (!local30) {
				return null;
			}
		}
		return Static578.aClass341ArrayArray2[local12][local16];
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4761(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static233.anInt7999; local18++) {
			if (arg0.equalsIgnoreCase(Static563.aStringArray39[local18])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static574.aStringArray41[local18])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[I[II)V")
	public static void method4762(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg0) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) int local24 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local24;
		@Pc(38) int local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		@Pc(57) int local57 = ~local24 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg3; local59 < arg0; local59++) {
			if ((local57 & local59) + local24 > arg1[local59]) {
				@Pc(78) int local78 = arg1[local59];
				arg1[local59] = arg1[local20];
				arg1[local20] = local78;
				@Pc(92) int local92 = arg2[local59];
				arg2[local59] = arg2[local20];
				arg2[local20++] = local92;
			}
		}
		arg1[arg0] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method4762(local20 - 1, arg1, arg2, arg3);
		method4762(arg0, arg1, arg2, local20 + 1);
	}
}
