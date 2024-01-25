import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_21 = new Class169(3000000, 200);

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method3003(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static89.anInt2628; local11++) {
			if (arg0.equalsIgnoreCase(Static370.aStringArray34[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static331.aStringArray30[local11])) {
				return true;
			}
		}
		return false;
	}
}
