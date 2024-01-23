import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
	public static int anInt5550;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
	public static int anInt5552;

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "F")
	public static float aFloat182;

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString179 = "scroll:";

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
	public static void method4332() {
		Static129.aClass155_23.method4354();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
	public static void method4334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class101 local13 = local7.aClass101_1;
		if (local13 != null) {
			local13.anInt3748 = local13.anInt3748 * arg3 / 16;
			local13.anInt3753 = local13.anInt3753 * arg3 / 16;
		}
	}
}
