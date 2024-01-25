import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "[I")
	public static int[] anIntArray405;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!la;")
	public static Class196 aClass196_68;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!la;")
	public static Class196 aClass196_69;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "[B")
	public static final byte[] aByteArray71 = new byte[520];

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject13 = null;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZIBZ)V")
	public static void method5812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 <= arg4) {
			return;
		}
		@Pc(25) int local25 = (arg4 + arg2) / 2;
		@Pc(27) int local27 = arg4;
		@Pc(31) Class96_Sub1 local31 = Static528.aClass96_Sub1Array2[local25];
		Static528.aClass96_Sub1Array2[local25] = Static528.aClass96_Sub1Array2[arg2];
		Static528.aClass96_Sub1Array2[arg2] = local31;
		for (@Pc(43) int local43 = arg4; local43 < arg2; local43++) {
			if (Static321.method5262(arg3, arg5, arg1, local31, Static528.aClass96_Sub1Array2[local43], arg0) <= 0) {
				@Pc(60) Class96_Sub1 local60 = Static528.aClass96_Sub1Array2[local43];
				Static528.aClass96_Sub1Array2[local43] = Static528.aClass96_Sub1Array2[local27];
				Static528.aClass96_Sub1Array2[local27++] = local60;
			}
		}
		Static528.aClass96_Sub1Array2[arg2] = Static528.aClass96_Sub1Array2[local27];
		Static528.aClass96_Sub1Array2[local27] = local31;
		method5812(arg0, arg1, local27 - 1, arg3, arg4, arg5);
		method5812(arg0, arg1, arg2, arg3, local27 + 1, arg5);
	}
}
