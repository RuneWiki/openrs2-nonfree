import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "[[Lclient!tk;")
	public static Class159[][] aClass159ArrayArray6;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!jj;")
	public static Class8_Sub1_Sub5_Sub2 aClass8_Sub1_Sub5_Sub2_7;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!pk;")
	public static Class132 aClass132_75;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!pd;")
	public static Class129 aClass129_23 = new Class129(16);

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString159 = " has logged out.";

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	public static int anInt4476 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)J")
	public static long method3402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass120_1 == null ? 0L : local7.aClass120_1.aLong127;
	}
}
