import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
	public static int anInt7225;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "Lclient!sj;")
	public static Class307 aClass307_4;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "[Lclient!se;")
	public static final Class302[] aClass302Array1 = new Class302[2048];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Z")
	public static boolean method5962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)I")
	public static int method5964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = (local12 * (arg0 & 0xFF00) & 0xFF0000 | local12 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - local12;
		return (((arg1 & 0xFF00FF) * local35 & 0xFF00FF00 | (arg1 & 0xFF00) * local35 & 0xFF0000) >>> 8) + local30;
	}
}
