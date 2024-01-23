import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "[I")
	public static int[] anIntArray591;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "Lclient!l;")
	public static Class101 aClass101_27;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
	public static int anInt5985 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method4692(@OriginalArg(1) Component arg0) {
		@Pc(9) Method local9 = Static158.aMethod1;
		if (local9 != null) {
			try {
				local9.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static88.aClass142_1);
		arg0.addFocusListener(Static88.aClass142_1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4694(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static41.anInt999; local12++) {
			if (arg0.equalsIgnoreCase(Static222.aStringArray34[local12])) {
				return local12;
			}
		}
		return -1;
	}
}
