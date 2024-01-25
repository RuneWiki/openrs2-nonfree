import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!kr;")
	public static Class171 aClass171_148;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!dg;)I")
	public static int method6962(@OriginalArg(1) Class49_Sub2_Sub2_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt1770;
		@Pc(17) Class230 local17 = arg0.method3799();
		if (arg0.aBoolean306) {
			local13 = arg0.anInt1768;
		} else if (arg0.anInt4282 == local17.anInt6382 || local17.anInt6408 == arg0.anInt4282 || local17.anInt6378 == arg0.anInt4282 || local17.anInt6390 == arg0.anInt4282) {
			local13 = arg0.anInt1751;
		} else if (arg0.anInt4282 == local17.anInt6377 || arg0.anInt4282 == local17.anInt6398 || local17.anInt6400 == arg0.anInt4282 || arg0.anInt4282 == local17.anInt6407) {
			local13 = arg0.anInt1780;
		}
		return local13;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZI)Z")
	public static boolean method6966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static177.method2906(arg0, arg1)) {
			return (arg1 & 0xB000) != 0 | Static247.method4220(arg1, arg0) | Static450.method6420(arg1, arg0) ? true : (Static500.method5191(arg0, arg1) | Static453.method6442(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
