import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
	public static int anInt5677;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "[Lclient!wd;")
	public static Class8_Sub1_Sub7[] aClass8_Sub1_Sub7Array122;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "Lclient!tk;")
	public static Class159 aClass159_20;

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "Lclient!pk;")
	public static Class132 aClass132_91;

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
	public static int anInt5684;

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
	public static int anInt5688;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
	public static int anInt5678 = 0;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "Lclient!gd;")
	public static Class61 aClass61_53 = new Class61(100);

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "Z")
	public static boolean aBoolean478 = false;

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
	public static int anInt5687 = -1;

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString199 = "shake:";

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static79.anInt1719 + arg0 * Static227.anInt4635 >> 16;
		@Pc(19) int local19 = arg3 * Static227.anInt4635 - arg0 * Static79.anInt1719 >> 16;
		@Pc(29) int local29 = arg1 * Static23.anInt625 + local19 * Static230.anInt4681 >> 16;
		@Pc(39) int local39 = arg1 * Static230.anInt4681 - local19 * Static23.anInt625 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static23.anInt625 + local19 * Static230.anInt4681 >> 16;
		@Pc(76) int local76 = arg2 * Static230.anInt4681 - local19 * Static23.anInt625 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static90.anInt1920 && local87 < Static90.anInt1920) {
			return false;
		} else if (local50 > Static65.anInt5541 && local87 > Static65.anInt5541) {
			return false;
		} else if (local56 < Static37.anInt3864 && local93 < Static37.anInt3864) {
			return false;
		} else {
			return local56 <= Static19.anInt523 || local93 <= Static19.anInt523;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method4280(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static35.method556(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(35) int local35 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(43) int local43;
			do {
				local43 = arg1.nextInt();
			} while (local35 <= local43);
			return Static87.method1417(arg0, local43);
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(Z)V")
	public static void method4282() {
		Static137.aBoolean127 = true;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!pk;)V")
	public static void method4283(@OriginalArg(1) Class132 arg0) {
		Static133.aClass132_47 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I")
	public static int method4284() {
		if (Static245.aClass130_2 == null) {
			return -1;
		}
		while (Static245.aClass130_2.anInt3917 > Static8.anInt5674) {
			if (Static245.aClass130_2.method3051(Static8.anInt5674)) {
				return Static8.anInt5674++;
			}
			Static8.anInt5674++;
		}
		return -1;
	}
}
