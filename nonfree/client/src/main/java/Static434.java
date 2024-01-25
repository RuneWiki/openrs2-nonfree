import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!qs", name = "z", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!qs", name = "E", descriptor = "I")
	public static int anInt7761;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	public static void method6193() {
		if (Static500.anInt8734 < 0) {
			Static264.anInt4867 = -1;
			Static500.anInt8734 = 0;
			Static100.anInt1767 = -1;
		}
		if (Static500.anInt8734 > Static287.anInt3861) {
			Static264.anInt4867 = -1;
			Static100.anInt1767 = -1;
			Static500.anInt8734 = Static287.anInt3861;
		}
		if (Static249.anInt4547 < 0) {
			Static264.anInt4867 = -1;
			Static249.anInt4547 = 0;
			Static100.anInt1767 = -1;
		}
		if (Static287.anInt3863 < Static249.anInt4547) {
			Static249.anInt4547 = Static287.anInt3863;
			Static100.anInt1767 = -1;
			Static264.anInt4867 = -1;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIZ)I")
	public static int method6195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V")
	public static void method6196() {
		Static406.anInt7247 = 0;
		@Pc(17) int local17 = Static539.anInt9045 + (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 >> 9);
		@Pc(25) int local25 = (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 >> 9) + Static311.anInt5708;
		if (local17 >= 3053 && local17 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static406.anInt7247 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static406.anInt7247 = 1;
		}
		if (Static406.anInt7247 == 1 && local17 >= 3139 && local17 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static406.anInt7247 = 0;
		}
	}
}
