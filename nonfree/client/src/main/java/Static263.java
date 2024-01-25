import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "[Lclient!vg;")
	public static Class210[] aClass210Array2;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString202 = "Cancel";

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)Lclient!fr;")
	public static Class66 method4606(@OriginalArg(0) int arg0) {
		@Pc(10) Class66 local10 = (Class66) Static261.aClass140_133.method3816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static40.aClass165_68.method4508(arg0, 30);
		local10 = new Class66();
		if (local20 != null) {
			local10.method1803(new Class1_Sub7(local20), arg0);
		}
		Static261.aClass140_133.method3817((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZII)V")
	public static void method4607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(40) String local40 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local40);
		Static280.method4824(true, local40);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public static void method4608(@OriginalArg(1) int arg0) {
		Static313.method5283();
		Static174.method3444();
		Static142.method2986(true, arg0);
		Static214.method3953(Static297.aClass165_88, Static236.aClass165_72, Static34.aClass2_6);
		Static108.method2024(Static34.aClass2_6, Static297.aClass165_88);
		Static201.method3757(Static233.aClass90Array12);
		Static294.method5054();
		Static228.method4134();
		if (Static239.anInt4649 == 10) {
			Static211.method3873(false);
		} else if (Static239.anInt4649 == 30) {
			Static72.method1427(25);
			return;
		} else if (Static239.anInt4649 == 5) {
			Static46.method1034(Static297.aClass165_88, Static34.aClass2_6);
			return;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/util/Random;IB)I")
	public static int method4610(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static302.method4313(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(42) int local42;
			do {
				local42 = arg0.nextInt();
			} while (local34 <= local42);
			return Static8.method283(arg1, local42);
		}
	}
}
