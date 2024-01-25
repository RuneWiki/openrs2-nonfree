import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dl", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[200];

	@OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
	public static final int anInt2749 = 1;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
	public static void method2344() {
		for (@Pc(3) int local3 = 0; local3 < Static59.anInt1906; local3++) {
			@Pc(9) int local9 = Static620.anIntArray609[local3];
			@Pc(16) Class8_Sub50 local16 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local9);
			if (local16 != null) {
				@Pc(21) Class15_Sub1_Sub2_Sub2_Sub2 local21 = local16.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				Static314.method5188(local21, local21.aClass300_1.anInt8912);
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(CI)C")
	public static char method2346(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
