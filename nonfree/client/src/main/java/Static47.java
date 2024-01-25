import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_9 = new Class208(35, -1);

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZII)Lclient!tea;")
	public static Class319 method853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class319 local7 = new Class319();
		local7.anInt9334 = arg1 + 5 + 1;
		local7.anInt9331 = arg0 + 5 + 1;
		local7.anInt9338 = -1;
		local7.anInt9322 = -1;
		local7.anIntArrayArray52 = new int[local7.anInt9334][local7.anInt9331];
		local7.method7929();
		return local7;
	}
}
