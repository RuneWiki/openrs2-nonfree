import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!jq", name = "K", descriptor = "Lclient!o;")
	public static Class259 aClass259_3;

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "Lclient!vs;")
	public static final Class385 aClass385_4 = new Class385();

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)Z")
	public static boolean method4772(@OriginalArg(0) int arg0) {
		return arg0 == 11 || arg0 == 12 || arg0 == 13;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V")
	public static void method4773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg3);
		@Pc(19) int local19 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg1);
		@Pc(25) int local25 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg4);
		@Pc(33) int local33 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg0);
		@Pc(44) int local44 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg3 + arg2);
		@Pc(54) int local54 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg1 - arg2);
		for (@Pc(56) int local56 = local13; local56 < local44; local56++) {
			Static367.method5559(-7, local25, arg5, Static36.anIntArrayArray4[local56], local33);
		}
		for (@Pc(74) int local74 = local19; local74 > local54; local74--) {
			Static367.method5559(-7, local25, arg5, Static36.anIntArrayArray4[local74], local33);
		}
		if (258 != 258) {
			aClass259_3 = null;
		}
		@Pc(117) int local117 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg2 + arg4);
		@Pc(126) int local126 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg0 - arg2);
		for (@Pc(128) int local128 = local44; local128 <= local54; local128++) {
			@Pc(134) int[] local134 = Static36.anIntArrayArray4[local128];
			Static367.method5559(-7, local25, arg5, local134, local117);
			Static367.method5559(-7, local126, arg5, local134, local33);
		}
	}
}
