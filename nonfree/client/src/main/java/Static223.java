import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
	public static int anInt4589;

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
	public static int anInt4590;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
	public static int anInt4591;

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "[I")
	public static int[] anIntArray315;

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "Z")
	public static boolean aBoolean386 = false;

	@OriginalMember(owner = "client!hu", name = "A", descriptor = "[I")
	public static final int[] anIntArray316 = new int[8];

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)I")
	public static int method3807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte local18;
		if (arg0 > 20000) {
			Static455.method6666();
			local18 = 4;
		} else if (arg0 > 10000) {
			Static596.method8207();
			local18 = 3;
		} else if (arg0 <= 5000) {
			Static623.method8043();
			local18 = 1;
		} else {
			Static534.method7470();
			local18 = 2;
		}
		if (arg1 != Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329()) {
			Static404.aClass2_Sub13_2.method1383(arg1, Static404.aClass2_Sub13_2.aClass33_Sub24_2);
			Static352.method5455(false, arg1);
		}
		Static209.method3628();
		return local18;
	}
}
