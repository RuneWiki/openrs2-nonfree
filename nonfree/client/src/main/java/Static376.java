import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
	public static int anInt6875 = 0;

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
	public static int anInt6882 = 0;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)Z")
	public static boolean method5761() {
		return Static16.anInt415 > 0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIBI)V")
	public static void method5762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(10, arg1);
		local8.method4946();
		local8.anInt5821 = arg2;
		local8.anInt5822 = arg0;
		local8.anInt5827 = arg3;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I")
	public static int method5763() {
		@Pc(14) Class313 local14 = Static305.aClass313_35;
		synchronized (Static305.aClass313_35) {
			return Static305.aClass313_35.method7402();
		}
	}
}
