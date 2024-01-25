import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_114 = new Class119(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
	public static int anInt4897 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIZZ)Lclient!fo;")
	public static Class82 method3828(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(5) Class257 local5 = null;
		if (Static96.aClass219_3 != null) {
			local5 = new Class257(arg0, Static96.aClass219_3, Static280.aClass219Array1[arg0], 1000000);
		}
		Static97.aClass85_Sub1Array1[arg0] = Static374.aClass101_1.method2255(arg0, Static367.aClass257_4, local5);
		if (arg1) {
			Static97.aClass85_Sub1Array1[arg0].method1902();
		}
		return new Class82(Static97.aClass85_Sub1Array1[arg0], arg2, 1);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)C")
	public static char method3830(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(41) char local41 = Static95.aCharArray1[local7 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local7 = local41;
		}
		return (char) local7;
	}
}
