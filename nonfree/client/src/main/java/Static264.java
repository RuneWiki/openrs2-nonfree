import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public static int anInt4720;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!ta;")
	public static Class82 aClass82_3;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!faa;")
	public static Class97 aClass97_13 = null;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_56 = new Class316(33, -1);

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
	public static void method4005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static58.aClass6_Sub17_Sub1_1.anInt9279 != 0 && arg1 != 0 && Static300.anInt5490 < 50 && arg0 != -1) {
			Static486.aClass152Array1[Static300.anInt5490++] = new Class152((byte) 1, arg0, arg1, arg3, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBII[I)V")
	public static void method4006(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg2--;
		@Pc(12) int local12 = arg0 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (arg2 < local16) {
			@Pc(20) int local20 = arg2 + 1;
			arg3[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg1;
			@Pc(50) int local50 = local45 + 1;
			arg3[local50] = arg1;
			arg2 = local50 + 1;
			arg3[arg2] = arg1;
		}
		while (arg2 < local12) {
			arg2++;
			arg3[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(CI)Z")
	public static boolean method4007(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
