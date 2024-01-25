import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
	public static int anInt7128;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
	public static int anInt7133;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z")
	public static boolean method5695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)I")
	public static int method5696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static369.anIntArray478[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
	public static void method5697() {
		for (@Pc(3) int local3 = 0; local3 < Static368.aClass5ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static368.aClass5ArrayArray1[local3].length; local7++) {
				Static368.aClass5ArrayArray1[local3][local7] = Static9.aClass5_1;
			}
		}
	}
}
