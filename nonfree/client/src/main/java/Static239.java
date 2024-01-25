import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	public static int anInt3904 = -1;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_146 = new Class288(44, -1);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
	public static void method3347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static193.anInt1550 / (float) Static193.anInt1544;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg3);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(40) int local40 = arg1 - (arg0 - local13) / 2;
		@Pc(49) int local49 = arg2 - (arg3 - local11) / 2;
		Static40.anInt794 = Static193.anInt1544 * local49 / local11;
		Static160.anInt2883 = -1;
		Static27.anInt643 = -1;
		Static347.anInt5452 = Static193.anInt1550 - local40 * Static193.anInt1550 / local13;
		Static61.method909();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Z")
	public static boolean method3349(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class2_Sub2_Sub11 local10 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2325(); local10 != null; local10 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2318()) {
			if (Static62.method916(local10.anInt4369) && local10.aLong122 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)Z")
	public static boolean method3350() {
		if (Static418.aBoolean471) {
			try {
				if ((Boolean) Static651.method4296("showingVideoAd", Static617.anApplet2)) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method3351(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static485.method6790(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local42 <= local45);
			return Static236.method3208(local45, arg0);
		}
	}
}
