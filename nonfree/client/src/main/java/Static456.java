import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "F")
	public static float aFloat260;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!xa;")
	public static Class119 aClass119_31;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	public static Class method7272(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Lclient!raa;")
	public static Class253 method7275(@OriginalArg(0) int arg0) {
		@Pc(8) Class253[] local8 = Static138.method2344();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class253 local21 = local8[local15];
			if (local21.anInt7544 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
