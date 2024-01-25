import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "Lclient!ln;")
	public static Class187 aClass187_1;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_142 = new Class40(90, -1);

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_145 = new Class332(8);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIBIII)V")
	public static void method5097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static60.anInt971 < arg1 || arg0 < Static134.anInt2364) {
			return;
		}
		@Pc(20) boolean local20;
		if (arg2 < Static235.anInt3970) {
			local20 = false;
			arg2 = Static235.anInt3970;
		} else if (arg2 > Static151.anInt2683) {
			arg2 = Static151.anInt2683;
			local20 = false;
		} else {
			local20 = true;
		}
		@Pc(47) boolean local47;
		if (arg4 < Static235.anInt3970) {
			local47 = false;
			arg4 = Static235.anInt3970;
		} else if (arg4 > Static151.anInt2683) {
			local47 = false;
			arg4 = Static151.anInt2683;
		} else {
			local47 = true;
		}
		if (arg1 >= Static134.anInt2364) {
			Static455.method6536(arg4, arg2, arg3, Static503.anIntArrayArray12[arg1++]);
		} else {
			arg1 = Static134.anInt2364;
		}
		if (arg0 <= Static60.anInt971) {
			Static455.method6536(arg4, arg2, arg3, Static503.anIntArrayArray12[arg0--]);
		} else {
			arg0 = Static60.anInt971;
		}
		@Pc(99) int local99;
		if (local20 && local47) {
			for (local99 = arg1; local99 <= arg0; local99++) {
				@Pc(143) int[] local143 = Static503.anIntArrayArray12[local99];
				local143[arg2] = local143[arg4] = arg3;
			}
		} else if (local20) {
			for (local99 = arg1; local99 <= arg0; local99++) {
				Static503.anIntArrayArray12[local99][arg2] = arg3;
			}
		} else if (local47) {
			for (local99 = arg1; local99 <= arg0; local99++) {
				Static503.anIntArrayArray12[local99][arg4] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method5098(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
