import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
	public static int anInt9456;

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
	public static int anInt9457 = 0;

	@OriginalMember(owner = "client!vo", name = "J", descriptor = "Lclient!gj;")
	public static final Class124 aClass124_65 = new Class124();

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIZLclient!bi;Z)V")
	public static void method7768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class31 arg2) {
		Static347.aClass31_74 = arg2;
		Static189.aBoolean300 = false;
		Static554.anInt9318 = arg1;
		Static445.anInt7588 = 1;
		Static289.anInt5377 = 10000;
		Static481.anInt8134 = arg0;
		Static211.anInt4328 = 0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIII)V")
	public static void method7770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = Static572.method7817(Static252.anInt4971, arg2, Static359.anInt6232);
		@Pc(19) int local19 = Static572.method7817(Static252.anInt4971, arg0, Static359.anInt6232);
		@Pc(25) int local25 = Static572.method7817(Static68.anInt1306, arg1, Static589.anInt9684);
		@Pc(31) int local31 = Static572.method7817(Static68.anInt1306, arg4, Static589.anInt9684);
		@Pc(39) int local39 = Static572.method7817(Static252.anInt4971, arg3 + arg2, Static359.anInt6232);
		@Pc(50) int local50 = Static572.method7817(Static252.anInt4971, arg0 - arg3, Static359.anInt6232);
		for (@Pc(52) int local52 = local13; local52 < local39; local52++) {
			Static336.method5023(arg5, local31, Static383.anIntArrayArray62[local52], local25);
		}
		for (@Pc(68) int local68 = local19; local68 > local50; local68--) {
			Static336.method5023(arg5, local31, Static383.anIntArrayArray62[local68], local25);
		}
		@Pc(96) int local96 = Static572.method7817(Static68.anInt1306, arg3 + arg1, Static589.anInt9684);
		@Pc(105) int local105 = Static572.method7817(Static68.anInt1306, arg4 - arg3, Static589.anInt9684);
		for (@Pc(107) int local107 = local39; local107 <= local50; local107++) {
			@Pc(113) int[] local113 = Static383.anIntArrayArray62[local107];
			Static336.method5023(arg5, local96, local113, local25);
			Static336.method5023(arg5, local31, local113, local105);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIB)Z")
	public static boolean method7771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static554.method7655(arg0, arg1) | (arg1 & 0x60000) != 0 || Static270.method4371(arg0, arg1) || Static595.method8009(arg0, arg1);
	}
}
