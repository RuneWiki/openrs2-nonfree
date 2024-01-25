import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
	public static int anInt7015;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!fd;")
	public static Class103 aClass103_35;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "[I")
	public static final int[] anIntArray408 = new int[64];

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!ww;")
	public static final Class384 aClass384_54 = new Class384(9, 2);

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "[I")
	public static final int[] anIntArray409 = new int[5];

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_214 = new Class194(41, -2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!ha;Z)Lclient!da;")
	public static Class63 method6115(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(17) Class249 local17 = Static280.method4568(arg0, arg2, arg1);
		return local17 == null ? null : local17.aClass63_11;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!uu;IIIILclient!d;)Lclient!ha;")
	public static synchronized Class82 method6172(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Interface5 arg6) {
		if (arg0 == 0) {
			return Static317.method5281(arg3, arg5, arg1, arg6);
		} else if (arg0 == 2) {
			return Static429.method6536(arg3, arg6, arg5, arg1);
		} else if (arg0 == 1) {
			return Static99.method7007(arg6, arg1, arg4);
		} else if (arg0 == 5) {
			return Static193.method8667(arg2, arg1, arg4, arg6);
		} else if (arg0 == 3) {
			return Static657.method7746(arg4, arg6, arg2, arg1);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
