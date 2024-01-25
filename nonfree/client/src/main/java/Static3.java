import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "F")
	public static float aFloat284;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public static int anInt10484 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z")
	public static boolean method8620(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V")
	public static void method8622(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub24 local14 = (Class3_Sub24) Static493.aClass307_47.method7424((long) arg0);
		if (local14 != null) {
			local14.aClass187_Sub1_1.method5771();
			Static315.method5367(local14.anInt4636, local14.aBoolean398);
			local14.method8671();
		}
	}
}
