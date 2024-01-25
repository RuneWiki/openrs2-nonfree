import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!mt", name = "I", descriptor = "Lclient!oh;")
	public static Class237 aClass237_96;

	@OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
	public static final int anInt6761 = 0;

	@OriginalMember(owner = "client!mt", name = "E", descriptor = "Z")
	public static boolean aBoolean469 = true;

	@OriginalMember(owner = "client!mt", name = "J", descriptor = "Z")
	public static boolean aBoolean470 = false;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIZIZ)V")
	public static void method5551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg0 >= arg4) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg4) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) Class98_Sub1 local25 = Static313.aClass98_Sub1Array1[local19];
		Static313.aClass98_Sub1Array1[local19] = Static313.aClass98_Sub1Array1[arg4];
		Static313.aClass98_Sub1Array1[arg4] = local25;
		for (@Pc(37) int local37 = arg0; local37 < arg4; local37++) {
			if (Static359.method5651(Static313.aClass98_Sub1Array1[local37], arg5, arg1, arg3, local25, arg2) <= 0) {
				@Pc(57) Class98_Sub1 local57 = Static313.aClass98_Sub1Array1[local37];
				Static313.aClass98_Sub1Array1[local37] = Static313.aClass98_Sub1Array1[local21];
				Static313.aClass98_Sub1Array1[local21++] = local57;
			}
		}
		Static313.aClass98_Sub1Array1[arg4] = Static313.aClass98_Sub1Array1[local21];
		Static313.aClass98_Sub1Array1[local21] = local25;
		method5551(arg0, arg1, arg2, arg3, local21 - 1, arg5);
		method5551(local21 + 1, arg1, arg2, arg3, arg4, arg5);
	}
}
