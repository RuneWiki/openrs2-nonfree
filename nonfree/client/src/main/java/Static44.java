import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ia", name = "Sb", descriptor = "Lclient!wc;")
	public static Class4 aClass4_30;

	@OriginalMember(owner = "client!ia", name = "Ub", descriptor = "Lclient!a;")
	public static Class1 aClass1_1485 = Static94.method1596("(Udns");

	@OriginalMember(owner = "client!ia", name = "lc", descriptor = "I")
	public static int anInt1506 = 0;

	@OriginalMember(owner = "client!ia", name = "nc", descriptor = "Lclient!i;")
	public static Class25 aClass25_2 = new Class25(4096);

	@OriginalMember(owner = "client!ia", name = "yc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1487 = Static94.method1596("blaugr-Un:");

	@OriginalMember(owner = "client!ia", name = "zc", descriptor = "I")
	public static int anInt1515 = 0;

	@OriginalMember(owner = "client!ia", name = "Ac", descriptor = "I")
	public static int anInt1516 = 0;

	@OriginalMember(owner = "client!ia", name = "Bc", descriptor = "I")
	public static int anInt1517 = 0;

	@OriginalMember(owner = "client!ia", name = "Cc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1488 = Static94.method1596(": ");

	@OriginalMember(owner = "client!ia", name = "Dc", descriptor = "J")
	public static long aLong46 = 0L;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!u;ILclient!sa;B)V")
	public static void method1009(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class46 local9 = Static53.aClass46_4;
		synchronized (Static53.aClass46_4) {
			for (@Pc(16) Class2_Sub7 local16 = (Class2_Sub7) Static53.aClass46_4.method1435(); local16 != null; local16 = (Class2_Sub7) Static53.aClass46_4.method1442()) {
				if (local16.aLong96 == (long) arg1 && arg2 == local16.aClass57_2 && local16.anInt1640 == 0) {
					local7 = local16.aByteArray12;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(75) byte[] local75 = arg2.method1581(arg1);
			arg0.method1710(true, local75, arg1, arg2);
		} else {
			arg0.method1710(true, local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
	public static void method1011() {
		aClass25_2 = null;
		aClass1_1487 = null;
		aClass1_1488 = null;
		aClass1_1485 = null;
		aClass4_30 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIIIIIIII)V")
	public static void method1016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class2_Sub5 local3 = null;
		for (@Pc(12) Class2_Sub5 local12 = (Class2_Sub5) Static76.aClass46_7.method1435(); local12 != null; local12 = (Class2_Sub5) Static76.aClass46_7.method1442()) {
			if (local12.anInt897 == arg4 && arg1 == local12.anInt914 && arg5 == local12.anInt913 && arg6 == local12.anInt903) {
				local3 = local12;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class2_Sub5();
			local3.anInt914 = arg1;
			local3.anInt903 = arg6;
			local3.anInt897 = arg4;
			local3.anInt913 = arg5;
			Static68.method1347(local3);
			Static76.aClass46_7.method1437(local3);
		}
		local3.anInt896 = arg0;
		local3.anInt907 = arg3;
		local3.anInt909 = arg8;
		local3.anInt911 = arg2;
		local3.anInt906 = arg7;
	}
}
