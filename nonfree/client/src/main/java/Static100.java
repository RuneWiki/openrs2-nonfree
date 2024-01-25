import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!fn;")
	public static final Class105 aClass105_1 = new Class105(128);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZIB)V")
	public static void method2038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (Static278.method4887(arg3)) {
			Static254.method4606(Static511.aClass91ArrayArray2[arg3], -1, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
	public static int method2039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static523.anIntArrayArray120 == null ? 0 : Static523.anIntArrayArray120[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!gn;")
	public static Class20_Sub1 method2041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class232 local14 = local7.aClass232_2; local14 != null; local14 = local14.aClass232_3) {
			@Pc(18) Class20_Sub1 local18 = local14.aClass20_Sub1_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort124 == arg1 && local18.aShort123 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
