import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	public static final int anInt474 = 1406;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "Lclient!ei;")
	public static final Class44 aClass44_3 = new Class44(16);

	@OriginalMember(owner = "client!b", name = "e", descriptor = "[I")
	public static final int[] anIntArray37 = new int[4096];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!bi;IIIIILclient!fp;IIII)Lclient!bi;")
	public static Class3 method518(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class63 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg8;
		@Pc(17) Class3 local17 = (Class3) Static226.aClass21_123.method854(local6);
		if (local17 == null) {
			@Pc(27) Class41 local27 = Static227.method4232(arg8, Static140.aClass30_41);
			if (local27 == null) {
				return null;
			}
			local17 = arg6.method4652(local27, 1031, Static28.anInt669, 64, 768);
			Static226.aClass21_123.method843(local17, local6);
		}
		local17 = local17.method1261((byte) 2, 1031, true);
		if (arg9 != 0) {
			local17.method1249(arg9);
		}
		if (arg7 != 0) {
			local17.method1239(arg7);
		}
		if (arg3 != 0) {
			local17.method1253(arg3);
		}
		if (arg2 != 0) {
			local17.method1241(0, arg2, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	public static void method520() {
		@Pc(21) Class21 local21 = Static163.aClass21_93;
		synchronized (Static163.aClass21_93) {
			Static163.aClass21_93.method857();
		}
		local21 = Static93.aClass21_135;
		synchronized (Static93.aClass21_135) {
			Static93.aClass21_135.method857();
		}
	}
}
