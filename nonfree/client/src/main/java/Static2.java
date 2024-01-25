import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public static int anInt34;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public static int anInt29 = -1;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString1 = "";

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public static int anInt33 = 10;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public static int anInt35 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(DI)V")
	public static void method27(@OriginalArg(0) double arg0) {
		if (arg0 == Static371.aDouble1) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static412.anIntArray472[local11] = local23 > 255 ? 255 : local23;
		}
		Static371.aDouble1 = arg0;
	}
}
