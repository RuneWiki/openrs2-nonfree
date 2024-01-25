import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
	public static int anInt4350;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	public static int anInt4348 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public static void method3821() {
		Static164.aClass300_1 = new Class300(8);
		Static139.anInt2199 = 0;
		for (@Pc(15) Class4_Sub8 local15 = (Class4_Sub8) Static440.aClass283_5.method6791(); local15 != null; local15 = (Class4_Sub8) Static440.aClass283_5.method6792()) {
			local15.method8679();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)C")
	public static char method3822(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(57) char local57 = Static601.aCharArray10[local7 - 128];
			if (local57 == '\u0000') {
				local57 = '?';
			}
			local7 = local57;
		}
		return (char) local7;
	}
}
