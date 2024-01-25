import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	public static int anInt3564 = -1;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_95 = new Class131(2, 8);

	@OriginalMember(owner = "client!qd", name = "T", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;CI)I")
	public static int method2976(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1 == arg0.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}
}
