import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!oda", name = "o", descriptor = "I")
	public static int anInt6240;

	@OriginalMember(owner = "client!oda", name = "t", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34;

	@OriginalMember(owner = "client!oda", name = "v", descriptor = "I")
	public static int anInt6246 = 0;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
	public static void method5414() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local16.invoke(local25, (Object[]) null);
					Static512.anInt8554 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)I")
	public static int method5415(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static453.anInt7261 - 1; local3++) {
			if (arg0 < Static154.anIntArray188[local3] + Static584.anIntArray649[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static453.anInt7261 - 1;
		}
		return local1;
	}
}
