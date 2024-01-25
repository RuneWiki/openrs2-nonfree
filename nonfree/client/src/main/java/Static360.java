import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public static int anInt9309;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
	public static int[] anIntArray785;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	public static int anInt9307 = 0;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
	public static int anInt9308 = 0;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "[I")
	public static final int[] anIntArray784 = new int[8];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method7848(@OriginalArg(0) String arg0) {
		return Static219.method3917(16, arg0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIB)V")
	public static void method7850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = Static159.aClass177_3.method4664(Static514.aClass114_164.method3330(Static315.anInt5993));
		@Pc(21) int local21;
		for (@Pc(16) Class1_Sub50 local16 = (Class1_Sub50) Static475.aClass38_69.method1419(); local16 != null; local16 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
			local21 = Static526.method7501(local16);
			if (local21 > local11) {
				local11 = local21;
			}
		}
		local11 += 8;
		local21 = Static267.anInt5167 * 16 + 21;
		@Pc(52) int local52 = arg0 - local11 / 2;
		if (Static290.anInt6867 < local11 + local52) {
			local52 = Static290.anInt6867 - local11;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(71) int local71 = arg1;
		if (Static90.anInt2326 < arg1 + local21) {
			local71 = Static90.anInt2326 - local21;
		}
		Static504.anInt8565 = local52;
		if (local71 < 0) {
			local71 = 0;
		}
		Static85.anInt2199 = local11;
		Static186.anInt3939 = (Static536.aBoolean650 ? 26 : 22) + Static267.anInt5167 * 16;
		Static25.aBoolean94 = true;
		Static380.anInt6684 = local71;
	}
}
