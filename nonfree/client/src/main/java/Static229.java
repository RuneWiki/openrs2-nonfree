import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!tj;")
	public static Class193 aClass193_79;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
	public static int anInt4618;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Lclient!mn;")
	public static Class4_Sub1_Sub4 aClass4_Sub1_Sub4_3;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
	public static int anInt4617 = 0;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public static int anInt4619 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
	public static int method4082(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local26 >> 12) + 40960;
		return local34 * local13 >> 12;
	}
}
