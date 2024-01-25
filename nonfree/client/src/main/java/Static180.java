import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!kb;")
	public static Class52 aClass52_19;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "I")
	public static int anInt3668 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method3309(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local49.append(Static175.aCharArray6[(int) (local52 - arg0 * 37L)]);
			}
			return local49.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBIIIIII)V")
	public static void method3310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg6) {
			Static192.method3459(arg3, arg0, arg5, arg4, arg6, arg2);
		} else if (arg5 - arg6 >= Static61.anInt1534 && arg6 + arg5 <= Static168.anInt3509 && Static142.anInt3103 <= arg3 - arg1 && arg3 + arg1 <= Static314.anInt6030) {
			Static80.method1711(arg6, arg5, arg2, arg4, arg1, arg3, arg0);
		} else {
			Static345.method5565(arg2, arg3, arg1, arg5, arg6, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I")
	public static int method3312() {
		return ((Static254.anInt4943 == 0 ? 0 : 1) << 21) + ((Static108.aBoolean108 ? 1 : 0) << 19) + (Static186.anInt3771 << 17) + ((Static296.aBoolean432 ? 1 : 0) << 16) + ((Static325.aBoolean452 ? 1 : 0) << 13) + ((Static336.anInt4180 & 0x3) << 11) + ((Static308.aBoolean431 ? 1 : 0) << 8) + ((Static342.aBoolean471 ? 1 : 0) << 6) + ((Static155.aBoolean244 ? 1 : 0) << 5) + ((Class22_Sub2_Sub5.lb ? 1 : 0) << 4) + (Static289.anInt2339 & 0x7) + ((Static352.aBoolean484 ? 1 : 0) << 3) + ((Static70.aBoolean128 ? 1 : 0) << 9) + ((Static231.aBoolean341 ? 1 : 0) << 10) + ((Static140.aBoolean228 ? 1 : 0) << 15) + ((Static110.anInt2524 == 0 ? 0 : 1) << 20) + ((Static165.anInt3445 == 0 ? 0 : 1) << 22) + (Static290.method4749() << 23) + (Static2.anInt18 << 25) + ((Static53.aBoolean112 ? 1 : 0) << 27) + (Static244.anInt4807 << 28);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!rk;BI)Lclient!qe;")
	public static Class7_Sub31 method3314(@OriginalArg(0) Class180 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) byte[] local10 = arg0.method4583(arg1);
		return local10 == null ? null : new Class7_Sub31(local10);
	}
}
