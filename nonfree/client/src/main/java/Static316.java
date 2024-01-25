import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static316 {

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_97 = new Class231("M", "M", "M", "M");

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "Lclient!of;")
	public static final Class188 aClass188_43 = new Class188(10);

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[100];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)I")
	public static int method4495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
