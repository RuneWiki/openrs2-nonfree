import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "F")
	public static float aFloat191;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	public static int anInt9059;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "[I")
	public static int[] anIntArray589;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIB)V")
	public static void method7679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg1) {
			Static526.method7369(Static299.anIntArrayArray58[arg2], arg3, arg1, arg0);
		} else {
			Static526.method7369(Static299.anIntArrayArray58[arg2], arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZZ)V")
	public static void method7680(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class3_Sub29 local10 = Static577.method7771(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray353.length; local15++) {
				local10.anIntArray353[local15] = -1;
				local10.anIntArray354[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!v;)Ljava/lang/String;")
	public static String method7685(@OriginalArg(1) Class3_Sub6_Sub20 arg0) {
		return arg0.aString123 + " <col=ffffff>>";
	}
}
