import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!da;")
	public static Class55 aClass55_16;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	public static int anInt10084;

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "Lclient!la;")
	public static Class207 aClass207_119;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "[I")
	public static final int[] anIntArray576 = new int[1000];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I")
	public static int method8617() {
		@Pc(7) int local7 = 0;
		@Pc(17) Field[] local17 = hs.class.getDeclaredFields();
		for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
			@Pc(27) Field local27 = local17[local21];
			if (sga.class.isAssignableFrom(local27.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)I")
	public static int method8620() {
		return Static299.aClass347_1.method8237();
	}
}
