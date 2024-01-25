import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
	public static int anInt2918 = 0;

	@OriginalMember(owner = "client!ffa", name = "r", descriptor = "J")
	public static long aLong103 = 0L;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)V")
	public static void method2534(@OriginalArg(0) int arg0) {
		if (Static268.method3778(arg0)) {
			Static543.method7583(-1, Static581.aClass273ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)Z")
	public static boolean method2535() {
		try {
			@Pc(12) Class214 local12 = new Class214();
			@Pc(17) byte[] local17 = local12.method4738(Static255.aByteArray54);
			Static473.method6777(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ha;ILclient!cga;II)V")
	public static void method2538(@OriginalArg(0) Class145 arg0, @OriginalArg(2) Class60 arg1) {
		Static127.aClass60_40.method1223();
		if (Static649.aBoolean879) {
			return;
		}
		for (@Pc(25) Class2_Sub51 local25 = (Class2_Sub51) arg1.method1226(7); local25 != null; local25 = (Class2_Sub51) arg1.method1228()) {
			@Pc(33) Class259 local33 = Static90.aClass196_3.method4194(local25.anInt9158);
			if (Static216.method3013(local33)) {
				@Pc(45) boolean local45 = Static421.method6147(local33, local25, arg0);
				if (local45) {
					Static57.method908(local33, arg0, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIB)Z")
	public static boolean method2539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static62.method942(arg0, arg1) & ((arg1 & 0x2000) != 0 | Static561.method7806(arg1, arg0) | Static379.method5481(arg0, arg1));
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIBII)V")
	public static void method2542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 - arg5 >= Static8.anInt99 && arg1 + arg5 <= Static14.anInt206 && arg3 - arg5 >= Static617.anInt9501 && arg5 + arg3 <= Static519.anInt8267) {
			Static360.method5162(arg0, arg3, arg1, arg2, arg4, arg5);
		} else {
			Static120.method1771(arg4, arg0, arg2, arg1, arg3, arg5);
		}
	}
}
