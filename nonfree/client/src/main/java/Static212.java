import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hha", name = "r", descriptor = "Lclient!fha;")
	public static Class109 aClass109_28 = new Class109();

	@OriginalMember(owner = "client!hha", name = "v", descriptor = "I")
	public static final int anInt3532 = 4;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V")
	public static void method2948() {
		if (Static123.anIntArray155 != null && Static111.anIntArray141 != null) {
			return;
		}
		Static111.anIntArray141 = new int[256];
		Static123.anIntArray155 = new int[256];
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(34) double local34 = (double) local25 / 255.0D * 6.283185307179586D;
			Static123.anIntArray155[local25] = (int) (Math.sin(local34) * 4096.0D);
			Static111.anIntArray141[local25] = (int) (Math.cos(local34) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZB)C")
	public static char method2950(@OriginalArg(1) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local14, 16) + " provided");
		}
		if (local14 >= 128 && local14 < 160) {
			@Pc(45) char local45 = Static158.aCharArray2[local14 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local14 = local45;
		}
		return (char) local14;
	}
}
