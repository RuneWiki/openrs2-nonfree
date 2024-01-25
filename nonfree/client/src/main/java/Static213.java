import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
	public static int anInt4432 = -1;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString163 = "Loaded config";

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "Lclient!tq;")
	public static final Class4_Sub7 aClass4_Sub7_5 = new Class4_Sub7(new byte[5000]);

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString164 = "";

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
	public static int anInt4435 = 0;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[200];

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static348.aByteArrayArrayArray11[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static348.aByteArrayArrayArray11[arg1][arg3][arg0] & 0x10) == 0) {
			return Static271.method4736(arg1, arg0, arg3) == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BIIIII)Z")
	public static boolean method3695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg2; local15 <= arg1; local15++) {
			for (@Pc(19) int local19 = arg4; local19 <= arg3; local19++) {
				if (arg0 == Static251.anIntArrayArray49[local15][local19] && Static116.anIntArrayArray16[local15][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!vm;II)V")
	public static void method3696(@OriginalArg(1) Class92 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static158.aClass92_6 = arg0;
		Static197.aClass100ArrayArray1 = new Class100[arg1][arg2];
		if (Static235.anIntArray535 != null) {
			Static204.aClass49_4 = Static72.method1362(Static235.anIntArray535[3], Static235.anIntArray535[2], Static235.anIntArray535[4], Static235.anIntArray535[1], Static235.anIntArray535[5], Static235.anIntArray535[0]);
		}
		Static139.aClass100_2 = new Class100();
		Static301.method5110();
	}
}
