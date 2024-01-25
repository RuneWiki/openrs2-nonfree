import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fba", name = "B", descriptor = "Z")
	public static boolean aBoolean263 = false;

	@OriginalMember(owner = "client!fba", name = "G", descriptor = "J")
	public static long aLong103 = 0L;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZIII[Lclient!uv;)V")
	public static void method3121(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class344[] arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(17) Class344 local17 = arg4[local3];
			if (local17 != null && local17.anInt9632 == arg2) {
				Static132.method2344(arg3, arg1, local17, arg0);
				Static428.method6535(arg0, arg3, local17);
				if (local17.anInt9621 > local17.anInt9562 - local17.anInt9546) {
					local17.anInt9621 = local17.anInt9562 - local17.anInt9546;
				}
				if (local17.anInt9621 < 0) {
					local17.anInt9621 = 0;
				}
				if (local17.anInt9618 > local17.anInt9591 - local17.anInt9602) {
					local17.anInt9618 = local17.anInt9591 - local17.anInt9602;
				}
				if (local17.anInt9618 < 0) {
					local17.anInt9618 = 0;
				}
				if (local17.anInt9554 == 0) {
					Static335.method5417(arg1, local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V")
	public static void method3123() {
		if (Static48.aClass298_12.aBoolean613 && Static57.aClass157_5.anInt4641 != -1) {
			Static567.method8021(Static57.aClass157_5.anInt4641, Static57.aClass157_5.aString34);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!mg;Lclient!mg;)V")
	public static void method3124(@OriginalArg(1) Class9 arg0, @OriginalArg(2) Class9 arg1) {
		if (arg1.aClass9_67 != null) {
			arg1.method8593();
		}
		arg1.aClass9_68 = arg0;
		arg1.aClass9_67 = arg0.aClass9_67;
		arg1.aClass9_67.aClass9_68 = arg1;
		arg1.aClass9_68.aClass9_67 = arg1;
	}
}
