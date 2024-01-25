import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_24 = new Class177(26, 6);

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_33 = new Class158(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
	public static int anInt1594 = -1;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
	public static int anInt1595 = -50;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIBI)V")
	public static void method1120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg4 + 1;
		Static228.method3480(arg2, arg0, Static60.anIntArrayArray14[arg4], arg1);
		@Pc(27) int local27 = arg3 - 1;
		Static228.method3480(arg2, arg0, Static60.anIntArrayArray14[arg3], arg1);
		for (@Pc(33) int local33 = local14; local33 <= local27; local33++) {
			@Pc(39) int[] local39 = Static60.anIntArrayArray14[local33];
			local39[arg2] = local39[arg1] = arg0;
		}
	}
}
