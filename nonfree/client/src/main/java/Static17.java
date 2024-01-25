import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	public static int anInt523;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "Lclient!hh;")
	public static Class108 aClass108_2;

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "I")
	public static int anInt532;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
	public static int anInt522 = 0;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "[I")
	public static final int[] anIntArray36 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "Lclient!si;")
	public static final Class217 aClass217_4 = new Class217(6, 15);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI[Lclient!jb;IIZ)V")
	public static void method401(@OriginalArg(1) int arg0, @OriginalArg(2) Class126[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class126 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt3405) {
				Static1.method32(arg3, arg2, arg4, local9);
				Static18.method428(local9, arg2, arg3);
				if (local9.anInt3458 > local9.anInt3391 - local9.anInt3421) {
					local9.anInt3458 = local9.anInt3391 - local9.anInt3421;
				}
				if (local9.anInt3444 > local9.anInt3386 - local9.anInt3442) {
					local9.anInt3444 = local9.anInt3386 - local9.anInt3442;
				}
				if (local9.anInt3458 < 0) {
					local9.anInt3458 = 0;
				}
				if (local9.anInt3444 < 0) {
					local9.anInt3444 = 0;
				}
				if (local9.anInt3426 == 0) {
					Static114.method1812(local9, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
	public static void method402() {
		Static455.method5875(false);
		if (Static214.anInt4016 >= 0 && Static214.anInt4016 != 0) {
			Static435.method5598(Static214.anInt4016);
			Static214.anInt4016 = -1;
		}
	}
}
