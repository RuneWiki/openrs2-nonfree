import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
	public static int anInt2812;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "[Lclient!rc;")
	public static final Class3_Sub3_Sub15[] aClass3_Sub3_Sub15Array1 = new Class3_Sub3_Sub15[14];

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "S")
	public static short aShort41 = 320;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2550(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}
}
