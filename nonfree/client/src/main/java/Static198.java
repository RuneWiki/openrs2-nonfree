import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
	public static int anInt7947;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
	public static int anInt7949;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "[I")
	public static int[] anIntArray749;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	public static int anInt7952 = -1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)I")
	public static int method6176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Z")
	public static boolean method6177(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB[BI)I")
	public static int method6179(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg0; local7++) {
			local5 = Class1_Sub8_Sub32.anIntArray624[(arg1[local7] ^ local5) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZZ)V")
	public static void method6180(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static136.anInt3023--;
			if (Static136.anInt3023 == 0) {
				Static404.anIntArray530 = null;
			}
		}
		if (arg1) {
			Static162.anInt3425--;
			if (Static162.anInt3425 == 0) {
				Static238.anIntArray440 = null;
			}
		}
	}
}
