import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!aka", name = "e", descriptor = "[I")
	public static final int[] anIntArray25 = new int[8];

	@OriginalMember(owner = "client!aka", name = "g", descriptor = "[I")
	public static final int[] anIntArray26 = new int[4096];

	@OriginalMember(owner = "client!aka", name = "h", descriptor = "I")
	public static final int anInt469 = 1406;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(CI)Z")
	public static boolean method572(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(31) char[] local31 = Static268.aCharArray7;
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				@Pc(39) char local39 = local31[local33];
				if (arg0 == local39) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V")
	public static void method574() {
		for (@Pc(12) int local12 = 0; local12 < Static561.anInt9114; local12++) {
			@Pc(18) int local18 = Static131.anIntArray226[local12];
			@Pc(25) Class3_Sub3 local25 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local18);
			if (local25 != null) {
				@Pc(30) Class28_Sub1_Sub1_Sub1_Sub2 local30 = local25.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				Static139.method2540(local30.aClass300_1.anInt8313, local30);
			}
		}
	}
}
