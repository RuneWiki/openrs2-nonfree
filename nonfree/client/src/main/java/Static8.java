import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
	public static int anInt134;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "J")
	public static long aLong11;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
	public static int anInt135;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "Lclient!nk;")
	public static Class121 aClass121_5;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "[I")
	public static int[] anIntArray7 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class66 local8 = Static296.method4522(arg1, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray25 != null) {
			@Pc(20) Class1_Sub10 local20 = new Class1_Sub10();
			local20.anInt951 = arg0;
			local20.anObjectArray1 = local8.anObjectArray25;
			local20.aClass66_10 = local8;
			local20.aString50 = arg2;
			Static194.method3152(local20);
		}
		@Pc(44) boolean local44 = true;
		if (local8.anInt2210 > 0) {
			local44 = Static130.method2231(local8);
		}
		if (!local44 || !Static37.method679(local8).method3057(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static127.aClass1_Sub14_Sub1_3.method1408(215);
			Static127.aClass1_Sub14_Sub1_3.method1387(arg1);
			Static127.aClass1_Sub14_Sub1_3.method1338(arg3);
		}
		if (arg0 == 2) {
			Static127.aClass1_Sub14_Sub1_3.method1408(77);
			Static127.aClass1_Sub14_Sub1_3.method1387(arg1);
			Static127.aClass1_Sub14_Sub1_3.method1338(arg3);
		}
		if (arg0 == 3) {
			Static127.aClass1_Sub14_Sub1_3.method1408(63);
			Static127.aClass1_Sub14_Sub1_3.method1387(arg1);
			Static127.aClass1_Sub14_Sub1_3.method1338(arg3);
		}
		if (arg0 == 4) {
			Static127.aClass1_Sub14_Sub1_3.method1408(33);
			Static127.aClass1_Sub14_Sub1_3.method1387(arg1);
			Static127.aClass1_Sub14_Sub1_3.method1338(arg3);
		}
		if (arg0 == 5) {
			Static127.aClass1_Sub14_Sub1_3.method1408(89);
			Static127.aClass1_Sub14_Sub1_3.method1387(arg1);
			Static127.aClass1_Sub14_Sub1_3.method1338(arg3);
		}
		if (arg0 == 6) {
			Static127.aClass1_Sub14_Sub1_3.method1408(99);
			Static127.aClass1_Sub14_Sub1_3.method1387(arg1);
			Static127.aClass1_Sub14_Sub1_3.method1338(arg3);
		}
		if (arg0 == 7) {
			Static127.aClass1_Sub14_Sub1_3.method1408(107);
			Static127.aClass1_Sub14_Sub1_3.method1387(arg1);
			Static127.aClass1_Sub14_Sub1_3.method1338(arg3);
		}
		if (arg0 == 8) {
			Static127.aClass1_Sub14_Sub1_3.method1408(82);
			Static127.aClass1_Sub14_Sub1_3.method1387(arg1);
			Static127.aClass1_Sub14_Sub1_3.method1338(arg3);
		}
		if (arg0 == 9) {
			Static127.aClass1_Sub14_Sub1_3.method1408(83);
			Static127.aClass1_Sub14_Sub1_3.method1387(arg1);
			Static127.aClass1_Sub14_Sub1_3.method1338(arg3);
		}
		if (arg0 == 10) {
			Static127.aClass1_Sub14_Sub1_3.method1408(79);
			Static127.aClass1_Sub14_Sub1_3.method1387(arg1);
			Static127.aClass1_Sub14_Sub1_3.method1338(arg3);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I")
	public static int method119(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method120(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(41) long local41 = arg0; local41 != 0L; local41 /= 37L) {
				local31++;
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(67) long local67 = arg0;
				arg0 /= 37L;
				local59.append(Static222.aCharArray3[(int) (local67 - arg0 * 37L)]);
			}
			return local59.reverse().toString();
		}
	}
}
