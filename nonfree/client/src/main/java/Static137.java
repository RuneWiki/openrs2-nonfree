import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!wm;")
	public static Class390 aClass390_29;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	public static int anInt2688;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	public static void method2411(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(6, (long) arg0);
		local9.method7288();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BZ)Z")
	public static boolean method2413(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static528.aCharArray14[local7 - 128] != '\u0000';
		}
	}
}
