import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "[I")
	public static int[] anIntArray617;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	public static int anInt6388;

	@OriginalMember(owner = "client!sj", name = "B", descriptor = "[I")
	public static int[] anIntArray618;

	@OriginalMember(owner = "client!sj", name = "C", descriptor = "Lclient!pb;")
	public static Class184 aClass184_2;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "Lclient!os;")
	public static final Class182 aClass182_222 = new Class182("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
	public static int anInt6389 = 0;

	@OriginalMember(owner = "client!sj", name = "D", descriptor = "[I")
	public static int[] anIntArray619 = new int[2];

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
	public static int anInt6392 = -1;

	@OriginalMember(owner = "client!sj", name = "F", descriptor = "[I")
	public static final int[] anIntArray620 = new int[1];

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([J[Ljava/lang/Object;III)V")
	public static void method4960(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) long local16 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local16;
		@Pc(30) Object local30 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local30;
		@Pc(50) int local50 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg2; local52 < arg3; local52++) {
			if (arg0[local52] < (long) (local52 & local50) + local16) {
				@Pc(69) long local69 = arg0[local52];
				arg0[local52] = arg0[local12];
				arg0[local12] = local69;
				@Pc(83) Object local83 = arg1[local52];
				arg1[local52] = arg1[local12];
				arg1[local12++] = local83;
			}
		}
		arg0[arg3] = arg0[local12];
		arg0[local12] = local16;
		arg1[arg3] = arg1[local12];
		arg1[local12] = local30;
		method4960(arg0, arg1, arg2, local12 - 1);
		method4960(arg0, arg1, local12 + 1, arg3);
	}
}
