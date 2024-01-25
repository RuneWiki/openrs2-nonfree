import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "Lclient!jn;")
	public static Class176 aClass176_113;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "Lclient!waa;")
	public static final Class350 aClass350_36 = new Class350(8);

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "Lclient!gv;")
	public static final Class128 aClass128_6 = new Class128();

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZLclient!rm;)Ljava/lang/String;")
	public static String method7047(@OriginalArg(1) Class4_Sub39 arg0) {
		return arg0.aString80 == null || arg0.aString80.length() <= 0 ? arg0.aString81 : arg0.aString81 + Static590.aClass364_36.method8334(Static154.anInt3181) + arg0.aString80;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(DI)V")
	public static void method7048(@OriginalArg(0) double arg0) {
		if (arg0 == Static474.aDouble8) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static429.anIntArray422[local7] = local19 <= 255 ? local19 : 255;
		}
		Static474.aDouble8 = arg0;
	}
}
