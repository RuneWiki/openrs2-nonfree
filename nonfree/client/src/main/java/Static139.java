import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!em", name = "r", descriptor = "[Lclient!fia;")
	public static Class45[] aClass45Array10;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "I")
	public static final int anInt2198 = 1409;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "F")
	public static float aFloat16 = 0.0F;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "I")
	public static int anInt2199 = 0;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	public static void method2103() {
		@Pc(7) Class345 local7 = null;
		try {
			@Pc(15) Class230 local15 = Static344.aClass173_5.method4249("2");
			while (local15.anInt6256 == 0) {
				Static548.method7968(1L);
			}
			if (local15.anInt6256 == 1) {
				local7 = (Class345) local15.anObject12;
				@Pc(47) byte[] local47 = new byte[(int) local7.method8254()];
				@Pc(64) int local64;
				for (@Pc(49) int local49 = 0; local49 < local47.length; local49 += local64) {
					local64 = local7.method8256(local47.length - local49, local47, local49);
					if (local64 == -1) {
						throw new IOException("EOF");
					}
				}
				Static130.method2010(new Class14_Sub21(local47));
			}
		} catch (@Pc(95) Exception local95) {
		}
		try {
			if (local7 != null) {
				local7.method8253();
			}
		} catch (@Pc(104) Exception local104) {
		}
	}
}
