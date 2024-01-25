import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "S")
	public static short aShort43 = 32767;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
	public static final int anInt3404 = 2;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
	public static int anInt3409 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!pe;I)Lclient!ge;")
	public static Class3_Sub15 method3006(@OriginalArg(1) Class254 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method6420(arg1);
		return local16 == null ? null : new Class3_Sub15(local16);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method3008() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static223.anInt4521 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}
}
