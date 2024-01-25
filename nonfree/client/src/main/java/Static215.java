import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!jo;")
	public static Class168 aClass168_53;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!jo;")
	public static Class168 aClass168_54;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt4569 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!bfa;Lclient!oa;IIII)V")
	public static void method3946(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class344 local9 = Static109.aClass226_3.method5636(arg0.anInt1085);
		if (local9.anInt9590 == -1) {
			return;
		}
		if (arg0.aBoolean94) {
			@Pc(27) int local27 = arg4 + arg0.anInt1070;
			arg4 = local27 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(39) Class66 local39 = local9.method7999(arg0.aBoolean102, arg4, arg1);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg0.anInt1109;
		@Pc(56) int local56 = arg0.anInt1058;
		if ((arg4 & 0x1) == 1) {
			local56 = arg0.anInt1109;
			local45 = arg0.anInt1058;
		}
		@Pc(70) int local70 = local39.AA();
		@Pc(73) int local73 = local39.a();
		if (local9.aBoolean712) {
			local70 = local45 * 4;
			local73 = local56 * 4;
		}
		if (local9.anInt9592 == 0) {
			local39.method8065(arg3, arg2 + 4 - local56 * 4, local70, local73);
		} else {
			local39.KA(arg3, arg2 + 4 - local56 * 4, local70, local73, 0, local9.anInt9592 | 0xFF000000, 1);
		}
	}
}
