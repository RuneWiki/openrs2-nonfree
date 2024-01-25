import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "F")
	public static float aFloat163;

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
	public static int anInt8485;

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_151 = new Class145(59, 4);

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
	public static int anInt8482 = 0;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "Lclient!de;")
	public static final Class69 aClass69_55 = new Class69(64);

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(BI)V")
	public static void method7297(@OriginalArg(0) byte arg0) {
		if (Static582.aByteArrayArrayArray17 == null) {
			Static582.aByteArrayArrayArray17 = new byte[4][Static456.anInt7428][Static5.anInt112];
		}
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			for (@Pc(19) int local19 = 0; local19 < Static456.anInt7428; local19++) {
				for (@Pc(22) int local22 = 0; local22 < Static5.anInt112; local22++) {
					Static582.aByteArrayArrayArray17[local16][local19][local22] = arg0;
				}
			}
		}
	}
}
