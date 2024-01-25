import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "[I")
	public static final int[] anIntArray100 = new int[8];

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public static int anInt2215 = 0;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_56 = new Class56(30, 9);

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	public static int anInt2217 = 0;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString11 = null;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIB)I")
	public static int method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 * 57 + arg1;
		@Pc(22) int local22 = local16 ^ local16 << 13;
		@Pc(36) int local36 = (local22 * local22 * 15731 + 789221) * local22 + 1376312589 & Integer.MAX_VALUE;
		return local36 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
	public static void method1957(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static487.aHashtable9.put(arg1, arg0);
	}
}
