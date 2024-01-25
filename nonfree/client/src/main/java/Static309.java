import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!mu", name = "H", descriptor = "Lclient!mh;")
	public static final Class188 aClass188_6 = new Class188("", 12);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIZII)I")
	public static int method4811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class125.anIntArray382[arg0 * 8192 / arg2] >> 1;
		return (arg1 * (65536 - local15) >> 16) + (local15 * arg3 >> 16);
	}
}
