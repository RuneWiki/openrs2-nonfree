import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static206 {

	@OriginalMember(owner = "client!lp", name = "R", descriptor = "I")
	public static int anInt3828;

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "Lclient!lm;")
	public static final Class144 aClass144_6 = new Class144("", 10);

	@OriginalMember(owner = "client!lp", name = "P", descriptor = "I")
	public static int anInt3826 = -1;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)V")
	public static void method3518() {
		if (Static66.aBoolean430) {
			return;
		}
		Static92.aBoolean149 = true;
		if (Static223.aBoolean308) {
			Static295.aFloat73 = (int) Static295.aFloat73 + 47 & 0xFFFFFFF0;
		} else {
			Static85.aFloat18 += (12.0F - Static85.aFloat18) / 2.0F;
		}
		Static66.aBoolean430 = true;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IIII)I")
	public static int method3519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static244.aByteArrayArrayArray4[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static244.aByteArrayArrayArray4[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIZLclient!fc;III)V")
	public static void method3522(@OriginalArg(1) int arg0, @OriginalArg(3) Class71 arg1, @OriginalArg(6) int arg2) {
		Static142.aBoolean242 = false;
		Static35.anInt745 = 1;
		Static328.anInt5775 = arg2;
		Static238.anInt4359 = 0;
		Static48.anInt940 = 2;
		Static48.aClass71_15 = arg1;
		Static261.anInt4643 = arg0;
	}
}
