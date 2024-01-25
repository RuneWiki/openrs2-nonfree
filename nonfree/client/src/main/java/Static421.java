import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static421 {

	@OriginalMember(owner = "client!pw", name = "zb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28;

	@OriginalMember(owner = "client!pw", name = "Ab", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29;

	@OriginalMember(owner = "client!pw", name = "fb", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_138 = new Class56(10, 7);

	@OriginalMember(owner = "client!pw", name = "ib", descriptor = "I")
	public static int anInt7166 = 0;

	@OriginalMember(owner = "client!pw", name = "qb", descriptor = "Lclient!gq;")
	public static final Class116 aClass116_3 = new Class116(16);

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(III)Z")
	public static boolean method5999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
