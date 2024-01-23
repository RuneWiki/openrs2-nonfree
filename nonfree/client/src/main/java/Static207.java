import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!th;")
	public static Class168 aClass168_152;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	public static int anInt4464 = -1;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!jl;")
	public static Class89 aClass89_30 = new Class89(20);

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	public static int anInt4467 = 0;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString301 = "Loaded world list data";

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method3275(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static213.method3403(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(46) int local46 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(49) int local49;
			do {
				local49 = arg1.nextInt();
			} while (local46 <= local49);
			return Static106.method1765(local49, arg0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V")
	public static void method3276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= Static170.anInt3814 && Static310.anInt6206 >= arg0 && arg4 >= Static206.anInt4449 && Static90.anInt2088 >= arg2) {
			if (arg3 == 1) {
				Static273.method4135(arg4, arg5, arg0, arg1, arg2);
			} else {
				Static250.method3849(arg0, arg2, arg4, arg3, arg1, arg5);
			}
		} else if (arg3 == 1) {
			Static208.method3293(arg2, arg0, arg4, arg5, arg1);
		} else {
			Static161.method2562(arg4, arg1, arg3, arg0, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V")
	public static void method3278(@OriginalArg(0) boolean arg0) {
		Static180.method2911(Static247.anInt5031, Static31.aFloat10, Static147.aFloat37, Static261.aFloat51);
		Static180.method2905(Static9.anInt279, Static250.anInt5102, arg0);
		Static180.method2903((float) Static132.anInt3051, (float) Static216.anInt4667, (float) Static302.anInt6008);
		Static180.method2910();
		Static284.aFloat56 = Static79.aFloat21;
		Static284.aFloat55 = Static53.aFloat15;
		Static284.aFloat54 = Static157.aFloat38;
		Static59.aClass1_Sub3_Sub24_1 = Static244.aClass1_Sub3_Sub24_6;
	}
}
