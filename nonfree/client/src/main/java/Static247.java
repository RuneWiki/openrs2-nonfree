import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "Lclient!pca;")
	public static Class269 aClass269_3;

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_145 = new Class196(104, 8);

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "S")
	public static short aShort50 = 32767;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ICI)I")
	public static int method3507(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(24) char local24 = Character.toLowerCase(arg0);
			local7 = (local24 << 4) + 1;
		}
		return local7;
	}
}
