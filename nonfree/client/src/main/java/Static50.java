import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!dm", name = "w", descriptor = "[I")
	public static int[] anIntArray81;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)Lclient!id;")
	public static Class81 method874(@OriginalArg(0) int arg0) {
		@Pc(12) Class81 local12 = (Class81) Static228.aClass169_25.method4017((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static312.aClass138_91.method3346(36, arg0);
		local12 = new Class81();
		local12.anInt2199 = arg0;
		if (local27 != null) {
			local12.method1802(new Class1_Sub14(local27));
		}
		Static228.aClass169_25.method4016(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static183.method3031(arg6)) {
			Static210.method3327(Static313.aClass146ArrayArray1[arg6], arg1, arg0, arg5, arg4, arg3, -1, arg7, arg2);
		} else if (arg7 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static132.aBooleanArray25[local14] = true;
			}
		} else {
			Static132.aBooleanArray25[arg7] = true;
		}
	}
}
