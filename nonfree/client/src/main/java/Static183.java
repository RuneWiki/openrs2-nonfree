import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	public static int anInt3502 = 0;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_44 = new Class200(49, 8);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!sl;B)V")
	public static void method3161(@OriginalArg(0) Class3_Sub3 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static262.anInt4804; local11++) {
			@Pc(19) int local19 = arg0.method4228();
			@Pc(23) int local23 = arg0.method4221();
			if (local23 == 65535) {
				local23 = -1;
			}
			if (Static227.aClass96_Sub1Array1[local19] != null) {
				Static227.aClass96_Sub1Array1[local19].anInt3292 = local23;
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method3162(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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
}
