import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!mk;")
	public static Class212 aClass212_1;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!ow;")
	public static final Class252 aClass252_3 = new Class252();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BC)Z")
	public static boolean method2915(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(35) char[] local35 = Static595.aCharArray12;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(43) char local43 = local35[local37];
				if (arg0 == local43) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!sw;Z)V")
	public static void method2917(@OriginalArg(0) Class9_Sub10 arg0) {
		arg0.aClass9_Sub1_Sub1_Sub2_1 = null;
		if (Static77.anInt1989 < 20) {
			Static308.aClass309_9.method6595(arg0);
			Static77.anInt1989++;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ju;I)Z")
	public static boolean method2918(@OriginalArg(0) Class173 arg0) {
		return Static487.aClass173_7 == arg0 || arg0 == Static266.aClass173_5 || arg0 == Static184.aClass173_3 || arg0 == Static239.aClass173_4;
	}
}
