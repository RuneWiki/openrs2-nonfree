import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public static int anInt8758;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "Lclient!ub;")
	public static final Class5_Sub23_Sub2 aClass5_Sub23_Sub2_1 = new Class5_Sub23_Sub2(15000);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!la;Lclient!la;Lclient!la;Lclient!la;)V")
	public static void method7498(@OriginalArg(1) Class208 arg0, @OriginalArg(2) Class208 arg1, @OriginalArg(3) Class208 arg2, @OriginalArg(4) Class208 arg3) {
		Static81.aClass208_15 = arg0;
		Static536.aClass208_120 = arg2;
		Static472.aClass208_107 = arg1;
		Static489.aClass73ArrayArray2 = new Class73[Static472.aClass208_107.method4988()][];
		Static675.aBooleanArray27 = new boolean[Static472.aClass208_107.method4988()];
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)J")
	public static synchronized long method7499(@OriginalArg(0) int arg0) {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static95.aLong44) {
			Static367.aLong289 += Static95.aLong44 - local5;
		}
		Static95.aLong44 = local5;
		return local5 + Static367.aLong289;
	}
}
