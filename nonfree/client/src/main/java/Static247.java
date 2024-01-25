import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "Lclient!el;")
	public static Class109 aClass109_94;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	public static final int anInt4255 = Static197.method8882(1600);

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
	public static int anInt4256 = 0;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	public static final int anInt4264 = 1408;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
	public static void method3634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg2, 4);
		local9.method2687();
		local9.anInt3064 = arg0;
		local9.anInt3059 = arg3;
		local9.anInt3058 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z")
	public static boolean method3635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static253.method3723(arg0, arg1) & Static631.method8845(arg1, arg0);
	}
}
