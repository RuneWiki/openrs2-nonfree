import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "J")
	public static long aLong147;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
	public static int anInt6008;

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_73 = new Class208(67, 3);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)Z")
	public static boolean method4856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!vv;)V")
	public static void method4862(@OriginalArg(0) Class11_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static420.anIntArray440[local4]; local7++) {
				if (Static319.aClass11_Sub1ArrayArray3[local4][local7] == arg0) {
					Static598.method773(Static319.aClass11_Sub1ArrayArray3[local4], local7 + 1, Static319.aClass11_Sub1ArrayArray3[local4], local7, Static420.anIntArray440[local4] - local7 - 1);
					local37 = Static420.anIntArray440[local4]--;
					return;
				}
			}
			for (@Pc(49) int local49 = 0; local49 < Static512.anIntArray540[local4]; local49++) {
				if (Static267.aClass11_Sub1ArrayArray2[local4][local49] == arg0) {
					Static598.method773(Static267.aClass11_Sub1ArrayArray2[local4], local49 + 1, Static267.aClass11_Sub1ArrayArray2[local4], local49, Static512.anIntArray540[local4] - local49 - 1);
					local37 = Static512.anIntArray540[local4]--;
					return;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < Static275.anIntArray276[local4]; local91++) {
				if (Static176.aClass11_Sub1ArrayArray1[local4][local91] == arg0) {
					Static598.method773(Static176.aClass11_Sub1ArrayArray1[local4], local91 + 1, Static176.aClass11_Sub1ArrayArray1[local4], local91, Static275.anIntArray276[local4] - local91 - 1);
					local37 = Static275.anIntArray276[local4]--;
					return;
				}
			}
		}
	}
}
