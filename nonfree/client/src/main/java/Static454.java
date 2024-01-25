import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!te", name = "M", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_166 = new Class239(4, 8);

	@OriginalMember(owner = "client!te", name = "N", descriptor = "[I")
	public static final int[] anIntArray634 = new int[25];

	@OriginalMember(owner = "client!te", name = "O", descriptor = "Lclient!mh;")
	public static final Class188 aClass188_9 = new Class188("", 15);

	@OriginalMember(owner = "client!te", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString170 = "";

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(FFFI)I")
	public static int method6940(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local12 < local26 && local26 > local35) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local35 > local26) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
