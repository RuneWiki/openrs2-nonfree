import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static439 {

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
	public static int anInt7578;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject11;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_100 = new Class84(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!ub;")
	public static final Class234 aClass234_7 = new Class234("LIVE", 0);

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_190 = new Class131(13, -1);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZIBLclient!ht;[I)Lclient!cq;")
	public static Class13_Sub1_Sub1 method5872(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class109_Sub1 arg2, @OriginalArg(5) int[] arg3) {
		if (arg2.aBoolean172 || Static304.method4356(arg1) && Static304.method4356(arg0)) {
			return new Class13_Sub1_Sub1(arg2, 3553, arg1, arg0, false, arg3);
		} else if (arg2.aBoolean156) {
			return new Class13_Sub1_Sub1(arg2, 34037, arg1, arg0, false, arg3);
		} else {
			return new Class13_Sub1_Sub1(arg2, arg1, arg0, Static100.method1552(arg1), Static100.method1552(arg0), arg3);
		}
	}
}
