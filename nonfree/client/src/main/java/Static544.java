import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!r", name = "t", descriptor = "I")
	public static int anInt9946 = 0;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "I")
	public static int anInt9947 = -50;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "I")
	public static int anInt9948 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public static void method8469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg2, 8);
		local9.method9256();
		local9.anInt10896 = arg3;
		local9.anInt10897 = arg0;
		local9.anInt10899 = arg1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
	public static void method8470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static592.method7648(arg0, arg1);
	}
}
