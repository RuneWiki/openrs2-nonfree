import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "[Lclient!g;")
	public static final Class71[] aClass71Array1 = new Class71[4];

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)I")
	public static int method762(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
	public static void method763(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static254.method4596(arg1.length - 1, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)C")
	public static char method765(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(36) char local36 = Static31.aCharArray2[local7 - 128];
			if (local36 == '\u0000') {
				local36 = '?';
			}
			local7 = local36;
		}
		return (char) local7;
	}
}
