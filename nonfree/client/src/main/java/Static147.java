import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread2;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	public static int anInt3290;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Lclient!th;")
	public static Class168 aClass168_110;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	public static int anInt3287 = 0;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	public static int anInt3288 = 0;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2377(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static2.aClass1_Sub14_Sub1_1.method2252(127);
		Static2.aClass1_Sub14_Sub1_1.method2191(Static34.method690(arg1) + 1);
		Static2.aClass1_Sub14_Sub1_1.method2246(arg0);
		Static2.aClass1_Sub14_Sub1_1.method2188(arg1);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
	public static void method2378() {
		Static313.aClass89_52.method2266();
		Static46.aClass89_8.method2266();
		Static141.aClass89_46.method2266();
		Static256.aClass89_41.method2266();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V")
	public static void method2380() {
		Static127.aClass89_14.method2273(5);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method2381(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static215.method3446(arg3, arg1, null, arg4, arg2, -1, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)Z")
	public static boolean method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static90.method1546(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static240.method3778(local10 + 1, Static46.anIntArrayArrayArray1[arg0][arg1][arg2] + arg3, local14 + 1) && Static240.method3778(local10 + 128 - 1, Static46.anIntArrayArrayArray1[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static240.method3778(local10 + 128 - 1, Static46.anIntArrayArrayArray1[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static240.method3778(local10 + 1, Static46.anIntArrayArrayArray1[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
