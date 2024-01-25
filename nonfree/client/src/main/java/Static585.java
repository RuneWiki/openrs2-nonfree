import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static585 {

	@OriginalMember(owner = "client!uv", name = "A", descriptor = "I")
	public static int anInt9606;

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
	public static int anInt9590 = 0;

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_166 = new Class274(72, 0);

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "J")
	public static long aLong256 = -1L;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
	public static int anInt9601 = 0;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(III)Z")
	public static boolean method8069(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static407.method6262(arg0, arg1) || Static439.method6540(arg0, arg1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!da;)V")
	public static void method8075(@OriginalArg(0) Class64 arg0) {
		Static463.aClass64_12 = arg0;
	}
}
