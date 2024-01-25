import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static71 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	public static final int anInt1613 = 4;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!eo;")
	public static Class68 aClass68_1 = null;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
	public static int method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static336.anIntArrayArray50 == null ? 0 : Static336.anIntArrayArray50[arg0][arg1] & 0xFFFFFF;
	}
}
