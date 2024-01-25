import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "Lclient!q;")
	public static Class205 aClass205_5;

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_74 = new Class133(77, 5);

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
	public static int anInt4186 = 2;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)Lclient!oo;")
	public static Class221 method3471(@OriginalArg(0) int arg0) {
		@Pc(13) Class221[] local13 = Static294.method4929();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class221 local21 = local13[local15];
			if (local21.anInt6664 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
