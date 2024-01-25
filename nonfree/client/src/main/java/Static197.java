import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!mp", name = "M", descriptor = "[[Lclient!ja;")
	public static Class100[][] aClass100ArrayArray1;

	@OriginalMember(owner = "client!mp", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!mp", name = "P", descriptor = "Lclient!ar;")
	public static final Class15 aClass15_7 = new Class15(64);

	@OriginalMember(owner = "client!mp", name = "Y", descriptor = "Ljava/lang/String;")
	public static final String aString149 = "glow3:";

	@OriginalMember(owner = "client!mp", name = "Z", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZIIZBI)V")
	public static void method3566(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg3) / 2;
		@Pc(25) int local25 = arg3;
		@Pc(29) Class83_Sub1 local29 = Static305.aClass83_Sub1Array1[local23];
		Static305.aClass83_Sub1Array1[local23] = Static305.aClass83_Sub1Array1[arg2];
		Static305.aClass83_Sub1Array1[arg2] = local29;
		for (@Pc(41) int local41 = arg3; local41 < arg2; local41++) {
			if (Static270.method5483(arg0, local29, Static305.aClass83_Sub1Array1[local41], arg5, arg1, arg4) <= 0) {
				@Pc(61) Class83_Sub1 local61 = Static305.aClass83_Sub1Array1[local41];
				Static305.aClass83_Sub1Array1[local41] = Static305.aClass83_Sub1Array1[local25];
				Static305.aClass83_Sub1Array1[local25++] = local61;
			}
		}
		Static305.aClass83_Sub1Array1[arg2] = Static305.aClass83_Sub1Array1[local25];
		Static305.aClass83_Sub1Array1[local25] = local29;
		method3566(arg0, arg1, local25 - 1, arg3, arg4, arg5);
		method3566(arg0, arg1, arg2, local25 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "(I)V")
	public static void method3568() {
		Static63.aClass154_19.method4219();
	}
}
