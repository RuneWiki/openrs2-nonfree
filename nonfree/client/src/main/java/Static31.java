import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	public static int anInt506;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "[I")
	public static final int[] anIntArray31 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZ)I")
	public static int method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) byte local19;
		if (arg0 > 20000) {
			local19 = 4;
			Static206.method2965();
		} else if (arg0 > 10000) {
			Static233.method3391();
			local19 = 3;
		} else if (arg0 > 5000) {
			Static356.method5330();
			local19 = 2;
		} else {
			Static601.method8651();
			local19 = 1;
		}
		if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() != arg1) {
			Static637.aClass5_Sub20_31.method3194(arg1, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
			Static565.method8890(arg1, false);
		}
		Static52.method792();
		return local19;
	}
}
