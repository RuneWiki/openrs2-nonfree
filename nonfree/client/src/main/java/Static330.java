import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
	public static int anInt6003;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "Lclient!ae;")
	public static final Class6_Sub1 aClass6_Sub1_1 = new Class6_Sub1(0, 0);

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	public static int anInt6004 = 0;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
	public static int anInt6006 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIIIII)I")
	public static int method5153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg2;
			arg2 = arg1;
			arg1 = local6;
		}
		@Pc(18) int local18 = arg4 & 0x3;
		if (local18 == 0) {
			return arg3;
		} else if (local18 == 1) {
			return arg5;
		} else if (local18 == 2) {
			return 7 + 1 - arg3 - arg2;
		} else {
			return 7 + 1 - arg5 - arg1;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!wv;B)V")
	public static void method5154(@OriginalArg(0) Class4_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class4_Sub1_Sub1_Sub1) {
			@Pc(5) Class4_Sub1_Sub1_Sub1 local5 = (Class4_Sub1_Sub1_Sub1) arg0;
			if (local5.aClass273_1 != null) {
				Static314.method4916(local5, local5.aByte108 != Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108);
			}
		} else if (arg0 instanceof Class4_Sub1_Sub1_Sub2) {
			@Pc(27) Class4_Sub1_Sub1_Sub2 local27 = (Class4_Sub1_Sub1_Sub2) arg0;
			Static362.method5433(local27, local27.aByte108 != Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108);
		}
	}
}
