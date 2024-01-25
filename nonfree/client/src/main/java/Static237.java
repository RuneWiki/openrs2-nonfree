import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Z")
	public static boolean aBoolean415 = false;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	public static int anInt5950 = 0;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "[I")
	public static final int[] anIntArray546 = new int[250];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I")
	public static int method4961(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(37) int local37 = (arg0 & 0x7F) * 96 >> 7;
			if (local37 < 2) {
				local37 = 2;
			} else if (local37 > 126) {
				local37 = 126;
			}
			return (arg0 & 0xFF80) + local37;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILclient!sr;Lclient!sr;)V")
	public static void method4962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31_Sub4 arg3, @OriginalArg(4) Class31_Sub4 arg4) {
		@Pc(4) Class80 local4 = Static317.method4490(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass31_Sub4_2 = arg3;
			local4.aClass31_Sub4_1 = arg4;
		}
	}
}
