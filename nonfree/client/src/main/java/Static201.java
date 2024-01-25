import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	public static void method2821() {
		Static429.aClass176Array1 = null;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "([BLjava/lang/String;IZ)I")
	public static int method2822(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg1.length();
		for (@Pc(15) int local15 = 0; local15 < local8; local15 += 4) {
			@Pc(22) int local22 = Static540.method7468(arg1.charAt(local15));
			@Pc(41) int local41 = local15 + 1 >= local8 ? -1 : Static540.method7468(arg1.charAt(local15 + 1));
			@Pc(60) int local60 = local8 > local15 + 2 ? Static540.method7468(arg1.charAt(local15 + 2)) : -1;
			@Pc(79) int local79 = local15 + 3 >= local8 ? -1 : Static540.method7468(arg1.charAt(local15 + 3));
			arg0[arg2++] = (byte) (local22 << 2 | local41 >>> 4);
			if (local60 == -1) {
				break;
			}
			arg0[arg2++] = (byte) (local60 >>> 2 | (local41 & 0xF) << 4);
			if (local79 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local60 & 0x3) << 6 | local79);
		}
		return arg2;
	}
}
