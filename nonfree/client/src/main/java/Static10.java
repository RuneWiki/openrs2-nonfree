import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_4 = new Class160(110, -1);

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_5 = new Class160(95, 10);

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([J[II)V")
	public static void method116(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static6.method100(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method117(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		} else if (arg0 && arg1 >= 0) {
			@Pc(40) int local40 = 2;
			@Pc(44) int local44 = arg1 / 10;
			while (local44 != 0) {
				local44 /= 10;
				local40++;
			}
			@Pc(64) char[] local64 = new char[local40];
			local64[0] = '+';
			for (@Pc(72) int local72 = local40 - 1; local72 > 0; local72--) {
				@Pc(75) int local75 = arg1;
				arg1 /= 10;
				@Pc(85) int local85 = local75 - arg1 * 10;
				if (local85 < 10) {
					local64[local72] = (char) (local85 + 48);
				} else {
					local64[local72] = (char) (local85 + 87);
				}
			}
			return new String(local64);
		} else {
			return Integer.toString(arg1, 10);
		}
	}
}
