import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Z")
	public static boolean aBoolean725;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "J")
	public static final long aLong277 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIII)V")
	public static void method8957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static100.anInt10042 && arg0 <= Static567.anInt9578) {
			@Pc(22) int local22 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg2);
			@Pc(28) int local28 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg1);
			Static215.method3658(arg0, local22, local28, arg3);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!bh;B)Z")
	public static boolean method8958(@OriginalArg(0) Class35 arg0) {
		return arg0 == Static430.aClass35_4 || Static436.aClass35_5 == arg0 || arg0 == Static41.aClass35_1 || arg0 == Static519.aClass35_6;
	}
}
