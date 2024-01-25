import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "Lclient!ne;")
	public static Class232 aClass232_1;

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_125 = new Class179(40, 7);

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "[Lclient!uea;")
	public static final Interface22[] anInterface22Array1 = new Interface22[128];

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
	public static int anInt9568 = 0;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIII)I")
	public static int method8011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = 255 - arg1;
		@Pc(31) int local31 = (arg1 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		return (((arg0 & 0xFF00) * local13 & 0xFF0000 | (arg0 & 0xFF00FF) * local13 & 0xFF00FF00) >>> 8) + local31;
	}
}
