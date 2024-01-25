import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "r", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
	public static void method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class197 local3 = new Class197();
		local3.anInt6300 = arg1 >> 7;
		local3.anInt6281 = arg2 >> 7;
		local3.anInt6284 = arg3 >> 7;
		local3.anInt6286 = arg4 >> 7;
		local3.anInt6296 = arg0;
		local3.anInt6292 = arg1;
		local3.anInt6290 = arg2;
		local3.anInt6289 = arg3;
		local3.anInt6283 = arg4;
		local3.anInt6277 = arg5;
		local3.anInt6280 = arg6;
		Static324.aClass197Array2[Static130.anInt5552++] = local3;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BB)Z")
	public static boolean method103(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub12 local8 = new Class5_Sub12(arg0);
		@Pc(12) int local12 = local8.method5115();
		if (local12 != 1) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method5115() == 1;
		if (local30) {
			Static240.method4270(local8);
		}
		Static335.method5820(local8);
		return true;
	}
}
