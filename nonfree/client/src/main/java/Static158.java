import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	public static int anInt616;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Lclient!eh;")
	private static Class28 aClass28_250 = Static170.method3101("Loaded wordpack");

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_248 = aClass28_250;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_249 = Static170.method3101(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!ah;IZLclient!ah;)Lclient!ma;")
	public static Class3_Sub2_Sub13 method626(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class7 arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(10) int[] local10 = arg2.method1015(arg1);
		for (@Pc(17) int local17 = 0; local17 < local10.length; local17++) {
			@Pc(26) byte[] local26 = arg2.method1011(local10[local17], arg1);
			if (local26 == null) {
				local5 = false;
			} else {
				@Pc(45) int local45 = local26[1] & 0xFF | (local26[0] & 0xFF) << 8;
				@Pc(60) byte[] local60 = arg0.method1011(0, local45);
				if (local60 == null) {
					local5 = false;
				}
			}
		}
		if (!local5) {
			return null;
		}
		try {
			return new Class3_Sub2_Sub13(arg2, arg0, arg1, false);
		} catch (@Pc(86) Exception local86) {
			return null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method627() {
		aClass28_249 = null;
		aClass28_248 = null;
		aClass28_250 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BIIIIIII)V")
	public static void method628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static48.method1149(arg6)) {
			Static5.method100(arg5, arg3, arg4, arg2, Static42.aClass33ArrayArray1[arg6], -1, arg0, arg1);
		}
	}
}
