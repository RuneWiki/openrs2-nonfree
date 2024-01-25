import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "B")
	public static byte aByte71;

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
	public static int anInt6342;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
	public static int anInt6340 = -1;

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray43 = null;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
	public static int anInt6343 = -1;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "()V")
	public static void method5306() {
		Static291.method4973(Static112.anInt2455);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)V")
	public static void method5310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class2_Sub1 local13 = local7.aClass2_Sub1_1;
		@Pc(16) Class2_Sub1 local16 = local7.aClass2_Sub1_2;
		if (local13 != null) {
			local13.anInt5065 = local13.anInt5065 * arg3 / 16;
			local13.anInt5075 = local13.anInt5075 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt5065 = local16.anInt5065 * arg3 / 16;
			local16.anInt5075 = local16.anInt5075 * arg3 / 16;
		}
	}
}
