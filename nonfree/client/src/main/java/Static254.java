import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!js", name = "b", descriptor = "I")
	public static int anInt4597 = 0;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
	public static void method3724(@OriginalArg(0) int arg0) {
		Static504.anInt5715 = arg0;
		@Pc(7) Class222 local7 = Static396.aClass222_42;
		synchronized (Static396.aClass222_42) {
			Static396.aClass222_42.method4428();
		}
		local7 = Static40.aClass222_2;
		synchronized (Static40.aClass222_2) {
			Static40.aClass222_2.method4428();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIBI)V")
	public static void method3725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(4, arg1);
		local8.method6594();
		local8.anInt8204 = arg0;
		local8.anInt8205 = arg3;
		local8.anInt8208 = arg2;
	}
}
