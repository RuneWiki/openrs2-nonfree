import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!ar", name = "G", descriptor = "Lclient!ic;")
	public static Class113 aClass113_66;

	@OriginalMember(owner = "client!ar", name = "A", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_138 = new Class137(6, 2);

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
	public static int anInt3240 = 0;

	@OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
	public static int anInt3244 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZLclient!od;IBIII[B)Lclient!we;")
	public static Class5_Sub1_Sub1 method2731(@OriginalArg(1) Class128_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) byte[] arg3) {
		if (arg0.aBoolean362 || Static298.method3895(arg2) && Static298.method3895(arg1)) {
			return new Class5_Sub1_Sub1(arg0, 3553, 6406, arg2, arg1, false, arg3, 6406);
		} else if (arg0.aBoolean372) {
			return new Class5_Sub1_Sub1(arg0, 34037, 6406, arg2, arg1, false, arg3, 6406);
		} else {
			return new Class5_Sub1_Sub1(arg0, 6406, arg2, arg1, Static88.method1286(arg2), Static88.method1286(arg1), arg3, 6406);
		}
	}
}
