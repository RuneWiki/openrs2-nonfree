import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
	public static int anInt3201;

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "Lclient!ta;")
	public static Class111 aClass111_5;

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method2798(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static282.method4863(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local37 <= local45);
			return Static409.method8152(local45, arg1);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ki;Lclient!oa;III)V")
	public static void method2799(@OriginalArg(0) Class183 arg0, @OriginalArg(1) Class15 arg1) {
		Static493.aClass183_55.method4790();
		if (Static156.aBoolean841) {
			return;
		}
		for (@Pc(19) Class3_Sub32 local19 = (Class3_Sub32) arg0.method4795(); local19 != null; local19 = (Class3_Sub32) arg0.method4793()) {
			@Pc(26) Class70 local26 = Static87.aClass10_4.method400(local19.anInt5918);
			if (Static485.method7416(local26)) {
				@Pc(38) boolean local38 = Static482.method7395(local19, arg1, local26);
				if (local38) {
					Static470.method7216(local26, arg1, local19);
				}
			}
		}
	}
}
