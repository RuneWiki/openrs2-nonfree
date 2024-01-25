import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!op", name = "D", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array38;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_169 = new Class221(82, -1);

	@OriginalMember(owner = "client!op", name = "C", descriptor = "I")
	public static int anInt5120 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII)I")
	public static int method4331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		@Pc(31) int local31 = 255 - arg2;
		return local26 + ((local31 * (arg0 & 0xFF00) & 0xFF0000 | local31 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}
