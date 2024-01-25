import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_122 = new Class288(16, 7);

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "Z")
	public static boolean aBoolean242 = false;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V")
	public static void method2805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static27.anInt643 = arg1 - Static193.anInt1548;
		Static160.anInt2883 = arg0 - Static193.anInt1551;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ID)V")
	public static void method2806(@OriginalArg(1) double arg0) {
		if (Static127.aDouble16 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static79.anIntArray111[local11] = local23 <= 255 ? local23 : 255;
		}
		Static127.aDouble16 = arg0;
	}
}
