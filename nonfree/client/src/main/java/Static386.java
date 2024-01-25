import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static386 {

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
	public static int anInt7125;

	@OriginalMember(owner = "client!pw", name = "s", descriptor = "Lclient!xa;")
	public static Class119 aClass119_21;

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
	public static int anInt7128 = 0;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_94 = new Class158(16, -1);

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)Z")
	public static boolean method5950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
