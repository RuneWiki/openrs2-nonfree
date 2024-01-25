import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
	public static int anInt4823 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
	public static int method4457() {
		@Pc(12) int local12 = 0;
		@Pc(22) Field[] local22 = fca.class.getDeclaredFields();
		for (@Pc(26) int local26 = 0; local26 < local22.length; local26++) {
			@Pc(32) Field local32 = local22[local26];
			if (dea.class.isAssignableFrom(local32.getType())) {
				local12++;
			}
		}
		return local12 + 1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILjava/lang/String;IZ)V")
	public static void method4460(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static173.method3148((String) null, arg3, arg1, arg0, false, arg2);
	}
}
