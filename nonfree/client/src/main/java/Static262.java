import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public static int anInt4804 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IC)C")
	public static char method4098(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!io;I)Lclient!mc;")
	public static Class175_Sub2 method4099(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(7) Class175 local7 = Static594.method7908(arg0);
		@Pc(11) int local11 = arg0.method4371();
		@Pc(15) int local15 = arg0.method4371();
		@Pc(19) int local19 = arg0.method4426();
		return new Class175_Sub2(local7.aClass314_13, local7.aClass103_20, local7.anInt9466, local7.anInt9470, local7.anInt9468, local7.anInt9476, local7.anInt9477, local7.anInt9463, local7.anInt9474, local11, local15, local19);
	}
}
