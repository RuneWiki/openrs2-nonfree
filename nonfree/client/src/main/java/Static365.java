import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "[Lclient!mr;")
	public static Class232[] aClass232Array1;

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "Lclient!ae;")
	public static Class8 aClass8_98;

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "Lclient!ae;")
	public static Class8 aClass8_99;

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
	public static int anInt6243;

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
	public static int anInt6246;

	@OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
	public static int anInt6242 = 765;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)V")
	public static void method5272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg0, 7);
		local9.method7976();
		local9.anInt9466 = arg1;
	}
}
